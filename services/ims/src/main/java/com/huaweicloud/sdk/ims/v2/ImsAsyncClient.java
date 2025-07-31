package com.huaweicloud.sdk.ims.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class ImsAsyncClient {

    protected HcClient hcClient;

    public ImsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsAsyncClient> newBuilder() {
        ClientBuilder<ImsAsyncClient> clientBuilder = new ClientBuilder<>(ImsAsyncClient::new);
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
     * @return CompletableFuture<AddImageTagResponse>
     */
    public CompletableFuture<AddImageTagResponse> addImageTagAsync(AddImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.addImageTag);
    }

    /**
     * 添加镜像标签
     *
     * 该接口用于为指定镜像添加或更新指定的单个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddImageTagRequest 请求对象
     * @return AsyncInvoker<AddImageTagRequest, AddImageTagResponse>
     */
    public AsyncInvoker<AddImageTagRequest, AddImageTagResponse> addImageTagAsyncInvoker(AddImageTagRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.addImageTag, hcClient);
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
     * @return CompletableFuture<BatchAddMembersResponse>
     */
    public CompletableFuture<BatchAddMembersResponse> batchAddMembersAsync(BatchAddMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchAddMembers);
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
     * @return AsyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse>
     */
    public AsyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse> batchAddMembersAsyncInvoker(
        BatchAddMembersRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.batchAddMembers, hcClient);
    }

    /**
     * 批量添加删除镜像标签
     *
     * 该接口用于为指定镜像批量添加/更新、删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddOrDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchAddOrDeleteTagsResponse>
     */
    public CompletableFuture<BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsAsync(
        BatchAddOrDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchAddOrDeleteTags);
    }

    /**
     * 批量添加删除镜像标签
     *
     * 该接口用于为指定镜像批量添加/更新、删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddOrDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse>
     */
    public AsyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsAsyncInvoker(
        BatchAddOrDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.batchAddOrDeleteTags, hcClient);
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
     * @return CompletableFuture<BatchDeleteMembersResponse>
     */
    public CompletableFuture<BatchDeleteMembersResponse> batchDeleteMembersAsync(BatchDeleteMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchDeleteMembers);
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
     * @return AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>
     */
    public AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersAsyncInvoker(
        BatchDeleteMembersRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.batchDeleteMembers, hcClient);
    }

    /**
     * 批量删除镜像标签
     *
     * 该接口用于为指定镜像批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchDeleteTags);
    }

    /**
     * 批量删除镜像标签
     *
     * 该接口用于为指定镜像批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.batchDeleteTags, hcClient);
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
     * @return CompletableFuture<BatchUpdateMembersResponse>
     */
    public CompletableFuture<BatchUpdateMembersResponse> batchUpdateMembersAsync(BatchUpdateMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchUpdateMembers);
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
     * @return AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>
     */
    public AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersAsyncInvoker(
        BatchUpdateMembersRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.batchUpdateMembers, hcClient);
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
     * @return CompletableFuture<CopyImageCrossRegionResponse>
     */
    public CompletableFuture<CopyImageCrossRegionResponse> copyImageCrossRegionAsync(
        CopyImageCrossRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
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
     * @return AsyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse>
     */
    public AsyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> copyImageCrossRegionAsyncInvoker(
        CopyImageCrossRegionRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.copyImageCrossRegion, hcClient);
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
     * @return CompletableFuture<CopyImageInRegionResponse>
     */
    public CompletableFuture<CopyImageInRegionResponse> copyImageInRegionAsync(CopyImageInRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageInRegion);
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
     * @return AsyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse>
     */
    public AsyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse> copyImageInRegionAsyncInvoker(
        CopyImageInRegionRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.copyImageInRegion, hcClient);
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
     * @return CompletableFuture<CopyImageInRegionInSafeModeResponse>
     */
    public CompletableFuture<CopyImageInRegionInSafeModeResponse> copyImageInRegionInSafeModeAsync(
        CopyImageInRegionInSafeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageInRegionInSafeMode);
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
     * @return AsyncInvoker<CopyImageInRegionInSafeModeRequest, CopyImageInRegionInSafeModeResponse>
     */
    public AsyncInvoker<CopyImageInRegionInSafeModeRequest, CopyImageInRegionInSafeModeResponse> copyImageInRegionInSafeModeAsyncInvoker(
        CopyImageInRegionInSafeModeRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.copyImageInRegionInSafeMode, hcClient);
    }

    /**
     * 使用外部镜像文件制作数据镜像
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageRequest 请求对象
     * @return CompletableFuture<CreateDataImageResponse>
     */
    public CompletableFuture<CreateDataImageResponse> createDataImageAsync(CreateDataImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createDataImage);
    }

    /**
     * 使用外部镜像文件制作数据镜像
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageRequest 请求对象
     * @return AsyncInvoker<CreateDataImageRequest, CreateDataImageResponse>
     */
    public AsyncInvoker<CreateDataImageRequest, CreateDataImageResponse> createDataImageAsyncInvoker(
        CreateDataImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.createDataImage, hcClient);
    }

    /**
     * 使用外部镜像文件制作数据镜像（新）
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageInSafeModeRequest 请求对象
     * @return CompletableFuture<CreateDataImageInSafeModeResponse>
     */
    public CompletableFuture<CreateDataImageInSafeModeResponse> createDataImageInSafeModeAsync(
        CreateDataImageInSafeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createDataImageInSafeMode);
    }

    /**
     * 使用外部镜像文件制作数据镜像（新）
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageInSafeModeRequest 请求对象
     * @return AsyncInvoker<CreateDataImageInSafeModeRequest, CreateDataImageInSafeModeResponse>
     */
    public AsyncInvoker<CreateDataImageInSafeModeRequest, CreateDataImageInSafeModeResponse> createDataImageInSafeModeAsyncInvoker(
        CreateDataImageInSafeModeRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.createDataImageInSafeMode, hcClient);
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
     * @return CompletableFuture<CreateImageResponse>
     */
    public CompletableFuture<CreateImageResponse> createImageAsync(CreateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createImage);
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
     * @return AsyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public AsyncInvoker<CreateImageRequest, CreateImageResponse> createImageAsyncInvoker(CreateImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.createImage, hcClient);
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
     * @return CompletableFuture<CreateImageInSafeModeResponse>
     */
    public CompletableFuture<CreateImageInSafeModeResponse> createImageInSafeModeAsync(
        CreateImageInSafeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createImageInSafeMode);
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
     * @return AsyncInvoker<CreateImageInSafeModeRequest, CreateImageInSafeModeResponse>
     */
    public AsyncInvoker<CreateImageInSafeModeRequest, CreateImageInSafeModeResponse> createImageInSafeModeAsyncInvoker(
        CreateImageInSafeModeRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.createImageInSafeMode, hcClient);
    }

    /**
     * 增加或修改标签
     *
     * 该接口主要用于为某个镜像增加或修改一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateTagsRequest 请求对象
     * @return CompletableFuture<CreateOrUpdateTagsResponse>
     */
    public CompletableFuture<CreateOrUpdateTagsResponse> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    /**
     * 增加或修改标签
     *
     * 该接口主要用于为某个镜像增加或修改一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateTagsRequest 请求对象
     * @return AsyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse>
     */
    public AsyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> createOrUpdateTagsAsyncInvoker(
        CreateOrUpdateTagsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.createOrUpdateTags, hcClient);
    }

    /**
     * 制作整机镜像
     *
     * 使用云服务器或者云服务器备份制作整机镜像。作为异步接口，调用成功，只是说明后台收到了制作整机镜像的请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWholeImageRequest 请求对象
     * @return CompletableFuture<CreateWholeImageResponse>
     */
    public CompletableFuture<CreateWholeImageResponse> createWholeImageAsync(CreateWholeImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    /**
     * 制作整机镜像
     *
     * 使用云服务器或者云服务器备份制作整机镜像。作为异步接口，调用成功，只是说明后台收到了制作整机镜像的请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWholeImageRequest 请求对象
     * @return AsyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse>
     */
    public AsyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse> createWholeImageAsyncInvoker(
        CreateWholeImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.createWholeImage, hcClient);
    }

    /**
     * 删除镜像标签
     *
     * 该接口用于为镜像删除指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageTagRequest 请求对象
     * @return CompletableFuture<DeleteImageTagResponse>
     */
    public CompletableFuture<DeleteImageTagResponse> deleteImageTagAsync(DeleteImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.deleteImageTag);
    }

    /**
     * 删除镜像标签
     *
     * 该接口用于为镜像删除指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageTagRequest 请求对象
     * @return AsyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse>
     */
    public AsyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse> deleteImageTagAsyncInvoker(
        DeleteImageTagRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.deleteImageTag, hcClient);
    }

    /**
     * 导出镜像
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageRequest 请求对象
     * @return CompletableFuture<ExportImageResponse>
     */
    public CompletableFuture<ExportImageResponse> exportImageAsync(ExportImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.exportImage);
    }

    /**
     * 导出镜像
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageRequest 请求对象
     * @return AsyncInvoker<ExportImageRequest, ExportImageResponse>
     */
    public AsyncInvoker<ExportImageRequest, ExportImageResponse> exportImageAsyncInvoker(ExportImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.exportImage, hcClient);
    }

    /**
     * 导出镜像（新）
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageInSafeModeRequest 请求对象
     * @return CompletableFuture<ExportImageInSafeModeResponse>
     */
    public CompletableFuture<ExportImageInSafeModeResponse> exportImageInSafeModeAsync(
        ExportImageInSafeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.exportImageInSafeMode);
    }

    /**
     * 导出镜像（新）
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageInSafeModeRequest 请求对象
     * @return AsyncInvoker<ExportImageInSafeModeRequest, ExportImageInSafeModeResponse>
     */
    public AsyncInvoker<ExportImageInSafeModeRequest, ExportImageInSafeModeResponse> exportImageInSafeModeAsyncInvoker(
        ExportImageInSafeModeRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.exportImageInSafeMode, hcClient);
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
     * @return CompletableFuture<ImportImageQuickResponse>
     */
    public CompletableFuture<ImportImageQuickResponse> importImageQuickAsync(ImportImageQuickRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.importImageQuick);
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
     * @return AsyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse>
     */
    public AsyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse> importImageQuickAsyncInvoker(
        ImportImageQuickRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.importImageQuick, hcClient);
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
     * @return CompletableFuture<ImportImageQuickInSafeModeResponse>
     */
    public CompletableFuture<ImportImageQuickInSafeModeResponse> importImageQuickInSafeModeAsync(
        ImportImageQuickInSafeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.importImageQuickInSafeMode);
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
     * @return AsyncInvoker<ImportImageQuickInSafeModeRequest, ImportImageQuickInSafeModeResponse>
     */
    public AsyncInvoker<ImportImageQuickInSafeModeRequest, ImportImageQuickInSafeModeResponse> importImageQuickInSafeModeAsyncInvoker(
        ImportImageQuickInSafeModeRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.importImageQuickInSafeMode, hcClient);
    }

    /**
     * 按标签查询镜像
     *
     * 该接口用于按标签或其他条件对镜像进行过滤或者计数使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageByTagsRequest 请求对象
     * @return CompletableFuture<ListImageByTagsResponse>
     */
    public CompletableFuture<ListImageByTagsResponse> listImageByTagsAsync(ListImageByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImageByTags);
    }

    /**
     * 按标签查询镜像
     *
     * 该接口用于按标签或其他条件对镜像进行过滤或者计数使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageByTagsRequest 请求对象
     * @return AsyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse>
     */
    public AsyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse> listImageByTagsAsyncInvoker(
        ListImageByTagsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listImageByTags, hcClient);
    }

    /**
     * 获取镜像成员列表
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageMembersRequest 请求对象
     * @return CompletableFuture<ListImageMembersResponse>
     */
    public CompletableFuture<ListImageMembersResponse> listImageMembersAsync(ListImageMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImageMembers);
    }

    /**
     * 获取镜像成员列表
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageMembersRequest 请求对象
     * @return AsyncInvoker<ListImageMembersRequest, ListImageMembersResponse>
     */
    public AsyncInvoker<ListImageMembersRequest, ListImageMembersResponse> listImageMembersAsyncInvoker(
        ListImageMembersRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listImageMembers, hcClient);
    }

    /**
     * 查询镜像标签
     *
     * 该接口用于为查询指定镜像上的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagsRequest 请求对象
     * @return CompletableFuture<ListImageTagsResponse>
     */
    public CompletableFuture<ListImageTagsResponse> listImageTagsAsync(ListImageTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImageTags);
    }

    /**
     * 查询镜像标签
     *
     * 该接口用于为查询指定镜像上的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagsRequest 请求对象
     * @return AsyncInvoker<ListImageTagsRequest, ListImageTagsResponse>
     */
    public AsyncInvoker<ListImageTagsRequest, ListImageTagsResponse> listImageTagsAsyncInvoker(
        ListImageTagsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listImageTags, hcClient);
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
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImages);
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
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listImages, hcClient);
    }

    /**
     * 查询租户所有镜像标签
     *
     * 该接口用于为查询租户的所有镜像上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesTagsRequest 请求对象
     * @return CompletableFuture<ListImagesTagsResponse>
     */
    public CompletableFuture<ListImagesTagsResponse> listImagesTagsAsync(ListImagesTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImagesTags);
    }

    /**
     * 查询租户所有镜像标签
     *
     * 该接口用于为查询租户的所有镜像上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesTagsRequest 请求对象
     * @return AsyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse>
     */
    public AsyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse> listImagesTagsAsyncInvoker(
        ListImagesTagsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listImagesTags, hcClient);
    }

    /**
     * 查询镜像支持的OS列表
     *
     * 查询当前区域弹性云服务器的OS兼容性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOsVersionsRequest 请求对象
     * @return CompletableFuture<ListOsVersionsResponse>
     */
    public CompletableFuture<ListOsVersionsResponse> listOsVersionsAsync(ListOsVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    /**
     * 查询镜像支持的OS列表
     *
     * 查询当前区域弹性云服务器的OS兼容性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOsVersionsRequest 请求对象
     * @return AsyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse>
     */
    public AsyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse> listOsVersionsAsyncInvoker(
        ListOsVersionsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listOsVersions, hcClient);
    }

    /**
     * 按条件查询租户镜像标签列表
     *
     * 根据不同条件查询镜像标签列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listTags);
    }

    /**
     * 按条件查询租户镜像标签列表
     *
     * 根据不同条件查询镜像标签列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listTags, hcClient);
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
     * @return CompletableFuture<RegisterImageResponse>
     */
    public CompletableFuture<RegisterImageResponse> registerImageAsync(RegisterImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.registerImage);
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
     * @return AsyncInvoker<RegisterImageRequest, RegisterImageResponse>
     */
    public AsyncInvoker<RegisterImageRequest, RegisterImageResponse> registerImageAsyncInvoker(
        RegisterImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.registerImage, hcClient);
    }

    /**
     * 获取镜像成员详情
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageMemberRequest 请求对象
     * @return CompletableFuture<ShowImageMemberResponse>
     */
    public CompletableFuture<ShowImageMemberResponse> showImageMemberAsync(ShowImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showImageMember);
    }

    /**
     * 获取镜像成员详情
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageMemberRequest 请求对象
     * @return AsyncInvoker<ShowImageMemberRequest, ShowImageMemberResponse>
     */
    public AsyncInvoker<ShowImageMemberRequest, ShowImageMemberResponse> showImageMemberAsyncInvoker(
        ShowImageMemberRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.showImageMember, hcClient);
    }

    /**
     * 查询镜像配额
     *
     * 该接口为扩展接口，主要用于查询租户在当前Region的私有镜像的配额数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageQuotaRequest 请求对象
     * @return CompletableFuture<ShowImageQuotaResponse>
     */
    public CompletableFuture<ShowImageQuotaResponse> showImageQuotaAsync(ShowImageQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    /**
     * 查询镜像配额
     *
     * 该接口为扩展接口，主要用于查询租户在当前Region的私有镜像的配额数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageQuotaRequest 请求对象
     * @return AsyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse>
     */
    public AsyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse> showImageQuotaAsyncInvoker(
        ShowImageQuotaRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.showImageQuota, hcClient);
    }

    /**
     * 异步任务查询
     *
     * 该接口为扩展接口，主要用于查询异步接口执行情况，比如查询导出镜像任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showJob);
    }

    /**
     * 异步任务查询
     *
     * 该接口为扩展接口，主要用于查询异步接口执行情况，比如查询导出镜像任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.showJob, hcClient);
    }

    /**
     * 异步任务进度查询
     *
     * 该接口为扩展接口，主要用于查询异步任务进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobProgressRequest 请求对象
     * @return CompletableFuture<ShowJobProgressResponse>
     */
    public CompletableFuture<ShowJobProgressResponse> showJobProgressAsync(ShowJobProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showJobProgress);
    }

    /**
     * 异步任务进度查询
     *
     * 该接口为扩展接口，主要用于查询异步任务进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobProgressRequest 请求对象
     * @return AsyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>
     */
    public AsyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgressAsyncInvoker(
        ShowJobProgressRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.showJobProgress, hcClient);
    }

    /**
     * 更新镜像信息
     *
     * 更新镜像信息接口，主要用于镜像属性的修改。当前仅支持可用（active）状态的镜像更新相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return CompletableFuture<UpdateImageResponse>
     */
    public CompletableFuture<UpdateImageResponse> updateImageAsync(UpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.updateImage);
    }

    /**
     * 更新镜像信息
     *
     * 更新镜像信息接口，主要用于镜像属性的修改。当前仅支持可用（active）状态的镜像更新相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return AsyncInvoker<UpdateImageRequest, UpdateImageResponse>
     */
    public AsyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageAsyncInvoker(UpdateImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.updateImage, hcClient);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return CompletableFuture<ListVersionsResponse>
     */
    public CompletableFuture<ListVersionsResponse> listVersionsAsync(ListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listVersions);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return AsyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.listVersions, hcClient);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse>
     */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showVersion);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.showVersion, hcClient);
    }

    /**
     * 添加镜像成员（OpenStack原生）
     *
     * 用户共享镜像给其他用户时，使用该接口向该镜像成员中添加接受镜像用户的项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceAddImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceAddImageMemberResponse>
     */
    public CompletableFuture<GlanceAddImageMemberResponse> glanceAddImageMemberAsync(
        GlanceAddImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    /**
     * 添加镜像成员（OpenStack原生）
     *
     * 用户共享镜像给其他用户时，使用该接口向该镜像成员中添加接受镜像用户的项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceAddImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse>
     */
    public AsyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> glanceAddImageMemberAsyncInvoker(
        GlanceAddImageMemberRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceAddImageMember, hcClient);
    }

    /**
     * 创建镜像元数据（OpenStack原生）
     *
     * 创建镜像元数据。调用创建镜像元数据接口成功后，只是创建了镜像的元数据，镜像对应的实际镜像文件并不存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateImageMetadataRequest 请求对象
     * @return CompletableFuture<GlanceCreateImageMetadataResponse>
     */
    public CompletableFuture<GlanceCreateImageMetadataResponse> glanceCreateImageMetadataAsync(
        GlanceCreateImageMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    /**
     * 创建镜像元数据（OpenStack原生）
     *
     * 创建镜像元数据。调用创建镜像元数据接口成功后，只是创建了镜像的元数据，镜像对应的实际镜像文件并不存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateImageMetadataRequest 请求对象
     * @return AsyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse>
     */
    public AsyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> glanceCreateImageMetadataAsyncInvoker(
        GlanceCreateImageMetadataRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceCreateImageMetadata, hcClient);
    }

    /**
     * 增加标签（OpenStack原生）
     *
     * 该接口主要用于为某个镜像添加一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateTagRequest 请求对象
     * @return CompletableFuture<GlanceCreateTagResponse>
     */
    public CompletableFuture<GlanceCreateTagResponse> glanceCreateTagAsync(GlanceCreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    /**
     * 增加标签（OpenStack原生）
     *
     * 该接口主要用于为某个镜像添加一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateTagRequest 请求对象
     * @return AsyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse>
     */
    public AsyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse> glanceCreateTagAsyncInvoker(
        GlanceCreateTagRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceCreateTag, hcClient);
    }

    /**
     * 删除镜像（OpenStack原生）
     *
     * 该接口主要用于删除镜像，用户可以通过该接口将自己的私有镜像删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageRequest 请求对象
     * @return CompletableFuture<GlanceDeleteImageResponse>
     */
    public CompletableFuture<GlanceDeleteImageResponse> glanceDeleteImageAsync(GlanceDeleteImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    /**
     * 删除镜像（OpenStack原生）
     *
     * 该接口主要用于删除镜像，用户可以通过该接口将自己的私有镜像删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageRequest 请求对象
     * @return AsyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse>
     */
    public AsyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse> glanceDeleteImageAsyncInvoker(
        GlanceDeleteImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceDeleteImage, hcClient);
    }

    /**
     * 删除指定的镜像成员（OpenStack原生）
     *
     * 该接口用于取消对某个用户的镜像共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceDeleteImageMemberResponse>
     */
    public CompletableFuture<GlanceDeleteImageMemberResponse> glanceDeleteImageMemberAsync(
        GlanceDeleteImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    /**
     * 删除指定的镜像成员（OpenStack原生）
     *
     * 该接口用于取消对某个用户的镜像共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse>
     */
    public AsyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> glanceDeleteImageMemberAsyncInvoker(
        GlanceDeleteImageMemberRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceDeleteImageMember, hcClient);
    }

    /**
     * 删除标签（OpenStack原生）
     *
     * 该接口主要用于删除某个镜像的自定义标签，通过该接口，用户可以将私有镜像中一些不用的标签删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteTagRequest 请求对象
     * @return CompletableFuture<GlanceDeleteTagResponse>
     */
    public CompletableFuture<GlanceDeleteTagResponse> glanceDeleteTagAsync(GlanceDeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    /**
     * 删除标签（OpenStack原生）
     *
     * 该接口主要用于删除某个镜像的自定义标签，通过该接口，用户可以将私有镜像中一些不用的标签删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteTagRequest 请求对象
     * @return AsyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse>
     */
    public AsyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse> glanceDeleteTagAsyncInvoker(
        GlanceDeleteTagRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceDeleteTag, hcClient);
    }

    /**
     * 查询镜像成员列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员列表视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMemberSchemasRequest 请求对象
     * @return CompletableFuture<GlanceListImageMemberSchemasResponse>
     */
    public CompletableFuture<GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasAsync(
        GlanceListImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    /**
     * 查询镜像成员列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员列表视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMemberSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse>
     */
    public AsyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasAsyncInvoker(
        GlanceListImageMemberSchemasRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceListImageMemberSchemas, hcClient);
    }

    /**
     * 获取镜像成员列表（OpenStack原生）
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMembersRequest 请求对象
     * @return CompletableFuture<GlanceListImageMembersResponse>
     */
    public CompletableFuture<GlanceListImageMembersResponse> glanceListImageMembersAsync(
        GlanceListImageMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    /**
     * 获取镜像成员列表（OpenStack原生）
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMembersRequest 请求对象
     * @return AsyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse>
     */
    public AsyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse> glanceListImageMembersAsyncInvoker(
        GlanceListImageMembersRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceListImageMembers, hcClient);
    }

    /**
     * 查询镜像列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像列表视图，通过该接口用户可以了解到镜像列表的详细情况和数据结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageSchemasRequest 请求对象
     * @return CompletableFuture<GlanceListImageSchemasResponse>
     */
    public CompletableFuture<GlanceListImageSchemasResponse> glanceListImageSchemasAsync(
        GlanceListImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    /**
     * 查询镜像列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像列表视图，通过该接口用户可以了解到镜像列表的详细情况和数据结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse>
     */
    public AsyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> glanceListImageSchemasAsyncInvoker(
        GlanceListImageSchemasRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceListImageSchemas, hcClient);
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
     * @return CompletableFuture<GlanceListImagesResponse>
     */
    public CompletableFuture<GlanceListImagesResponse> glanceListImagesAsync(GlanceListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImages);
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
     * @return AsyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse>
     */
    public AsyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse> glanceListImagesAsyncInvoker(
        GlanceListImagesRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceListImages, hcClient);
    }

    /**
     * 查询镜像详情（OpenStack原生）
     *
     * 查询单个镜像详情，用户可以通过该接口查询单个私有或者公共镜像的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageRequest 请求对象
     * @return CompletableFuture<GlanceShowImageResponse>
     */
    public CompletableFuture<GlanceShowImageResponse> glanceShowImageAsync(GlanceShowImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    /**
     * 查询镜像详情（OpenStack原生）
     *
     * 查询单个镜像详情，用户可以通过该接口查询单个私有或者公共镜像的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse>
     */
    public AsyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse> glanceShowImageAsyncInvoker(
        GlanceShowImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceShowImage, hcClient);
    }

    /**
     * 获取镜像成员详情（OpenStack原生）
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceShowImageMemberResponse>
     */
    public CompletableFuture<GlanceShowImageMemberResponse> glanceShowImageMemberAsync(
        GlanceShowImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    /**
     * 获取镜像成员详情（OpenStack原生）
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse>
     */
    public AsyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> glanceShowImageMemberAsyncInvoker(
        GlanceShowImageMemberRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceShowImageMember, hcClient);
    }

    /**
     * 查询镜像成员视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberSchemasRequest 请求对象
     * @return CompletableFuture<GlanceShowImageMemberSchemasResponse>
     */
    public CompletableFuture<GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasAsync(
        GlanceShowImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    /**
     * 查询镜像成员视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse>
     */
    public AsyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasAsyncInvoker(
        GlanceShowImageMemberSchemasRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceShowImageMemberSchemas, hcClient);
    }

    /**
     * 查询镜像视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像视图，通过视图，用户可以了解到镜像包含哪些属性，同时也可以了解每个属性的数据类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageSchemasRequest 请求对象
     * @return CompletableFuture<GlanceShowImageSchemasResponse>
     */
    public CompletableFuture<GlanceShowImageSchemasResponse> glanceShowImageSchemasAsync(
        GlanceShowImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    /**
     * 查询镜像视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像视图，通过视图，用户可以了解到镜像包含哪些属性，同时也可以了解每个属性的数据类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse>
     */
    public AsyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> glanceShowImageSchemasAsyncInvoker(
        GlanceShowImageSchemasRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceShowImageSchemas, hcClient);
    }

    /**
     * 更新镜像信息（OpenStack原生）
     *
     * 修改镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageRequest 请求对象
     * @return CompletableFuture<GlanceUpdateImageResponse>
     */
    public CompletableFuture<GlanceUpdateImageResponse> glanceUpdateImageAsync(GlanceUpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    /**
     * 更新镜像信息（OpenStack原生）
     *
     * 修改镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageRequest 请求对象
     * @return AsyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse>
     */
    public AsyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse> glanceUpdateImageAsyncInvoker(
        GlanceUpdateImageRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceUpdateImage, hcClient);
    }

    /**
     * 更新镜像成员状态（OpenStack原生）
     *
     * 用户接受或者拒绝共享镜像时，使用该接口更新镜像成员的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceUpdateImageMemberResponse>
     */
    public CompletableFuture<GlanceUpdateImageMemberResponse> glanceUpdateImageMemberAsync(
        GlanceUpdateImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

    /**
     * 更新镜像成员状态（OpenStack原生）
     *
     * 用户接受或者拒绝共享镜像时，使用该接口更新镜像成员的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse>
     */
    public AsyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> glanceUpdateImageMemberAsyncInvoker(
        GlanceUpdateImageMemberRequest request) {
        return new AsyncInvoker<>(request, ImsMeta.glanceUpdateImageMember, hcClient);
    }

}

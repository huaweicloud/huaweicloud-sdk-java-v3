package com.huaweicloud.sdk.ims.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ims.v2.model.*;

public class ImsAsyncClient {
    protected HcClient hcClient;

    public ImsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsAsyncClient> newBuilder() {
        return new ClientBuilder<>(ImsAsyncClient::new);
    }


    /**
     * 添加镜像标签
     * 该接口用于为指定镜像添加或更新指定的单个标签
     *
     * @param AddImageTagRequest 请求对象
     * @return CompletableFuture<AddImageTagResponse>
     */
    public CompletableFuture<AddImageTagResponse> addImageTagAsync(AddImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.addImageTag);
    }

    /**
     * 添加镜像标签
     * 该接口用于为指定镜像添加或更新指定的单个标签
     *
     * @param AddImageTagRequest 请求对象
     * @return AsyncInvoker<AddImageTagRequest, AddImageTagResponse>
     */
    public AsyncInvoker<AddImageTagRequest, AddImageTagResponse> addImageTagAsyncInvoker(AddImageTagRequest request) {
        return new AsyncInvoker<AddImageTagRequest, AddImageTagResponse>(request, ImsMeta.addImageTag, hcClient);
    }

    /**
     * 批量添加镜像成员
     * 该接口为扩展接口，主要用于镜像共享时用户将多个镜像共享给多个用户。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchAddMembersRequest 请求对象
     * @return CompletableFuture<BatchAddMembersResponse>
     */
    public CompletableFuture<BatchAddMembersResponse> batchAddMembersAsync(BatchAddMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchAddMembers);
    }

    /**
     * 批量添加镜像成员
     * 该接口为扩展接口，主要用于镜像共享时用户将多个镜像共享给多个用户。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchAddMembersRequest 请求对象
     * @return AsyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse>
     */
    public AsyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse> batchAddMembersAsyncInvoker(BatchAddMembersRequest request) {
        return new AsyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse>(request, ImsMeta.batchAddMembers, hcClient);
    }

    /**
     * 批量添加删除镜像标签
     * 该接口用于为指定镜像批量添加/更新、删除标签。
     *
     * @param BatchAddOrDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchAddOrDeleteTagsResponse>
     */
    public CompletableFuture<BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsAsync(BatchAddOrDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchAddOrDeleteTags);
    }

    /**
     * 批量添加删除镜像标签
     * 该接口用于为指定镜像批量添加/更新、删除标签。
     *
     * @param BatchAddOrDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse>
     */
    public AsyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsAsyncInvoker(BatchAddOrDeleteTagsRequest request) {
        return new AsyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse>(request, ImsMeta.batchAddOrDeleteTags, hcClient);
    }

    /**
     * 批量删除镜像成员
     * 该接口为扩展接口，主要用于取消镜像共享。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchDeleteMembersRequest 请求对象
     * @return CompletableFuture<BatchDeleteMembersResponse>
     */
    public CompletableFuture<BatchDeleteMembersResponse> batchDeleteMembersAsync(BatchDeleteMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchDeleteMembers);
    }

    /**
     * 批量删除镜像成员
     * 该接口为扩展接口，主要用于取消镜像共享。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchDeleteMembersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>
     */
    public AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersAsyncInvoker(BatchDeleteMembersRequest request) {
        return new AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>(request, ImsMeta.batchDeleteMembers, hcClient);
    }

    /**
     * 批量更新镜像成员状态
     * 该接口为扩展接口，主要用于用户接受或者拒绝多个共享镜像时批量更新镜像成员的状态。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchUpdateMembersRequest 请求对象
     * @return CompletableFuture<BatchUpdateMembersResponse>
     */
    public CompletableFuture<BatchUpdateMembersResponse> batchUpdateMembersAsync(BatchUpdateMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchUpdateMembers);
    }

    /**
     * 批量更新镜像成员状态
     * 该接口为扩展接口，主要用于用户接受或者拒绝多个共享镜像时批量更新镜像成员的状态。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchUpdateMembersRequest 请求对象
     * @return AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>
     */
    public AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersAsyncInvoker(BatchUpdateMembersRequest request) {
        return new AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>(request, ImsMeta.batchUpdateMembers, hcClient);
    }

    /**
     * 跨Region复制镜像
     * 该接口为扩展接口，用户在一个区域制作的私有镜像，可以通过跨Region复制镜像将镜像复制到其他区域，在其他区域发放相同类型的云服务器，帮助用户实现区域间的业务迁移。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。 如何查询异步任务，请参见异步任务进度查询。
     *
     * @param CopyImageCrossRegionRequest 请求对象
     * @return CompletableFuture<CopyImageCrossRegionResponse>
     */
    public CompletableFuture<CopyImageCrossRegionResponse> copyImageCrossRegionAsync(CopyImageCrossRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
    }

    /**
     * 跨Region复制镜像
     * 该接口为扩展接口，用户在一个区域制作的私有镜像，可以通过跨Region复制镜像将镜像复制到其他区域，在其他区域发放相同类型的云服务器，帮助用户实现区域间的业务迁移。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。 如何查询异步任务，请参见异步任务进度查询。
     *
     * @param CopyImageCrossRegionRequest 请求对象
     * @return AsyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse>
     */
    public AsyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> copyImageCrossRegionAsyncInvoker(CopyImageCrossRegionRequest request) {
        return new AsyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse>(request, ImsMeta.copyImageCrossRegion, hcClient);
    }

    /**
     * Region内复制镜像
     * 该接口为扩展接口，主要用于用户将一个已有镜像复制为另一个镜像。复制镜像时，可以更改镜像的加密等属性，以满足不同的场景。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param CopyImageInRegionRequest 请求对象
     * @return CompletableFuture<CopyImageInRegionResponse>
     */
    public CompletableFuture<CopyImageInRegionResponse> copyImageInRegionAsync(CopyImageInRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageInRegion);
    }

    /**
     * Region内复制镜像
     * 该接口为扩展接口，主要用于用户将一个已有镜像复制为另一个镜像。复制镜像时，可以更改镜像的加密等属性，以满足不同的场景。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param CopyImageInRegionRequest 请求对象
     * @return AsyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse>
     */
    public AsyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse> copyImageInRegionAsyncInvoker(CopyImageInRegionRequest request) {
        return new AsyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse>(request, ImsMeta.copyImageInRegion, hcClient);
    }

    /**
     * 使用外部镜像文件制作数据镜像
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     *
     * @param CreateDataImageRequest 请求对象
     * @return CompletableFuture<CreateDataImageResponse>
     */
    public CompletableFuture<CreateDataImageResponse> createDataImageAsync(CreateDataImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createDataImage);
    }

    /**
     * 使用外部镜像文件制作数据镜像
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     *
     * @param CreateDataImageRequest 请求对象
     * @return AsyncInvoker<CreateDataImageRequest, CreateDataImageResponse>
     */
    public AsyncInvoker<CreateDataImageRequest, CreateDataImageResponse> createDataImageAsyncInvoker(CreateDataImageRequest request) {
        return new AsyncInvoker<CreateDataImageRequest, CreateDataImageResponse>(request, ImsMeta.createDataImage, hcClient);
    }

    /**
     * 制作镜像
     * 本接口用于制作私有镜像，支持： 使用云服务器制作私有镜像。 使用上传至OBS桶中的外部镜像文件制作私有镜像。 使用数据卷制作系统盘镜像。 作为异步接口，调用成功，只是说明云平台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param CreateImageRequest 请求对象
     * @return CompletableFuture<CreateImageResponse>
     */
    public CompletableFuture<CreateImageResponse> createImageAsync(CreateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createImage);
    }

    /**
     * 制作镜像
     * 本接口用于制作私有镜像，支持： 使用云服务器制作私有镜像。 使用上传至OBS桶中的外部镜像文件制作私有镜像。 使用数据卷制作系统盘镜像。 作为异步接口，调用成功，只是说明云平台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param CreateImageRequest 请求对象
     * @return AsyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public AsyncInvoker<CreateImageRequest, CreateImageResponse> createImageAsyncInvoker(CreateImageRequest request) {
        return new AsyncInvoker<CreateImageRequest, CreateImageResponse>(request, ImsMeta.createImage, hcClient);
    }

    /**
     * 增加或修改标签
     * 该接口主要用于为某个镜像增加或修改一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     *
     * @param CreateOrUpdateTagsRequest 请求对象
     * @return CompletableFuture<CreateOrUpdateTagsResponse>
     */
    public CompletableFuture<CreateOrUpdateTagsResponse> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    /**
     * 增加或修改标签
     * 该接口主要用于为某个镜像增加或修改一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     *
     * @param CreateOrUpdateTagsRequest 请求对象
     * @return AsyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse>
     */
    public AsyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> createOrUpdateTagsAsyncInvoker(CreateOrUpdateTagsRequest request) {
        return new AsyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse>(request, ImsMeta.createOrUpdateTags, hcClient);
    }

    /**
     * 制作整机镜像
     * 使用云服务器或者云服务器备份制作整机镜像。作为异步接口，调用成功，只是说明后台收到了制作整机镜像的请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param CreateWholeImageRequest 请求对象
     * @return CompletableFuture<CreateWholeImageResponse>
     */
    public CompletableFuture<CreateWholeImageResponse> createWholeImageAsync(CreateWholeImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    /**
     * 制作整机镜像
     * 使用云服务器或者云服务器备份制作整机镜像。作为异步接口，调用成功，只是说明后台收到了制作整机镜像的请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param CreateWholeImageRequest 请求对象
     * @return AsyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse>
     */
    public AsyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse> createWholeImageAsyncInvoker(CreateWholeImageRequest request) {
        return new AsyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse>(request, ImsMeta.createWholeImage, hcClient);
    }

    /**
     * 删除镜像标签
     * 该接口用于为镜像删除指定的标签
     *
     * @param DeleteImageTagRequest 请求对象
     * @return CompletableFuture<DeleteImageTagResponse>
     */
    public CompletableFuture<DeleteImageTagResponse> deleteImageTagAsync(DeleteImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.deleteImageTag);
    }

    /**
     * 删除镜像标签
     * 该接口用于为镜像删除指定的标签
     *
     * @param DeleteImageTagRequest 请求对象
     * @return AsyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse>
     */
    public AsyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse> deleteImageTagAsyncInvoker(DeleteImageTagRequest request) {
        return new AsyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse>(request, ImsMeta.deleteImageTag, hcClient);
    }

    /**
     * 导出镜像
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     *
     * @param ExportImageRequest 请求对象
     * @return CompletableFuture<ExportImageResponse>
     */
    public CompletableFuture<ExportImageResponse> exportImageAsync(ExportImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.exportImage);
    }

    /**
     * 导出镜像
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     *
     * @param ExportImageRequest 请求对象
     * @return AsyncInvoker<ExportImageRequest, ExportImageResponse>
     */
    public AsyncInvoker<ExportImageRequest, ExportImageResponse> exportImageAsyncInvoker(ExportImageRequest request) {
        return new AsyncInvoker<ExportImageRequest, ExportImageResponse>(request, ImsMeta.exportImage, hcClient);
    }

    /**
     * 镜像文件快速导入
     * 使用上传至OBS桶中的超大外部镜像文件制作私有镜像，目前仅支持RAW或ZVHD2格式镜像文件。且要求镜像文件大小不能超过1TB。 由于快速导入功能要求提前转换镜像文件格式为RAW或ZVHD2格式，因此镜像文件小于128GB时推荐您优先使用常规的创建私有镜像的方式。 作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param ImportImageQuickRequest 请求对象
     * @return CompletableFuture<ImportImageQuickResponse>
     */
    public CompletableFuture<ImportImageQuickResponse> importImageQuickAsync(ImportImageQuickRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.importImageQuick);
    }

    /**
     * 镜像文件快速导入
     * 使用上传至OBS桶中的超大外部镜像文件制作私有镜像，目前仅支持RAW或ZVHD2格式镜像文件。且要求镜像文件大小不能超过1TB。 由于快速导入功能要求提前转换镜像文件格式为RAW或ZVHD2格式，因此镜像文件小于128GB时推荐您优先使用常规的创建私有镜像的方式。 作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param ImportImageQuickRequest 请求对象
     * @return AsyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse>
     */
    public AsyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse> importImageQuickAsyncInvoker(ImportImageQuickRequest request) {
        return new AsyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse>(request, ImsMeta.importImageQuick, hcClient);
    }

    /**
     * 按标签查询镜像
     * 该接口用于按标签或其他条件对镜像进行过滤或者计数使用。
     *
     * @param ListImageByTagsRequest 请求对象
     * @return CompletableFuture<ListImageByTagsResponse>
     */
    public CompletableFuture<ListImageByTagsResponse> listImageByTagsAsync(ListImageByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImageByTags);
    }

    /**
     * 按标签查询镜像
     * 该接口用于按标签或其他条件对镜像进行过滤或者计数使用。
     *
     * @param ListImageByTagsRequest 请求对象
     * @return AsyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse>
     */
    public AsyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse> listImageByTagsAsyncInvoker(ListImageByTagsRequest request) {
        return new AsyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse>(request, ImsMeta.listImageByTags, hcClient);
    }

    /**
     * 查询镜像标签
     * 该接口用于为查询指定镜像上的所有标签
     *
     * @param ListImageTagsRequest 请求对象
     * @return CompletableFuture<ListImageTagsResponse>
     */
    public CompletableFuture<ListImageTagsResponse> listImageTagsAsync(ListImageTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImageTags);
    }

    /**
     * 查询镜像标签
     * 该接口用于为查询指定镜像上的所有标签
     *
     * @param ListImageTagsRequest 请求对象
     * @return AsyncInvoker<ListImageTagsRequest, ListImageTagsResponse>
     */
    public AsyncInvoker<ListImageTagsRequest, ListImageTagsResponse> listImageTagsAsyncInvoker(ListImageTagsRequest request) {
        return new AsyncInvoker<ListImageTagsRequest, ListImageTagsResponse>(request, ImsMeta.listImageTags, hcClient);
    }

    /**
     * 查询镜像列表
     * 根据不同条件查询镜像列表信息。 可以在URI后面用‘?’和‘&amp;’添加不同的查询条件组合，请参考请求样例。
     *
     * @param ListImagesRequest 请求对象
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImages);
    }

    /**
     * 查询镜像列表
     * 根据不同条件查询镜像列表信息。 可以在URI后面用‘?’和‘&amp;’添加不同的查询条件组合，请参考请求样例。
     *
     * @param ListImagesRequest 请求对象
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<ListImagesRequest, ListImagesResponse>(request, ImsMeta.listImages, hcClient);
    }

    /**
     * 查询租户所有镜像标签
     * 该接口用于为查询租户的所有镜像上的标签。
     *
     * @param ListImagesTagsRequest 请求对象
     * @return CompletableFuture<ListImagesTagsResponse>
     */
    public CompletableFuture<ListImagesTagsResponse> listImagesTagsAsync(ListImagesTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImagesTags);
    }

    /**
     * 查询租户所有镜像标签
     * 该接口用于为查询租户的所有镜像上的标签。
     *
     * @param ListImagesTagsRequest 请求对象
     * @return AsyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse>
     */
    public AsyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse> listImagesTagsAsyncInvoker(ListImagesTagsRequest request) {
        return new AsyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse>(request, ImsMeta.listImagesTags, hcClient);
    }

    /**
     * 查询镜像支持的OS列表
     * 查询当前区域弹性云服务器的OS兼容性列表。
     *
     * @param ListOsVersionsRequest 请求对象
     * @return CompletableFuture<ListOsVersionsResponse>
     */
    public CompletableFuture<ListOsVersionsResponse> listOsVersionsAsync(ListOsVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    /**
     * 查询镜像支持的OS列表
     * 查询当前区域弹性云服务器的OS兼容性列表。
     *
     * @param ListOsVersionsRequest 请求对象
     * @return AsyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse>
     */
    public AsyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse> listOsVersionsAsyncInvoker(ListOsVersionsRequest request) {
        return new AsyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse>(request, ImsMeta.listOsVersions, hcClient);
    }

    /**
     * 按条件查询租户镜像标签列表
     * 根据不同条件查询镜像标签列表信息。
     *
     * @param ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listTags);
    }

    /**
     * 按条件查询租户镜像标签列表
     * 根据不同条件查询镜像标签列表信息。
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, ImsMeta.listTags, hcClient);
    }

    /**
     * 注册镜像
     * 该接口用于将镜像文件注册为云平台未初始化的私有镜像。 使用该接口注册镜像的具体步骤如下： 将镜像文件上传到OBS个人桶中。具体操作请参见《对象存储服务客户端指南（OBS Browser）》或《对象存储服务API参考》。 使用创建镜像元数据接口创建镜像元数据。调用成功后，保存该镜像的ID。创建镜像元数据请参考创建镜像元数据（OpenStack原生）。 根据2得到的镜像ID，使用注册镜像接口注册OBS桶中的镜像文件。 注册镜像接口作为异步接口，调用成功后，说明后台收到了注册请求。需要根据镜像ID查询该镜像状态验证镜像注册是否成功。当镜像状态变为“active”时，表示镜像注册成功。 如何查询异步任务，请参见异步任务查询。
     *
     * @param RegisterImageRequest 请求对象
     * @return CompletableFuture<RegisterImageResponse>
     */
    public CompletableFuture<RegisterImageResponse> registerImageAsync(RegisterImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.registerImage);
    }

    /**
     * 注册镜像
     * 该接口用于将镜像文件注册为云平台未初始化的私有镜像。 使用该接口注册镜像的具体步骤如下： 将镜像文件上传到OBS个人桶中。具体操作请参见《对象存储服务客户端指南（OBS Browser）》或《对象存储服务API参考》。 使用创建镜像元数据接口创建镜像元数据。调用成功后，保存该镜像的ID。创建镜像元数据请参考创建镜像元数据（OpenStack原生）。 根据2得到的镜像ID，使用注册镜像接口注册OBS桶中的镜像文件。 注册镜像接口作为异步接口，调用成功后，说明后台收到了注册请求。需要根据镜像ID查询该镜像状态验证镜像注册是否成功。当镜像状态变为“active”时，表示镜像注册成功。 如何查询异步任务，请参见异步任务查询。
     *
     * @param RegisterImageRequest 请求对象
     * @return AsyncInvoker<RegisterImageRequest, RegisterImageResponse>
     */
    public AsyncInvoker<RegisterImageRequest, RegisterImageResponse> registerImageAsyncInvoker(RegisterImageRequest request) {
        return new AsyncInvoker<RegisterImageRequest, RegisterImageResponse>(request, ImsMeta.registerImage, hcClient);
    }

    /**
     * 查询镜像配额
     * 该接口为扩展接口，主要用于查询租户在当前Region的私有镜像的配额数量。
     *
     * @param ShowImageQuotaRequest 请求对象
     * @return CompletableFuture<ShowImageQuotaResponse>
     */
    public CompletableFuture<ShowImageQuotaResponse> showImageQuotaAsync(ShowImageQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    /**
     * 查询镜像配额
     * 该接口为扩展接口，主要用于查询租户在当前Region的私有镜像的配额数量。
     *
     * @param ShowImageQuotaRequest 请求对象
     * @return AsyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse>
     */
    public AsyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse> showImageQuotaAsyncInvoker(ShowImageQuotaRequest request) {
        return new AsyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse>(request, ImsMeta.showImageQuota, hcClient);
    }

    /**
     * 更新镜像信息
     * 更新镜像信息接口，主要用于镜像属性的修改。当前仅支持可用（active）状态的镜像更新相关信息。
     *
     * @param UpdateImageRequest 请求对象
     * @return CompletableFuture<UpdateImageResponse>
     */
    public CompletableFuture<UpdateImageResponse> updateImageAsync(UpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.updateImage);
    }

    /**
     * 更新镜像信息
     * 更新镜像信息接口，主要用于镜像属性的修改。当前仅支持可用（active）状态的镜像更新相关信息。
     *
     * @param UpdateImageRequest 请求对象
     * @return AsyncInvoker<UpdateImageRequest, UpdateImageResponse>
     */
    public AsyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageAsyncInvoker(UpdateImageRequest request) {
        return new AsyncInvoker<UpdateImageRequest, UpdateImageResponse>(request, ImsMeta.updateImage, hcClient);
    }

    /**
     * 查询job状态
     * 该接口为扩展接口，主要用于查询异步接口执行情况，比如查询导出镜像任务的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showJob);
    }

    /**
     * 查询job状态
     * 该接口为扩展接口，主要用于查询异步接口执行情况，比如查询导出镜像任务的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, ImsMeta.showJob, hcClient);
    }

    /**
     * 添加镜像成员（OpenStack原生）
     * 用户共享镜像给其他用户时，使用该接口向该镜像成员中添加接受镜像用户的项目ID。
     *
     * @param GlanceAddImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceAddImageMemberResponse>
     */
    public CompletableFuture<GlanceAddImageMemberResponse> glanceAddImageMemberAsync(GlanceAddImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    /**
     * 添加镜像成员（OpenStack原生）
     * 用户共享镜像给其他用户时，使用该接口向该镜像成员中添加接受镜像用户的项目ID。
     *
     * @param GlanceAddImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse>
     */
    public AsyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> glanceAddImageMemberAsyncInvoker(GlanceAddImageMemberRequest request) {
        return new AsyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse>(request, ImsMeta.glanceAddImageMember, hcClient);
    }

    /**
     * 创建镜像元数据（OpenStack原生）
     * 创建镜像元数据。调用创建镜像元数据接口成功后，只是创建了镜像的元数据，镜像对应的实际镜像文件并不存在
     *
     * @param GlanceCreateImageMetadataRequest 请求对象
     * @return CompletableFuture<GlanceCreateImageMetadataResponse>
     */
    public CompletableFuture<GlanceCreateImageMetadataResponse> glanceCreateImageMetadataAsync(GlanceCreateImageMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    /**
     * 创建镜像元数据（OpenStack原生）
     * 创建镜像元数据。调用创建镜像元数据接口成功后，只是创建了镜像的元数据，镜像对应的实际镜像文件并不存在
     *
     * @param GlanceCreateImageMetadataRequest 请求对象
     * @return AsyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse>
     */
    public AsyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> glanceCreateImageMetadataAsyncInvoker(GlanceCreateImageMetadataRequest request) {
        return new AsyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse>(request, ImsMeta.glanceCreateImageMetadata, hcClient);
    }

    /**
     * 增加标签（OpenStack原生）
     * 该接口主要用于为某个镜像添加一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     *
     * @param GlanceCreateTagRequest 请求对象
     * @return CompletableFuture<GlanceCreateTagResponse>
     */
    public CompletableFuture<GlanceCreateTagResponse> glanceCreateTagAsync(GlanceCreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    /**
     * 增加标签（OpenStack原生）
     * 该接口主要用于为某个镜像添加一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     *
     * @param GlanceCreateTagRequest 请求对象
     * @return AsyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse>
     */
    public AsyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse> glanceCreateTagAsyncInvoker(GlanceCreateTagRequest request) {
        return new AsyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse>(request, ImsMeta.glanceCreateTag, hcClient);
    }

    /**
     * 删除镜像（OpenStack原生）
     * 该接口主要用于删除镜像，用户可以通过该接口将自己的私有镜像删除。
     *
     * @param GlanceDeleteImageRequest 请求对象
     * @return CompletableFuture<GlanceDeleteImageResponse>
     */
    public CompletableFuture<GlanceDeleteImageResponse> glanceDeleteImageAsync(GlanceDeleteImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    /**
     * 删除镜像（OpenStack原生）
     * 该接口主要用于删除镜像，用户可以通过该接口将自己的私有镜像删除。
     *
     * @param GlanceDeleteImageRequest 请求对象
     * @return AsyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse>
     */
    public AsyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse> glanceDeleteImageAsyncInvoker(GlanceDeleteImageRequest request) {
        return new AsyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse>(request, ImsMeta.glanceDeleteImage, hcClient);
    }

    /**
     * 删除指定的镜像成员（OpenStack原生）
     * 该接口用于取消对某个用户的镜像共享。
     *
     * @param GlanceDeleteImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceDeleteImageMemberResponse>
     */
    public CompletableFuture<GlanceDeleteImageMemberResponse> glanceDeleteImageMemberAsync(GlanceDeleteImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    /**
     * 删除指定的镜像成员（OpenStack原生）
     * 该接口用于取消对某个用户的镜像共享。
     *
     * @param GlanceDeleteImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse>
     */
    public AsyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> glanceDeleteImageMemberAsyncInvoker(GlanceDeleteImageMemberRequest request) {
        return new AsyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse>(request, ImsMeta.glanceDeleteImageMember, hcClient);
    }

    /**
     * 删除标签（OpenStack原生）
     * 该接口主要用于删除某个镜像的自定义标签，通过该接口，用户可以将私有镜像中一些不用的标签删除。
     *
     * @param GlanceDeleteTagRequest 请求对象
     * @return CompletableFuture<GlanceDeleteTagResponse>
     */
    public CompletableFuture<GlanceDeleteTagResponse> glanceDeleteTagAsync(GlanceDeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    /**
     * 删除标签（OpenStack原生）
     * 该接口主要用于删除某个镜像的自定义标签，通过该接口，用户可以将私有镜像中一些不用的标签删除。
     *
     * @param GlanceDeleteTagRequest 请求对象
     * @return AsyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse>
     */
    public AsyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse> glanceDeleteTagAsyncInvoker(GlanceDeleteTagRequest request) {
        return new AsyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse>(request, ImsMeta.glanceDeleteTag, hcClient);
    }

    /**
     * 查询镜像成员列表视图（OpenStack原生）
     * 该接口主要用于查询镜像成员列表视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     *
     * @param GlanceListImageMemberSchemasRequest 请求对象
     * @return CompletableFuture<GlanceListImageMemberSchemasResponse>
     */
    public CompletableFuture<GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasAsync(GlanceListImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    /**
     * 查询镜像成员列表视图（OpenStack原生）
     * 该接口主要用于查询镜像成员列表视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     *
     * @param GlanceListImageMemberSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse>
     */
    public AsyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasAsyncInvoker(GlanceListImageMemberSchemasRequest request) {
        return new AsyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse>(request, ImsMeta.glanceListImageMemberSchemas, hcClient);
    }

    /**
     * 获取镜像成员列表（OpenStack原生）
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     *
     * @param GlanceListImageMembersRequest 请求对象
     * @return CompletableFuture<GlanceListImageMembersResponse>
     */
    public CompletableFuture<GlanceListImageMembersResponse> glanceListImageMembersAsync(GlanceListImageMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    /**
     * 获取镜像成员列表（OpenStack原生）
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     *
     * @param GlanceListImageMembersRequest 请求对象
     * @return AsyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse>
     */
    public AsyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse> glanceListImageMembersAsyncInvoker(GlanceListImageMembersRequest request) {
        return new AsyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse>(request, ImsMeta.glanceListImageMembers, hcClient);
    }

    /**
     * 查询镜像列表视图（OpenStack原生）
     * 该接口主要用于查询镜像列表视图，通过该接口用户可以了解到镜像列表的详细情况和数据结构。
     *
     * @param GlanceListImageSchemasRequest 请求对象
     * @return CompletableFuture<GlanceListImageSchemasResponse>
     */
    public CompletableFuture<GlanceListImageSchemasResponse> glanceListImageSchemasAsync(GlanceListImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    /**
     * 查询镜像列表视图（OpenStack原生）
     * 该接口主要用于查询镜像列表视图，通过该接口用户可以了解到镜像列表的详细情况和数据结构。
     *
     * @param GlanceListImageSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse>
     */
    public AsyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> glanceListImageSchemasAsyncInvoker(GlanceListImageSchemasRequest request) {
        return new AsyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse>(request, ImsMeta.glanceListImageSchemas, hcClient);
    }

    /**
     * 查询镜像列表（OpenStack原生）
     * 获取镜像列表。 使用本接口查询镜像列表时，需要使用分页查询才能返回全部的镜像列表。 分页说明 分页是指返回一组镜像的一个子集，在返回的时候会存在下个子集的链接和首个子集的链接，默认返回的子集中数量为25，用户也可以通过使用limit和marker两个参数自己分页，指定返回子集中需要返回的数量。 响应中的参数first是查询首页的URL。next是查询下一页的URL。当查询镜像列表最后一页时，不存在next。
     *
     * @param GlanceListImagesRequest 请求对象
     * @return CompletableFuture<GlanceListImagesResponse>
     */
    public CompletableFuture<GlanceListImagesResponse> glanceListImagesAsync(GlanceListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImages);
    }

    /**
     * 查询镜像列表（OpenStack原生）
     * 获取镜像列表。 使用本接口查询镜像列表时，需要使用分页查询才能返回全部的镜像列表。 分页说明 分页是指返回一组镜像的一个子集，在返回的时候会存在下个子集的链接和首个子集的链接，默认返回的子集中数量为25，用户也可以通过使用limit和marker两个参数自己分页，指定返回子集中需要返回的数量。 响应中的参数first是查询首页的URL。next是查询下一页的URL。当查询镜像列表最后一页时，不存在next。
     *
     * @param GlanceListImagesRequest 请求对象
     * @return AsyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse>
     */
    public AsyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse> glanceListImagesAsyncInvoker(GlanceListImagesRequest request) {
        return new AsyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse>(request, ImsMeta.glanceListImages, hcClient);
    }

    /**
     * 查询镜像详情（OpenStack原生）
     * 查询单个镜像详情，用户可以通过该接口查询单个私有或者公共镜像的详情
     *
     * @param GlanceShowImageRequest 请求对象
     * @return CompletableFuture<GlanceShowImageResponse>
     */
    public CompletableFuture<GlanceShowImageResponse> glanceShowImageAsync(GlanceShowImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    /**
     * 查询镜像详情（OpenStack原生）
     * 查询单个镜像详情，用户可以通过该接口查询单个私有或者公共镜像的详情
     *
     * @param GlanceShowImageRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse>
     */
    public AsyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse> glanceShowImageAsyncInvoker(GlanceShowImageRequest request) {
        return new AsyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse>(request, ImsMeta.glanceShowImage, hcClient);
    }

    /**
     * 获取镜像成员详情（OpenStack原生）
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     *
     * @param GlanceShowImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceShowImageMemberResponse>
     */
    public CompletableFuture<GlanceShowImageMemberResponse> glanceShowImageMemberAsync(GlanceShowImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    /**
     * 获取镜像成员详情（OpenStack原生）
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     *
     * @param GlanceShowImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse>
     */
    public AsyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> glanceShowImageMemberAsyncInvoker(GlanceShowImageMemberRequest request) {
        return new AsyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse>(request, ImsMeta.glanceShowImageMember, hcClient);
    }

    /**
     * 查询镜像成员视图（OpenStack原生）
     * 该接口主要用于查询镜像成员视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     *
     * @param GlanceShowImageMemberSchemasRequest 请求对象
     * @return CompletableFuture<GlanceShowImageMemberSchemasResponse>
     */
    public CompletableFuture<GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasAsync(GlanceShowImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    /**
     * 查询镜像成员视图（OpenStack原生）
     * 该接口主要用于查询镜像成员视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     *
     * @param GlanceShowImageMemberSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse>
     */
    public AsyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasAsyncInvoker(GlanceShowImageMemberSchemasRequest request) {
        return new AsyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse>(request, ImsMeta.glanceShowImageMemberSchemas, hcClient);
    }

    /**
     * 查询镜像视图（OpenStack原生）
     * 该接口主要用于查询镜像视图，通过视图，用户可以了解到镜像包含哪些属性，同时也可以了解每个属性的数据类型等。
     *
     * @param GlanceShowImageSchemasRequest 请求对象
     * @return CompletableFuture<GlanceShowImageSchemasResponse>
     */
    public CompletableFuture<GlanceShowImageSchemasResponse> glanceShowImageSchemasAsync(GlanceShowImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    /**
     * 查询镜像视图（OpenStack原生）
     * 该接口主要用于查询镜像视图，通过视图，用户可以了解到镜像包含哪些属性，同时也可以了解每个属性的数据类型等。
     *
     * @param GlanceShowImageSchemasRequest 请求对象
     * @return AsyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse>
     */
    public AsyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> glanceShowImageSchemasAsyncInvoker(GlanceShowImageSchemasRequest request) {
        return new AsyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse>(request, ImsMeta.glanceShowImageSchemas, hcClient);
    }

    /**
     * 更新镜像信息（OpenStack原生）
     * 修改镜像信息
     *
     * @param GlanceUpdateImageRequest 请求对象
     * @return CompletableFuture<GlanceUpdateImageResponse>
     */
    public CompletableFuture<GlanceUpdateImageResponse> glanceUpdateImageAsync(GlanceUpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    /**
     * 更新镜像信息（OpenStack原生）
     * 修改镜像信息
     *
     * @param GlanceUpdateImageRequest 请求对象
     * @return AsyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse>
     */
    public AsyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse> glanceUpdateImageAsyncInvoker(GlanceUpdateImageRequest request) {
        return new AsyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse>(request, ImsMeta.glanceUpdateImage, hcClient);
    }

    /**
     * 更新镜像成员状态（OpenStack原生）
     * 用户接受或者拒绝共享镜像时，使用该接口更新镜像成员的状态。
     *
     * @param GlanceUpdateImageMemberRequest 请求对象
     * @return CompletableFuture<GlanceUpdateImageMemberResponse>
     */
    public CompletableFuture<GlanceUpdateImageMemberResponse> glanceUpdateImageMemberAsync(GlanceUpdateImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

    /**
     * 更新镜像成员状态（OpenStack原生）
     * 用户接受或者拒绝共享镜像时，使用该接口更新镜像成员的状态。
     *
     * @param GlanceUpdateImageMemberRequest 请求对象
     * @return AsyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse>
     */
    public AsyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> glanceUpdateImageMemberAsyncInvoker(GlanceUpdateImageMemberRequest request) {
        return new AsyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse>(request, ImsMeta.glanceUpdateImageMember, hcClient);
    }

}
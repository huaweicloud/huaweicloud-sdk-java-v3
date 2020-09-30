package com.huaweicloud.sdk.ims.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.ims.v2.model.*;

public class ImsClient {
    protected HcClient hcClient;

    public ImsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsClient> newBuilder() {
        return new ClientBuilder<>(ImsClient::new);
    }


    /**
     * 批量添加镜像成员
     * 该接口为扩展接口，主要用于镜像共享时用户将多个镜像共享给多个用户。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchAddMembersRequest 请求对象
     * @return BatchAddMembersResponse
     */
    public BatchAddMembersResponse batchAddMembers(BatchAddMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchAddMembers);
    }

    /**
     * 批量删除镜像成员
     * 该接口为扩展接口，主要用于取消镜像共享。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchDeleteMembersRequest 请求对象
     * @return BatchDeleteMembersResponse
     */
    public BatchDeleteMembersResponse batchDeleteMembers(BatchDeleteMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchDeleteMembers);
    }

    /**
     * 批量更新镜像成员状态
     * 该接口为扩展接口，主要用于用户接受或者拒绝多个共享镜像时批量更新镜像成员的状态。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param BatchUpdateMembersRequest 请求对象
     * @return BatchUpdateMembersResponse
     */
    public BatchUpdateMembersResponse batchUpdateMembers(BatchUpdateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchUpdateMembers);
    }

    /**
     * 跨Region复制镜像
     * 该接口为扩展接口，用户在一个区域制作的私有镜像，可以通过跨Region复制镜像将镜像复制到其他区域，在其他区域发放相同类型的云服务器，帮助用户实现区域间的业务迁移。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。 如何查询异步任务，请参见异步任务进度查询。
     *
     * @param CopyImageCrossRegionRequest 请求对象
     * @return CopyImageCrossRegionResponse
     */
    public CopyImageCrossRegionResponse copyImageCrossRegion(CopyImageCrossRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
    }

    /**
     * Region内复制镜像
     * 该接口为扩展接口，主要用于用户将一个已有镜像复制为另一个镜像。复制镜像时，可以更改镜像的加密等属性，以满足不同的场景。 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     *
     * @param CopyImageInRegionRequest 请求对象
     * @return CopyImageInRegionResponse
     */
    public CopyImageInRegionResponse copyImageInRegion(CopyImageInRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageInRegion);
    }

    /**
     * 使用外部镜像文件制作数据镜像
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     *
     * @param CreateDataImageRequest 请求对象
     * @return CreateDataImageResponse
     */
    public CreateDataImageResponse createDataImage(CreateDataImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createDataImage);
    }

    /**
     * 制作镜像
     * 本接口用于制作私有镜像，支持： 使用云服务器制作私有镜像。 使用上传至OBS桶中的外部镜像文件制作私有镜像。 使用数据卷制作系统盘镜像。 作为异步接口，调用成功，只是说明云平台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param CreateImageRequest 请求对象
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createImage);
    }

    /**
     * 增加或修改标签
     * 该接口主要用于为某个镜像增加或修改一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     *
     * @param CreateOrUpdateTagsRequest 请求对象
     * @return CreateOrUpdateTagsResponse
     */
    public CreateOrUpdateTagsResponse createOrUpdateTags(CreateOrUpdateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    /**
     * 制作整机镜像
     * 使用云服务器或者云服务器备份制作整机镜像。作为异步接口，调用成功，只是说明后台收到了制作整机镜像的请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param CreateWholeImageRequest 请求对象
     * @return CreateWholeImageResponse
     */
    public CreateWholeImageResponse createWholeImage(CreateWholeImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    /**
     * 导出镜像
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     *
     * @param ExportImageRequest 请求对象
     * @return ExportImageResponse
     */
    public ExportImageResponse exportImage(ExportImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.exportImage);
    }

    /**
     * 镜像文件快速导入
     * 使用上传至OBS桶中的超大外部镜像文件制作私有镜像，目前仅支持RAW或ZVHD2格式镜像文件。且要求镜像文件大小不能超过1TB。 由于快速导入功能要求提前转换镜像文件格式为RAW或ZVHD2格式，因此镜像文件小于128GB时推荐您优先使用常规的创建私有镜像的方式。 作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     *
     * @param ImportImageQuickRequest 请求对象
     * @return ImportImageQuickResponse
     */
    public ImportImageQuickResponse importImageQuick(ImportImageQuickRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.importImageQuick);
    }

    /**
     * 查询镜像列表
     * 根据不同条件查询镜像列表信息。 可以在URI后面用‘?’和‘&amp;’添加不同的查询条件组合，请参考请求样例。
     *
     * @param ListImagesRequest 请求对象
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImages);
    }

    /**
     * 查询镜像支持的OS列表
     * 查询当前区域弹性云服务器的OS兼容性列表。
     *
     * @param ListOsVersionsRequest 请求对象
     * @return ListOsVersionsResponse
     */
    public ListOsVersionsResponse listOsVersions(ListOsVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    /**
     * 按条件查询租户镜像标签列表
     * 根据不同条件查询镜像标签列表信息。
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listTags);
    }

    /**
     * 注册镜像
     * 该接口用于将镜像文件注册为云平台未初始化的私有镜像。 使用该接口注册镜像的具体步骤如下： 将镜像文件上传到OBS个人桶中。具体操作请参见《对象存储服务客户端指南（OBS Browser）》或《对象存储服务API参考》。 使用创建镜像元数据接口创建镜像元数据。调用成功后，保存该镜像的ID。创建镜像元数据请参考创建镜像元数据（OpenStack原生）。 根据2得到的镜像ID，使用注册镜像接口注册OBS桶中的镜像文件。 注册镜像接口作为异步接口，调用成功后，说明后台收到了注册请求。需要根据镜像ID查询该镜像状态验证镜像注册是否成功。当镜像状态变为“active”时，表示镜像注册成功。 如何查询异步任务，请参见异步任务查询。
     *
     * @param RegisterImageRequest 请求对象
     * @return RegisterImageResponse
     */
    public RegisterImageResponse registerImage(RegisterImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.registerImage);
    }

    /**
     * 查询镜像配额
     * 该接口为扩展接口，主要用于查询租户在当前Region的私有镜像的配额数量。
     *
     * @param ShowImageQuotaRequest 请求对象
     * @return ShowImageQuotaResponse
     */
    public ShowImageQuotaResponse showImageQuota(ShowImageQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    /**
     * 更新镜像信息
     * 更新镜像信息接口，主要用于镜像属性的修改。当前仅支持可用（active）状态的镜像更新相关信息。
     *
     * @param UpdateImageRequest 请求对象
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.updateImage);
    }

    /**
     * 查询job状态
     * 该接口为扩展接口，主要用于查询异步接口执行情况，比如查询导出镜像任务的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showJob);
    }

    /**
     * 添加镜像成员（OpenStack原生）
     * 用户共享镜像给其他用户时，使用该接口向该镜像成员中添加接受镜像用户的项目ID。
     *
     * @param GlanceAddImageMemberRequest 请求对象
     * @return GlanceAddImageMemberResponse
     */
    public GlanceAddImageMemberResponse glanceAddImageMember(GlanceAddImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    /**
     * 创建镜像元数据（OpenStack原生）
     * 创建镜像元数据。调用创建镜像元数据接口成功后，只是创建了镜像的元数据，镜像对应的实际镜像文件并不存在
     *
     * @param GlanceCreateImageMetadataRequest 请求对象
     * @return GlanceCreateImageMetadataResponse
     */
    public GlanceCreateImageMetadataResponse glanceCreateImageMetadata(GlanceCreateImageMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    /**
     * 增加标签（OpenStack原生）
     * 该接口主要用于为某个镜像添加一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     *
     * @param GlanceCreateTagRequest 请求对象
     * @return GlanceCreateTagResponse
     */
    public GlanceCreateTagResponse glanceCreateTag(GlanceCreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    /**
     * 删除镜像（OpenStack原生）
     * 该接口主要用于删除镜像，用户可以通过该接口将自己的私有镜像删除。
     *
     * @param GlanceDeleteImageRequest 请求对象
     * @return GlanceDeleteImageResponse
     */
    public GlanceDeleteImageResponse glanceDeleteImage(GlanceDeleteImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    /**
     * 删除指定的镜像成员（OpenStack原生）
     * 该接口用于取消对某个用户的镜像共享。
     *
     * @param GlanceDeleteImageMemberRequest 请求对象
     * @return GlanceDeleteImageMemberResponse
     */
    public GlanceDeleteImageMemberResponse glanceDeleteImageMember(GlanceDeleteImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    /**
     * 删除标签（OpenStack原生）
     * 该接口主要用于删除某个镜像的自定义标签，通过该接口，用户可以将私有镜像中一些不用的标签删除。
     *
     * @param GlanceDeleteTagRequest 请求对象
     * @return GlanceDeleteTagResponse
     */
    public GlanceDeleteTagResponse glanceDeleteTag(GlanceDeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    /**
     * 查询镜像成员列表视图（OpenStack原生）
     * 该接口主要用于查询镜像成员列表视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     *
     * @param GlanceListImageMemberSchemasRequest 请求对象
     * @return GlanceListImageMemberSchemasResponse
     */
    public GlanceListImageMemberSchemasResponse glanceListImageMemberSchemas(GlanceListImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    /**
     * 获取镜像成员列表（OpenStack原生）
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     *
     * @param GlanceListImageMembersRequest 请求对象
     * @return GlanceListImageMembersResponse
     */
    public GlanceListImageMembersResponse glanceListImageMembers(GlanceListImageMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    /**
     * 查询镜像列表视图（OpenStack原生）
     * 该接口主要用于查询镜像列表视图，通过该接口用户可以了解到镜像列表的详细情况和数据结构。
     *
     * @param GlanceListImageSchemasRequest 请求对象
     * @return GlanceListImageSchemasResponse
     */
    public GlanceListImageSchemasResponse glanceListImageSchemas(GlanceListImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    /**
     * 查询镜像列表（OpenStack原生）
     * 获取镜像列表。 使用本接口查询镜像列表时，需要使用分页查询才能返回全部的镜像列表。 分页说明 分页是指返回一组镜像的一个子集，在返回的时候会存在下个子集的链接和首个子集的链接，默认返回的子集中数量为25，用户也可以通过使用limit和marker两个参数自己分页，指定返回子集中需要返回的数量。 响应中的参数first是查询首页的URL。next是查询下一页的URL。当查询镜像列表最后一页时，不存在next。
     *
     * @param GlanceListImagesRequest 请求对象
     * @return GlanceListImagesResponse
     */
    public GlanceListImagesResponse glanceListImages(GlanceListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImages);
    }

    /**
     * 查询镜像详情（OpenStack原生）
     * 查询单个镜像详情，用户可以通过该接口查询单个私有或者公共镜像的详情
     *
     * @param GlanceShowImageRequest 请求对象
     * @return GlanceShowImageResponse
     */
    public GlanceShowImageResponse glanceShowImage(GlanceShowImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    /**
     * 获取镜像成员详情（OpenStack原生）
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     *
     * @param GlanceShowImageMemberRequest 请求对象
     * @return GlanceShowImageMemberResponse
     */
    public GlanceShowImageMemberResponse glanceShowImageMember(GlanceShowImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    /**
     * 查询镜像成员视图（OpenStack原生）
     * 该接口主要用于查询镜像成员视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     *
     * @param GlanceShowImageMemberSchemasRequest 请求对象
     * @return GlanceShowImageMemberSchemasResponse
     */
    public GlanceShowImageMemberSchemasResponse glanceShowImageMemberSchemas(GlanceShowImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    /**
     * 查询镜像视图（OpenStack原生）
     * 该接口主要用于查询镜像视图，通过视图，用户可以了解到镜像包含哪些属性，同时也可以了解每个属性的数据类型等。
     *
     * @param GlanceShowImageSchemasRequest 请求对象
     * @return GlanceShowImageSchemasResponse
     */
    public GlanceShowImageSchemasResponse glanceShowImageSchemas(GlanceShowImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    /**
     * 更新镜像信息（OpenStack原生）
     * 修改镜像信息
     *
     * @param GlanceUpdateImageRequest 请求对象
     * @return GlanceUpdateImageResponse
     */
    public GlanceUpdateImageResponse glanceUpdateImage(GlanceUpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    /**
     * 更新镜像成员状态（OpenStack原生）
     * 用户接受或者拒绝共享镜像时，使用该接口更新镜像成员的状态。
     *
     * @param GlanceUpdateImageMemberRequest 请求对象
     * @return GlanceUpdateImageMemberResponse
     */
    public GlanceUpdateImageMemberResponse glanceUpdateImageMember(GlanceUpdateImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

}
package com.huaweicloud.sdk.ims.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.ims.v2.model.*;

public class ImsClient {
    protected HcClient hcClient;

    public ImsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsClient> newBuilder() {
        return new ClientBuilder<>(ImsClient::new);
    }

    public BatchAddMembersResponse batchAddMembers(BatchAddMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchAddMembers);
    }

    public BatchDeleteMembersResponse batchDeleteMembers(BatchDeleteMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchDeleteMembers);
    }

    public BatchUpdateMembersResponse batchUpdateMembers(BatchUpdateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchUpdateMembers);
    }

    public CopyImageCrossRegionResponse copyImageCrossRegion(CopyImageCrossRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
    }

    public CopyImageInRegionResponse copyImageInRegion(CopyImageInRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageInRegion);
    }

    public CreateDataImageResponse createDataImage(CreateDataImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createDataImage);
    }

    public CreateImageResponse createImage(CreateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createImage);
    }

    public CreateOrUpdateTagsResponse createOrUpdateTags(CreateOrUpdateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    public CreateWholeImageResponse createWholeImage(CreateWholeImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    public ExportImageResponse exportImage(ExportImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.exportImage);
    }

    public ImportImageQuickResponse importImageQuick(ImportImageQuickRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.importImageQuick);
    }

    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImages);
    }

    public ListOsVersionsResponse listOsVersions(ListOsVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listTags);
    }

    public RegisterImageResponse registerImage(RegisterImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.registerImage);
    }

    public ShowImageQuotaResponse showImageQuota(ShowImageQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.updateImage);
    }

    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showJob);
    }

    public GlanceAddImageMemberResponse glanceAddImageMember(GlanceAddImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    public GlanceCreateImageMetadataResponse glanceCreateImageMetadata(GlanceCreateImageMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    public GlanceCreateTagResponse glanceCreateTag(GlanceCreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    public GlanceDeleteImageResponse glanceDeleteImage(GlanceDeleteImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    public GlanceDeleteImageMemberResponse glanceDeleteImageMember(GlanceDeleteImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    public GlanceDeleteTagResponse glanceDeleteTag(GlanceDeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    public GlanceListImageMemberSchemasResponse glanceListImageMemberSchemas(GlanceListImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    public GlanceListImageMembersResponse glanceListImageMembers(GlanceListImageMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    public GlanceListImageSchemasResponse glanceListImageSchemas(GlanceListImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    public GlanceListImagesResponse glanceListImages(GlanceListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImages);
    }

    public GlanceShowImageResponse glanceShowImage(GlanceShowImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    public GlanceShowImageMemberResponse glanceShowImageMember(GlanceShowImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    public GlanceShowImageMemberSchemasResponse glanceShowImageMemberSchemas(GlanceShowImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    public GlanceShowImageSchemasResponse glanceShowImageSchemas(GlanceShowImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    public GlanceUpdateImageResponse glanceUpdateImage(GlanceUpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    public GlanceUpdateImageMemberResponse glanceUpdateImageMember(GlanceUpdateImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

}
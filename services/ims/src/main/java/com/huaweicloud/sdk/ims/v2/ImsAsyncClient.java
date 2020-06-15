package com.huaweicloud.sdk.ims.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.ims.v2.model.*;

public class ImsAsyncClient {
    protected HcClient hcClient;

    public ImsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsAsyncClient> newBuilder() {
        return new ClientBuilder<>(ImsAsyncClient::new);
    }


    public CompletableFuture<BatchAddMembersResponse> batchAddMembersAsync(BatchAddMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchAddMembers);
    }

    public CompletableFuture<BatchDeleteMembersResponse> batchDeleteMembersAsync(BatchDeleteMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchDeleteMembers);
    }

    public CompletableFuture<BatchUpdateMembersResponse> batchUpdateMembersAsync(BatchUpdateMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.batchUpdateMembers);
    }

    public CompletableFuture<CopyImageCrossRegionResponse> copyImageCrossRegionAsync(CopyImageCrossRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
    }

    public CompletableFuture<CopyImageInRegionResponse> copyImageInRegionAsync(CopyImageInRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.copyImageInRegion);
    }

    public CompletableFuture<CreateDataImageResponse> createDataImageAsync(CreateDataImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createDataImage);
    }

    public CompletableFuture<CreateImageResponse> createImageAsync(CreateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createImage);
    }

    public CompletableFuture<CreateOrUpdateTagsResponse> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    public CompletableFuture<CreateWholeImageResponse> createWholeImageAsync(CreateWholeImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    public CompletableFuture<ExportImageResponse> exportImageAsync(ExportImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.exportImage);
    }

    public CompletableFuture<ImportImageQuickResponse> importImageQuickAsync(ImportImageQuickRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.importImageQuick);
    }

    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listImages);
    }

    public CompletableFuture<ListOsVersionsResponse> listOsVersionsAsync(ListOsVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.listTags);
    }

    public CompletableFuture<RegisterImageResponse> registerImageAsync(RegisterImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.registerImage);
    }

    public CompletableFuture<ShowImageQuotaResponse> showImageQuotaAsync(ShowImageQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    public CompletableFuture<UpdateImageResponse> updateImageAsync(UpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.updateImage);
    }

    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.showJob);
    }

    public CompletableFuture<GlanceAddImageMemberResponse> glanceAddImageMemberAsync(GlanceAddImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    public CompletableFuture<GlanceCreateImageMetadataResponse> glanceCreateImageMetadataAsync(GlanceCreateImageMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    public CompletableFuture<GlanceCreateTagResponse> glanceCreateTagAsync(GlanceCreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    public CompletableFuture<GlanceDeleteImageResponse> glanceDeleteImageAsync(GlanceDeleteImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    public CompletableFuture<GlanceDeleteImageMemberResponse> glanceDeleteImageMemberAsync(GlanceDeleteImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    public CompletableFuture<GlanceDeleteTagResponse> glanceDeleteTagAsync(GlanceDeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    public CompletableFuture<GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasAsync(GlanceListImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    public CompletableFuture<GlanceListImageMembersResponse> glanceListImageMembersAsync(GlanceListImageMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    public CompletableFuture<GlanceListImageSchemasResponse> glanceListImageSchemasAsync(GlanceListImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    public CompletableFuture<GlanceListImagesResponse> glanceListImagesAsync(GlanceListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceListImages);
    }

    public CompletableFuture<GlanceShowImageResponse> glanceShowImageAsync(GlanceShowImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    public CompletableFuture<GlanceShowImageMemberResponse> glanceShowImageMemberAsync(GlanceShowImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    public CompletableFuture<GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasAsync(GlanceShowImageMemberSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    public CompletableFuture<GlanceShowImageSchemasResponse> glanceShowImageSchemasAsync(GlanceShowImageSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    public CompletableFuture<GlanceUpdateImageResponse> glanceUpdateImageAsync(GlanceUpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    public CompletableFuture<GlanceUpdateImageMemberResponse> glanceUpdateImageMemberAsync(GlanceUpdateImageMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

}
package com.huaweicloud.sdk.ims.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ims.v2.model.AddImageTagRequest;
import com.huaweicloud.sdk.ims.v2.model.AddImageTagRequestBody;
import com.huaweicloud.sdk.ims.v2.model.AddImageTagResponse;
import com.huaweicloud.sdk.ims.v2.model.AddOrUpdateTagsRequestBody;
import com.huaweicloud.sdk.ims.v2.model.BatchAddMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchAddMembersRequestBody;
import com.huaweicloud.sdk.ims.v2.model.BatchAddMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchAddOrDeleteTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchAddOrDeleteTagsRequestBody;
import com.huaweicloud.sdk.ims.v2.model.BatchAddOrDeleteTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteTagsRequestBody;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchUpdateMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchUpdateMembersRequestBody;
import com.huaweicloud.sdk.ims.v2.model.BatchUpdateMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.CopyImageCrossRegionRequest;
import com.huaweicloud.sdk.ims.v2.model.CopyImageCrossRegionRequestBody;
import com.huaweicloud.sdk.ims.v2.model.CopyImageCrossRegionResponse;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionRequest;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionRequestBody;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageRequestBody;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateImageInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateImageInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateImageRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateImageRequestBody;
import com.huaweicloud.sdk.ims.v2.model.CreateImageResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateOrUpdateTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateOrUpdateTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateWholeImageRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateWholeImageRequestBody;
import com.huaweicloud.sdk.ims.v2.model.CreateWholeImageResponse;
import com.huaweicloud.sdk.ims.v2.model.DeleteImageTagRequest;
import com.huaweicloud.sdk.ims.v2.model.DeleteImageTagResponse;
import com.huaweicloud.sdk.ims.v2.model.ExportImageInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.ExportImageInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.ExportImageRequest;
import com.huaweicloud.sdk.ims.v2.model.ExportImageRequestBody;
import com.huaweicloud.sdk.ims.v2.model.ExportImageResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceAddImageMemberRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceAddImageMemberRequestBody;
import com.huaweicloud.sdk.ims.v2.model.GlanceAddImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateImageMetadataRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateImageMetadataRequestBody;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateImageMetadataResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateTagRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateTagResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageMemberRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageRequestBody;
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
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageMemberRequestBody;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageRequestBody;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageResponse;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickRequest;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickResponse;
import com.huaweicloud.sdk.ims.v2.model.ListImageByTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListImageByTagsRequestBody;
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
import com.huaweicloud.sdk.ims.v2.model.ListOsVersionsResponseBody;
import com.huaweicloud.sdk.ims.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.ims.v2.model.QuickImportImageByFileRequestBody;
import com.huaweicloud.sdk.ims.v2.model.RegisterImageRequest;
import com.huaweicloud.sdk.ims.v2.model.RegisterImageRequestBody;
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
import com.huaweicloud.sdk.ims.v2.model.UpdateImageRequestBody;
import com.huaweicloud.sdk.ims.v2.model.UpdateImageResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class ImsMeta {

    public static final HttpRequestDef<AddImageTagRequest, AddImageTagResponse> addImageTag = genForAddImageTag();

    private static HttpRequestDef<AddImageTagRequest, AddImageTagResponse> genForAddImageTag() {
        // basic
        HttpRequestDef.Builder<AddImageTagRequest, AddImageTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddImageTagRequest.class, AddImageTagResponse.class)
                .withName("AddImageTag")
                .withUri("/v2/{project_id}/images/{image_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddImageTagRequest::getImageId, AddImageTagRequest::setImageId));
        builder.<AddImageTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddImageTagRequestBody.class),
            f -> f.withMarshaller(AddImageTagRequest::getBody, AddImageTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddMembersRequest, BatchAddMembersResponse> batchAddMembers =
        genForBatchAddMembers();

    private static HttpRequestDef<BatchAddMembersRequest, BatchAddMembersResponse> genForBatchAddMembers() {
        // basic
        HttpRequestDef.Builder<BatchAddMembersRequest, BatchAddMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddMembersRequest.class, BatchAddMembersResponse.class)
                .withName("BatchAddMembers")
                .withUri("/v1/cloudimages/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchAddMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddMembersRequestBody.class),
            f -> f.withMarshaller(BatchAddMembersRequest::getBody, BatchAddMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> batchAddOrDeleteTags =
        genForBatchAddOrDeleteTags();

    private static HttpRequestDef<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> genForBatchAddOrDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddOrDeleteTagsRequest.class, BatchAddOrDeleteTagsResponse.class)
            .withName("BatchAddOrDeleteTags")
            .withUri("/v2/{project_id}/images/{image_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddOrDeleteTagsRequest::getImageId, BatchAddOrDeleteTagsRequest::setImageId));
        builder.<BatchAddOrDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddOrDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchAddOrDeleteTagsRequest::getBody, BatchAddOrDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembers =
        genForBatchDeleteMembers();

    private static HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> genForBatchDeleteMembers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMembersRequest, BatchDeleteMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteMembersRequest.class, BatchDeleteMembersResponse.class)
                .withName("BatchDeleteMembers")
                .withUri("/v1/cloudimages/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchAddMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddMembersRequestBody.class),
            f -> f.withMarshaller(BatchDeleteMembersRequest::getBody, BatchDeleteMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForBatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForBatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v1/{project_id}/cloudimages/{image_id}/tags/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getImageId, BatchDeleteTagsRequest::setImageId));
        builder.<BatchDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, BatchDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembers =
        genForBatchUpdateMembers();

    private static HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> genForBatchUpdateMembers() {
        // basic
        HttpRequestDef.Builder<BatchUpdateMembersRequest, BatchUpdateMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateMembersRequest.class, BatchUpdateMembersResponse.class)
                .withName("BatchUpdateMembers")
                .withUri("/v1/cloudimages/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchUpdateMembersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateMembersRequestBody.class),
            f -> f.withMarshaller(BatchUpdateMembersRequest::getBody, BatchUpdateMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> copyImageCrossRegion =
        genForCopyImageCrossRegion();

    private static HttpRequestDef<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> genForCopyImageCrossRegion() {
        // basic
        HttpRequestDef.Builder<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CopyImageCrossRegionRequest.class, CopyImageCrossRegionResponse.class)
            .withName("CopyImageCrossRegion")
            .withUri("/v1/cloudimages/{image_id}/cross_region_copy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyImageCrossRegionRequest::getImageId, CopyImageCrossRegionRequest::setImageId));
        builder.<CopyImageCrossRegionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyImageCrossRegionRequestBody.class),
            f -> f.withMarshaller(CopyImageCrossRegionRequest::getBody, CopyImageCrossRegionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyImageInRegionRequest, CopyImageInRegionResponse> copyImageInRegion =
        genForCopyImageInRegion();

    private static HttpRequestDef<CopyImageInRegionRequest, CopyImageInRegionResponse> genForCopyImageInRegion() {
        // basic
        HttpRequestDef.Builder<CopyImageInRegionRequest, CopyImageInRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyImageInRegionRequest.class, CopyImageInRegionResponse.class)
                .withName("CopyImageInRegion")
                .withUri("/v1/cloudimages/{image_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyImageInRegionRequest::getImageId, CopyImageInRegionRequest::setImageId));
        builder.<CopyImageInRegionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyImageInRegionRequestBody.class),
            f -> f.withMarshaller(CopyImageInRegionRequest::getBody, CopyImageInRegionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyImageInRegionInSafeModeRequest, CopyImageInRegionInSafeModeResponse> copyImageInRegionInSafeMode =
        genForCopyImageInRegionInSafeMode();

    private static HttpRequestDef<CopyImageInRegionInSafeModeRequest, CopyImageInRegionInSafeModeResponse> genForCopyImageInRegionInSafeMode() {
        // basic
        HttpRequestDef.Builder<CopyImageInRegionInSafeModeRequest, CopyImageInRegionInSafeModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CopyImageInRegionInSafeModeRequest.class,
                    CopyImageInRegionInSafeModeResponse.class)
                .withName("CopyImageInRegionInSafeMode")
                .withUri("/v2.1/cloudimages/{image_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyImageInRegionInSafeModeRequest::getImageId,
                CopyImageInRegionInSafeModeRequest::setImageId));
        builder.<CopyImageInRegionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyImageInRegionRequestBody.class),
            f -> f.withMarshaller(CopyImageInRegionInSafeModeRequest::getBody,
                CopyImageInRegionInSafeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataImageRequest, CreateDataImageResponse> createDataImage =
        genForCreateDataImage();

    private static HttpRequestDef<CreateDataImageRequest, CreateDataImageResponse> genForCreateDataImage() {
        // basic
        HttpRequestDef.Builder<CreateDataImageRequest, CreateDataImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataImageRequest.class, CreateDataImageResponse.class)
                .withName("CreateDataImage")
                .withUri("/v1/cloudimages/dataimages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDataImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataImageRequestBody.class),
            f -> f.withMarshaller(CreateDataImageRequest::getBody, CreateDataImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataImageInSafeModeRequest, CreateDataImageInSafeModeResponse> createDataImageInSafeMode =
        genForCreateDataImageInSafeMode();

    private static HttpRequestDef<CreateDataImageInSafeModeRequest, CreateDataImageInSafeModeResponse> genForCreateDataImageInSafeMode() {
        // basic
        HttpRequestDef.Builder<CreateDataImageInSafeModeRequest, CreateDataImageInSafeModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDataImageInSafeModeRequest.class,
                    CreateDataImageInSafeModeResponse.class)
                .withName("CreateDataImageInSafeMode")
                .withUri("/v2.1/cloudimages/dataimages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDataImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataImageRequestBody.class),
            f -> f.withMarshaller(CreateDataImageInSafeModeRequest::getBody,
                CreateDataImageInSafeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForCreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForCreateImage() {
        // basic
        HttpRequestDef.Builder<CreateImageRequest, CreateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageRequest.class, CreateImageResponse.class)
                .withName("CreateImage")
                .withUri("/v2/cloudimages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageRequestBody.class),
            f -> f.withMarshaller(CreateImageRequest::getBody, CreateImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageInSafeModeRequest, CreateImageInSafeModeResponse> createImageInSafeMode =
        genForCreateImageInSafeMode();

    private static HttpRequestDef<CreateImageInSafeModeRequest, CreateImageInSafeModeResponse> genForCreateImageInSafeMode() {
        // basic
        HttpRequestDef.Builder<CreateImageInSafeModeRequest, CreateImageInSafeModeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateImageInSafeModeRequest.class, CreateImageInSafeModeResponse.class)
            .withName("CreateImageInSafeMode")
            .withUri("/v2.1/cloudimages/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageRequestBody.class),
            f -> f.withMarshaller(CreateImageInSafeModeRequest::getBody, CreateImageInSafeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> createOrUpdateTags =
        genForCreateOrUpdateTags();

    private static HttpRequestDef<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> genForCreateOrUpdateTags() {
        // basic
        HttpRequestDef.Builder<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateOrUpdateTagsRequest.class, CreateOrUpdateTagsResponse.class)
                .withName("CreateOrUpdateTags")
                .withUri("/v1/cloudimages/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AddOrUpdateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOrUpdateTagsRequestBody.class),
            f -> f.withMarshaller(CreateOrUpdateTagsRequest::getBody, CreateOrUpdateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWholeImageRequest, CreateWholeImageResponse> createWholeImage =
        genForCreateWholeImage();

    private static HttpRequestDef<CreateWholeImageRequest, CreateWholeImageResponse> genForCreateWholeImage() {
        // basic
        HttpRequestDef.Builder<CreateWholeImageRequest, CreateWholeImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWholeImageRequest.class, CreateWholeImageResponse.class)
                .withName("CreateWholeImage")
                .withUri("/v1/cloudimages/wholeimages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateWholeImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWholeImageRequestBody.class),
            f -> f.withMarshaller(CreateWholeImageRequest::getBody, CreateWholeImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageTagRequest, DeleteImageTagResponse> deleteImageTag =
        genForDeleteImageTag();

    private static HttpRequestDef<DeleteImageTagRequest, DeleteImageTagResponse> genForDeleteImageTag() {
        // basic
        HttpRequestDef.Builder<DeleteImageTagRequest, DeleteImageTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageTagRequest.class, DeleteImageTagResponse.class)
                .withName("DeleteImageTag")
                .withUri("/v2/{project_id}/images/{image_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageTagRequest::getImageId, DeleteImageTagRequest::setImageId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageTagRequest::getKey, DeleteImageTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportImageRequest, ExportImageResponse> exportImage = genForExportImage();

    private static HttpRequestDef<ExportImageRequest, ExportImageResponse> genForExportImage() {
        // basic
        HttpRequestDef.Builder<ExportImageRequest, ExportImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportImageRequest.class, ExportImageResponse.class)
                .withName("ExportImage")
                .withUri("/v1/cloudimages/{image_id}/file")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportImageRequest::getImageId, ExportImageRequest::setImageId));
        builder.<ExportImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportImageRequestBody.class),
            f -> f.withMarshaller(ExportImageRequest::getBody, ExportImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportImageInSafeModeRequest, ExportImageInSafeModeResponse> exportImageInSafeMode =
        genForExportImageInSafeMode();

    private static HttpRequestDef<ExportImageInSafeModeRequest, ExportImageInSafeModeResponse> genForExportImageInSafeMode() {
        // basic
        HttpRequestDef.Builder<ExportImageInSafeModeRequest, ExportImageInSafeModeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportImageInSafeModeRequest.class, ExportImageInSafeModeResponse.class)
            .withName("ExportImageInSafeMode")
            .withUri("/v2.1/cloudimages/{image_id}/file")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportImageInSafeModeRequest::getImageId, ExportImageInSafeModeRequest::setImageId));
        builder.<ExportImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportImageRequestBody.class),
            f -> f.withMarshaller(ExportImageInSafeModeRequest::getBody, ExportImageInSafeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportImageQuickRequest, ImportImageQuickResponse> importImageQuick =
        genForImportImageQuick();

    private static HttpRequestDef<ImportImageQuickRequest, ImportImageQuickResponse> genForImportImageQuick() {
        // basic
        HttpRequestDef.Builder<ImportImageQuickRequest, ImportImageQuickResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportImageQuickRequest.class, ImportImageQuickResponse.class)
                .withName("ImportImageQuick")
                .withUri("/v2/cloudimages/quickimport/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<QuickImportImageByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuickImportImageByFileRequestBody.class),
            f -> f.withMarshaller(ImportImageQuickRequest::getBody, ImportImageQuickRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportImageQuickInSafeModeRequest, ImportImageQuickInSafeModeResponse> importImageQuickInSafeMode =
        genForImportImageQuickInSafeMode();

    private static HttpRequestDef<ImportImageQuickInSafeModeRequest, ImportImageQuickInSafeModeResponse> genForImportImageQuickInSafeMode() {
        // basic
        HttpRequestDef.Builder<ImportImageQuickInSafeModeRequest, ImportImageQuickInSafeModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ImportImageQuickInSafeModeRequest.class,
                    ImportImageQuickInSafeModeResponse.class)
                .withName("ImportImageQuickInSafeMode")
                .withUri("/v2.1/cloudimages/quickimport/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<QuickImportImageByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuickImportImageByFileRequestBody.class),
            f -> f.withMarshaller(ImportImageQuickInSafeModeRequest::getBody,
                ImportImageQuickInSafeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageByTagsRequest, ListImageByTagsResponse> listImageByTags =
        genForListImageByTags();

    private static HttpRequestDef<ListImageByTagsRequest, ListImageByTagsResponse> genForListImageByTags() {
        // basic
        HttpRequestDef.Builder<ListImageByTagsRequest, ListImageByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListImageByTagsRequest.class, ListImageByTagsResponse.class)
                .withName("ListImageByTags")
                .withUri("/v2/{project_id}/images/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListImageByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListImageByTagsRequestBody.class),
            f -> f.withMarshaller(ListImageByTagsRequest::getBody, ListImageByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageMembersRequest, ListImageMembersResponse> listImageMembers =
        genForListImageMembers();

    private static HttpRequestDef<ListImageMembersRequest, ListImageMembersResponse> genForListImageMembers() {
        // basic
        HttpRequestDef.Builder<ListImageMembersRequest, ListImageMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageMembersRequest.class, ListImageMembersResponse.class)
                .withName("ListImageMembers")
                .withUri("/v1/{project_id}/cloudimages/{image_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageMembersRequest::getImageId, ListImageMembersRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageTagsRequest, ListImageTagsResponse> listImageTags =
        genForListImageTags();

    private static HttpRequestDef<ListImageTagsRequest, ListImageTagsResponse> genForListImageTags() {
        // basic
        HttpRequestDef.Builder<ListImageTagsRequest, ListImageTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageTagsRequest.class, ListImageTagsResponse.class)
                .withName("ListImageTags")
                .withUri("/v2/{project_id}/images/{image_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageTagsRequest::getImageId, ListImageTagsRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForListImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForListImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withName("ListImages")
                .withUri("/v2/cloudimages")
                .withContentType("application/json");

        // requests
        builder.<ListImagesRequest.ImagetypeEnum>withRequestField("__imagetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.ImagetypeEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getImagetype, ListImagesRequest::setImagetype));
        builder.<ListImagesRequest.IsregisteredEnum>withRequestField("__isregistered",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.IsregisteredEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getIsregistered, ListImagesRequest::setIsregistered));
        builder.<ListImagesRequest.OsBitEnum>withRequestField("__os_bit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.OsBitEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getOsBit, ListImagesRequest::setOsBit));
        builder.<ListImagesRequest.OsTypeEnum>withRequestField("__os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.OsTypeEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getOsType, ListImagesRequest::setOsType));
        builder.<ListImagesRequest.PlatformEnum>withRequestField("__platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.PlatformEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getPlatform, ListImagesRequest::setPlatform));
        builder.<String>withRequestField("__support_diskintensive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportDiskintensive,
                ListImagesRequest::setSupportDiskintensive));
        builder.<String>withRequestField("__support_highperformance",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportHighperformance,
                ListImagesRequest::setSupportHighperformance));
        builder.<String>withRequestField("__support_kvm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvm, ListImagesRequest::setSupportKvm));
        builder.<String>withRequestField("__support_kvm_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmGpuType, ListImagesRequest::setSupportKvmGpuType));
        builder.<String>withRequestField("__support_kvm_infiniband",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportKvmInfiniband,
                ListImagesRequest::setSupportKvmInfiniband));
        builder.<String>withRequestField("__support_largememory",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportLargememory, ListImagesRequest::setSupportLargememory));
        builder.<String>withRequestField("__support_xen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportXen, ListImagesRequest::setSupportXen));
        builder.<String>withRequestField("__support_xen_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportXenGpuType, ListImagesRequest::setSupportXenGpuType));
        builder.<String>withRequestField("__support_xen_hana",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSupportXenHana, ListImagesRequest::setSupportXenHana));
        builder.<String>withRequestField("container_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getContainerFormat, ListImagesRequest::setContainerFormat));
        builder.<ListImagesRequest.DiskFormatEnum>withRequestField("disk_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.DiskFormatEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getDiskFormat, ListImagesRequest::setDiskFormat));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getEnterpriseProjectId,
                ListImagesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getId, ListImagesRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, ListImagesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getMarker, ListImagesRequest::setMarker));
        builder.<ListImagesRequest.MemberStatusEnum>withRequestField("member_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.MemberStatusEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getMemberStatus, ListImagesRequest::setMemberStatus));
        builder.<Integer>withRequestField("min_disk",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getMinDisk, ListImagesRequest::setMinDisk));
        builder.<Integer>withRequestField("min_ram",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getMinRam, ListImagesRequest::setMinRam));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getName, ListImagesRequest::setName));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getOwner, ListImagesRequest::setOwner));
        builder.<Boolean>withRequestField("protected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImagesRequest::getProtected, ListImagesRequest::setProtected));
        builder.<ListImagesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getSortDir, ListImagesRequest::setSortDir));
        builder.<ListImagesRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getSortKey, ListImagesRequest::setSortKey));
        builder.<ListImagesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getStatus, ListImagesRequest::setStatus));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getTag, ListImagesRequest::setTag));
        builder.<ListImagesRequest.VirtualEnvTypeEnum>withRequestField("virtual_env_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.VirtualEnvTypeEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getVirtualEnvType, ListImagesRequest::setVirtualEnvType));
        builder.<ListImagesRequest.VisibilityEnum>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.VisibilityEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getVisibility, ListImagesRequest::setVisibility));
        builder.<String>withRequestField("flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getFlavorId, ListImagesRequest::setFlavorId));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getCreatedAt, ListImagesRequest::setCreatedAt));
        builder.<String>withRequestField("updated_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getUpdatedAt, ListImagesRequest::setUpdatedAt));
        builder.<ListImagesRequest.ArchitectureEnum>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListImagesRequest.ArchitectureEnum.class),
            f -> f.withMarshaller(ListImagesRequest::getArchitecture, ListImagesRequest::setArchitecture));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getXSdkDate, ListImagesRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesTagsRequest, ListImagesTagsResponse> listImagesTags =
        genForListImagesTags();

    private static HttpRequestDef<ListImagesTagsRequest, ListImagesTagsResponse> genForListImagesTags() {
        // basic
        HttpRequestDef.Builder<ListImagesTagsRequest, ListImagesTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesTagsRequest.class, ListImagesTagsResponse.class)
                .withName("ListImagesTags")
                .withUri("/v2/{project_id}/images/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOsVersionsRequest, ListOsVersionsResponse> listOsVersions =
        genForListOsVersions();

    private static HttpRequestDef<ListOsVersionsRequest, ListOsVersionsResponse> genForListOsVersions() {
        // basic
        HttpRequestDef.Builder<ListOsVersionsRequest, ListOsVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOsVersionsRequest.class, ListOsVersionsResponse.class)
                .withName("ListOsVersions")
                .withUri("/v1/cloudimages/os_version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOsVersionsRequest::getTag, ListOsVersionsRequest::setTag));

        // response
        builder.<List<ListOsVersionsResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListOsVersionsResponse::getBody, ListOsVersionsResponse::setBody)
                .withInnerContainerType(ListOsVersionsResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1/cloudimages/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getLimit, ListTagsRequest::setLimit));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getPage, ListTagsRequest::setPage));
        builder.<ListTagsRequest.ImagetypeEnum>withRequestField("__imagetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.ImagetypeEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getImagetype, ListTagsRequest::setImagetype));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getId, ListTagsRequest::setId));
        builder.<ListTagsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getStatus, ListTagsRequest::setStatus));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getName, ListTagsRequest::setName));
        builder.<Integer>withRequestField("min_disk",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsRequest::getMinDisk, ListTagsRequest::setMinDisk));
        builder.<String>withRequestField("__platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getPlatform, ListTagsRequest::setPlatform));
        builder.<ListTagsRequest.OsTypeEnum>withRequestField("__os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.OsTypeEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getOsType, ListTagsRequest::setOsType));
        builder.<ListTagsRequest.MemberStatusEnum>withRequestField("member_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.MemberStatusEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getMemberStatus, ListTagsRequest::setMemberStatus));
        builder.<ListTagsRequest.VirtualEnvTypeEnum>withRequestField("virtual_env_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.VirtualEnvTypeEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getVirtualEnvType, ListTagsRequest::setVirtualEnvType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getEnterpriseProjectId, ListTagsRequest::setEnterpriseProjectId));
        builder.<ListTagsRequest.ArchitectureEnum>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagsRequest.ArchitectureEnum.class),
            f -> f.withMarshaller(ListTagsRequest::getArchitecture, ListTagsRequest::setArchitecture));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getCreatedAt, ListTagsRequest::setCreatedAt));
        builder.<String>withRequestField("updated_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getUpdatedAt, ListTagsRequest::setUpdatedAt));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterImageRequest, RegisterImageResponse> registerImage =
        genForRegisterImage();

    private static HttpRequestDef<RegisterImageRequest, RegisterImageResponse> genForRegisterImage() {
        // basic
        HttpRequestDef.Builder<RegisterImageRequest, RegisterImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RegisterImageRequest.class, RegisterImageResponse.class)
                .withName("RegisterImage")
                .withUri("/v1/cloudimages/{image_id}/upload")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterImageRequest::getImageId, RegisterImageRequest::setImageId));
        builder.<RegisterImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterImageRequestBody.class),
            f -> f.withMarshaller(RegisterImageRequest::getBody, RegisterImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageMemberRequest, ShowImageMemberResponse> showImageMember =
        genForShowImageMember();

    private static HttpRequestDef<ShowImageMemberRequest, ShowImageMemberResponse> genForShowImageMember() {
        // basic
        HttpRequestDef.Builder<ShowImageMemberRequest, ShowImageMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageMemberRequest.class, ShowImageMemberResponse.class)
                .withName("ShowImageMember")
                .withUri("/v1/{project_id}/cloudimages/{image_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageMemberRequest::getImageId, ShowImageMemberRequest::setImageId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageMemberRequest::getMemberId, ShowImageMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageQuotaRequest, ShowImageQuotaResponse> showImageQuota =
        genForShowImageQuota();

    private static HttpRequestDef<ShowImageQuotaRequest, ShowImageQuotaResponse> genForShowImageQuota() {
        // basic
        HttpRequestDef.Builder<ShowImageQuotaRequest, ShowImageQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageQuotaRequest.class, ShowImageQuotaResponse.class)
                .withName("ShowImageQuota")
                .withUri("/v1/cloudimages/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgress =
        genForShowJobProgress();

    private static HttpRequestDef<ShowJobProgressRequest, ShowJobProgressResponse> genForShowJobProgress() {
        // basic
        HttpRequestDef.Builder<ShowJobProgressRequest, ShowJobProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobProgressRequest.class, ShowJobProgressResponse.class)
                .withName("ShowJobProgress")
                .withUri("/v1/cloudimages/job/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobProgressRequest::getJobId, ShowJobProgressRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateImageRequest, UpdateImageResponse> updateImage = genForUpdateImage();

    private static HttpRequestDef<UpdateImageRequest, UpdateImageResponse> genForUpdateImage() {
        // basic
        HttpRequestDef.Builder<UpdateImageRequest, UpdateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateImageRequest.class, UpdateImageResponse.class)
                .withName("UpdateImage")
                .withUri("/v2/cloudimages/{image_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageRequest::getImageId, UpdateImageRequest::setImageId));
        builder.<List<UpdateImageRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateImageRequest::getBody, UpdateImageRequest::setBody)
                .withInnerContainerType(UpdateImageRequestBody.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionsRequest, ListVersionsResponse> listVersions = genForListVersions();

    private static HttpRequestDef<ListVersionsRequest, ListVersionsResponse> genForListVersions() {
        // basic
        HttpRequestDef.Builder<ListVersionsRequest, ListVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionsRequest.class, ListVersionsResponse.class)
                .withName("ListVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForShowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForShowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withName("ShowVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionRequest::getVersion, ShowVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> glanceAddImageMember =
        genForGlanceAddImageMember();

    private static HttpRequestDef<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> genForGlanceAddImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, GlanceAddImageMemberRequest.class, GlanceAddImageMemberResponse.class)
            .withName("GlanceAddImageMember")
            .withUri("/v2/images/{image_id}/members")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceAddImageMemberRequest::getImageId, GlanceAddImageMemberRequest::setImageId));
        builder.<GlanceAddImageMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GlanceAddImageMemberRequestBody.class),
            f -> f.withMarshaller(GlanceAddImageMemberRequest::getBody, GlanceAddImageMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> glanceCreateImageMetadata =
        genForGlanceCreateImageMetadata();

    private static HttpRequestDef<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> genForGlanceCreateImageMetadata() {
        // basic
        HttpRequestDef.Builder<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    GlanceCreateImageMetadataRequest.class,
                    GlanceCreateImageMetadataResponse.class)
                .withName("GlanceCreateImageMetadata")
                .withUri("/v2/images")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GlanceCreateImageMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GlanceCreateImageMetadataRequestBody.class),
            f -> f.withMarshaller(GlanceCreateImageMetadataRequest::getBody,
                GlanceCreateImageMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceCreateTagRequest, GlanceCreateTagResponse> glanceCreateTag =
        genForGlanceCreateTag();

    private static HttpRequestDef<GlanceCreateTagRequest, GlanceCreateTagResponse> genForGlanceCreateTag() {
        // basic
        HttpRequestDef.Builder<GlanceCreateTagRequest, GlanceCreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, GlanceCreateTagRequest.class, GlanceCreateTagResponse.class)
                .withName("GlanceCreateTag")
                .withUri("/v2/images/{image_id}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceCreateTagRequest::getImageId, GlanceCreateTagRequest::setImageId));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceCreateTagRequest::getTag, GlanceCreateTagRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceDeleteImageRequest, GlanceDeleteImageResponse> glanceDeleteImage =
        genForGlanceDeleteImage();

    private static HttpRequestDef<GlanceDeleteImageRequest, GlanceDeleteImageResponse> genForGlanceDeleteImage() {
        // basic
        HttpRequestDef.Builder<GlanceDeleteImageRequest, GlanceDeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, GlanceDeleteImageRequest.class, GlanceDeleteImageResponse.class)
                .withName("GlanceDeleteImage")
                .withUri("/v2/images/{image_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceDeleteImageRequest::getImageId, GlanceDeleteImageRequest::setImageId));
        builder.<GlanceDeleteImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceDeleteImageRequestBody.class),
            f -> f.withMarshaller(GlanceDeleteImageRequest::getBody, GlanceDeleteImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> glanceDeleteImageMember =
        genForGlanceDeleteImageMember();

    private static HttpRequestDef<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> genForGlanceDeleteImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, GlanceDeleteImageMemberRequest.class, GlanceDeleteImageMemberResponse.class)
            .withName("GlanceDeleteImageMember")
            .withUri("/v2/images/{image_id}/members/{member_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceDeleteImageMemberRequest::getImageId,
                GlanceDeleteImageMemberRequest::setImageId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceDeleteImageMemberRequest::getMemberId,
                GlanceDeleteImageMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceDeleteTagRequest, GlanceDeleteTagResponse> glanceDeleteTag =
        genForGlanceDeleteTag();

    private static HttpRequestDef<GlanceDeleteTagRequest, GlanceDeleteTagResponse> genForGlanceDeleteTag() {
        // basic
        HttpRequestDef.Builder<GlanceDeleteTagRequest, GlanceDeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, GlanceDeleteTagRequest.class, GlanceDeleteTagResponse.class)
                .withName("GlanceDeleteTag")
                .withUri("/v2/images/{image_id}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceDeleteTagRequest::getImageId, GlanceDeleteTagRequest::setImageId));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceDeleteTagRequest::getTag, GlanceDeleteTagRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemas =
        genForGlanceListImageMemberSchemas();

    private static HttpRequestDef<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> genForGlanceListImageMemberSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GlanceListImageMemberSchemasRequest.class,
                    GlanceListImageMemberSchemasResponse.class)
                .withName("GlanceListImageMemberSchemas")
                .withUri("/v2/schemas/members")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceListImageMembersRequest, GlanceListImageMembersResponse> glanceListImageMembers =
        genForGlanceListImageMembers();

    private static HttpRequestDef<GlanceListImageMembersRequest, GlanceListImageMembersResponse> genForGlanceListImageMembers() {
        // basic
        HttpRequestDef.Builder<GlanceListImageMembersRequest, GlanceListImageMembersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GlanceListImageMembersRequest.class, GlanceListImageMembersResponse.class)
            .withName("GlanceListImageMembers")
            .withUri("/v2/images/{image_id}/members")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImageMembersRequest::getImageId,
                GlanceListImageMembersRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> glanceListImageSchemas =
        genForGlanceListImageSchemas();

    private static HttpRequestDef<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> genForGlanceListImageSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GlanceListImageSchemasRequest.class, GlanceListImageSchemasResponse.class)
            .withName("GlanceListImageSchemas")
            .withUri("/v2/schemas/images")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceListImagesRequest, GlanceListImagesResponse> glanceListImages =
        genForGlanceListImages();

    private static HttpRequestDef<GlanceListImagesRequest, GlanceListImagesResponse> genForGlanceListImages() {
        // basic
        HttpRequestDef.Builder<GlanceListImagesRequest, GlanceListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceListImagesRequest.class, GlanceListImagesResponse.class)
                .withName("GlanceListImages")
                .withUri("/v2/images")
                .withContentType("application/json");

        // requests
        builder.<GlanceListImagesRequest.ImagetypeEnum>withRequestField("__imagetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceListImagesRequest.ImagetypeEnum.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getImagetype, GlanceListImagesRequest::setImagetype));
        builder.<Boolean>withRequestField("__isregistered",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getIsregistered, GlanceListImagesRequest::setIsregistered));
        builder.<GlanceListImagesRequest.OsBitEnum>withRequestField("__os_bit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceListImagesRequest.OsBitEnum.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getOsBit, GlanceListImagesRequest::setOsBit));
        builder.<GlanceListImagesRequest.OsTypeEnum>withRequestField("__os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceListImagesRequest.OsTypeEnum.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getOsType, GlanceListImagesRequest::setOsType));
        builder.<GlanceListImagesRequest.PlatformEnum>withRequestField("__platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceListImagesRequest.PlatformEnum.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getPlatform, GlanceListImagesRequest::setPlatform));
        builder.<String>withRequestField("__support_diskintensive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportDiskintensive,
                GlanceListImagesRequest::setSupportDiskintensive));
        builder.<String>withRequestField("__support_highperformance",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportHighperformance,
                GlanceListImagesRequest::setSupportHighperformance));
        builder.<String>withRequestField("__support_kvm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportKvm, GlanceListImagesRequest::setSupportKvm));
        builder.<String>withRequestField("__support_kvm_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportKvmGpuType,
                GlanceListImagesRequest::setSupportKvmGpuType));
        builder.<String>withRequestField("__support_kvm_infiniband",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportKvmInfiniband,
                GlanceListImagesRequest::setSupportKvmInfiniband));
        builder.<String>withRequestField("__support_largememory",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportLargememory,
                GlanceListImagesRequest::setSupportLargememory));
        builder.<String>withRequestField("__support_xen",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportXen, GlanceListImagesRequest::setSupportXen));
        builder.<String>withRequestField("__support_xen_gpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportXenGpuType,
                GlanceListImagesRequest::setSupportXenGpuType));
        builder.<String>withRequestField("__support_xen_hana",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSupportXenHana,
                GlanceListImagesRequest::setSupportXenHana));
        builder.<String>withRequestField("container_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getContainerFormat,
                GlanceListImagesRequest::setContainerFormat));
        builder.<GlanceListImagesRequest.DiskFormatEnum>withRequestField("disk_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceListImagesRequest.DiskFormatEnum.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getDiskFormat, GlanceListImagesRequest::setDiskFormat));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getId, GlanceListImagesRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getLimit, GlanceListImagesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getMarker, GlanceListImagesRequest::setMarker));
        builder.<String>withRequestField("member_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getMemberStatus, GlanceListImagesRequest::setMemberStatus));
        builder.<Integer>withRequestField("min_disk",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getMinDisk, GlanceListImagesRequest::setMinDisk));
        builder.<Integer>withRequestField("min_ram",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getMinRam, GlanceListImagesRequest::setMinRam));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getName, GlanceListImagesRequest::setName));
        builder.<String>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getOwner, GlanceListImagesRequest::setOwner));
        builder.<Boolean>withRequestField("protected",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getProtected, GlanceListImagesRequest::setProtected));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSortDir, GlanceListImagesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getSortKey, GlanceListImagesRequest::setSortKey));
        builder.<GlanceListImagesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceListImagesRequest.StatusEnum.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getStatus, GlanceListImagesRequest::setStatus));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getTag, GlanceListImagesRequest::setTag));
        builder.<GlanceListImagesRequest.VisibilityEnum>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GlanceListImagesRequest.VisibilityEnum.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getVisibility, GlanceListImagesRequest::setVisibility));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getCreatedAt, GlanceListImagesRequest::setCreatedAt));
        builder.<String>withRequestField("updated_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceListImagesRequest::getUpdatedAt, GlanceListImagesRequest::setUpdatedAt));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceShowImageRequest, GlanceShowImageResponse> glanceShowImage =
        genForGlanceShowImage();

    private static HttpRequestDef<GlanceShowImageRequest, GlanceShowImageResponse> genForGlanceShowImage() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageRequest, GlanceShowImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceShowImageRequest.class, GlanceShowImageResponse.class)
                .withName("GlanceShowImage")
                .withUri("/v2/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceShowImageRequest::getImageId, GlanceShowImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> glanceShowImageMember =
        genForGlanceShowImageMember();

    private static HttpRequestDef<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> genForGlanceShowImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GlanceShowImageMemberRequest.class, GlanceShowImageMemberResponse.class)
            .withName("GlanceShowImageMember")
            .withUri("/v2/images/{image_id}/members/{member_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceShowImageMemberRequest::getImageId, GlanceShowImageMemberRequest::setImageId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceShowImageMemberRequest::getMemberId,
                GlanceShowImageMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemas =
        genForGlanceShowImageMemberSchemas();

    private static HttpRequestDef<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> genForGlanceShowImageMemberSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GlanceShowImageMemberSchemasRequest.class,
                    GlanceShowImageMemberSchemasResponse.class)
                .withName("GlanceShowImageMemberSchemas")
                .withUri("/v2/schemas/member")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> glanceShowImageSchemas =
        genForGlanceShowImageSchemas();

    private static HttpRequestDef<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> genForGlanceShowImageSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GlanceShowImageSchemasRequest.class, GlanceShowImageSchemasResponse.class)
            .withName("GlanceShowImageSchemas")
            .withUri("/v2/schemas/image")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceUpdateImageRequest, GlanceUpdateImageResponse> glanceUpdateImage =
        genForGlanceUpdateImage();

    private static HttpRequestDef<GlanceUpdateImageRequest, GlanceUpdateImageResponse> genForGlanceUpdateImage() {
        // basic
        HttpRequestDef.Builder<GlanceUpdateImageRequest, GlanceUpdateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, GlanceUpdateImageRequest.class, GlanceUpdateImageResponse.class)
                .withName("GlanceUpdateImage")
                .withUri("/v2/images/{image_id}")
                .withContentType("application/openstack-images-v2.1-json-patch");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceUpdateImageRequest::getImageId, GlanceUpdateImageRequest::setImageId));
        builder.<List<GlanceUpdateImageRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(GlanceUpdateImageRequest::getBody, GlanceUpdateImageRequest::setBody)
                .withInnerContainerType(GlanceUpdateImageRequestBody.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> glanceUpdateImageMember =
        genForGlanceUpdateImageMember();

    private static HttpRequestDef<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> genForGlanceUpdateImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, GlanceUpdateImageMemberRequest.class, GlanceUpdateImageMemberResponse.class)
            .withName("GlanceUpdateImageMember")
            .withUri("/v2/images/{image_id}/members/{member_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceUpdateImageMemberRequest::getImageId,
                GlanceUpdateImageMemberRequest::setImageId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GlanceUpdateImageMemberRequest::getMemberId,
                GlanceUpdateImageMemberRequest::setMemberId));
        builder.<GlanceUpdateImageMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GlanceUpdateImageMemberRequestBody.class),
            f -> f.withMarshaller(GlanceUpdateImageMemberRequest::getBody, GlanceUpdateImageMemberRequest::setBody));

        // response

        return builder.build();
    }

}

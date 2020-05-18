package com.huaweicloud.sdk.ims.v2;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.ims.v2.model.*;

@SuppressWarnings("unchecked")
public class ImsMeta {

    public static final HttpRequestDef<BatchAddMembersRequest, BatchAddMembersResponse> batchAddMembers = genForbatchAddMembers();

    private static HttpRequestDef<BatchAddMembersRequest, BatchAddMembersResponse> genForbatchAddMembers() {
        // basic
        HttpRequestDef.Builder<BatchAddMembersRequest, BatchAddMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddMembersRequest.class, BatchAddMembersResponse.class)
                .withUri("/v1/cloudimages/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchAddMembersRequestBody.class,
                f -> f.withMarshaller(BatchAddMembersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembers = genForbatchDeleteMembers();

    private static HttpRequestDef<BatchDeleteMembersRequest, BatchDeleteMembersResponse> genForbatchDeleteMembers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMembersRequest, BatchDeleteMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteMembersRequest.class, BatchDeleteMembersResponse.class)
                .withUri("/v1/cloudimages/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchAddMembersRequestBody.class,
                f -> f.withMarshaller(BatchDeleteMembersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembers = genForbatchUpdateMembers();

    private static HttpRequestDef<BatchUpdateMembersRequest, BatchUpdateMembersResponse> genForbatchUpdateMembers() {
        // basic
        HttpRequestDef.Builder<BatchUpdateMembersRequest, BatchUpdateMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateMembersRequest.class, BatchUpdateMembersResponse.class)
                .withUri("/v1/cloudimages/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchUpdateMembersRequestBody.class,
                f -> f.withMarshaller(BatchUpdateMembersRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> copyImageCrossRegion = genForcopyImageCrossRegion();

    private static HttpRequestDef<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> genForcopyImageCrossRegion() {
        // basic
        HttpRequestDef.Builder<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyImageCrossRegionRequest.class, CopyImageCrossRegionResponse.class)
                .withUri("/v1/cloudimages/{image_id}/cross_region_copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CopyImageCrossRegionRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CopyImageCrossRegionRequestBody.class,
                f -> f.withMarshaller(CopyImageCrossRegionRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CopyImageInRegionRequest, CopyImageInRegionResponse> copyImageInRegion = genForcopyImageInRegion();

    private static HttpRequestDef<CopyImageInRegionRequest, CopyImageInRegionResponse> genForcopyImageInRegion() {
        // basic
        HttpRequestDef.Builder<CopyImageInRegionRequest, CopyImageInRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyImageInRegionRequest.class, CopyImageInRegionResponse.class)
                .withUri("/v1/cloudimages/{image_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CopyImageInRegionRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CopyImageInRegionRequestBody.class,
                f -> f.withMarshaller(CopyImageInRegionRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateDataImageRequest, CreateDataImageResponse> createDataImage = genForcreateDataImage();

    private static HttpRequestDef<CreateDataImageRequest, CreateDataImageResponse> genForcreateDataImage() {
        // basic
        HttpRequestDef.Builder<CreateDataImageRequest, CreateDataImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataImageRequest.class, CreateDataImageResponse.class)
                .withUri("/v1/cloudimages/dataimages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateDataImageRequestBody.class,
                f -> f.withMarshaller(CreateDataImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForcreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForcreateImage() {
        // basic
        HttpRequestDef.Builder<CreateImageRequest, CreateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageRequest.class, CreateImageResponse.class)
                .withUri("/v2/cloudimages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateImageRequestBody.class,
                f -> f.withMarshaller(CreateImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> createOrUpdateTags = genForcreateOrUpdateTags();

    private static HttpRequestDef<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> genForcreateOrUpdateTags() {
        // basic
        HttpRequestDef.Builder<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateOrUpdateTagsRequest.class, CreateOrUpdateTagsResponse.class)
                .withUri("/v1/cloudimages/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                AddOrUpdateTagsRequestBody.class,
                f -> f.withMarshaller(CreateOrUpdateTagsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateWholeImageRequest, CreateWholeImageResponse> createWholeImage = genForcreateWholeImage();

    private static HttpRequestDef<CreateWholeImageRequest, CreateWholeImageResponse> genForcreateWholeImage() {
        // basic
        HttpRequestDef.Builder<CreateWholeImageRequest, CreateWholeImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWholeImageRequest.class, CreateWholeImageResponse.class)
                .withUri("/v1/cloudimages/wholeimages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateWholeImageRequestBody.class,
                f -> f.withMarshaller(CreateWholeImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ExportImageRequest, ExportImageResponse> exportImage = genForexportImage();

    private static HttpRequestDef<ExportImageRequest, ExportImageResponse> genForexportImage() {
        // basic
        HttpRequestDef.Builder<ExportImageRequest, ExportImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportImageRequest.class, ExportImageResponse.class)
                .withUri("/v1/cloudimages/{image_id}/file")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ExportImageRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                ExportImageRequestBody.class,
                f -> f.withMarshaller(ExportImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ImportImageQuickRequest, ImportImageQuickResponse> importImageQuick = genForimportImageQuick();

    private static HttpRequestDef<ImportImageQuickRequest, ImportImageQuickResponse> genForimportImageQuick() {
        // basic
        HttpRequestDef.Builder<ImportImageQuickRequest, ImportImageQuickResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportImageQuickRequest.class, ImportImageQuickResponse.class)
                .withUri("/v2/cloudimages/quickimport/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                QuickImportImageByFileRequestBody.class,
                f -> f.withMarshaller(ImportImageQuickRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForlistImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForlistImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withUri("/v2/cloudimages");

        // requests
        builder.withRequestField("__imagetype",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.ImagetypeEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getImagetype, (req, v) -> {
                    req.setImagetype(v);
                })
        );
        builder.withRequestField("__isregistered",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.IsregisteredEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getIsregistered, (req, v) -> {
                    req.setIsregistered(v);
                })
        );
        builder.withRequestField("__os_bit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.OsBitEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getOsBit, (req, v) -> {
                    req.setOsBit(v);
                })
        );
        builder.withRequestField("__os_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.OsTypeEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getOsType, (req, v) -> {
                    req.setOsType(v);
                })
        );
        builder.withRequestField("__platform",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.PlatformEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getPlatform, (req, v) -> {
                    req.setPlatform(v);
                })
        );
        builder.withRequestField("__support_diskintensive",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportDiskintensive, (req, v) -> {
                    req.setSupportDiskintensive(v);
                })
        );
        builder.withRequestField("__support_highperformance",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportHighperformance, (req, v) -> {
                    req.setSupportHighperformance(v);
                })
        );
        builder.withRequestField("__support_kvm",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportKvm, (req, v) -> {
                    req.setSupportKvm(v);
                })
        );
        builder.withRequestField("__support_kvm_gpu_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportKvmGpuType, (req, v) -> {
                    req.setSupportKvmGpuType(v);
                })
        );
        builder.withRequestField("__support_kvm_infiniband",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportKvmInfiniband, (req, v) -> {
                    req.setSupportKvmInfiniband(v);
                })
        );
        builder.withRequestField("__support_largememory",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportLargememory, (req, v) -> {
                    req.setSupportLargememory(v);
                })
        );
        builder.withRequestField("__support_xen",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportXen, (req, v) -> {
                    req.setSupportXen(v);
                })
        );
        builder.withRequestField("__support_xen_gpu_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportXenGpuType, (req, v) -> {
                    req.setSupportXenGpuType(v);
                })
        );
        builder.withRequestField("__support_xen_hana",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getSupportXenHana, (req, v) -> {
                    req.setSupportXenHana(v);
                })
        );
        builder.withRequestField("container_format",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getContainerFormat, (req, v) -> {
                    req.setContainerFormat(v);
                })
        );
        builder.withRequestField("disk_format",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.DiskFormatEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getDiskFormat, (req, v) -> {
                    req.setDiskFormat(v);
                })
        );
        builder.withRequestField("enterprise_project_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getEnterpriseProjectId, (req, v) -> {
                    req.setEnterpriseProjectId(v);
                })
        );
        builder.withRequestField("id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getId, (req, v) -> {
                    req.setId(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListImagesRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("marker",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getMarker, (req, v) -> {
                    req.setMarker(v);
                })
        );
        builder.withRequestField("member_status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.MemberStatusEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getMemberStatus, (req, v) -> {
                    req.setMemberStatus(v);
                })
        );
        builder.withRequestField("min_disk",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListImagesRequest::getMinDisk, (req, v) -> {
                    req.setMinDisk(v);
                })
        );
        builder.withRequestField("min_ram",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListImagesRequest::getMinRam, (req, v) -> {
                    req.setMinRam(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("owner",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getOwner, (req, v) -> {
                    req.setOwner(v);
                })
        );
        builder.withRequestField("protected",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Boolean.class,
                f -> f.withMarshaller(ListImagesRequest::getProtected, (req, v) -> {
                    req.setProtected(v);
                })
        );
        builder.withRequestField("sort_dir",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.SortDirEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getSortDir, (req, v) -> {
                    req.setSortDir(v);
                })
        );
        builder.withRequestField("sort_key",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.SortKeyEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getSortKey, (req, v) -> {
                    req.setSortKey(v);
                })
        );
        builder.withRequestField("status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.StatusEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getStatus, (req, v) -> {
                    req.setStatus(v);
                })
        );
        builder.withRequestField("tag",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getTag, (req, v) -> {
                    req.setTag(v);
                })
        );
        builder.withRequestField("virtual_env_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.VirtualEnvTypeEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getVirtualEnvType, (req, v) -> {
                    req.setVirtualEnvType(v);
                })
        );
        builder.withRequestField("visibility",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.VisibilityEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getVisibility, (req, v) -> {
                    req.setVisibility(v);
                })
        );
        builder.withRequestField("flavor_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getFlavorId, (req, v) -> {
                    req.setFlavorId(v);
                })
        );
        builder.withRequestField("created_at",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getCreatedAt, (req, v) -> {
                    req.setCreatedAt(v);
                })
        );
        builder.withRequestField("updated_at",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getUpdatedAt, (req, v) -> {
                    req.setUpdatedAt(v);
                })
        );
        builder.withRequestField("architecture",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListImagesRequest.ArchitectureEnum.class,
                f -> f.withMarshaller(ListImagesRequest::getArchitecture, (req, v) -> {
                    req.setArchitecture(v);
                })
        );
        builder.withRequestField("X-Sdk-Date",
                LocationType.Header,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListImagesRequest::getXSdkDate, (req, v) -> {
                    req.setXSdkDate(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListOsVersionsRequest, ListOsVersionsResponse> listOsVersions = genForlistOsVersions();

    private static HttpRequestDef<ListOsVersionsRequest, ListOsVersionsResponse> genForlistOsVersions() {
        // basic
        HttpRequestDef.Builder<ListOsVersionsRequest, ListOsVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOsVersionsRequest.class, ListOsVersionsResponse.class)
                .withUri("/v1/cloudimages/os_version");

        // requests
        builder.withRequestField("tag",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListOsVersionsRequest::getTag, (req, v) -> {
                    req.setTag(v);
                })
        );

        // response
        builder.withResponseField(
                "body",
                LocationType.Body,
                FieldExistence.NULL_IGNORE,
                List.class,
                f -> f.withMarshaller(ListOsVersionsResponse::getBody, (response, data)->{
                    response.setBody(data);
                }).withInnerContainerType(ListOsVersionsResponseBody.class)
        );

        return builder.build();

    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withUri("/v1/cloudimages/tags");

        // requests
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListTagsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("page",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListTagsRequest::getPage, (req, v) -> {
                    req.setPage(v);
                })
        );
        builder.withRequestField("__imagetype",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListTagsRequest.ImagetypeEnum.class,
                f -> f.withMarshaller(ListTagsRequest::getImagetype, (req, v) -> {
                    req.setImagetype(v);
                })
        );
        builder.withRequestField("id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTagsRequest::getId, (req, v) -> {
                    req.setId(v);
                })
        );
        builder.withRequestField("status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListTagsRequest.StatusEnum.class,
                f -> f.withMarshaller(ListTagsRequest::getStatus, (req, v) -> {
                    req.setStatus(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTagsRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("min_disk",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListTagsRequest::getMinDisk, (req, v) -> {
                    req.setMinDisk(v);
                })
        );
        builder.withRequestField("__platform",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTagsRequest::getPlatform, (req, v) -> {
                    req.setPlatform(v);
                })
        );
        builder.withRequestField("__os_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListTagsRequest.OsTypeEnum.class,
                f -> f.withMarshaller(ListTagsRequest::getOsType, (req, v) -> {
                    req.setOsType(v);
                })
        );
        builder.withRequestField("member_status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListTagsRequest.MemberStatusEnum.class,
                f -> f.withMarshaller(ListTagsRequest::getMemberStatus, (req, v) -> {
                    req.setMemberStatus(v);
                })
        );
        builder.withRequestField("virtual_env_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListTagsRequest.VirtualEnvTypeEnum.class,
                f -> f.withMarshaller(ListTagsRequest::getVirtualEnvType, (req, v) -> {
                    req.setVirtualEnvType(v);
                })
        );
        builder.withRequestField("enterprise_project_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTagsRequest::getEnterpriseProjectId, (req, v) -> {
                    req.setEnterpriseProjectId(v);
                })
        );
        builder.withRequestField("architecture",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListTagsRequest.ArchitectureEnum.class,
                f -> f.withMarshaller(ListTagsRequest::getArchitecture, (req, v) -> {
                    req.setArchitecture(v);
                })
        );
        builder.withRequestField("created_at",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTagsRequest::getCreatedAt, (req, v) -> {
                    req.setCreatedAt(v);
                })
        );
        builder.withRequestField("updated_at",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTagsRequest::getUpdatedAt, (req, v) -> {
                    req.setUpdatedAt(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RegisterImageRequest, RegisterImageResponse> registerImage = genForregisterImage();

    private static HttpRequestDef<RegisterImageRequest, RegisterImageResponse> genForregisterImage() {
        // basic
        HttpRequestDef.Builder<RegisterImageRequest, RegisterImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RegisterImageRequest.class, RegisterImageResponse.class)
                .withUri("/v1/cloudimages/{image_id}/upload")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RegisterImageRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                RegisterImageRequestBody.class,
                f -> f.withMarshaller(RegisterImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowImageQuotaRequest, ShowImageQuotaResponse> showImageQuota = genForshowImageQuota();

    private static HttpRequestDef<ShowImageQuotaRequest, ShowImageQuotaResponse> genForshowImageQuota() {
        // basic
        HttpRequestDef.Builder<ShowImageQuotaRequest, ShowImageQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageQuotaRequest.class, ShowImageQuotaResponse.class)
                .withUri("/v1/cloudimages/quota");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateImageRequest, UpdateImageResponse> updateImage = genForupdateImage();

    private static HttpRequestDef<UpdateImageRequest, UpdateImageResponse> genForupdateImage() {
        // basic
        HttpRequestDef.Builder<UpdateImageRequest, UpdateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateImageRequest.class, UpdateImageResponse.class)
                .withUri("/v2/cloudimages/{image_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateImageRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                List.class,
                f -> f.withMarshaller(UpdateImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                }).withInnerContainerType(UpdateImageRequestBody.class)
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_id}");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowJobRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("job_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                    req.setJobId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> glanceAddImageMember = genForglanceAddImageMember();

    private static HttpRequestDef<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> genForglanceAddImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GlanceAddImageMemberRequest.class, GlanceAddImageMemberResponse.class)
                .withUri("/v2/images/{image_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceAddImageMemberRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                GlanceAddImageMemberRequestBody.class,
                f -> f.withMarshaller(GlanceAddImageMemberRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> glanceCreateImageMetadata = genForglanceCreateImageMetadata();

    private static HttpRequestDef<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> genForglanceCreateImageMetadata() {
        // basic
        HttpRequestDef.Builder<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GlanceCreateImageMetadataRequest.class, GlanceCreateImageMetadataResponse.class)
                .withUri("/v2/images")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                GlanceCreateImageMetadataRequestBody.class,
                f -> f.withMarshaller(GlanceCreateImageMetadataRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceCreateTagRequest, GlanceCreateTagResponse> glanceCreateTag = genForglanceCreateTag();

    private static HttpRequestDef<GlanceCreateTagRequest, GlanceCreateTagResponse> genForglanceCreateTag() {
        // basic
        HttpRequestDef.Builder<GlanceCreateTagRequest, GlanceCreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, GlanceCreateTagRequest.class, GlanceCreateTagResponse.class)
                .withUri("/v2/images/{image_id}/tags/{tag}");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceCreateTagRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("tag",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceCreateTagRequest::getTag, (req, v) -> {
                    req.setTag(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceDeleteImageRequest, GlanceDeleteImageResponse> glanceDeleteImage = genForglanceDeleteImage();

    private static HttpRequestDef<GlanceDeleteImageRequest, GlanceDeleteImageResponse> genForglanceDeleteImage() {
        // basic
        HttpRequestDef.Builder<GlanceDeleteImageRequest, GlanceDeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, GlanceDeleteImageRequest.class, GlanceDeleteImageResponse.class)
                .withUri("/v2/images/{image_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceDeleteImageRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                GlanceDeleteImageRequestBody.class,
                f -> f.withMarshaller(GlanceDeleteImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> glanceDeleteImageMember = genForglanceDeleteImageMember();

    private static HttpRequestDef<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> genForglanceDeleteImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, GlanceDeleteImageMemberRequest.class, GlanceDeleteImageMemberResponse.class)
                .withUri("/v2/images/{image_id}/members/{member_id}");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceDeleteImageMemberRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("member_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceDeleteImageMemberRequest::getMemberId, (req, v) -> {
                    req.setMemberId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceDeleteTagRequest, GlanceDeleteTagResponse> glanceDeleteTag = genForglanceDeleteTag();

    private static HttpRequestDef<GlanceDeleteTagRequest, GlanceDeleteTagResponse> genForglanceDeleteTag() {
        // basic
        HttpRequestDef.Builder<GlanceDeleteTagRequest, GlanceDeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, GlanceDeleteTagRequest.class, GlanceDeleteTagResponse.class)
                .withUri("/v2/images/{image_id}/tags/{tag}");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceDeleteTagRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("tag",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceDeleteTagRequest::getTag, (req, v) -> {
                    req.setTag(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemas = genForglanceListImageMemberSchemas();

    private static HttpRequestDef<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> genForglanceListImageMemberSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceListImageMemberSchemasRequest.class, GlanceListImageMemberSchemasResponse.class)
                .withUri("/v2/schemas/members");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceListImageMembersRequest, GlanceListImageMembersResponse> glanceListImageMembers = genForglanceListImageMembers();

    private static HttpRequestDef<GlanceListImageMembersRequest, GlanceListImageMembersResponse> genForglanceListImageMembers() {
        // basic
        HttpRequestDef.Builder<GlanceListImageMembersRequest, GlanceListImageMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceListImageMembersRequest.class, GlanceListImageMembersResponse.class)
                .withUri("/v2/images/{image_id}/members");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceListImageMembersRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> glanceListImageSchemas = genForglanceListImageSchemas();

    private static HttpRequestDef<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> genForglanceListImageSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceListImageSchemasRequest.class, GlanceListImageSchemasResponse.class)
                .withUri("/v2/schemas/images");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceListImagesRequest, GlanceListImagesResponse> glanceListImages = genForglanceListImages();

    private static HttpRequestDef<GlanceListImagesRequest, GlanceListImagesResponse> genForglanceListImages() {
        // basic
        HttpRequestDef.Builder<GlanceListImagesRequest, GlanceListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceListImagesRequest.class, GlanceListImagesResponse.class)
                .withUri("/v2/images");

        // requests
        builder.withRequestField("__imagetype",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                GlanceListImagesRequest.ImagetypeEnum.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getImagetype, (req, v) -> {
                    req.setImagetype(v);
                })
        );
        builder.withRequestField("__isregistered",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Boolean.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getIsregistered, (req, v) -> {
                    req.setIsregistered(v);
                })
        );
        builder.withRequestField("__os_bit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                GlanceListImagesRequest.OsBitEnum.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getOsBit, (req, v) -> {
                    req.setOsBit(v);
                })
        );
        builder.withRequestField("__os_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                GlanceListImagesRequest.OsTypeEnum.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getOsType, (req, v) -> {
                    req.setOsType(v);
                })
        );
        builder.withRequestField("__platform",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                GlanceListImagesRequest.PlatformEnum.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getPlatform, (req, v) -> {
                    req.setPlatform(v);
                })
        );
        builder.withRequestField("__support_diskintensive",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportDiskintensive, (req, v) -> {
                    req.setSupportDiskintensive(v);
                })
        );
        builder.withRequestField("__support_highperformance",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportHighperformance, (req, v) -> {
                    req.setSupportHighperformance(v);
                })
        );
        builder.withRequestField("__support_kvm",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportKvm, (req, v) -> {
                    req.setSupportKvm(v);
                })
        );
        builder.withRequestField("__support_kvm_gpu_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportKvmGpuType, (req, v) -> {
                    req.setSupportKvmGpuType(v);
                })
        );
        builder.withRequestField("__support_kvm_infiniband",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportKvmInfiniband, (req, v) -> {
                    req.setSupportKvmInfiniband(v);
                })
        );
        builder.withRequestField("__support_largememory",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportLargememory, (req, v) -> {
                    req.setSupportLargememory(v);
                })
        );
        builder.withRequestField("__support_xen",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportXen, (req, v) -> {
                    req.setSupportXen(v);
                })
        );
        builder.withRequestField("__support_xen_gpu_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportXenGpuType, (req, v) -> {
                    req.setSupportXenGpuType(v);
                })
        );
        builder.withRequestField("__support_xen_hana",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSupportXenHana, (req, v) -> {
                    req.setSupportXenHana(v);
                })
        );
        builder.withRequestField("container_format",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getContainerFormat, (req, v) -> {
                    req.setContainerFormat(v);
                })
        );
        builder.withRequestField("disk_format",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                GlanceListImagesRequest.DiskFormatEnum.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getDiskFormat, (req, v) -> {
                    req.setDiskFormat(v);
                })
        );
        builder.withRequestField("id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getId, (req, v) -> {
                    req.setId(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("marker",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getMarker, (req, v) -> {
                    req.setMarker(v);
                })
        );
        builder.withRequestField("member_status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getMemberStatus, (req, v) -> {
                    req.setMemberStatus(v);
                })
        );
        builder.withRequestField("min_disk",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getMinDisk, (req, v) -> {
                    req.setMinDisk(v);
                })
        );
        builder.withRequestField("min_ram",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getMinRam, (req, v) -> {
                    req.setMinRam(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("owner",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getOwner, (req, v) -> {
                    req.setOwner(v);
                })
        );
        builder.withRequestField("protected",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Boolean.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getProtected, (req, v) -> {
                    req.setProtected(v);
                })
        );
        builder.withRequestField("sort_dir",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSortDir, (req, v) -> {
                    req.setSortDir(v);
                })
        );
        builder.withRequestField("sort_key",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getSortKey, (req, v) -> {
                    req.setSortKey(v);
                })
        );
        builder.withRequestField("status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                GlanceListImagesRequest.StatusEnum.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getStatus, (req, v) -> {
                    req.setStatus(v);
                })
        );
        builder.withRequestField("tag",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getTag, (req, v) -> {
                    req.setTag(v);
                })
        );
        builder.withRequestField("visibility",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                GlanceListImagesRequest.VisibilityEnum.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getVisibility, (req, v) -> {
                    req.setVisibility(v);
                })
        );
        builder.withRequestField("created_at",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getCreatedAt, (req, v) -> {
                    req.setCreatedAt(v);
                })
        );
        builder.withRequestField("updated_at",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(GlanceListImagesRequest::getUpdatedAt, (req, v) -> {
                    req.setUpdatedAt(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceShowImageRequest, GlanceShowImageResponse> glanceShowImage = genForglanceShowImage();

    private static HttpRequestDef<GlanceShowImageRequest, GlanceShowImageResponse> genForglanceShowImage() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageRequest, GlanceShowImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceShowImageRequest.class, GlanceShowImageResponse.class)
                .withUri("/v2/images/{image_id}");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceShowImageRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> glanceShowImageMember = genForglanceShowImageMember();

    private static HttpRequestDef<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> genForglanceShowImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceShowImageMemberRequest.class, GlanceShowImageMemberResponse.class)
                .withUri("/v2/images/{image_id}/members/{member_id}");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceShowImageMemberRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("member_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceShowImageMemberRequest::getMemberId, (req, v) -> {
                    req.setMemberId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemas = genForglanceShowImageMemberSchemas();

    private static HttpRequestDef<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> genForglanceShowImageMemberSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceShowImageMemberSchemasRequest.class, GlanceShowImageMemberSchemasResponse.class)
                .withUri("/v2/schemas/member");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> glanceShowImageSchemas = genForglanceShowImageSchemas();

    private static HttpRequestDef<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> genForglanceShowImageSchemas() {
        // basic
        HttpRequestDef.Builder<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GlanceShowImageSchemasRequest.class, GlanceShowImageSchemasResponse.class)
                .withUri("/v2/schemas/image");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceUpdateImageRequest, GlanceUpdateImageResponse> glanceUpdateImage = genForglanceUpdateImage();

    private static HttpRequestDef<GlanceUpdateImageRequest, GlanceUpdateImageResponse> genForglanceUpdateImage() {
        // basic
        HttpRequestDef.Builder<GlanceUpdateImageRequest, GlanceUpdateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, GlanceUpdateImageRequest.class, GlanceUpdateImageResponse.class)
                .withUri("/v2/images/{image_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceUpdateImageRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                List.class,
                f -> f.withMarshaller(GlanceUpdateImageRequest::getBody, (req, v) -> {
                    req.setBody(v);
                }).withInnerContainerType(GlanceUpdateImageRequestBody.class)
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> glanceUpdateImageMember = genForglanceUpdateImageMember();

    private static HttpRequestDef<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> genForglanceUpdateImageMember() {
        // basic
        HttpRequestDef.Builder<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, GlanceUpdateImageMemberRequest.class, GlanceUpdateImageMemberResponse.class)
                .withUri("/v2/images/{image_id}/members/{member_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("image_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceUpdateImageMemberRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("member_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(GlanceUpdateImageMemberRequest::getMemberId, (req, v) -> {
                    req.setMemberId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                GlanceUpdateImageMemberRequestBody.class,
                f -> f.withMarshaller(GlanceUpdateImageMemberRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

}


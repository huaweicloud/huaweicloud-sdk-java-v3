package com.huaweicloud.sdk.vod.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vod.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class VodMeta {

    public static final HttpRequestDef<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTask = genForcancelAssetTranscodeTask();

    private static HttpRequestDef<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> genForcancelAssetTranscodeTask() {
        // basic
        HttpRequestDef.Builder<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelAssetTranscodeTaskRequest.class, CancelAssetTranscodeTaskResponse.class)
                .withName("CancelAssetTranscodeTask")
                .withUri("/v1.0/{project_id}/asset/process")
                .withContentType("application/json");

        // requests
        builder.withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelAssetTranscodeTaskRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTask = genForcancelExtractAudioTask();

    private static HttpRequestDef<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> genForcancelExtractAudioTask() {
        // basic
        HttpRequestDef.Builder<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelExtractAudioTaskRequest.class, CancelExtractAudioTaskResponse.class)
                .withName("CancelExtractAudioTask")
                .withUri("/v1.0/{project_id}/asset/extract_audio")
                .withContentType("application/json");

        // requests
        builder.withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelExtractAudioTaskRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5Duplication = genForcheckMd5Duplication();

    private static HttpRequestDef<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> genForcheckMd5Duplication() {
        // basic
        HttpRequestDef.Builder<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckMd5DuplicationRequest.class, CheckMd5DuplicationResponse.class)
                .withName("CheckMd5Duplication")
                .withUri("/v1.0/{project_id}/asset/duplication")
                .withContentType("application/json");

        // requests
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );
        builder.withRequestField("md5",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getMd5, (req, v) -> {
                req.setMd5(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUpload = genForconfirmAssetUpload();

    private static HttpRequestDef<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> genForconfirmAssetUpload() {
        // basic
        HttpRequestDef.Builder<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmAssetUploadRequest.class, ConfirmAssetUploadResponse.class)
                .withName("ConfirmAssetUpload")
                .withUri("/v1.0/{project_id}/asset/status/uploaded")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConfirmAssetUploadReq.class,
            f -> f.withMarshaller(ConfirmAssetUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUpload = genForconfirmImageUpload();

    private static HttpRequestDef<ConfirmImageUploadRequest, ConfirmImageUploadResponse> genForconfirmImageUpload() {
        // basic
        HttpRequestDef.Builder<ConfirmImageUploadRequest, ConfirmImageUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmImageUploadRequest.class, ConfirmImageUploadResponse.class)
                .withName("ConfirmImageUpload")
                .withUri("/v1.0/{project_id}/watermark/status/uploaded")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConfirmImageUploadReq.class,
            f -> f.withMarshaller(ConfirmImageUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUpload = genForcreateAssetByFileUpload();

    private static HttpRequestDef<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> genForcreateAssetByFileUpload() {
        // basic
        HttpRequestDef.Builder<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetByFileUploadRequest.class, CreateAssetByFileUploadResponse.class)
                .withName("CreateAssetByFileUpload")
                .withUri("/v1.0/{project_id}/asset")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAssetByFileUploadReq.class,
            f -> f.withMarshaller(CreateAssetByFileUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategory = genForcreateAssetCategory();

    private static HttpRequestDef<CreateAssetCategoryRequest, CreateAssetCategoryResponse> genForcreateAssetCategory() {
        // basic
        HttpRequestDef.Builder<CreateAssetCategoryRequest, CreateAssetCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetCategoryRequest.class, CreateAssetCategoryResponse.class)
                .withName("CreateAssetCategory")
                .withUri("/v1.0/{project_id}/asset/category")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCategoryReq.class,
            f -> f.withMarshaller(CreateAssetCategoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTask = genForcreateAssetProcessTask();

    private static HttpRequestDef<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> genForcreateAssetProcessTask() {
        // basic
        HttpRequestDef.Builder<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetProcessTaskRequest.class, CreateAssetProcessTaskResponse.class)
                .withName("CreateAssetProcessTask")
                .withUri("/v1.0/{project_id}/asset/process")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            AssetProcessReq.class,
            f -> f.withMarshaller(CreateAssetProcessTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTask = genForcreateAssetReviewTask();

    private static HttpRequestDef<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> genForcreateAssetReviewTask() {
        // basic
        HttpRequestDef.Builder<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetReviewTaskRequest.class, CreateAssetReviewTaskResponse.class)
                .withName("CreateAssetReviewTask")
                .withUri("/v1.0/{project_id}/asset/review")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AssetReviewReq.class,
            f -> f.withMarshaller(CreateAssetReviewTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTask = genForcreateExtractAudioTask();

    private static HttpRequestDef<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> genForcreateExtractAudioTask() {
        // basic
        HttpRequestDef.Builder<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateExtractAudioTaskRequest.class, CreateExtractAudioTaskResponse.class)
                .withName("CreateExtractAudioTask")
                .withUri("/v1.0/{project_id}/asset/extract_audio")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ExtractAudioTaskReq.class,
            f -> f.withMarshaller(CreateExtractAudioTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroup = genForcreateTemplateGroup();

    private static HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> genForcreateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<CreateTemplateGroupRequest, CreateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateGroupRequest.class, CreateTemplateGroupResponse.class)
                .withName("CreateTemplateGroup")
                .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TransTemplateGroup.class,
            f -> f.withMarshaller(CreateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplate = genForcreateWatermarkTemplate();

    private static HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> genForcreateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWatermarkTemplateRequest.class, CreateWatermarkTemplateResponse.class)
                .withName("CreateWatermarkTemplate")
                .withUri("/v1.0/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateWatermarkTemplateReq.class,
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategory = genFordeleteAssetCategory();

    private static HttpRequestDef<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> genFordeleteAssetCategory() {
        // basic
        HttpRequestDef.Builder<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetCategoryRequest.class, DeleteAssetCategoryResponse.class)
                .withName("DeleteAssetCategory")
                .withUri("/v1.0/{project_id}/asset/category")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteAssetCategoryRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetsRequest, DeleteAssetsResponse> deleteAssets = genFordeleteAssets();

    private static HttpRequestDef<DeleteAssetsRequest, DeleteAssetsResponse> genFordeleteAssets() {
        // basic
        HttpRequestDef.Builder<DeleteAssetsRequest, DeleteAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetsRequest.class, DeleteAssetsResponse.class)
                .withName("DeleteAssets")
                .withUri("/v1.0/{project_id}/asset")
                .withContentType("application/json");

        // requests
        builder.withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DeleteAssetsRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroup = genFordeleteTemplateGroup();

    private static HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> genFordeleteTemplateGroup() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateGroupRequest.class, DeleteTemplateGroupResponse.class)
                .withName("DeleteTemplateGroup")
                .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplate = genFordeleteWatermarkTemplate();

    private static HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> genFordeleteWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWatermarkTemplateRequest.class, DeleteWatermarkTemplateResponse.class)
                .withName("DeleteWatermarkTemplate")
                .withUri("/v1.0/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategory = genForlistAssetCategory();

    private static HttpRequestDef<ListAssetCategoryRequest, ListAssetCategoryResponse> genForlistAssetCategory() {
        // basic
        HttpRequestDef.Builder<ListAssetCategoryRequest, ListAssetCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetCategoryRequest.class, ListAssetCategoryResponse.class)
                .withName("ListAssetCategory")
                .withUri("/v1.0/{project_id}/asset/category")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAssetCategoryRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListAssetCategoryResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(QueryCategoryRsp.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListAssetListRequest, ListAssetListResponse> listAssetList = genForlistAssetList();

    private static HttpRequestDef<ListAssetListRequest, ListAssetListResponse> genForlistAssetList() {
        // basic
        HttpRequestDef.Builder<ListAssetListRequest, ListAssetListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetListRequest.class, ListAssetListResponse.class)
                .withName("ListAssetList")
                .withUri("/v1.0/{project_id}/asset/list")
                .withContentType("application/json");

        // requests
        builder.withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListAssetListRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListAssetListRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetListRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAssetListRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            })
        );
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetListRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetListRequest::getQueryString, (req, v) -> {
                req.setQueryString(v);
            })
        );
        builder.withRequestField("media_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListAssetListRequest::getMediaType, (req, v) -> {
                req.setMediaType(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAssetListRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAssetListRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );
        builder.withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAssetListRequest.OrderEnum.class,
            f -> f.withMarshaller(ListAssetListRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroup = genForlistTemplateGroup();

    private static HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> genForlistTemplateGroup() {
        // basic
        HttpRequestDef.Builder<ListTemplateGroupRequest, ListTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateGroupRequest.class, ListTemplateGroupResponse.class)
                .withName("ListTemplateGroup")
                .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatistics = genForlistTopStatistics();

    private static HttpRequestDef<ListTopStatisticsRequest, ListTopStatisticsResponse> genForlistTopStatistics() {
        // basic
        HttpRequestDef.Builder<ListTopStatisticsRequest, ListTopStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopStatisticsRequest.class, ListTopStatisticsResponse.class)
                .withName("ListTopStatistics")
                .withUri("/v1.0/{project_id}/asset/top-statistics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTopStatisticsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTopStatisticsRequest::getDate, (req, v) -> {
                req.setDate(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplate = genForlistWatermarkTemplate();

    private static HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> genForlistWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWatermarkTemplateRequest.class, ListWatermarkTemplateResponse.class)
                .withName("ListWatermarkTemplate")
                .withUri("/v1.0/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObs = genForpublishAssetFromObs();

    private static HttpRequestDef<PublishAssetFromObsRequest, PublishAssetFromObsResponse> genForpublishAssetFromObs() {
        // basic
        HttpRequestDef.Builder<PublishAssetFromObsRequest, PublishAssetFromObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAssetFromObsRequest.class, PublishAssetFromObsResponse.class)
                .withName("PublishAssetFromObs")
                .withUri("/v1.0/{project_id}/asset/reproduction")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PublishAssetFromObsReq.class,
            f -> f.withMarshaller(PublishAssetFromObsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<PublishAssetsRequest, PublishAssetsResponse> publishAssets = genForpublishAssets();

    private static HttpRequestDef<PublishAssetsRequest, PublishAssetsResponse> genForpublishAssets() {
        // basic
        HttpRequestDef.Builder<PublishAssetsRequest, PublishAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAssetsRequest.class, PublishAssetsResponse.class)
                .withName("PublishAssets")
                .withUri("/v1.0/{project_id}/asset/status/publish")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PublishAssetReq.class,
            f -> f.withMarshaller(PublishAssetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetail = genForshowAssetDetail();

    private static HttpRequestDef<ShowAssetDetailRequest, ShowAssetDetailResponse> genForshowAssetDetail() {
        // basic
        HttpRequestDef.Builder<ShowAssetDetailRequest, ShowAssetDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetDetailRequest.class, ShowAssetDetailResponse.class)
                .withName("ShowAssetDetail")
                .withUri("/v1.0/{project_id}/asset/details")
                .withContentType("application/json");

        // requests
        builder.withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAssetDetailRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            })
        );
        builder.withRequestField("categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowAssetDetailRequest::getCategories, (req, v) -> {
                req.setCategories(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMeta = genForshowAssetMeta();

    private static HttpRequestDef<ShowAssetMetaRequest, ShowAssetMetaResponse> genForshowAssetMeta() {
        // basic
        HttpRequestDef.Builder<ShowAssetMetaRequest, ShowAssetMetaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetMetaRequest.class, ShowAssetMetaResponse.class)
                .withName("ShowAssetMeta")
                .withUri("/v1.0/{project_id}/asset/info")
                .withContentType("application/json");

        // requests
        builder.withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("transcodeStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getTranscodeStatus, (req, v) -> {
                req.setTranscodeStatus(v);
            })
        );
        builder.withRequestField("assetStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getAssetStatus, (req, v) -> {
                req.setAssetStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            })
        );
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getQueryString, (req, v) -> {
                req.setQueryString(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAssetMetaRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthority = genForshowAssetTempAuthority();

    private static HttpRequestDef<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> genForshowAssetTempAuthority() {
        // basic
        HttpRequestDef.Builder<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetTempAuthorityRequest.class, ShowAssetTempAuthorityResponse.class)
                .withName("ShowAssetTempAuthority")
                .withUri("/v1.1/{project_id}/asset/authority")
                .withContentType("application/json");

        // requests
        builder.withRequestField("http_verb",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getHttpVerb, (req, v) -> {
                req.setHttpVerb(v);
            })
        );
        builder.withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getBucket, (req, v) -> {
                req.setBucket(v);
            })
        );
        builder.withRequestField("object_key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getObjectKey, (req, v) -> {
                req.setObjectKey(v);
            })
        );
        builder.withRequestField("content_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getContentType, (req, v) -> {
                req.setContentType(v);
            })
        );
        builder.withRequestField("content_md5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getContentMd5, (req, v) -> {
                req.setContentMd5(v);
            })
        );
        builder.withRequestField("upload_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getUploadId, (req, v) -> {
                req.setUploadId(v);
            })
        );
        builder.withRequestField("part_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getPartNumber, (req, v) -> {
                req.setPartNumber(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatistics = genForshowCdnStatistics();

    private static HttpRequestDef<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> genForshowCdnStatistics() {
        // basic
        HttpRequestDef.Builder<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCdnStatisticsRequest.class, ShowCdnStatisticsResponse.class)
                .withName("ShowCdnStatistics")
                .withUri("/v1.0/{project_id}/asset/cdn-statistics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            })
        );
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatistics = genForshowVodStatistics();

    private static HttpRequestDef<ShowVodStatisticsRequest, ShowVodStatisticsResponse> genForshowVodStatistics() {
        // basic
        HttpRequestDef.Builder<ShowVodStatisticsRequest, ShowVodStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVodStatisticsRequest.class, ShowVodStatisticsResponse.class)
                .withName("ShowVodStatistics")
                .withUri("/v1.0/{project_id}/asset/vod-statistics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVodStatisticsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVodStatisticsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowVodStatisticsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssets = genForunpublishAssets();

    private static HttpRequestDef<UnpublishAssetsRequest, UnpublishAssetsResponse> genForunpublishAssets() {
        // basic
        HttpRequestDef.Builder<UnpublishAssetsRequest, UnpublishAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnpublishAssetsRequest.class, UnpublishAssetsResponse.class)
                .withName("UnpublishAssets")
                .withUri("/v1.0/{project_id}/asset/status/unpublish")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PublishAssetReq.class,
            f -> f.withMarshaller(UnpublishAssetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetRequest, UpdateAssetResponse> updateAsset = genForupdateAsset();

    private static HttpRequestDef<UpdateAssetRequest, UpdateAssetResponse> genForupdateAsset() {
        // basic
        HttpRequestDef.Builder<UpdateAssetRequest, UpdateAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetRequest.class, UpdateAssetResponse.class)
                .withName("UpdateAsset")
                .withUri("/v1.0/{project_id}/asset")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UploadAssetReq.class,
            f -> f.withMarshaller(UpdateAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategory = genForupdateAssetCategory();

    private static HttpRequestDef<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> genForupdateAssetCategory() {
        // basic
        HttpRequestDef.Builder<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetCategoryRequest.class, UpdateAssetCategoryResponse.class)
                .withName("UpdateAssetCategory")
                .withUri("/v1.0/{project_id}/asset/category")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateCategoryReq.class,
            f -> f.withMarshaller(UpdateAssetCategoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMeta = genForupdateAssetMeta();

    private static HttpRequestDef<UpdateAssetMetaRequest, UpdateAssetMetaResponse> genForupdateAssetMeta() {
        // basic
        HttpRequestDef.Builder<UpdateAssetMetaRequest, UpdateAssetMetaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetMetaRequest.class, UpdateAssetMetaResponse.class)
                .withName("UpdateAssetMeta")
                .withUri("/v1.0/{project_id}/asset/info")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateAssetMetaReq.class,
            f -> f.withMarshaller(UpdateAssetMetaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorized = genForupdateBucketAuthorized();

    private static HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> genForupdateBucketAuthorized() {
        // basic
        HttpRequestDef.Builder<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBucketAuthorizedRequest.class, UpdateBucketAuthorizedResponse.class)
                .withName("UpdateBucketAuthorized")
                .withUri("/v1.0/{project_id}/asset/authority")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateBucketAuthorizedReq.class,
            f -> f.withMarshaller(UpdateBucketAuthorizedRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnail = genForupdateCoverByThumbnail();

    private static HttpRequestDef<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> genForupdateCoverByThumbnail() {
        // basic
        HttpRequestDef.Builder<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCoverByThumbnailRequest.class, UpdateCoverByThumbnailResponse.class)
                .withName("UpdateCoverByThumbnail")
                .withUri("/v1.0/{project_id}/asset/cover")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateCoverByThumbnailReq.class,
            f -> f.withMarshaller(UpdateCoverByThumbnailRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroup = genForupdateTemplateGroup();

    private static HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> genForupdateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateGroupRequest.class, UpdateTemplateGroupResponse.class)
                .withName("UpdateTemplateGroup")
                .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyTransTemplateGroup.class,
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplate = genForupdateWatermarkTemplate();

    private static HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> genForupdateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWatermarkTemplateRequest.class, UpdateWatermarkTemplateResponse.class)
                .withName("UpdateWatermarkTemplate")
                .withUri("/v1.0/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateWatermarkTemplateReq.class,
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrl = genForuploadMetaDataByUrl();

    private static HttpRequestDef<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> genForuploadMetaDataByUrl() {
        // basic
        HttpRequestDef.Builder<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadMetaDataByUrlRequest.class, UploadMetaDataByUrlResponse.class)
                .withName("UploadMetaDataByUrl")
                .withUri("/v1.0/{project_id}/asset/upload_by_url")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UploadMetaDataByUrlReq.class,
            f -> f.withMarshaller(UploadMetaDataByUrlRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAsset = genForcreatePreheatingAsset();

    private static HttpRequestDef<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> genForcreatePreheatingAsset() {
        // basic
        HttpRequestDef.Builder<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePreheatingAssetRequest.class, CreatePreheatingAssetResponse.class)
                .withName("CreatePreheatingAsset")
                .withUri("/v1.0/{project_id}/asset/preheating")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePreheatingAssetReq.class,
            f -> f.withMarshaller(CreatePreheatingAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAsset = genForshowPreheatingAsset();

    private static HttpRequestDef<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> genForshowPreheatingAsset() {
        // basic
        HttpRequestDef.Builder<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPreheatingAssetRequest.class, ShowPreheatingAssetResponse.class)
                .withName("ShowPreheatingAsset")
                .withUri("/v1.0/{project_id}/asset/preheating")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPreheatingAssetRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipher = genForshowAssetCipher();

    private static HttpRequestDef<ShowAssetCipherRequest, ShowAssetCipherResponse> genForshowAssetCipher() {
        // basic
        HttpRequestDef.Builder<ShowAssetCipherRequest, ShowAssetCipherResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetCipherRequest.class, ShowAssetCipherResponse.class)
                .withName("ShowAssetCipher")
                .withUri("/v1.0/{project_id}/asset/ciphers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAssetCipherRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTask = genForcreateTakeOverTask();

    private static HttpRequestDef<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> genForcreateTakeOverTask() {
        // basic
        HttpRequestDef.Builder<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTakeOverTaskRequest.class, CreateTakeOverTaskResponse.class)
                .withName("CreateTakeOverTask")
                .withUri("/v1.0/{project_id}/asset/obs/host/stock/task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTakeOverTaskReq.class,
            f -> f.withMarshaller(CreateTakeOverTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTask = genForlistTakeOverTask();

    private static HttpRequestDef<ListTakeOverTaskRequest, ListTakeOverTaskResponse> genForlistTakeOverTask() {
        // basic
        HttpRequestDef.Builder<ListTakeOverTaskRequest, ListTakeOverTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTakeOverTaskRequest.class, ListTakeOverTaskResponse.class)
                .withName("ListTakeOverTask")
                .withUri("/v1.0/{project_id}/asset/obs/host/stock/task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTakeOverTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTakeOverTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTakeOverTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTakeOverTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetails = genForshowTakeOverAssetDetails();

    private static HttpRequestDef<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> genForshowTakeOverAssetDetails() {
        // basic
        HttpRequestDef.Builder<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTakeOverAssetDetailsRequest.class, ShowTakeOverAssetDetailsResponse.class)
                .withName("ShowTakeOverAssetDetails")
                .withUri("/v1.0/{project_id}/asset/obs/host/task/details")
                .withContentType("application/json");

        // requests
        builder.withRequestField("source_bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getSourceBucket, (req, v) -> {
                req.setSourceBucket(v);
            })
        );
        builder.withRequestField("source_object",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getSourceObject, (req, v) -> {
                req.setSourceObject(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetails = genForshowTakeOverTaskDetails();

    private static HttpRequestDef<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> genForshowTakeOverTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTakeOverTaskDetailsRequest.class, ShowTakeOverTaskDetailsResponse.class)
                .withName("ShowTakeOverTaskDetails")
                .withUri("/v1.0/{project_id}/asset/obs/host/stock/task/details")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response
        


        return builder.build();
    }

}

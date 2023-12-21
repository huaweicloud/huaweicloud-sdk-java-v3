package com.huaweicloud.sdk.vod.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vod.v1.model.AssetProcessReq;
import com.huaweicloud.sdk.vod.v1.model.AssetReviewReq;
import com.huaweicloud.sdk.vod.v1.model.CancelAssetTranscodeTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CancelAssetTranscodeTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CancelExtractAudioTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CancelExtractAudioTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CheckMd5DuplicationRequest;
import com.huaweicloud.sdk.vod.v1.model.CheckMd5DuplicationResponse;
import com.huaweicloud.sdk.vod.v1.model.ConfirmAssetUploadReq;
import com.huaweicloud.sdk.vod.v1.model.ConfirmAssetUploadRequest;
import com.huaweicloud.sdk.vod.v1.model.ConfirmAssetUploadResponse;
import com.huaweicloud.sdk.vod.v1.model.ConfirmImageUploadReq;
import com.huaweicloud.sdk.vod.v1.model.ConfirmImageUploadRequest;
import com.huaweicloud.sdk.vod.v1.model.ConfirmImageUploadResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetByFileUploadReq;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetByFileUploadRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetByFileUploadResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetProcessTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetProcessTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetReviewTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetReviewTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateCategoryReq;
import com.huaweicloud.sdk.vod.v1.model.CreateExtractAudioTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateExtractAudioTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetReq;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTakeOverTaskReq;
import com.huaweicloud.sdk.vod.v1.model.CreateTakeOverTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTakeOverTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTranscodeTemplate;
import com.huaweicloud.sdk.vod.v1.model.CreateTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateReq;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.ExtractAudioTaskReq;
import com.huaweicloud.sdk.vod.v1.model.ListAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.ListAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.ListAssetDailySummaryLogRequest;
import com.huaweicloud.sdk.vod.v1.model.ListAssetDailySummaryLogResponse;
import com.huaweicloud.sdk.vod.v1.model.ListAssetListRequest;
import com.huaweicloud.sdk.vod.v1.model.ListAssetListResponse;
import com.huaweicloud.sdk.vod.v1.model.ListDomainLogsRequest;
import com.huaweicloud.sdk.vod.v1.model.ListDomainLogsResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTakeOverTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTakeOverTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTopStatisticsRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTopStatisticsResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.ListWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.ListWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.ModifySubtitleRequest;
import com.huaweicloud.sdk.vod.v1.model.ModifySubtitleResponse;
import com.huaweicloud.sdk.vod.v1.model.ModifyTemplateGroupCollection;
import com.huaweicloud.sdk.vod.v1.model.ModifyTransTemplate;
import com.huaweicloud.sdk.vod.v1.model.ModifyTransTemplateGroup;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsReq;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsRequest;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsResponse;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetReq;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.QueryCategoryRsp;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetCipherRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetCipherResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetDetailRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetDetailResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetMetaRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetMetaResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetTempAuthorityRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetTempAuthorityResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowCdnStatisticsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowCdnStatisticsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowPreheatingAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowPreheatingAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverAssetDetailsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverAssetDetailsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverTaskDetailsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverTaskDetailsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowVodRetrievalRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowVodRetrievalResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowVodStatisticsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowVodStatisticsResponse;
import com.huaweicloud.sdk.vod.v1.model.SubtitleModifyReq;
import com.huaweicloud.sdk.vod.v1.model.TransTemplateGroup;
import com.huaweicloud.sdk.vod.v1.model.TransTemplateGroupCollection;
import com.huaweicloud.sdk.vod.v1.model.UnpublishAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.UnpublishAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetMetaReq;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetMetaRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetMetaResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateBucketAuthorizedReq;
import com.huaweicloud.sdk.vod.v1.model.UpdateBucketAuthorizedRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateBucketAuthorizedResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateCategoryReq;
import com.huaweicloud.sdk.vod.v1.model.UpdateCoverByThumbnailReq;
import com.huaweicloud.sdk.vod.v1.model.UpdateCoverByThumbnailRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateCoverByThumbnailResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeReq;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateWatermarkTemplateReq;
import com.huaweicloud.sdk.vod.v1.model.UpdateWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.UploadAssetReq;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlReq;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlRequest;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class VodMeta {

    public static final HttpRequestDef<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTask =
        genForcancelAssetTranscodeTask();

    private static HttpRequestDef<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> genForcancelAssetTranscodeTask() {
        // basic
        HttpRequestDef.Builder<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    CancelAssetTranscodeTaskRequest.class,
                    CancelAssetTranscodeTaskResponse.class)
                .withName("CancelAssetTranscodeTask")
                .withUri("/v1.0/{project_id}/asset/process")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAssetTranscodeTaskRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAssetTranscodeTaskRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTask =
        genForcancelExtractAudioTask();

    private static HttpRequestDef<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> genForcancelExtractAudioTask() {
        // basic
        HttpRequestDef.Builder<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, CancelExtractAudioTaskRequest.class, CancelExtractAudioTaskResponse.class)
            .withName("CancelExtractAudioTask")
            .withUri("/v1.0/{project_id}/asset/extract_audio")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelExtractAudioTaskRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelExtractAudioTaskRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5Duplication =
        genForcheckMd5Duplication();

    private static HttpRequestDef<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> genForcheckMd5Duplication() {
        // basic
        HttpRequestDef.Builder<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckMd5DuplicationRequest.class, CheckMd5DuplicationResponse.class)
                .withName("CheckMd5Duplication")
                .withUri("/v1.0/{project_id}/asset/duplication")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("md5",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getMd5, (req, v) -> {
                req.setMd5(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUpload =
        genForconfirmAssetUpload();

    private static HttpRequestDef<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> genForconfirmAssetUpload() {
        // basic
        HttpRequestDef.Builder<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmAssetUploadRequest.class, ConfirmAssetUploadResponse.class)
                .withName("ConfirmAssetUpload")
                .withUri("/v1.0/{project_id}/asset/status/uploaded")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmAssetUploadRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ConfirmAssetUploadReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmAssetUploadReq.class),
            f -> f.withMarshaller(ConfirmAssetUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUpload =
        genForconfirmImageUpload();

    private static HttpRequestDef<ConfirmImageUploadRequest, ConfirmImageUploadResponse> genForconfirmImageUpload() {
        // basic
        HttpRequestDef.Builder<ConfirmImageUploadRequest, ConfirmImageUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmImageUploadRequest.class, ConfirmImageUploadResponse.class)
                .withName("ConfirmImageUpload")
                .withUri("/v1.0/{project_id}/watermark/status/uploaded")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmImageUploadRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ConfirmImageUploadReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmImageUploadReq.class),
            f -> f.withMarshaller(ConfirmImageUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUpload =
        genForcreateAssetByFileUpload();

    private static HttpRequestDef<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> genForcreateAssetByFileUpload() {
        // basic
        HttpRequestDef.Builder<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAssetByFileUploadRequest.class, CreateAssetByFileUploadResponse.class)
            .withName("CreateAssetByFileUpload")
            .withUri("/v1.0/{project_id}/asset")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetByFileUploadRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<CreateAssetByFileUploadReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAssetByFileUploadReq.class),
            f -> f.withMarshaller(CreateAssetByFileUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategory =
        genForcreateAssetCategory();

    private static HttpRequestDef<CreateAssetCategoryRequest, CreateAssetCategoryResponse> genForcreateAssetCategory() {
        // basic
        HttpRequestDef.Builder<CreateAssetCategoryRequest, CreateAssetCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetCategoryRequest.class, CreateAssetCategoryResponse.class)
                .withName("CreateAssetCategory")
                .withUri("/v1.0/{project_id}/asset/category")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetCategoryRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<CreateCategoryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCategoryReq.class),
            f -> f.withMarshaller(CreateAssetCategoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTask =
        genForcreateAssetProcessTask();

    private static HttpRequestDef<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> genForcreateAssetProcessTask() {
        // basic
        HttpRequestDef.Builder<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAssetProcessTaskRequest.class, CreateAssetProcessTaskResponse.class)
            .withName("CreateAssetProcessTask")
            .withUri("/v1.0/{project_id}/asset/process")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetProcessTaskRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<AssetProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AssetProcessReq.class),
            f -> f.withMarshaller(CreateAssetProcessTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTask =
        genForcreateAssetReviewTask();

    private static HttpRequestDef<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> genForcreateAssetReviewTask() {
        // basic
        HttpRequestDef.Builder<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAssetReviewTaskRequest.class, CreateAssetReviewTaskResponse.class)
            .withName("CreateAssetReviewTask")
            .withUri("/v1.0/{project_id}/asset/review")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetReviewTaskRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<AssetReviewReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetReviewReq.class),
            f -> f.withMarshaller(CreateAssetReviewTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTask =
        genForcreateExtractAudioTask();

    private static HttpRequestDef<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> genForcreateExtractAudioTask() {
        // basic
        HttpRequestDef.Builder<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateExtractAudioTaskRequest.class, CreateExtractAudioTaskResponse.class)
            .withName("CreateExtractAudioTask")
            .withUri("/v1.0/{project_id}/asset/extract_audio")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExtractAudioTaskRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ExtractAudioTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtractAudioTaskReq.class),
            f -> f.withMarshaller(CreateExtractAudioTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAsset =
        genForcreatePreheatingAsset();

    private static HttpRequestDef<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> genForcreatePreheatingAsset() {
        // basic
        HttpRequestDef.Builder<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePreheatingAssetRequest.class, CreatePreheatingAssetResponse.class)
            .withName("CreatePreheatingAsset")
            .withUri("/v1.0/{project_id}/asset/preheating")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePreheatingAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<CreatePreheatingAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePreheatingAssetReq.class),
            f -> f.withMarshaller(CreatePreheatingAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTask =
        genForcreateTakeOverTask();

    private static HttpRequestDef<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> genForcreateTakeOverTask() {
        // basic
        HttpRequestDef.Builder<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTakeOverTaskRequest.class, CreateTakeOverTaskResponse.class)
                .withName("CreateTakeOverTask")
                .withUri("/v1.0/{project_id}/asset/obs/host/stock/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTakeOverTaskRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<CreateTakeOverTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTakeOverTaskReq.class),
            f -> f.withMarshaller(CreateTakeOverTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroup =
        genForcreateTemplateGroup();

    private static HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> genForcreateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<CreateTemplateGroupRequest, CreateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateGroupRequest.class, CreateTemplateGroupResponse.class)
                .withName("CreateTemplateGroup")
                .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateGroupRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<TransTemplateGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransTemplateGroup.class),
            f -> f.withMarshaller(CreateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse> createTemplateGroupCollection =
        genForcreateTemplateGroupCollection();

    private static HttpRequestDef<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse> genForcreateTemplateGroupCollection() {
        // basic
        HttpRequestDef.Builder<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTemplateGroupCollectionRequest.class,
                    CreateTemplateGroupCollectionResponse.class)
                .withName("CreateTemplateGroupCollection")
                .withUri("/v1.0/{project_id}/asset/template-collection/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateGroupCollectionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<TransTemplateGroupCollection>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransTemplateGroupCollection.class),
            f -> f.withMarshaller(CreateTemplateGroupCollectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse> createTranscodeTemplate =
        genForcreateTranscodeTemplate();

    private static HttpRequestDef<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse> genForcreateTranscodeTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTranscodeTemplateRequest.class, CreateTranscodeTemplateResponse.class)
            .withName("CreateTranscodeTemplate")
            .withUri("/v2/{project_id}/asset/template/transcodings")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTranscodeTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<CreateTranscodeTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTranscodeTemplate.class),
            f -> f.withMarshaller(CreateTranscodeTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplate =
        genForcreateWatermarkTemplate();

    private static HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> genForcreateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWatermarkTemplateRequest.class, CreateWatermarkTemplateResponse.class)
            .withName("CreateWatermarkTemplate")
            .withUri("/v1.0/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<CreateWatermarkTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWatermarkTemplateReq.class),
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategory =
        genFordeleteAssetCategory();

    private static HttpRequestDef<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> genFordeleteAssetCategory() {
        // basic
        HttpRequestDef.Builder<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAssetCategoryRequest.class, DeleteAssetCategoryResponse.class)
            .withName("DeleteAssetCategory")
            .withUri("/v1.0/{project_id}/asset/category")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteAssetCategoryRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetCategoryRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

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
        builder.<List<String>>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAssetsRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("delete_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetsRequest::getDeleteType, (req, v) -> {
                req.setDeleteType(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroup =
        genFordeleteTemplateGroup();

    private static HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> genFordeleteTemplateGroup() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTemplateGroupRequest.class, DeleteTemplateGroupResponse.class)
            .withName("DeleteTemplateGroup")
            .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse> deleteTemplateGroupCollection =
        genFordeleteTemplateGroupCollection();

    private static HttpRequestDef<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse> genFordeleteTemplateGroupCollection() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTemplateGroupCollectionRequest.class,
                    DeleteTemplateGroupCollectionResponse.class)
                .withName("DeleteTemplateGroupCollection")
                .withUri("/v1.0/{project_id}/asset/template-collection/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_collection_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateGroupCollectionRequest::getGroupCollectionId, (req, v) -> {
                req.setGroupCollectionId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateGroupCollectionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse> deleteTranscodeTemplate =
        genFordeleteTranscodeTemplate();

    private static HttpRequestDef<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse> genFordeleteTranscodeTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTranscodeTemplateRequest.class, DeleteTranscodeTemplateResponse.class)
            .withName("DeleteTranscodeTemplate")
            .withUri("/v2/{project_id}/asset/template/transcodings")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodeTemplateRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodeTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplate =
        genFordeleteWatermarkTemplate();

    private static HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> genFordeleteWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWatermarkTemplateRequest.class, DeleteWatermarkTemplateResponse.class)
            .withName("DeleteWatermarkTemplate")
            .withUri("/v1.0/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategory =
        genForlistAssetCategory();

    private static HttpRequestDef<ListAssetCategoryRequest, ListAssetCategoryResponse> genForlistAssetCategory() {
        // basic
        HttpRequestDef.Builder<ListAssetCategoryRequest, ListAssetCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetCategoryRequest.class, ListAssetCategoryResponse.class)
                .withName("ListAssetCategory")
                .withUri("/v1.0/{project_id}/asset/category")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetCategoryRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetCategoryRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response
        builder.<List<QueryCategoryRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetCategoryResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(QueryCategoryRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse> listAssetDailySummaryLog =
        genForlistAssetDailySummaryLog();

    private static HttpRequestDef<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse> genForlistAssetDailySummaryLog() {
        // basic
        HttpRequestDef.Builder<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAssetDailySummaryLogRequest.class, ListAssetDailySummaryLogResponse.class)
                .withName("ListAssetDailySummaryLog")
                .withUri("/v1/{project_id}/asset/daily-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetListRequest, ListAssetListResponse> listAssetList =
        genForlistAssetList();

    private static HttpRequestDef<ListAssetListRequest, ListAssetListResponse> genForlistAssetList() {
        // basic
        HttpRequestDef.Builder<ListAssetListRequest, ListAssetListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetListRequest.class, ListAssetListResponse.class)
                .withName("ListAssetList")
                .withUri("/v1.0/{project_id}/asset/list")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetListRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<List<ListAssetListRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetListRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetListRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getQueryString, (req, v) -> {
                req.setQueryString(v);
            }));
        builder.<List<String>>withRequestField("media_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetListRequest::getMediaType, (req, v) -> {
                req.setMediaType(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetListRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetListRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<ListAssetListRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetListRequest.OrderEnum.class),
            f -> f.withMarshaller(ListAssetListRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainLogsRequest, ListDomainLogsResponse> listDomainLogs =
        genForlistDomainLogs();

    private static HttpRequestDef<ListDomainLogsRequest, ListDomainLogsResponse> genForlistDomainLogs() {
        // basic
        HttpRequestDef.Builder<ListDomainLogsRequest, ListDomainLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainLogsRequest.class, ListDomainLogsResponse.class)
                .withName("ListDomainLogs")
                .withUri("/v1.0/{project_id}/vod/cdn/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("query_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getQueryDate, (req, v) -> {
                req.setQueryDate(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getPageNumber, (req, v) -> {
                req.setPageNumber(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroup =
        genForlistTemplateGroup();

    private static HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> genForlistTemplateGroup() {
        // basic
        HttpRequestDef.Builder<ListTemplateGroupRequest, ListTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateGroupRequest.class, ListTemplateGroupResponse.class)
                .withName("ListTemplateGroup")
                .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse> listTemplateGroupCollection =
        genForlistTemplateGroupCollection();

    private static HttpRequestDef<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse> genForlistTemplateGroupCollection() {
        // basic
        HttpRequestDef.Builder<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTemplateGroupCollectionRequest.class,
                    ListTemplateGroupCollectionResponse.class)
                .withName("ListTemplateGroupCollection")
                .withUri("/v1.0/{project_id}/asset/template-collection/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_collection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getGroupCollectionId, (req, v) -> {
                req.setGroupCollectionId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatistics =
        genForlistTopStatistics();

    private static HttpRequestDef<ListTopStatisticsRequest, ListTopStatisticsResponse> genForlistTopStatistics() {
        // basic
        HttpRequestDef.Builder<ListTopStatisticsRequest, ListTopStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopStatisticsRequest.class, ListTopStatisticsResponse.class)
                .withName("ListTopStatistics")
                .withUri("/v1.0/{project_id}/asset/top-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopStatisticsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopStatisticsRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopStatisticsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse> listTranscodeTemplate =
        genForlistTranscodeTemplate();

    private static HttpRequestDef<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse> genForlistTranscodeTemplate() {
        // basic
        HttpRequestDef.Builder<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTranscodeTemplateRequest.class, ListTranscodeTemplateResponse.class)
            .withName("ListTranscodeTemplate")
            .withUri("/v2/{project_id}/asset/template/transcodings")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Boolean>withRequestField("is_default",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getIsDefault, (req, v) -> {
                req.setIsDefault(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getQueryString, (req, v) -> {
                req.setQueryString(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplate =
        genForlistWatermarkTemplate();

    private static HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> genForlistWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWatermarkTemplateRequest.class, ListWatermarkTemplateResponse.class)
            .withName("ListWatermarkTemplate")
            .withUri("/v1.0/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObs =
        genForpublishAssetFromObs();

    private static HttpRequestDef<PublishAssetFromObsRequest, PublishAssetFromObsResponse> genForpublishAssetFromObs() {
        // basic
        HttpRequestDef.Builder<PublishAssetFromObsRequest, PublishAssetFromObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAssetFromObsRequest.class, PublishAssetFromObsResponse.class)
                .withName("PublishAssetFromObs")
                .withUri("/v1.0/{project_id}/asset/reproduction")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAssetFromObsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<PublishAssetFromObsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetFromObsReq.class),
            f -> f.withMarshaller(PublishAssetFromObsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAssetsRequest, PublishAssetsResponse> publishAssets =
        genForpublishAssets();

    private static HttpRequestDef<PublishAssetsRequest, PublishAssetsResponse> genForpublishAssets() {
        // basic
        HttpRequestDef.Builder<PublishAssetsRequest, PublishAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAssetsRequest.class, PublishAssetsResponse.class)
                .withName("PublishAssets")
                .withUri("/v1.0/{project_id}/asset/status/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAssetsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<PublishAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetReq.class),
            f -> f.withMarshaller(PublishAssetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipher =
        genForshowAssetCipher();

    private static HttpRequestDef<ShowAssetCipherRequest, ShowAssetCipherResponse> genForshowAssetCipher() {
        // basic
        HttpRequestDef.Builder<ShowAssetCipherRequest, ShowAssetCipherResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetCipherRequest.class, ShowAssetCipherResponse.class)
                .withName("ShowAssetCipher")
                .withUri("/v1.0/{project_id}/asset/ciphers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetCipherRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetCipherRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetail =
        genForshowAssetDetail();

    private static HttpRequestDef<ShowAssetDetailRequest, ShowAssetDetailResponse> genForshowAssetDetail() {
        // basic
        HttpRequestDef.Builder<ShowAssetDetailRequest, ShowAssetDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetDetailRequest.class, ShowAssetDetailResponse.class)
                .withName("ShowAssetDetail")
                .withUri("/v1.0/{project_id}/asset/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetDetailRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<List<ShowAssetDetailRequest.CategoriesEnum>>withRequestField("categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetDetailRequest::getCategories, (req, v) -> {
                req.setCategories(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetDetailRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMeta =
        genForshowAssetMeta();

    private static HttpRequestDef<ShowAssetMetaRequest, ShowAssetMetaResponse> genForshowAssetMeta() {
        // basic
        HttpRequestDef.Builder<ShowAssetMetaRequest, ShowAssetMetaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetMetaRequest.class, ShowAssetMetaResponse.class)
                .withName("ShowAssetMeta")
                .withUri("/v1.0/{project_id}/asset/info")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<List<ShowAssetMetaRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<ShowAssetMetaRequest.TranscodeStatusEnum>>withRequestField("transcodeStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getTranscodeStatus, (req, v) -> {
                req.setTranscodeStatus(v);
            }));
        builder.<List<ShowAssetMetaRequest.AssetStatusEnum>>withRequestField("assetStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getAssetStatus, (req, v) -> {
                req.setAssetStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getCategoryId, (req, v) -> {
                req.setCategoryId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getQueryString, (req, v) -> {
                req.setQueryString(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthority =
        genForshowAssetTempAuthority();

    private static HttpRequestDef<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> genForshowAssetTempAuthority() {
        // basic
        HttpRequestDef.Builder<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAssetTempAuthorityRequest.class, ShowAssetTempAuthorityResponse.class)
            .withName("ShowAssetTempAuthority")
            .withUri("/v1.1/{project_id}/asset/authority")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("http_verb",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getHttpVerb, (req, v) -> {
                req.setHttpVerb(v);
            }));
        builder.<String>withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getBucket, (req, v) -> {
                req.setBucket(v);
            }));
        builder.<String>withRequestField("object_key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getObjectKey, (req, v) -> {
                req.setObjectKey(v);
            }));
        builder.<String>withRequestField("content_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getContentType, (req, v) -> {
                req.setContentType(v);
            }));
        builder.<String>withRequestField("content_md5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getContentMd5, (req, v) -> {
                req.setContentMd5(v);
            }));
        builder.<String>withRequestField("upload_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getUploadId, (req, v) -> {
                req.setUploadId(v);
            }));
        builder.<Integer>withRequestField("part_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getPartNumber, (req, v) -> {
                req.setPartNumber(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatistics =
        genForshowCdnStatistics();

    private static HttpRequestDef<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> genForshowCdnStatistics() {
        // basic
        HttpRequestDef.Builder<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCdnStatisticsRequest.class, ShowCdnStatisticsResponse.class)
                .withName("ShowCdnStatistics")
                .withUri("/v1.0/{project_id}/asset/cdn-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAsset =
        genForshowPreheatingAsset();

    private static HttpRequestDef<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> genForshowPreheatingAsset() {
        // basic
        HttpRequestDef.Builder<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPreheatingAssetRequest.class, ShowPreheatingAssetResponse.class)
                .withName("ShowPreheatingAsset")
                .withUri("/v1.0/{project_id}/asset/preheating")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreheatingAssetRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreheatingAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatistics =
        genForshowVodStatistics();

    private static HttpRequestDef<ShowVodStatisticsRequest, ShowVodStatisticsResponse> genForshowVodStatistics() {
        // basic
        HttpRequestDef.Builder<ShowVodStatisticsRequest, ShowVodStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVodStatisticsRequest.class, ShowVodStatisticsResponse.class)
                .withName("ShowVodStatistics")
                .withUri("/v1.0/{project_id}/asset/vod-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodStatisticsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodStatisticsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVodStatisticsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodStatisticsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssets =
        genForunpublishAssets();

    private static HttpRequestDef<UnpublishAssetsRequest, UnpublishAssetsResponse> genForunpublishAssets() {
        // basic
        HttpRequestDef.Builder<UnpublishAssetsRequest, UnpublishAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnpublishAssetsRequest.class, UnpublishAssetsResponse.class)
                .withName("UnpublishAssets")
                .withUri("/v1.0/{project_id}/asset/status/unpublish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnpublishAssetsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<PublishAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetReq.class),
            f -> f.withMarshaller(UnpublishAssetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<UploadAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAssetReq.class),
            f -> f.withMarshaller(UpdateAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategory =
        genForupdateAssetCategory();

    private static HttpRequestDef<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> genForupdateAssetCategory() {
        // basic
        HttpRequestDef.Builder<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetCategoryRequest.class, UpdateAssetCategoryResponse.class)
                .withName("UpdateAssetCategory")
                .withUri("/v1.0/{project_id}/asset/category")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetCategoryRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<UpdateCategoryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCategoryReq.class),
            f -> f.withMarshaller(UpdateAssetCategoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMeta =
        genForupdateAssetMeta();

    private static HttpRequestDef<UpdateAssetMetaRequest, UpdateAssetMetaResponse> genForupdateAssetMeta() {
        // basic
        HttpRequestDef.Builder<UpdateAssetMetaRequest, UpdateAssetMetaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetMetaRequest.class, UpdateAssetMetaResponse.class)
                .withName("UpdateAssetMeta")
                .withUri("/v1.0/{project_id}/asset/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetMetaRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<UpdateAssetMetaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAssetMetaReq.class),
            f -> f.withMarshaller(UpdateAssetMetaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorized =
        genForupdateBucketAuthorized();

    private static HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> genForupdateBucketAuthorized() {
        // basic
        HttpRequestDef.Builder<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBucketAuthorizedRequest.class, UpdateBucketAuthorizedResponse.class)
            .withName("UpdateBucketAuthorized")
            .withUri("/v1.0/{project_id}/asset/authority")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBucketAuthorizedRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<UpdateBucketAuthorizedReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBucketAuthorizedReq.class),
            f -> f.withMarshaller(UpdateBucketAuthorizedRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnail =
        genForupdateCoverByThumbnail();

    private static HttpRequestDef<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> genForupdateCoverByThumbnail() {
        // basic
        HttpRequestDef.Builder<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCoverByThumbnailRequest.class, UpdateCoverByThumbnailResponse.class)
            .withName("UpdateCoverByThumbnail")
            .withUri("/v1.0/{project_id}/asset/cover")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCoverByThumbnailRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<UpdateCoverByThumbnailReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCoverByThumbnailReq.class),
            f -> f.withMarshaller(UpdateCoverByThumbnailRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroup =
        genForupdateTemplateGroup();

    private static HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> genForupdateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateGroupRequest.class, UpdateTemplateGroupResponse.class)
                .withName("UpdateTemplateGroup")
                .withUri("/v1.0/{project_id}/asset/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ModifyTransTemplateGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTransTemplateGroup.class),
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse> updateTemplateGroupCollection =
        genForupdateTemplateGroupCollection();

    private static HttpRequestDef<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse> genForupdateTemplateGroupCollection() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTemplateGroupCollectionRequest.class,
                    UpdateTemplateGroupCollectionResponse.class)
                .withName("UpdateTemplateGroupCollection")
                .withUri("/v1.0/{project_id}/asset/template-collection/transcodings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateGroupCollectionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ModifyTemplateGroupCollection>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTemplateGroupCollection.class),
            f -> f.withMarshaller(UpdateTemplateGroupCollectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse> updateTranscodeTemplate =
        genForupdateTranscodeTemplate();

    private static HttpRequestDef<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse> genForupdateTranscodeTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTranscodeTemplateRequest.class, UpdateTranscodeTemplateResponse.class)
            .withName("UpdateTranscodeTemplate")
            .withUri("/v2/{project_id}/asset/template/transcodings")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTranscodeTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ModifyTransTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTransTemplate.class),
            f -> f.withMarshaller(UpdateTranscodeTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplate =
        genForupdateWatermarkTemplate();

    private static HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> genForupdateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWatermarkTemplateRequest.class, UpdateWatermarkTemplateResponse.class)
            .withName("UpdateWatermarkTemplate")
            .withUri("/v1.0/{project_id}/template/watermark")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<UpdateWatermarkTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateWatermarkTemplateReq.class),
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrl =
        genForuploadMetaDataByUrl();

    private static HttpRequestDef<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> genForuploadMetaDataByUrl() {
        // basic
        HttpRequestDef.Builder<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadMetaDataByUrlRequest.class, UploadMetaDataByUrlResponse.class)
                .withName("UploadMetaDataByUrl")
                .withUri("/v1.0/{project_id}/asset/upload_by_url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadMetaDataByUrlRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<UploadMetaDataByUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadMetaDataByUrlReq.class),
            f -> f.withMarshaller(UploadMetaDataByUrlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTask =
        genForlistTakeOverTask();

    private static HttpRequestDef<ListTakeOverTaskRequest, ListTakeOverTaskResponse> genForlistTakeOverTask() {
        // basic
        HttpRequestDef.Builder<ListTakeOverTaskRequest, ListTakeOverTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTakeOverTaskRequest.class, ListTakeOverTaskResponse.class)
                .withName("ListTakeOverTask")
                .withUri("/v1.0/{project_id}/asset/obs/host/stock/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetails =
        genForshowTakeOverAssetDetails();

    private static HttpRequestDef<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> genForshowTakeOverAssetDetails() {
        // basic
        HttpRequestDef.Builder<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowTakeOverAssetDetailsRequest.class, ShowTakeOverAssetDetailsResponse.class)
                .withName("ShowTakeOverAssetDetails")
                .withUri("/v1.0/{project_id}/asset/obs/host/task/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getSourceBucket, (req, v) -> {
                req.setSourceBucket(v);
            }));
        builder.<String>withRequestField("source_object",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getSourceObject, (req, v) -> {
                req.setSourceObject(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetails =
        genForshowTakeOverTaskDetails();

    private static HttpRequestDef<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> genForshowTakeOverTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTakeOverTaskDetailsRequest.class, ShowTakeOverTaskDetailsResponse.class)
            .withName("ShowTakeOverTaskDetails")
            .withUri("/v1.0/{project_id}/asset/obs/host/stock/task/details")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getSize, (req, v) -> {
                req.setSize(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVodRetrievalRequest, ShowVodRetrievalResponse> showVodRetrieval =
        genForshowVodRetrieval();

    private static HttpRequestDef<ShowVodRetrievalRequest, ShowVodRetrievalResponse> genForshowVodRetrieval() {
        // basic
        HttpRequestDef.Builder<ShowVodRetrievalRequest, ShowVodRetrievalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVodRetrievalRequest.class, ShowVodRetrievalResponse.class)
                .withName("ShowVodRetrieval")
                .withUri("/v1/{project_id}/asset/vod-retrieval")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodRetrievalRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodRetrievalRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVodRetrievalRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifySubtitleRequest, ModifySubtitleResponse> modifySubtitle =
        genFormodifySubtitle();

    private static HttpRequestDef<ModifySubtitleRequest, ModifySubtitleResponse> genFormodifySubtitle() {
        // basic
        HttpRequestDef.Builder<ModifySubtitleRequest, ModifySubtitleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifySubtitleRequest.class, ModifySubtitleResponse.class)
                .withName("ModifySubtitle")
                .withUri("/v1/{project_id}/asset/subtitles")
                .withContentType("application/json");

        // requests
        builder.<SubtitleModifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubtitleModifyReq.class),
            f -> f.withMarshaller(ModifySubtitleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStorageModeRequest, UpdateStorageModeResponse> updateStorageMode =
        genForupdateStorageMode();

    private static HttpRequestDef<UpdateStorageModeRequest, UpdateStorageModeResponse> genForupdateStorageMode() {
        // basic
        HttpRequestDef.Builder<UpdateStorageModeRequest, UpdateStorageModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStorageModeRequest.class, UpdateStorageModeResponse.class)
                .withName("UpdateStorageMode")
                .withUri("/v1/{project_id}/asset/storage-mode")
                .withContentType("application/json");

        // requests
        builder.<UpdateStorageModeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStorageModeReq.class),
            f -> f.withMarshaller(UpdateStorageModeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

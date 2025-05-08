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
import com.huaweicloud.sdk.vod.v1.model.CreateEditTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateEditTaskRequestBody;
import com.huaweicloud.sdk.vod.v1.model.CreateEditTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateExtractAudioTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateExtractAudioTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectProcessTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectProcessTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectReplicationRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectReplicationRequestBody;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectReplicationResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectRetrievalRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectRetrievalRequestBody;
import com.huaweicloud.sdk.vod.v1.model.CreateObjectRetrievalResponse;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetReq;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateRealTimeClipRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateRealTimeClipRequestBody;
import com.huaweicloud.sdk.vod.v1.model.CreateRealTimeClipResponse;
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
import com.huaweicloud.sdk.vod.v1.model.CreateUploadByUrlRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateUploadByUrlResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateReq;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteDyAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteDyAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeProductReq;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeProductRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeProductResponse;
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
import com.huaweicloud.sdk.vod.v1.model.ObjectProcessReq;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsReq;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsRequest;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsResponse;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetReq;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.QueryCategoryRsp;
import com.huaweicloud.sdk.vod.v1.model.RefreshAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.RefreshAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.RefreshTaskReq;
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
import com.huaweicloud.sdk.vod.v1.model.ShowObjectMetaDataRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowObjectMetaDataResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowPreheatingAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowPreheatingAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowRefreshResultRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowRefreshResultResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowStorageModeTypeRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowStorageModeTypeResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverAssetDetailsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverAssetDetailsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverTaskDetailsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverTaskDetailsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowTaskDetailRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowTaskDetailResponse;
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
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeTypeReq;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeTypeRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeTypeResponse;
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
import com.huaweicloud.sdk.vod.v1.model.UploadByUrlReq;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlReq;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlRequest;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class VodMeta {

    public static final HttpRequestDef<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTask =
        genForCancelAssetTranscodeTask();

    private static HttpRequestDef<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> genForCancelAssetTranscodeTask() {
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
            f -> f.withMarshaller(CancelAssetTranscodeTaskRequest::getAssetId,
                CancelAssetTranscodeTaskRequest::setAssetId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAssetTranscodeTaskRequest::getXSdkDate,
                CancelAssetTranscodeTaskRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTask =
        genForCancelExtractAudioTask();

    private static HttpRequestDef<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> genForCancelExtractAudioTask() {
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
            f -> f.withMarshaller(CancelExtractAudioTaskRequest::getAssetId,
                CancelExtractAudioTaskRequest::setAssetId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelExtractAudioTaskRequest::getXSdkDate,
                CancelExtractAudioTaskRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5Duplication =
        genForCheckMd5Duplication();

    private static HttpRequestDef<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> genForCheckMd5Duplication() {
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
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getSize, CheckMd5DuplicationRequest::setSize));
        builder.<String>withRequestField("md5",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getMd5, CheckMd5DuplicationRequest::setMd5));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckMd5DuplicationRequest::getXSdkDate, CheckMd5DuplicationRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUpload =
        genForConfirmAssetUpload();

    private static HttpRequestDef<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> genForConfirmAssetUpload() {
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
            f -> f.withMarshaller(ConfirmAssetUploadRequest::getXSdkDate, ConfirmAssetUploadRequest::setXSdkDate));
        builder.<ConfirmAssetUploadReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmAssetUploadReq.class),
            f -> f.withMarshaller(ConfirmAssetUploadRequest::getBody, ConfirmAssetUploadRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUpload =
        genForConfirmImageUpload();

    private static HttpRequestDef<ConfirmImageUploadRequest, ConfirmImageUploadResponse> genForConfirmImageUpload() {
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
            f -> f.withMarshaller(ConfirmImageUploadRequest::getXSdkDate, ConfirmImageUploadRequest::setXSdkDate));
        builder.<ConfirmImageUploadReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmImageUploadReq.class),
            f -> f.withMarshaller(ConfirmImageUploadRequest::getBody, ConfirmImageUploadRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUpload =
        genForCreateAssetByFileUpload();

    private static HttpRequestDef<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> genForCreateAssetByFileUpload() {
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
            f -> f.withMarshaller(CreateAssetByFileUploadRequest::getXSdkDate,
                CreateAssetByFileUploadRequest::setXSdkDate));
        builder.<CreateAssetByFileUploadReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAssetByFileUploadReq.class),
            f -> f.withMarshaller(CreateAssetByFileUploadRequest::getBody, CreateAssetByFileUploadRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategory =
        genForCreateAssetCategory();

    private static HttpRequestDef<CreateAssetCategoryRequest, CreateAssetCategoryResponse> genForCreateAssetCategory() {
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
            f -> f.withMarshaller(CreateAssetCategoryRequest::getXSdkDate, CreateAssetCategoryRequest::setXSdkDate));
        builder.<CreateCategoryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCategoryReq.class),
            f -> f.withMarshaller(CreateAssetCategoryRequest::getBody, CreateAssetCategoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTask =
        genForCreateAssetProcessTask();

    private static HttpRequestDef<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> genForCreateAssetProcessTask() {
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
            f -> f.withMarshaller(CreateAssetProcessTaskRequest::getXSdkDate,
                CreateAssetProcessTaskRequest::setXSdkDate));
        builder.<AssetProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AssetProcessReq.class),
            f -> f.withMarshaller(CreateAssetProcessTaskRequest::getBody, CreateAssetProcessTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTask =
        genForCreateAssetReviewTask();

    private static HttpRequestDef<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> genForCreateAssetReviewTask() {
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
            f -> f.withMarshaller(CreateAssetReviewTaskRequest::getXSdkDate,
                CreateAssetReviewTaskRequest::setXSdkDate));
        builder.<AssetReviewReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetReviewReq.class),
            f -> f.withMarshaller(CreateAssetReviewTaskRequest::getBody, CreateAssetReviewTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEditTaskRequest, CreateEditTaskResponse> createEditTask =
        genForCreateEditTask();

    private static HttpRequestDef<CreateEditTaskRequest, CreateEditTaskResponse> genForCreateEditTask() {
        // basic
        HttpRequestDef.Builder<CreateEditTaskRequest, CreateEditTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEditTaskRequest.class, CreateEditTaskResponse.class)
                .withName("CreateEditTask")
                .withUri("/v1/{project_id}/asset/customization/edit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEditTaskRequest::getXSdkDate, CreateEditTaskRequest::setXSdkDate));
        builder.<CreateEditTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEditTaskRequestBody.class),
            f -> f.withMarshaller(CreateEditTaskRequest::getBody, CreateEditTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTask =
        genForCreateExtractAudioTask();

    private static HttpRequestDef<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> genForCreateExtractAudioTask() {
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
            f -> f.withMarshaller(CreateExtractAudioTaskRequest::getXSdkDate,
                CreateExtractAudioTaskRequest::setXSdkDate));
        builder.<ExtractAudioTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtractAudioTaskReq.class),
            f -> f.withMarshaller(CreateExtractAudioTaskRequest::getBody, CreateExtractAudioTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateObjectProcessTaskRequest, CreateObjectProcessTaskResponse> createObjectProcessTask =
        genForCreateObjectProcessTask();

    private static HttpRequestDef<CreateObjectProcessTaskRequest, CreateObjectProcessTaskResponse> genForCreateObjectProcessTask() {
        // basic
        HttpRequestDef.Builder<CreateObjectProcessTaskRequest, CreateObjectProcessTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateObjectProcessTaskRequest.class, CreateObjectProcessTaskResponse.class)
            .withName("CreateObjectProcessTask")
            .withUri("/v1/{project_id}/asset/customization/process")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateObjectProcessTaskRequest::getXSdkDate,
                CreateObjectProcessTaskRequest::setXSdkDate));
        builder.<ObjectProcessReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ObjectProcessReq.class),
            f -> f.withMarshaller(CreateObjectProcessTaskRequest::getBody, CreateObjectProcessTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateObjectReplicationRequest, CreateObjectReplicationResponse> createObjectReplication =
        genForCreateObjectReplication();

    private static HttpRequestDef<CreateObjectReplicationRequest, CreateObjectReplicationResponse> genForCreateObjectReplication() {
        // basic
        HttpRequestDef.Builder<CreateObjectReplicationRequest, CreateObjectReplicationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateObjectReplicationRequest.class, CreateObjectReplicationResponse.class)
            .withName("CreateObjectReplication")
            .withUri("/v1/{project_id}/asset/customization/object-replication")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateObjectReplicationRequest::getXSdkDate,
                CreateObjectReplicationRequest::setXSdkDate));
        builder.<CreateObjectReplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateObjectReplicationRequestBody.class),
            f -> f.withMarshaller(CreateObjectReplicationRequest::getBody, CreateObjectReplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateObjectRetrievalRequest, CreateObjectRetrievalResponse> createObjectRetrieval =
        genForCreateObjectRetrieval();

    private static HttpRequestDef<CreateObjectRetrievalRequest, CreateObjectRetrievalResponse> genForCreateObjectRetrieval() {
        // basic
        HttpRequestDef.Builder<CreateObjectRetrievalRequest, CreateObjectRetrievalResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateObjectRetrievalRequest.class, CreateObjectRetrievalResponse.class)
            .withName("CreateObjectRetrieval")
            .withUri("/v1/{project_id}/asset/customization/object-retrieval")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateObjectRetrievalRequest::getXSdkDate,
                CreateObjectRetrievalRequest::setXSdkDate));
        builder.<CreateObjectRetrievalRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateObjectRetrievalRequestBody.class),
            f -> f.withMarshaller(CreateObjectRetrievalRequest::getBody, CreateObjectRetrievalRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAsset =
        genForCreatePreheatingAsset();

    private static HttpRequestDef<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> genForCreatePreheatingAsset() {
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
            f -> f.withMarshaller(CreatePreheatingAssetRequest::getXSdkDate,
                CreatePreheatingAssetRequest::setXSdkDate));
        builder.<CreatePreheatingAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePreheatingAssetReq.class),
            f -> f.withMarshaller(CreatePreheatingAssetRequest::getBody, CreatePreheatingAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRealTimeClipRequest, CreateRealTimeClipResponse> createRealTimeClip =
        genForCreateRealTimeClip();

    private static HttpRequestDef<CreateRealTimeClipRequest, CreateRealTimeClipResponse> genForCreateRealTimeClip() {
        // basic
        HttpRequestDef.Builder<CreateRealTimeClipRequest, CreateRealTimeClipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRealTimeClipRequest.class, CreateRealTimeClipResponse.class)
                .withName("CreateRealTimeClip")
                .withUri("/v1/{project_id}/asset/customization/realtime-clip")
                .withContentType("application/json");

        // requests
        builder.<CreateRealTimeClipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRealTimeClipRequestBody.class),
            f -> f.withMarshaller(CreateRealTimeClipRequest::getBody, CreateRealTimeClipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTask =
        genForCreateTakeOverTask();

    private static HttpRequestDef<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> genForCreateTakeOverTask() {
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
            f -> f.withMarshaller(CreateTakeOverTaskRequest::getXSdkDate, CreateTakeOverTaskRequest::setXSdkDate));
        builder.<CreateTakeOverTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTakeOverTaskReq.class),
            f -> f.withMarshaller(CreateTakeOverTaskRequest::getBody, CreateTakeOverTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroup =
        genForCreateTemplateGroup();

    private static HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> genForCreateTemplateGroup() {
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
            f -> f.withMarshaller(CreateTemplateGroupRequest::getXSdkDate, CreateTemplateGroupRequest::setXSdkDate));
        builder.<TransTemplateGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransTemplateGroup.class),
            f -> f.withMarshaller(CreateTemplateGroupRequest::getBody, CreateTemplateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse> createTemplateGroupCollection =
        genForCreateTemplateGroupCollection();

    private static HttpRequestDef<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse> genForCreateTemplateGroupCollection() {
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
            f -> f.withMarshaller(CreateTemplateGroupCollectionRequest::getXSdkDate,
                CreateTemplateGroupCollectionRequest::setXSdkDate));
        builder.<TransTemplateGroupCollection>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransTemplateGroupCollection.class),
            f -> f.withMarshaller(CreateTemplateGroupCollectionRequest::getBody,
                CreateTemplateGroupCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse> createTranscodeTemplate =
        genForCreateTranscodeTemplate();

    private static HttpRequestDef<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse> genForCreateTranscodeTemplate() {
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
            f -> f.withMarshaller(CreateTranscodeTemplateRequest::getXSdkDate,
                CreateTranscodeTemplateRequest::setXSdkDate));
        builder.<CreateTranscodeTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTranscodeTemplate.class),
            f -> f.withMarshaller(CreateTranscodeTemplateRequest::getBody, CreateTranscodeTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUploadByUrlRequest, CreateUploadByUrlResponse> createUploadByUrl =
        genForCreateUploadByUrl();

    private static HttpRequestDef<CreateUploadByUrlRequest, CreateUploadByUrlResponse> genForCreateUploadByUrl() {
        // basic
        HttpRequestDef.Builder<CreateUploadByUrlRequest, CreateUploadByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUploadByUrlRequest.class, CreateUploadByUrlResponse.class)
                .withName("CreateUploadByUrl")
                .withUri("/v1/{project_id}/asset/customization/upload-by-url")
                .withContentType("application/json");

        // requests
        builder.<UploadByUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadByUrlReq.class),
            f -> f.withMarshaller(CreateUploadByUrlRequest::getBody, CreateUploadByUrlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplate =
        genForCreateWatermarkTemplate();

    private static HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> genForCreateWatermarkTemplate() {
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
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getXSdkDate,
                CreateWatermarkTemplateRequest::setXSdkDate));
        builder.<CreateWatermarkTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWatermarkTemplateReq.class),
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getBody, CreateWatermarkTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategory =
        genForDeleteAssetCategory();

    private static HttpRequestDef<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> genForDeleteAssetCategory() {
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
            f -> f.withMarshaller(DeleteAssetCategoryRequest::getId, DeleteAssetCategoryRequest::setId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetCategoryRequest::getXSdkDate, DeleteAssetCategoryRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetsRequest, DeleteAssetsResponse> deleteAssets = genForDeleteAssets();

    private static HttpRequestDef<DeleteAssetsRequest, DeleteAssetsResponse> genForDeleteAssets() {
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
            f -> f.withMarshaller(DeleteAssetsRequest::getAssetId, DeleteAssetsRequest::setAssetId));
        builder.<String>withRequestField("delete_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetsRequest::getDeleteType, DeleteAssetsRequest::setDeleteType));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetsRequest::getXSdkDate, DeleteAssetsRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDyAssetRequest, DeleteDyAssetResponse> deleteDyAsset =
        genForDeleteDyAsset();

    private static HttpRequestDef<DeleteDyAssetRequest, DeleteDyAssetResponse> genForDeleteDyAsset() {
        // basic
        HttpRequestDef.Builder<DeleteDyAssetRequest, DeleteDyAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDyAssetRequest.class, DeleteDyAssetResponse.class)
                .withName("DeleteDyAsset")
                .withUri("/v1/{project_id}/asset/customization/object")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDyAssetRequest::getBucket, DeleteDyAssetRequest::setBucket));
        builder.<List<String>>withRequestField("object",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteDyAssetRequest::getObject, DeleteDyAssetRequest::setObject));
        builder.<String>withRequestField("callback_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDyAssetRequest::getCallbackUrl, DeleteDyAssetRequest::setCallbackUrl));
        builder.<String>withRequestField("session_context",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDyAssetRequest::getSessionContext, DeleteDyAssetRequest::setSessionContext));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDyAssetRequest::getXSdkDate, DeleteDyAssetRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroup =
        genForDeleteTemplateGroup();

    private static HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> genForDeleteTemplateGroup() {
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
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getGroupId, DeleteTemplateGroupRequest::setGroupId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getXSdkDate, DeleteTemplateGroupRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse> deleteTemplateGroupCollection =
        genForDeleteTemplateGroupCollection();

    private static HttpRequestDef<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse> genForDeleteTemplateGroupCollection() {
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
            f -> f.withMarshaller(DeleteTemplateGroupCollectionRequest::getGroupCollectionId,
                DeleteTemplateGroupCollectionRequest::setGroupCollectionId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateGroupCollectionRequest::getXSdkDate,
                DeleteTemplateGroupCollectionRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodeProductRequest, DeleteTranscodeProductResponse> deleteTranscodeProduct =
        genForDeleteTranscodeProduct();

    private static HttpRequestDef<DeleteTranscodeProductRequest, DeleteTranscodeProductResponse> genForDeleteTranscodeProduct() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodeProductRequest, DeleteTranscodeProductResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTranscodeProductRequest.class, DeleteTranscodeProductResponse.class)
            .withName("DeleteTranscodeProduct")
            .withUri("/v1/{project_id}/asset/transcode-product")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodeProductRequest::getXSdkDate,
                DeleteTranscodeProductRequest::setXSdkDate));
        builder.<DeleteTranscodeProductReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTranscodeProductReq.class),
            f -> f.withMarshaller(DeleteTranscodeProductRequest::getBody, DeleteTranscodeProductRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse> deleteTranscodeTemplate =
        genForDeleteTranscodeTemplate();

    private static HttpRequestDef<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse> genForDeleteTranscodeTemplate() {
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
            f -> f.withMarshaller(DeleteTranscodeTemplateRequest::getGroupId,
                DeleteTranscodeTemplateRequest::setGroupId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTranscodeTemplateRequest::getXSdkDate,
                DeleteTranscodeTemplateRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplate =
        genForDeleteWatermarkTemplate();

    private static HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> genForDeleteWatermarkTemplate() {
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
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getId, DeleteWatermarkTemplateRequest::setId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getXSdkDate,
                DeleteWatermarkTemplateRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategory =
        genForListAssetCategory();

    private static HttpRequestDef<ListAssetCategoryRequest, ListAssetCategoryResponse> genForListAssetCategory() {
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
            f -> f.withMarshaller(ListAssetCategoryRequest::getId, ListAssetCategoryRequest::setId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetCategoryRequest::getXSdkDate, ListAssetCategoryRequest::setXSdkDate));

        // response
        builder.<List<QueryCategoryRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetCategoryResponse::getBody, ListAssetCategoryResponse::setBody)
                .withInnerContainerType(QueryCategoryRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse> listAssetDailySummaryLog =
        genForListAssetDailySummaryLog();

    private static HttpRequestDef<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse> genForListAssetDailySummaryLog() {
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
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getStartTime,
                ListAssetDailySummaryLogRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getEndTime,
                ListAssetDailySummaryLogRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getOffset,
                ListAssetDailySummaryLogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getLimit,
                ListAssetDailySummaryLogRequest::setLimit));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetDailySummaryLogRequest::getXSdkDate,
                ListAssetDailySummaryLogRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetListRequest, ListAssetListResponse> listAssetList =
        genForListAssetList();

    private static HttpRequestDef<ListAssetListRequest, ListAssetListResponse> genForListAssetList() {
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
            f -> f.withMarshaller(ListAssetListRequest::getAssetId, ListAssetListRequest::setAssetId));
        builder.<List<ListAssetListRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetListRequest::getStatus, ListAssetListRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getStartTime, ListAssetListRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getEndTime, ListAssetListRequest::setEndTime));
        builder.<Integer>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetListRequest::getCategoryId, ListAssetListRequest::setCategoryId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getTags, ListAssetListRequest::setTags));
        builder.<String>withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getQueryString, ListAssetListRequest::setQueryString));
        builder.<List<String>>withRequestField("media_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetListRequest::getMediaType, ListAssetListRequest::setMediaType));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetListRequest::getPage, ListAssetListRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetListRequest::getSize, ListAssetListRequest::setSize));
        builder.<ListAssetListRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetListRequest.OrderEnum.class),
            f -> f.withMarshaller(ListAssetListRequest::getOrder, ListAssetListRequest::setOrder));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetListRequest::getXSdkDate, ListAssetListRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainLogsRequest, ListDomainLogsResponse> listDomainLogs =
        genForListDomainLogs();

    private static HttpRequestDef<ListDomainLogsRequest, ListDomainLogsResponse> genForListDomainLogs() {
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
            f -> f.withMarshaller(ListDomainLogsRequest::getDomainName, ListDomainLogsRequest::setDomainName));
        builder.<String>withRequestField("query_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getQueryDate, ListDomainLogsRequest::setQueryDate));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getPageSize, ListDomainLogsRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getPageNumber, ListDomainLogsRequest::setPageNumber));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainLogsRequest::getXSdkDate, ListDomainLogsRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroup =
        genForListTemplateGroup();

    private static HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> genForListTemplateGroup() {
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
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupId, ListTemplateGroupRequest::setGroupId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getStatus, ListTemplateGroupRequest::setStatus));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getPage, ListTemplateGroupRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getSize, ListTemplateGroupRequest::setSize));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupRequest::getXSdkDate, ListTemplateGroupRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse> listTemplateGroupCollection =
        genForListTemplateGroupCollection();

    private static HttpRequestDef<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse> genForListTemplateGroupCollection() {
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
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getGroupCollectionId,
                ListTemplateGroupCollectionRequest::setGroupCollectionId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getOffset,
                ListTemplateGroupCollectionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getLimit,
                ListTemplateGroupCollectionRequest::setLimit));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateGroupCollectionRequest::getXSdkDate,
                ListTemplateGroupCollectionRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatistics =
        genForListTopStatistics();

    private static HttpRequestDef<ListTopStatisticsRequest, ListTopStatisticsResponse> genForListTopStatistics() {
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
            f -> f.withMarshaller(ListTopStatisticsRequest::getDomain, ListTopStatisticsRequest::setDomain));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopStatisticsRequest::getDate, ListTopStatisticsRequest::setDate));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopStatisticsRequest::getXSdkDate, ListTopStatisticsRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse> listTranscodeTemplate =
        genForListTranscodeTemplate();

    private static HttpRequestDef<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse> genForListTranscodeTemplate() {
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
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getGroupId, ListTranscodeTemplateRequest::setGroupId));
        builder.<Boolean>withRequestField("is_default",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getIsDefault,
                ListTranscodeTemplateRequest::setIsDefault));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getOffset, ListTranscodeTemplateRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getLimit, ListTranscodeTemplateRequest::setLimit));
        builder.<String>withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getQueryString,
                ListTranscodeTemplateRequest::setQueryString));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeTemplateRequest::getXSdkDate,
                ListTranscodeTemplateRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplate =
        genForListWatermarkTemplate();

    private static HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> genForListWatermarkTemplate() {
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
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getId, ListWatermarkTemplateRequest::setId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getPage, ListWatermarkTemplateRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getSize, ListWatermarkTemplateRequest::setSize));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getXSdkDate,
                ListWatermarkTemplateRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifySubtitleRequest, ModifySubtitleResponse> modifySubtitle =
        genForModifySubtitle();

    private static HttpRequestDef<ModifySubtitleRequest, ModifySubtitleResponse> genForModifySubtitle() {
        // basic
        HttpRequestDef.Builder<ModifySubtitleRequest, ModifySubtitleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifySubtitleRequest.class, ModifySubtitleResponse.class)
                .withName("ModifySubtitle")
                .withUri("/v1/{project_id}/asset/subtitles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifySubtitleRequest::getXSdkDate, ModifySubtitleRequest::setXSdkDate));
        builder.<SubtitleModifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubtitleModifyReq.class),
            f -> f.withMarshaller(ModifySubtitleRequest::getBody, ModifySubtitleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObs =
        genForPublishAssetFromObs();

    private static HttpRequestDef<PublishAssetFromObsRequest, PublishAssetFromObsResponse> genForPublishAssetFromObs() {
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
            f -> f.withMarshaller(PublishAssetFromObsRequest::getXSdkDate, PublishAssetFromObsRequest::setXSdkDate));
        builder.<PublishAssetFromObsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetFromObsReq.class),
            f -> f.withMarshaller(PublishAssetFromObsRequest::getBody, PublishAssetFromObsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAssetsRequest, PublishAssetsResponse> publishAssets =
        genForPublishAssets();

    private static HttpRequestDef<PublishAssetsRequest, PublishAssetsResponse> genForPublishAssets() {
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
            f -> f.withMarshaller(PublishAssetsRequest::getXSdkDate, PublishAssetsRequest::setXSdkDate));
        builder.<PublishAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetReq.class),
            f -> f.withMarshaller(PublishAssetsRequest::getBody, PublishAssetsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RefreshAssetRequest, RefreshAssetResponse> refreshAsset = genForRefreshAsset();

    private static HttpRequestDef<RefreshAssetRequest, RefreshAssetResponse> genForRefreshAsset() {
        // basic
        HttpRequestDef.Builder<RefreshAssetRequest, RefreshAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RefreshAssetRequest.class, RefreshAssetResponse.class)
                .withName("RefreshAsset")
                .withUri("/v1/{project_id}/asset/refresh")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RefreshAssetRequest::getXSdkDate, RefreshAssetRequest::setXSdkDate));
        builder.<RefreshTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RefreshTaskReq.class),
            f -> f.withMarshaller(RefreshAssetRequest::getBody, RefreshAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipher =
        genForShowAssetCipher();

    private static HttpRequestDef<ShowAssetCipherRequest, ShowAssetCipherResponse> genForShowAssetCipher() {
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
            f -> f.withMarshaller(ShowAssetCipherRequest::getAssetId, ShowAssetCipherRequest::setAssetId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetCipherRequest::getXSdkDate, ShowAssetCipherRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetail =
        genForShowAssetDetail();

    private static HttpRequestDef<ShowAssetDetailRequest, ShowAssetDetailResponse> genForShowAssetDetail() {
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
            f -> f.withMarshaller(ShowAssetDetailRequest::getAssetId, ShowAssetDetailRequest::setAssetId));
        builder.<List<ShowAssetDetailRequest.CategoriesEnum>>withRequestField("categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetDetailRequest::getCategories, ShowAssetDetailRequest::setCategories));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetDetailRequest::getXSdkDate, ShowAssetDetailRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMeta =
        genForShowAssetMeta();

    private static HttpRequestDef<ShowAssetMetaRequest, ShowAssetMetaResponse> genForShowAssetMeta() {
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
            f -> f.withMarshaller(ShowAssetMetaRequest::getAssetId, ShowAssetMetaRequest::setAssetId));
        builder.<List<ShowAssetMetaRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getStatus, ShowAssetMetaRequest::setStatus));
        builder.<List<ShowAssetMetaRequest.TranscodeStatusEnum>>withRequestField("transcodeStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getTranscodeStatus, ShowAssetMetaRequest::setTranscodeStatus));
        builder.<List<ShowAssetMetaRequest.AssetStatusEnum>>withRequestField("assetStatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getAssetStatus, ShowAssetMetaRequest::setAssetStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getStartTime, ShowAssetMetaRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getEndTime, ShowAssetMetaRequest::setEndTime));
        builder.<Integer>withRequestField("category_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getCategoryId, ShowAssetMetaRequest::setCategoryId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getTags, ShowAssetMetaRequest::setTags));
        builder.<String>withRequestField("query_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getQueryString, ShowAssetMetaRequest::setQueryString));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getPage, ShowAssetMetaRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getSize, ShowAssetMetaRequest::setSize));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetMetaRequest::getXSdkDate, ShowAssetMetaRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthority =
        genForShowAssetTempAuthority();

    private static HttpRequestDef<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> genForShowAssetTempAuthority() {
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
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getHttpVerb,
                ShowAssetTempAuthorityRequest::setHttpVerb));
        builder.<String>withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getBucket, ShowAssetTempAuthorityRequest::setBucket));
        builder.<String>withRequestField("object_key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getObjectKey,
                ShowAssetTempAuthorityRequest::setObjectKey));
        builder.<String>withRequestField("content_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getContentType,
                ShowAssetTempAuthorityRequest::setContentType));
        builder.<String>withRequestField("content_md5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getContentMd5,
                ShowAssetTempAuthorityRequest::setContentMd5));
        builder.<String>withRequestField("upload_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getUploadId,
                ShowAssetTempAuthorityRequest::setUploadId));
        builder.<Integer>withRequestField("part_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getPartNumber,
                ShowAssetTempAuthorityRequest::setPartNumber));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTempAuthorityRequest::getXSdkDate,
                ShowAssetTempAuthorityRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatistics =
        genForShowCdnStatistics();

    private static HttpRequestDef<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> genForShowCdnStatistics() {
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
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getStartTime, ShowCdnStatisticsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getEndTime, ShowCdnStatisticsRequest::setEndTime));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getStatType, ShowCdnStatisticsRequest::setStatType));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getDomain, ShowCdnStatisticsRequest::setDomain));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getInterval, ShowCdnStatisticsRequest::setInterval));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCdnStatisticsRequest::getXSdkDate, ShowCdnStatisticsRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowObjectMetaDataRequest, ShowObjectMetaDataResponse> showObjectMetaData =
        genForShowObjectMetaData();

    private static HttpRequestDef<ShowObjectMetaDataRequest, ShowObjectMetaDataResponse> genForShowObjectMetaData() {
        // basic
        HttpRequestDef.Builder<ShowObjectMetaDataRequest, ShowObjectMetaDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowObjectMetaDataRequest.class, ShowObjectMetaDataResponse.class)
                .withName("ShowObjectMetaData")
                .withUri("/v1/{project_id}/asset/customization/meta-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObjectMetaDataRequest::getBucket, ShowObjectMetaDataRequest::setBucket));
        builder.<String>withRequestField("object",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObjectMetaDataRequest::getObject, ShowObjectMetaDataRequest::setObject));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObjectMetaDataRequest::getMarker, ShowObjectMetaDataRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowObjectMetaDataRequest::getLimit, ShowObjectMetaDataRequest::setLimit));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowObjectMetaDataRequest::getXSdkDate, ShowObjectMetaDataRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAsset =
        genForShowPreheatingAsset();

    private static HttpRequestDef<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> genForShowPreheatingAsset() {
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
            f -> f.withMarshaller(ShowPreheatingAssetRequest::getTaskId, ShowPreheatingAssetRequest::setTaskId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreheatingAssetRequest::getXSdkDate, ShowPreheatingAssetRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRefreshResultRequest, ShowRefreshResultResponse> showRefreshResult =
        genForShowRefreshResult();

    private static HttpRequestDef<ShowRefreshResultRequest, ShowRefreshResultResponse> genForShowRefreshResult() {
        // basic
        HttpRequestDef.Builder<ShowRefreshResultRequest, ShowRefreshResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRefreshResultRequest.class, ShowRefreshResultResponse.class)
                .withName("ShowRefreshResult")
                .withUri("/v1/{project_id}/asset/refresh")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRefreshResultRequest::getTaskId, ShowRefreshResultRequest::setTaskId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRefreshResultRequest::getXSdkDate, ShowRefreshResultRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStorageModeTypeRequest, ShowStorageModeTypeResponse> showStorageModeType =
        genForShowStorageModeType();

    private static HttpRequestDef<ShowStorageModeTypeRequest, ShowStorageModeTypeResponse> genForShowStorageModeType() {
        // basic
        HttpRequestDef.Builder<ShowStorageModeTypeRequest, ShowStorageModeTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStorageModeTypeRequest.class, ShowStorageModeTypeResponse.class)
                .withName("ShowStorageModeType")
                .withUri("/v1/{project_id}/asset/storage-mode-type")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetail =
        genForShowTaskDetail();

    private static HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> genForShowTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowTaskDetailRequest, ShowTaskDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDetailRequest.class, ShowTaskDetailResponse.class)
                .withName("ShowTaskDetail")
                .withUri("/v1/{project_id}/asset/customization/task/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDetailRequest::getTaskId, ShowTaskDetailRequest::setTaskId));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDetailRequest::getXSdkDate, ShowTaskDetailRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVodRetrievalRequest, ShowVodRetrievalResponse> showVodRetrieval =
        genForShowVodRetrieval();

    private static HttpRequestDef<ShowVodRetrievalRequest, ShowVodRetrievalResponse> genForShowVodRetrieval() {
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
            f -> f.withMarshaller(ShowVodRetrievalRequest::getStartTime, ShowVodRetrievalRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodRetrievalRequest::getEndTime, ShowVodRetrievalRequest::setEndTime));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVodRetrievalRequest::getInterval, ShowVodRetrievalRequest::setInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatistics =
        genForShowVodStatistics();

    private static HttpRequestDef<ShowVodStatisticsRequest, ShowVodStatisticsResponse> genForShowVodStatistics() {
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
            f -> f.withMarshaller(ShowVodStatisticsRequest::getStartTime, ShowVodStatisticsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodStatisticsRequest::getEndTime, ShowVodStatisticsRequest::setEndTime));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVodStatisticsRequest::getInterval, ShowVodStatisticsRequest::setInterval));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVodStatisticsRequest::getXSdkDate, ShowVodStatisticsRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssets =
        genForUnpublishAssets();

    private static HttpRequestDef<UnpublishAssetsRequest, UnpublishAssetsResponse> genForUnpublishAssets() {
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
            f -> f.withMarshaller(UnpublishAssetsRequest::getXSdkDate, UnpublishAssetsRequest::setXSdkDate));
        builder.<PublishAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetReq.class),
            f -> f.withMarshaller(UnpublishAssetsRequest::getBody, UnpublishAssetsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetRequest, UpdateAssetResponse> updateAsset = genForUpdateAsset();

    private static HttpRequestDef<UpdateAssetRequest, UpdateAssetResponse> genForUpdateAsset() {
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
            f -> f.withMarshaller(UpdateAssetRequest::getXSdkDate, UpdateAssetRequest::setXSdkDate));
        builder.<UploadAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAssetReq.class),
            f -> f.withMarshaller(UpdateAssetRequest::getBody, UpdateAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategory =
        genForUpdateAssetCategory();

    private static HttpRequestDef<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> genForUpdateAssetCategory() {
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
            f -> f.withMarshaller(UpdateAssetCategoryRequest::getXSdkDate, UpdateAssetCategoryRequest::setXSdkDate));
        builder.<UpdateCategoryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCategoryReq.class),
            f -> f.withMarshaller(UpdateAssetCategoryRequest::getBody, UpdateAssetCategoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMeta =
        genForUpdateAssetMeta();

    private static HttpRequestDef<UpdateAssetMetaRequest, UpdateAssetMetaResponse> genForUpdateAssetMeta() {
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
            f -> f.withMarshaller(UpdateAssetMetaRequest::getXSdkDate, UpdateAssetMetaRequest::setXSdkDate));
        builder.<UpdateAssetMetaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAssetMetaReq.class),
            f -> f.withMarshaller(UpdateAssetMetaRequest::getBody, UpdateAssetMetaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorized =
        genForUpdateBucketAuthorized();

    private static HttpRequestDef<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> genForUpdateBucketAuthorized() {
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
            f -> f.withMarshaller(UpdateBucketAuthorizedRequest::getXSdkDate,
                UpdateBucketAuthorizedRequest::setXSdkDate));
        builder.<UpdateBucketAuthorizedReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBucketAuthorizedReq.class),
            f -> f.withMarshaller(UpdateBucketAuthorizedRequest::getBody, UpdateBucketAuthorizedRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnail =
        genForUpdateCoverByThumbnail();

    private static HttpRequestDef<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> genForUpdateCoverByThumbnail() {
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
            f -> f.withMarshaller(UpdateCoverByThumbnailRequest::getXSdkDate,
                UpdateCoverByThumbnailRequest::setXSdkDate));
        builder.<UpdateCoverByThumbnailReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCoverByThumbnailReq.class),
            f -> f.withMarshaller(UpdateCoverByThumbnailRequest::getBody, UpdateCoverByThumbnailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStorageModeRequest, UpdateStorageModeResponse> updateStorageMode =
        genForUpdateStorageMode();

    private static HttpRequestDef<UpdateStorageModeRequest, UpdateStorageModeResponse> genForUpdateStorageMode() {
        // basic
        HttpRequestDef.Builder<UpdateStorageModeRequest, UpdateStorageModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStorageModeRequest.class, UpdateStorageModeResponse.class)
                .withName("UpdateStorageMode")
                .withUri("/v1/{project_id}/asset/storage-mode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStorageModeRequest::getXSdkDate, UpdateStorageModeRequest::setXSdkDate));
        builder.<UpdateStorageModeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStorageModeReq.class),
            f -> f.withMarshaller(UpdateStorageModeRequest::getBody, UpdateStorageModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStorageModeTypeRequest, UpdateStorageModeTypeResponse> updateStorageModeType =
        genForUpdateStorageModeType();

    private static HttpRequestDef<UpdateStorageModeTypeRequest, UpdateStorageModeTypeResponse> genForUpdateStorageModeType() {
        // basic
        HttpRequestDef.Builder<UpdateStorageModeTypeRequest, UpdateStorageModeTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStorageModeTypeRequest.class, UpdateStorageModeTypeResponse.class)
            .withName("UpdateStorageModeType")
            .withUri("/v1/{project_id}/asset/storage-mode-type")
            .withContentType("application/json");

        // requests
        builder.<UpdateStorageModeTypeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStorageModeTypeReq.class),
            f -> f.withMarshaller(UpdateStorageModeTypeRequest::getBody, UpdateStorageModeTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroup =
        genForUpdateTemplateGroup();

    private static HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> genForUpdateTemplateGroup() {
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
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getXSdkDate, UpdateTemplateGroupRequest::setXSdkDate));
        builder.<ModifyTransTemplateGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTransTemplateGroup.class),
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getBody, UpdateTemplateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse> updateTemplateGroupCollection =
        genForUpdateTemplateGroupCollection();

    private static HttpRequestDef<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse> genForUpdateTemplateGroupCollection() {
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
            f -> f.withMarshaller(UpdateTemplateGroupCollectionRequest::getXSdkDate,
                UpdateTemplateGroupCollectionRequest::setXSdkDate));
        builder.<ModifyTemplateGroupCollection>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTemplateGroupCollection.class),
            f -> f.withMarshaller(UpdateTemplateGroupCollectionRequest::getBody,
                UpdateTemplateGroupCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse> updateTranscodeTemplate =
        genForUpdateTranscodeTemplate();

    private static HttpRequestDef<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse> genForUpdateTranscodeTemplate() {
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
            f -> f.withMarshaller(UpdateTranscodeTemplateRequest::getXSdkDate,
                UpdateTranscodeTemplateRequest::setXSdkDate));
        builder.<ModifyTransTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyTransTemplate.class),
            f -> f.withMarshaller(UpdateTranscodeTemplateRequest::getBody, UpdateTranscodeTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplate =
        genForUpdateWatermarkTemplate();

    private static HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> genForUpdateWatermarkTemplate() {
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
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getXSdkDate,
                UpdateWatermarkTemplateRequest::setXSdkDate));
        builder.<UpdateWatermarkTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateWatermarkTemplateReq.class),
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getBody, UpdateWatermarkTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrl =
        genForUploadMetaDataByUrl();

    private static HttpRequestDef<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> genForUploadMetaDataByUrl() {
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
            f -> f.withMarshaller(UploadMetaDataByUrlRequest::getXSdkDate, UploadMetaDataByUrlRequest::setXSdkDate));
        builder.<UploadMetaDataByUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadMetaDataByUrlReq.class),
            f -> f.withMarshaller(UploadMetaDataByUrlRequest::getBody, UploadMetaDataByUrlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTask =
        genForListTakeOverTask();

    private static HttpRequestDef<ListTakeOverTaskRequest, ListTakeOverTaskResponse> genForListTakeOverTask() {
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
            f -> f.withMarshaller(ListTakeOverTaskRequest::getStatus, ListTakeOverTaskRequest::setStatus));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getTaskId, ListTakeOverTaskRequest::setTaskId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getPage, ListTakeOverTaskRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getSize, ListTakeOverTaskRequest::setSize));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTakeOverTaskRequest::getXSdkDate, ListTakeOverTaskRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetails =
        genForShowTakeOverAssetDetails();

    private static HttpRequestDef<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> genForShowTakeOverAssetDetails() {
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
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getSourceBucket,
                ShowTakeOverAssetDetailsRequest::setSourceBucket));
        builder.<String>withRequestField("source_object",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getSourceObject,
                ShowTakeOverAssetDetailsRequest::setSourceObject));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverAssetDetailsRequest::getXSdkDate,
                ShowTakeOverAssetDetailsRequest::setXSdkDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetails =
        genForShowTakeOverTaskDetails();

    private static HttpRequestDef<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> genForShowTakeOverTaskDetails() {
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
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getTaskId,
                ShowTakeOverTaskDetailsRequest::setTaskId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getPage, ShowTakeOverTaskDetailsRequest::setPage));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getSize, ShowTakeOverTaskDetailsRequest::setSize));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTakeOverTaskDetailsRequest::getXSdkDate,
                ShowTakeOverTaskDetailsRequest::setXSdkDate));

        // response

        return builder.build();
    }

}

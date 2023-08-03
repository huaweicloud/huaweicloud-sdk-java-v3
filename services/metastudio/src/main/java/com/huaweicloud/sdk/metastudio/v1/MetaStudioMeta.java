package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ControlDigitalHumanLiveReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTTSAReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.FilesCreateReq;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummarysReq;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.PictureModelingByUrlReq;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.VideoMotionCaptureJobReq;

@SuppressWarnings("unchecked")
public class MetaStudioMeta {

    public static final HttpRequestDef<CreateDigitalAssetRequest, CreateDigitalAssetResponse> createDigitalAsset =
        genForcreateDigitalAsset();

    private static HttpRequestDef<CreateDigitalAssetRequest, CreateDigitalAssetResponse> genForcreateDigitalAsset() {
        // basic
        HttpRequestDef.Builder<CreateDigitalAssetRequest, CreateDigitalAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDigitalAssetRequest.class, CreateDigitalAssetResponse.class)
                .withName("CreateDigitalAsset")
                .withUri("/v1/{project_id}/digital-assets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateDigitalAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDigitalAssetRequestBody.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> deleteAsset = genFordeleteAsset();

    private static HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> genFordeleteAsset() {
        // basic
        HttpRequestDef.Builder<DeleteAssetRequest, DeleteAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetRequest.class, DeleteAssetResponse.class)
                .withName("DeleteAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getMode, (req, v) -> {
                req.setMode(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetSummaryRequest, ListAssetSummaryResponse> listAssetSummary =
        genForlistAssetSummary();

    private static HttpRequestDef<ListAssetSummaryRequest, ListAssetSummaryResponse> genForlistAssetSummary() {
        // basic
        HttpRequestDef.Builder<ListAssetSummaryRequest, ListAssetSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAssetSummaryRequest.class, ListAssetSummaryResponse.class)
                .withName("ListAssetSummary")
                .withUri("/v1/{project_id}/digital-assets/summarys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ListAssetSummarysReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAssetSummarysReq.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetsRequest, ListAssetsResponse> listAssets = genForlistAssets();

    private static HttpRequestDef<ListAssetsRequest, ListAssetsResponse> genForlistAssets() {
        // basic
        HttpRequestDef.Builder<ListAssetsRequest, ListAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetsRequest.class, ListAssetsResponse.class)
                .withName("ListAssets")
                .withUri("/v1/{project_id}/digital-assets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("asset_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetType, (req, v) -> {
                req.setAssetType(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<ListAssetsRequest.AssetSourceEnum>withRequestField("asset_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetsRequest.AssetSourceEnum.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetSource, (req, v) -> {
                req.setAssetSource(v);
            }));
        builder.<String>withRequestField("asset_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetState, (req, v) -> {
                req.setAssetState(v);
            }));
        builder.<String>withRequestField("style_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getStyleId, (req, v) -> {
                req.setStyleId(v);
            }));
        builder.<String>withRequestField("render_engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getRenderEngine, (req, v) -> {
                req.setRenderEngine(v);
            }));
        builder.<String>withRequestField("sex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSex, (req, v) -> {
                req.setSex(v);
            }));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            }));
        builder.<String>withRequestField("system_property",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSystemProperty, (req, v) -> {
                req.setSystemProperty(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreAssetRequest, RestoreAssetResponse> restoreAsset = genForrestoreAsset();

    private static HttpRequestDef<RestoreAssetRequest, RestoreAssetResponse> genForrestoreAsset() {
        // basic
        HttpRequestDef.Builder<RestoreAssetRequest, RestoreAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreAssetRequest.class, RestoreAssetResponse.class)
                .withName("RestoreAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetRequest, ShowAssetResponse> showAsset = genForshowAsset();

    private static HttpRequestDef<ShowAssetRequest, ShowAssetResponse> genForshowAsset() {
        // basic
        HttpRequestDef.Builder<ShowAssetRequest, ShowAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetRequest.class, ShowAssetResponse.class)
                .withName("ShowAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> updateDigitalAsset =
        genForupdateDigitalAsset();

    private static HttpRequestDef<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> genForupdateDigitalAsset() {
        // basic
        HttpRequestDef.Builder<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDigitalAssetRequest.class, UpdateDigitalAssetResponse.class)
                .withName("UpdateDigitalAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<UpdateDigitalAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDigitalAssetRequestBody.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmFileUploadRequest, ConfirmFileUploadResponse> confirmFileUpload =
        genForconfirmFileUpload();

    private static HttpRequestDef<ConfirmFileUploadRequest, ConfirmFileUploadResponse> genForconfirmFileUpload() {
        // basic
        HttpRequestDef.Builder<ConfirmFileUploadRequest, ConfirmFileUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmFileUploadRequest.class, ConfirmFileUploadResponse.class)
                .withName("ConfirmFileUpload")
                .withUri("/v1/{project_id}/files/{file_id}/complete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<ConfirmFileUploadRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmFileUploadRequestBody.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFileRequest, CreateFileResponse> createFile = genForcreateFile();

    private static HttpRequestDef<CreateFileRequest, CreateFileResponse> genForcreateFile() {
        // basic
        HttpRequestDef.Builder<CreateFileRequest, CreateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFileRequest.class, CreateFileResponse.class)
                .withName("CreateFile")
                .withUri("/v1/{project_id}/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<FilesCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FilesCreateReq.class),
            f -> f.withMarshaller(CreateFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFileRequest, DeleteFileResponse> deleteFile = genFordeleteFile();

    private static HttpRequestDef<DeleteFileRequest, DeleteFileResponse> genFordeleteFile() {
        // basic
        HttpRequestDef.Builder<DeleteFileRequest, DeleteFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFileRequest.class, DeleteFileResponse.class)
                .withName("DeleteFile")
                .withUri("/v1/{project_id}/files/{file_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJob =
        genForcreatePictureModelingByUrlJob();

    private static HttpRequestDef<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> genForcreatePictureModelingByUrlJob() {
        // basic
        HttpRequestDef.Builder<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePictureModelingByUrlJobRequest.class,
                    CreatePictureModelingByUrlJobResponse.class)
                .withName("CreatePictureModelingByUrlJob")
                .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings-by-url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<PictureModelingByUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PictureModelingByUrlReq.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> createPictureModelingJob =
        genForcreatePictureModelingJob();

    private static HttpRequestDef<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> genForcreatePictureModelingJob() {
        // basic
        HttpRequestDef.Builder<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePictureModelingJobRequest.class, CreatePictureModelingJobResponse.class)
                .withName("CreatePictureModelingJob")
                .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<String>withRequestField("X-User-Privilege",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXUserPrivilege, (req, v) -> {
                req.setXUserPrivilege(v);
            }));
        builder.<CreatePictureModelingJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePictureModelingJobRequestBody.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> listPictureModelingJobs =
        genForlistPictureModelingJobs();

    private static HttpRequestDef<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> genForlistPictureModelingJobs() {
        // basic
        HttpRequestDef.Builder<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPictureModelingJobsRequest.class, ListPictureModelingJobsResponse.class)
            .withName("ListPictureModelingJobs")
            .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> showPictureModelingJob =
        genForshowPictureModelingJob();

    private static HttpRequestDef<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> genForshowPictureModelingJob() {
        // basic
        HttpRequestDef.Builder<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPictureModelingJobRequest.class, ShowPictureModelingJobResponse.class)
            .withName("ShowPictureModelingJob")
            .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStylesRequest, ListStylesResponse> listStyles = genForlistStyles();

    private static HttpRequestDef<ListStylesRequest, ListStylesResponse> genForlistStyles() {
        // basic
        HttpRequestDef.Builder<ListStylesRequest, ListStylesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStylesRequest.class, ListStylesResponse.class)
                .withName("ListStyles")
                .withUri("/v1/{project_id}/styles")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStylesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStylesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTtsaRequest, CreateTtsaResponse> createTtsa = genForcreateTtsa();

    private static HttpRequestDef<CreateTtsaRequest, CreateTtsaResponse> genForcreateTtsa() {
        // basic
        HttpRequestDef.Builder<CreateTtsaRequest, CreateTtsaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTtsaRequest.class, CreateTtsaResponse.class)
                .withName("CreateTtsa")
                .withUri("/v1/{project_id}/ttsa-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateTTSAReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTTSAReq.class),
            f -> f.withMarshaller(CreateTtsaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTtsaDataRequest, ListTtsaDataResponse> listTtsaData = genForlistTtsaData();

    private static HttpRequestDef<ListTtsaDataRequest, ListTtsaDataResponse> genForlistTtsaData() {
        // basic
        HttpRequestDef.Builder<ListTtsaDataRequest, ListTtsaDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTtsaDataRequest.class, ListTtsaDataResponse.class)
                .withName("ListTtsaData")
                .withUri("/v1/{project_id}/ttsa-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTtsaJobsRequest, ListTtsaJobsResponse> listTtsaJobs = genForlistTtsaJobs();

    private static HttpRequestDef<ListTtsaJobsRequest, ListTtsaJobsResponse> genForlistTtsaJobs() {
        // basic
        HttpRequestDef.Builder<ListTtsaJobsRequest, ListTtsaJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTtsaJobsRequest.class, ListTtsaJobsResponse.class)
                .withName("ListTtsaJobs")
                .withUri("/v1/{project_id}/ttsa-jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJob =
        genForcreateVideoMotionCaptureJob();

    private static HttpRequestDef<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> genForcreateVideoMotionCaptureJob() {
        // basic
        HttpRequestDef.Builder<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVideoMotionCaptureJobRequest.class,
                    CreateVideoMotionCaptureJobResponse.class)
                .withName("CreateVideoMotionCaptureJob")
                .withUri("/v1/{project_id}/video-motion-capture-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<String>withRequestField("X-User-Privilege",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXUserPrivilege, (req, v) -> {
                req.setXUserPrivilege(v);
            }));
        builder.<VideoMotionCaptureJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoMotionCaptureJobReq.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommand =
        genForexecuteVideoMotionCaptureCommand();

    private static HttpRequestDef<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> genForexecuteVideoMotionCaptureCommand() {
        // basic
        HttpRequestDef.Builder<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteVideoMotionCaptureCommandRequest.class,
                    ExecuteVideoMotionCaptureCommandResponse.class)
                .withName("ExecuteVideoMotionCaptureCommand")
                .withUri("/v1/{project_id}/video-motion-capture-jobs/{job_id}/command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<ControlDigitalHumanLiveReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlDigitalHumanLiveReq.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobs =
        genForlistVideoMotionCaptureJobs();

    private static HttpRequestDef<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> genForlistVideoMotionCaptureJobs() {
        // basic
        HttpRequestDef.Builder<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListVideoMotionCaptureJobsRequest.class,
                    ListVideoMotionCaptureJobsResponse.class)
                .withName("ListVideoMotionCaptureJobs")
                .withUri("/v1/{project_id}/video-motion-capture-jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJob =
        genForshowVideoMotionCaptureJob();

    private static HttpRequestDef<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> genForshowVideoMotionCaptureJob() {
        // basic
        HttpRequestDef.Builder<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVideoMotionCaptureJobRequest.class,
                    ShowVideoMotionCaptureJobResponse.class)
                .withName("ShowVideoMotionCaptureJob")
                .withUri("/v1/{project_id}/video-motion-capture-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJob =
        genForstopVideoMotionCaptureJob();

    private static HttpRequestDef<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> genForstopVideoMotionCaptureJob() {
        // basic
        HttpRequestDef.Builder<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StopVideoMotionCaptureJobRequest.class,
                    StopVideoMotionCaptureJobResponse.class)
                .withName("StopVideoMotionCaptureJob")
                .withUri("/v1/{project_id}/video-motion-capture-jobs/{job_id}/finish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

}

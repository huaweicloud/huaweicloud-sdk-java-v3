package com.huaweicloud.sdk.frs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.frs.v2.model.*;

@SuppressWarnings("unchecked")
public class FrsMeta {

    public static final HttpRequestDef<AddFacesByBase64Request, AddFacesByBase64Response> addFacesByBase64 =
        genForaddFacesByBase64();

    private static HttpRequestDef<AddFacesByBase64Request, AddFacesByBase64Response> genForaddFacesByBase64() {
        // basic
        HttpRequestDef.Builder<AddFacesByBase64Request, AddFacesByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFacesByBase64Request.class, AddFacesByBase64Response.class)
                .withName("AddFacesByBase64")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByBase64Request::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<AddFacesBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFacesBase64Req.class),
            f -> f.withMarshaller(AddFacesByBase64Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFacesByFileRequest, AddFacesByFileResponse> addFacesByFile =
        genForaddFacesByFile();

    private static HttpRequestDef<AddFacesByFileRequest, AddFacesByFileResponse> genForaddFacesByFile() {
        // basic
        HttpRequestDef.Builder<AddFacesByFileRequest, AddFacesByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFacesByFileRequest.class, AddFacesByFileResponse.class)
                .withName("AddFacesByFile")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByFileRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<AddFacesByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddFacesByFileRequestBody.class),
            f -> f.withMarshaller(AddFacesByFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFacesByUrlRequest, AddFacesByUrlResponse> addFacesByUrl =
        genForaddFacesByUrl();

    private static HttpRequestDef<AddFacesByUrlRequest, AddFacesByUrlResponse> genForaddFacesByUrl() {
        // basic
        HttpRequestDef.Builder<AddFacesByUrlRequest, AddFacesByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFacesByUrlRequest.class, AddFacesByUrlResponse.class)
                .withName("AddFacesByUrl")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFacesByUrlRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<AddFacesUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFacesUrlReq.class),
            f -> f.withMarshaller(AddFacesByUrlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFacesRequest, BatchDeleteFacesResponse> batchDeleteFaces =
        genForbatchDeleteFaces();

    private static HttpRequestDef<BatchDeleteFacesRequest, BatchDeleteFacesResponse> genForbatchDeleteFaces() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFacesRequest, BatchDeleteFacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteFacesRequest.class, BatchDeleteFacesResponse.class)
                .withName("BatchDeleteFaces")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces/batch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteFacesRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<DeleteFacesBatchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFacesBatchReq.class),
            f -> f.withMarshaller(BatchDeleteFacesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareFaceByBase64Request, CompareFaceByBase64Response> compareFaceByBase64 =
        genForcompareFaceByBase64();

    private static HttpRequestDef<CompareFaceByBase64Request, CompareFaceByBase64Response> genForcompareFaceByBase64() {
        // basic
        HttpRequestDef.Builder<CompareFaceByBase64Request, CompareFaceByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CompareFaceByBase64Request.class, CompareFaceByBase64Response.class)
                .withName("CompareFaceByBase64")
                .withUri("/v2/{project_id}/face-compare")
                .withContentType("application/json");

        // requests
        builder.<FaceCompareBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceCompareBase64Req.class),
            f -> f.withMarshaller(CompareFaceByBase64Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareFaceByFileRequest, CompareFaceByFileResponse> compareFaceByFile =
        genForcompareFaceByFile();

    private static HttpRequestDef<CompareFaceByFileRequest, CompareFaceByFileResponse> genForcompareFaceByFile() {
        // basic
        HttpRequestDef.Builder<CompareFaceByFileRequest, CompareFaceByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CompareFaceByFileRequest.class, CompareFaceByFileResponse.class)
                .withName("CompareFaceByFile")
                .withUri("/v2/{project_id}/face-compare")
                .withContentType("multipart/form-data");

        // requests
        builder.<CompareFaceByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CompareFaceByFileRequestBody.class),
            f -> f.withMarshaller(CompareFaceByFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareFaceByUrlRequest, CompareFaceByUrlResponse> compareFaceByUrl =
        genForcompareFaceByUrl();

    private static HttpRequestDef<CompareFaceByUrlRequest, CompareFaceByUrlResponse> genForcompareFaceByUrl() {
        // basic
        HttpRequestDef.Builder<CompareFaceByUrlRequest, CompareFaceByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CompareFaceByUrlRequest.class, CompareFaceByUrlResponse.class)
                .withName("CompareFaceByUrl")
                .withUri("/v2/{project_id}/face-compare")
                .withContentType("application/json");

        // requests
        builder.<FaceCompareUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceCompareUrlReq.class),
            f -> f.withMarshaller(CompareFaceByUrlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFaceSetRequest, CreateFaceSetResponse> createFaceSet =
        genForcreateFaceSet();

    private static HttpRequestDef<CreateFaceSetRequest, CreateFaceSetResponse> genForcreateFaceSet() {
        // basic
        HttpRequestDef.Builder<CreateFaceSetRequest, CreateFaceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFaceSetRequest.class, CreateFaceSetResponse.class)
                .withName("CreateFaceSet")
                .withUri("/v2/{project_id}/face-sets")
                .withContentType("application/json");

        // requests
        builder.<CreateFaceSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFaceSetReq.class),
            f -> f.withMarshaller(CreateFaceSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageId =
        genFordeleteFaceByExternalImageId();

    private static HttpRequestDef<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> genFordeleteFaceByExternalImageId() {
        // basic
        HttpRequestDef.Builder<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteFaceByExternalImageIdRequest.class,
                    DeleteFaceByExternalImageIdResponse.class)
                .withName("DeleteFaceByExternalImageId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByExternalImageIdRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<String>withRequestField("external_image_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByExternalImageIdRequest::getExternalImageId, (req, v) -> {
                req.setExternalImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> deleteFaceByFaceId =
        genFordeleteFaceByFaceId();

    private static HttpRequestDef<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> genFordeleteFaceByFaceId() {
        // basic
        HttpRequestDef.Builder<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFaceByFaceIdRequest.class, DeleteFaceByFaceIdResponse.class)
                .withName("DeleteFaceByFaceId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByFaceIdRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<String>withRequestField("face_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceByFaceIdRequest::getFaceId, (req, v) -> {
                req.setFaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFaceSetRequest, DeleteFaceSetResponse> deleteFaceSet =
        genFordeleteFaceSet();

    private static HttpRequestDef<DeleteFaceSetRequest, DeleteFaceSetResponse> genFordeleteFaceSet() {
        // basic
        HttpRequestDef.Builder<DeleteFaceSetRequest, DeleteFaceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFaceSetRequest.class, DeleteFaceSetResponse.class)
                .withName("DeleteFaceSet")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFaceSetRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByBase64Request, DetectFaceByBase64Response> detectFaceByBase64 =
        genFordetectFaceByBase64();

    private static HttpRequestDef<DetectFaceByBase64Request, DetectFaceByBase64Response> genFordetectFaceByBase64() {
        // basic
        HttpRequestDef.Builder<DetectFaceByBase64Request, DetectFaceByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectFaceByBase64Request.class, DetectFaceByBase64Response.class)
                .withName("DetectFaceByBase64")
                .withUri("/v2/{project_id}/face-detect")
                .withContentType("application/json");

        // requests
        builder.<FaceDetectBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceDetectBase64Req.class),
            f -> f.withMarshaller(DetectFaceByBase64Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByFileRequest, DetectFaceByFileResponse> detectFaceByFile =
        genFordetectFaceByFile();

    private static HttpRequestDef<DetectFaceByFileRequest, DetectFaceByFileResponse> genFordetectFaceByFile() {
        // basic
        HttpRequestDef.Builder<DetectFaceByFileRequest, DetectFaceByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectFaceByFileRequest.class, DetectFaceByFileResponse.class)
                .withName("DetectFaceByFile")
                .withUri("/v2/{project_id}/face-detect")
                .withContentType("multipart/form-data");

        // requests
        builder.<DetectFaceByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetectFaceByFileRequestBody.class),
            f -> f.withMarshaller(DetectFaceByFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetectFaceByUrlRequest, DetectFaceByUrlResponse> detectFaceByUrl =
        genFordetectFaceByUrl();

    private static HttpRequestDef<DetectFaceByUrlRequest, DetectFaceByUrlResponse> genFordetectFaceByUrl() {
        // basic
        HttpRequestDef.Builder<DetectFaceByUrlRequest, DetectFaceByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetectFaceByUrlRequest.class, DetectFaceByUrlResponse.class)
                .withName("DetectFaceByUrl")
                .withUri("/v2/{project_id}/face-detect")
                .withContentType("application/json");

        // requests
        builder.<FaceDetectUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceDetectUrlReq.class),
            f -> f.withMarshaller(DetectFaceByUrlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByBase64Request, SearchFaceByBase64Response> searchFaceByBase64 =
        genForsearchFaceByBase64();

    private static HttpRequestDef<SearchFaceByBase64Request, SearchFaceByBase64Response> genForsearchFaceByBase64() {
        // basic
        HttpRequestDef.Builder<SearchFaceByBase64Request, SearchFaceByBase64Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByBase64Request.class, SearchFaceByBase64Response.class)
                .withName("SearchFaceByBase64")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByBase64Request::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<FaceSearchBase64Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceSearchBase64Req.class),
            f -> f.withMarshaller(SearchFaceByBase64Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> searchFaceByFaceId =
        genForsearchFaceByFaceId();

    private static HttpRequestDef<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> genForsearchFaceByFaceId() {
        // basic
        HttpRequestDef.Builder<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByFaceIdRequest.class, SearchFaceByFaceIdResponse.class)
                .withName("SearchFaceByFaceId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByFaceIdRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<FaceSearchFaceIdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceSearchFaceIdReq.class),
            f -> f.withMarshaller(SearchFaceByFaceIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByFileRequest, SearchFaceByFileResponse> searchFaceByFile =
        genForsearchFaceByFile();

    private static HttpRequestDef<SearchFaceByFileRequest, SearchFaceByFileResponse> genForsearchFaceByFile() {
        // basic
        HttpRequestDef.Builder<SearchFaceByFileRequest, SearchFaceByFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByFileRequest.class, SearchFaceByFileResponse.class)
                .withName("SearchFaceByFile")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByFileRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<SearchFaceByFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchFaceByFileRequestBody.class),
            f -> f.withMarshaller(SearchFaceByFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchFaceByUrlRequest, SearchFaceByUrlResponse> searchFaceByUrl =
        genForsearchFaceByUrl();

    private static HttpRequestDef<SearchFaceByUrlRequest, SearchFaceByUrlResponse> genForsearchFaceByUrl() {
        // basic
        HttpRequestDef.Builder<SearchFaceByUrlRequest, SearchFaceByUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchFaceByUrlRequest.class, SearchFaceByUrlResponse.class)
                .withName("SearchFaceByUrl")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFaceByUrlRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<FaceSearchUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FaceSearchUrlReq.class),
            f -> f.withMarshaller(SearchFaceByUrlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> showAllFaceSets =
        genForshowAllFaceSets();

    private static HttpRequestDef<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> genForshowAllFaceSets() {
        // basic
        HttpRequestDef.Builder<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAllFaceSetsRequest.class, ShowAllFaceSetsResponse.class)
                .withName("ShowAllFaceSets")
                .withUri("/v2/{project_id}/face-sets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFaceSetRequest, ShowFaceSetResponse> showFaceSet = genForshowFaceSet();

    private static HttpRequestDef<ShowFaceSetRequest, ShowFaceSetResponse> genForshowFaceSet() {
        // basic
        HttpRequestDef.Builder<ShowFaceSetRequest, ShowFaceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFaceSetRequest.class, ShowFaceSetResponse.class)
                .withName("ShowFaceSet")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFaceSetRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> showFacesByFaceId =
        genForshowFacesByFaceId();

    private static HttpRequestDef<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> genForshowFacesByFaceId() {
        // basic
        HttpRequestDef.Builder<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFacesByFaceIdRequest.class, ShowFacesByFaceIdResponse.class)
                .withName("ShowFacesByFaceId")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByFaceIdRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<String>withRequestField("face_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByFaceIdRequest::getFaceId, (req, v) -> {
                req.setFaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFacesByLimitRequest, ShowFacesByLimitResponse> showFacesByLimit =
        genForshowFacesByLimit();

    private static HttpRequestDef<ShowFacesByLimitRequest, ShowFacesByLimitResponse> genForshowFacesByLimit() {
        // basic
        HttpRequestDef.Builder<ShowFacesByLimitRequest, ShowFacesByLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFacesByLimitRequest.class, ShowFacesByLimitResponse.class)
                .withName("ShowFacesByLimit")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFacesByLimitRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFacesByLimitRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFacesByLimitRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFaceRequest, UpdateFaceResponse> updateFace = genForupdateFace();

    private static HttpRequestDef<UpdateFaceRequest, UpdateFaceResponse> genForupdateFace() {
        // basic
        HttpRequestDef.Builder<UpdateFaceRequest, UpdateFaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFaceRequest.class, UpdateFaceResponse.class)
                .withName("UpdateFace")
                .withUri("/v2/{project_id}/face-sets/{face_set_name}/faces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("face_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFaceRequest::getFaceSetName, (req, v) -> {
                req.setFaceSetName(v);
            }));
        builder.<UpdateFaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFaceReq.class),
            f -> f.withMarshaller(UpdateFaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

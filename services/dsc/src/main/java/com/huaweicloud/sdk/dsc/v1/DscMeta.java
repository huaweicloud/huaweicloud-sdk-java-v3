package com.huaweicloud.sdk.dsc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dsc.v1.model.*;

@SuppressWarnings("unchecked")
public class DscMeta {

    public static final HttpRequestDef<BatchAddDataMaskRequest, BatchAddDataMaskResponse> batchAddDataMask =
        genForbatchAddDataMask();

    private static HttpRequestDef<BatchAddDataMaskRequest, BatchAddDataMaskResponse> genForbatchAddDataMask() {
        // basic
        HttpRequestDef.Builder<BatchAddDataMaskRequest, BatchAddDataMaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddDataMaskRequest.class, BatchAddDataMaskResponse.class)
                .withName("BatchAddDataMask")
                .withUri("/v1/{project_id}/data/mask")
                .withContentType("application/json");

        // requests
        builder.<DynamicDataMask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DynamicDataMask.class),
            f -> f.withMarshaller(BatchAddDataMaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> createDatabaseWaterMark =
        genForcreateDatabaseWaterMark();

    private static HttpRequestDef<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> genForcreateDatabaseWaterMark() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseWaterMarkRequest, CreateDatabaseWaterMarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDatabaseWaterMarkRequest.class, CreateDatabaseWaterMarkResponse.class)
            .withName("CreateDatabaseWaterMark")
            .withUri("/v1/{project_id}/sdg/database/watermark/embed")
            .withContentType("application/json");

        // requests
        builder.<EmbeddedDatabaseWatermark>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EmbeddedDatabaseWatermark.class),
            f -> f.withMarshaller(CreateDatabaseWaterMarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDocWatermarkRequest, CreateDocWatermarkResponse> createDocWatermark =
        genForcreateDocWatermark();

    private static HttpRequestDef<CreateDocWatermarkRequest, CreateDocWatermarkResponse> genForcreateDocWatermark() {
        // basic
        HttpRequestDef.Builder<CreateDocWatermarkRequest, CreateDocWatermarkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDocWatermarkRequest.class, CreateDocWatermarkResponse.class)
                .withName("CreateDocWatermark")
                .withUri("/v1/{project_id}/sdg/doc/watermark/embed")
                .withContentType("multipart/form-data");

        // requests
        builder.<CreateDocWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDocWatermarkRequestBody.class),
            f -> f.withMarshaller(CreateDocWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageWatermarkRequest, CreateImageWatermarkResponse> createImageWatermark =
        genForcreateImageWatermark();

    private static HttpRequestDef<CreateImageWatermarkRequest, CreateImageWatermarkResponse> genForcreateImageWatermark() {
        // basic
        HttpRequestDef.Builder<CreateImageWatermarkRequest, CreateImageWatermarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateImageWatermarkRequest.class, CreateImageWatermarkResponse.class)
            .withName("CreateImageWatermark")
            .withUri("/v1/{project_id}/image/watermark/embed")
            .withContentType("multipart/form-data");

        // requests
        builder.<CreateImageWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageWatermarkRequestBody.class),
            f -> f.withMarshaller(CreateImageWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> showDatabaseWaterMark =
        genForshowDatabaseWaterMark();

    private static HttpRequestDef<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> genForshowDatabaseWaterMark() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseWaterMarkRequest, ShowDatabaseWaterMarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowDatabaseWaterMarkRequest.class, ShowDatabaseWaterMarkResponse.class)
            .withName("ShowDatabaseWaterMark")
            .withUri("/v1/{project_id}/sdg/database/watermark/extract")
            .withContentType("application/json");

        // requests
        builder.<ExtractedDatabaseWatermark>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtractedDatabaseWatermark.class),
            f -> f.withMarshaller(ShowDatabaseWaterMarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDocWatermarkRequest, ShowDocWatermarkResponse> showDocWatermark =
        genForshowDocWatermark();

    private static HttpRequestDef<ShowDocWatermarkRequest, ShowDocWatermarkResponse> genForshowDocWatermark() {
        // basic
        HttpRequestDef.Builder<ShowDocWatermarkRequest, ShowDocWatermarkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDocWatermarkRequest.class, ShowDocWatermarkResponse.class)
                .withName("ShowDocWatermark")
                .withUri("/v1/{project_id}/sdg/doc/watermark/extract")
                .withContentType("multipart/form-data");

        // requests
        builder.<ShowDocWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDocWatermarkRequestBody.class),
            f -> f.withMarshaller(ShowDocWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageWatermarkRequest, ShowImageWatermarkResponse> showImageWatermark =
        genForshowImageWatermark();

    private static HttpRequestDef<ShowImageWatermarkRequest, ShowImageWatermarkResponse> genForshowImageWatermark() {
        // basic
        HttpRequestDef.Builder<ShowImageWatermarkRequest, ShowImageWatermarkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowImageWatermarkRequest.class, ShowImageWatermarkResponse.class)
                .withName("ShowImageWatermark")
                .withUri("/v1/{project_id}/image/watermark/extract")
                .withContentType("multipart/form-data");

        // requests
        builder.<ShowImageWatermarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowImageWatermarkRequestBody.class),
            f -> f.withMarshaller(ShowImageWatermarkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScanJobResultsRequest, ShowScanJobResultsResponse> showScanJobResults =
        genForshowScanJobResults();

    private static HttpRequestDef<ShowScanJobResultsRequest, ShowScanJobResultsResponse> genForshowScanJobResults() {
        // basic
        HttpRequestDef.Builder<ShowScanJobResultsRequest, ShowScanJobResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScanJobResultsRequest.class, ShowScanJobResultsResponse.class)
                .withName("ShowScanJobResults")
                .withUri("/v1/{project_id}/sdg/scan/job/{job_id}/results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowScanJobResultsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowScanJobResultsRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobResultsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScanJobsRequest, ShowScanJobsResponse> showScanJobs = genForshowScanJobs();

    private static HttpRequestDef<ShowScanJobsRequest, ShowScanJobsResponse> genForshowScanJobs() {
        // basic
        HttpRequestDef.Builder<ShowScanJobsRequest, ShowScanJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScanJobsRequest.class, ShowScanJobsResponse.class)
                .withName("ShowScanJobs")
                .withUri("/v1/{project_id}/sdg/scan/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("content",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getContent, (req, v) -> {
                req.setContent(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScanJobsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

}

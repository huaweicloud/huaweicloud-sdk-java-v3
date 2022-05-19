package com.huaweicloud.sdk.cse.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cse.v1.model.*;

@SuppressWarnings("unchecked")
public class CseMeta {

    public static final HttpRequestDef<CreateEngineRequest, CreateEngineResponse> createEngine = genForcreateEngine();

    private static HttpRequestDef<CreateEngineRequest, CreateEngineResponse> genForcreateEngine() {
        // basic
        HttpRequestDef.Builder<CreateEngineRequest, CreateEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEngineRequest.class, CreateEngineResponse.class)
                .withName("CreateEngine")
                .withUri("/v2/{project_id}/enginemgr/engines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<EngineCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineCreateReq.class),
            f -> f.withMarshaller(CreateEngineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEngineRequest, DeleteEngineResponse> deleteEngine = genFordeleteEngine();

    private static HttpRequestDef<DeleteEngineRequest, DeleteEngineResponse> genFordeleteEngine() {
        // basic
        HttpRequestDef.Builder<DeleteEngineRequest, DeleteEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEngineRequest.class, DeleteEngineResponse.class)
                .withName("DeleteEngine")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEngineRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKieRequest, DownloadKieResponse> downloadKie = genFordownloadKie();

    private static HttpRequestDef<DownloadKieRequest, DownloadKieResponse> genFordownloadKie() {
        // basic
        HttpRequestDef.Builder<DownloadKieRequest, DownloadKieResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadKieRequest.class, DownloadKieResponse.class)
                .withName("DownloadKie")
                .withUri("/v1/{project_id}/kie/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<DownloadKieRequest.MatchEnum>withRequestField("match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadKieRequest.MatchEnum.class),
            f -> f.withMarshaller(DownloadKieRequest::getMatch, (req, v) -> {
                req.setMatch(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<DownloadKieReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadKieReqBody.class),
            f -> f.withMarshaller(DownloadKieRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnginesRequest, ListEnginesResponse> listEngines = genForlistEngines();

    private static HttpRequestDef<ListEnginesRequest, ListEnginesResponse> genForlistEngines() {
        // basic
        HttpRequestDef.Builder<ListEnginesRequest, ListEnginesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnginesRequest.class, ListEnginesResponse.class)
                .withName("ListEngines")
                .withUri("/v2/{project_id}/enginemgr/engines")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnginesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnginesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v2/{project_id}/enginemgr/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("spec_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecType, (req, v) -> {
                req.setSpecType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineRequest, ShowEngineResponse> showEngine = genForshowEngine();

    private static HttpRequestDef<ShowEngineRequest, ShowEngineResponse> genForshowEngine() {
        // basic
        HttpRequestDef.Builder<ShowEngineRequest, ShowEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEngineRequest.class, ShowEngineResponse.class)
                .withName("ShowEngine")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJob =
        genForshowEngineJob();

    private static HttpRequestDef<ShowEngineJobRequest, ShowEngineJobResponse> genForshowEngineJob() {
        // basic
        HttpRequestDef.Builder<ShowEngineJobRequest, ShowEngineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEngineJobRequest.class, ShowEngineJobResponse.class)
                .withName("ShowEngineJob")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadKieRequest, UploadKieResponse> uploadKie = genForuploadKie();

    private static HttpRequestDef<UploadKieRequest, UploadKieResponse> genForuploadKie() {
        // basic
        HttpRequestDef.Builder<UploadKieRequest, UploadKieResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadKieRequest.class, UploadKieResponse.class)
                .withName("UploadKie")
                .withUri("/v1/{project_id}/kie/file")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadKieRequest.OverrideEnum>withRequestField("override",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadKieRequest.OverrideEnum.class),
            f -> f.withMarshaller(UploadKieRequest::getOverride, (req, v) -> {
                req.setOverride(v);
            }));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<UploadKieRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadKieRequestBody.class),
            f -> f.withMarshaller(UploadKieRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

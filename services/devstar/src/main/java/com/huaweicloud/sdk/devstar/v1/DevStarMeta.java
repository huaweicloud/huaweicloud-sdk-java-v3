package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.devstar.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DevStarMeta {

    public static final HttpRequestDef<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> downloadApplicationCode = genFordownloadApplicationCode();

    private static HttpRequestDef<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> genFordownloadApplicationCode() {
        // basic
        HttpRequestDef.Builder<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadApplicationCodeRequest.class, DownloadApplicationCodeResponse.class)
                .withName("DownloadApplicationCode")
                .withUri("/v1/application-codes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadApplicationCodeRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            DownloadApplicationCodeRequest.XLanguageEnum.class,
            f -> f.withMarshaller(DownloadApplicationCodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> runCodehubTemplateJob = genForrunCodehubTemplateJob();

    private static HttpRequestDef<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> genForrunCodehubTemplateJob() {
        // basic
        HttpRequestDef.Builder<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunCodehubTemplateJobRequest.class, RunCodehubTemplateJobResponse.class)
                .withName("RunCodehubTemplateJob")
                .withUri("/v1/jobs/codehub")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            RunCodehubTemplateJobRequest.XLanguageEnum.class,
            f -> f.withMarshaller(RunCodehubTemplateJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CodehubJobInfo.class,
            f -> f.withMarshaller(RunCodehubTemplateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJob = genForrunDevstarTemplateJob();

    private static HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> genForrunDevstarTemplateJob() {
        // basic
        HttpRequestDef.Builder<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunDevstarTemplateJobRequest.class, RunDevstarTemplateJobResponse.class)
                .withName("RunDevstarTemplateJob")
                .withUri("/v1/jobs/template")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            RunDevstarTemplateJobRequest.XLanguageEnum.class,
            f -> f.withMarshaller(RunDevstarTemplateJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TemplateJobInfo.class,
            f -> f.withMarshaller(RunDevstarTemplateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail = genForshowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForshowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v1/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ShowJobDetailRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ShowJobDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateFileRequest, ShowTemplateFileResponse> showTemplateFile = genForshowTemplateFile();

    private static HttpRequestDef<ShowTemplateFileRequest, ShowTemplateFileResponse> genForshowTemplateFile() {
        // basic
        HttpRequestDef.Builder<ShowTemplateFileRequest, ShowTemplateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateFileRequest.class, ShowTemplateFileResponse.class)
                .withName("ShowTemplateFile")
                .withUri("/v1/templates/{template_id}/files")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTemplateFileRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTemplateFileRequest::getFilePath, (req, v) -> {
                req.setFilePath(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ShowTemplateFileRequest.TypeEnum.class,
            f -> f.withMarshaller(ShowTemplateFileRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ShowTemplateFileRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ShowTemplateFileRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> createTemplateViewHistories = genForcreateTemplateViewHistories();

    private static HttpRequestDef<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> genForcreateTemplateViewHistories() {
        // basic
        HttpRequestDef.Builder<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateViewHistoriesRequest.class, CreateTemplateViewHistoriesResponse.class)
                .withName("CreateTemplateViewHistories")
                .withUri("/v1/templates/view-histories")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            CreateTemplateViewHistoriesRequest.XLanguageEnum.class,
            f -> f.withMarshaller(CreateTemplateViewHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TemplatesInfo.class,
            f -> f.withMarshaller(CreateTemplateViewHistoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplates = genForlistPublishedTemplates();

    private static HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> genForlistPublishedTemplates() {
        // basic
        HttpRequestDef.Builder<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublishedTemplatesRequest.class, ListPublishedTemplatesResponse.class)
                .withName("ListPublishedTemplates")
                .withUri("/v1/templates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListPublishedTemplatesRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> listTemplateViewHistories = genForlistTemplateViewHistories();

    private static HttpRequestDef<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> genForlistTemplateViewHistories() {
        // basic
        HttpRequestDef.Builder<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateViewHistoriesRequest.class, ListTemplateViewHistoriesResponse.class)
                .withName("ListTemplateViewHistories")
                .withUri("/v1/templates/view-histories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("platform_source",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListTemplateViewHistoriesRequest.PlatformSourceEnum.class,
            f -> f.withMarshaller(ListTemplateViewHistoriesRequest::getPlatformSource, (req, v) -> {
                req.setPlatformSource(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListTemplateViewHistoriesRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListTemplateViewHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesV2Request, ListTemplatesV2Response> listTemplatesV2 = genForlistTemplatesV2();

    private static HttpRequestDef<ListTemplatesV2Request, ListTemplatesV2Response> genForlistTemplatesV2() {
        // basic
        HttpRequestDef.Builder<ListTemplatesV2Request, ListTemplatesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTemplatesV2Request.class, ListTemplatesV2Response.class)
                .withName("ListTemplatesV2")
                .withUri("/v2/templates/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTemplatesV2Request::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListTemplatesV2Request.XLanguageEnum.class,
            f -> f.withMarshaller(ListTemplatesV2Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TemplateQueryV2.class,
            f -> f.withMarshaller(ListTemplatesV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateV3Request, ShowTemplateV3Response> showTemplateV3 = genForshowTemplateV3();

    private static HttpRequestDef<ShowTemplateV3Request, ShowTemplateV3Response> genForshowTemplateV3() {
        // basic
        HttpRequestDef.Builder<ShowTemplateV3Request, ShowTemplateV3Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateV3Request.class, ShowTemplateV3Response.class)
                .withName("ShowTemplateV3")
                .withUri("/v3/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTemplateV3Request::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ShowTemplateV3Request.XLanguageEnum.class,
            f -> f.withMarshaller(ShowTemplateV3Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetail = genForshowTemplateDetail();

    private static HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> genForshowTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowTemplateDetailRequest, ShowTemplateDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateDetailRequest.class, ShowTemplateDetailResponse.class)
                .withName("ShowTemplateDetail")
                .withUri("/v1/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ShowTemplateDetailRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ShowTemplateDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

}

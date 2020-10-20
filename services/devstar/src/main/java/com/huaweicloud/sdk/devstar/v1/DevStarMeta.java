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
                .withUri("/v1/application-codes");

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

    public static final HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJob = genForrunDevstarTemplateJob();

    private static HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> genForrunDevstarTemplateJob() {
        // basic
        HttpRequestDef.Builder<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunDevstarTemplateJobRequest.class, RunDevstarTemplateJobResponse.class)
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
                .withUri("/v1/jobs/{job_id}");

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

    public static final HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplates = genForlistPublishedTemplates();

    private static HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> genForlistPublishedTemplates() {
        // basic
        HttpRequestDef.Builder<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublishedTemplatesRequest.class, ListPublishedTemplatesResponse.class)
                .withUri("/v1/templates");

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

    public static final HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetail = genForshowTemplateDetail();

    private static HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> genForshowTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowTemplateDetailRequest, ShowTemplateDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateDetailRequest.class, ShowTemplateDetailResponse.class)
                .withUri("/v1/templates/{template_id}");

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

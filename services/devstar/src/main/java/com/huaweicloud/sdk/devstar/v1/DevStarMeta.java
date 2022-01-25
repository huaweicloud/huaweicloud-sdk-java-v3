package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.devstar.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class DevStarMeta {

    public static final HttpRequestDef<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse> showApplicationReleaseRepositories =
        genForshowApplicationReleaseRepositories();

    private static HttpRequestDef<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse> genForshowApplicationReleaseRepositories() {
        // basic
        HttpRequestDef.Builder<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowApplicationReleaseRepositoriesRequest.class,
                    ShowApplicationReleaseRepositoriesResponse.class)
                .withName("ShowApplicationReleaseRepositories")
                .withUri("/v1/applications/{application_id}/release-repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ShowApplicationReleaseRepositoriesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationReleaseRepositoriesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse> showApplicationResDeleteStatus =
        genForshowApplicationResDeleteStatus();

    private static HttpRequestDef<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse> genForshowApplicationResDeleteStatus() {
        // basic
        HttpRequestDef.Builder<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowApplicationResDeleteStatusRequest.class,
                    ShowApplicationResDeleteStatusResponse.class)
                .withName("ShowApplicationResDeleteStatus")
                .withUri("/v1/application-resources/{application_id}/delete-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationResDeleteStatusRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ShowApplicationResDeleteStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationResDeleteStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationResDeleteStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse> showApplicationDependentResources =
        genForshowApplicationDependentResources();

    private static HttpRequestDef<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse> genForshowApplicationDependentResources() {
        // basic
        HttpRequestDef.Builder<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowApplicationDependentResourcesRequest.class,
                    ShowApplicationDependentResourcesResponse.class)
                .withName("ShowApplicationDependentResources")
                .withUri("/v3/applications/{application_id}/dependent-resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationDependentResourcesRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ShowApplicationDependentResourcesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationDependentResourcesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationDependentResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationV3Request, ShowApplicationV3Response> showApplicationV3 =
        genForshowApplicationV3();

    private static HttpRequestDef<ShowApplicationV3Request, ShowApplicationV3Response> genForshowApplicationV3() {
        // basic
        HttpRequestDef.Builder<ShowApplicationV3Request, ShowApplicationV3Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationV3Request.class, ShowApplicationV3Response.class)
                .withName("ShowApplicationV3")
                .withUri("/v3/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationV3Request::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ShowApplicationV3Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationV3Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationV3Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> updateApplication =
        genForupdateApplication();

    private static HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> genForupdateApplication() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationRequest, UpdateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApplicationRequest.class, UpdateApplicationResponse.class)
                .withName("UpdateApplication")
                .withUri("/v3/applications/{application_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<UpdateApplicationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateApplicationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ApplicationModifyInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplicationModifyInfo.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationV4Request, DeleteApplicationV4Response> deleteApplicationV4 =
        genFordeleteApplicationV4();

    private static HttpRequestDef<DeleteApplicationV4Request, DeleteApplicationV4Response> genFordeleteApplicationV4() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationV4Request, DeleteApplicationV4Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteApplicationV4Request.class, DeleteApplicationV4Response.class)
            .withName("DeleteApplicationV4")
            .withUri("/v4/applications/{application_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationV4Request::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<Boolean>withRequestField("is_delete_repository",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteApplicationV4Request::getIsDeleteRepository, (req, v) -> {
                req.setIsDeleteRepository(v);
            }));
        builder.<String>withRequestField("pipeline_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationV4Request::getPipelineIds, (req, v) -> {
                req.setPipelineIds(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsV6Request, ListApplicationsV6Response> listApplicationsV6 =
        genForlistApplicationsV6();

    private static HttpRequestDef<ListApplicationsV6Request, ListApplicationsV6Response> genForlistApplicationsV6() {
        // basic
        HttpRequestDef.Builder<ListApplicationsV6Request, ListApplicationsV6Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicationsV6Request.class, ListApplicationsV6Response.class)
                .withName("ListApplicationsV6")
                .withUri("/v6/applications")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("attention",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getAttention, (req, v) -> {
                req.setAttention(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getTopicId, (req, v) -> {
                req.setTopicId(v);
            }));
        builder.<Boolean>withRequestField("is_created_by_self",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getIsCreatedBySelf, (req, v) -> {
                req.setIsCreatedBySelf(v);
            }));
        builder.<List<ListApplicationsV6Request.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListApplicationsV6Request.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListApplicationsV6Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplicationsV6Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> downloadApplicationCode =
        genFordownloadApplicationCode();

    private static HttpRequestDef<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> genFordownloadApplicationCode() {
        // basic
        HttpRequestDef.Builder<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadApplicationCodeRequest.class, DownloadApplicationCodeResponse.class)
            .withName("DownloadApplicationCode")
            .withUri("/v1/application-codes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadApplicationCodeRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<DownloadApplicationCodeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadApplicationCodeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadApplicationCodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse> createDeploymentJobs =
        genForcreateDeploymentJobs();

    private static HttpRequestDef<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse> genForcreateDeploymentJobs() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDeploymentJobsRequest.class, CreateDeploymentJobsResponse.class)
            .withName("CreateDeploymentJobs")
            .withUri("/v1/applications/{application_id}/environments/{environment_tag}/deployment-jobs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getEnvironmentTag, (req, v) -> {
                req.setEnvironmentTag(v);
            }));
        builder.<CreateDeploymentJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDeploymentJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateDeploymentJobsParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeploymentJobsParams.class),
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse> showDeploymentJobs =
        genForshowDeploymentJobs();

    private static HttpRequestDef<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse> genForshowDeploymentJobs() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentJobsRequest.class, ShowDeploymentJobsResponse.class)
                .withName("ShowDeploymentJobs")
                .withUri("/v1/applications/{application_id}/environments/{environment_tag}/deployment-jobs/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentJobsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentJobsRequest::getEnvironmentTag, (req, v) -> {
                req.setEnvironmentTag(v);
            }));
        builder.<ShowDeploymentJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDeploymentJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDeploymentJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> runCodehubTemplateJob =
        genForrunCodehubTemplateJob();

    private static HttpRequestDef<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> genForrunCodehubTemplateJob() {
        // basic
        HttpRequestDef.Builder<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunCodehubTemplateJobRequest.class, RunCodehubTemplateJobResponse.class)
            .withName("RunCodehubTemplateJob")
            .withUri("/v1/jobs/codehub")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RunCodehubTemplateJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunCodehubTemplateJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(RunCodehubTemplateJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CodehubJobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodehubJobInfo.class),
            f -> f.withMarshaller(RunCodehubTemplateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJob =
        genForrunDevstarTemplateJob();

    private static HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> genForrunDevstarTemplateJob() {
        // basic
        HttpRequestDef.Builder<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunDevstarTemplateJobRequest.class, RunDevstarTemplateJobResponse.class)
            .withName("RunDevstarTemplateJob")
            .withUri("/v1/jobs/template")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RunDevstarTemplateJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunDevstarTemplateJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(RunDevstarTemplateJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TemplateJobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateJobInfo.class),
            f -> f.withMarshaller(RunDevstarTemplateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForshowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForshowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v1/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowJobDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplates =
        genForlistPipelineTemplates();

    private static HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> genForlistPipelineTemplates() {
        // basic
        HttpRequestDef.Builder<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPipelineTemplatesRequest.class, ListPipelineTemplatesResponse.class)
            .withName("ListPipelineTemplates")
            .withUri("/v1/pipeline-templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response> showPipelineLastStatusV2 =
        genForshowPipelineLastStatusV2();

    private static HttpRequestDef<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response> genForshowPipelineLastStatusV2() {
        // basic
        HttpRequestDef.Builder<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowPipelineLastStatusV2Request.class, ShowPipelineLastStatusV2Response.class)
                .withName("ShowPipelineLastStatusV2")
                .withUri("/v2/pipelines/{pipeline_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPipelineLastStatusV2Request::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<ShowPipelineLastStatusV2Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPipelineLastStatusV2Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowPipelineLastStatusV2Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPipelineRequest, StartPipelineResponse> startPipeline =
        genForstartPipeline();

    private static HttpRequestDef<StartPipelineRequest, StartPipelineResponse> genForstartPipeline() {
        // basic
        HttpRequestDef.Builder<StartPipelineRequest, StartPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartPipelineRequest.class, StartPipelineResponse.class)
                .withName("StartPipeline")
                .withUri("/v2/pipelines/{pipeline_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pipeline_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPipelineRequest::getPipelineId, (req, v) -> {
                req.setPipelineId(v);
            }));
        builder.<StartPipelineRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartPipelineRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartPipelineRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4 =
        genForlistProjectsV4();

    private static HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> genForlistProjectsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectsV4Request, ListProjectsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectsV4Request.class, ListProjectsV4Response.class)
                .withName("ListProjectsV4")
                .withUri("/v4/projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListProjectsV4Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectsV4Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListProjectsV4Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse> checkRepositoryDuplicateName =
        genForcheckRepositoryDuplicateName();

    private static HttpRequestDef<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse> genForcheckRepositoryDuplicateName() {
        // basic
        HttpRequestDef.Builder<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CheckRepositoryDuplicateNameRequest.class,
                    CheckRepositoryDuplicateNameResponse.class)
                .withName("CheckRepositoryDuplicateName")
                .withUri("/v1/check-repository-duplicate-name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse> showRepositoryByCloudIde =
        genForshowRepositoryByCloudIde();

    private static HttpRequestDef<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse> genForshowRepositoryByCloudIde() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRepositoryByCloudIdeRequest.class, ShowRepositoryByCloudIdeResponse.class)
                .withName("ShowRepositoryByCloudIde")
                .withUri("/v1/repositories/{repository_id}/show/cloudide")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<String>withRequestField("repository_ssh_url",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getRepositorySshUrl, (req, v) -> {
                req.setRepositorySshUrl(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("space_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getSpacePrefix, (req, v) -> {
                req.setSpacePrefix(v);
            }));
        builder.<Boolean>withRequestField("is_open_last",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getIsOpenLast, (req, v) -> {
                req.setIsOpenLast(v);
            }));
        builder.<Boolean>withRequestField("is_free",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getIsFree, (req, v) -> {
                req.setIsFree(v);
            }));
        builder.<ShowRepositoryByCloudIdeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRepositoryByCloudIdeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response> showRepositoryStatisticalDataV2 =
        genForshowRepositoryStatisticalDataV2();

    private static HttpRequestDef<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response> genForshowRepositoryStatisticalDataV2() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRepositoryStatisticalDataV2Request.class,
                    ShowRepositoryStatisticalDataV2Response.class)
                .withName("ShowRepositoryStatisticalDataV2")
                .withUri("/v2/repositories/{repository_id}/statistical-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryStatisticalDataV2Request::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<ShowRepositoryStatisticalDataV2Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRepositoryStatisticalDataV2Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowRepositoryStatisticalDataV2Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateFileRequest, ShowTemplateFileResponse> showTemplateFile =
        genForshowTemplateFile();

    private static HttpRequestDef<ShowTemplateFileRequest, ShowTemplateFileResponse> genForshowTemplateFile() {
        // basic
        HttpRequestDef.Builder<ShowTemplateFileRequest, ShowTemplateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateFileRequest.class, ShowTemplateFileResponse.class)
                .withName("ShowTemplateFile")
                .withUri("/v1/templates/{template_id}/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateFileRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateFileRequest::getFilePath, (req, v) -> {
                req.setFilePath(v);
            }));
        builder.<ShowTemplateFileRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateFileRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowTemplateFileRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ShowTemplateFileRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateFileRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowTemplateFileRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> createTemplateViewHistories =
        genForcreateTemplateViewHistories();

    private static HttpRequestDef<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> genForcreateTemplateViewHistories() {
        // basic
        HttpRequestDef.Builder<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTemplateViewHistoriesRequest.class,
                    CreateTemplateViewHistoriesResponse.class)
                .withName("CreateTemplateViewHistories")
                .withUri("/v1/templates/view-histories")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTemplateViewHistoriesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTemplateViewHistoriesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateTemplateViewHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TemplatesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplatesInfo.class),
            f -> f.withMarshaller(CreateTemplateViewHistoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplates =
        genForlistPublishedTemplates();

    private static HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> genForlistPublishedTemplates() {
        // basic
        HttpRequestDef.Builder<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPublishedTemplatesRequest.class, ListPublishedTemplatesResponse.class)
            .withName("ListPublishedTemplates")
            .withUri("/v1/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListPublishedTemplatesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublishedTemplatesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> listTemplateViewHistories =
        genForlistTemplateViewHistories();

    private static HttpRequestDef<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> genForlistTemplateViewHistories() {
        // basic
        HttpRequestDef.Builder<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTemplateViewHistoriesRequest.class,
                    ListTemplateViewHistoriesResponse.class)
                .withName("ListTemplateViewHistories")
                .withUri("/v1/templates/view-histories")
                .withContentType("application/json");

        // requests
        builder.<ListTemplateViewHistoriesRequest.PlatformSourceEnum>withRequestField("platform_source",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTemplateViewHistoriesRequest.PlatformSourceEnum.class),
            f -> f.withMarshaller(ListTemplateViewHistoriesRequest::getPlatformSource, (req, v) -> {
                req.setPlatformSource(v);
            }));
        builder.<ListTemplateViewHistoriesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTemplateViewHistoriesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTemplateViewHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v1/templates/query")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListTemplatesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTemplatesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TemplateQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TemplateQuery.class),
            f -> f.withMarshaller(ListTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesV2Request, ListTemplatesV2Response> listTemplatesV2 =
        genForlistTemplatesV2();

    private static HttpRequestDef<ListTemplatesV2Request, ListTemplatesV2Response> genForlistTemplatesV2() {
        // basic
        HttpRequestDef.Builder<ListTemplatesV2Request, ListTemplatesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTemplatesV2Request.class, ListTemplatesV2Response.class)
                .withName("ListTemplatesV2")
                .withUri("/v2/templates/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesV2Request::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<ListTemplatesV2Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTemplatesV2Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListTemplatesV2Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TemplateQueryV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TemplateQueryV2.class),
            f -> f.withMarshaller(ListTemplatesV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateV3Request, ShowTemplateV3Response> showTemplateV3 =
        genForshowTemplateV3();

    private static HttpRequestDef<ShowTemplateV3Request, ShowTemplateV3Response> genForshowTemplateV3() {
        // basic
        HttpRequestDef.Builder<ShowTemplateV3Request, ShowTemplateV3Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateV3Request.class, ShowTemplateV3Response.class)
                .withName("ShowTemplateV3")
                .withUri("/v3/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateV3Request::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<ShowTemplateV3Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateV3Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowTemplateV3Request::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetail =
        genForshowTemplateDetail();

    private static HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> genForshowTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowTemplateDetailRequest, ShowTemplateDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateDetailRequest.class, ShowTemplateDetailResponse.class)
                .withName("ShowTemplateDetail")
                .withUri("/v1/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<ShowTemplateDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.devstar.v1.model.ApplicationModifyInfo;
import com.huaweicloud.sdk.devstar.v1.model.CheckRepositoryDuplicateNameRequest;
import com.huaweicloud.sdk.devstar.v1.model.CheckRepositoryDuplicateNameResponse;
import com.huaweicloud.sdk.devstar.v1.model.CodehubJobInfo;
import com.huaweicloud.sdk.devstar.v1.model.ConfirmDeploymentJobRequest;
import com.huaweicloud.sdk.devstar.v1.model.ConfirmDeploymentJobResponse;
import com.huaweicloud.sdk.devstar.v1.model.CreateDeploymentJobsParams;
import com.huaweicloud.sdk.devstar.v1.model.CreateDeploymentJobsRequest;
import com.huaweicloud.sdk.devstar.v1.model.CreateDeploymentJobsResponse;
import com.huaweicloud.sdk.devstar.v1.model.CreateTemplateViewHistoriesRequest;
import com.huaweicloud.sdk.devstar.v1.model.CreateTemplateViewHistoriesResponse;
import com.huaweicloud.sdk.devstar.v1.model.DeleteApplicationV4Request;
import com.huaweicloud.sdk.devstar.v1.model.DeleteApplicationV4Response;
import com.huaweicloud.sdk.devstar.v1.model.DeploymentJobConfirmType;
import com.huaweicloud.sdk.devstar.v1.model.DownloadApplicationCodeRequest;
import com.huaweicloud.sdk.devstar.v1.model.DownloadApplicationCodeResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListApplicationsV6Request;
import com.huaweicloud.sdk.devstar.v1.model.ListApplicationsV6Response;
import com.huaweicloud.sdk.devstar.v1.model.ListPipelineTemplatesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListPipelineTemplatesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListProjectsV4Request;
import com.huaweicloud.sdk.devstar.v1.model.ListProjectsV4Response;
import com.huaweicloud.sdk.devstar.v1.model.ListPublishedTemplatesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListPublishedTemplatesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplateViewHistoriesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplateViewHistoriesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesV2Request;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesV2Response;
import com.huaweicloud.sdk.devstar.v1.model.RunCodehubTemplateJobRequest;
import com.huaweicloud.sdk.devstar.v1.model.RunCodehubTemplateJobResponse;
import com.huaweicloud.sdk.devstar.v1.model.RunDevstarTemplateJobRequest;
import com.huaweicloud.sdk.devstar.v1.model.RunDevstarTemplateJobResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationDependentResourcesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationDependentResourcesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationReleaseRepositoriesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationReleaseRepositoriesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationResDeleteStatusRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationResDeleteStatusResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationV3Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationV3Response;
import com.huaweicloud.sdk.devstar.v1.model.ShowDeploymentJobsRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowDeploymentJobsResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowPipelineLastStatusV2Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowPipelineLastStatusV2Response;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryByCloudIdeRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryByCloudIdeResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryStatisticalDataV2Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryStatisticalDataV2Response;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateDetailRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateDetailResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateFileRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateFileResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateV3Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateV3Response;
import com.huaweicloud.sdk.devstar.v1.model.StartPipelineRequest;
import com.huaweicloud.sdk.devstar.v1.model.StartPipelineResponse;
import com.huaweicloud.sdk.devstar.v1.model.TemplateJobInfo;
import com.huaweicloud.sdk.devstar.v1.model.TemplateQuery;
import com.huaweicloud.sdk.devstar.v1.model.TemplateQueryV2;
import com.huaweicloud.sdk.devstar.v1.model.TemplatesInfo;
import com.huaweicloud.sdk.devstar.v1.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.devstar.v1.model.UpdateApplicationResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DevStarMeta {

    public static final HttpRequestDef<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse> showApplicationReleaseRepositories =
        genForShowApplicationReleaseRepositories();

    private static HttpRequestDef<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse> genForShowApplicationReleaseRepositories() {
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
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getApplicationId,
                ShowApplicationReleaseRepositoriesRequest::setApplicationId));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getParentId,
                ShowApplicationReleaseRepositoriesRequest::setParentId));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getKeyword,
                ShowApplicationReleaseRepositoriesRequest::setKeyword));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getLimit,
                ShowApplicationReleaseRepositoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getOffset,
                ShowApplicationReleaseRepositoriesRequest::setOffset));
        builder.<ShowApplicationReleaseRepositoriesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationReleaseRepositoriesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationReleaseRepositoriesRequest::getXLanguage,
                ShowApplicationReleaseRepositoriesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse> showApplicationResDeleteStatus =
        genForShowApplicationResDeleteStatus();

    private static HttpRequestDef<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse> genForShowApplicationResDeleteStatus() {
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
            f -> f.withMarshaller(ShowApplicationResDeleteStatusRequest::getApplicationId,
                ShowApplicationResDeleteStatusRequest::setApplicationId));
        builder.<ShowApplicationResDeleteStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationResDeleteStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationResDeleteStatusRequest::getXLanguage,
                ShowApplicationResDeleteStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse> showApplicationDependentResources =
        genForShowApplicationDependentResources();

    private static HttpRequestDef<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse> genForShowApplicationDependentResources() {
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
            f -> f.withMarshaller(ShowApplicationDependentResourcesRequest::getApplicationId,
                ShowApplicationDependentResourcesRequest::setApplicationId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationDependentResourcesRequest::getLimit,
                ShowApplicationDependentResourcesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationDependentResourcesRequest::getOffset,
                ShowApplicationDependentResourcesRequest::setOffset));
        builder.<ShowApplicationDependentResourcesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationDependentResourcesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationDependentResourcesRequest::getXLanguage,
                ShowApplicationDependentResourcesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationV3Request, ShowApplicationV3Response> showApplicationV3 =
        genForShowApplicationV3();

    private static HttpRequestDef<ShowApplicationV3Request, ShowApplicationV3Response> genForShowApplicationV3() {
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
            f -> f.withMarshaller(ShowApplicationV3Request::getApplicationId,
                ShowApplicationV3Request::setApplicationId));
        builder.<ShowApplicationV3Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationV3Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowApplicationV3Request::getXLanguage, ShowApplicationV3Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> updateApplication =
        genForUpdateApplication();

    private static HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> genForUpdateApplication() {
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
            f -> f.withMarshaller(UpdateApplicationRequest::getApplicationId,
                UpdateApplicationRequest::setApplicationId));
        builder.<UpdateApplicationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateApplicationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getXLanguage, UpdateApplicationRequest::setXLanguage));
        builder.<ApplicationModifyInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplicationModifyInfo.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getBody, UpdateApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationV4Request, DeleteApplicationV4Response> deleteApplicationV4 =
        genForDeleteApplicationV4();

    private static HttpRequestDef<DeleteApplicationV4Request, DeleteApplicationV4Response> genForDeleteApplicationV4() {
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
            f -> f.withMarshaller(DeleteApplicationV4Request::getApplicationId,
                DeleteApplicationV4Request::setApplicationId));
        builder.<Boolean>withRequestField("is_delete_repository",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteApplicationV4Request::getIsDeleteRepository,
                DeleteApplicationV4Request::setIsDeleteRepository));
        builder.<String>withRequestField("pipeline_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationV4Request::getPipelineIds,
                DeleteApplicationV4Request::setPipelineIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsV6Request, ListApplicationsV6Response> listApplicationsV6 =
        genForListApplicationsV6();

    private static HttpRequestDef<ListApplicationsV6Request, ListApplicationsV6Response> genForListApplicationsV6() {
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
            f -> f.withMarshaller(ListApplicationsV6Request::getAttention, ListApplicationsV6Request::setAttention));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getRegionId, ListApplicationsV6Request::setRegionId));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getKeyword, ListApplicationsV6Request::setKeyword));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getProjectId, ListApplicationsV6Request::setProjectId));
        builder.<String>withRequestField("topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getTopicId, ListApplicationsV6Request::setTopicId));
        builder.<Boolean>withRequestField("is_created_by_self",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getIsCreatedBySelf,
                ListApplicationsV6Request::setIsCreatedBySelf));
        builder.<List<ListApplicationsV6Request.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getSortKey, ListApplicationsV6Request::setSortKey));
        builder.<List<ListApplicationsV6Request.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getSortDir, ListApplicationsV6Request::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getLimit, ListApplicationsV6Request::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getOffset, ListApplicationsV6Request::setOffset));
        builder.<ListApplicationsV6Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplicationsV6Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListApplicationsV6Request::getXLanguage, ListApplicationsV6Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> downloadApplicationCode =
        genForDownloadApplicationCode();

    private static HttpRequestDef<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> genForDownloadApplicationCode() {
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
            f -> f.withMarshaller(DownloadApplicationCodeRequest::getJobId, DownloadApplicationCodeRequest::setJobId));
        builder.<DownloadApplicationCodeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadApplicationCodeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadApplicationCodeRequest::getXLanguage,
                DownloadApplicationCodeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse> confirmDeploymentJob =
        genForConfirmDeploymentJob();

    private static HttpRequestDef<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse> genForConfirmDeploymentJob() {
        // basic
        HttpRequestDef.Builder<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ConfirmDeploymentJobRequest.class, ConfirmDeploymentJobResponse.class)
            .withName("ConfirmDeploymentJob")
            .withUri("/v1/applications/{application_id}/environments/{environment_tag}/confirm")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmDeploymentJobRequest::getApplicationId,
                ConfirmDeploymentJobRequest::setApplicationId));
        builder.<String>withRequestField("environment_tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmDeploymentJobRequest::getEnvironmentTag,
                ConfirmDeploymentJobRequest::setEnvironmentTag));
        builder.<ConfirmDeploymentJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfirmDeploymentJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ConfirmDeploymentJobRequest::getXLanguage,
                ConfirmDeploymentJobRequest::setXLanguage));
        builder.<DeploymentJobConfirmType>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentJobConfirmType.class),
            f -> f.withMarshaller(ConfirmDeploymentJobRequest::getBody, ConfirmDeploymentJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse> createDeploymentJobs =
        genForCreateDeploymentJobs();

    private static HttpRequestDef<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse> genForCreateDeploymentJobs() {
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
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getApplicationId,
                CreateDeploymentJobsRequest::setApplicationId));
        builder.<String>withRequestField("environment_tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getEnvironmentTag,
                CreateDeploymentJobsRequest::setEnvironmentTag));
        builder.<CreateDeploymentJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDeploymentJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getXLanguage,
                CreateDeploymentJobsRequest::setXLanguage));
        builder.<CreateDeploymentJobsParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeploymentJobsParams.class),
            f -> f.withMarshaller(CreateDeploymentJobsRequest::getBody, CreateDeploymentJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse> showDeploymentJobs =
        genForShowDeploymentJobs();

    private static HttpRequestDef<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse> genForShowDeploymentJobs() {
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
            f -> f.withMarshaller(ShowDeploymentJobsRequest::getApplicationId,
                ShowDeploymentJobsRequest::setApplicationId));
        builder.<String>withRequestField("environment_tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentJobsRequest::getEnvironmentTag,
                ShowDeploymentJobsRequest::setEnvironmentTag));
        builder.<ShowDeploymentJobsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDeploymentJobsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDeploymentJobsRequest::getXLanguage, ShowDeploymentJobsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> runCodehubTemplateJob =
        genForRunCodehubTemplateJob();

    private static HttpRequestDef<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> genForRunCodehubTemplateJob() {
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
            f -> f.withMarshaller(RunCodehubTemplateJobRequest::getXLanguage,
                RunCodehubTemplateJobRequest::setXLanguage));
        builder.<CodehubJobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodehubJobInfo.class),
            f -> f.withMarshaller(RunCodehubTemplateJobRequest::getBody, RunCodehubTemplateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJob =
        genForRunDevstarTemplateJob();

    private static HttpRequestDef<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> genForRunDevstarTemplateJob() {
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
            f -> f.withMarshaller(RunDevstarTemplateJobRequest::getXLanguage,
                RunDevstarTemplateJobRequest::setXLanguage));
        builder.<TemplateJobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplateJobInfo.class),
            f -> f.withMarshaller(RunDevstarTemplateJobRequest::getBody, RunDevstarTemplateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForShowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForShowJobDetail() {
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
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, ShowJobDetailRequest::setJobId));
        builder.<ShowJobDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getXLanguage, ShowJobDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplates =
        genForListPipelineTemplates();

    private static HttpRequestDef<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> genForListPipelineTemplates() {
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
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getRegionId,
                ListPipelineTemplatesRequest::setRegionId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getOffset, ListPipelineTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getLimit, ListPipelineTemplatesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelineTemplatesRequest::getXLanguage,
                ListPipelineTemplatesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response> showPipelineLastStatusV2 =
        genForShowPipelineLastStatusV2();

    private static HttpRequestDef<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response> genForShowPipelineLastStatusV2() {
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
            f -> f.withMarshaller(ShowPipelineLastStatusV2Request::getPipelineId,
                ShowPipelineLastStatusV2Request::setPipelineId));
        builder.<ShowPipelineLastStatusV2Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPipelineLastStatusV2Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowPipelineLastStatusV2Request::getXLanguage,
                ShowPipelineLastStatusV2Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPipelineRequest, StartPipelineResponse> startPipeline =
        genForStartPipeline();

    private static HttpRequestDef<StartPipelineRequest, StartPipelineResponse> genForStartPipeline() {
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
            f -> f.withMarshaller(StartPipelineRequest::getPipelineId, StartPipelineRequest::setPipelineId));
        builder.<StartPipelineRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartPipelineRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartPipelineRequest::getXLanguage, StartPipelineRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4 =
        genForListProjectsV4();

    private static HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> genForListProjectsV4() {
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
            f -> f.withMarshaller(ListProjectsV4Request::getKeyword, ListProjectsV4Request::setKeyword));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectsV4Request::getLimit, ListProjectsV4Request::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectsV4Request::getOffset, ListProjectsV4Request::setOffset));
        builder.<ListProjectsV4Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProjectsV4Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListProjectsV4Request::getXLanguage, ListProjectsV4Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse> checkRepositoryDuplicateName =
        genForCheckRepositoryDuplicateName();

    private static HttpRequestDef<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse> genForCheckRepositoryDuplicateName() {
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
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getProjectId,
                CheckRepositoryDuplicateNameRequest::setProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getName,
                CheckRepositoryDuplicateNameRequest::setName));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getRegionId,
                CheckRepositoryDuplicateNameRequest::setRegionId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRepositoryDuplicateNameRequest::getXLanguage,
                CheckRepositoryDuplicateNameRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse> showRepositoryByCloudIde =
        genForShowRepositoryByCloudIde();

    private static HttpRequestDef<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse> genForShowRepositoryByCloudIde() {
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
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getRepositoryId,
                ShowRepositoryByCloudIdeRequest::setRepositoryId));
        builder.<String>withRequestField("repository_ssh_url",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getRepositorySshUrl,
                ShowRepositoryByCloudIdeRequest::setRepositorySshUrl));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getRegionId,
                ShowRepositoryByCloudIdeRequest::setRegionId));
        builder.<String>withRequestField("space_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getSpacePrefix,
                ShowRepositoryByCloudIdeRequest::setSpacePrefix));
        builder.<Boolean>withRequestField("is_open_last",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getIsOpenLast,
                ShowRepositoryByCloudIdeRequest::setIsOpenLast));
        builder.<Boolean>withRequestField("is_free",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getIsFree,
                ShowRepositoryByCloudIdeRequest::setIsFree));
        builder.<ShowRepositoryByCloudIdeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRepositoryByCloudIdeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowRepositoryByCloudIdeRequest::getXLanguage,
                ShowRepositoryByCloudIdeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response> showRepositoryStatisticalDataV2 =
        genForShowRepositoryStatisticalDataV2();

    private static HttpRequestDef<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response> genForShowRepositoryStatisticalDataV2() {
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
            f -> f.withMarshaller(ShowRepositoryStatisticalDataV2Request::getRepositoryId,
                ShowRepositoryStatisticalDataV2Request::setRepositoryId));
        builder.<ShowRepositoryStatisticalDataV2Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRepositoryStatisticalDataV2Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowRepositoryStatisticalDataV2Request::getXLanguage,
                ShowRepositoryStatisticalDataV2Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateFileRequest, ShowTemplateFileResponse> showTemplateFile =
        genForShowTemplateFile();

    private static HttpRequestDef<ShowTemplateFileRequest, ShowTemplateFileResponse> genForShowTemplateFile() {
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
            f -> f.withMarshaller(ShowTemplateFileRequest::getTemplateId, ShowTemplateFileRequest::setTemplateId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateFileRequest::getFilePath, ShowTemplateFileRequest::setFilePath));
        builder.<ShowTemplateFileRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateFileRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowTemplateFileRequest::getType, ShowTemplateFileRequest::setType));
        builder.<ShowTemplateFileRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateFileRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowTemplateFileRequest::getXLanguage, ShowTemplateFileRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> createTemplateViewHistories =
        genForCreateTemplateViewHistories();

    private static HttpRequestDef<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> genForCreateTemplateViewHistories() {
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
            f -> f.withMarshaller(CreateTemplateViewHistoriesRequest::getXLanguage,
                CreateTemplateViewHistoriesRequest::setXLanguage));
        builder.<TemplatesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TemplatesInfo.class),
            f -> f.withMarshaller(CreateTemplateViewHistoriesRequest::getBody,
                CreateTemplateViewHistoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplates =
        genForListPublishedTemplates();

    private static HttpRequestDef<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> genForListPublishedTemplates() {
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
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getKeyword,
                ListPublishedTemplatesRequest::setKeyword));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getOffset, ListPublishedTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getLimit, ListPublishedTemplatesRequest::setLimit));
        builder.<ListPublishedTemplatesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublishedTemplatesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPublishedTemplatesRequest::getXLanguage,
                ListPublishedTemplatesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> listTemplateViewHistories =
        genForListTemplateViewHistories();

    private static HttpRequestDef<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> genForListTemplateViewHistories() {
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
            f -> f.withMarshaller(ListTemplateViewHistoriesRequest::getPlatformSource,
                ListTemplateViewHistoriesRequest::setPlatformSource));
        builder.<ListTemplateViewHistoriesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTemplateViewHistoriesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTemplateViewHistoriesRequest::getXLanguage,
                ListTemplateViewHistoriesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
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
            f -> f.withMarshaller(ListTemplatesRequest::getXLanguage, ListTemplatesRequest::setXLanguage));
        builder.<TemplateQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TemplateQuery.class),
            f -> f.withMarshaller(ListTemplatesRequest::getBody, ListTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesV2Request, ListTemplatesV2Response> listTemplatesV2 =
        genForListTemplatesV2();

    private static HttpRequestDef<ListTemplatesV2Request, ListTemplatesV2Response> genForListTemplatesV2() {
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
            f -> f.withMarshaller(ListTemplatesV2Request::getActionId, ListTemplatesV2Request::setActionId));
        builder.<ListTemplatesV2Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTemplatesV2Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListTemplatesV2Request::getXLanguage, ListTemplatesV2Request::setXLanguage));
        builder.<TemplateQueryV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TemplateQueryV2.class),
            f -> f.withMarshaller(ListTemplatesV2Request::getBody, ListTemplatesV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateV3Request, ShowTemplateV3Response> showTemplateV3 =
        genForShowTemplateV3();

    private static HttpRequestDef<ShowTemplateV3Request, ShowTemplateV3Response> genForShowTemplateV3() {
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
            f -> f.withMarshaller(ShowTemplateV3Request::getTemplateId, ShowTemplateV3Request::setTemplateId));
        builder.<ShowTemplateV3Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateV3Request.XLanguageEnum.class),
            f -> f.withMarshaller(ShowTemplateV3Request::getXLanguage, ShowTemplateV3Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetail =
        genForShowTemplateDetail();

    private static HttpRequestDef<ShowTemplateDetailRequest, ShowTemplateDetailResponse> genForShowTemplateDetail() {
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
            f -> f.withMarshaller(ShowTemplateDetailRequest::getTemplateId, ShowTemplateDetailRequest::setTemplateId));
        builder.<ShowTemplateDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTemplateDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowTemplateDetailRequest::getXLanguage, ShowTemplateDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

}

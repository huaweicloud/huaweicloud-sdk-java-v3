package com.huaweicloud.sdk.cdm.v1;

import com.huaweicloud.sdk.cdm.v1.model.CdmCreateAndUpdateLinkReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmCreateClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmCreateJobJsonReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmDeleteClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmRandomCreateAndStartJobJsonReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmRestartClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmStartClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmStopClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmUpdateJobJsonReq;
import com.huaweicloud.sdk.cdm.v1.model.CreateAndStartRandomClusterJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateAndStartRandomClusterJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.CreateJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.CreateLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateLinkResponse;
import com.huaweicloud.sdk.cdm.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.DeleteLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.DeleteLinkResponse;
import com.huaweicloud.sdk.cdm.v1.model.ListClustersRequest;
import com.huaweicloud.sdk.cdm.v1.model.ListClustersResponse;
import com.huaweicloud.sdk.cdm.v1.model.RestartClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.RestartClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterDetailRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterDetailResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowLinkResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowSubmissionsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowSubmissionsResponse;
import com.huaweicloud.sdk.cdm.v1.model.StartClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.StartClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.StartJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.StartJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.StopClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.StopClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.StopJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.StopJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.UpdateLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.UpdateLinkResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CdmMeta {

    public static final HttpRequestDef<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> createAndStartRandomClusterJob =
        genForcreateAndStartRandomClusterJob();

    private static HttpRequestDef<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> genForcreateAndStartRandomClusterJob() {
        // basic
        HttpRequestDef.Builder<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAndStartRandomClusterJobRequest.class,
                    CreateAndStartRandomClusterJobResponse.class)
                .withName("CreateAndStartRandomClusterJob")
                .withUri("/v1.1/{project_id}/clusters/job")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAndStartRandomClusterJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CdmRandomCreateAndStartJobJsonReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmRandomCreateAndStartJobJsonReq.class),
            f -> f.withMarshaller(CreateAndStartRandomClusterJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v1.1/{project_id}/clusters")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CdmCreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobRequest, CreateJobResponse> createJob = genForcreateJob();

    private static HttpRequestDef<CreateJobRequest, CreateJobResponse> genForcreateJob() {
        // basic
        HttpRequestDef.Builder<CreateJobRequest, CreateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateJobRequest.class, CreateJobResponse.class)
                .withName("CreateJob")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CdmCreateJobJsonReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateJobJsonReq.class),
            f -> f.withMarshaller(CreateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLinkRequest, CreateLinkResponse> createLink = genForcreateLink();

    private static HttpRequestDef<CreateLinkRequest, CreateLinkResponse> genForcreateLink() {
        // basic
        HttpRequestDef.Builder<CreateLinkRequest, CreateLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLinkRequest.class, CreateLinkResponse.class)
                .withName("CreateLink")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/link")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLinkRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("validate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLinkRequest::getValidate, (req, v) -> {
                req.setValidate(v);
            }));
        builder.<CdmCreateAndUpdateLinkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateAndUpdateLinkReq.class),
            f -> f.withMarshaller(CreateLinkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genFordeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genFordeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CdmDeleteClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmDeleteClusterReq.class),
            f -> f.withMarshaller(DeleteClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job/{job_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLinkRequest, DeleteLinkResponse> deleteLink = genFordeleteLink();

    private static HttpRequestDef<DeleteLinkRequest, DeleteLinkResponse> genFordeleteLink() {
        // basic
        HttpRequestDef.Builder<DeleteLinkRequest, DeleteLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLinkRequest.class, DeleteLinkResponse.class)
                .withName("DeleteLink")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/link/{link_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLinkRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("link_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLinkRequest::getLinkName, (req, v) -> {
                req.setLinkName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForlistClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForlistClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/v1.1/{project_id}/clusters")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartClusterRequest, RestartClusterResponse> restartCluster =
        genForrestartCluster();

    private static HttpRequestDef<RestartClusterRequest, RestartClusterResponse> genForrestartCluster() {
        // basic
        HttpRequestDef.Builder<RestartClusterRequest, RestartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartClusterRequest.class, RestartClusterResponse.class)
                .withName("RestartCluster")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CdmRestartClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmRestartClusterReq.class),
            f -> f.withMarshaller(RestartClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetail =
        genForshowClusterDetail();

    private static HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> genForshowClusterDetail() {
        // basic
        HttpRequestDef.Builder<ShowClusterDetailRequest, ShowClusterDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterDetailRequest.class, ShowClusterDetailResponse.class)
                .withName("ShowClusterDetail")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterDetailRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForshowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForshowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withName("ShowJobStatus")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job/{job_name}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobsRequest, ShowJobsResponse> showJobs = genForshowJobs();

    private static HttpRequestDef<ShowJobsRequest, ShowJobsResponse> genForshowJobs() {
        // basic
        HttpRequestDef.Builder<ShowJobsRequest, ShowJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobsRequest.class, ShowJobsResponse.class)
                .withName("ShowJobs")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job/{job_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobsRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<ShowJobsRequest.JobTypeEnum>withRequestField("jobType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ShowJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLinkRequest, ShowLinkResponse> showLink = genForshowLink();

    private static HttpRequestDef<ShowLinkRequest, ShowLinkResponse> genForshowLink() {
        // basic
        HttpRequestDef.Builder<ShowLinkRequest, ShowLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLinkRequest.class, ShowLinkResponse.class)
                .withName("ShowLink")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/link/{link_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLinkRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("link_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLinkRequest::getLinkName, (req, v) -> {
                req.setLinkName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubmissionsRequest, ShowSubmissionsResponse> showSubmissions =
        genForshowSubmissions();

    private static HttpRequestDef<ShowSubmissionsRequest, ShowSubmissionsResponse> genForshowSubmissions() {
        // basic
        HttpRequestDef.Builder<ShowSubmissionsRequest, ShowSubmissionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubmissionsRequest.class, ShowSubmissionsResponse.class)
                .withName("ShowSubmissions")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/submissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubmissionsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("jname",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubmissionsRequest::getJname, (req, v) -> {
                req.setJname(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartClusterRequest, StartClusterResponse> startCluster = genForstartCluster();

    private static HttpRequestDef<StartClusterRequest, StartClusterResponse> genForstartCluster() {
        // basic
        HttpRequestDef.Builder<StartClusterRequest, StartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartClusterRequest.class, StartClusterResponse.class)
                .withName("StartCluster")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CdmStartClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmStartClusterReq.class),
            f -> f.withMarshaller(StartClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartJobRequest, StartJobResponse> startJob = genForstartJob();

    private static HttpRequestDef<StartJobRequest, StartJobResponse> genForstartJob() {
        // basic
        HttpRequestDef.Builder<StartJobRequest, StartJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartJobRequest.class, StartJobResponse.class)
                .withName("StartJob")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job/{job_name}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopClusterRequest, StopClusterResponse> stopCluster = genForstopCluster();

    private static HttpRequestDef<StopClusterRequest, StopClusterResponse> genForstopCluster() {
        // basic
        HttpRequestDef.Builder<StopClusterRequest, StopClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopClusterRequest.class, StopClusterResponse.class)
                .withName("StopCluster")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CdmStopClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmStopClusterReq.class),
            f -> f.withMarshaller(StopClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForstopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForstopJob() {
        // basic
        HttpRequestDef.Builder<StopJobRequest, StopJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopJobRequest.class, StopJobResponse.class)
                .withName("StopJob")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job/{job_name}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForupdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForupdateJob() {
        // basic
        HttpRequestDef.Builder<UpdateJobRequest, UpdateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobRequest.class, UpdateJobResponse.class)
                .withName("UpdateJob")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job/{job_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<CdmUpdateJobJsonReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmUpdateJobJsonReq.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLinkRequest, UpdateLinkResponse> updateLink = genForupdateLink();

    private static HttpRequestDef<UpdateLinkRequest, UpdateLinkResponse> genForupdateLink() {
        // basic
        HttpRequestDef.Builder<UpdateLinkRequest, UpdateLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLinkRequest.class, UpdateLinkResponse.class)
                .withName("UpdateLink")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/link/{link_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLinkRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("link_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLinkRequest::getLinkName, (req, v) -> {
                req.setLinkName(v);
            }));
        builder.<CdmCreateAndUpdateLinkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateAndUpdateLinkReq.class),
            f -> f.withMarshaller(UpdateLinkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.cdm.v1;

import com.huaweicloud.sdk.cdm.v1.model.CdmCreateAndUpdateLinkReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmCreateClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmCreateJobJsonReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmDeleteClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmModifyClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmRandomCreateAndStartJobJsonReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmRestartClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmStartClusterReq;
import com.huaweicloud.sdk.cdm.v1.model.CdmStartJobReq;
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
import com.huaweicloud.sdk.cdm.v1.model.ModifyClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.ModifyClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.RestartClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.RestartClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowAvailabilityZonesRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowAvailabilityZonesResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterDetailRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterDetailResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterEnterpriseProjectsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterEnterpriseProjectsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowDatastoresRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowDatastoresResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowEnterpriseProjectsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowEnterpriseProjectsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorDetailRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorDetailResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowInstanceDetailRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowInstanceDetailResponse;
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
        genForCreateAndStartRandomClusterJob();

    private static HttpRequestDef<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> genForCreateAndStartRandomClusterJob() {
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
            f -> f.withMarshaller(CreateAndStartRandomClusterJobRequest::getXLanguage,
                CreateAndStartRandomClusterJobRequest::setXLanguage));
        builder.<CdmRandomCreateAndStartJobJsonReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmRandomCreateAndStartJobJsonReq.class),
            f -> f.withMarshaller(CreateAndStartRandomClusterJobRequest::getBody,
                CreateAndStartRandomClusterJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForCreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForCreateCluster() {
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
            f -> f.withMarshaller(CreateClusterRequest::getXLanguage, CreateClusterRequest::setXLanguage));
        builder.<CdmCreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobRequest, CreateJobResponse> createJob = genForCreateJob();

    private static HttpRequestDef<CreateJobRequest, CreateJobResponse> genForCreateJob() {
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
            f -> f.withMarshaller(CreateJobRequest::getClusterId, CreateJobRequest::setClusterId));
        builder.<CdmCreateJobJsonReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateJobJsonReq.class),
            f -> f.withMarshaller(CreateJobRequest::getBody, CreateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLinkRequest, CreateLinkResponse> createLink = genForCreateLink();

    private static HttpRequestDef<CreateLinkRequest, CreateLinkResponse> genForCreateLink() {
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
            f -> f.withMarshaller(CreateLinkRequest::getClusterId, CreateLinkRequest::setClusterId));
        builder.<String>withRequestField("validate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLinkRequest::getValidate, CreateLinkRequest::setValidate));
        builder.<CdmCreateAndUpdateLinkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateAndUpdateLinkReq.class),
            f -> f.withMarshaller(CreateLinkRequest::getBody, CreateLinkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genForDeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genForDeleteCluster() {
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
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, DeleteClusterRequest::setClusterId));
        builder.<CdmDeleteClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmDeleteClusterReq.class),
            f -> f.withMarshaller(DeleteClusterRequest::getBody, DeleteClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genForDeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genForDeleteJob() {
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
            f -> f.withMarshaller(DeleteJobRequest::getClusterId, DeleteJobRequest::setClusterId));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobName, DeleteJobRequest::setJobName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLinkRequest, DeleteLinkResponse> deleteLink = genForDeleteLink();

    private static HttpRequestDef<DeleteLinkRequest, DeleteLinkResponse> genForDeleteLink() {
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
            f -> f.withMarshaller(DeleteLinkRequest::getClusterId, DeleteLinkRequest::setClusterId));
        builder.<String>withRequestField("link_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLinkRequest::getLinkName, DeleteLinkRequest::setLinkName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForListClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForListClusters() {
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

    public static final HttpRequestDef<ModifyClusterRequest, ModifyClusterResponse> modifyCluster =
        genForModifyCluster();

    private static HttpRequestDef<ModifyClusterRequest, ModifyClusterResponse> genForModifyCluster() {
        // basic
        HttpRequestDef.Builder<ModifyClusterRequest, ModifyClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ModifyClusterRequest.class, ModifyClusterResponse.class)
                .withName("ModifyCluster")
                .withUri("/v1.1/{project_id}/cluster/modify/{cluster_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyClusterRequest::getClusterId, ModifyClusterRequest::setClusterId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyClusterRequest::getXLanguage, ModifyClusterRequest::setXLanguage));
        builder.<CdmModifyClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmModifyClusterReq.class),
            f -> f.withMarshaller(ModifyClusterRequest::getBody, ModifyClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartClusterRequest, RestartClusterResponse> restartCluster =
        genForRestartCluster();

    private static HttpRequestDef<RestartClusterRequest, RestartClusterResponse> genForRestartCluster() {
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
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, RestartClusterRequest::setClusterId));
        builder.<CdmRestartClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmRestartClusterReq.class),
            f -> f.withMarshaller(RestartClusterRequest::getBody, RestartClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailabilityZonesRequest, ShowAvailabilityZonesResponse> showAvailabilityZones =
        genForShowAvailabilityZones();

    private static HttpRequestDef<ShowAvailabilityZonesRequest, ShowAvailabilityZonesResponse> genForShowAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ShowAvailabilityZonesRequest, ShowAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAvailabilityZonesRequest.class, ShowAvailabilityZonesResponse.class)
            .withName("ShowAvailabilityZones")
            .withUri("/v1.1/{project_id}/regions/{region_id}/availability_zones")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailabilityZonesRequest::getRegionId,
                ShowAvailabilityZonesRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetail =
        genForShowClusterDetail();

    private static HttpRequestDef<ShowClusterDetailRequest, ShowClusterDetailResponse> genForShowClusterDetail() {
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
            f -> f.withMarshaller(ShowClusterDetailRequest::getClusterId, ShowClusterDetailRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterEnterpriseProjectsRequest, ShowClusterEnterpriseProjectsResponse> showClusterEnterpriseProjects =
        genForShowClusterEnterpriseProjects();

    private static HttpRequestDef<ShowClusterEnterpriseProjectsRequest, ShowClusterEnterpriseProjectsResponse> genForShowClusterEnterpriseProjects() {
        // basic
        HttpRequestDef.Builder<ShowClusterEnterpriseProjectsRequest, ShowClusterEnterpriseProjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterEnterpriseProjectsRequest.class,
                    ShowClusterEnterpriseProjectsResponse.class)
                .withName("ShowClusterEnterpriseProjects")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/enterprise-projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterEnterpriseProjectsRequest::getClusterId,
                ShowClusterEnterpriseProjectsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatastoresRequest, ShowDatastoresResponse> showDatastores =
        genForShowDatastores();

    private static HttpRequestDef<ShowDatastoresRequest, ShowDatastoresResponse> genForShowDatastores() {
        // basic
        HttpRequestDef.Builder<ShowDatastoresRequest, ShowDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDatastoresRequest.class, ShowDatastoresResponse.class)
                .withName("ShowDatastores")
                .withUri("/v1.1/{project_id}/datastores")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnterpriseProjectsRequest, ShowEnterpriseProjectsResponse> showEnterpriseProjects =
        genForShowEnterpriseProjects();

    private static HttpRequestDef<ShowEnterpriseProjectsRequest, ShowEnterpriseProjectsResponse> genForShowEnterpriseProjects() {
        // basic
        HttpRequestDef.Builder<ShowEnterpriseProjectsRequest, ShowEnterpriseProjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnterpriseProjectsRequest.class, ShowEnterpriseProjectsResponse.class)
            .withName("ShowEnterpriseProjects")
            .withUri("/v1.1/{project_id}/enterprise-projects")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlavorDetailRequest, ShowFlavorDetailResponse> showFlavorDetail =
        genForShowFlavorDetail();

    private static HttpRequestDef<ShowFlavorDetailRequest, ShowFlavorDetailResponse> genForShowFlavorDetail() {
        // basic
        HttpRequestDef.Builder<ShowFlavorDetailRequest, ShowFlavorDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlavorDetailRequest.class, ShowFlavorDetailResponse.class)
                .withName("ShowFlavorDetail")
                .withUri("/v1.1/{project_id}/flavors/{flavor_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flavor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlavorDetailRequest::getFlavorId, ShowFlavorDetailRequest::setFlavorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlavorsRequest, ShowFlavorsResponse> showFlavors = genForShowFlavors();

    private static HttpRequestDef<ShowFlavorsRequest, ShowFlavorsResponse> genForShowFlavors() {
        // basic
        HttpRequestDef.Builder<ShowFlavorsRequest, ShowFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlavorsRequest.class, ShowFlavorsResponse.class)
                .withName("ShowFlavors")
                .withUri("/v1.1/{project_id}/datastores/{datastore_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlavorsRequest::getDatastoreId, ShowFlavorsRequest::setDatastoreId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetail =
        genForShowInstanceDetail();

    private static HttpRequestDef<ShowInstanceDetailRequest, ShowInstanceDetailResponse> genForShowInstanceDetail() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDetailRequest, ShowInstanceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceDetailRequest.class, ShowInstanceDetailResponse.class)
                .withName("ShowInstanceDetail")
                .withUri("/v1.1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDetailRequest::getInstanceId, ShowInstanceDetailRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForShowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForShowJobStatus() {
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
            f -> f.withMarshaller(ShowJobStatusRequest::getClusterId, ShowJobStatusRequest::setClusterId));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getJobName, ShowJobStatusRequest::setJobName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobsRequest, ShowJobsResponse> showJobs = genForShowJobs();

    private static HttpRequestDef<ShowJobsRequest, ShowJobsResponse> genForShowJobs() {
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
            f -> f.withMarshaller(ShowJobsRequest::getClusterId, ShowJobsRequest::setClusterId));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobsRequest::getJobName, ShowJobsRequest::setJobName));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobsRequest::getFilter, ShowJobsRequest::setFilter));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobsRequest::getPageNo, ShowJobsRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobsRequest::getPageSize, ShowJobsRequest::setPageSize));
        builder.<ShowJobsRequest.JobTypeEnum>withRequestField("jobType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ShowJobsRequest::getJobType, ShowJobsRequest::setJobType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLinkRequest, ShowLinkResponse> showLink = genForShowLink();

    private static HttpRequestDef<ShowLinkRequest, ShowLinkResponse> genForShowLink() {
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
            f -> f.withMarshaller(ShowLinkRequest::getClusterId, ShowLinkRequest::setClusterId));
        builder.<String>withRequestField("link_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLinkRequest::getLinkName, ShowLinkRequest::setLinkName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubmissionsRequest, ShowSubmissionsResponse> showSubmissions =
        genForShowSubmissions();

    private static HttpRequestDef<ShowSubmissionsRequest, ShowSubmissionsResponse> genForShowSubmissions() {
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
            f -> f.withMarshaller(ShowSubmissionsRequest::getClusterId, ShowSubmissionsRequest::setClusterId));
        builder.<String>withRequestField("jname",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubmissionsRequest::getJname, ShowSubmissionsRequest::setJname));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartClusterRequest, StartClusterResponse> startCluster = genForStartCluster();

    private static HttpRequestDef<StartClusterRequest, StartClusterResponse> genForStartCluster() {
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
            f -> f.withMarshaller(StartClusterRequest::getClusterId, StartClusterRequest::setClusterId));
        builder.<CdmStartClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmStartClusterReq.class),
            f -> f.withMarshaller(StartClusterRequest::getBody, StartClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartJobRequest, StartJobResponse> startJob = genForStartJob();

    private static HttpRequestDef<StartJobRequest, StartJobResponse> genForStartJob() {
        // basic
        HttpRequestDef.Builder<StartJobRequest, StartJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartJobRequest.class, StartJobResponse.class)
                .withName("StartJob")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/cdm/job/{job_name}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getClusterId, StartJobRequest::setClusterId));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getJobName, StartJobRequest::setJobName));
        builder.<CdmStartJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CdmStartJobReq.class),
            f -> f.withMarshaller(StartJobRequest::getBody, StartJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopClusterRequest, StopClusterResponse> stopCluster = genForStopCluster();

    private static HttpRequestDef<StopClusterRequest, StopClusterResponse> genForStopCluster() {
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
            f -> f.withMarshaller(StopClusterRequest::getClusterId, StopClusterRequest::setClusterId));
        builder.<CdmStopClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmStopClusterReq.class),
            f -> f.withMarshaller(StopClusterRequest::getBody, StopClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForStopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForStopJob() {
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
            f -> f.withMarshaller(StopJobRequest::getClusterId, StopJobRequest::setClusterId));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getJobName, StopJobRequest::setJobName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForUpdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForUpdateJob() {
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
            f -> f.withMarshaller(UpdateJobRequest::getClusterId, UpdateJobRequest::setClusterId));
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getJobName, UpdateJobRequest::setJobName));
        builder.<CdmUpdateJobJsonReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmUpdateJobJsonReq.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, UpdateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLinkRequest, UpdateLinkResponse> updateLink = genForUpdateLink();

    private static HttpRequestDef<UpdateLinkRequest, UpdateLinkResponse> genForUpdateLink() {
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
            f -> f.withMarshaller(UpdateLinkRequest::getClusterId, UpdateLinkRequest::setClusterId));
        builder.<String>withRequestField("link_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLinkRequest::getLinkName, UpdateLinkRequest::setLinkName));
        builder.<CdmCreateAndUpdateLinkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CdmCreateAndUpdateLinkReq.class),
            f -> f.withMarshaller(UpdateLinkRequest::getBody, UpdateLinkRequest::setBody));

        // response

        return builder.build();
    }

}

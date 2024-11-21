package com.huaweicloud.sdk.mrs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mrs.v1.model.AutoScalingPolicyReqV11;
import com.huaweicloud.sdk.mrs.v1.model.BatchCreateClusterTagsReq;
import com.huaweicloud.sdk.mrs.v1.model.BatchCreateClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.BatchCreateClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.BatchDeleteClusterTagsReq;
import com.huaweicloud.sdk.mrs.v1.model.BatchDeleteClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.BatchDeleteClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ClusterScalingReq;
import com.huaweicloud.sdk.mrs.v1.model.CreateAndExecuteJobRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateAndExecuteJobResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterReqV11;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterTagRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterTagResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateTagReq;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterTagRequest;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterTagResponse;
import com.huaweicloud.sdk.mrs.v1.model.DeleteJobExecutionRequest;
import com.huaweicloud.sdk.mrs.v1.model.DeleteJobExecutionResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersByTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersByTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListExecuteJobRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListExecuteJobResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListHostsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListHostsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListResourceReq;
import com.huaweicloud.sdk.mrs.v1.model.ShowClusterDetailsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ShowClusterDetailsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ShowJobExesRequest;
import com.huaweicloud.sdk.mrs.v1.model.ShowJobExesResponse;
import com.huaweicloud.sdk.mrs.v1.model.ShowMrsVersionMetadataRequest;
import com.huaweicloud.sdk.mrs.v1.model.ShowMrsVersionMetadataResponse;
import com.huaweicloud.sdk.mrs.v1.model.SubmitJobReqV11;
import com.huaweicloud.sdk.mrs.v1.model.UpdateClusterScalingRequest;
import com.huaweicloud.sdk.mrs.v1.model.UpdateClusterScalingResponse;

@SuppressWarnings("unchecked")
public class MrsMeta {

    public static final HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTags =
        genForBatchCreateClusterTags();

    private static HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> genForBatchCreateClusterTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateClusterTagsRequest.class, BatchCreateClusterTagsResponse.class)
            .withName("BatchCreateClusterTags")
            .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateClusterTagsRequest::getClusterId,
                BatchCreateClusterTagsRequest::setClusterId));
        builder.<BatchCreateClusterTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateClusterTagsReq.class),
            f -> f.withMarshaller(BatchCreateClusterTagsRequest::getBody, BatchCreateClusterTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTags =
        genForBatchDeleteClusterTags();

    private static HttpRequestDef<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> genForBatchDeleteClusterTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteClusterTagsRequest.class, BatchDeleteClusterTagsResponse.class)
            .withName("BatchDeleteClusterTags")
            .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getClusterId,
                BatchDeleteClusterTagsRequest::setClusterId));
        builder.<BatchDeleteClusterTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteClusterTagsReq.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getBody, BatchDeleteClusterTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse> createAndExecuteJob =
        genForCreateAndExecuteJob();

    private static HttpRequestDef<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse> genForCreateAndExecuteJob() {
        // basic
        HttpRequestDef.Builder<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAndExecuteJobRequest.class, CreateAndExecuteJobResponse.class)
                .withName("CreateAndExecuteJob")
                .withUri("/v1.1/{project_id}/jobs/submit-job")
                .withContentType("application/json");

        // requests
        builder.<SubmitJobReqV11>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubmitJobReqV11.class),
            f -> f.withMarshaller(CreateAndExecuteJobRequest::getBody, CreateAndExecuteJobRequest::setBody));

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
                .withUri("/v1.1/{project_id}/run-job-flow")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterReqV11>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterReqV11.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterTagRequest, CreateClusterTagResponse> createClusterTag =
        genForCreateClusterTag();

    private static HttpRequestDef<CreateClusterTagRequest, CreateClusterTagResponse> genForCreateClusterTag() {
        // basic
        HttpRequestDef.Builder<CreateClusterTagRequest, CreateClusterTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterTagRequest.class, CreateClusterTagResponse.class)
                .withName("CreateClusterTag")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterTagRequest::getClusterId, CreateClusterTagRequest::setClusterId));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateClusterTagRequest::getBody, CreateClusterTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingPolicyRequest, CreateScalingPolicyResponse> createScalingPolicy =
        genForCreateScalingPolicy();

    private static HttpRequestDef<CreateScalingPolicyRequest, CreateScalingPolicyResponse> genForCreateScalingPolicy() {
        // basic
        HttpRequestDef.Builder<CreateScalingPolicyRequest, CreateScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingPolicyRequest.class, CreateScalingPolicyResponse.class)
                .withName("CreateScalingPolicy")
                .withUri("/v1.1/{project_id}/autoscaling-policy/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScalingPolicyRequest::getClusterId, CreateScalingPolicyRequest::setClusterId));
        builder.<AutoScalingPolicyReqV11>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AutoScalingPolicyReqV11.class),
            f -> f.withMarshaller(CreateScalingPolicyRequest::getBody, CreateScalingPolicyRequest::setBody));

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
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, DeleteClusterRequest::setClusterId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteClusterResponse::getBody, DeleteClusterResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterTagRequest, DeleteClusterTagResponse> deleteClusterTag =
        genForDeleteClusterTag();

    private static HttpRequestDef<DeleteClusterTagRequest, DeleteClusterTagResponse> genForDeleteClusterTag() {
        // basic
        HttpRequestDef.Builder<DeleteClusterTagRequest, DeleteClusterTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterTagRequest.class, DeleteClusterTagResponse.class)
                .withName("DeleteClusterTag")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterTagRequest::getClusterId, DeleteClusterTagRequest::setClusterId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterTagRequest::getKey, DeleteClusterTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobExecutionRequest, DeleteJobExecutionResponse> deleteJobExecution =
        genForDeleteJobExecution();

    private static HttpRequestDef<DeleteJobExecutionRequest, DeleteJobExecutionResponse> genForDeleteJobExecution() {
        // basic
        HttpRequestDef.Builder<DeleteJobExecutionRequest, DeleteJobExecutionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobExecutionRequest.class, DeleteJobExecutionResponse.class)
                .withName("DeleteJobExecution")
                .withUri("/v1.1/{project_id}/job-executions/{job_execution_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobExecutionRequest::getJobExecutionId,
                DeleteJobExecutionRequest::setJobExecutionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> listAllTags = genForListAllTags();

    private static HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> genForListAllTags() {
        // basic
        HttpRequestDef.Builder<ListAllTagsRequest, ListAllTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllTagsRequest.class, ListAllTagsResponse.class)
                .withName("ListAllTags")
                .withUri("/v1.1/{project_id}/clusters/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTags =
        genForListClusterTags();

    private static HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> genForListClusterTags() {
        // basic
        HttpRequestDef.Builder<ListClusterTagsRequest, ListClusterTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterTagsRequest.class, ListClusterTagsResponse.class)
                .withName("ListClusterTags")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterTagsRequest::getClusterId, ListClusterTagsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForListClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForListClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/v1.1/{project_id}/cluster_infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getTags, ListClustersRequest::setTags));
        builder.<String>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getPageSize, ListClustersRequest::setPageSize));
        builder.<String>withRequestField("currentPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getCurrentPage, ListClustersRequest::setCurrentPage));
        builder.<String>withRequestField("clusterName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getClusterName, ListClustersRequest::setClusterName));
        builder.<String>withRequestField("clusterState",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getClusterState, ListClustersRequest::setClusterState));
        builder.<String>withRequestField("enterpriseProjectId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getEnterpriseProjectId,
                ListClustersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersByTagsRequest, ListClustersByTagsResponse> listClustersByTags =
        genForListClustersByTags();

    private static HttpRequestDef<ListClustersByTagsRequest, ListClustersByTagsResponse> genForListClustersByTags() {
        // basic
        HttpRequestDef.Builder<ListClustersByTagsRequest, ListClustersByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListClustersByTagsRequest.class, ListClustersByTagsResponse.class)
                .withName("ListClustersByTags")
                .withUri("/v1.1/{project_id}/clusters/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceReq.class),
            f -> f.withMarshaller(ListClustersByTagsRequest::getBody, ListClustersByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExecuteJobRequest, ListExecuteJobResponse> listExecuteJob =
        genForListExecuteJob();

    private static HttpRequestDef<ListExecuteJobRequest, ListExecuteJobResponse> genForListExecuteJob() {
        // basic
        HttpRequestDef.Builder<ListExecuteJobRequest, ListExecuteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExecuteJobRequest.class, ListExecuteJobResponse.class)
                .withName("ListExecuteJob")
                .withUri("/v1.1/{project_id}/job-exes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecuteJobRequest::getPageSize, ListExecuteJobRequest::setPageSize));
        builder.<String>withRequestField("current_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecuteJobRequest::getCurrentPage, ListExecuteJobRequest::setCurrentPage));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecuteJobRequest::getJobName, ListExecuteJobRequest::setJobName));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecuteJobRequest::getClusterId, ListExecuteJobRequest::setClusterId));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecuteJobRequest::getState, ListExecuteJobRequest::setState));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecuteJobRequest::getId, ListExecuteJobRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostsRequest, ListHostsResponse> listHosts = genForListHosts();

    private static HttpRequestDef<ListHostsRequest, ListHostsResponse> genForListHosts() {
        // basic
        HttpRequestDef.Builder<ListHostsRequest, ListHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostsRequest.class, ListHostsResponse.class)
                .withName("ListHosts")
                .withUri("/v1.1/{project_id}/clusters/{cluster_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getClusterId, ListHostsRequest::setClusterId));
        builder.<String>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getPageSize, ListHostsRequest::setPageSize));
        builder.<String>withRequestField("currentPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsRequest::getCurrentPage, ListHostsRequest::setCurrentPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterDetailsRequest, ShowClusterDetailsResponse> showClusterDetails =
        genForShowClusterDetails();

    private static HttpRequestDef<ShowClusterDetailsRequest, ShowClusterDetailsResponse> genForShowClusterDetails() {
        // basic
        HttpRequestDef.Builder<ShowClusterDetailsRequest, ShowClusterDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterDetailsRequest.class, ShowClusterDetailsResponse.class)
                .withName("ShowClusterDetails")
                .withUri("/v1.1/{project_id}/cluster_infos/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterDetailsRequest::getClusterId, ShowClusterDetailsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobExesRequest, ShowJobExesResponse> showJobExes = genForShowJobExes();

    private static HttpRequestDef<ShowJobExesRequest, ShowJobExesResponse> genForShowJobExes() {
        // basic
        HttpRequestDef.Builder<ShowJobExesRequest, ShowJobExesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobExesRequest.class, ShowJobExesResponse.class)
                .withName("ShowJobExes")
                .withUri("/v1.1/{project_id}/job-exes/{job_exe_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_exe_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExesRequest::getJobExeId, ShowJobExesRequest::setJobExeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterScalingRequest, UpdateClusterScalingResponse> updateClusterScaling =
        genForUpdateClusterScaling();

    private static HttpRequestDef<UpdateClusterScalingRequest, UpdateClusterScalingResponse> genForUpdateClusterScaling() {
        // basic
        HttpRequestDef.Builder<UpdateClusterScalingRequest, UpdateClusterScalingResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateClusterScalingRequest.class, UpdateClusterScalingResponse.class)
            .withName("UpdateClusterScaling")
            .withUri("/v1.1/{project_id}/cluster_infos/{cluster_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterScalingRequest::getClusterId,
                UpdateClusterScalingRequest::setClusterId));
        builder.<ClusterScalingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterScalingReq.class),
            f -> f.withMarshaller(UpdateClusterScalingRequest::getBody, UpdateClusterScalingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForListAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForListAvailableZones() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesRequest, ListAvailableZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableZonesRequest.class, ListAvailableZonesResponse.class)
                .withName("ListAvailableZones")
                .withUri("/v1.1/{region_id}/available-zones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableZonesRequest::getRegionId, ListAvailableZonesRequest::setRegionId));
        builder.<ListAvailableZonesRequest.ScopeEnum>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAvailableZonesRequest.ScopeEnum.class),
            f -> f.withMarshaller(ListAvailableZonesRequest::getScope, ListAvailableZonesRequest::setScope));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMrsVersionMetadataRequest, ShowMrsVersionMetadataResponse> showMrsVersionMetadata =
        genForShowMrsVersionMetadata();

    private static HttpRequestDef<ShowMrsVersionMetadataRequest, ShowMrsVersionMetadataResponse> genForShowMrsVersionMetadata() {
        // basic
        HttpRequestDef.Builder<ShowMrsVersionMetadataRequest, ShowMrsVersionMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMrsVersionMetadataRequest.class, ShowMrsVersionMetadataResponse.class)
            .withName("ShowMrsVersionMetadata")
            .withUri("/v1.1/{project_id}/metadata/versions/{version_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMrsVersionMetadataRequest::getVersionName,
                ShowMrsVersionMetadataRequest::setVersionName));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMrsVersionMetadataRequest::getClusterId,
                ShowMrsVersionMetadataRequest::setClusterId));

        // response

        return builder.build();
    }

}

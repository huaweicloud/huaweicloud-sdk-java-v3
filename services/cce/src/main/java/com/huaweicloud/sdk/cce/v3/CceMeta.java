package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.cce.v3.model.AddNodeList;
import com.huaweicloud.sdk.cce.v3.model.AddNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.AddNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.AddonInstanceRollbackRequest;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsRequestBody;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsRequestBody;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.CertDuration;
import com.huaweicloud.sdk.cce.v3.model.ChartResp;
import com.huaweicloud.sdk.cce.v3.model.Cluster;
import com.huaweicloud.sdk.cce.v3.model.ClusterInformation;
import com.huaweicloud.sdk.cce.v3.model.ClusterLogConfig;
import com.huaweicloud.sdk.cce.v3.model.ClusterNodeInformation;
import com.huaweicloud.sdk.cce.v3.model.ContinueUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.ContinueUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateCloudPersistentVolumeClaimsRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateCloudPersistentVolumeClaimsResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterMasterSnapshotRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterMasterSnapshotResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePostCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePostCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePreCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePreCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseReqBody;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowRequestBody;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteChartRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteChartResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.DownloadChartRequest;
import com.huaweicloud.sdk.cce.v3.model.DownloadChartResponse;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.InstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListChartsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListChartsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterMasterSnapshotTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterMasterSnapshotTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradeFeatureGatesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradeFeatureGatesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradePathsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradePathsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClustersRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClustersResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListPartitionsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListPartitionsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListPreCheckTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListPreCheckTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListReleasesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListReleasesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeClusterTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeClusterTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeWorkFlowsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeWorkFlowsResponse;
import com.huaweicloud.sdk.cce.v3.model.MasterEIPRequest;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodesTask;
import com.huaweicloud.sdk.cce.v3.model.NodeCreateRequest;
import com.huaweicloud.sdk.cce.v3.model.NodePool;
import com.huaweicloud.sdk.cce.v3.model.NodePoolUpdate;
import com.huaweicloud.sdk.cce.v3.model.PackageOptions;
import com.huaweicloud.sdk.cce.v3.model.PartitionReqBody;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.PersistentVolumeClaim;
import com.huaweicloud.sdk.cce.v3.model.PostcheckClusterRequestBody;
import com.huaweicloud.sdk.cce.v3.model.PrecheckClusterRequestBody;
import com.huaweicloud.sdk.cce.v3.model.ReleaseResp;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodesTask;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeList;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterRequestBody;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.RetryUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.RetryUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.RollbackAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.RollbackAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowChartRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowChartResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowChartValuesRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowChartValuesResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigurationDetailsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigurationDetailsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterUpgradeInfoRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterUpgradeInfoResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowJobRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowJobResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationDetailsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationDetailsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowPartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowPartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowPreCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowPreCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseHistoryRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseHistoryResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeWorkFlowRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeWorkFlowResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUserChartsQuotasRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUserChartsQuotasResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterConfigurationsBody;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterLogConfigRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterLogConfigResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolConfigurationRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolConfigurationResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdatePartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdatePartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseReqBody;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateResponse;
import com.huaweicloud.sdk.cce.v3.model.UploadChartRequest;
import com.huaweicloud.sdk.cce.v3.model.UploadChartRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UploadChartResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class CceMeta {

    public static final HttpRequestDef<AddNodeRequest, AddNodeResponse> addNode = genForAddNode();

    private static HttpRequestDef<AddNodeRequest, AddNodeResponse> genForAddNode() {
        // basic
        HttpRequestDef.Builder<AddNodeRequest, AddNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddNodeRequest.class, AddNodeResponse.class)
                .withName("AddNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/add")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddNodeRequest::getClusterId, AddNodeRequest::setClusterId));
        builder.<AddNodeList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddNodeList.class),
            f -> f.withMarshaller(AddNodeRequest::getBody, AddNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> awakeCluster = genForAwakeCluster();

    private static HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> genForAwakeCluster() {
        // basic
        HttpRequestDef.Builder<AwakeClusterRequest, AwakeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AwakeClusterRequest.class, AwakeClusterResponse.class)
                .withName("AwakeCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/awake")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AwakeClusterRequest::getClusterId, AwakeClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTags =
        genForBatchCreateClusterTags();

    private static HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> genForBatchCreateClusterTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateClusterTagsRequest.class, BatchCreateClusterTagsResponse.class)
            .withName("BatchCreateClusterTags")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateClusterTagsRequest::getClusterId,
                BatchCreateClusterTagsRequest::setClusterId));
        builder.<BatchCreateClusterTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateClusterTagsRequestBody.class),
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
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getClusterId,
                BatchDeleteClusterTagsRequest::setClusterId));
        builder.<BatchDeleteClusterTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteClusterTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getBody, BatchDeleteClusterTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> continueUpgradeClusterTask =
        genForContinueUpgradeClusterTask();

    private static HttpRequestDef<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> genForContinueUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ContinueUpgradeClusterTaskRequest.class,
                    ContinueUpgradeClusterTaskResponse.class)
                .withName("ContinueUpgradeClusterTask")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/continue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueUpgradeClusterTaskRequest::getClusterId,
                ContinueUpgradeClusterTaskRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstance =
        genForCreateAddonInstance();

    private static HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> genForCreateAddonInstance() {
        // basic
        HttpRequestDef.Builder<CreateAddonInstanceRequest, CreateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAddonInstanceRequest.class, CreateAddonInstanceResponse.class)
                .withName("CreateAddonInstance")
                .withUri("/api/v3/addons")
                .withContentType("application/json");

        // requests
        builder.<InstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRequest.class),
            f -> f.withMarshaller(CreateAddonInstanceRequest::getBody, CreateAddonInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaims =
        genForCreateCloudPersistentVolumeClaims();

    private static HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> genForCreateCloudPersistentVolumeClaims() {
        // basic
        HttpRequestDef.Builder<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCloudPersistentVolumeClaimsRequest.class,
                    CreateCloudPersistentVolumeClaimsResponse.class)
                .withName("CreateCloudPersistentVolumeClaims")
                .withUri("/api/v1/namespaces/{namespace}/cloudpersistentvolumeclaims")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getNamespace,
                CreateCloudPersistentVolumeClaimsRequest::setNamespace));
        builder.<String>withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getXClusterID,
                CreateCloudPersistentVolumeClaimsRequest::setXClusterID));
        builder.<PersistentVolumeClaim>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PersistentVolumeClaim.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getBody,
                CreateCloudPersistentVolumeClaimsRequest::setBody));

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
                .withUri("/api/v3/projects/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<Cluster>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Cluster.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> createClusterMasterSnapshot =
        genForCreateClusterMasterSnapshot();

    private static HttpRequestDef<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> genForCreateClusterMasterSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateClusterMasterSnapshotRequest.class,
                    CreateClusterMasterSnapshotResponse.class)
                .withName("CreateClusterMasterSnapshot")
                .withUri("/api/v3.1/projects/{project_id}/clusters/{cluster_id}/operation/snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterMasterSnapshotRequest::getClusterId,
                CreateClusterMasterSnapshotRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCert =
        genForCreateKubernetesClusterCert();

    private static HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> genForCreateKubernetesClusterCert() {
        // basic
        HttpRequestDef.Builder<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateKubernetesClusterCertRequest.class,
                    CreateKubernetesClusterCertResponse.class)
                .withName("CreateKubernetesClusterCert")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/clustercert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getClusterId,
                CreateKubernetesClusterCertRequest::setClusterId));
        builder.<CertDuration>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertDuration.class),
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getBody,
                CreateKubernetesClusterCertRequest::setBody));

        // response

        builder.<String>withResponseField("Port-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKubernetesClusterCertResponse::getPortID,
                CreateKubernetesClusterCertResponse::setPortID));
        return builder.build();
    }

    public static final HttpRequestDef<CreateNodeRequest, CreateNodeResponse> createNode = genForCreateNode();

    private static HttpRequestDef<CreateNodeRequest, CreateNodeResponse> genForCreateNode() {
        // basic
        HttpRequestDef.Builder<CreateNodeRequest, CreateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNodeRequest.class, CreateNodeResponse.class)
                .withName("CreateNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodeRequest::getClusterId, CreateNodeRequest::setClusterId));
        builder.<CreateNodeRequest.NodepoolScaleUpEnum>withRequestField("nodepoolScaleUp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateNodeRequest.NodepoolScaleUpEnum.class),
            f -> f.withMarshaller(CreateNodeRequest::getNodepoolScaleUp, CreateNodeRequest::setNodepoolScaleUp));
        builder.<NodeCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeCreateRequest.class),
            f -> f.withMarshaller(CreateNodeRequest::getBody, CreateNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> createNodePool =
        genForCreateNodePool();

    private static HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> genForCreateNodePool() {
        // basic
        HttpRequestDef.Builder<CreateNodePoolRequest, CreateNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNodePoolRequest.class, CreateNodePoolResponse.class)
                .withName("CreateNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodePoolRequest::getClusterId, CreateNodePoolRequest::setClusterId));
        builder.<NodePool>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodePool.class),
            f -> f.withMarshaller(CreateNodePoolRequest::getBody, CreateNodePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> createPartition =
        genForCreatePartition();

    private static HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> genForCreatePartition() {
        // basic
        HttpRequestDef.Builder<CreatePartitionRequest, CreatePartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePartitionRequest.class, CreatePartitionResponse.class)
                .withName("CreatePartition")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePartitionRequest::getClusterId, CreatePartitionRequest::setClusterId));
        builder.<PartitionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PartitionReqBody.class),
            f -> f.withMarshaller(CreatePartitionRequest::getBody, CreatePartitionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostCheckRequest, CreatePostCheckResponse> createPostCheck =
        genForCreatePostCheck();

    private static HttpRequestDef<CreatePostCheckRequest, CreatePostCheckResponse> genForCreatePostCheck() {
        // basic
        HttpRequestDef.Builder<CreatePostCheckRequest, CreatePostCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostCheckRequest.class, CreatePostCheckResponse.class)
                .withName("CreatePostCheck")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/postcheck")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostCheckRequest::getClusterId, CreatePostCheckRequest::setClusterId));
        builder.<PostcheckClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostcheckClusterRequestBody.class),
            f -> f.withMarshaller(CreatePostCheckRequest::getBody, CreatePostCheckRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePreCheckRequest, CreatePreCheckResponse> createPreCheck =
        genForCreatePreCheck();

    private static HttpRequestDef<CreatePreCheckRequest, CreatePreCheckResponse> genForCreatePreCheck() {
        // basic
        HttpRequestDef.Builder<CreatePreCheckRequest, CreatePreCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePreCheckRequest.class, CreatePreCheckResponse.class)
                .withName("CreatePreCheck")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/precheck")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePreCheckRequest::getClusterId, CreatePreCheckRequest::setClusterId));
        builder.<PrecheckClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PrecheckClusterRequestBody.class),
            f -> f.withMarshaller(CreatePreCheckRequest::getBody, CreatePreCheckRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReleaseRequest, CreateReleaseResponse> createRelease =
        genForCreateRelease();

    private static HttpRequestDef<CreateReleaseRequest, CreateReleaseResponse> genForCreateRelease() {
        // basic
        HttpRequestDef.Builder<CreateReleaseRequest, CreateReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReleaseRequest.class, CreateReleaseResponse.class)
                .withName("CreateRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/releases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReleaseRequest::getClusterId, CreateReleaseRequest::setClusterId));
        builder.<CreateReleaseReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReleaseReqBody.class),
            f -> f.withMarshaller(CreateReleaseRequest::getBody, CreateReleaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> createUpgradeWorkFlow =
        genForCreateUpgradeWorkFlow();

    private static HttpRequestDef<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> genForCreateUpgradeWorkFlow() {
        // basic
        HttpRequestDef.Builder<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateUpgradeWorkFlowRequest.class, CreateUpgradeWorkFlowResponse.class)
            .withName("CreateUpgradeWorkFlow")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUpgradeWorkFlowRequest::getClusterId,
                CreateUpgradeWorkFlowRequest::setClusterId));
        builder.<CreateUpgradeWorkFlowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUpgradeWorkFlowRequestBody.class),
            f -> f.withMarshaller(CreateUpgradeWorkFlowRequest::getBody, CreateUpgradeWorkFlowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstance =
        genForDeleteAddonInstance();

    private static HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> genForDeleteAddonInstance() {
        // basic
        HttpRequestDef.Builder<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAddonInstanceRequest.class, DeleteAddonInstanceResponse.class)
            .withName("DeleteAddonInstance")
            .withUri("/api/v3/addons/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getId, DeleteAddonInstanceRequest::setId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getClusterId, DeleteAddonInstanceRequest::setClusterId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAddonInstanceResponse::getBody, DeleteAddonInstanceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteChartRequest, DeleteChartResponse> deleteChart = genForDeleteChart();

    private static HttpRequestDef<DeleteChartRequest, DeleteChartResponse> genForDeleteChart() {
        // basic
        HttpRequestDef.Builder<DeleteChartRequest, DeleteChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteChartRequest.class, DeleteChartResponse.class)
                .withName("DeleteChart")
                .withUri("/v2/charts/{chart_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChartRequest::getChartId, DeleteChartRequest::setChartId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteChartResponse::getBody, DeleteChartResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaims =
        genForDeleteCloudPersistentVolumeClaims();

    private static HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> genForDeleteCloudPersistentVolumeClaims() {
        // basic
        HttpRequestDef.Builder<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCloudPersistentVolumeClaimsRequest.class,
                    DeleteCloudPersistentVolumeClaimsResponse.class)
                .withName("DeleteCloudPersistentVolumeClaims")
                .withUri("/api/v1/namespaces/{namespace}/cloudpersistentvolumeclaims/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getName,
                DeleteCloudPersistentVolumeClaimsRequest::setName));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getNamespace,
                DeleteCloudPersistentVolumeClaimsRequest::setNamespace));
        builder.<String>withRequestField("deleteVolume",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getDeleteVolume,
                DeleteCloudPersistentVolumeClaimsRequest::setDeleteVolume));
        builder.<String>withRequestField("storageType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getStorageType,
                DeleteCloudPersistentVolumeClaimsRequest::setStorageType));
        builder.<String>withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getXClusterID,
                DeleteCloudPersistentVolumeClaimsRequest::setXClusterID));

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
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, DeleteClusterRequest::setClusterId));
        builder.<DeleteClusterRequest.DeleteEfsEnum>withRequestField("delete_efs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEfsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEfs, DeleteClusterRequest::setDeleteEfs));
        builder.<DeleteClusterRequest.DeleteEniEnum>withRequestField("delete_eni",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEniEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEni, DeleteClusterRequest::setDeleteEni));
        builder.<DeleteClusterRequest.DeleteEvsEnum>withRequestField("delete_evs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEvsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEvs, DeleteClusterRequest::setDeleteEvs));
        builder.<DeleteClusterRequest.DeleteNetEnum>withRequestField("delete_net",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteNetEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteNet, DeleteClusterRequest::setDeleteNet));
        builder.<DeleteClusterRequest.DeleteObsEnum>withRequestField("delete_obs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteObsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteObs, DeleteClusterRequest::setDeleteObs));
        builder.<DeleteClusterRequest.DeleteSfsEnum>withRequestField("delete_sfs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteSfsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteSfs, DeleteClusterRequest::setDeleteSfs));
        builder.<DeleteClusterRequest.DeleteSfs30Enum>withRequestField("delete_sfs30",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteSfs30Enum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteSfs30, DeleteClusterRequest::setDeleteSfs30));
        builder.<DeleteClusterRequest.LtsReclaimPolicyEnum>withRequestField("lts_reclaim_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.LtsReclaimPolicyEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getLtsReclaimPolicy,
                DeleteClusterRequest::setLtsReclaimPolicy));
        builder.<DeleteClusterRequest.TobedeletedEnum>withRequestField("tobedeleted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.TobedeletedEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getTobedeleted, DeleteClusterRequest::setTobedeleted));
        builder.<DeleteClusterRequest.OndemandNodePolicyEnum>withRequestField("ondemand_node_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.OndemandNodePolicyEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getOndemandNodePolicy,
                DeleteClusterRequest::setOndemandNodePolicy));
        builder.<DeleteClusterRequest.PeriodicNodePolicyEnum>withRequestField("periodic_node_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.PeriodicNodePolicyEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getPeriodicNodePolicy,
                DeleteClusterRequest::setPeriodicNodePolicy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> deleteNode = genForDeleteNode();

    private static HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> genForDeleteNode() {
        // basic
        HttpRequestDef.Builder<DeleteNodeRequest, DeleteNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodeRequest.class, DeleteNodeResponse.class)
                .withName("DeleteNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeRequest::getClusterId, DeleteNodeRequest::setClusterId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeRequest::getNodeId, DeleteNodeRequest::setNodeId));
        builder.<DeleteNodeRequest.NodepoolScaleDownEnum>withRequestField("nodepoolScaleDown",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteNodeRequest.NodepoolScaleDownEnum.class),
            f -> f.withMarshaller(DeleteNodeRequest::getNodepoolScaleDown, DeleteNodeRequest::setNodepoolScaleDown));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePool =
        genForDeleteNodePool();

    private static HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> genForDeleteNodePool() {
        // basic
        HttpRequestDef.Builder<DeleteNodePoolRequest, DeleteNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodePoolRequest.class, DeleteNodePoolResponse.class)
                .withName("DeleteNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodePoolRequest::getClusterId, DeleteNodePoolRequest::setClusterId));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodePoolRequest::getNodepoolId, DeleteNodePoolRequest::setNodepoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReleaseRequest, DeleteReleaseResponse> deleteRelease =
        genForDeleteRelease();

    private static HttpRequestDef<DeleteReleaseRequest, DeleteReleaseResponse> genForDeleteRelease() {
        // basic
        HttpRequestDef.Builder<DeleteReleaseRequest, DeleteReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteReleaseRequest.class, DeleteReleaseResponse.class)
                .withName("DeleteRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReleaseRequest::getName, DeleteReleaseRequest::setName));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReleaseRequest::getNamespace, DeleteReleaseRequest::setNamespace));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReleaseRequest::getClusterId, DeleteReleaseRequest::setClusterId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReleaseResponse::getBody, DeleteReleaseResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DownloadChartRequest, DownloadChartResponse> downloadChart =
        genForDownloadChart();

    private static HttpRequestDef<DownloadChartRequest, DownloadChartResponse> genForDownloadChart() {
        // basic
        HttpRequestDef.Builder<DownloadChartRequest, DownloadChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadChartRequest.class, DownloadChartResponse.class)
                .withName("DownloadChart")
                .withUri("/v2/charts/{chart_id}/archive")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadChartRequest::getChartId, DownloadChartRequest::setChartId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> hibernateCluster =
        genForHibernateCluster();

    private static HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> genForHibernateCluster() {
        // basic
        HttpRequestDef.Builder<HibernateClusterRequest, HibernateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HibernateClusterRequest.class, HibernateClusterResponse.class)
                .withName("HibernateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/hibernate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HibernateClusterRequest::getClusterId, HibernateClusterRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstances =
        genForListAddonInstances();

    private static HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> genForListAddonInstances() {
        // basic
        HttpRequestDef.Builder<ListAddonInstancesRequest, ListAddonInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonInstancesRequest.class, ListAddonInstancesResponse.class)
                .withName("ListAddonInstances")
                .withUri("/api/v3/addons")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonInstancesRequest::getClusterId, ListAddonInstancesRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplates =
        genForListAddonTemplates();

    private static HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> genForListAddonTemplates() {
        // basic
        HttpRequestDef.Builder<ListAddonTemplatesRequest, ListAddonTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonTemplatesRequest.class, ListAddonTemplatesResponse.class)
                .withName("ListAddonTemplates")
                .withUri("/api/v3/addontemplates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("addon_template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonTemplatesRequest::getAddonTemplateName,
                ListAddonTemplatesRequest::setAddonTemplateName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChartsRequest, ListChartsResponse> listCharts = genForListCharts();

    private static HttpRequestDef<ListChartsRequest, ListChartsResponse> genForListCharts() {
        // basic
        HttpRequestDef.Builder<ListChartsRequest, ListChartsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChartsRequest.class, ListChartsResponse.class)
                .withName("ListCharts")
                .withUri("/v2/charts")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<ChartResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListChartsResponse::getBody, ListChartsResponse::setBody)
                .withInnerContainerType(ChartResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> listClusterMasterSnapshotTasks =
        genForListClusterMasterSnapshotTasks();

    private static HttpRequestDef<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> genForListClusterMasterSnapshotTasks() {
        // basic
        HttpRequestDef.Builder<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterMasterSnapshotTasksRequest.class,
                    ListClusterMasterSnapshotTasksResponse.class)
                .withName("ListClusterMasterSnapshotTasks")
                .withUri("/api/v3.1/projects/{project_id}/clusters/{cluster_id}/operation/snapshot/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterMasterSnapshotTasksRequest::getClusterId,
                ListClusterMasterSnapshotTasksRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> listClusterUpgradeFeatureGates =
        genForListClusterUpgradeFeatureGates();

    private static HttpRequestDef<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> genForListClusterUpgradeFeatureGates() {
        // basic
        HttpRequestDef.Builder<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterUpgradeFeatureGatesRequest.class,
                    ListClusterUpgradeFeatureGatesResponse.class)
                .withName("ListClusterUpgradeFeatureGates")
                .withUri("/api/v3/clusterupgradefeaturegates")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> listClusterUpgradePaths =
        genForListClusterUpgradePaths();

    private static HttpRequestDef<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> genForListClusterUpgradePaths() {
        // basic
        HttpRequestDef.Builder<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterUpgradePathsRequest.class, ListClusterUpgradePathsResponse.class)
            .withName("ListClusterUpgradePaths")
            .withUri("/api/v3/clusterupgradepaths")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForListClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForListClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/api/v3/projects/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getDetail, ListClustersRequest::setDetail));
        builder.<ListClustersRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListClustersRequest.StatusEnum.class),
            f -> f.withMarshaller(ListClustersRequest::getStatus, ListClustersRequest::setStatus));
        builder.<ListClustersRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListClustersRequest.TypeEnum.class),
            f -> f.withMarshaller(ListClustersRequest::getType, ListClustersRequest::setType));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getVersion, ListClustersRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> listNodePools =
        genForListNodePools();

    private static HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> genForListNodePools() {
        // basic
        HttpRequestDef.Builder<ListNodePoolsRequest, ListNodePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodePoolsRequest.class, ListNodePoolsResponse.class)
                .withName("ListNodePools")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolsRequest::getClusterId, ListNodePoolsRequest::setClusterId));
        builder.<String>withRequestField("showDefaultNodePool",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolsRequest::getShowDefaultNodePool,
                ListNodePoolsRequest::setShowDefaultNodePool));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForListNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForListNodes() {
        // basic
        HttpRequestDef.Builder<ListNodesRequest, ListNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodesRequest.class, ListNodesResponse.class)
                .withName("ListNodes")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getClusterId, ListNodesRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> listPartitions =
        genForListPartitions();

    private static HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> genForListPartitions() {
        // basic
        HttpRequestDef.Builder<ListPartitionsRequest, ListPartitionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartitionsRequest.class, ListPartitionsResponse.class)
                .withName("ListPartitions")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getClusterId, ListPartitionsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPreCheckTasksRequest, ListPreCheckTasksResponse> listPreCheckTasks =
        genForListPreCheckTasks();

    private static HttpRequestDef<ListPreCheckTasksRequest, ListPreCheckTasksResponse> genForListPreCheckTasks() {
        // basic
        HttpRequestDef.Builder<ListPreCheckTasksRequest, ListPreCheckTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPreCheckTasksRequest.class, ListPreCheckTasksResponse.class)
                .withName("ListPreCheckTasks")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/precheck/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPreCheckTasksRequest::getClusterId, ListPreCheckTasksRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReleasesRequest, ListReleasesResponse> listReleases = genForListReleases();

    private static HttpRequestDef<ListReleasesRequest, ListReleasesResponse> genForListReleases() {
        // basic
        HttpRequestDef.Builder<ListReleasesRequest, ListReleasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReleasesRequest.class, ListReleasesResponse.class)
                .withName("ListReleases")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/releases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReleasesRequest::getClusterId, ListReleasesRequest::setClusterId));
        builder.<String>withRequestField("chart_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReleasesRequest::getChartId, ListReleasesRequest::setChartId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReleasesRequest::getNamespace, ListReleasesRequest::setNamespace));

        // response
        builder.<List<ReleaseResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListReleasesResponse::getBody, ListReleasesResponse::setBody)
                .withInnerContainerType(ReleaseResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> listUpgradeClusterTasks =
        genForListUpgradeClusterTasks();

    private static HttpRequestDef<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> genForListUpgradeClusterTasks() {
        // basic
        HttpRequestDef.Builder<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpgradeClusterTasksRequest.class, ListUpgradeClusterTasksResponse.class)
            .withName("ListUpgradeClusterTasks")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeClusterTasksRequest::getClusterId,
                ListUpgradeClusterTasksRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> listUpgradeWorkFlows =
        genForListUpgradeWorkFlows();

    private static HttpRequestDef<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> genForListUpgradeWorkFlows() {
        // basic
        HttpRequestDef.Builder<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpgradeWorkFlowsRequest.class, ListUpgradeWorkFlowsResponse.class)
            .withName("ListUpgradeWorkFlows")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeWorkFlowsRequest::getClusterId,
                ListUpgradeWorkFlowsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> migrateNode = genForMigrateNode();

    private static HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> genForMigrateNode() {
        // basic
        HttpRequestDef.Builder<MigrateNodeRequest, MigrateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MigrateNodeRequest.class, MigrateNodeResponse.class)
                .withName("MigrateNode")
                .withUri(
                    "/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/operation/migrateto/{target_cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateNodeRequest::getClusterId, MigrateNodeRequest::setClusterId));
        builder.<String>withRequestField("target_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateNodeRequest::getTargetClusterId, MigrateNodeRequest::setTargetClusterId));
        builder.<MigrateNodesTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateNodesTask.class),
            f -> f.withMarshaller(MigrateNodeRequest::getBody, MigrateNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> pauseUpgradeClusterTask =
        genForPauseUpgradeClusterTask();

    private static HttpRequestDef<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> genForPauseUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, PauseUpgradeClusterTaskRequest.class, PauseUpgradeClusterTaskResponse.class)
            .withName("PauseUpgradeClusterTask")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/pause")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseUpgradeClusterTaskRequest::getClusterId,
                PauseUpgradeClusterTaskRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveNodeRequest, RemoveNodeResponse> removeNode = genForRemoveNode();

    private static HttpRequestDef<RemoveNodeRequest, RemoveNodeResponse> genForRemoveNode() {
        // basic
        HttpRequestDef.Builder<RemoveNodeRequest, RemoveNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RemoveNodeRequest.class, RemoveNodeResponse.class)
                .withName("RemoveNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/operation/remove")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveNodeRequest::getClusterId, RemoveNodeRequest::setClusterId));
        builder.<RemoveNodesTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveNodesTask.class),
            f -> f.withMarshaller(RemoveNodeRequest::getBody, RemoveNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetNodeRequest, ResetNodeResponse> resetNode = genForResetNode();

    private static HttpRequestDef<ResetNodeRequest, ResetNodeResponse> genForResetNode() {
        // basic
        HttpRequestDef.Builder<ResetNodeRequest, ResetNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetNodeRequest.class, ResetNodeResponse.class)
                .withName("ResetNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetNodeRequest::getClusterId, ResetNodeRequest::setClusterId));
        builder.<ResetNodeList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetNodeList.class),
            f -> f.withMarshaller(ResetNodeRequest::getBody, ResetNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> resizeCluster =
        genForResizeCluster();

    private static HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> genForResizeCluster() {
        // basic
        HttpRequestDef.Builder<ResizeClusterRequest, ResizeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeClusterRequest.class, ResizeClusterResponse.class)
                .withName("ResizeCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeClusterRequest::getClusterId, ResizeClusterRequest::setClusterId));
        builder.<ResizeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeClusterRequestBody.class),
            f -> f.withMarshaller(ResizeClusterRequest::getBody, ResizeClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> retryUpgradeClusterTask =
        genForRetryUpgradeClusterTask();

    private static HttpRequestDef<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> genForRetryUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RetryUpgradeClusterTaskRequest.class, RetryUpgradeClusterTaskResponse.class)
            .withName("RetryUpgradeClusterTask")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/retry")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryUpgradeClusterTaskRequest::getClusterId,
                RetryUpgradeClusterTaskRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> rollbackAddonInstance =
        genForRollbackAddonInstance();

    private static HttpRequestDef<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> genForRollbackAddonInstance() {
        // basic
        HttpRequestDef.Builder<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RollbackAddonInstanceRequest.class, RollbackAddonInstanceResponse.class)
            .withName("RollbackAddonInstance")
            .withUri("/api/v3/addons/{id}/operation/rollback")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackAddonInstanceRequest::getId, RollbackAddonInstanceRequest::setId));
        builder.<AddonInstanceRollbackRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddonInstanceRollbackRequest.class),
            f -> f.withMarshaller(RollbackAddonInstanceRequest::getBody, RollbackAddonInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstance =
        genForShowAddonInstance();

    private static HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> genForShowAddonInstance() {
        // basic
        HttpRequestDef.Builder<ShowAddonInstanceRequest, ShowAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAddonInstanceRequest.class, ShowAddonInstanceResponse.class)
                .withName("ShowAddonInstance")
                .withUri("/api/v3/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getId, ShowAddonInstanceRequest::setId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getClusterId, ShowAddonInstanceRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowChartRequest, ShowChartResponse> showChart = genForShowChart();

    private static HttpRequestDef<ShowChartRequest, ShowChartResponse> genForShowChart() {
        // basic
        HttpRequestDef.Builder<ShowChartRequest, ShowChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowChartRequest.class, ShowChartResponse.class)
                .withName("ShowChart")
                .withUri("/v2/charts/{chart_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChartRequest::getChartId, ShowChartRequest::setChartId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowChartValuesRequest, ShowChartValuesResponse> showChartValues =
        genForShowChartValues();

    private static HttpRequestDef<ShowChartValuesRequest, ShowChartValuesResponse> genForShowChartValues() {
        // basic
        HttpRequestDef.Builder<ShowChartValuesRequest, ShowChartValuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowChartValuesRequest.class, ShowChartValuesResponse.class)
                .withName("ShowChartValues")
                .withUri("/v2/charts/{chart_id}/values")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChartValuesRequest::getChartId, ShowChartValuesRequest::setChartId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForShowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForShowCluster() {
        // basic
        HttpRequestDef.Builder<ShowClusterRequest, ShowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterRequest.class, ShowClusterResponse.class)
                .withName("ShowCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getClusterId, ShowClusterRequest::setClusterId));
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getDetail, ShowClusterRequest::setDetail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterConfigRequest, ShowClusterConfigResponse> showClusterConfig =
        genForShowClusterConfig();

    private static HttpRequestDef<ShowClusterConfigRequest, ShowClusterConfigResponse> genForShowClusterConfig() {
        // basic
        HttpRequestDef.Builder<ShowClusterConfigRequest, ShowClusterConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterConfigRequest.class, ShowClusterConfigResponse.class)
                .withName("ShowClusterConfig")
                .withUri("/api/v3/projects/{project_id}/cluster/{cluster_id}/log-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterConfigRequest::getClusterId, ShowClusterConfigRequest::setClusterId));
        builder.<ShowClusterConfigRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowClusterConfigRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowClusterConfigRequest::getType, ShowClusterConfigRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> showClusterConfigurationDetails =
        genForShowClusterConfigurationDetails();

    private static HttpRequestDef<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> genForShowClusterConfigurationDetails() {
        // basic
        HttpRequestDef.Builder<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterConfigurationDetailsRequest.class,
                    ShowClusterConfigurationDetailsResponse.class)
                .withName("ShowClusterConfigurationDetails")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/configuration/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterConfigurationDetailsRequest::getClusterId,
                ShowClusterConfigurationDetailsRequest::setClusterId));

        // response
        builder.<Map<String, List<PackageOptions>>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f
                .withMarshaller(ShowClusterConfigurationDetailsResponse::getBody,
                    ShowClusterConfigurationDetailsResponse::setBody)
                .withInnerContainerType(List.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> showClusterEndpoints =
        genForShowClusterEndpoints();

    private static HttpRequestDef<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> genForShowClusterEndpoints() {
        // basic
        HttpRequestDef.Builder<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClusterEndpointsRequest.class, ShowClusterEndpointsResponse.class)
            .withName("ShowClusterEndpoints")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/openapi")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterEndpointsRequest::getClusterId,
                ShowClusterEndpointsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> showClusterUpgradeInfo =
        genForShowClusterUpgradeInfo();

    private static HttpRequestDef<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> genForShowClusterUpgradeInfo() {
        // basic
        HttpRequestDef.Builder<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClusterUpgradeInfoRequest.class, ShowClusterUpgradeInfoResponse.class)
            .withName("ShowClusterUpgradeInfo")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/upgradeinfo")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterUpgradeInfoRequest::getClusterId,
                ShowClusterUpgradeInfoRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/api/v3/projects/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeRequest, ShowNodeResponse> showNode = genForShowNode();

    private static HttpRequestDef<ShowNodeRequest, ShowNodeResponse> genForShowNode() {
        // basic
        HttpRequestDef.Builder<ShowNodeRequest, ShowNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodeRequest.class, ShowNodeResponse.class)
                .withName("ShowNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getClusterId, ShowNodeRequest::setClusterId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getNodeId, ShowNodeRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> showNodePool = genForShowNodePool();

    private static HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> genForShowNodePool() {
        // basic
        HttpRequestDef.Builder<ShowNodePoolRequest, ShowNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodePoolRequest.class, ShowNodePoolResponse.class)
                .withName("ShowNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getClusterId, ShowNodePoolRequest::setClusterId));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getNodepoolId, ShowNodePoolRequest::setNodepoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodePoolConfigurationDetailsRequest, ShowNodePoolConfigurationDetailsResponse> showNodePoolConfigurationDetails =
        genForShowNodePoolConfigurationDetails();

    private static HttpRequestDef<ShowNodePoolConfigurationDetailsRequest, ShowNodePoolConfigurationDetailsResponse> genForShowNodePoolConfigurationDetails() {
        // basic
        HttpRequestDef.Builder<ShowNodePoolConfigurationDetailsRequest, ShowNodePoolConfigurationDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNodePoolConfigurationDetailsRequest.class,
                    ShowNodePoolConfigurationDetailsResponse.class)
                .withName("ShowNodePoolConfigurationDetails")
                .withUri(
                    "/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}/configuration/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolConfigurationDetailsRequest::getClusterId,
                ShowNodePoolConfigurationDetailsRequest::setClusterId));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolConfigurationDetailsRequest::getNodepoolId,
                ShowNodePoolConfigurationDetailsRequest::setNodepoolId));

        // response
        builder.<Map<String, List<PackageOptions>>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f
                .withMarshaller(ShowNodePoolConfigurationDetailsResponse::getBody,
                    ShowNodePoolConfigurationDetailsResponse::setBody)
                .withInnerContainerType(List.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> showNodePoolConfigurations =
        genForShowNodePoolConfigurations();

    private static HttpRequestDef<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> genForShowNodePoolConfigurations() {
        // basic
        HttpRequestDef.Builder<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNodePoolConfigurationsRequest.class,
                    ShowNodePoolConfigurationsResponse.class)
                .withName("ShowNodePoolConfigurations")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolConfigurationsRequest::getClusterId,
                ShowNodePoolConfigurationsRequest::setClusterId));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolConfigurationsRequest::getNodepoolId,
                ShowNodePoolConfigurationsRequest::setNodepoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionRequest, ShowPartitionResponse> showPartition =
        genForShowPartition();

    private static HttpRequestDef<ShowPartitionRequest, ShowPartitionResponse> genForShowPartition() {
        // basic
        HttpRequestDef.Builder<ShowPartitionRequest, ShowPartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartitionRequest.class, ShowPartitionResponse.class)
                .withName("ShowPartition")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions/{partition_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionRequest::getClusterId, ShowPartitionRequest::setClusterId));
        builder.<String>withRequestField("partition_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionRequest::getPartitionName, ShowPartitionRequest::setPartitionName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPreCheckRequest, ShowPreCheckResponse> showPreCheck = genForShowPreCheck();

    private static HttpRequestDef<ShowPreCheckRequest, ShowPreCheckResponse> genForShowPreCheck() {
        // basic
        HttpRequestDef.Builder<ShowPreCheckRequest, ShowPreCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPreCheckRequest.class, ShowPreCheckResponse.class)
                .withName("ShowPreCheck")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/precheck/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreCheckRequest::getClusterId, ShowPreCheckRequest::setClusterId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreCheckRequest::getTaskId, ShowPreCheckRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/api/v3/projects/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReleaseRequest, ShowReleaseResponse> showRelease = genForShowRelease();

    private static HttpRequestDef<ShowReleaseRequest, ShowReleaseResponse> genForShowRelease() {
        // basic
        HttpRequestDef.Builder<ShowReleaseRequest, ShowReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReleaseRequest.class, ShowReleaseResponse.class)
                .withName("ShowRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseRequest::getName, ShowReleaseRequest::setName));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseRequest::getNamespace, ShowReleaseRequest::setNamespace));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseRequest::getClusterId, ShowReleaseRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> showReleaseHistory =
        genForShowReleaseHistory();

    private static HttpRequestDef<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> genForShowReleaseHistory() {
        // basic
        HttpRequestDef.Builder<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReleaseHistoryRequest.class, ShowReleaseHistoryResponse.class)
                .withName("ShowReleaseHistory")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseHistoryRequest::getName, ShowReleaseHistoryRequest::setName));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseHistoryRequest::getNamespace, ShowReleaseHistoryRequest::setNamespace));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseHistoryRequest::getClusterId, ShowReleaseHistoryRequest::setClusterId));

        // response
        builder.<List<ReleaseResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowReleaseHistoryResponse::getBody, ShowReleaseHistoryResponse::setBody)
                .withInnerContainerType(ReleaseResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> showUpgradeClusterTask =
        genForShowUpgradeClusterTask();

    private static HttpRequestDef<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> genForShowUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUpgradeClusterTaskRequest.class, ShowUpgradeClusterTaskResponse.class)
            .withName("ShowUpgradeClusterTask")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeClusterTaskRequest::getClusterId,
                ShowUpgradeClusterTaskRequest::setClusterId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeClusterTaskRequest::getTaskId, ShowUpgradeClusterTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> showUpgradeWorkFlow =
        genForShowUpgradeWorkFlow();

    private static HttpRequestDef<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> genForShowUpgradeWorkFlow() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUpgradeWorkFlowRequest.class, ShowUpgradeWorkFlowResponse.class)
            .withName("ShowUpgradeWorkFlow")
            .withUri(
                "/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows/{upgrade_workflow_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeWorkFlowRequest::getClusterId, ShowUpgradeWorkFlowRequest::setClusterId));
        builder.<String>withRequestField("upgrade_workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeWorkFlowRequest::getUpgradeWorkflowId,
                ShowUpgradeWorkFlowRequest::setUpgradeWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> showUserChartsQuotas =
        genForShowUserChartsQuotas();

    private static HttpRequestDef<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> genForShowUserChartsQuotas() {
        // basic
        HttpRequestDef.Builder<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUserChartsQuotasRequest.class, ShowUserChartsQuotasResponse.class)
            .withName("ShowUserChartsQuotas")
            .withUri("/v2/charts/{project_id}/quotas")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstance =
        genForUpdateAddonInstance();

    private static HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> genForUpdateAddonInstance() {
        // basic
        HttpRequestDef.Builder<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAddonInstanceRequest.class, UpdateAddonInstanceResponse.class)
                .withName("UpdateAddonInstance")
                .withUri("/api/v3/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getId, UpdateAddonInstanceRequest::setId));
        builder.<InstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRequest.class),
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getBody, UpdateAddonInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateChartRequest, UpdateChartResponse> updateChart = genForUpdateChart();

    private static HttpRequestDef<UpdateChartRequest, UpdateChartResponse> genForUpdateChart() {
        // basic
        HttpRequestDef.Builder<UpdateChartRequest, UpdateChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateChartRequest.class, UpdateChartResponse.class)
                .withName("UpdateChart")
                .withUri("/v2/charts/{chart_id}")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateChartRequest::getChartId, UpdateChartRequest::setChartId));
        builder.<UpdateChartRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateChartRequestBody.class),
            f -> f.withMarshaller(UpdateChartRequest::getBody, UpdateChartRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> updateCluster =
        genForUpdateCluster();

    private static HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> genForUpdateCluster() {
        // basic
        HttpRequestDef.Builder<UpdateClusterRequest, UpdateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterRequest.class, UpdateClusterResponse.class)
                .withName("UpdateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterRequest::getClusterId, UpdateClusterRequest::setClusterId));
        builder.<ClusterInformation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterInformation.class),
            f -> f.withMarshaller(UpdateClusterRequest::getBody, UpdateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterEipRequest, UpdateClusterEipResponse> updateClusterEip =
        genForUpdateClusterEip();

    private static HttpRequestDef<UpdateClusterEipRequest, UpdateClusterEipResponse> genForUpdateClusterEip() {
        // basic
        HttpRequestDef.Builder<UpdateClusterEipRequest, UpdateClusterEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterEipRequest.class, UpdateClusterEipResponse.class)
                .withName("UpdateClusterEip")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/mastereip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterEipRequest::getClusterId, UpdateClusterEipRequest::setClusterId));
        builder.<MasterEIPRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MasterEIPRequest.class),
            f -> f.withMarshaller(UpdateClusterEipRequest::getBody, UpdateClusterEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> updateClusterLogConfig =
        genForUpdateClusterLogConfig();

    private static HttpRequestDef<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> genForUpdateClusterLogConfig() {
        // basic
        HttpRequestDef.Builder<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateClusterLogConfigRequest.class, UpdateClusterLogConfigResponse.class)
            .withName("UpdateClusterLogConfig")
            .withUri("/api/v3/projects/{project_id}/cluster/{cluster_id}/log-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterLogConfigRequest::getClusterId,
                UpdateClusterLogConfigRequest::setClusterId));
        builder.<ClusterLogConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterLogConfig.class),
            f -> f.withMarshaller(UpdateClusterLogConfigRequest::getBody, UpdateClusterLogConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> updateNode = genForUpdateNode();

    private static HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> genForUpdateNode() {
        // basic
        HttpRequestDef.Builder<UpdateNodeRequest, UpdateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodeRequest.class, UpdateNodeResponse.class)
                .withName("UpdateNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getClusterId, UpdateNodeRequest::setClusterId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getNodeId, UpdateNodeRequest::setNodeId));
        builder.<ClusterNodeInformation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterNodeInformation.class),
            f -> f.withMarshaller(UpdateNodeRequest::getBody, UpdateNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePool =
        genForUpdateNodePool();

    private static HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> genForUpdateNodePool() {
        // basic
        HttpRequestDef.Builder<UpdateNodePoolRequest, UpdateNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodePoolRequest.class, UpdateNodePoolResponse.class)
                .withName("UpdateNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getClusterId, UpdateNodePoolRequest::setClusterId));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getNodepoolId, UpdateNodePoolRequest::setNodepoolId));
        builder.<NodePoolUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodePoolUpdate.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getBody, UpdateNodePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> updateNodePoolConfiguration =
        genForUpdateNodePoolConfiguration();

    private static HttpRequestDef<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> genForUpdateNodePoolConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateNodePoolConfigurationRequest.class,
                    UpdateNodePoolConfigurationResponse.class)
                .withName("UpdateNodePoolConfiguration")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolConfigurationRequest::getClusterId,
                UpdateNodePoolConfigurationRequest::setClusterId));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolConfigurationRequest::getNodepoolId,
                UpdateNodePoolConfigurationRequest::setNodepoolId));
        builder.<UpdateClusterConfigurationsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterConfigurationsBody.class),
            f -> f.withMarshaller(UpdateNodePoolConfigurationRequest::getBody,
                UpdateNodePoolConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePartitionRequest, UpdatePartitionResponse> updatePartition =
        genForUpdatePartition();

    private static HttpRequestDef<UpdatePartitionRequest, UpdatePartitionResponse> genForUpdatePartition() {
        // basic
        HttpRequestDef.Builder<UpdatePartitionRequest, UpdatePartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePartitionRequest.class, UpdatePartitionResponse.class)
                .withName("UpdatePartition")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions/{partition_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePartitionRequest::getClusterId, UpdatePartitionRequest::setClusterId));
        builder.<String>withRequestField("partition_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePartitionRequest::getPartitionName, UpdatePartitionRequest::setPartitionName));
        builder.<PartitionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PartitionReqBody.class),
            f -> f.withMarshaller(UpdatePartitionRequest::getBody, UpdatePartitionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReleaseRequest, UpdateReleaseResponse> updateRelease =
        genForUpdateRelease();

    private static HttpRequestDef<UpdateReleaseRequest, UpdateReleaseResponse> genForUpdateRelease() {
        // basic
        HttpRequestDef.Builder<UpdateReleaseRequest, UpdateReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReleaseRequest.class, UpdateReleaseResponse.class)
                .withName("UpdateRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getName, UpdateReleaseRequest::setName));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getNamespace, UpdateReleaseRequest::setNamespace));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getClusterId, UpdateReleaseRequest::setClusterId));
        builder.<UpdateReleaseReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReleaseReqBody.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getBody, UpdateReleaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeClusterRequest, UpgradeClusterResponse> upgradeCluster =
        genForUpgradeCluster();

    private static HttpRequestDef<UpgradeClusterRequest, UpgradeClusterResponse> genForUpgradeCluster() {
        // basic
        HttpRequestDef.Builder<UpgradeClusterRequest, UpgradeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeClusterRequest.class, UpgradeClusterResponse.class)
                .withName("UpgradeCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeClusterRequest::getClusterId, UpgradeClusterRequest::setClusterId));
        builder.<UpgradeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeClusterRequestBody.class),
            f -> f.withMarshaller(UpgradeClusterRequest::getBody, UpgradeClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> upgradeWorkFlowUpdate =
        genForUpgradeWorkFlowUpdate();

    private static HttpRequestDef<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> genForUpgradeWorkFlowUpdate() {
        // basic
        HttpRequestDef.Builder<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpgradeWorkFlowUpdateRequest.class, UpgradeWorkFlowUpdateResponse.class)
            .withName("UpgradeWorkFlowUpdate")
            .withUri(
                "/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows/{upgrade_workflow_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeWorkFlowUpdateRequest::getClusterId,
                UpgradeWorkFlowUpdateRequest::setClusterId));
        builder.<String>withRequestField("upgrade_workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeWorkFlowUpdateRequest::getUpgradeWorkflowId,
                UpgradeWorkFlowUpdateRequest::setUpgradeWorkflowId));
        builder.<UpgradeWorkFlowUpdateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeWorkFlowUpdateRequestBody.class),
            f -> f.withMarshaller(UpgradeWorkFlowUpdateRequest::getBody, UpgradeWorkFlowUpdateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadChartRequest, UploadChartResponse> uploadChart = genForUploadChart();

    private static HttpRequestDef<UploadChartRequest, UploadChartResponse> genForUploadChart() {
        // basic
        HttpRequestDef.Builder<UploadChartRequest, UploadChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadChartRequest.class, UploadChartResponse.class)
                .withName("UploadChart")
                .withUri("/v2/charts")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadChartRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadChartRequestBody.class),
            f -> f.withMarshaller(UploadChartRequest::getBody, UploadChartRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForShowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForShowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withName("ShowVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}

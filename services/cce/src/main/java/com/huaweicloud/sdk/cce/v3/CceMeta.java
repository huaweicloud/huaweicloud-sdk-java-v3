package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.cce.v3.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CceMeta {

    public static final HttpRequestDef<AddNodeRequest, AddNodeResponse> addNode = genForaddNode();

    private static HttpRequestDef<AddNodeRequest, AddNodeResponse> genForaddNode() {
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
            f -> f.withMarshaller(AddNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AddNodeList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddNodeList.class),
            f -> f.withMarshaller(AddNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> awakeCluster = genForawakeCluster();

    private static HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> genForawakeCluster() {
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
            f -> f.withMarshaller(AwakeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> continueUpgradeClusterTask =
        genForcontinueUpgradeClusterTask();

    private static HttpRequestDef<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> genForcontinueUpgradeClusterTask() {
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
            f -> f.withMarshaller(ContinueUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstance =
        genForcreateAddonInstance();

    private static HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> genForcreateAddonInstance() {
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
            f -> f.withMarshaller(CreateAddonInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaims =
        genForcreateCloudPersistentVolumeClaims();

    private static HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> genForcreateCloudPersistentVolumeClaims() {
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
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getXClusterID, (req, v) -> {
                req.setXClusterID(v);
            }));
        builder.<PersistentVolumeClaim>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PersistentVolumeClaim.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getBody, (req, v) -> {
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
                .withUri("/api/v3/projects/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<Cluster>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Cluster.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCert =
        genForcreateKubernetesClusterCert();

    private static HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> genForcreateKubernetesClusterCert() {
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
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CertDuration>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertDuration.class),
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("Port-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKubernetesClusterCertResponse::getPortID,
                CreateKubernetesClusterCertResponse::setPortID));
        return builder.build();
    }

    public static final HttpRequestDef<CreateNodeRequest, CreateNodeResponse> createNode = genForcreateNode();

    private static HttpRequestDef<CreateNodeRequest, CreateNodeResponse> genForcreateNode() {
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
            f -> f.withMarshaller(CreateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateNodeRequest.NodepoolScaleUpEnum>withRequestField("nodepoolScaleUp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateNodeRequest.NodepoolScaleUpEnum.class),
            f -> f.withMarshaller(CreateNodeRequest::getNodepoolScaleUp, (req, v) -> {
                req.setNodepoolScaleUp(v);
            }));
        builder.<NodeCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeCreateRequest.class),
            f -> f.withMarshaller(CreateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> createNodePool =
        genForcreateNodePool();

    private static HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> genForcreateNodePool() {
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
            f -> f.withMarshaller(CreateNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<NodePool>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodePool.class),
            f -> f.withMarshaller(CreateNodePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstance =
        genFordeleteAddonInstance();

    private static HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> genFordeleteAddonInstance() {
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
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAddonInstanceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaims =
        genFordeleteCloudPersistentVolumeClaims();

    private static HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> genFordeleteCloudPersistentVolumeClaims() {
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
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("deleteVolume",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getDeleteVolume, (req, v) -> {
                req.setDeleteVolume(v);
            }));
        builder.<String>withRequestField("storageType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getStorageType, (req, v) -> {
                req.setStorageType(v);
            }));
        builder.<String>withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getXClusterID, (req, v) -> {
                req.setXClusterID(v);
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
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<DeleteClusterRequest.DeleteEfsEnum>withRequestField("delete_efs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEfsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEfs, (req, v) -> {
                req.setDeleteEfs(v);
            }));
        builder.<DeleteClusterRequest.DeleteEniEnum>withRequestField("delete_eni",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEniEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEni, (req, v) -> {
                req.setDeleteEni(v);
            }));
        builder.<DeleteClusterRequest.DeleteEvsEnum>withRequestField("delete_evs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEvsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEvs, (req, v) -> {
                req.setDeleteEvs(v);
            }));
        builder.<DeleteClusterRequest.DeleteNetEnum>withRequestField("delete_net",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteNetEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteNet, (req, v) -> {
                req.setDeleteNet(v);
            }));
        builder.<DeleteClusterRequest.DeleteObsEnum>withRequestField("delete_obs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteObsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteObs, (req, v) -> {
                req.setDeleteObs(v);
            }));
        builder.<DeleteClusterRequest.DeleteSfsEnum>withRequestField("delete_sfs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteSfsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteSfs, (req, v) -> {
                req.setDeleteSfs(v);
            }));
        builder.<DeleteClusterRequest.DeleteSfs30Enum>withRequestField("delete_sfs30",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteSfs30Enum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteSfs30, (req, v) -> {
                req.setDeleteSfs30(v);
            }));
        builder.<DeleteClusterRequest.TobedeletedEnum>withRequestField("tobedeleted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.TobedeletedEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getTobedeleted, (req, v) -> {
                req.setTobedeleted(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> deleteNode = genFordeleteNode();

    private static HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> genFordeleteNode() {
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
            f -> f.withMarshaller(DeleteNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<DeleteNodeRequest.NodepoolScaleDownEnum>withRequestField("nodepoolScaleDown",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteNodeRequest.NodepoolScaleDownEnum.class),
            f -> f.withMarshaller(DeleteNodeRequest::getNodepoolScaleDown, (req, v) -> {
                req.setNodepoolScaleDown(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePool =
        genFordeleteNodePool();

    private static HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> genFordeleteNodePool() {
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
            f -> f.withMarshaller(DeleteNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> hibernateCluster =
        genForhibernateCluster();

    private static HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> genForhibernateCluster() {
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
            f -> f.withMarshaller(HibernateClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstances =
        genForlistAddonInstances();

    private static HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> genForlistAddonInstances() {
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
            f -> f.withMarshaller(ListAddonInstancesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplates =
        genForlistAddonTemplates();

    private static HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> genForlistAddonTemplates() {
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
            f -> f.withMarshaller(ListAddonTemplatesRequest::getAddonTemplateName, (req, v) -> {
                req.setAddonTemplateName(v);
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
                .withUri("/api/v3/projects/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            }));
        builder.<ListClustersRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListClustersRequest.StatusEnum.class),
            f -> f.withMarshaller(ListClustersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListClustersRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListClustersRequest.TypeEnum.class),
            f -> f.withMarshaller(ListClustersRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> listNodePools =
        genForlistNodePools();

    private static HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> genForlistNodePools() {
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
            f -> f.withMarshaller(ListNodePoolsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("showDefaultNodePool",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolsRequest::getShowDefaultNodePool, (req, v) -> {
                req.setShowDefaultNodePool(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForlistNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForlistNodes() {
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
            f -> f.withMarshaller(ListNodesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> migrateNode = genFormigrateNode();

    private static HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> genFormigrateNode() {
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
            f -> f.withMarshaller(MigrateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("target_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateNodeRequest::getTargetClusterId, (req, v) -> {
                req.setTargetClusterId(v);
            }));
        builder.<MigrateNodesTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateNodesTask.class),
            f -> f.withMarshaller(MigrateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> pauseUpgradeClusterTask =
        genForpauseUpgradeClusterTask();

    private static HttpRequestDef<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> genForpauseUpgradeClusterTask() {
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
            f -> f.withMarshaller(PauseUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveNodeRequest, RemoveNodeResponse> removeNode = genForremoveNode();

    private static HttpRequestDef<RemoveNodeRequest, RemoveNodeResponse> genForremoveNode() {
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
            f -> f.withMarshaller(RemoveNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<RemoveNodesTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveNodesTask.class),
            f -> f.withMarshaller(RemoveNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetNodeRequest, ResetNodeResponse> resetNode = genForresetNode();

    private static HttpRequestDef<ResetNodeRequest, ResetNodeResponse> genForresetNode() {
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
            f -> f.withMarshaller(ResetNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ResetNodeList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetNodeList.class),
            f -> f.withMarshaller(ResetNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> retryUpgradeClusterTask =
        genForretryUpgradeClusterTask();

    private static HttpRequestDef<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> genForretryUpgradeClusterTask() {
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
            f -> f.withMarshaller(RetryUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstance =
        genForshowAddonInstance();

    private static HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> genForshowAddonInstance() {
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
            f -> f.withMarshaller(ShowAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForshowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForshowCluster() {
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
            f -> f.withMarshaller(ShowClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> showClusterEndpoints =
        genForshowClusterEndpoints();

    private static HttpRequestDef<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> genForshowClusterEndpoints() {
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
            f -> f.withMarshaller(ShowClusterEndpointsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeRequest, ShowNodeResponse> showNode = genForshowNode();

    private static HttpRequestDef<ShowNodeRequest, ShowNodeResponse> genForshowNode() {
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
            f -> f.withMarshaller(ShowNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> showNodePool = genForshowNodePool();

    private static HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> genForshowNodePool() {
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
            f -> f.withMarshaller(ShowNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
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

    public static final HttpRequestDef<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> showUpgradeClusterTask =
        genForshowUpgradeClusterTask();

    private static HttpRequestDef<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> genForshowUpgradeClusterTask() {
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
            f -> f.withMarshaller(ShowUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeClusterTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstance =
        genForupdateAddonInstance();

    private static HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> genForupdateAddonInstance() {
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
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<InstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRequest.class),
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> updateCluster =
        genForupdateCluster();

    private static HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> genForupdateCluster() {
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
            f -> f.withMarshaller(UpdateClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ClusterInformation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterInformation.class),
            f -> f.withMarshaller(UpdateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterEipRequest, UpdateClusterEipResponse> updateClusterEip =
        genForupdateClusterEip();

    private static HttpRequestDef<UpdateClusterEipRequest, UpdateClusterEipResponse> genForupdateClusterEip() {
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
            f -> f.withMarshaller(UpdateClusterEipRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<MasterEIPRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MasterEIPRequest.class),
            f -> f.withMarshaller(UpdateClusterEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> updateNode = genForupdateNode();

    private static HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> genForupdateNode() {
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
            f -> f.withMarshaller(UpdateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<ClusterNodeInformation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterNodeInformation.class),
            f -> f.withMarshaller(UpdateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePool =
        genForupdateNodePool();

    private static HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> genForupdateNodePool() {
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
            f -> f.withMarshaller(UpdateNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));
        builder.<NodePoolUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodePoolUpdate.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeClusterRequest, UpgradeClusterResponse> upgradeCluster =
        genForupgradeCluster();

    private static HttpRequestDef<UpgradeClusterRequest, UpgradeClusterResponse> genForupgradeCluster() {
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
            f -> f.withMarshaller(UpgradeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpgradeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeClusterRequestBody.class),
            f -> f.withMarshaller(UpgradeClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForshowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForshowVersion() {
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

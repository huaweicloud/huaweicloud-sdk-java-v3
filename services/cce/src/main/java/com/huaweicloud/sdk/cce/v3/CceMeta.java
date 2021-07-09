package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cce.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CceMeta {

    public static final HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> awakeCluster = genForawakeCluster();

    private static HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> genForawakeCluster() {
        // basic
        HttpRequestDef.Builder<AwakeClusterRequest, AwakeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AwakeClusterRequest.class, AwakeClusterResponse.class)
                .withName("AwakeCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/awake")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AwakeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstance = genForcreateAddonInstance();

    private static HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> genForcreateAddonInstance() {
        // basic
        HttpRequestDef.Builder<CreateAddonInstanceRequest, CreateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAddonInstanceRequest.class, CreateAddonInstanceResponse.class)
                .withName("CreateAddonInstance")
                .withUri("/api/v3/addons")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceRequest.class,
            f -> f.withMarshaller(CreateAddonInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaims = genForcreateCloudPersistentVolumeClaims();

    private static HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> genForcreateCloudPersistentVolumeClaims() {
        // basic
        HttpRequestDef.Builder<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCloudPersistentVolumeClaimsRequest.class, CreateCloudPersistentVolumeClaimsResponse.class)
                .withName("CreateCloudPersistentVolumeClaims")
                .withUri("/api/v1/namespaces/{namespace}/cloudpersistentvolumeclaims")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getXClusterID, (req, v) -> {
                req.setXClusterID(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PersistentVolumeClaim.class,
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster = genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            Cluster.class,
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCert = genForcreateKubernetesClusterCert();

    private static HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> genForcreateKubernetesClusterCert() {
        // basic
        HttpRequestDef.Builder<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKubernetesClusterCertRequest.class, CreateKubernetesClusterCertResponse.class)
                .withName("CreateKubernetesClusterCert")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/clustercert")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CertDuration.class,
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        builder.withResponseField(
            "Port-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                CreateKubernetesClusterCertResponse::getPortID,
                CreateKubernetesClusterCertResponse::setPortID)
        );
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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("nodepoolScaleUp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            CreateNodeRequest.NodepoolScaleUpEnum.class,
            f -> f.withMarshaller(CreateNodeRequest::getNodepoolScaleUp, (req, v) -> {
                req.setNodepoolScaleUp(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NodeCreateRequest.class,
            f -> f.withMarshaller(CreateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> createNodePool = genForcreateNodePool();

    private static HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> genForcreateNodePool() {
        // basic
        HttpRequestDef.Builder<CreateNodePoolRequest, CreateNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNodePoolRequest.class, CreateNodePoolResponse.class)
                .withName("CreateNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NodePool.class,
            f -> f.withMarshaller(CreateNodePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstance = genFordeleteAddonInstance();

    private static HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> genFordeleteAddonInstance() {
        // basic
        HttpRequestDef.Builder<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAddonInstanceRequest.class, DeleteAddonInstanceResponse.class)
                .withName("DeleteAddonInstance")
                .withUri("/api/v3/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAddonInstanceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaims = genFordeleteCloudPersistentVolumeClaims();

    private static HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> genFordeleteCloudPersistentVolumeClaims() {
        // basic
        HttpRequestDef.Builder<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCloudPersistentVolumeClaimsRequest.class, DeleteCloudPersistentVolumeClaimsResponse.class)
                .withName("DeleteCloudPersistentVolumeClaims")
                .withUri("/api/v1/namespaces/{namespace}/cloudpersistentvolumeclaims/{name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("deleteVolume",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getDeleteVolume, (req, v) -> {
                req.setDeleteVolume(v);
            })
        );
        builder.withRequestField("storageType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getStorageType, (req, v) -> {
                req.setStorageType(v);
            })
        );
        builder.withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getXClusterID, (req, v) -> {
                req.setXClusterID(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster = genFordeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genFordeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("delete_efs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteClusterRequest.DeleteEfsEnum.class,
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEfs, (req, v) -> {
                req.setDeleteEfs(v);
            })
        );
        builder.withRequestField("delete_eni",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteClusterRequest.DeleteEniEnum.class,
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEni, (req, v) -> {
                req.setDeleteEni(v);
            })
        );
        builder.withRequestField("delete_evs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteClusterRequest.DeleteEvsEnum.class,
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEvs, (req, v) -> {
                req.setDeleteEvs(v);
            })
        );
        builder.withRequestField("delete_net",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteClusterRequest.DeleteNetEnum.class,
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteNet, (req, v) -> {
                req.setDeleteNet(v);
            })
        );
        builder.withRequestField("delete_obs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteClusterRequest.DeleteObsEnum.class,
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteObs, (req, v) -> {
                req.setDeleteObs(v);
            })
        );
        builder.withRequestField("delete_sfs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteClusterRequest.DeleteSfsEnum.class,
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteSfs, (req, v) -> {
                req.setDeleteSfs(v);
            })
        );
        builder.withRequestField("tobedeleted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteClusterRequest.TobedeletedEnum.class,
            f -> f.withMarshaller(DeleteClusterRequest::getTobedeleted, (req, v) -> {
                req.setTobedeleted(v);
            })
        );

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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("nodepoolScaleDown",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            DeleteNodeRequest.NodepoolScaleDownEnum.class,
            f -> f.withMarshaller(DeleteNodeRequest::getNodepoolScaleDown, (req, v) -> {
                req.setNodepoolScaleDown(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePool = genFordeleteNodePool();

    private static HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> genFordeleteNodePool() {
        // basic
        HttpRequestDef.Builder<DeleteNodePoolRequest, DeleteNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodePoolRequest.class, DeleteNodePoolResponse.class)
                .withName("DeleteNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> hibernateCluster = genForhibernateCluster();

    private static HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> genForhibernateCluster() {
        // basic
        HttpRequestDef.Builder<HibernateClusterRequest, HibernateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HibernateClusterRequest.class, HibernateClusterResponse.class)
                .withName("HibernateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/hibernate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(HibernateClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstances = genForlistAddonInstances();

    private static HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> genForlistAddonInstances() {
        // basic
        HttpRequestDef.Builder<ListAddonInstancesRequest, ListAddonInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonInstancesRequest.class, ListAddonInstancesResponse.class)
                .withName("ListAddonInstances")
                .withUri("/api/v3/addons")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAddonInstancesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplates = genForlistAddonTemplates();

    private static HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> genForlistAddonTemplates() {
        // basic
        HttpRequestDef.Builder<ListAddonTemplatesRequest, ListAddonTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonTemplatesRequest.class, ListAddonTemplatesResponse.class)
                .withName("ListAddonTemplates")
                .withUri("/api/v3/addontemplates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("addon_template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAddonTemplatesRequest::getAddonTemplateName, (req, v) -> {
                req.setAddonTemplateName(v);
            })
        );

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
        builder.withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListClustersRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListClustersRequest.StatusEnum.class,
            f -> f.withMarshaller(ListClustersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListClustersRequest.TypeEnum.class,
            f -> f.withMarshaller(ListClustersRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListClustersRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> listNodePools = genForlistNodePools();

    private static HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> genForlistNodePools() {
        // basic
        HttpRequestDef.Builder<ListNodePoolsRequest, ListNodePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodePoolsRequest.class, ListNodePoolsResponse.class)
                .withName("ListNodePools")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListNodePoolsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("showDefaultNodePool",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNodePoolsRequest::getShowDefaultNodePool, (req, v) -> {
                req.setShowDefaultNodePool(v);
            })
        );

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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListNodesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> migrateNode = genFormigrateNode();

    private static HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> genFormigrateNode() {
        // basic
        HttpRequestDef.Builder<MigrateNodeRequest, MigrateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MigrateNodeRequest.class, MigrateNodeResponse.class)
                .withName("MigrateNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/operation/migrateto/{target_cluster_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MigrateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("target_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MigrateNodeRequest::getTargetClusterId, (req, v) -> {
                req.setTargetClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            MigrateNodesTask.class,
            f -> f.withMarshaller(MigrateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemoveNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RemoveNodesTask.class,
            f -> f.withMarshaller(RemoveNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstance = genForshowAddonInstance();

    private static HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> genForshowAddonInstance() {
        // basic
        HttpRequestDef.Builder<ShowAddonInstanceRequest, ShowAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAddonInstanceRequest.class, ShowAddonInstanceResponse.class)
                .withName("ShowAddonInstance")
                .withUri("/api/v3/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAddonInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowClusterRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            })
        );

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
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );

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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );

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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstance = genForupdateAddonInstance();

    private static HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> genForupdateAddonInstance() {
        // basic
        HttpRequestDef.Builder<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAddonInstanceRequest.class, UpdateAddonInstanceResponse.class)
                .withName("UpdateAddonInstance")
                .withUri("/api/v3/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceRequest.class,
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> updateCluster = genForupdateCluster();

    private static HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> genForupdateCluster() {
        // basic
        HttpRequestDef.Builder<UpdateClusterRequest, UpdateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterRequest.class, UpdateClusterResponse.class)
                .withName("UpdateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ClusterInformation.class,
            f -> f.withMarshaller(UpdateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ClusterNodeInformation.class,
            f -> f.withMarshaller(UpdateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePool = genForupdateNodePool();

    private static HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> genForupdateNodePool() {
        // basic
        HttpRequestDef.Builder<UpdateNodePoolRequest, UpdateNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodePoolRequest.class, UpdateNodePoolResponse.class)
                .withName("UpdateNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NodePool.class,
            f -> f.withMarshaller(UpdateNodePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

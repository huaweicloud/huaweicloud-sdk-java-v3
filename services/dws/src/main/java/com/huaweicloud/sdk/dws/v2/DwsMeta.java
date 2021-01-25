package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dws.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DwsMeta {

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster = genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateClusterRequestBody.class,
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot = genForcreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForcreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withUri("/v1.0/{project_id}/snapshots")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSnapshotRequestBody.class,
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteClusterRequestBody.class,
            f -> f.withMarshaller(DeleteClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot = genFordeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genFordeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetails = genForlistClusterDetails();

    private static HttpRequestDef<ListClusterDetailsRequest, ListClusterDetailsResponse> genForlistClusterDetails() {
        // basic
        HttpRequestDef.Builder<ListClusterDetailsRequest, ListClusterDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterDetailsRequest.class, ListClusterDetailsResponse.class)
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListClusterDetailsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
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
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypes = genForlistNodeTypes();

    private static HttpRequestDef<ListNodeTypesRequest, ListNodeTypesResponse> genForlistNodeTypes() {
        // basic
        HttpRequestDef.Builder<ListNodeTypesRequest, ListNodeTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodeTypesRequest.class, ListNodeTypesResponse.class)
                .withUri("/v1.0/{project_id}/node_types")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetails = genForlistSnapshotDetails();

    private static HttpRequestDef<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> genForlistSnapshotDetails() {
        // basic
        HttpRequestDef.Builder<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotDetailsRequest.class, ListSnapshotDetailsResponse.class)
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSnapshotDetailsRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots = genForlistSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForlistSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withUri("/v1.0/{project_id}/snapshots")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword = genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/reset-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetPasswordRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetPasswordRequestBody.class,
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> resizeCluster = genForresizeCluster();

    private static HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> genForresizeCluster() {
        // basic
        HttpRequestDef.Builder<ResizeClusterRequest, ResizeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeClusterRequest.class, ResizeClusterResponse.class)
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResizeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            ResizeClusterRequestBody.class,
            f -> f.withMarshaller(ResizeClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartClusterRequest, RestartClusterResponse> restartCluster = genForrestartCluster();

    private static HttpRequestDef<RestartClusterRequest, RestartClusterResponse> genForrestartCluster() {
        // basic
        HttpRequestDef.Builder<RestartClusterRequest, RestartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartClusterRequest.class, RestartClusterResponse.class)
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/restart")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestartClusterRequestBody.class,
            f -> f.withMarshaller(RestartClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreClusterRequest, RestoreClusterResponse> restoreCluster = genForrestoreCluster();

    private static HttpRequestDef<RestoreClusterRequest, RestoreClusterResponse> genForrestoreCluster() {
        // basic
        HttpRequestDef.Builder<RestoreClusterRequest, RestoreClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreClusterRequest.class, RestoreClusterResponse.class)
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestoreClusterRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestoreClusterRequestBody.class,
            f -> f.withMarshaller(RestoreClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

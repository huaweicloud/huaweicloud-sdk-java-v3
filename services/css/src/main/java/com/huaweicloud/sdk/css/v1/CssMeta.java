package com.huaweicloud.sdk.css.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.css.v1.model.*;

@SuppressWarnings("unchecked")
public class CssMeta {

    public static final HttpRequestDef<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> createAutoCreatePolicy =
        genForcreateAutoCreatePolicy();

    private static HttpRequestDef<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> genForcreateAutoCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAutoCreatePolicyRequest.class, CreateAutoCreatePolicyResponse.class)
            .withName("CreateAutoCreatePolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoCreatePolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<SetRDSBackupCnfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRDSBackupCnfReq.class),
            f -> f.withMarshaller(CreateAutoCreatePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBindPublicRequest, CreateBindPublicResponse> createBindPublic =
        genForcreateBindPublic();

    private static HttpRequestDef<CreateBindPublicRequest, CreateBindPublicResponse> genForcreateBindPublic() {
        // basic
        HttpRequestDef.Builder<CreateBindPublicRequest, CreateBindPublicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBindPublicRequest.class, CreateBindPublicResponse.class)
                .withName("CreateBindPublic")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBindPublicRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BindPublicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindPublicReq.class),
            f -> f.withMarshaller(CreateBindPublicRequest::getBody, (req, v) -> {
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
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClustersTagsRequest, CreateClustersTagsResponse> createClustersTags =
        genForcreateClustersTags();

    private static HttpRequestDef<CreateClustersTagsRequest, CreateClustersTagsResponse> genForcreateClustersTags() {
        // basic
        HttpRequestDef.Builder<CreateClustersTagsRequest, CreateClustersTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClustersTagsRequest.class, CreateClustersTagsResponse.class)
                .withName("CreateClustersTags")
                .withUri("/v1.0/{project_id}/css-cluster/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClustersTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<TagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagReq.class),
            f -> f.withMarshaller(CreateClustersTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> createLoadIkThesaurus =
        genForcreateLoadIkThesaurus();

    private static HttpRequestDef<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> genForcreateLoadIkThesaurus() {
        // basic
        HttpRequestDef.Builder<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateLoadIkThesaurusRequest.class, CreateLoadIkThesaurusResponse.class)
            .withName("CreateLoadIkThesaurus")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/thesaurus")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLoadIkThesaurusRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<LoadCustomThesaurusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoadCustomThesaurusReq.class),
            f -> f.withMarshaller(CreateLoadIkThesaurusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogBackupRequest, CreateLogBackupResponse> createLogBackup =
        genForcreateLogBackup();

    private static HttpRequestDef<CreateLogBackupRequest, CreateLogBackupResponse> genForcreateLogBackup() {
        // basic
        HttpRequestDef.Builder<CreateLogBackupRequest, CreateLogBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogBackupRequest.class, CreateLogBackupResponse.class)
                .withName("CreateLogBackup")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/collect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogBackupRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot =
        genForcreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForcreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withName("CreateSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateSnapshotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotReq.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, (req, v) -> {
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
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClustersTagsRequest, DeleteClustersTagsResponse> deleteClustersTags =
        genFordeleteClustersTags();

    private static HttpRequestDef<DeleteClustersTagsRequest, DeleteClustersTagsResponse> genFordeleteClustersTags() {
        // basic
        HttpRequestDef.Builder<DeleteClustersTagsRequest, DeleteClustersTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClustersTagsRequest.class, DeleteClustersTagsResponse.class)
                .withName("DeleteClustersTags")
                .withUri("/v1.0/{project_id}/css-cluster/{cluster_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClustersTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClustersTagsRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> deleteIkThesaurus =
        genFordeleteIkThesaurus();

    private static HttpRequestDef<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> genFordeleteIkThesaurus() {
        // basic
        HttpRequestDef.Builder<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIkThesaurusRequest.class, DeleteIkThesaurusResponse.class)
                .withName("DeleteIkThesaurus")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/thesaurus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIkThesaurusRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot =
        genFordeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genFordeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withName("DeleteSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadCertRequest, DownloadCertResponse> downloadCert = genFordownloadCert();

    private static HttpRequestDef<DownloadCertRequest, DownloadCertResponse> genFordownloadCert() {
        // basic
        HttpRequestDef.Builder<DownloadCertRequest, DownloadCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadCertRequest.class, DownloadCertResponse.class)
                .withName("DownloadCert")
                .withUri("/v1.0/{project_id}/cer/download")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersDetailsRequest, ListClustersDetailsResponse> listClustersDetails =
        genForlistClustersDetails();

    private static HttpRequestDef<ListClustersDetailsRequest, ListClustersDetailsResponse> genForlistClustersDetails() {
        // basic
        HttpRequestDef.Builder<ListClustersDetailsRequest, ListClustersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersDetailsRequest.class, ListClustersDetailsResponse.class)
                .withName("ListClustersDetails")
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersDetailsRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersTagsRequest, ListClustersTagsResponse> listClustersTags =
        genForlistClustersTags();

    private static HttpRequestDef<ListClustersTagsRequest, ListClustersTagsResponse> genForlistClustersTags() {
        // basic
        HttpRequestDef.Builder<ListClustersTagsRequest, ListClustersTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersTagsRequest.class, ListClustersTagsResponse.class)
                .withName("ListClustersTags")
                .withUri("/v1.0/{project_id}/css-cluster/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v1.0/{project_id}/es-flavors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogsJobRequest, ListLogsJobResponse> listLogsJob = genForlistLogsJob();

    private static HttpRequestDef<ListLogsJobRequest, ListLogsJobResponse> genForlistLogsJob() {
        // basic
        HttpRequestDef.Builder<ListLogsJobRequest, ListLogsJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogsJobRequest.class, ListLogsJobResponse.class)
                .withName("ListLogsJob")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForlistSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForlistSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListYmlsRequest, ListYmlsResponse> listYmls = genForlistYmls();

    private static HttpRequestDef<ListYmlsRequest, ListYmlsResponse> genForlistYmls() {
        // basic
        HttpRequestDef.Builder<ListYmlsRequest, ListYmlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListYmlsRequest.class, ListYmlsResponse.class)
                .withName("ListYmls")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ymls/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListYmlsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListYmlsJobRequest, ListYmlsJobResponse> listYmlsJob = genForlistYmlsJob();

    private static HttpRequestDef<ListYmlsJobRequest, ListYmlsJobResponse> genForlistYmlsJob() {
        // basic
        HttpRequestDef.Builder<ListYmlsJobRequest, ListYmlsJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListYmlsJobRequest.class, ListYmlsJobResponse.class)
                .withName("ListYmlsJob")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ymls/joblists")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListYmlsJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/password/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreSnapshotRequest, RestoreSnapshotResponse> restoreSnapshot =
        genForrestoreSnapshot();

    private static HttpRequestDef<RestoreSnapshotRequest, RestoreSnapshotResponse> genForrestoreSnapshot() {
        // basic
        HttpRequestDef.Builder<RestoreSnapshotRequest, RestoreSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreSnapshotRequest.class, RestoreSnapshotResponse.class)
                .withName("RestoreSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/{snapshot_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreSnapshotRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));
        builder.<RestoreSnapshotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreSnapshotReq.class),
            f -> f.withMarshaller(RestoreSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> showAutoCreatePolicy =
        genForshowAutoCreatePolicy();

    private static HttpRequestDef<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> genForshowAutoCreatePolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoCreatePolicyRequest.class, ShowAutoCreatePolicyResponse.class)
            .withName("ShowAutoCreatePolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoCreatePolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
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
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
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

    public static final HttpRequestDef<ShowClusterTagRequest, ShowClusterTagResponse> showClusterTag =
        genForshowClusterTag();

    private static HttpRequestDef<ShowClusterTagRequest, ShowClusterTagResponse> genForshowClusterTag() {
        // basic
        HttpRequestDef.Builder<ShowClusterTagRequest, ShowClusterTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterTagRequest.class, ShowClusterTagResponse.class)
                .withName("ShowClusterTag")
                .withUri("/v1.0/{project_id}/css-cluster/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterTagRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetLogSettingRequest, ShowGetLogSettingResponse> showGetLogSetting =
        genForshowGetLogSetting();

    private static HttpRequestDef<ShowGetLogSettingRequest, ShowGetLogSettingResponse> genForshowGetLogSetting() {
        // basic
        HttpRequestDef.Builder<ShowGetLogSettingRequest, ShowGetLogSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGetLogSettingRequest.class, ShowGetLogSettingResponse.class)
                .withName("ShowGetLogSetting")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetLogSettingRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIkThesaurusRequest, ShowIkThesaurusResponse> showIkThesaurus =
        genForshowIkThesaurus();

    private static HttpRequestDef<ShowIkThesaurusRequest, ShowIkThesaurusResponse> genForshowIkThesaurus() {
        // basic
        HttpRequestDef.Builder<ShowIkThesaurusRequest, ShowIkThesaurusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIkThesaurusRequest.class, ShowIkThesaurusResponse.class)
                .withName("ShowIkThesaurus")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/thesaurus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIkThesaurusRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogBackupRequest, ShowLogBackupResponse> showLogBackup =
        genForshowLogBackup();

    private static HttpRequestDef<ShowLogBackupRequest, ShowLogBackupResponse> genForshowLogBackup() {
        // basic
        HttpRequestDef.Builder<ShowLogBackupRequest, ShowLogBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowLogBackupRequest.class, ShowLogBackupResponse.class)
                .withName("ShowLogBackup")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogBackupRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<GetLogBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetLogBackupReq.class),
            f -> f.withMarshaller(ShowLogBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> showVpcepConnection =
        genForshowVpcepConnection();

    private static HttpRequestDef<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> genForshowVpcepConnection() {
        // basic
        HttpRequestDef.Builder<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcepConnectionRequest.class, ShowVpcepConnectionResponse.class)
                .withName("ShowVpcepConnection")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcepConnectionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAutoSettingRequest, StartAutoSettingResponse> startAutoSetting =
        genForstartAutoSetting();

    private static HttpRequestDef<StartAutoSettingRequest, StartAutoSettingResponse> genForstartAutoSetting() {
        // basic
        HttpRequestDef.Builder<StartAutoSettingRequest, StartAutoSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartAutoSettingRequest.class, StartAutoSettingResponse.class)
                .withName("StartAutoSetting")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/auto_setting")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoSettingRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicy =
        genForstartLogAutoBackupPolicy();

    private static HttpRequestDef<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> genForstartLogAutoBackupPolicy() {
        // basic
        HttpRequestDef.Builder<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, StartLogAutoBackupPolicyRequest.class, StartLogAutoBackupPolicyResponse.class)
                .withName("StartLogAutoBackupPolicy")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/policy/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartLogAutoBackupPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartLogAutoBackupPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartLogAutoBackupPolicyReq.class),
            f -> f.withMarshaller(StartLogAutoBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartLogsRequest, StartLogsResponse> startLogs = genForstartLogs();

    private static HttpRequestDef<StartLogsRequest, StartLogsResponse> genForstartLogs() {
        // basic
        HttpRequestDef.Builder<StartLogsRequest, StartLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartLogsRequest.class, StartLogsResponse.class)
                .withName("StartLogs")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartLogsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartLogsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartLogsReq.class),
            f -> f.withMarshaller(StartLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPublicWhitelistRequest, StartPublicWhitelistResponse> startPublicWhitelist =
        genForstartPublicWhitelist();

    private static HttpRequestDef<StartPublicWhitelistRequest, StartPublicWhitelistResponse> genForstartPublicWhitelist() {
        // basic
        HttpRequestDef.Builder<StartPublicWhitelistRequest, StartPublicWhitelistResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartPublicWhitelistRequest.class, StartPublicWhitelistResponse.class)
            .withName("StartPublicWhitelist")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/whitelist/update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPublicWhitelistRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartPublicWhitelistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartPublicWhitelistReq.class),
            f -> f.withMarshaller(StartPublicWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartVpecpRequest, StartVpecpResponse> startVpecp = genForstartVpecp();

    private static HttpRequestDef<StartVpecpRequest, StartVpecpResponse> genForstartVpecp() {
        // basic
        HttpRequestDef.Builder<StartVpecpRequest, StartVpecpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartVpecpRequest.class, StartVpecpResponse.class)
                .withName("StartVpecp")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpecpRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartVpecpReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartVpecpReq.class),
            f -> f.withMarshaller(StartVpecpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicy =
        genForstopLogAutoBackupPolicy();

    private static HttpRequestDef<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> genForstopLogAutoBackupPolicy() {
        // basic
        HttpRequestDef.Builder<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, StopLogAutoBackupPolicyRequest.class, StopLogAutoBackupPolicyResponse.class)
            .withName("StopLogAutoBackupPolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/policy/close")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopLogAutoBackupPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopLogsRequest, StopLogsResponse> stopLogs = genForstopLogs();

    private static HttpRequestDef<StopLogsRequest, StopLogsResponse> genForstopLogs() {
        // basic
        HttpRequestDef.Builder<StopLogsRequest, StopLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopLogsRequest.class, StopLogsResponse.class)
                .withName("StopLogs")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopLogsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPublicWhitelistRequest, StopPublicWhitelistResponse> stopPublicWhitelist =
        genForstopPublicWhitelist();

    private static HttpRequestDef<StopPublicWhitelistRequest, StopPublicWhitelistResponse> genForstopPublicWhitelist() {
        // basic
        HttpRequestDef.Builder<StopPublicWhitelistRequest, StopPublicWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopPublicWhitelistRequest.class, StopPublicWhitelistResponse.class)
                .withName("StopPublicWhitelist")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/whitelist/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPublicWhitelistRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSnapshotRequest, StopSnapshotResponse> stopSnapshot = genForstopSnapshot();

    private static HttpRequestDef<StopSnapshotRequest, StopSnapshotResponse> genForstopSnapshot() {
        // basic
        HttpRequestDef.Builder<StopSnapshotRequest, StopSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, StopSnapshotRequest.class, StopSnapshotResponse.class)
                .withName("StopSnapshot")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSnapshotRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopVpecpRequest, StopVpecpResponse> stopVpecp = genForstopVpecp();

    private static HttpRequestDef<StopVpecpRequest, StopVpecpResponse> genForstopVpecp() {
        // basic
        HttpRequestDef.Builder<StopVpecpRequest, StopVpecpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopVpecpRequest.class, StopVpecpResponse.class)
                .withName("StopVpecp")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVpecpRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> updateBatchClustersTags =
        genForupdateBatchClustersTags();

    private static HttpRequestDef<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> genForupdateBatchClustersTags() {
        // basic
        HttpRequestDef.Builder<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateBatchClustersTagsRequest.class, UpdateBatchClustersTagsResponse.class)
            .withName("UpdateBatchClustersTags")
            .withUri("/v1.0/{project_id}/css-cluster/{cluster_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchClustersTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BatchAddOrDeleteTagOnClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddOrDeleteTagOnClusterReq.class),
            f -> f.withMarshaller(UpdateBatchClustersTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterName =
        genForupdateClusterName();

    private static HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> genForupdateClusterName() {
        // basic
        HttpRequestDef.Builder<UpdateClusterNameRequest, UpdateClusterNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateClusterNameRequest.class, UpdateClusterNameResponse.class)
                .withName("UpdateClusterName")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/changename")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateClusterNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterNameReq.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExtendClusterRequest, UpdateExtendClusterResponse> updateExtendCluster =
        genForupdateExtendCluster();

    private static HttpRequestDef<UpdateExtendClusterRequest, UpdateExtendClusterResponse> genForupdateExtendCluster() {
        // basic
        HttpRequestDef.Builder<UpdateExtendClusterRequest, UpdateExtendClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateExtendClusterRequest.class, UpdateExtendClusterResponse.class)
                .withName("UpdateExtendCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExtendClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ExtendClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtendClusterReq.class),
            f -> f.withMarshaller(UpdateExtendClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> updateExtendInstanceStorage =
        genForupdateExtendInstanceStorage();

    private static HttpRequestDef<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> genForupdateExtendInstanceStorage() {
        // basic
        HttpRequestDef.Builder<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateExtendInstanceStorageRequest.class,
                    UpdateExtendInstanceStorageResponse.class)
                .withName("UpdateExtendInstanceStorage")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/role_extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExtendInstanceStorageRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<RoleExtendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoleExtendReq.class),
            f -> f.withMarshaller(UpdateExtendInstanceStorageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlavorRequest, UpdateFlavorResponse> updateFlavor = genForupdateFlavor();

    private static HttpRequestDef<UpdateFlavorRequest, UpdateFlavorResponse> genForupdateFlavor() {
        // basic
        HttpRequestDef.Builder<UpdateFlavorRequest, UpdateFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFlavorRequest.class, UpdateFlavorResponse.class)
                .withName("UpdateFlavor")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/flavor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlavorRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateFlavorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlavorReq.class),
            f -> f.withMarshaller(UpdateFlavorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> updateFlavorByType =
        genForupdateFlavorByType();

    private static HttpRequestDef<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> genForupdateFlavorByType() {
        // basic
        HttpRequestDef.Builder<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFlavorByTypeRequest.class, UpdateFlavorByTypeResponse.class)
                .withName("UpdateFlavorByType")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/{types}/flavor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlavorByTypeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("types",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlavorByTypeRequest::getTypes, (req, v) -> {
                req.setTypes(v);
            }));
        builder.<UpdateFlavorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlavorReq.class),
            f -> f.withMarshaller(UpdateFlavorByTypeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogSettingRequest, UpdateLogSettingResponse> updateLogSetting =
        genForupdateLogSetting();

    private static HttpRequestDef<UpdateLogSettingRequest, UpdateLogSettingResponse> genForupdateLogSetting() {
        // basic
        HttpRequestDef.Builder<UpdateLogSettingRequest, UpdateLogSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateLogSettingRequest.class, UpdateLogSettingResponse.class)
                .withName("UpdateLogSetting")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/logs/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogSettingRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateLogSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogSettingReq.class),
            f -> f.withMarshaller(UpdateLogSettingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriod =
        genForupdateOndemandClusterToPeriod();

    private static HttpRequestDef<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> genForupdateOndemandClusterToPeriod() {
        // basic
        HttpRequestDef.Builder<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateOndemandClusterToPeriodRequest.class,
                    UpdateOndemandClusterToPeriodResponse.class)
                .withName("UpdateOndemandClusterToPeriod")
                .withUri("/v1.0/{project_id}/cluster/{cluster_id}/period")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOndemandClusterToPeriodRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<PeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PeriodReq.class),
            f -> f.withMarshaller(UpdateOndemandClusterToPeriodRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> updatePublicBandWidth =
        genForupdatePublicBandWidth();

    private static HttpRequestDef<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> genForupdatePublicBandWidth() {
        // basic
        HttpRequestDef.Builder<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdatePublicBandWidthRequest.class, UpdatePublicBandWidthResponse.class)
            .withName("UpdatePublicBandWidth")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/bandwidth")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicBandWidthRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BindPublicReqEip>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindPublicReqEip.class),
            f -> f.withMarshaller(UpdatePublicBandWidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> updateShrinkCluster =
        genForupdateShrinkCluster();

    private static HttpRequestDef<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> genForupdateShrinkCluster() {
        // basic
        HttpRequestDef.Builder<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateShrinkClusterRequest.class, UpdateShrinkClusterResponse.class)
                .withName("UpdateShrinkCluster")
                .withUri("/v1.0/extend/{project_id}/clusters/{cluster_id}/role/shrink")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateShrinkClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ShrinkClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkClusterReq.class),
            f -> f.withMarshaller(UpdateShrinkClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> updateShrinkNodes =
        genForupdateShrinkNodes();

    private static HttpRequestDef<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> genForupdateShrinkNodes() {
        // basic
        HttpRequestDef.Builder<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateShrinkNodesRequest.class, UpdateShrinkNodesResponse.class)
                .withName("UpdateShrinkNodes")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/node/offline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateShrinkNodesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ShrinkNodesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkNodesReq.class),
            f -> f.withMarshaller(UpdateShrinkNodesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> updateSnapshotSetting =
        genForupdateSnapshotSetting();

    private static HttpRequestDef<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> genForupdateSnapshotSetting() {
        // basic
        HttpRequestDef.Builder<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSnapshotSettingRequest.class, UpdateSnapshotSettingResponse.class)
            .withName("UpdateSnapshotSetting")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/index_snapshot/setting")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSnapshotSettingRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateSnapshotSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSnapshotSettingReq.class),
            f -> f.withMarshaller(UpdateSnapshotSettingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> updateUnbindPublic =
        genForupdateUnbindPublic();

    private static HttpRequestDef<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> genForupdateUnbindPublic() {
        // basic
        HttpRequestDef.Builder<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUnbindPublicRequest.class, UpdateUnbindPublicResponse.class)
                .withName("UpdateUnbindPublic")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/public/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUnbindPublicRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> updateVpcepConnection =
        genForupdateVpcepConnection();

    private static HttpRequestDef<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> genForupdateVpcepConnection() {
        // basic
        HttpRequestDef.Builder<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateVpcepConnectionRequest.class, UpdateVpcepConnectionResponse.class)
            .withName("UpdateVpcepConnection")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/connections")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcepConnectionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateVpcepConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcepConnectionReq.class),
            f -> f.withMarshaller(UpdateVpcepConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> updateVpcepWhitelist =
        genForupdateVpcepWhitelist();

    private static HttpRequestDef<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> genForupdateVpcepWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateVpcepWhitelistRequest.class, UpdateVpcepWhitelistResponse.class)
            .withName("UpdateVpcepWhitelist")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/vpcepservice/permissions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcepWhitelistRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateVpcepWhitelistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcepWhitelistReq.class),
            f -> f.withMarshaller(UpdateVpcepWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateYmlsRequest, UpdateYmlsResponse> updateYmls = genForupdateYmls();

    private static HttpRequestDef<UpdateYmlsRequest, UpdateYmlsResponse> genForupdateYmls() {
        // basic
        HttpRequestDef.Builder<UpdateYmlsRequest, UpdateYmlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateYmlsRequest.class, UpdateYmlsResponse.class)
                .withName("UpdateYmls")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ymls/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateYmlsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateYmlsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateYmlsReq.class),
            f -> f.withMarshaller(UpdateYmlsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartKibanaPublicRequest, StartKibanaPublicResponse> startKibanaPublic =
        genForstartKibanaPublic();

    private static HttpRequestDef<StartKibanaPublicRequest, StartKibanaPublicResponse> genForstartKibanaPublic() {
        // basic
        HttpRequestDef.Builder<StartKibanaPublicRequest, StartKibanaPublicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartKibanaPublicRequest.class, StartKibanaPublicResponse.class)
                .withName("StartKibanaPublic")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartKibanaPublicRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartKibanaPublicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartKibanaPublicReq.class),
            f -> f.withMarshaller(StartKibanaPublicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelist =
        genForstopPublicKibanaWhitelist();

    private static HttpRequestDef<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> genForstopPublicKibanaWhitelist() {
        // basic
        HttpRequestDef.Builder<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    StopPublicKibanaWhitelistRequest.class,
                    StopPublicKibanaWhitelistResponse.class)
                .withName("StopPublicKibanaWhitelist")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/whitelist/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPublicKibanaWhitelistRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> updateAlterKibana =
        genForupdateAlterKibana();

    private static HttpRequestDef<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> genForupdateAlterKibana() {
        // basic
        HttpRequestDef.Builder<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAlterKibanaRequest.class, UpdateAlterKibanaResponse.class)
                .withName("UpdateAlterKibana")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/bandwidth")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlterKibanaRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdatePublicKibanaBandwidthReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicKibanaBandwidthReq.class),
            f -> f.withMarshaller(UpdateAlterKibanaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> updateCloseKibana =
        genForupdateCloseKibana();

    private static HttpRequestDef<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> genForupdateCloseKibana() {
        // basic
        HttpRequestDef.Builder<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCloseKibanaRequest.class, UpdateCloseKibanaResponse.class)
                .withName("UpdateCloseKibana")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloseKibanaRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelist =
        genForupdatePublicKibanaWhitelist();

    private static HttpRequestDef<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> genForupdatePublicKibanaWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdatePublicKibanaWhitelistRequest.class,
                    UpdatePublicKibanaWhitelistResponse.class)
                .withName("UpdatePublicKibanaWhitelist")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/publickibana/whitelist/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicKibanaWhitelistRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdatePublicKibanaWhitelistReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicKibanaWhitelistReq.class),
            f -> f.withMarshaller(UpdatePublicKibanaWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFavoriteRequest, AddFavoriteResponse> addFavorite = genForaddFavorite();

    private static HttpRequestDef<AddFavoriteRequest, AddFavoriteResponse> genForaddFavorite() {
        // basic
        HttpRequestDef.Builder<AddFavoriteRequest, AddFavoriteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFavoriteRequest.class, AddFavoriteResponse.class)
                .withName("AddFavorite")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/favorite")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFavoriteRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AddFavoriteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFavoriteReq.class),
            f -> f.withMarshaller(AddFavoriteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCnfRequest, CreateCnfResponse> createCnf = genForcreateCnf();

    private static HttpRequestDef<CreateCnfRequest, CreateCnfResponse> genForcreateCnf() {
        // basic
        HttpRequestDef.Builder<CreateCnfRequest, CreateCnfResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCnfRequest.class, CreateCnfResponse.class)
                .withName("CreateCnf")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/submit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCnfRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateCnfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCnfReq.class),
            f -> f.withMarshaller(CreateCnfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfRequest, DeleteConfResponse> deleteConf = genFordeleteConf();

    private static HttpRequestDef<DeleteConfRequest, DeleteConfResponse> genFordeleteConf() {
        // basic
        HttpRequestDef.Builder<DeleteConfRequest, DeleteConfResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfRequest.class, DeleteConfResponse.class)
                .withName("DeleteConf")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<DeleteConfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteConfReq.class),
            f -> f.withMarshaller(DeleteConfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1.0/{project_id}/lgsconf/deletetemplate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<DeleteTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTemplateReq.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActionsRequest, ListActionsResponse> listActions = genForlistActions();

    private static HttpRequestDef<ListActionsRequest, ListActionsResponse> genForlistActions() {
        // basic
        HttpRequestDef.Builder<ListActionsRequest, ListActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListActionsRequest.class, ListActionsResponse.class)
                .withName("ListActions")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/listactions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActionsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfsRequest, ListConfsResponse> listConfs = genForlistConfs();

    private static HttpRequestDef<ListConfsRequest, ListConfsResponse> genForlistConfs() {
        // basic
        HttpRequestDef.Builder<ListConfsRequest, ListConfsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfsRequest.class, ListConfsResponse.class)
                .withName("ListConfs")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/listconfs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> listPipelines =
        genForlistPipelines();

    private static HttpRequestDef<ListPipelinesRequest, ListPipelinesResponse> genForlistPipelines() {
        // basic
        HttpRequestDef.Builder<ListPipelinesRequest, ListPipelinesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPipelinesRequest.class, ListPipelinesResponse.class)
                .withName("ListPipelines")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/listpipelines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPipelinesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v1.0/{project_id}/lgsconf/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetConfDetailRequest, ShowGetConfDetailResponse> showGetConfDetail =
        genForshowGetConfDetail();

    private static HttpRequestDef<ShowGetConfDetailRequest, ShowGetConfDetailResponse> genForshowGetConfDetail() {
        // basic
        HttpRequestDef.Builder<ShowGetConfDetailRequest, ShowGetConfDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGetConfDetailRequest.class, ShowGetConfDetailResponse.class)
                .withName("ShowGetConfDetail")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/confdetail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetConfDetailRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetConfDetailRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartConnectivityTestRequest, StartConnectivityTestResponse> startConnectivityTest =
        genForstartConnectivityTest();

    private static HttpRequestDef<StartConnectivityTestRequest, StartConnectivityTestResponse> genForstartConnectivityTest() {
        // basic
        HttpRequestDef.Builder<StartConnectivityTestRequest, StartConnectivityTestResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartConnectivityTestRequest.class, StartConnectivityTestResponse.class)
            .withName("StartConnectivityTest")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/checkconnection")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartConnectivityTestRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartConnectivityTestReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartConnectivityTestReq.class),
            f -> f.withMarshaller(StartConnectivityTestRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPipelineRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<StartPipelineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartPipelineReq.class),
            f -> f.withMarshaller(StartPipelineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopPipelineRequest, StopPipelineResponse> stopPipeline = genForstopPipeline();

    private static HttpRequestDef<StopPipelineRequest, StopPipelineResponse> genForstopPipeline() {
        // basic
        HttpRequestDef.Builder<StopPipelineRequest, StopPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopPipelineRequest.class, StopPipelineResponse.class)
                .withName("StopPipeline")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopPipelineRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCnfRequest, UpdateCnfResponse> updateCnf = genForupdateCnf();

    private static HttpRequestDef<UpdateCnfRequest, UpdateCnfResponse> genForupdateCnf() {
        // basic
        HttpRequestDef.Builder<UpdateCnfRequest, UpdateCnfResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateCnfRequest.class, UpdateCnfResponse.class)
                .withName("UpdateCnf")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/lgsconf/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCnfRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateCnfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCnfReq.class),
            f -> f.withMarshaller(UpdateCnfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

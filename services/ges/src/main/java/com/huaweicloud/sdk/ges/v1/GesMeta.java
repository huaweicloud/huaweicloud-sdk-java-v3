package com.huaweicloud.sdk.ges.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ges.v1.model.AttachEipRequest;
import com.huaweicloud.sdk.ges.v1.model.AttachEipResponse;
import com.huaweicloud.sdk.ges.v1.model.BindEipReq;
import com.huaweicloud.sdk.ges.v1.model.ClearGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.ClearGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.CreateBackupRequest;
import com.huaweicloud.sdk.ges.v1.model.CreateBackupResponse;
import com.huaweicloud.sdk.ges.v1.model.CreateGraphReq;
import com.huaweicloud.sdk.ges.v1.model.CreateGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.CreateGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.CreateMetadataReq;
import com.huaweicloud.sdk.ges.v1.model.CreateMetadataRequest;
import com.huaweicloud.sdk.ges.v1.model.CreateMetadataResponse;
import com.huaweicloud.sdk.ges.v1.model.DeleteBackupRequest;
import com.huaweicloud.sdk.ges.v1.model.DeleteBackupResponse;
import com.huaweicloud.sdk.ges.v1.model.DeleteGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.DeleteGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.DeleteMetadataRequest;
import com.huaweicloud.sdk.ges.v1.model.DeleteMetadataResponse;
import com.huaweicloud.sdk.ges.v1.model.DetachEipRequest;
import com.huaweicloud.sdk.ges.v1.model.DetachEipResponse;
import com.huaweicloud.sdk.ges.v1.model.ExpandGraphReq;
import com.huaweicloud.sdk.ges.v1.model.ExpandGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.ExpandGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.ExportGraphReq;
import com.huaweicloud.sdk.ges.v1.model.ExportGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.ExportGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.ImportGraphReq;
import com.huaweicloud.sdk.ges.v1.model.ImportGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.ImportGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.ListBackupsRequest;
import com.huaweicloud.sdk.ges.v1.model.ListBackupsResponse;
import com.huaweicloud.sdk.ges.v1.model.ListGraphBackupsRequest;
import com.huaweicloud.sdk.ges.v1.model.ListGraphBackupsResponse;
import com.huaweicloud.sdk.ges.v1.model.ListGraphMetadatasRequest;
import com.huaweicloud.sdk.ges.v1.model.ListGraphMetadatasResponse;
import com.huaweicloud.sdk.ges.v1.model.ListGraphsRequest;
import com.huaweicloud.sdk.ges.v1.model.ListGraphsResponse;
import com.huaweicloud.sdk.ges.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.ges.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.ges.v1.model.ListMetadatasRequest;
import com.huaweicloud.sdk.ges.v1.model.ListMetadatasResponse;
import com.huaweicloud.sdk.ges.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.ges.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.ges.v1.model.ResizeGraphReq;
import com.huaweicloud.sdk.ges.v1.model.ResizeGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.ResizeGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.RestartGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.RestartGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.ShowGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.ShowGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.ges.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.ges.v1.model.StartGraphReq;
import com.huaweicloud.sdk.ges.v1.model.StartGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.StartGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.StopGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.StopGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.UnbindEipReq;
import com.huaweicloud.sdk.ges.v1.model.UpgradeGraphReq;
import com.huaweicloud.sdk.ges.v1.model.UpgradeGraphRequest;
import com.huaweicloud.sdk.ges.v1.model.UpgradeGraphResponse;
import com.huaweicloud.sdk.ges.v1.model.UploadFromOBSReq;
import com.huaweicloud.sdk.ges.v1.model.UploadFromObsRequest;
import com.huaweicloud.sdk.ges.v1.model.UploadFromObsResponse;

@SuppressWarnings("unchecked")
public class GesMeta {

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForAttachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForAttachEip() {
        // basic
        HttpRequestDef.Builder<AttachEipRequest, AttachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachEipRequest.class, AttachEipResponse.class)
                .withName("AttachEip")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEipRequest::getGraphId, AttachEipRequest::setGraphId));
        builder.<AttachEipRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachEipRequest.ActionIdEnum.class),
            f -> f.withMarshaller(AttachEipRequest::getActionId, AttachEipRequest::setActionId));
        builder.<BindEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEipReq.class),
            f -> f.withMarshaller(AttachEipRequest::getBody, AttachEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ClearGraphRequest, ClearGraphResponse> clearGraph = genForClearGraph();

    private static HttpRequestDef<ClearGraphRequest, ClearGraphResponse> genForClearGraph() {
        // basic
        HttpRequestDef.Builder<ClearGraphRequest, ClearGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ClearGraphRequest.class, ClearGraphResponse.class)
                .withName("ClearGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ClearGraphRequest::getGraphId, ClearGraphRequest::setGraphId));
        builder.<ClearGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClearGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ClearGraphRequest::getActionId, ClearGraphRequest::setActionId));
        builder.<Boolean>withRequestField("clear-metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ClearGraphRequest::getClearMetadata, ClearGraphRequest::setClearMetadata));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackupRequest, CreateBackupResponse> createBackup = genForCreateBackup();

    private static HttpRequestDef<CreateBackupRequest, CreateBackupResponse> genForCreateBackup() {
        // basic
        HttpRequestDef.Builder<CreateBackupRequest, CreateBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBackupRequest.class, CreateBackupResponse.class)
                .withName("CreateBackup")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBackupRequest::getGraphId, CreateBackupRequest::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGraphRequest, CreateGraphResponse> createGraph = genForCreateGraph();

    private static HttpRequestDef<CreateGraphRequest, CreateGraphResponse> genForCreateGraph() {
        // basic
        HttpRequestDef.Builder<CreateGraphRequest, CreateGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGraphRequest.class, CreateGraphResponse.class)
                .withName("CreateGraph")
                .withUri("/v1.0/{project_id}/graphs")
                .withContentType("application/json");

        // requests
        builder.<CreateGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGraphReq.class),
            f -> f.withMarshaller(CreateGraphRequest::getBody, CreateGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> createMetadata =
        genForCreateMetadata();

    private static HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> genForCreateMetadata() {
        // basic
        HttpRequestDef.Builder<CreateMetadataRequest, CreateMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMetadataRequest.class, CreateMetadataResponse.class)
                .withName("CreateMetadata")
                .withUri("/v1.0/{project_id}/graphs/metadatas")
                .withContentType("application/json");

        // requests
        builder.<CreateMetadataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMetadataReq.class),
            f -> f.withMarshaller(CreateMetadataRequest::getBody, CreateMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genForDeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genForDeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, DeleteBackupRequest::setBackupId));
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getGraphId, DeleteBackupRequest::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGraphRequest, DeleteGraphResponse> deleteGraph = genForDeleteGraph();

    private static HttpRequestDef<DeleteGraphRequest, DeleteGraphResponse> genForDeleteGraph() {
        // basic
        HttpRequestDef.Builder<DeleteGraphRequest, DeleteGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGraphRequest.class, DeleteGraphResponse.class)
                .withName("DeleteGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGraphRequest::getGraphId, DeleteGraphRequest::setGraphId));
        builder.<Boolean>withRequestField("keepBackup",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteGraphRequest::getKeepBackup, DeleteGraphRequest::setKeepBackup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMetadataRequest, DeleteMetadataResponse> deleteMetadata =
        genForDeleteMetadata();

    private static HttpRequestDef<DeleteMetadataRequest, DeleteMetadataResponse> genForDeleteMetadata() {
        // basic
        HttpRequestDef.Builder<DeleteMetadataRequest, DeleteMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMetadataRequest.class, DeleteMetadataResponse.class)
                .withName("DeleteMetadata")
                .withUri("/v1.0/{project_id}/graphs/metadatas/{metadata_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metadata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMetadataRequest::getMetadataId, DeleteMetadataRequest::setMetadataId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachEipRequest, DetachEipResponse> detachEip = genForDetachEip();

    private static HttpRequestDef<DetachEipRequest, DetachEipResponse> genForDetachEip() {
        // basic
        HttpRequestDef.Builder<DetachEipRequest, DetachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachEipRequest.class, DetachEipResponse.class)
                .withName("DetachEip")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachEipRequest::getGraphId, DetachEipRequest::setGraphId));
        builder.<DetachEipRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachEipRequest.ActionIdEnum.class),
            f -> f.withMarshaller(DetachEipRequest::getActionId, DetachEipRequest::setActionId));
        builder.<UnbindEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnbindEipReq.class),
            f -> f.withMarshaller(DetachEipRequest::getBody, DetachEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGraphRequest, ExpandGraphResponse> expandGraph = genForExpandGraph();

    private static HttpRequestDef<ExpandGraphRequest, ExpandGraphResponse> genForExpandGraph() {
        // basic
        HttpRequestDef.Builder<ExpandGraphRequest, ExpandGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandGraphRequest.class, ExpandGraphResponse.class)
                .withName("ExpandGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGraphRequest::getGraphId, ExpandGraphRequest::setGraphId));
        builder.<ExpandGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandGraphReq.class),
            f -> f.withMarshaller(ExpandGraphRequest::getBody, ExpandGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportGraphRequest, ExportGraphResponse> exportGraph = genForExportGraph();

    private static HttpRequestDef<ExportGraphRequest, ExportGraphResponse> genForExportGraph() {
        // basic
        HttpRequestDef.Builder<ExportGraphRequest, ExportGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportGraphRequest.class, ExportGraphResponse.class)
                .withName("ExportGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportGraphRequest::getGraphId, ExportGraphRequest::setGraphId));
        builder.<ExportGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ExportGraphRequest::getActionId, ExportGraphRequest::setActionId));
        builder.<ExportGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportGraphReq.class),
            f -> f.withMarshaller(ExportGraphRequest::getBody, ExportGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportGraphRequest, ImportGraphResponse> importGraph = genForImportGraph();

    private static HttpRequestDef<ImportGraphRequest, ImportGraphResponse> genForImportGraph() {
        // basic
        HttpRequestDef.Builder<ImportGraphRequest, ImportGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportGraphRequest.class, ImportGraphResponse.class)
                .withName("ImportGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportGraphRequest::getGraphId, ImportGraphRequest::setGraphId));
        builder.<ImportGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ImportGraphRequest::getActionId, ImportGraphRequest::setActionId));
        builder.<ImportGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportGraphReq.class),
            f -> f.withMarshaller(ImportGraphRequest::getBody, ImportGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForListBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForListBackups() {
        // basic
        HttpRequestDef.Builder<ListBackupsRequest, ListBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsRequest.class, ListBackupsResponse.class)
                .withName("ListBackups")
                .withUri("/v1.0/{project_id}/graphs/backups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getLimit, ListBackupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getOffset, ListBackupsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGraphBackupsRequest, ListGraphBackupsResponse> listGraphBackups =
        genForListGraphBackups();

    private static HttpRequestDef<ListGraphBackupsRequest, ListGraphBackupsResponse> genForListGraphBackups() {
        // basic
        HttpRequestDef.Builder<ListGraphBackupsRequest, ListGraphBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGraphBackupsRequest.class, ListGraphBackupsResponse.class)
                .withName("ListGraphBackups")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGraphBackupsRequest::getGraphId, ListGraphBackupsRequest::setGraphId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphBackupsRequest::getLimit, ListGraphBackupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphBackupsRequest::getOffset, ListGraphBackupsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGraphMetadatasRequest, ListGraphMetadatasResponse> listGraphMetadatas =
        genForListGraphMetadatas();

    private static HttpRequestDef<ListGraphMetadatasRequest, ListGraphMetadatasResponse> genForListGraphMetadatas() {
        // basic
        HttpRequestDef.Builder<ListGraphMetadatasRequest, ListGraphMetadatasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGraphMetadatasRequest.class, ListGraphMetadatasResponse.class)
                .withName("ListGraphMetadatas")
                .withUri("/v1.0/{project_id}/graphs/metadatas/{metadata_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metadata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGraphMetadatasRequest::getMetadataId, ListGraphMetadatasRequest::setMetadataId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGraphsRequest, ListGraphsResponse> listGraphs = genForListGraphs();

    private static HttpRequestDef<ListGraphsRequest, ListGraphsResponse> genForListGraphs() {
        // basic
        HttpRequestDef.Builder<ListGraphsRequest, ListGraphsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGraphsRequest.class, ListGraphsResponse.class)
                .withName("ListGraphs")
                .withUri("/v1.0/{project_id}/graphs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphsRequest::getOffset, ListGraphsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphsRequest::getLimit, ListGraphsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v1.0/{project_id}/graphs/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getEndTime, ListJobsRequest::setEndTime));
        builder.<String>withRequestField("graph_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getGraphName, ListJobsRequest::setGraphName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStartTime, ListJobsRequest::setStartTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, ListJobsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetadatasRequest, ListMetadatasResponse> listMetadatas =
        genForListMetadatas();

    private static HttpRequestDef<ListMetadatasRequest, ListMetadatasResponse> genForListMetadatas() {
        // basic
        HttpRequestDef.Builder<ListMetadatasRequest, ListMetadatasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetadatasRequest.class, ListMetadatasResponse.class)
                .withName("ListMetadatas")
                .withUri("/v1.0/{project_id}/graphs/metadatas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetadatasRequest::getLimit, ListMetadatasRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetadatasRequest::getOffset, ListMetadatasRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1.0/{project_id}/graphs/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeGraphRequest, ResizeGraphResponse> resizeGraph = genForResizeGraph();

    private static HttpRequestDef<ResizeGraphRequest, ResizeGraphResponse> genForResizeGraph() {
        // basic
        HttpRequestDef.Builder<ResizeGraphRequest, ResizeGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeGraphRequest.class, ResizeGraphResponse.class)
                .withName("ResizeGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeGraphRequest::getGraphId, ResizeGraphRequest::setGraphId));
        builder.<ResizeGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeGraphReq.class),
            f -> f.withMarshaller(ResizeGraphRequest::getBody, ResizeGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGraphRequest, RestartGraphResponse> restartGraph = genForRestartGraph();

    private static HttpRequestDef<RestartGraphRequest, RestartGraphResponse> genForRestartGraph() {
        // basic
        HttpRequestDef.Builder<RestartGraphRequest, RestartGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartGraphRequest.class, RestartGraphResponse.class)
                .withName("RestartGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGraphRequest::getGraphId, RestartGraphRequest::setGraphId));
        builder.<RestartGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(RestartGraphRequest::getActionId, RestartGraphRequest::setActionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGraphRequest, ShowGraphResponse> showGraph = genForShowGraph();

    private static HttpRequestDef<ShowGraphRequest, ShowGraphResponse> genForShowGraph() {
        // basic
        HttpRequestDef.Builder<ShowGraphRequest, ShowGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGraphRequest.class, ShowGraphResponse.class)
                .withName("ShowGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGraphRequest::getGraphId, ShowGraphRequest::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getGraphId, ShowJobRequest::setGraphId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartGraphRequest, StartGraphResponse> startGraph = genForStartGraph();

    private static HttpRequestDef<StartGraphRequest, StartGraphResponse> genForStartGraph() {
        // basic
        HttpRequestDef.Builder<StartGraphRequest, StartGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartGraphRequest.class, StartGraphResponse.class)
                .withName("StartGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartGraphRequest::getGraphId, StartGraphRequest::setGraphId));
        builder.<StartGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(StartGraphRequest::getActionId, StartGraphRequest::setActionId));
        builder.<StartGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartGraphReq.class),
            f -> f.withMarshaller(StartGraphRequest::getBody, StartGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopGraphRequest, StopGraphResponse> stopGraph = genForStopGraph();

    private static HttpRequestDef<StopGraphRequest, StopGraphResponse> genForStopGraph() {
        // basic
        HttpRequestDef.Builder<StopGraphRequest, StopGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopGraphRequest.class, StopGraphResponse.class)
                .withName("StopGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopGraphRequest::getGraphId, StopGraphRequest::setGraphId));
        builder.<StopGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(StopGraphRequest::getActionId, StopGraphRequest::setActionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeGraphRequest, UpgradeGraphResponse> upgradeGraph = genForUpgradeGraph();

    private static HttpRequestDef<UpgradeGraphRequest, UpgradeGraphResponse> genForUpgradeGraph() {
        // basic
        HttpRequestDef.Builder<UpgradeGraphRequest, UpgradeGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeGraphRequest.class, UpgradeGraphResponse.class)
                .withName("UpgradeGraph")
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGraphRequest::getGraphId, UpgradeGraphRequest::setGraphId));
        builder.<UpgradeGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(UpgradeGraphRequest::getActionId, UpgradeGraphRequest::setActionId));
        builder.<UpgradeGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeGraphReq.class),
            f -> f.withMarshaller(UpgradeGraphRequest::getBody, UpgradeGraphRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFromObsRequest, UploadFromObsResponse> uploadFromObs =
        genForUploadFromObs();

    private static HttpRequestDef<UploadFromObsRequest, UploadFromObsResponse> genForUploadFromObs() {
        // basic
        HttpRequestDef.Builder<UploadFromObsRequest, UploadFromObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadFromObsRequest.class, UploadFromObsResponse.class)
                .withName("UploadFromObs")
                .withUri("/v1.0/{project_id}/graphs/metadata/upload_from_obs")
                .withContentType("application/json");

        // requests
        builder.<UploadFromOBSReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadFromOBSReq.class),
            f -> f.withMarshaller(UploadFromObsRequest::getBody, UploadFromObsRequest::setBody));

        // response

        return builder.build();
    }

}

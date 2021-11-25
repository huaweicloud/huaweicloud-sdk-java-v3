package com.huaweicloud.sdk.ges.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ges.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class GesMeta {

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForattachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForattachEip() {
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
            f -> f.withMarshaller(AttachEipRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<AttachEipRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachEipRequest.ActionIdEnum.class),
            f -> f.withMarshaller(AttachEipRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<BindEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEipReq.class),
            f -> f.withMarshaller(AttachEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckMetadataRequest, CheckMetadataResponse> checkMetadata = genForcheckMetadata();

    private static HttpRequestDef<CheckMetadataRequest, CheckMetadataResponse> genForcheckMetadata() {
        // basic
        HttpRequestDef.Builder<CheckMetadataRequest, CheckMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckMetadataRequest.class, CheckMetadataResponse.class)
                .withName("CheckMetadata")
                .withUri("/v1.0/{project_id}/graphs/action")
                .withContentType("application/json");

        // requests
        builder.<CheckMetadataRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckMetadataRequest.ActionIdEnum.class),
            f -> f.withMarshaller(CheckMetadataRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<CheckMetadataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckMetadataReq.class),
            f -> f.withMarshaller(CheckMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ClearGraphRequest, ClearGraphResponse> clearGraph = genForclearGraph();

    private static HttpRequestDef<ClearGraphRequest, ClearGraphResponse> genForclearGraph() {
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
            f -> f.withMarshaller(ClearGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<ClearGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClearGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ClearGraphRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<Boolean>withRequestField("clear-metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ClearGraphRequest::getClearMetadata, (req, v) -> {
                req.setClearMetadata(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateBackupRequest, CreateBackupResponse> createBackup = genForcreateBackup();

    private static HttpRequestDef<CreateBackupRequest, CreateBackupResponse> genForcreateBackup() {
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
            f -> f.withMarshaller(CreateBackupRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateGraphRequest, CreateGraphResponse> createGraph = genForcreateGraph();

    private static HttpRequestDef<CreateGraphRequest, CreateGraphResponse> genForcreateGraph() {
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
            f -> f.withMarshaller(CreateGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> createMetadata = genForcreateMetadata();

    private static HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> genForcreateMetadata() {
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
            f -> f.withMarshaller(CreateMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genFordeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genFordeleteBackup() {
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
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteGraphRequest, DeleteGraphResponse> deleteGraph = genFordeleteGraph();

    private static HttpRequestDef<DeleteGraphRequest, DeleteGraphResponse> genFordeleteGraph() {
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
            f -> f.withMarshaller(DeleteGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<Boolean>withRequestField("keepBackup",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteGraphRequest::getKeepBackup, (req, v) -> {
                req.setKeepBackup(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteMetadataRequest, DeleteMetadataResponse> deleteMetadata = genFordeleteMetadata();

    private static HttpRequestDef<DeleteMetadataRequest, DeleteMetadataResponse> genFordeleteMetadata() {
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
            f -> f.withMarshaller(DeleteMetadataRequest::getMetadataId, (req, v) -> {
                req.setMetadataId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DetachEipRequest, DetachEipResponse> detachEip = genFordetachEip();

    private static HttpRequestDef<DetachEipRequest, DetachEipResponse> genFordetachEip() {
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
            f -> f.withMarshaller(DetachEipRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<DetachEipRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachEipRequest.ActionIdEnum.class),
            f -> f.withMarshaller(DetachEipRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<UnbindEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnbindEipReq.class),
            f -> f.withMarshaller(DetachEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ExpandGraphRequest, ExpandGraphResponse> expandGraph = genForexpandGraph();

    private static HttpRequestDef<ExpandGraphRequest, ExpandGraphResponse> genForexpandGraph() {
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
            f -> f.withMarshaller(ExpandGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<ExpandGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandGraphReq.class),
            f -> f.withMarshaller(ExpandGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ExportGraphRequest, ExportGraphResponse> exportGraph = genForexportGraph();

    private static HttpRequestDef<ExportGraphRequest, ExportGraphResponse> genForexportGraph() {
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
            f -> f.withMarshaller(ExportGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<ExportGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ExportGraphRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<ExportGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportGraphReq.class),
            f -> f.withMarshaller(ExportGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ImportGraphRequest, ImportGraphResponse> importGraph = genForimportGraph();

    private static HttpRequestDef<ImportGraphRequest, ImportGraphResponse> genForimportGraph() {
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
            f -> f.withMarshaller(ImportGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<ImportGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ImportGraphRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<ImportGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportGraphReq.class),
            f -> f.withMarshaller(ImportGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForlistBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForlistBackups() {
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
            f -> f.withMarshaller(ListBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGraphBackupsRequest, ListGraphBackupsResponse> listGraphBackups = genForlistGraphBackups();

    private static HttpRequestDef<ListGraphBackupsRequest, ListGraphBackupsResponse> genForlistGraphBackups() {
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
            f -> f.withMarshaller(ListGraphBackupsRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGraphMetadatasRequest, ListGraphMetadatasResponse> listGraphMetadatas = genForlistGraphMetadatas();

    private static HttpRequestDef<ListGraphMetadatasRequest, ListGraphMetadatasResponse> genForlistGraphMetadatas() {
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
            f -> f.withMarshaller(ListGraphMetadatasRequest::getMetadataId, (req, v) -> {
                req.setMetadataId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGraphsRequest, ListGraphsResponse> listGraphs = genForlistGraphs();

    private static HttpRequestDef<ListGraphsRequest, ListGraphsResponse> genForlistGraphs() {
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
            f -> f.withMarshaller(ListGraphsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForlistJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForlistJobs() {
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
            f -> f.withMarshaller(ListJobsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<String>withRequestField("graph_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getGraphName, (req, v) -> {
                req.setGraphName(v);
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMetadatasRequest, ListMetadatasResponse> listMetadatas = genForlistMetadatas();

    private static HttpRequestDef<ListMetadatasRequest, ListMetadatasResponse> genForlistMetadatas() {
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
            f -> f.withMarshaller(ListMetadatasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetadatasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
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

    public static final HttpRequestDef<ResizeGraphRequest, ResizeGraphResponse> resizeGraph = genForresizeGraph();

    private static HttpRequestDef<ResizeGraphRequest, ResizeGraphResponse> genForresizeGraph() {
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
            f -> f.withMarshaller(ResizeGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<ResizeGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeGraphReq.class),
            f -> f.withMarshaller(ResizeGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestartGraphRequest, RestartGraphResponse> restartGraph = genForrestartGraph();

    private static HttpRequestDef<RestartGraphRequest, RestartGraphResponse> genForrestartGraph() {
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
            f -> f.withMarshaller(RestartGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<RestartGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(RestartGraphRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGraphRequest, ShowGraphResponse> showGraph = genForshowGraph();

    private static HttpRequestDef<ShowGraphRequest, ShowGraphResponse> genForshowGraph() {
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
            f -> f.withMarshaller(ShowGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
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
                .withUri("/v1.0/{project_id}/graphs/{graph_id}/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartGraphRequest, StartGraphResponse> startGraph = genForstartGraph();

    private static HttpRequestDef<StartGraphRequest, StartGraphResponse> genForstartGraph() {
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
            f -> f.withMarshaller(StartGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<StartGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(StartGraphRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<StartGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartGraphReq.class),
            f -> f.withMarshaller(StartGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StopGraphRequest, StopGraphResponse> stopGraph = genForstopGraph();

    private static HttpRequestDef<StopGraphRequest, StopGraphResponse> genForstopGraph() {
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
            f -> f.withMarshaller(StopGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<StopGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(StopGraphRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpgradeGraphRequest, UpgradeGraphResponse> upgradeGraph = genForupgradeGraph();

    private static HttpRequestDef<UpgradeGraphRequest, UpgradeGraphResponse> genForupgradeGraph() {
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
            f -> f.withMarshaller(UpgradeGraphRequest::getGraphId, (req, v) -> {
                req.setGraphId(v);
            })
        );
        builder.<UpgradeGraphRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeGraphRequest.ActionIdEnum.class),
            f -> f.withMarshaller(UpgradeGraphRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.<UpgradeGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeGraphReq.class),
            f -> f.withMarshaller(UpgradeGraphRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UploadFromObsRequest, UploadFromObsResponse> uploadFromObs = genForuploadFromObs();

    private static HttpRequestDef<UploadFromObsRequest, UploadFromObsResponse> genForuploadFromObs() {
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
            f -> f.withMarshaller(UploadFromObsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

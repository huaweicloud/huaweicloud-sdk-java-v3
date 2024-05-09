package com.huaweicloud.sdk.ges.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ges.v2.model.AttachEip2Request;
import com.huaweicloud.sdk.ges.v2.model.AttachEip2Response;
import com.huaweicloud.sdk.ges.v2.model.AttachEipReq;
import com.huaweicloud.sdk.ges.v2.model.ClearGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ClearGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.CreateBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.CreateBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.CreateGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.CreateGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReq;
import com.huaweicloud.sdk.ges.v2.model.CreateMetadata2Request;
import com.huaweicloud.sdk.ges.v2.model.CreateMetadata2Response;
import com.huaweicloud.sdk.ges.v2.model.CreateMetadataReq;
import com.huaweicloud.sdk.ges.v2.model.DeleteBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.DeleteBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.DeleteGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.DeleteGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.DeleteMetadata2Request;
import com.huaweicloud.sdk.ges.v2.model.DeleteMetadata2Response;
import com.huaweicloud.sdk.ges.v2.model.DeregisterScenes2Request;
import com.huaweicloud.sdk.ges.v2.model.DeregisterScenes2Response;
import com.huaweicloud.sdk.ges.v2.model.DeregisterScenesReq;
import com.huaweicloud.sdk.ges.v2.model.DetachEip2Request;
import com.huaweicloud.sdk.ges.v2.model.DetachEip2Response;
import com.huaweicloud.sdk.ges.v2.model.DetachEipReq;
import com.huaweicloud.sdk.ges.v2.model.ExpandGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ExpandGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ExpandGraphReq;
import com.huaweicloud.sdk.ges.v2.model.ExportBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.ExportBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.ExportBackupReq;
import com.huaweicloud.sdk.ges.v2.model.ExportGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ExportGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ExportGraphReq;
import com.huaweicloud.sdk.ges.v2.model.ImportBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.ImportBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.ImportBackupReq;
import com.huaweicloud.sdk.ges.v2.model.ImportGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ImportGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ImportGraphReq;
import com.huaweicloud.sdk.ges.v2.model.ListBackups2Request;
import com.huaweicloud.sdk.ges.v2.model.ListBackups2Response;
import com.huaweicloud.sdk.ges.v2.model.ListGraphBackups2Request;
import com.huaweicloud.sdk.ges.v2.model.ListGraphBackups2Response;
import com.huaweicloud.sdk.ges.v2.model.ListGraphs2Request;
import com.huaweicloud.sdk.ges.v2.model.ListGraphs2Response;
import com.huaweicloud.sdk.ges.v2.model.ListJobs2Request;
import com.huaweicloud.sdk.ges.v2.model.ListJobs2Response;
import com.huaweicloud.sdk.ges.v2.model.ListMetadatas2Request;
import com.huaweicloud.sdk.ges.v2.model.ListMetadatas2Response;
import com.huaweicloud.sdk.ges.v2.model.ListQuotas2Request;
import com.huaweicloud.sdk.ges.v2.model.ListQuotas2Response;
import com.huaweicloud.sdk.ges.v2.model.ListScenes2Request;
import com.huaweicloud.sdk.ges.v2.model.ListScenes2Response;
import com.huaweicloud.sdk.ges.v2.model.RegisterScenes2Request;
import com.huaweicloud.sdk.ges.v2.model.RegisterScenes2Response;
import com.huaweicloud.sdk.ges.v2.model.RegisterScenesReq;
import com.huaweicloud.sdk.ges.v2.model.ResizeGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ResizeGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ResizeGraphReq;
import com.huaweicloud.sdk.ges.v2.model.RestartGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.RestartGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ShowGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ShowGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ShowJob2Request;
import com.huaweicloud.sdk.ges.v2.model.ShowJob2Response;
import com.huaweicloud.sdk.ges.v2.model.ShowMetadata2Request;
import com.huaweicloud.sdk.ges.v2.model.ShowMetadata2Response;
import com.huaweicloud.sdk.ges.v2.model.StartGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.StartGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.StartGraphReq;
import com.huaweicloud.sdk.ges.v2.model.StopGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.StopGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.UpgradeGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.UpgradeGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.UpgradeGraphReq;
import com.huaweicloud.sdk.ges.v2.model.UploadFromObs2Request;
import com.huaweicloud.sdk.ges.v2.model.UploadFromObs2Response;
import com.huaweicloud.sdk.ges.v2.model.UploadFromObsReq;

import java.util.Map;

@SuppressWarnings("unchecked")
public class GesMeta {

    public static final HttpRequestDef<AttachEip2Request, AttachEip2Response> attachEip2 = genForAttachEip2();

    private static HttpRequestDef<AttachEip2Request, AttachEip2Response> genForAttachEip2() {
        // basic
        HttpRequestDef.Builder<AttachEip2Request, AttachEip2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachEip2Request.class, AttachEip2Response.class)
                .withName("AttachEip2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/bind-eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEip2Request::getGraphId, AttachEip2Request::setGraphId));
        builder.<AttachEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachEipReq.class),
            f -> f.withMarshaller(AttachEip2Request::getBody, AttachEip2Request::setBody));

        // response
        builder.<Map<String, String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AttachEip2Response::getBody, AttachEip2Response::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ClearGraph2Request, ClearGraph2Response> clearGraph2 = genForClearGraph2();

    private static HttpRequestDef<ClearGraph2Request, ClearGraph2Response> genForClearGraph2() {
        // basic
        HttpRequestDef.Builder<ClearGraph2Request, ClearGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ClearGraph2Request.class, ClearGraph2Response.class)
                .withName("ClearGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/clear-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ClearGraph2Request::getGraphId, ClearGraph2Request::setGraphId));
        builder.<Boolean>withRequestField("clear_metadata",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ClearGraph2Request::getClearMetadata, ClearGraph2Request::setClearMetadata));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackup2Request, CreateBackup2Response> createBackup2 =
        genForCreateBackup2();

    private static HttpRequestDef<CreateBackup2Request, CreateBackup2Response> genForCreateBackup2() {
        // basic
        HttpRequestDef.Builder<CreateBackup2Request, CreateBackup2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBackup2Request.class, CreateBackup2Response.class)
                .withName("CreateBackup2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBackup2Request::getGraphId, CreateBackup2Request::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGraph2Request, CreateGraph2Response> createGraph2 = genForCreateGraph2();

    private static HttpRequestDef<CreateGraph2Request, CreateGraph2Response> genForCreateGraph2() {
        // basic
        HttpRequestDef.Builder<CreateGraph2Request, CreateGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGraph2Request.class, CreateGraph2Response.class)
                .withName("CreateGraph2")
                .withUri("/v2/{project_id}/graphs")
                .withContentType("application/json");

        // requests
        builder.<CreateGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGraphReq.class),
            f -> f.withMarshaller(CreateGraph2Request::getBody, CreateGraph2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMetadata2Request, CreateMetadata2Response> createMetadata2 =
        genForCreateMetadata2();

    private static HttpRequestDef<CreateMetadata2Request, CreateMetadata2Response> genForCreateMetadata2() {
        // basic
        HttpRequestDef.Builder<CreateMetadata2Request, CreateMetadata2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMetadata2Request.class, CreateMetadata2Response.class)
                .withName("CreateMetadata2")
                .withUri("/v2/{project_id}/graphs/metadatas")
                .withContentType("application/json");

        // requests
        builder.<CreateMetadataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMetadataReq.class),
            f -> f.withMarshaller(CreateMetadata2Request::getBody, CreateMetadata2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackup2Request, DeleteBackup2Response> deleteBackup2 =
        genForDeleteBackup2();

    private static HttpRequestDef<DeleteBackup2Request, DeleteBackup2Response> genForDeleteBackup2() {
        // basic
        HttpRequestDef.Builder<DeleteBackup2Request, DeleteBackup2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackup2Request.class, DeleteBackup2Response.class)
                .withName("DeleteBackup2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackup2Request::getGraphId, DeleteBackup2Request::setGraphId));
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackup2Request::getBackupId, DeleteBackup2Request::setBackupId));

        // response
        builder.<Map<String, String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(DeleteBackup2Response::getBody, DeleteBackup2Response::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGraph2Request, DeleteGraph2Response> deleteGraph2 = genForDeleteGraph2();

    private static HttpRequestDef<DeleteGraph2Request, DeleteGraph2Response> genForDeleteGraph2() {
        // basic
        HttpRequestDef.Builder<DeleteGraph2Request, DeleteGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGraph2Request.class, DeleteGraph2Response.class)
                .withName("DeleteGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGraph2Request::getGraphId, DeleteGraph2Request::setGraphId));
        builder.<Boolean>withRequestField("keep_backup",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteGraph2Request::getKeepBackup, DeleteGraph2Request::setKeepBackup));
        builder.<Boolean>withRequestField("delete_eip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteGraph2Request::getDeleteEip, DeleteGraph2Request::setDeleteEip));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMetadata2Request, DeleteMetadata2Response> deleteMetadata2 =
        genForDeleteMetadata2();

    private static HttpRequestDef<DeleteMetadata2Request, DeleteMetadata2Response> genForDeleteMetadata2() {
        // basic
        HttpRequestDef.Builder<DeleteMetadata2Request, DeleteMetadata2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMetadata2Request.class, DeleteMetadata2Response.class)
                .withName("DeleteMetadata2")
                .withUri("/v2/{project_id}/graphs/metadatas/{metadata_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metadata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMetadata2Request::getMetadataId, DeleteMetadata2Request::setMetadataId));

        // response
        builder.<Map<String, String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(DeleteMetadata2Response::getBody, DeleteMetadata2Response::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<DetachEip2Request, DetachEip2Response> detachEip2 = genForDetachEip2();

    private static HttpRequestDef<DetachEip2Request, DetachEip2Response> genForDetachEip2() {
        // basic
        HttpRequestDef.Builder<DetachEip2Request, DetachEip2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachEip2Request.class, DetachEip2Response.class)
                .withName("DetachEip2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/unbind-eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachEip2Request::getGraphId, DetachEip2Request::setGraphId));
        builder.<DetachEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachEipReq.class),
            f -> f.withMarshaller(DetachEip2Request::getBody, DetachEip2Request::setBody));

        // response
        builder.<Map<String, String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(DetachEip2Response::getBody, DetachEip2Response::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGraph2Request, ExpandGraph2Response> expandGraph2 = genForExpandGraph2();

    private static HttpRequestDef<ExpandGraph2Request, ExpandGraph2Response> genForExpandGraph2() {
        // basic
        HttpRequestDef.Builder<ExpandGraph2Request, ExpandGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandGraph2Request.class, ExpandGraph2Response.class)
                .withName("ExpandGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGraph2Request::getGraphId, ExpandGraph2Request::setGraphId));
        builder.<ExpandGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandGraphReq.class),
            f -> f.withMarshaller(ExpandGraph2Request::getBody, ExpandGraph2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportBackup2Request, ExportBackup2Response> exportBackup2 =
        genForExportBackup2();

    private static HttpRequestDef<ExportBackup2Request, ExportBackup2Response> genForExportBackup2() {
        // basic
        HttpRequestDef.Builder<ExportBackup2Request, ExportBackup2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportBackup2Request.class, ExportBackup2Response.class)
                .withName("ExportBackup2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/backups/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportBackup2Request::getGraphId, ExportBackup2Request::setGraphId));
        builder.<ExportBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportBackupReq.class),
            f -> f.withMarshaller(ExportBackup2Request::getBody, ExportBackup2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportGraph2Request, ExportGraph2Response> exportGraph2 = genForExportGraph2();

    private static HttpRequestDef<ExportGraph2Request, ExportGraph2Response> genForExportGraph2() {
        // basic
        HttpRequestDef.Builder<ExportGraph2Request, ExportGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportGraph2Request.class, ExportGraph2Response.class)
                .withName("ExportGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/export-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportGraph2Request::getGraphId, ExportGraph2Request::setGraphId));
        builder.<ExportGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportGraphReq.class),
            f -> f.withMarshaller(ExportGraph2Request::getBody, ExportGraph2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportBackup2Request, ImportBackup2Response> importBackup2 =
        genForImportBackup2();

    private static HttpRequestDef<ImportBackup2Request, ImportBackup2Response> genForImportBackup2() {
        // basic
        HttpRequestDef.Builder<ImportBackup2Request, ImportBackup2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportBackup2Request.class, ImportBackup2Response.class)
                .withName("ImportBackup2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/backups/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportBackup2Request::getGraphId, ImportBackup2Request::setGraphId));
        builder.<ImportBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportBackupReq.class),
            f -> f.withMarshaller(ImportBackup2Request::getBody, ImportBackup2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportGraph2Request, ImportGraph2Response> importGraph2 = genForImportGraph2();

    private static HttpRequestDef<ImportGraph2Request, ImportGraph2Response> genForImportGraph2() {
        // basic
        HttpRequestDef.Builder<ImportGraph2Request, ImportGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportGraph2Request.class, ImportGraph2Response.class)
                .withName("ImportGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/import-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportGraph2Request::getGraphId, ImportGraph2Request::setGraphId));
        builder.<ImportGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportGraphReq.class),
            f -> f.withMarshaller(ImportGraph2Request::getBody, ImportGraph2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackups2Request, ListBackups2Response> listBackups2 = genForListBackups2();

    private static HttpRequestDef<ListBackups2Request, ListBackups2Response> genForListBackups2() {
        // basic
        HttpRequestDef.Builder<ListBackups2Request, ListBackups2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackups2Request.class, ListBackups2Response.class)
                .withName("ListBackups2")
                .withUri("/v2/{project_id}/graphs/backups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackups2Request::getOffset, ListBackups2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackups2Request::getLimit, ListBackups2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGraphBackups2Request, ListGraphBackups2Response> listGraphBackups2 =
        genForListGraphBackups2();

    private static HttpRequestDef<ListGraphBackups2Request, ListGraphBackups2Response> genForListGraphBackups2() {
        // basic
        HttpRequestDef.Builder<ListGraphBackups2Request, ListGraphBackups2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGraphBackups2Request.class, ListGraphBackups2Response.class)
                .withName("ListGraphBackups2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGraphBackups2Request::getGraphId, ListGraphBackups2Request::setGraphId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphBackups2Request::getOffset, ListGraphBackups2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphBackups2Request::getLimit, ListGraphBackups2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGraphs2Request, ListGraphs2Response> listGraphs2 = genForListGraphs2();

    private static HttpRequestDef<ListGraphs2Request, ListGraphs2Response> genForListGraphs2() {
        // basic
        HttpRequestDef.Builder<ListGraphs2Request, ListGraphs2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGraphs2Request.class, ListGraphs2Response.class)
                .withName("ListGraphs2")
                .withUri("/v2/{project_id}/graphs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphs2Request::getOffset, ListGraphs2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGraphs2Request::getLimit, ListGraphs2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobs2Request, ListJobs2Response> listJobs2 = genForListJobs2();

    private static HttpRequestDef<ListJobs2Request, ListJobs2Response> genForListJobs2() {
        // basic
        HttpRequestDef.Builder<ListJobs2Request, ListJobs2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobs2Request.class, ListJobs2Response.class)
                .withName("ListJobs2")
                .withUri("/v2/{project_id}/graphs/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobs2Request::getEndTime, ListJobs2Request::setEndTime));
        builder.<String>withRequestField("graph_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobs2Request::getGraphName, ListJobs2Request::setGraphName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobs2Request::getLimit, ListJobs2Request::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobs2Request::getOffset, ListJobs2Request::setOffset));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobs2Request::getStartTime, ListJobs2Request::setStartTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobs2Request::getStatus, ListJobs2Request::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetadatas2Request, ListMetadatas2Response> listMetadatas2 =
        genForListMetadatas2();

    private static HttpRequestDef<ListMetadatas2Request, ListMetadatas2Response> genForListMetadatas2() {
        // basic
        HttpRequestDef.Builder<ListMetadatas2Request, ListMetadatas2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetadatas2Request.class, ListMetadatas2Response.class)
                .withName("ListMetadatas2")
                .withUri("/v2/{project_id}/graphs/metadatas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetadatas2Request::getOffset, ListMetadatas2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetadatas2Request::getLimit, ListMetadatas2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotas2Request, ListQuotas2Response> listQuotas2 = genForListQuotas2();

    private static HttpRequestDef<ListQuotas2Request, ListQuotas2Response> genForListQuotas2() {
        // basic
        HttpRequestDef.Builder<ListQuotas2Request, ListQuotas2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotas2Request.class, ListQuotas2Response.class)
                .withName("ListQuotas2")
                .withUri("/v2/{project_id}/graphs/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeGraph2Request, ResizeGraph2Response> resizeGraph2 = genForResizeGraph2();

    private static HttpRequestDef<ResizeGraph2Request, ResizeGraph2Response> genForResizeGraph2() {
        // basic
        HttpRequestDef.Builder<ResizeGraph2Request, ResizeGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeGraph2Request.class, ResizeGraph2Response.class)
                .withName("ResizeGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeGraph2Request::getGraphId, ResizeGraph2Request::setGraphId));
        builder.<ResizeGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeGraphReq.class),
            f -> f.withMarshaller(ResizeGraph2Request::getBody, ResizeGraph2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGraph2Request, RestartGraph2Response> restartGraph2 =
        genForRestartGraph2();

    private static HttpRequestDef<RestartGraph2Request, RestartGraph2Response> genForRestartGraph2() {
        // basic
        HttpRequestDef.Builder<RestartGraph2Request, RestartGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartGraph2Request.class, RestartGraph2Response.class)
                .withName("RestartGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGraph2Request::getGraphId, RestartGraph2Request::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGraph2Request, ShowGraph2Response> showGraph2 = genForShowGraph2();

    private static HttpRequestDef<ShowGraph2Request, ShowGraph2Response> genForShowGraph2() {
        // basic
        HttpRequestDef.Builder<ShowGraph2Request, ShowGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGraph2Request.class, ShowGraph2Response.class)
                .withName("ShowGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGraph2Request::getGraphId, ShowGraph2Request::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJob2Request, ShowJob2Response> showJob2 = genForShowJob2();

    private static HttpRequestDef<ShowJob2Request, ShowJob2Response> genForShowJob2() {
        // basic
        HttpRequestDef.Builder<ShowJob2Request, ShowJob2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJob2Request.class, ShowJob2Response.class)
                .withName("ShowJob2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJob2Request::getGraphId, ShowJob2Request::setGraphId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJob2Request::getJobId, ShowJob2Request::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetadata2Request, ShowMetadata2Response> showMetadata2 =
        genForShowMetadata2();

    private static HttpRequestDef<ShowMetadata2Request, ShowMetadata2Response> genForShowMetadata2() {
        // basic
        HttpRequestDef.Builder<ShowMetadata2Request, ShowMetadata2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetadata2Request.class, ShowMetadata2Response.class)
                .withName("ShowMetadata2")
                .withUri("/v2/{project_id}/graphs/metadatas/{metadata_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metadata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetadata2Request::getMetadataId, ShowMetadata2Request::setMetadataId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartGraph2Request, StartGraph2Response> startGraph2 = genForStartGraph2();

    private static HttpRequestDef<StartGraph2Request, StartGraph2Response> genForStartGraph2() {
        // basic
        HttpRequestDef.Builder<StartGraph2Request, StartGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartGraph2Request.class, StartGraph2Response.class)
                .withName("StartGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartGraph2Request::getGraphId, StartGraph2Request::setGraphId));
        builder.<StartGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartGraphReq.class),
            f -> f.withMarshaller(StartGraph2Request::getBody, StartGraph2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopGraph2Request, StopGraph2Response> stopGraph2 = genForStopGraph2();

    private static HttpRequestDef<StopGraph2Request, StopGraph2Response> genForStopGraph2() {
        // basic
        HttpRequestDef.Builder<StopGraph2Request, StopGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopGraph2Request.class, StopGraph2Response.class)
                .withName("StopGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopGraph2Request::getGraphId, StopGraph2Request::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeGraph2Request, UpgradeGraph2Response> upgradeGraph2 =
        genForUpgradeGraph2();

    private static HttpRequestDef<UpgradeGraph2Request, UpgradeGraph2Response> genForUpgradeGraph2() {
        // basic
        HttpRequestDef.Builder<UpgradeGraph2Request, UpgradeGraph2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeGraph2Request.class, UpgradeGraph2Response.class)
                .withName("UpgradeGraph2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGraph2Request::getGraphId, UpgradeGraph2Request::setGraphId));
        builder.<UpgradeGraphReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeGraphReq.class),
            f -> f.withMarshaller(UpgradeGraph2Request::getBody, UpgradeGraph2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFromObs2Request, UploadFromObs2Response> uploadFromObs2 =
        genForUploadFromObs2();

    private static HttpRequestDef<UploadFromObs2Request, UploadFromObs2Response> genForUploadFromObs2() {
        // basic
        HttpRequestDef.Builder<UploadFromObs2Request, UploadFromObs2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadFromObs2Request.class, UploadFromObs2Response.class)
                .withName("UploadFromObs2")
                .withUri("/v2/{project_id}/graphs/metadata/upload-from-obs")
                .withContentType("application/json");

        // requests
        builder.<UploadFromObsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadFromObsReq.class),
            f -> f.withMarshaller(UploadFromObs2Request::getBody, UploadFromObs2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeregisterScenes2Request, DeregisterScenes2Response> deregisterScenes2 =
        genForDeregisterScenes2();

    private static HttpRequestDef<DeregisterScenes2Request, DeregisterScenes2Response> genForDeregisterScenes2() {
        // basic
        HttpRequestDef.Builder<DeregisterScenes2Request, DeregisterScenes2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeregisterScenes2Request.class, DeregisterScenes2Response.class)
                .withName("DeregisterScenes2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/scenes/unregister")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeregisterScenes2Request::getGraphId, DeregisterScenes2Request::setGraphId));
        builder.<DeregisterScenesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeregisterScenesReq.class),
            f -> f.withMarshaller(DeregisterScenes2Request::getBody, DeregisterScenes2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScenes2Request, ListScenes2Response> listScenes2 = genForListScenes2();

    private static HttpRequestDef<ListScenes2Request, ListScenes2Response> genForListScenes2() {
        // basic
        HttpRequestDef.Builder<ListScenes2Request, ListScenes2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScenes2Request.class, ListScenes2Response.class)
                .withName("ListScenes2")
                .withUri("/v2/{project_id}/graphs/scenes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scene_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScenes2Request::getSceneName, ListScenes2Request::setSceneName));
        builder.<String>withRequestField("application_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScenes2Request::getApplicationName, ListScenes2Request::setApplicationName));
        builder.<String>withRequestField("graph_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScenes2Request::getGraphId, ListScenes2Request::setGraphId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterScenes2Request, RegisterScenes2Response> registerScenes2 =
        genForRegisterScenes2();

    private static HttpRequestDef<RegisterScenes2Request, RegisterScenes2Response> genForRegisterScenes2() {
        // basic
        HttpRequestDef.Builder<RegisterScenes2Request, RegisterScenes2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterScenes2Request.class, RegisterScenes2Response.class)
                .withName("RegisterScenes2")
                .withUri("/v2/{project_id}/graphs/{graph_id}/scenes/register")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("graph_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterScenes2Request::getGraphId, RegisterScenes2Request::setGraphId));
        builder.<RegisterScenesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterScenesReq.class),
            f -> f.withMarshaller(RegisterScenes2Request::getBody, RegisterScenes2Request::setBody));

        // response

        return builder.build();
    }

}

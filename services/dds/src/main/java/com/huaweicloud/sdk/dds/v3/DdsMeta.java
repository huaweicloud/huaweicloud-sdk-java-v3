package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dds.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DdsMeta {

    public static final HttpRequestDef<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNode = genForaddShardingNode();

    private static HttpRequestDef<AddShardingNodeRequest, AddShardingNodeResponse> genForaddShardingNode() {
        // basic
        HttpRequestDef.Builder<AddShardingNodeRequest, AddShardingNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddShardingNodeRequest.class, AddShardingNodeResponse.class)
                .withName("AddShardingNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/enlarge")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddShardingNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnlargeInstanceRequestBody.class,
            f -> f.withMarshaller(AddShardingNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForattachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForattachEip() {
        // basic
        HttpRequestDef.Builder<AttachEipRequest, AttachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachEipRequest.class, AttachEipResponse.class)
                .withName("AttachEip")
                .withUri("/v3/{project_id}/nodes/{node_id}/bind-eip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AttachEipRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AttachEipRequestBody.class,
            f -> f.withMarshaller(AttachEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AttachInternalIpRequest, AttachInternalIpResponse> attachInternalIp = genForattachInternalIp();

    private static HttpRequestDef<AttachInternalIpRequest, AttachInternalIpResponse> genForattachInternalIp() {
        // basic
        HttpRequestDef.Builder<AttachInternalIpRequest, AttachInternalIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachInternalIpRequest.class, AttachInternalIpResponse.class)
                .withName("AttachInternalIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-internal-ip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AttachInternalIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AttachInternalIpRequestBody.class,
            f -> f.withMarshaller(AttachInternalIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction = genForbatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForbatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchOperateInstanceTagRequestBody.class,
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CancelEipRequest, CancelEipResponse> cancelEip = genForcancelEip();

    private static HttpRequestDef<CancelEipRequest, CancelEipResponse> genForcancelEip() {
        // basic
        HttpRequestDef.Builder<CancelEipRequest, CancelEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelEipRequest.class, CancelEipResponse.class)
                .withName("CancelEip")
                .withUri("/v3/{project_id}/nodes/{node_id}/unbind-eip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelEipRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CheckPasswordRequest, CheckPasswordResponse> checkPassword = genForcheckPassword();

    private static HttpRequestDef<CheckPasswordRequest, CheckPasswordResponse> genForcheckPassword() {
        // basic
        HttpRequestDef.Builder<CheckPasswordRequest, CheckPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckPasswordRequest.class, CheckPasswordResponse.class)
                .withName("CheckPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/check-password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CheckPasswordRequestBody.class,
            f -> f.withMarshaller(CheckPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> createDatabaseRole = genForcreateDatabaseRole();

    private static HttpRequestDef<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> genForcreateDatabaseRole() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRoleRequest.class, CreateDatabaseRoleResponse.class)
                .withName("CreateDatabaseRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-role")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDatabaseRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDatabaseRoleRequestBody.class,
            f -> f.withMarshaller(CreateDatabaseRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUser = genForcreateDatabaseUser();

    private static HttpRequestDef<CreateDatabaseUserRequest, CreateDatabaseUserResponse> genForcreateDatabaseUser() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseUserRequest, CreateDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseUserRequest.class, CreateDatabaseUserResponse.class)
                .withName("CreateDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDatabaseUserRequestBody.class,
            f -> f.withMarshaller(CreateDatabaseUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance = genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateInstanceRequestBody.class,
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateIpRequest, CreateIpResponse> createIp = genForcreateIp();

    private static HttpRequestDef<CreateIpRequest, CreateIpResponse> genForcreateIp() {
        // basic
        HttpRequestDef.Builder<CreateIpRequest, CreateIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIpRequest.class, CreateIpResponse.class)
                .withName("CreateIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/create-ip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateIpRequestBody.class,
            f -> f.withMarshaller(CreateIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackup = genForcreateManualBackup();

    private static HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> genForcreateManualBackup() {
        // basic
        HttpRequestDef.Builder<CreateManualBackupRequest, CreateManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateManualBackupRequest.class, CreateManualBackupResponse.class)
                .withName("CreateManualBackup")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateManualBackupRequestBody.class,
            f -> f.withMarshaller(CreateManualBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> deleteDatabaseRole = genFordeleteDatabaseRole();

    private static HttpRequestDef<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> genFordeleteDatabaseRole() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRoleRequest.class, DeleteDatabaseRoleResponse.class)
                .withName("DeleteDatabaseRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-role")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDatabaseRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteDatabaseRoleRequestBody.class,
            f -> f.withMarshaller(DeleteDatabaseRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUser = genFordeleteDatabaseUser();

    private static HttpRequestDef<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> genFordeleteDatabaseUser() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseUserRequest.class, DeleteDatabaseUserResponse.class)
                .withName("DeleteDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteDatabaseUserRequestBody.class,
            f -> f.withMarshaller(DeleteDatabaseUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance = genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackup = genFordeleteManualBackup();

    private static HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> genFordeleteManualBackup() {
        // basic
        HttpRequestDef.Builder<DeleteManualBackupRequest, DeleteManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteManualBackupRequest.class, DeleteManualBackupResponse.class)
                .withName("DeleteManualBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteManualBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> deleteSession = genFordeleteSession();

    private static HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> genFordeleteSession() {
        // basic
        HttpRequestDef.Builder<DeleteSessionRequest, DeleteSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteSessionRequest.class, DeleteSessionResponse.class)
                .withName("DeleteSession")
                .withUri("/v3/{project_id}/nodes/{node_id}/session")
                .withContentType("application/json");

        // requests
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSessionRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteSessionRequestBody.class,
            f -> f.withMarshaller(DeleteSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DownloadErrorlogRequest, DownloadErrorlogResponse> downloadErrorlog = genFordownloadErrorlog();

    private static HttpRequestDef<DownloadErrorlogRequest, DownloadErrorlogResponse> genFordownloadErrorlog() {
        // basic
        HttpRequestDef.Builder<DownloadErrorlogRequest, DownloadErrorlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadErrorlogRequest.class, DownloadErrorlogResponse.class)
                .withName("DownloadErrorlog")
                .withUri("/v3/{project_id}/instances/{instance_id}/errorlog-download")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadErrorlogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DownloadErrorlogRequestBody.class,
            f -> f.withMarshaller(DownloadErrorlogRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlog = genFordownloadSlowlog();

    private static HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> genFordownloadSlowlog() {
        // basic
        HttpRequestDef.Builder<DownloadSlowlogRequest, DownloadSlowlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadSlowlogRequest.class, DownloadSlowlogResponse.class)
                .withName("DownloadSlowlog")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-download")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadSlowlogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DownloadSlowlogRequestBody.class,
            f -> f.withMarshaller(DownloadSlowlogRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAuditlogLinksRequest, ListAuditlogLinksResponse> listAuditlogLinks = genForlistAuditlogLinks();

    private static HttpRequestDef<ListAuditlogLinksRequest, ListAuditlogLinksResponse> genForlistAuditlogLinks() {
        // basic
        HttpRequestDef.Builder<ListAuditlogLinksRequest, ListAuditlogLinksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditlogLinksRequest.class, ListAuditlogLinksResponse.class)
                .withName("ListAuditlogLinks")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-links")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuditlogLinksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ProduceAuditlogLinksRequestBody.class,
            f -> f.withMarshaller(ListAuditlogLinksRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogs = genForlistAuditlogs();

    private static HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> genForlistAuditlogs() {
        // basic
        HttpRequestDef.Builder<ListAuditlogsRequest, ListAuditlogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditlogsRequest.class, ListAuditlogsResponse.class)
                .withName("ListAuditlogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAz2MigrateRequest, ListAz2MigrateResponse> listAz2Migrate = genForlistAz2Migrate();

    private static HttpRequestDef<ListAz2MigrateRequest, ListAz2MigrateResponse> genForlistAz2Migrate() {
        // basic
        HttpRequestDef.Builder<ListAz2MigrateRequest, ListAz2MigrateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAz2MigrateRequest.class, ListAz2MigrateResponse.class)
                .withName("ListAz2Migrate")
                .withUri("/v3/{project_id}/instances/{instance_id}/migrate/az")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAz2MigrateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
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
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBackupsRequest.BackupTypeEnum.class,
            f -> f.withMarshaller(ListBackupsRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBackupsRequest.ModeEnum.class,
            f -> f.withMarshaller(ListBackupsRequest::getMode, (req, v) -> {
                req.setMode(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRoles = genForlistDatabaseRoles();

    private static HttpRequestDef<ListDatabaseRolesRequest, ListDatabaseRolesResponse> genForlistDatabaseRoles() {
        // basic
        HttpRequestDef.Builder<ListDatabaseRolesRequest, ListDatabaseRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseRolesRequest.class, ListDatabaseRolesResponse.class)
                .withName("ListDatabaseRoles")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-roles")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDatabaseRolesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("role_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatabaseRolesRequest::getRoleName, (req, v) -> {
                req.setRoleName(v);
            })
        );
        builder.withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatabaseRolesRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDatabaseRolesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDatabaseRolesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsers = genForlistDatabaseUsers();

    private static HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> genForlistDatabaseUsers() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUsersRequest, ListDatabaseUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseUsersRequest.class, ListDatabaseUsersResponse.class)
                .withName("ListDatabaseUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDatabaseUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatabaseUsersRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            })
        );
        builder.withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatabaseUsersRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDatabaseUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDatabaseUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersions = genForlistDatastoreVersions();

    private static HttpRequestDef<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> genForlistDatastoreVersions() {
        // basic
        HttpRequestDef.Builder<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoreVersionsRequest.class, ListDatastoreVersionsResponse.class)
                .withName("ListDatastoreVersions")
                .withUri("/v3/{project_id}/datastores/{datastore_name}/versions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("datastore_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListDatastoreVersionsRequest.DatastoreNameEnum.class,
            f -> f.withMarshaller(ListDatastoreVersionsRequest::getDatastoreName, (req, v) -> {
                req.setDatastoreName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogs = genForlistErrorLogs();

    private static HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> genForlistErrorLogs() {
        // basic
        HttpRequestDef.Builder<ListErrorLogsRequest, ListErrorLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListErrorLogsRequest.class, ListErrorLogsResponse.class)
                .withName("ListErrorLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/errorlog")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListErrorLogsRequest.TypeEnum.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListFlavorsRequest.EngineNameEnum.class,
            f -> f.withMarshaller(ListFlavorsRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags = genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances = genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListInstancesRequest.ModeEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getMode, (req, v) -> {
                req.setMode(v);
            })
        );
        builder.withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListInstancesRequest.DatastoreTypeEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTags = genForlistInstancesByTags();

    private static HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> genForlistInstancesByTags() {
        // basic
        HttpRequestDef.Builder<ListInstancesByTagsRequest, ListInstancesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesByTagsRequest.class, ListInstancesByTagsResponse.class)
                .withName("ListInstancesByTags")
                .withUri("/v3/{project_id}/instances/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListInstancesByTagsRequestBody.class,
            f -> f.withMarshaller(ListInstancesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags = genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> listRestoreCollections = genForlistRestoreCollections();

    private static HttpRequestDef<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> genForlistRestoreCollections() {
        // basic
        HttpRequestDef.Builder<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreCollectionsRequest.class, ListRestoreCollectionsResponse.class)
                .withName("ListRestoreCollections")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore-collection")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getRestoreTime, (req, v) -> {
                req.setRestoreTime(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabases = genForlistRestoreDatabases();

    private static HttpRequestDef<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> genForlistRestoreDatabases() {
        // basic
        HttpRequestDef.Builder<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreDatabasesRequest.class, ListRestoreDatabasesResponse.class)
                .withName("ListRestoreDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore-database")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getRestoreTime, (req, v) -> {
                req.setRestoreTime(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimes = genForlistRestoreTimes();

    private static HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> genForlistRestoreTimes() {
        // basic
        HttpRequestDef.Builder<ListRestoreTimesRequest, ListRestoreTimesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreTimesRequest.class, ListRestoreTimesResponse.class)
                .withName("ListRestoreTimes")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore-time")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreTimesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreTimesRequest::getDate, (req, v) -> {
                req.setDate(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRestoreTimesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSessionsRequest, ListSessionsResponse> listSessions = genForlistSessions();

    private static HttpRequestDef<ListSessionsRequest, ListSessionsResponse> genForlistSessions() {
        // basic
        HttpRequestDef.Builder<ListSessionsRequest, ListSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSessionsRequest.class, ListSessionsResponse.class)
                .withName("ListSessions")
                .withUri("/v3/{project_id}/nodes/{node_id}/sessions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSessionsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSessionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSessionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("plan_summary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSessionsRequest::getPlanSummary, (req, v) -> {
                req.setPlanSummary(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSessionsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSessionsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("cost_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSessionsRequest::getCostTime, (req, v) -> {
                req.setCostTime(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForlistSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForlistSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListSlowLogsRequest, ListSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogsRequest.class, ListSlowLogsResponse.class)
                .withName("ListSlowLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListSlowLogsRequest.TypeEnum.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListStorageTypeRequest, ListStorageTypeResponse> listStorageType = genForlistStorageType();

    private static HttpRequestDef<ListStorageTypeRequest, ListStorageTypeResponse> genForlistStorageType() {
        // basic
        HttpRequestDef.Builder<ListStorageTypeRequest, ListStorageTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStorageTypeRequest.class, ListStorageTypeResponse.class)
                .withName("ListStorageType")
                .withUri("/v3/{project_id}/storage-type")
                .withContentType("application/json");

        // requests
        builder.withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListStorageTypeRequest.EngineNameEnum.class,
            f -> f.withMarshaller(ListStorageTypeRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<MigrateAzRequest, MigrateAzResponse> migrateAz = genFormigrateAz();

    private static HttpRequestDef<MigrateAzRequest, MigrateAzResponse> genFormigrateAz() {
        // basic
        HttpRequestDef.Builder<MigrateAzRequest, MigrateAzResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateAzRequest.class, MigrateAzResponse.class)
                .withName("MigrateAz")
                .withUri("/v3/{project_id}/instances/{instance_id}/migrate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MigrateAzRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            MigrateAzRequestBody.class,
            f -> f.withMarshaller(MigrateAzRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword = genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/reset-password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
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

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance = genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/resize")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResizeInstanceRequestBody.class,
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolume = genForresizeInstanceVolume();

    private static HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> genForresizeInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceVolumeRequest.class, ResizeInstanceVolumeResponse.class)
                .withName("ResizeInstanceVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/enlarge-volume")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResizeInstanceVolumeRequestBody.class,
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> restartInstance = genForrestartInstance();

    private static HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> genForrestartInstance() {
        // basic
        HttpRequestDef.Builder<RestartInstanceRequest, RestartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartInstanceRequest.class, RestartInstanceResponse.class)
                .withName("RestartInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/restart")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestartInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestartInstanceRequestBody.class,
            f -> f.withMarshaller(RestartInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstance = genForrestoreInstance();

    private static HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> genForrestoreInstance() {
        // basic
        HttpRequestDef.Builder<RestoreInstanceRequest, RestoreInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreInstanceRequest.class, RestoreInstanceResponse.class)
                .withName("RestoreInstance")
                .withUri("/v3/{project_id}/instances/recovery")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestoreInstanceRequestBody.class,
            f -> f.withMarshaller(RestoreInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> restoreInstanceFromCollection = genForrestoreInstanceFromCollection();

    private static HttpRequestDef<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> genForrestoreInstanceFromCollection() {
        // basic
        HttpRequestDef.Builder<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreInstanceFromCollectionRequest.class, RestoreInstanceFromCollectionResponse.class)
                .withName("RestoreInstanceFromCollection")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore/collections")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestoreInstanceFromCollectionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreInstanceFromCollectionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestoreInstanceFromCollectionRequestBody.class,
            f -> f.withMarshaller(RestoreInstanceFromCollectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestoreNewInstanceRequest, RestoreNewInstanceResponse> restoreNewInstance = genForrestoreNewInstance();

    private static HttpRequestDef<RestoreNewInstanceRequest, RestoreNewInstanceResponse> genForrestoreNewInstance() {
        // basic
        HttpRequestDef.Builder<RestoreNewInstanceRequest, RestoreNewInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreNewInstanceRequest.class, RestoreNewInstanceResponse.class)
                .withName("RestoreNewInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestoreNewInstanceRequestBody.class,
            f -> f.withMarshaller(RestoreNewInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicy = genForsetAuditlogPolicy();

    private static HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> genForsetAuditlogPolicy() {
        // basic
        HttpRequestDef.Builder<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetAuditlogPolicyRequest.class, SetAuditlogPolicyResponse.class)
                .withName("SetAuditlogPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SetAuditlogPolicyRequestBody.class,
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy = genForsetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForsetBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetBackupPolicyRequest, SetBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBackupPolicyRequest.class, SetBackupPolicyResponse.class)
                .withName("SetBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SetBackupPolicyRequestBody.class,
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetBalancerSwitchRequest, SetBalancerSwitchResponse> setBalancerSwitch = genForsetBalancerSwitch();

    private static HttpRequestDef<SetBalancerSwitchRequest, SetBalancerSwitchResponse> genForsetBalancerSwitch() {
        // basic
        HttpRequestDef.Builder<SetBalancerSwitchRequest, SetBalancerSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBalancerSwitchRequest.class, SetBalancerSwitchResponse.class)
                .withName("SetBalancerSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/balancer/{action}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetBalancerSwitchRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            SetBalancerSwitchRequest.ActionEnum.class,
            f -> f.withMarshaller(SetBalancerSwitchRequest::getAction, (req, v) -> {
                req.setAction(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetBalancerWindowRequest, SetBalancerWindowResponse> setBalancerWindow = genForsetBalancerWindow();

    private static HttpRequestDef<SetBalancerWindowRequest, SetBalancerWindowResponse> genForsetBalancerWindow() {
        // basic
        HttpRequestDef.Builder<SetBalancerWindowRequest, SetBalancerWindowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBalancerWindowRequest.class, SetBalancerWindowResponse.class)
                .withName("SetBalancerWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/balancer/active-window")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetBalancerWindowRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BalancerActiveWindow.class,
            f -> f.withMarshaller(SetBalancerWindowRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicy = genForshowAuditlogPolicy();

    private static HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> genForshowAuditlogPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditlogPolicyRequest.class, ShowAuditlogPolicyResponse.class)
                .withName("ShowAuditlogPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLink = genForshowBackupDownloadLink();

    private static HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> genForshowBackupDownloadLink() {
        // basic
        HttpRequestDef.Builder<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupDownloadLinkRequest.class, ShowBackupDownloadLinkResponse.class)
                .withName("ShowBackupDownloadLink")
                .withUri("/v3/{project_id}/backups/download-file")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy = genForshowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForshowBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyRequest, ShowBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPolicyRequest.class, ShowBackupPolicyResponse.class)
                .withName("ShowBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> showConnectionStatistics = genForshowConnectionStatistics();

    private static HttpRequestDef<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> genForshowConnectionStatistics() {
        // basic
        HttpRequestDef.Builder<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectionStatisticsRequest.class, ShowConnectionStatisticsResponse.class)
                .withName("ShowConnectionStatistics")
                .withUri("/v3/{project_id}/instances/{instance_id}/conn-statistics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowConnectionStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowConnectionStatisticsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowShardingBalancerRequest, ShowShardingBalancerResponse> showShardingBalancer = genForshowShardingBalancer();

    private static HttpRequestDef<ShowShardingBalancerRequest, ShowShardingBalancerResponse> genForshowShardingBalancer() {
        // basic
        HttpRequestDef.Builder<ShowShardingBalancerRequest, ShowShardingBalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowShardingBalancerRequest.class, ShowShardingBalancerResponse.class)
                .withName("ShowShardingBalancer")
                .withUri("/v3/{project_id}/instances/{instance_id}/balancer")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowShardingBalancerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForswitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForswitchSsl() {
        // basic
        HttpRequestDef.Builder<SwitchSslRequest, SwitchSslResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchSslRequest.class, SwitchSslResponse.class)
                .withName("SwitchSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/switch-ssl")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SwitchSslRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SwitchSslRequestBody.class,
            f -> f.withMarshaller(SwitchSslRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> switchoverReplicaSet = genForswitchoverReplicaSet();

    private static HttpRequestDef<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> genForswitchoverReplicaSet() {
        // basic
        HttpRequestDef.Builder<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchoverReplicaSetRequest.class, SwitchoverReplicaSetResponse.class)
                .withName("SwitchoverReplicaSet")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SwitchoverReplicaSetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetwork = genForupdateClientNetwork();

    private static HttpRequestDef<UpdateClientNetworkRequest, UpdateClientNetworkResponse> genForupdateClientNetwork() {
        // basic
        HttpRequestDef.Builder<UpdateClientNetworkRequest, UpdateClientNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateClientNetworkRequest.class, UpdateClientNetworkResponse.class)
                .withName("UpdateClientNetwork")
                .withUri("/v3/{project_id}/instances/{instance_id}/client-network")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateClientNetworkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ClientNetworkRequestBody.class,
            f -> f.withMarshaller(UpdateClientNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName = genForupdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForupdateInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceNameRequest, UpdateInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceNameRequest.class, UpdateInstanceNameResponse.class)
                .withName("UpdateInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-name")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateNameRequestBody.class,
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePort = genForupdateInstancePort();

    private static HttpRequestDef<UpdateInstancePortRequest, UpdateInstancePortResponse> genForupdateInstancePort() {
        // basic
        HttpRequestDef.Builder<UpdateInstancePortRequest, UpdateInstancePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateInstancePortRequest.class, UpdateInstancePortResponse.class)
                .withName("UpdateInstancePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-port")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstancePortRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePortRequestBody.class,
            f -> f.withMarshaller(UpdateInstancePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup = genForupdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForupdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSecurityGroupRequest.class, UpdateSecurityGroupResponse.class)
                .withName("UpdateSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-security-group")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSecurityGroupRequestBody.class,
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion = genForlistApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForlistApiVersion() {
        // basic
        HttpRequestDef.Builder<ListApiVersionRequest, ListApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionRequest.class, ListApiVersionResponse.class)
                .withName("ListApiVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

}

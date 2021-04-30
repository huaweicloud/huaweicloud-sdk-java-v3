package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rds.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class RdsMeta {

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForattachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForattachEip() {
        // basic
        HttpRequestDef.Builder<AttachEipRequest, AttachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AttachEipRequest.class, AttachEipResponse.class)
                .withName("AttachEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AttachEipRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            AttachEipRequest.XLanguageEnum.class,
            f -> f.withMarshaller(AttachEipRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BindEipRequest.class,
            f -> f.withMarshaller(AttachEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddAction = genForbatchTagAddAction();

    private static HttpRequestDef<BatchTagAddActionRequest, BatchTagAddActionResponse> genForbatchTagAddAction() {
        // basic
        HttpRequestDef.Builder<BatchTagAddActionRequest, BatchTagAddActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagAddActionRequest.class, BatchTagAddActionResponse.class)
                .withName("BatchTagAddAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchTagAddActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchTagAddActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchTagActionAddRequestBody.class,
            f -> f.withMarshaller(BatchTagAddActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelAction = genForbatchTagDelAction();

    private static HttpRequestDef<BatchTagDelActionRequest, BatchTagDelActionResponse> genForbatchTagDelAction() {
        // basic
        HttpRequestDef.Builder<BatchTagDelActionRequest, BatchTagDelActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagDelActionRequest.class, BatchTagDelActionResponse.class)
                .withName("BatchTagDelAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchTagDelActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchTagDelActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchTagActionDelRequestBody.class,
            f -> f.withMarshaller(BatchTagDelActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverMode = genForchangeFailoverMode();

    private static HttpRequestDef<ChangeFailoverModeRequest, ChangeFailoverModeResponse> genForchangeFailoverMode() {
        // basic
        HttpRequestDef.Builder<ChangeFailoverModeRequest, ChangeFailoverModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeFailoverModeRequest.class, ChangeFailoverModeResponse.class)
                .withName("ChangeFailoverMode")
                .withUri("/v3/{project_id}/instances/{instance_id}/failover/mode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeFailoverModeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ChangeFailoverModeRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ChangeFailoverModeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            FailoverModeRequest.class,
            f -> f.withMarshaller(ChangeFailoverModeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategy = genForchangeFailoverStrategy();

    private static HttpRequestDef<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> genForchangeFailoverStrategy() {
        // basic
        HttpRequestDef.Builder<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeFailoverStrategyRequest.class, ChangeFailoverStrategyResponse.class)
                .withName("ChangeFailoverStrategy")
                .withUri("/v3/{project_id}/instances/{instance_id}/failover/strategy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ChangeFailoverStrategyRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            FailoverStrategyRequest.class,
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindow = genForchangeOpsWindow();

    private static HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> genForchangeOpsWindow() {
        // basic
        HttpRequestDef.Builder<ChangeOpsWindowRequest, ChangeOpsWindowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeOpsWindowRequest.class, ChangeOpsWindowResponse.class)
                .withName("ChangeOpsWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/ops-window")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeOpsWindowRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ChangeOpsWindowRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ChangeOpsWindowRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OpsWindowRequest.class,
            f -> f.withMarshaller(ChangeOpsWindowRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> createConfiguration = genForcreateConfiguration();

    private static HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> genForcreateConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationRequest, CreateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigurationRequest.class, CreateConfigurationResponse.class)
                .withName("CreateConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            CreateConfigurationRequest.XLanguageEnum.class,
            f -> f.withMarshaller(CreateConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConfigurationForCreation.class,
            f -> f.withMarshaller(CreateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDnsNameRequest, CreateDnsNameResponse> createDnsName = genForcreateDnsName();

    private static HttpRequestDef<CreateDnsNameRequest, CreateDnsNameResponse> genForcreateDnsName() {
        // basic
        HttpRequestDef.Builder<CreateDnsNameRequest, CreateDnsNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDnsNameRequest.class, CreateDnsNameResponse.class)
                .withName("CreateDnsName")
                .withUri("/v3/{project_id}/instances/{instance_id}/create-dns")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDnsNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            CreateDnsNameRequest.XLanguageEnum.class,
            f -> f.withMarshaller(CreateDnsNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDnsNameRequestBody.class,
            f -> f.withMarshaller(CreateDnsNameRequest::getBody, (req, v) -> {
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            CreateInstanceRequest.XLanguageEnum.class,
            f -> f.withMarshaller(CreateInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceRequest.class,
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateManualBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
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

    public static final HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstance = genForcreateRestoreInstance();

    private static HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> genForcreateRestoreInstance() {
        // basic
        HttpRequestDef.Builder<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRestoreInstanceRequest.class, CreateRestoreInstanceResponse.class)
                .withName("CreateRestoreInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            CreateRestoreInstanceRequest.XLanguageEnum.class,
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceRequest.class,
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration = genFordeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genFordeleteConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationRequest, DeleteConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfigurationRequest.class, DeleteConfigurationResponse.class)
                .withName("DeleteConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            DeleteInstanceRequest.XLanguageEnum.class,
            f -> f.withMarshaller(DeleteInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteManualBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            DownloadSlowlogRequest.XLanguageEnum.class,
            f -> f.withMarshaller(DownloadSlowlogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SlowlogDownloadRequest.class,
            f -> f.withMarshaller(DownloadSlowlogRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<EnableConfigurationRequest, EnableConfigurationResponse> enableConfiguration = genForenableConfiguration();

    private static HttpRequestDef<EnableConfigurationRequest, EnableConfigurationResponse> genForenableConfiguration() {
        // basic
        HttpRequestDef.Builder<EnableConfigurationRequest, EnableConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, EnableConfigurationRequest.class, EnableConfigurationResponse.class)
                .withName("EnableConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(EnableConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApplyConfigurationRequest.class,
            f -> f.withMarshaller(EnableConfigurationRequest::getBody, (req, v) -> {
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
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAuditlogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
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
            FieldExistence.NON_NULL_NON_EMPTY,
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListCollationsRequest, ListCollationsResponse> listCollations = genForlistCollations();

    private static HttpRequestDef<ListCollationsRequest, ListCollationsResponse> genForlistCollations() {
        // basic
        HttpRequestDef.Builder<ListCollationsRequest, ListCollationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCollationsRequest.class, ListCollationsResponse.class)
                .withName("ListCollations")
                .withUri("/v3/{project_id}/collations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListCollationsRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListCollationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations = genForlistConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForlistConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListConfigurationsRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> listDatastores = genForlistDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForlistDatastores() {
        // basic
        HttpRequestDef.Builder<ListDatastoresRequest, ListDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoresRequest.class, ListDatastoresResponse.class)
                .withName("ListDatastores")
                .withUri("/v3/{project_id}/datastores/{database_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListDatastoresRequest.DatabaseNameEnum.class,
            f -> f.withMarshaller(ListDatastoresRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatastoresRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListErrorLogsRequest.LevelEnum.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListErrorLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
                .withUri("/v3/{project_id}/flavors/{database_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListFlavorsRequest.DatabaseNameEnum.class,
            f -> f.withMarshaller(ListFlavorsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            })
        );
        builder.withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            })
        );
        builder.withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListInstancesRequest.TypeEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getType, (req, v) -> {
                req.setType(v);
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
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListInstancesRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListJobInfoRequest, ListJobInfoResponse> listJobInfo = genForlistJobInfo();

    private static HttpRequestDef<ListJobInfoRequest, ListJobInfoResponse> genForlistJobInfo() {
        // basic
        HttpRequestDef.Builder<ListJobInfoRequest, ListJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobInfoRequest.class, ListJobInfoResponse.class)
                .withName("ListJobInfo")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListJobInfoRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListJobInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetail = genForlistJobInfoDetail();

    private static HttpRequestDef<ListJobInfoDetailRequest, ListJobInfoDetailResponse> genForlistJobInfoDetail() {
        // basic
        HttpRequestDef.Builder<ListJobInfoDetailRequest, ListJobInfoDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobInfoDetailRequest.class, ListJobInfoDetailResponse.class)
                .withName("ListJobInfoDetail")
                .withUri("/v3/{project_id}/instances/{instance_id}/tasklist/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListJobInfoDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListJobInfoDetailRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListJobInfoDetailRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListJobInfoDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackups = genForlistOffSiteBackups();

    private static HttpRequestDef<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> genForlistOffSiteBackups() {
        // basic
        HttpRequestDef.Builder<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOffSiteBackupsRequest.class, ListOffSiteBackupsResponse.class)
                .withName("ListOffSiteBackups")
                .withUri("/v3/{project_id}/offsite-backups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListOffSiteBackupsRequest.BackupTypeEnum.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstances = genForlistOffSiteInstances();

    private static HttpRequestDef<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> genForlistOffSiteInstances() {
        // basic
        HttpRequestDef.Builder<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOffSiteInstancesRequest.class, ListOffSiteInstancesResponse.class)
                .withName("ListOffSiteInstances")
                .withUri("/v3/backups/offsite-backup-instance")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListOffSiteInstancesRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListOffSiteInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimes = genForlistOffSiteRestoreTimes();

    private static HttpRequestDef<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> genForlistOffSiteRestoreTimes() {
        // basic
        HttpRequestDef.Builder<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOffSiteRestoreTimesRequest.class, ListOffSiteRestoreTimesResponse.class)
                .withName("ListOffSiteRestoreTimes")
                .withUri("/v3/{project_id}/instances/{instance_id}/offsite-restore-time")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getDate, (req, v) -> {
                req.setDate(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, (req, v) -> {
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
            FieldExistence.NULL_IGNORE,
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
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListSlowLogsRequest.TypeEnum.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSlowLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatistics = genForlistSlowlogStatistics();

    private static HttpRequestDef<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> genForlistSlowlogStatistics() {
        // basic
        HttpRequestDef.Builder<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowlogStatisticsRequest.class, ListSlowlogStatisticsResponse.class)
                .withName("ListSlowlogStatistics")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog/statistics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getCurPage, (req, v) -> {
                req.setCurPage(v);
            })
        );
        builder.withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
            })
        );
        builder.withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListSlowlogStatisticsRequest.TypeEnum.class,
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListSlowlogStatisticsRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypes = genForlistStorageTypes();

    private static HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> genForlistStorageTypes() {
        // basic
        HttpRequestDef.Builder<ListStorageTypesRequest, ListStorageTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStorageTypesRequest.class, ListStorageTypesResponse.class)
                .withName("ListStorageTypes")
                .withUri("/v3/{project_id}/storage-type/{database_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListStorageTypesRequest.DatabaseNameEnum.class,
            f -> f.withMarshaller(ListStorageTypesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            })
        );
        builder.withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStorageTypesRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            })
        );
        builder.withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListStorageTypesRequest.HaModeEnum.class,
            f -> f.withMarshaller(ListStorageTypesRequest::getHaMode, (req, v) -> {
                req.setHaMode(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStorageTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollower = genFormigrateFollower();

    private static HttpRequestDef<MigrateFollowerRequest, MigrateFollowerResponse> genFormigrateFollower() {
        // basic
        HttpRequestDef.Builder<MigrateFollowerRequest, MigrateFollowerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateFollowerRequest.class, MigrateFollowerResponse.class)
                .withName("MigrateFollower")
                .withUri("/v3/{project_id}/instances/{instance_id}/migrateslave")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(MigrateFollowerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            MigrateFollowerRequest.XLanguageEnum.class,
            f -> f.withMarshaller(MigrateFollowerRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            FollowerMigrateRequest.class,
            f -> f.withMarshaller(MigrateFollowerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestoreTablesRequest, RestoreTablesResponse> restoreTables = genForrestoreTables();

    private static HttpRequestDef<RestoreTablesRequest, RestoreTablesResponse> genForrestoreTables() {
        // basic
        HttpRequestDef.Builder<RestoreTablesRequest, RestoreTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreTablesRequest.class, RestoreTablesResponse.class)
                .withName("RestoreTables")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore/tables")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestoreTablesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreTablesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestoreTablesRequestBody.class,
            f -> f.withMarshaller(RestoreTablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstance = genForrestoreToExistingInstance();

    private static HttpRequestDef<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> genForrestoreToExistingInstance() {
        // basic
        HttpRequestDef.Builder<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreToExistingInstanceRequest.class, RestoreToExistingInstanceResponse.class)
                .withName("RestoreToExistingInstance")
                .withUri("/v3/{project_id}/instances/recovery")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreToExistingInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RestoreToExistingInstanceRequestBody.class,
            f -> f.withMarshaller(RestoreToExistingInstanceRequest::getBody, (req, v) -> {
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
            HttpRequestDef.builder(HttpMethod.PUT, SetAuditlogPolicyRequest.class, SetAuditlogPolicyResponse.class)
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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

    public static final HttpRequestDef<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicy = genForsetOffSiteBackupPolicy();

    private static HttpRequestDef<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> genForsetOffSiteBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetOffSiteBackupPolicyRequest.class, SetOffSiteBackupPolicyResponse.class)
                .withName("SetOffSiteBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/offsite-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SetOffSiteBackupPolicyRequestBody.class,
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroup = genForsetSecurityGroup();

    private static HttpRequestDef<SetSecurityGroupRequest, SetSecurityGroupResponse> genForsetSecurityGroup() {
        // basic
        HttpRequestDef.Builder<SetSecurityGroupRequest, SetSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetSecurityGroupRequest.class, SetSecurityGroupResponse.class)
                .withName("SetSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            SetSecurityGroupRequest.XLanguageEnum.class,
            f -> f.withMarshaller(SetSecurityGroupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SecurityGroupRequest.class,
            f -> f.withMarshaller(SetSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLink = genForshowAuditlogDownloadLink();

    private static HttpRequestDef<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> genForshowAuditlogDownloadLink() {
        // basic
        HttpRequestDef.Builder<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowAuditlogDownloadLinkRequest.class, ShowAuditlogDownloadLinkResponse.class)
                .withName("ShowAuditlogDownloadLink")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-links")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            GenerateAuditlogDownloadLinkRequest.class,
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/backup-files")
                .withContentType("application/json");

        // requests
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> showConfiguration = genForshowConfiguration();

    private static HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> genForshowConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationRequest, ShowConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigurationRequest.class, ShowConfigurationResponse.class)
                .withName("ShowConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration = genForshowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForshowInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceConfigurationRequest.class, ShowInstanceConfigurationResponse.class)
                .withName("ShowInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicy = genForshowOffSiteBackupPolicy();

    private static HttpRequestDef<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> genForshowOffSiteBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOffSiteBackupPolicyRequest.class, ShowOffSiteBackupPolicyResponse.class)
                .withName("ShowOffSiteBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/offsite-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowOffSiteBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOffSiteBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartFailoverRequest, StartFailoverResponse> startFailover = genForstartFailover();

    private static HttpRequestDef<StartFailoverRequest, StartFailoverResponse> genForstartFailover() {
        // basic
        HttpRequestDef.Builder<StartFailoverRequest, StartFailoverResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartFailoverRequest.class, StartFailoverResponse.class)
                .withName("StartFailover")
                .withUri("/v3/{project_id}/instances/{instance_id}/failover")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartFailoverRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            StartFailoverRequest.XLanguageEnum.class,
            f -> f.withMarshaller(StartFailoverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeAction = genForstartInstanceEnlargeVolumeAction();

    private static HttpRequestDef<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> genForstartInstanceEnlargeVolumeAction() {
        // basic
        HttpRequestDef.Builder<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartInstanceEnlargeVolumeActionRequest.class, StartInstanceEnlargeVolumeActionResponse.class)
                .withName("StartInstanceEnlargeVolumeAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            StartInstanceEnlargeVolumeActionRequest.XLanguageEnum.class,
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnlargeVolume.class,
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartAction = genForstartInstanceRestartAction();

    private static HttpRequestDef<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> genForstartInstanceRestartAction() {
        // basic
        HttpRequestDef.Builder<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartInstanceRestartActionRequest.class, StartInstanceRestartActionResponse.class)
                .withName("StartInstanceRestartAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            StartInstanceRestartActionRequest.XLanguageEnum.class,
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceRestartRequsetBody.class,
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaAction = genForstartInstanceSingleToHaAction();

    private static HttpRequestDef<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> genForstartInstanceSingleToHaAction() {
        // basic
        HttpRequestDef.Builder<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartInstanceSingleToHaActionRequest.class, StartInstanceSingleToHaActionResponse.class)
                .withName("StartInstanceSingleToHaAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            StartInstanceSingleToHaActionRequest.XLanguageEnum.class,
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            Single2Ha.class,
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicy = genForstartRecyclePolicy();

    private static HttpRequestDef<StartRecyclePolicyRequest, StartRecyclePolicyResponse> genForstartRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<StartRecyclePolicyRequest, StartRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartRecyclePolicyRequest.class, StartRecyclePolicyResponse.class)
                .withName("StartRecyclePolicy")
                .withUri("/v3/{project_id}/instances/recycle-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartRecyclePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RecyclePolicyRequestBody.class,
            f -> f.withMarshaller(StartRecyclePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorAction = genForstartResizeFlavorAction();

    private static HttpRequestDef<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> genForstartResizeFlavorAction() {
        // basic
        HttpRequestDef.Builder<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartResizeFlavorActionRequest.class, StartResizeFlavorActionResponse.class)
                .withName("StartResizeFlavorAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            StartResizeFlavorActionRequest.XLanguageEnum.class,
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResizeFlavorRequest.class,
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForswitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForswitchSsl() {
        // basic
        HttpRequestDef.Builder<SwitchSslRequest, SwitchSslResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchSslRequest.class, SwitchSslResponse.class)
                .withName("SwitchSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl")
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            SwitchSslRequest.XLanguageEnum.class,
            f -> f.withMarshaller(SwitchSslRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SslOptionRequest.class,
            f -> f.withMarshaller(SwitchSslRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration = genForupdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForupdateConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationRequest, UpdateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationRequest.class, UpdateConfigurationResponse.class)
                .withName("UpdateConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConfigurationForUpdate.class,
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIp = genForupdateDataIp();

    private static HttpRequestDef<UpdateDataIpRequest, UpdateDataIpResponse> genForupdateDataIp() {
        // basic
        HttpRequestDef.Builder<UpdateDataIpRequest, UpdateDataIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataIpRequest.class, UpdateDataIpResponse.class)
                .withName("UpdateDataIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/ip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDataIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            UpdateDataIpRequest.XLanguageEnum.class,
            f -> f.withMarshaller(UpdateDataIpRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DataIpRequest.class,
            f -> f.withMarshaller(UpdateDataIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsName = genForupdateDnsName();

    private static HttpRequestDef<UpdateDnsNameRequest, UpdateDnsNameResponse> genForupdateDnsName() {
        // basic
        HttpRequestDef.Builder<UpdateDnsNameRequest, UpdateDnsNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDnsNameRequest.class, UpdateDnsNameResponse.class)
                .withName("UpdateDnsName")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-dns")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDnsNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            UpdateDnsNameRequest.XLanguageEnum.class,
            f -> f.withMarshaller(UpdateDnsNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyDnsNameRequestBody.class,
            f -> f.withMarshaller(UpdateDnsNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration = genForupdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForupdateInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceConfigurationRequest.class, UpdateInstanceConfigurationResponse.class)
                .withName("UpdateInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceConfigurationRequestBody.class,
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
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
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            UpdateInstanceNameRequest.XLanguageEnum.class,
            f -> f.withMarshaller(UpdateInstanceNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifiyInstanceNameRequest.class,
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForupdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForupdatePort() {
        // basic
        HttpRequestDef.Builder<UpdatePortRequest, UpdatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortRequest.class, UpdatePortResponse.class)
                .withName("UpdatePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/port")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePortRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            UpdatePortRequest.XLanguageEnum.class,
            f -> f.withMarshaller(UpdatePortRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDbPortRequest.class,
            f -> f.withMarshaller(UpdatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAlias = genForupdatePostgresqlInstanceAlias();

    private static HttpRequestDef<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> genForupdatePostgresqlInstanceAlias() {
        // basic
        HttpRequestDef.Builder<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePostgresqlInstanceAliasRequest.class, UpdatePostgresqlInstanceAliasResponse.class)
                .withName("UpdatePostgresqlInstanceAlias")
                .withUri("/v3/{project_id}/instances/{instance_id}/alias")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateRdsInstanceAliasRequest.class,
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilege = genForallowDbUserPrivilege();

    private static HttpRequestDef<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> genForallowDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AllowDbUserPrivilegeRequest.class, AllowDbUserPrivilegeResponse.class)
                .withName("AllowDbUserPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            GrantRequest.class,
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase = genForcreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForcreateDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRequest, CreateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRequest.class, CreateDatabaseResponse.class)
                .withName("CreateDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DatabaseForCreation.class,
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> createDbUser = genForcreateDbUser();

    private static HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> genForcreateDbUser() {
        // basic
        HttpRequestDef.Builder<CreateDbUserRequest, CreateDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbUserRequest.class, CreateDbUserResponse.class)
                .withName("CreateDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UserForCreation.class,
            f -> f.withMarshaller(CreateDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase = genFordeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genFordeleteDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRequest, DeleteDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRequest.class, DeleteDatabaseResponse.class)
                .withName("DeleteDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/{db_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDatabaseRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUser = genFordeleteDbUser();

    private static HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> genFordeleteDbUser() {
        // basic
        HttpRequestDef.Builder<DeleteDbUserRequest, DeleteDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDbUserRequest.class, DeleteDbUserResponse.class)
                .withName("DeleteDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/{user_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDbUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabases = genForlistAuthorizedDatabases();

    private static HttpRequestDef<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> genForlistAuthorizedDatabases() {
        // basic
        HttpRequestDef.Builder<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorizedDatabasesRequest.class, ListAuthorizedDatabasesResponse.class)
                .withName("ListAuthorizedDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/database")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("user-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsers = genForlistAuthorizedDbUsers();

    private static HttpRequestDef<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> genForlistAuthorizedDbUsers() {
        // basic
        HttpRequestDef.Builder<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorizedDbUsersRequest.class, ListAuthorizedDbUsersResponse.class)
                .withName("ListAuthorizedDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/db_user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases = genForlistDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForlistDatabases() {
        // basic
        HttpRequestDef.Builder<ListDatabasesRequest, ListDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabasesRequest.class, ListDatabasesResponse.class)
                .withName("ListDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForlistDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForlistDbUsers() {
        // basic
        HttpRequestDef.Builder<ListDbUsersRequest, ListDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbUsersRequest.class, ListDbUsersResponse.class)
                .withName("ListDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdRequest, ResetPwdResponse> resetPwd = genForresetPwd();

    private static HttpRequestDef<ResetPwdRequest, ResetPwdResponse> genForresetPwd() {
        // basic
        HttpRequestDef.Builder<ResetPwdRequest, ResetPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPwdRequest.class, ResetPwdResponse.class)
                .withName("ResetPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ResetPwdRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ResetPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PwdResetRequest.class,
            f -> f.withMarshaller(ResetPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RevokeRequest, RevokeResponse> revoke = genForrevoke();

    private static HttpRequestDef<RevokeRequest, RevokeResponse> genForrevoke() {
        // basic
        HttpRequestDef.Builder<RevokeRequest, RevokeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RevokeRequest.class, RevokeResponse.class)
                .withName("Revoke")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RevokeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RevokeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RevokeRequestBody.class,
            f -> f.withMarshaller(RevokeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwd = genForsetDbUserPwd();

    private static HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> genForsetDbUserPwd() {
        // basic
        HttpRequestDef.Builder<SetDbUserPwdRequest, SetDbUserPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetDbUserPwdRequest.class, SetDbUserPwdResponse.class)
                .withName("SetDbUserPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/resetpwd")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetDbUserPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            SetDbUserPwdRequest.XLanguageEnum.class,
            f -> f.withMarshaller(SetDbUserPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DbUserPwdRequest.class,
            f -> f.withMarshaller(SetDbUserPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilege = genForallowDbPrivilege();

    private static HttpRequestDef<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> genForallowDbPrivilege() {
        // basic
        HttpRequestDef.Builder<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AllowDbPrivilegeRequest.class, AllowDbPrivilegeResponse.class)
                .withName("AllowDbPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PostgresqlGrantRequest.class,
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabase = genForcreatePostgresqlDatabase();

    private static HttpRequestDef<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> genForcreatePostgresqlDatabase() {
        // basic
        HttpRequestDef.Builder<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostgresqlDatabaseRequest.class, CreatePostgresqlDatabaseResponse.class)
                .withName("CreatePostgresqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PostgresqlDatabaseForCreation.class,
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchema = genForcreatePostgresqlDatabaseSchema();

    private static HttpRequestDef<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> genForcreatePostgresqlDatabaseSchema() {
        // basic
        HttpRequestDef.Builder<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostgresqlDatabaseSchemaRequest.class, CreatePostgresqlDatabaseSchemaResponse.class)
                .withName("CreatePostgresqlDatabaseSchema")
                .withUri("/v3/{project_id}/instances/{instance_id}/schema")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PostgresqlDatabaseSchemaReq.class,
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUser = genForcreatePostgresqlDbUser();

    private static HttpRequestDef<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> genForcreatePostgresqlDbUser() {
        // basic
        HttpRequestDef.Builder<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostgresqlDbUserRequest.class, CreatePostgresqlDbUserResponse.class)
                .withName("CreatePostgresqlDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PostgresqlUserForCreation.class,
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemas = genForlistPostgresqlDatabaseSchemas();

    private static HttpRequestDef<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> genForlistPostgresqlDatabaseSchemas() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPostgresqlDatabaseSchemasRequest.class, ListPostgresqlDatabaseSchemasResponse.class)
                .withName("ListPostgresqlDatabaseSchemas")
                .withUri("/v3/{project_id}/instances/{instance_id}/schema/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabases = genForlistPostgresqlDatabases();

    private static HttpRequestDef<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> genForlistPostgresqlDatabases() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPostgresqlDatabasesRequest.class, ListPostgresqlDatabasesResponse.class)
                .withName("ListPostgresqlDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginated = genForlistPostgresqlDbUserPaginated();

    private static HttpRequestDef<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> genForlistPostgresqlDbUserPaginated() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPostgresqlDbUserPaginatedRequest.class, ListPostgresqlDbUserPaginatedResponse.class)
                .withName("ListPostgresqlDbUserPaginated")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwd = genForsetPostgresqlDbUserPwd();

    private static HttpRequestDef<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> genForsetPostgresqlDbUserPwd() {
        // basic
        HttpRequestDef.Builder<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetPostgresqlDbUserPwdRequest.class, SetPostgresqlDbUserPwdResponse.class)
                .withName("SetPostgresqlDbUserPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/resetpwd")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            SetPostgresqlDbUserPwdRequest.XLanguageEnum.class,
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DbUserPwdRequest.class,
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilege = genForallowSqlserverDbUserPrivilege();

    private static HttpRequestDef<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> genForallowSqlserverDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AllowSqlserverDbUserPrivilegeRequest.class, AllowSqlserverDbUserPrivilegeResponse.class)
                .withName("AllowSqlserverDbUserPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SqlserverGrantRequest.class,
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabase = genForcreateSqlserverDatabase();

    private static HttpRequestDef<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> genForcreateSqlserverDatabase() {
        // basic
        HttpRequestDef.Builder<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlserverDatabaseRequest.class, CreateSqlserverDatabaseResponse.class)
                .withName("CreateSqlserverDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SqlserverDatabaseForCreation.class,
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUser = genForcreateSqlserverDbUser();

    private static HttpRequestDef<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> genForcreateSqlserverDbUser() {
        // basic
        HttpRequestDef.Builder<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlserverDbUserRequest.class, CreateSqlserverDbUserResponse.class)
                .withName("CreateSqlserverDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SqlserverUserForCreation.class,
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabase = genFordeleteSqlserverDatabase();

    private static HttpRequestDef<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> genFordeleteSqlserverDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSqlserverDatabaseRequest.class, DeleteSqlserverDatabaseResponse.class)
                .withName("DeleteSqlserverDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/{db_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUser = genFordeleteSqlserverDbUser();

    private static HttpRequestDef<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> genFordeleteSqlserverDbUser() {
        // basic
        HttpRequestDef.Builder<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSqlserverDbUserRequest.class, DeleteSqlserverDbUserResponse.class)
                .withName("DeleteSqlserverDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/{user_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsers = genForlistAuthorizedSqlserverDbUsers();

    private static HttpRequestDef<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> genForlistAuthorizedSqlserverDbUsers() {
        // basic
        HttpRequestDef.Builder<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorizedSqlserverDbUsersRequest.class, ListAuthorizedSqlserverDbUsersResponse.class)
                .withName("ListAuthorizedSqlserverDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/db_user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabases = genForlistSqlserverDatabases();

    private static HttpRequestDef<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> genForlistSqlserverDatabases() {
        // basic
        HttpRequestDef.Builder<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlserverDatabasesRequest.class, ListSqlserverDatabasesResponse.class)
                .withName("ListSqlserverDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsers = genForlistSqlserverDbUsers();

    private static HttpRequestDef<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> genForlistSqlserverDbUsers() {
        // basic
        HttpRequestDef.Builder<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlserverDbUsersRequest.class, ListSqlserverDbUsersResponse.class)
                .withName("ListSqlserverDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilege = genForrevokeSqlserverDbUserPrivilege();

    private static HttpRequestDef<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> genForrevokeSqlserverDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RevokeSqlserverDbUserPrivilegeRequest.class, RevokeSqlserverDbUserPrivilegeResponse.class)
                .withName("RevokeSqlserverDbUserPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SqlserverRevokeRequest.class,
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

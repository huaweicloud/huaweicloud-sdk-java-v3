package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dcs.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DcsMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTags = genForbatchCreateOrDeleteTags();

    private static HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> genForbatchCreateOrDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateOrDeleteTagsRequest.class, BatchCreateOrDeleteTagsResponse.class)
                .withName("BatchCreateOrDeleteTags")
                .withUri("/v2/{project_id}/dcs/{instance_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateOrDeleteInstanceTags.class,
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstances = genForbatchDeleteInstances();

    private static HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> genForbatchDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteInstancesRequest.class, BatchDeleteInstancesResponse.class)
                .withName("BatchDeleteInstances")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("all_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getAllFailure, (req, v) -> {
                req.setAllFailure(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            BatchDeleteBody.class,
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> changeMasterStandby = genForchangeMasterStandby();

    private static HttpRequestDef<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> genForchangeMasterStandby() {
        // basic
        HttpRequestDef.Builder<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeMasterStandbyRequest.class, ChangeMasterStandbyResponse.class)
                .withName("ChangeMasterStandby")
                .withUri("/v2/{project_id}/instances/{instance_id}/swap")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeMasterStandbyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CopyInstanceRequest, CopyInstanceResponse> copyInstance = genForcopyInstance();

    private static HttpRequestDef<CopyInstanceRequest, CopyInstanceResponse> genForcopyInstance() {
        // basic
        HttpRequestDef.Builder<CopyInstanceRequest, CopyInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyInstanceRequest.class, CopyInstanceResponse.class)
                .withName("CopyInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CopyInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            BackupInstanceBody.class,
            f -> f.withMarshaller(CopyInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> createBigkeyScanTask = genForcreateBigkeyScanTask();

    private static HttpRequestDef<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> genForcreateBigkeyScanTask() {
        // basic
        HttpRequestDef.Builder<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBigkeyScanTaskRequest.class, CreateBigkeyScanTaskResponse.class)
                .withName("CreateBigkeyScanTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateBigkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTask = genForcreateDiagnosisTask();

    private static HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> genForcreateDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDiagnosisTaskRequest.class, CreateDiagnosisTaskResponse.class)
                .withName("CreateDiagnosisTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/diagnosis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDiagnosisTaskBody.class,
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> createHotkeyScanTask = genForcreateHotkeyScanTask();

    private static HttpRequestDef<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> genForcreateHotkeyScanTask() {
        // basic
        HttpRequestDef.Builder<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHotkeyScanTaskRequest.class, CreateHotkeyScanTaskResponse.class)
                .withName("CreateHotkeyScanTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateHotkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
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
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateInstanceBody.class,
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateMigrationTaskRequest, CreateMigrationTaskResponse> createMigrationTask = genForcreateMigrationTask();

    private static HttpRequestDef<CreateMigrationTaskRequest, CreateMigrationTaskResponse> genForcreateMigrationTask() {
        // basic
        HttpRequestDef.Builder<CreateMigrationTaskRequest, CreateMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMigrationTaskRequest.class, CreateMigrationTaskResponse.class)
                .withName("CreateMigrationTask")
                .withUri("/v2/{project_id}/migration-task")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateMigrationTaskBody.class,
            f -> f.withMarshaller(CreateMigrationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRedislogRequest, CreateRedislogResponse> createRedislog = genForcreateRedislog();

    private static HttpRequestDef<CreateRedislogRequest, CreateRedislogResponse> genForcreateRedislog() {
        // basic
        HttpRequestDef.Builder<CreateRedislogRequest, CreateRedislogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRedislogRequest.class, CreateRedislogResponse.class)
                .withName("CreateRedislog")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRedislogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("query_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(CreateRedislogRequest::getQueryTime, (req, v) -> {
                req.setQueryTime(v);
            })
        );
        builder.withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRedislogRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            })
        );
        builder.withRequestField("replication_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRedislogRequest::getReplicationId, (req, v) -> {
                req.setReplicationId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> createRedislogDownloadLink = genForcreateRedislogDownloadLink();

    private static HttpRequestDef<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> genForcreateRedislogDownloadLink() {
        // basic
        HttpRequestDef.Builder<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRedislogDownloadLinkRequest.class, CreateRedislogDownloadLinkResponse.class)
                .withName("CreateRedislogDownloadLink")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog/{id}/links")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRedislogDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRedislogDownloadLinkRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTask = genFordeleteBackgroundTask();

    private static HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> genFordeleteBackgroundTask() {
        // basic
        HttpRequestDef.Builder<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackgroundTaskRequest.class, DeleteBackgroundTaskResponse.class)
                .withName("DeleteBackgroundTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupFileRequest, DeleteBackupFileResponse> deleteBackupFile = genFordeleteBackupFile();

    private static HttpRequestDef<DeleteBackupFileRequest, DeleteBackupFileResponse> genFordeleteBackupFile() {
        // basic
        HttpRequestDef.Builder<DeleteBackupFileRequest, DeleteBackupFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupFileRequest.class, DeleteBackupFileResponse.class)
                .withName("DeleteBackupFile")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackupFileRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackupFileRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> deleteBigkeyScanTask = genFordeleteBigkeyScanTask();

    private static HttpRequestDef<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> genFordeleteBigkeyScanTask() {
        // basic
        HttpRequestDef.Builder<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBigkeyScanTaskRequest.class, DeleteBigkeyScanTaskResponse.class)
                .withName("DeleteBigkeyScanTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task/{bigkey_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBigkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("bigkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBigkeyScanTaskRequest::getBigkeyId, (req, v) -> {
                req.setBigkeyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> deleteHotkeyScanTask = genFordeleteHotkeyScanTask();

    private static HttpRequestDef<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> genFordeleteHotkeyScanTask() {
        // basic
        HttpRequestDef.Builder<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHotkeyScanTaskRequest.class, DeleteHotkeyScanTaskResponse.class)
                .withName("DeleteHotkeyScanTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task/{hotkey_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteHotkeyScanTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("hotkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteHotkeyScanTaskRequest::getHotkeyId, (req, v) -> {
                req.setHotkeyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> deleteIpFromDomainName = genFordeleteIpFromDomainName();

    private static HttpRequestDef<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> genFordeleteIpFromDomainName() {
        // basic
        HttpRequestDef.Builder<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIpFromDomainNameRequest.class, DeleteIpFromDomainNameResponse.class)
                .withName("DeleteIpFromDomainName")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group_id}/replications/{node_id}/remove-ip")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> deleteMigrationTask = genFordeleteMigrationTask();

    private static HttpRequestDef<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> genFordeleteMigrationTask() {
        // basic
        HttpRequestDef.Builder<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMigrationTaskRequest.class, DeleteMigrationTaskResponse.class)
                .withName("DeleteMigrationTask")
                .withUri("/v2/{project_id}/migration-tasks/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteMigrateTaskRequest.class,
            f -> f.withMarshaller(DeleteMigrationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> deleteSingleInstance = genFordeleteSingleInstance();

    private static HttpRequestDef<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> genFordeleteSingleInstance() {
        // basic
        HttpRequestDef.Builder<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSingleInstanceRequest.class, DeleteSingleInstanceResponse.class)
                .withName("DeleteSingleInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSingleInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones = genForlistAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForlistAvailableZones() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesRequest, ListAvailableZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableZonesRequest.class, ListAvailableZonesResponse.class)
                .withName("ListAvailableZones")
                .withUri("/v2/available-zones")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBackgroundTaskRequest, ListBackgroundTaskResponse> listBackgroundTask = genForlistBackgroundTask();

    private static HttpRequestDef<ListBackgroundTaskRequest, ListBackgroundTaskResponse> genForlistBackgroundTask() {
        // basic
        HttpRequestDef.Builder<ListBackgroundTaskRequest, ListBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackgroundTaskRequest.class, ListBackgroundTaskResponse.class)
                .withName("ListBackgroundTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBackgroundTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackgroundTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackgroundTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackgroundTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackgroundTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBackupFileLinksRequest, ListBackupFileLinksResponse> listBackupFileLinks = genForlistBackupFileLinks();

    private static HttpRequestDef<ListBackupFileLinksRequest, ListBackupFileLinksResponse> genForlistBackupFileLinks() {
        // basic
        HttpRequestDef.Builder<ListBackupFileLinksRequest, ListBackupFileLinksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBackupFileLinksRequest.class, ListBackupFileLinksResponse.class)
                .withName("ListBackupFileLinks")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups/{backup_id}/links")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBackupFileLinksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBackupFileLinksRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DownloadBackupFilesReq.class,
            f -> f.withMarshaller(ListBackupFileLinksRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBackupRecordsRequest, ListBackupRecordsResponse> listBackupRecords = genForlistBackupRecords();

    private static HttpRequestDef<ListBackupRecordsRequest, ListBackupRecordsResponse> genForlistBackupRecords() {
        // basic
        HttpRequestDef.Builder<ListBackupRecordsRequest, ListBackupRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupRecordsRequest.class, ListBackupRecordsResponse.class)
                .withName("ListBackupRecords")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBackupRecordsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupRecordsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackupRecordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackupRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackupRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> listBigkeyScanTasks = genForlistBigkeyScanTasks();

    private static HttpRequestDef<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> genForlistBigkeyScanTasks() {
        // basic
        HttpRequestDef.Builder<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBigkeyScanTasksRequest.class, ListBigkeyScanTasksResponse.class)
                .withName("ListBigkeyScanTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBigkeyScanTasksRequest.StatusEnum.class,
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
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
                .withUri("/v2/{project_id}/instances/{instance_id}/configs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasks = genForlistDiagnosisTasks();

    private static HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> genForlistDiagnosisTasks() {
        // basic
        HttpRequestDef.Builder<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDiagnosisTasksRequest.class, ListDiagnosisTasksResponse.class)
                .withName("ListDiagnosisTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/diagnosis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
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
                .withUri("/v2/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            })
        );
        builder.withRequestField("cache_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getCacheMode, (req, v) -> {
                req.setCacheMode(v);
            })
        );
        builder.withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            })
        );
        builder.withRequestField("engine_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getEngineVersion, (req, v) -> {
                req.setEngineVersion(v);
            })
        );
        builder.withRequestField("cpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListFlavorsRequest.CpuTypeEnum.class,
            f -> f.withMarshaller(ListFlavorsRequest::getCpuType, (req, v) -> {
                req.setCpuType(v);
            })
        );
        builder.withRequestField("capacity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFlavorsRequest::getCapacity, (req, v) -> {
                req.setCapacity(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> listGroupReplicationInfo = genForlistGroupReplicationInfo();

    private static HttpRequestDef<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> genForlistGroupReplicationInfo() {
        // basic
        HttpRequestDef.Builder<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupReplicationInfoRequest.class, ListGroupReplicationInfoResponse.class)
                .withName("ListGroupReplicationInfo")
                .withUri("/v2/{project_id}/instance/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListGroupReplicationInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> listHotKeyScanTasks = genForlistHotKeyScanTasks();

    private static HttpRequestDef<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> genForlistHotKeyScanTasks() {
        // basic
        HttpRequestDef.Builder<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHotKeyScanTasksRequest.class, ListHotKeyScanTasksResponse.class)
                .withName("ListHotKeyScanTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListHotKeyScanTasksRequest.StatusEnum.class,
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
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
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getIncludeFailure, (req, v) -> {
                req.setIncludeFailure(v);
            })
        );
        builder.withRequestField("include_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getIncludeDelete, (req, v) -> {
                req.setIncludeDelete(v);
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
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("name_equal",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getNameEqual, (req, v) -> {
                req.setNameEqual(v);
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
        builder.withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getIp, (req, v) -> {
                req.setIp(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> listMaintenanceWindows = genForlistMaintenanceWindows();

    private static HttpRequestDef<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> genForlistMaintenanceWindows() {
        // basic
        HttpRequestDef.Builder<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMaintenanceWindowsRequest.class, ListMaintenanceWindowsResponse.class)
                .withName("ListMaintenanceWindows")
                .withUri("/v2/instances/maintain-windows")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMigrationTaskRequest, ListMigrationTaskResponse> listMigrationTask = genForlistMigrationTask();

    private static HttpRequestDef<ListMigrationTaskRequest, ListMigrationTaskResponse> genForlistMigrationTask() {
        // basic
        HttpRequestDef.Builder<ListMigrationTaskRequest, ListMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMigrationTaskRequest.class, ListMigrationTaskResponse.class)
                .withName("ListMigrationTask")
                .withUri("/v2/{project_id}/migration-tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMigrationTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMigrationTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMigrationTaskRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> listMonitoredObjects = genForlistMonitoredObjects();

    private static HttpRequestDef<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> genForlistMonitoredObjects() {
        // basic
        HttpRequestDef.Builder<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMonitoredObjectsRequest.class, ListMonitoredObjectsResponse.class)
                .withName("ListMonitoredObjects")
                .withUri("/v2/{project_id}/dims/monitored-objects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getDimName, (req, v) -> {
                req.setDimName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstance = genForlistMonitoredObjectsOfInstance();

    private static HttpRequestDef<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> genForlistMonitoredObjectsOfInstance() {
        // basic
        HttpRequestDef.Builder<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMonitoredObjectsOfInstanceRequest.class, ListMonitoredObjectsOfInstanceResponse.class)
                .withName("ListMonitoredObjectsOfInstance")
                .withUri("/v2/{project_id}/dims/monitored-objects/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMonitoredObjectsOfInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMonitoredObjectsOfInstanceRequest::getDimName, (req, v) -> {
                req.setDimName(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatus = genForlistNumberOfInstancesInDifferentStatus();

    private static HttpRequestDef<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> genForlistNumberOfInstancesInDifferentStatus() {
        // basic
        HttpRequestDef.Builder<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNumberOfInstancesInDifferentStatusRequest.class, ListNumberOfInstancesInDifferentStatusResponse.class)
                .withName("ListNumberOfInstancesInDifferentStatus")
                .withUri("/v2/{project_id}/instances/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNumberOfInstancesInDifferentStatusRequest::getIncludeFailure, (req, v) -> {
                req.setIncludeFailure(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRedislogRequest, ListRedislogResponse> listRedislog = genForlistRedislog();

    private static HttpRequestDef<ListRedislogRequest, ListRedislogResponse> genForlistRedislog() {
        // basic
        HttpRequestDef.Builder<ListRedislogRequest, ListRedislogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRedislogRequest.class, ListRedislogResponse.class)
                .withName("ListRedislog")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRedislogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRedislogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRedislogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRedislogRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreRecordsRequest, ListRestoreRecordsResponse> listRestoreRecords = genForlistRestoreRecords();

    private static HttpRequestDef<ListRestoreRecordsRequest, ListRestoreRecordsResponse> genForlistRestoreRecords() {
        // basic
        HttpRequestDef.Builder<ListRestoreRecordsRequest, ListRestoreRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreRecordsRequest.class, ListRestoreRecordsResponse.class)
                .withName("ListRestoreRecords")
                .withUri("/v2/{project_id}/instances/{instance_id}/restores")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRestoreRecordsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRestoreRecordsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRestoreRecordsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRestoreRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRestoreRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogRequest, ListSlowlogResponse> listSlowlog = genForlistSlowlog();

    private static HttpRequestDef<ListSlowlogRequest, ListSlowlogResponse> genForlistSlowlog() {
        // basic
        HttpRequestDef.Builder<ListSlowlogRequest, ListSlowlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowlogRequest.class, ListSlowlogResponse.class)
                .withName("ListSlowlog")
                .withUri("/v2/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowlogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSlowlogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSlowlogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListSlowlogRequest.SortKeyEnum.class,
            f -> f.withMarshaller(ListSlowlogRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListSlowlogRequest.SortDirEnum.class,
            f -> f.withMarshaller(ListSlowlogRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowlogRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSlowlogRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstances = genForlistStatisticsOfRunningInstances();

    private static HttpRequestDef<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> genForlistStatisticsOfRunningInstances() {
        // basic
        HttpRequestDef.Builder<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsOfRunningInstancesRequest.class, ListStatisticsOfRunningInstancesResponse.class)
                .withName("ListStatisticsOfRunningInstances")
                .withUri("/v2/{project_id}/instances/statistic")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListTagsOfTenantRequest, ListTagsOfTenantResponse> listTagsOfTenant = genForlistTagsOfTenant();

    private static HttpRequestDef<ListTagsOfTenantRequest, ListTagsOfTenantResponse> genForlistTagsOfTenant() {
        // basic
        HttpRequestDef.Builder<ListTagsOfTenantRequest, ListTagsOfTenantResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsOfTenantRequest.class, ListTagsOfTenantResponse.class)
                .withName("ListTagsOfTenant")
                .withUri("/v2/{project_id}/dcs/tags")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance = genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/resize")
                .withContentType("application/json;charset=UTF-8");

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
            ResizeInstanceBody.class,
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> restartOrFlushInstances = genForrestartOrFlushInstances();

    private static HttpRequestDef<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> genForrestartOrFlushInstances() {
        // basic
        HttpRequestDef.Builder<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RestartOrFlushInstancesRequest.class, RestartOrFlushInstancesResponse.class)
                .withName("RestartOrFlushInstances")
                .withUri("/v2/{project_id}/instances/status")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ChangeInstanceStatusBody.class,
            f -> f.withMarshaller(RestartOrFlushInstancesRequest::getBody, (req, v) -> {
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
                .withUri("/v2/{project_id}/instances/{instance_id}/restores")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestoreInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            RestoreInstanceBody.class,
            f -> f.withMarshaller(RestoreInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfig = genForshowBigkeyAutoscanConfig();

    private static HttpRequestDef<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> genForshowBigkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBigkeyAutoscanConfigRequest.class, ShowBigkeyAutoscanConfigResponse.class)
                .withName("ShowBigkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey/autoscan")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBigkeyAutoscanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetails = genForshowBigkeyScanTaskDetails();

    private static HttpRequestDef<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> genForshowBigkeyScanTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBigkeyScanTaskDetailsRequest.class, ShowBigkeyScanTaskDetailsResponse.class)
                .withName("ShowBigkeyScanTaskDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task/{bigkey_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBigkeyScanTaskDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("bigkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBigkeyScanTaskDetailsRequest::getBigkeyId, (req, v) -> {
                req.setBigkeyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetails = genForshowDiagnosisTaskDetails();

    private static HttpRequestDef<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> genForshowDiagnosisTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiagnosisTaskDetailsRequest.class, ShowDiagnosisTaskDetailsResponse.class)
                .withName("ShowDiagnosisTaskDetails")
                .withUri("/v2/{project_id}/diagnosis/{report_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDiagnosisTaskDetailsRequest::getReportId, (req, v) -> {
                req.setReportId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfig = genForshowHotkeyAutoscanConfig();

    private static HttpRequestDef<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> genForshowHotkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHotkeyAutoscanConfigRequest.class, ShowHotkeyAutoscanConfigResponse.class)
                .withName("ShowHotkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey/autoscan")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowHotkeyAutoscanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetails = genForshowHotkeyTaskDetails();

    private static HttpRequestDef<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> genForshowHotkeyTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHotkeyTaskDetailsRequest.class, ShowHotkeyTaskDetailsResponse.class)
                .withName("ShowHotkeyTaskDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task/{hotkey_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowHotkeyTaskDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("hotkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowHotkeyTaskDetailsRequest::getHotkeyId, (req, v) -> {
                req.setHotkeyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationTaskRequest, ShowMigrationTaskResponse> showMigrationTask = genForshowMigrationTask();

    private static HttpRequestDef<ShowMigrationTaskRequest, ShowMigrationTaskResponse> genForshowMigrationTask() {
        // basic
        HttpRequestDef.Builder<ShowMigrationTaskRequest, ShowMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigrationTaskRequest.class, ShowMigrationTaskResponse.class)
                .withName("ShowMigrationTask")
                .withUri("/v2/{project_id}/migration-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMigrationTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> showMigrationTaskStats = genForshowMigrationTaskStats();

    private static HttpRequestDef<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> genForshowMigrationTaskStats() {
        // basic
        HttpRequestDef.Builder<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigrationTaskStatsRequest.class, ShowMigrationTaskStatsResponse.class)
                .withName("ShowMigrationTaskStats")
                .withUri("/v2/{project_id}/migration-task/{task_id}/stats")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMigrationTaskStatsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> showQuotaOfTenant = genForshowQuotaOfTenant();

    private static HttpRequestDef<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> genForshowQuotaOfTenant() {
        // basic
        HttpRequestDef.Builder<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaOfTenantRequest.class, ShowQuotaOfTenantResponse.class)
                .withName("ShowQuotaOfTenant")
                .withUri("/v2/{project_id}/quota")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTagsRequest, ShowTagsResponse> showTags = genForshowTags();

    private static HttpRequestDef<ShowTagsRequest, ShowTagsResponse> genForshowTags() {
        // basic
        HttpRequestDef.Builder<ShowTagsRequest, ShowTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagsRequest.class, ShowTagsResponse.class)
                .withName("ShowTags")
                .withUri("/v2/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StopMigrationTaskRequest, StopMigrationTaskResponse> stopMigrationTask = genForstopMigrationTask();

    private static HttpRequestDef<StopMigrationTaskRequest, StopMigrationTaskResponse> genForstopMigrationTask() {
        // basic
        HttpRequestDef.Builder<StopMigrationTaskRequest, StopMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopMigrationTaskRequest.class, StopMigrationTaskResponse.class)
                .withName("StopMigrationTask")
                .withUri("/v2/{project_id}/migration-task/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopMigrationTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfig = genForupdateBigkeyAutoscanConfig();

    private static HttpRequestDef<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> genForupdateBigkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBigkeyAutoscanConfigRequest.class, UpdateBigkeyAutoscanConfigResponse.class)
                .withName("UpdateBigkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey/autoscan")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateBigkeyAutoscanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AutoscanConfigRequest.class,
            f -> f.withMarshaller(UpdateBigkeyAutoscanConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationsRequest, UpdateConfigurationsResponse> updateConfigurations = genForupdateConfigurations();

    private static HttpRequestDef<UpdateConfigurationsRequest, UpdateConfigurationsResponse> genForupdateConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationsRequest, UpdateConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationsRequest.class, UpdateConfigurationsResponse.class)
                .withName("UpdateConfigurations")
                .withUri("/v2/{project_id}/instances/{instance_id}/configs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyRedisConfigBody.class,
            f -> f.withMarshaller(UpdateConfigurationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfig = genForupdateHotkeyAutoScanConfig();

    private static HttpRequestDef<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> genForupdateHotkeyAutoScanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHotkeyAutoScanConfigRequest.class, UpdateHotkeyAutoScanConfigResponse.class)
                .withName("UpdateHotkeyAutoScanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey/autoscan")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateHotkeyAutoScanConfigRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AutoscanConfigRequest.class,
            f -> f.withMarshaller(UpdateHotkeyAutoScanConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance = genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            ModifyInstanceBody.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdatePasswordRequest, UpdatePasswordResponse> updatePassword = genForupdatePassword();

    private static HttpRequestDef<UpdatePasswordRequest, UpdatePasswordResponse> genForupdatePassword() {
        // basic
        HttpRequestDef.Builder<UpdatePasswordRequest, UpdatePasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePasswordRequest.class, UpdatePasswordResponse.class)
                .withName("UpdatePassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            ModifyInstancePasswordBody.class,
            f -> f.withMarshaller(UpdatePasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> updateSlavePriority = genForupdateSlavePriority();

    private static HttpRequestDef<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> genForupdateSlavePriority() {
        // basic
        HttpRequestDef.Builder<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSlavePriorityRequest.class, UpdateSlavePriorityResponse.class)
                .withName("UpdateSlavePriority")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group_id}/replications/{node_id}/slave-priority")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PriorityBody.class,
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowIpWhitelistRequest, ShowIpWhitelistResponse> showIpWhitelist = genForshowIpWhitelist();

    private static HttpRequestDef<ShowIpWhitelistRequest, ShowIpWhitelistResponse> genForshowIpWhitelist() {
        // basic
        HttpRequestDef.Builder<ShowIpWhitelistRequest, ShowIpWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpWhitelistRequest.class, ShowIpWhitelistResponse.class)
                .withName("ShowIpWhitelist")
                .withUri("/v2/{project_id}/instance/{instance_id}/whitelist")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowIpWhitelistRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> updateIpWhitelist = genForupdateIpWhitelist();

    private static HttpRequestDef<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> genForupdateIpWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpWhitelistRequest.class, UpdateIpWhitelistResponse.class)
                .withName("UpdateIpWhitelist")
                .withUri("/v2/{project_id}/instance/{instance_id}/whitelist")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateIpWhitelistRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyIpWhitelistBody.class,
            f -> f.withMarshaller(UpdateIpWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

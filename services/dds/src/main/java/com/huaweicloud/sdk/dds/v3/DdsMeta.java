package com.huaweicloud.sdk.dds.v3;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.dds.v3.model.*;

@SuppressWarnings("unchecked")
public class DdsMeta {

    public static final HttpRequestDef<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNode = genForaddShardingNode();

    private static HttpRequestDef<AddShardingNodeRequest, AddShardingNodeResponse> genForaddShardingNode() {
        // basic
        HttpRequestDef.Builder<AddShardingNodeRequest, AddShardingNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddShardingNodeRequest.class, AddShardingNodeResponse.class)
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
                AddShardingNodeRequestBody.class,
                f -> f.withMarshaller(AddShardingNodeRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchCreateInstanceTagsRequest, BatchCreateInstanceTagsResponse> batchCreateInstanceTags = genForbatchCreateInstanceTags();

    private static HttpRequestDef<BatchCreateInstanceTagsRequest, BatchCreateInstanceTagsResponse> genForbatchCreateInstanceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateInstanceTagsRequest, BatchCreateInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateInstanceTagsRequest.class, BatchCreateInstanceTagsResponse.class)
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(BatchCreateInstanceTagsRequest::getInstanceId, (req, v) -> {
                    req.setInstanceId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchCreateInstanceTagsRequestBody.class,
                f -> f.withMarshaller(BatchCreateInstanceTagsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchDeleteInstanceTagsRequest, BatchDeleteInstanceTagsResponse> batchDeleteInstanceTags = genForbatchDeleteInstanceTags();

    private static HttpRequestDef<BatchDeleteInstanceTagsRequest, BatchDeleteInstanceTagsResponse> genForbatchDeleteInstanceTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstanceTagsRequest, BatchDeleteInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteInstanceTagsRequest.class, BatchDeleteInstanceTagsResponse.class)
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(BatchDeleteInstanceTagsRequest::getInstanceId, (req, v) -> {
                    req.setInstanceId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchDeleteInstanceTagsRequestBody.class,
                f -> f.withMarshaller(BatchDeleteInstanceTagsRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackup = genForcreateManualBackup();

    private static HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> genForcreateManualBackup() {
        // basic
        HttpRequestDef.Builder<CreateManualBackupRequest, CreateManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateManualBackupRequest.class, CreateManualBackupResponse.class)
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

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance = genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withUri("/v3/{project_id}/instances/{instance_id}");

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
                .withUri("/v3/{project_id}/backups/{backup_id}");

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

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForlistBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForlistBackups() {
        // basic
        HttpRequestDef.Builder<ListBackupsRequest, ListBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsRequest.class, ListBackupsResponse.class)
                .withUri("/v3/{project_id}/backups");

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

    public static final HttpRequestDef<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersions = genForlistDatastoreVersions();

    private static HttpRequestDef<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> genForlistDatastoreVersions() {
        // basic
        HttpRequestDef.Builder<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoreVersionsRequest.class, ListDatastoreVersionsResponse.class)
                .withUri("/v3/{project_id}/datastores/{datastore_name}/versions");

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

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withUri("/v3/{project_id}/flavors");

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
                .withUri("/v3/{project_id}/instances/{instance_id}/tags");

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
                .withUri("/v3/{project_id}/instances");

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
                .withUri("/v3/{project_id}/tags");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance = genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
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

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy = genForsetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForsetBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetBackupPolicyRequest, SetBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBackupPolicyRequest.class, SetBackupPolicyResponse.class)
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

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy = genForshowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForshowBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyRequest, ShowBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPolicyRequest.class, ShowBackupPolicyResponse.class)
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy");

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

}


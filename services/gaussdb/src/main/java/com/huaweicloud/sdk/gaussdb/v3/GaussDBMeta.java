package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdb.v3.model.*;

@SuppressWarnings("unchecked")
public class GaussDBMeta {

    public static final HttpRequestDef<AddDatabasePermissionRequest, AddDatabasePermissionResponse> addDatabasePermission =
        genForaddDatabasePermission();

    private static HttpRequestDef<AddDatabasePermissionRequest, AddDatabasePermissionResponse> genForaddDatabasePermission() {
        // basic
        HttpRequestDef.Builder<AddDatabasePermissionRequest, AddDatabasePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddDatabasePermissionRequest.class, AddDatabasePermissionResponse.class)
            .withName("AddDatabasePermission")
            .withUri("/v3/{project_id}/instances/{instance_id}/db-users/privilege")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<GrantDatabasePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantDatabasePermissionRequestBody.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForbatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForbatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchOperateInstanceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateInstanceTagRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEip =
        genForcancelGaussMySqlInstanceEip();

    private static HttpRequestDef<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> genForcancelGaussMySqlInstanceEip() {
        // basic
        HttpRequestDef.Builder<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CancelGaussMySqlInstanceEipRequest.class,
                    CancelGaussMySqlInstanceEipResponse.class)
                .withName("CancelGaussMySqlInstanceEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelGaussMySqlInstanceEipRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelGaussMySqlInstanceEipRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTask =
        genForcancelScheduleTask();

    private static HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> genForcancelScheduleTask() {
        // basic
        HttpRequestDef.Builder<CancelScheduleTaskRequest, CancelScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelScheduleTaskRequest.class, CancelScheduleTaskResponse.class)
                .withName("CancelScheduleTask")
                .withUri("/v3/{project_id}/scheduled-jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CancelScheduleTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelScheduleTask.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecification =
        genForchangeGaussMySqlInstanceSpecification();

    private static HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> genForchangeGaussMySqlInstanceSpecification() {
        // basic
        HttpRequestDef.Builder<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeGaussMySqlInstanceSpecificationRequest.class,
                    ChangeGaussMySqlInstanceSpecificationResponse.class)
                .withName("ChangeGaussMySqlInstanceSpecification")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlChangeSpecificationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlChangeSpecificationRequest.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecification =
        genForchangeGaussMySqlProxySpecification();

    private static HttpRequestDef<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> genForchangeGaussMySqlProxySpecification() {
        // basic
        HttpRequestDef.Builder<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeGaussMySqlProxySpecificationRequest.class,
                    ChangeGaussMySqlProxySpecificationResponse.class)
                .withName("ChangeGaussMySqlProxySpecification")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/flavor")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusProxyScaleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusProxyScaleRequest.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackup =
        genForcreateGaussMySqlBackup();

    private static HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> genForcreateGaussMySqlBackup() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGaussMySqlBackupRequest.class, CreateGaussMySqlBackupResponse.class)
            .withName("CreateGaussMySqlBackup")
            .withUri("/v3/{project_id}/backups/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlCreateBackupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateBackupRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> createGaussMySqlConfiguration =
        genForcreateGaussMySqlConfiguration();

    private static HttpRequestDef<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> genForcreateGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlConfigurationRequest.class,
                    CreateGaussMySqlConfigurationResponse.class)
                .withName("CreateGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabase =
        genForcreateGaussMySqlDatabase();

    private static HttpRequestDef<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> genForcreateGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateGaussMySqlDatabaseRequest.class, CreateGaussMySqlDatabaseResponse.class)
                .withName("CreateGaussMySqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateGaussMySqlDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGaussMySqlDatabaseRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUser =
        genForcreateGaussMySqlDatabaseUser();

    private static HttpRequestDef<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> genForcreateGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlDatabaseUserRequest.class,
                    CreateGaussMySqlDatabaseUserResponse.class)
                .withName("CreateGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateDatabaseUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseUserRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstance =
        genForcreateGaussMySqlInstance();

    private static HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> genForcreateGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateGaussMySqlInstanceRequest.class, CreateGaussMySqlInstanceResponse.class)
                .withName("CreateGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlInstanceRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxy =
        genForcreateGaussMySqlProxy();

    private static HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> genForcreateGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGaussMySqlProxyRequest.class, CreateGaussMySqlProxyResponse.class)
            .withName("CreateGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OpenMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenMysqlProxyRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNode =
        genForcreateGaussMySqlReadonlyNode();

    private static HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> genForcreateGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlReadonlyNodeRequest.class,
                    CreateGaussMySqlReadonlyNodeResponse.class)
                .withName("CreateGaussMySqlReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/enlarge")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlCreateReadonlyNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateReadonlyNodeRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> deleteDatabasePermission =
        genFordeleteDatabasePermission();

    private static HttpRequestDef<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> genFordeleteDatabasePermission() {
        // basic
        HttpRequestDef.Builder<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDatabasePermissionRequest.class,
                    DeleteDatabasePermissionResponse.class)
                .withName("DeleteDatabasePermission")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/privilege")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteDatabasePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabasePermissionRequestBody.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackup =
        genFordeleteGaussMySqlBackup();

    private static HttpRequestDef<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> genFordeleteGaussMySqlBackup() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGaussMySqlBackupRequest.class, DeleteGaussMySqlBackupResponse.class)
            .withName("DeleteGaussMySqlBackup")
            .withUri("/v3/{project_id}/backups/{backup_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfiguration =
        genFordeleteGaussMySqlConfiguration();

    private static HttpRequestDef<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> genFordeleteGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlConfigurationRequest.class,
                    DeleteGaussMySqlConfigurationResponse.class)
                .withName("DeleteGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabase =
        genFordeleteGaussMySqlDatabase();

    private static HttpRequestDef<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> genFordeleteGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlDatabaseRequest.class,
                    DeleteGaussMySqlDatabaseResponse.class)
                .withName("DeleteGaussMySqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteGaussMySqlDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteGaussMySqlDatabaseRequestBody.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUser =
        genFordeleteGaussMySqlDatabaseUser();

    private static HttpRequestDef<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> genFordeleteGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlDatabaseUserRequest.class,
                    DeleteGaussMySqlDatabaseUserResponse.class)
                .withName("DeleteGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteDatabaseUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabaseUserRequest.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstance =
        genFordeleteGaussMySqlInstance();

    private static HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> genFordeleteGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlInstanceRequest.class,
                    DeleteGaussMySqlInstanceResponse.class)
                .withName("DeleteGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxy =
        genFordeleteGaussMySqlProxy();

    private static HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> genFordeleteGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGaussMySqlProxyRequest.class, DeleteGaussMySqlProxyResponse.class)
            .withName("DeleteGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CloseMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CloseMysqlProxyRequestBody.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNode =
        genFordeleteGaussMySqlReadonlyNode();

    private static HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> genFordeleteGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlReadonlyNodeRequest.class,
                    DeleteGaussMySqlReadonlyNodeResponse.class)
                .withName("DeleteGaussMySqlReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRecordRequest, DeleteTaskRecordResponse> deleteTaskRecord =
        genFordeleteTaskRecord();

    private static HttpRequestDef<DeleteTaskRecordRequest, DeleteTaskRecordResponse> genFordeleteTaskRecord() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRecordRequest, DeleteTaskRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRecordRequest.class, DeleteTaskRecordResponse.class)
                .withName("DeleteTaskRecord")
                .withUri("/v3/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRecordRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRecordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTaskRecordResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolume =
        genForexpandGaussMySqlInstanceVolume();

    private static HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> genForexpandGaussMySqlInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExpandGaussMySqlInstanceVolumeRequest.class,
                    ExpandGaussMySqlInstanceVolumeResponse.class)
                .withName("ExpandGaussMySqlInstanceVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/volume/extend")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlExtendInstanceVolumeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlExtendInstanceVolumeRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxy =
        genForexpandGaussMySqlProxy();

    private static HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> genForexpandGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandGaussMySqlProxyRequest.class, ExpandGaussMySqlProxyResponse.class)
            .withName("ExpandGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/enlarge")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<EnlargeProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeProxyRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOver =
        genForinvokeGaussMySqlInstanceSwitchOver();

    private static HttpRequestDef<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> genForinvokeGaussMySqlInstanceSwitchOver() {
        // basic
        HttpRequestDef.Builder<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    InvokeGaussMySqlInstanceSwitchOverRequest.class,
                    InvokeGaussMySqlInstanceSwitchOverResponse.class)
                .withName("InvokeGaussMySqlInstanceSwitchOver")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusSwitchoverRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusSwitchoverRequest.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurations =
        genForlistGaussMySqlConfigurations();

    private static HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> genForlistGaussMySqlConfigurations() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlConfigurationsRequest.class,
                    ListGaussMySqlConfigurationsResponse.class)
                .withName("ListGaussMySqlConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> listGaussMySqlDatabase =
        genForlistGaussMySqlDatabase();

    private static HttpRequestDef<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> genForlistGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGaussMySqlDatabaseRequest.class, ListGaussMySqlDatabaseResponse.class)
            .withName("ListGaussMySqlDatabase")
            .withUri("/v3/{project_id}/instances/{instance_id}/databases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsets =
        genForlistGaussMySqlDatabaseCharsets();

    private static HttpRequestDef<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> genForlistGaussMySqlDatabaseCharsets() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDatabaseCharsetsRequest.class,
                    ListGaussMySqlDatabaseCharsetsResponse.class)
                .withName("ListGaussMySqlDatabaseCharsets")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/charsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseCharsetsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseCharsetsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUser =
        genForlistGaussMySqlDatabaseUser();

    private static HttpRequestDef<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> genForlistGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDatabaseUserRequest.class,
                    ListGaussMySqlDatabaseUserResponse.class)
                .withName("ListGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResources =
        genForlistGaussMySqlDedicatedResources();

    private static HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> genForlistGaussMySqlDedicatedResources() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDedicatedResourcesRequest.class,
                    ListGaussMySqlDedicatedResourcesResponse.class)
                .withName("ListGaussMySqlDedicatedResources")
                .withUri("/v3/{project_id}/dedicated-resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfo =
        genForlistGaussMySqlInstanceDetailInfo();

    private static HttpRequestDef<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> genForlistGaussMySqlInstanceDetailInfo() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlInstanceDetailInfoRequest.class,
                    ListGaussMySqlInstanceDetailInfoResponse.class)
                .withName("ListGaussMySqlInstanceDetailInfo")
                .withUri("/v3/{project_id}/instances/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoRequest::getInstanceIds, (req, v) -> {
                req.setInstanceIds(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstances =
        genForlistGaussMySqlInstances();

    private static HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> genForlistGaussMySqlInstances() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGaussMySqlInstancesRequest.class, ListGaussMySqlInstancesResponse.class)
            .withName("ListGaussMySqlInstances")
            .withUri("/v3/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<String>withRequestField("readonly_private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getReadonlyPrivateIp, (req, v) -> {
                req.setReadonlyPrivateIp(v);
            }));
        builder.<String>withRequestField("proxy_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getProxyIp, (req, v) -> {
                req.setProxyIp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImmediateJobsRequest, ListImmediateJobsResponse> listImmediateJobs =
        genForlistImmediateJobs();

    private static HttpRequestDef<ListImmediateJobsRequest, ListImmediateJobsResponse> genForlistImmediateJobs() {
        // basic
        HttpRequestDef.Builder<ListImmediateJobsRequest, ListImmediateJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImmediateJobsRequest.class, ListImmediateJobsResponse.class)
                .withName("ListImmediateJobs")
                .withUri("/v3/{project_id}/immediate-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> listLtsErrorLogDetails =
        genForlistLtsErrorLogDetails();

    private static HttpRequestDef<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> genForlistLtsErrorLogDetails() {
        // basic
        HttpRequestDef.Builder<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLtsErrorLogDetailsRequest.class, ListLtsErrorLogDetailsResponse.class)
            .withName("ListLtsErrorLogDetails")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/error-logs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<LtsLogErrorQueryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsLogErrorQueryRequest.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> listLtsSlowlogDetails =
        genForlistLtsSlowlogDetails();

    private static HttpRequestDef<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> genForlistLtsSlowlogDetails() {
        // basic
        HttpRequestDef.Builder<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLtsSlowlogDetailsRequest.class, ListLtsSlowlogDetailsResponse.class)
            .withName("ListLtsSlowlogDetails")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/slow-logs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<LtsLogSlowQueryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsLogSlowQueryRequest.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduleJobsRequest, ListScheduleJobsResponse> listScheduleJobs =
        genForlistScheduleJobs();

    private static HttpRequestDef<ListScheduleJobsRequest, ListScheduleJobsResponse> genForlistScheduleJobs() {
        // basic
        HttpRequestDef.Builder<ListScheduleJobsRequest, ListScheduleJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduleJobsRequest.class, ListScheduleJobsResponse.class)
                .withName("ListScheduleJobs")
                .withUri("/v3/{project_id}/scheduled-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePassword =
        genForresetGaussMySqlDatabasePassword();

    private static HttpRequestDef<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> genForresetGaussMySqlDatabasePassword() {
        // basic
        HttpRequestDef.Builder<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResetGaussMySqlDatabasePasswordRequest.class,
                    ResetGaussMySqlDatabasePasswordResponse.class)
                .withName("ResetGaussMySqlDatabasePassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ResetDatabasePasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetDatabasePasswordRequest.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPassword =
        genForresetGaussMySqlPassword();

    private static HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> genForresetGaussMySqlPassword() {
        // basic
        HttpRequestDef.Builder<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetGaussMySqlPasswordRequest.class, ResetGaussMySqlPasswordResponse.class)
            .withName("ResetGaussMySqlPassword")
            .withUri("/v3/{project_id}/instances/{instance_id}/password")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlResetPasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlResetPasswordRequest.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> restartGaussMySqlInstance =
        genForrestartGaussMySqlInstance();

    private static HttpRequestDef<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> genForrestartGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RestartGaussMySqlInstanceRequest.class,
                    RestartGaussMySqlInstanceResponse.class)
                .withName("RestartGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/restart")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusRestartInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusRestartInstanceRequest.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> restartGaussMySqlNode =
        genForrestartGaussMySqlNode();

    private static HttpRequestDef<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> genForrestartGaussMySqlNode() {
        // basic
        HttpRequestDef.Builder<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartGaussMySqlNodeRequest.class, RestartGaussMySqlNodeResponse.class)
            .withName("RestartGaussMySqlNode")
            .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/restart")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestartNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestartNodeRequest.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreOldInstanceRequest, RestoreOldInstanceResponse> restoreOldInstance =
        genForrestoreOldInstance();

    private static HttpRequestDef<RestoreOldInstanceRequest, RestoreOldInstanceResponse> genForrestoreOldInstance() {
        // basic
        HttpRequestDef.Builder<RestoreOldInstanceRequest, RestoreOldInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreOldInstanceRequest.class, RestoreOldInstanceResponse.class)
                .withName("RestoreOldInstance")
                .withUri("/v3/{project_id}/instances/restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreOldInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestoreRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestoreRequest.class),
            f -> f.withMarshaller(RestoreOldInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeight =
        genForsetGaussMySqlProxyWeight();

    private static HttpRequestDef<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> genForsetGaussMySqlProxyWeight() {
        // basic
        HttpRequestDef.Builder<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, SetGaussMySqlProxyWeightRequest.class, SetGaussMySqlProxyWeightResponse.class)
                .withName("SetGaussMySqlProxyWeight")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/weight")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusModifyProxyWeightRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusModifyProxyWeightRequest.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotas =
        genForsetGaussMySqlQuotas();

    private static HttpRequestDef<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> genForsetGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetGaussMySqlQuotasRequest.class, SetGaussMySqlQuotasResponse.class)
                .withName("SetGaussMySqlQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(SetGaussMySqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLog = genForshowAuditLog();

    private static HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> genForshowAuditLog() {
        // basic
        HttpRequestDef.Builder<ShowAuditLogRequest, ShowAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditLogRequest.class, ShowAuditLogResponse.class)
                .withName("ShowAuditLog")
                .withUri("/v3/{project_id}/instance/{instance_id}/audit-log/switch-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> showBackupRestoreTime =
        genForshowBackupRestoreTime();

    private static HttpRequestDef<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> genForshowBackupRestoreTime() {
        // basic
        HttpRequestDef.Builder<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackupRestoreTimeRequest.class, ShowBackupRestoreTimeResponse.class)
            .withName("ShowBackupRestoreTime")
            .withUri("/v3/{project_id}/instances/{instance_id}/restore-time")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> showDedicatedResourceInfo =
        genForshowDedicatedResourceInfo();

    private static HttpRequestDef<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> genForshowDedicatedResourceInfo() {
        // basic
        HttpRequestDef.Builder<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDedicatedResourceInfoRequest.class,
                    ShowDedicatedResourceInfoResponse.class)
                .withName("ShowDedicatedResourceInfo")
                .withUri("/v3/{project_id}/dedicated-resource/{dedicated_resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedResourceInfoRequest::getDedicatedResourceId, (req, v) -> {
                req.setDedicatedResourceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedResourceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupList =
        genForshowGaussMySqlBackupList();

    private static HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> genForshowGaussMySqlBackupList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowGaussMySqlBackupListRequest.class, ShowGaussMySqlBackupListResponse.class)
                .withName("ShowGaussMySqlBackupList")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicy =
        genForshowGaussMySqlBackupPolicy();

    private static HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> genForshowGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlBackupPolicyRequest.class,
                    ShowGaussMySqlBackupPolicyResponse.class)
                .withName("ShowGaussMySqlBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> showGaussMySqlConfiguration =
        genForshowGaussMySqlConfiguration();

    private static HttpRequestDef<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> genForshowGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlConfigurationRequest.class,
                    ShowGaussMySqlConfigurationResponse.class)
                .withName("ShowGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersion =
        genForshowGaussMySqlEngineVersion();

    private static HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> genForshowGaussMySqlEngineVersion() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlEngineVersionRequest.class,
                    ShowGaussMySqlEngineVersionResponse.class)
                .withName("ShowGaussMySqlEngineVersion")
                .withUri("/v3/{project_id}/datastores/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlEngineVersionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlEngineVersionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavors =
        genForshowGaussMySqlFlavors();

    private static HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> genForshowGaussMySqlFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlFlavorsRequest.class, ShowGaussMySqlFlavorsResponse.class)
            .withName("ShowGaussMySqlFlavors")
            .withUri("/v3/{project_id}/flavors/{database_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            }));
        builder.<String>withRequestField("availability_zone_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getAvailabilityZoneMode, (req, v) -> {
                req.setAvailabilityZoneMode(v);
            }));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfo =
        genForshowGaussMySqlInstanceInfo();

    private static HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> genForshowGaussMySqlInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlInstanceInfoRequest.class,
                    ShowGaussMySqlInstanceInfoResponse.class)
                .withName("ShowGaussMySqlInstanceInfo")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfo =
        genForshowGaussMySqlJobInfo();

    private static HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> genForshowGaussMySqlJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlJobInfoRequest.class, ShowGaussMySqlJobInfoResponse.class)
            .withName("ShowGaussMySqlJobInfo")
            .withUri("/v3/{project_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlJobInfoRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlJobInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotas =
        genForshowGaussMySqlProjectQuotas();

    private static HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> genForshowGaussMySqlProjectQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlProjectQuotasRequest.class,
                    ShowGaussMySqlProjectQuotasResponse.class)
                .withName("ShowGaussMySqlProjectQuotas")
                .withUri("/v3/{project_id}/project-quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowGaussMySqlProjectQuotasRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowGaussMySqlProjectQuotasRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowGaussMySqlProjectQuotasRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProjectQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavors =
        genForshowGaussMySqlProxyFlavors();

    private static HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> genForshowGaussMySqlProxyFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlProxyFlavorsRequest.class,
                    ShowGaussMySqlProxyFlavorsResponse.class)
                .withName("ShowGaussMySqlProxyFlavors")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyList =
        genForshowGaussMySqlProxyList();

    private static HttpRequestDef<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> genForshowGaussMySqlProxyList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlProxyListRequest.class, ShowGaussMySqlProxyListResponse.class)
            .withName("ShowGaussMySqlProxyList")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotas =
        genForshowGaussMySqlQuotas();

    private static HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> genForshowGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlQuotasRequest.class, ShowGaussMySqlQuotasResponse.class)
            .withName("ShowGaussMySqlQuotas")
            .withUri("/v3/{project_id}/quotas")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getEnterpriseProjectName, (req, v) -> {
                req.setEnterpriseProjectName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtend =
        genForshowInstanceMonitorExtend();

    private static HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> genForshowInstanceMonitorExtend() {
        // basic
        HttpRequestDef.Builder<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceMonitorExtendRequest.class,
                    ShowInstanceMonitorExtendResponse.class)
                .withName("ShowInstanceMonitorExtend")
                .withUri("/v3/{project_id}/instances/{instance_id}/monitor-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfiguration =
        genForswitchGaussMySqlConfiguration();

    private static HttpRequestDef<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> genForswitchGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchGaussMySqlConfigurationRequest.class,
                    SwitchGaussMySqlConfigurationResponse.class)
                .withName("SwitchGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/apply")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSsl =
        genForswitchGaussMySqlInstanceSsl();

    private static HttpRequestDef<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> genForswitchGaussMySqlInstanceSsl() {
        // basic
        HttpRequestDef.Builder<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchGaussMySqlInstanceSslRequest.class,
                    SwitchGaussMySqlInstanceSslResponse.class)
                .withName("SwitchGaussMySqlInstanceSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl-option")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SwitchSSLRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSSLRequest.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLog =
        genForupdateAuditLog();

    private static HttpRequestDef<UpdateAuditLogRequest, UpdateAuditLogResponse> genForupdateAuditLog() {
        // basic
        HttpRequestDef.Builder<UpdateAuditLogRequest, UpdateAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAuditLogRequest.class, UpdateAuditLogResponse.class)
                .withName("UpdateAuditLog")
                .withUri("/v3/{project_id}/instance/{instance_id}/audit-log/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OperateAuditLogRequestV3Body>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateAuditLogRequestV3Body.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicy =
        genForupdateGaussMySqlBackupPolicy();

    private static HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> genForupdateGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlBackupPolicyRequest.class,
                    UpdateGaussMySqlBackupPolicyResponse.class)
                .withName("UpdateGaussMySqlBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlUpdateBackupPolicyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateBackupPolicyRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfiguration =
        genForupdateGaussMySqlConfiguration();

    private static HttpRequestDef<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> genForupdateGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlConfigurationRequest.class,
                    UpdateGaussMySqlConfigurationResponse.class)
                .withName("UpdateGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateConfigurationParameterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationParameterRequestBody.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseComment =
        genForupdateGaussMySqlDatabaseComment();

    private static HttpRequestDef<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> genForupdateGaussMySqlDatabaseComment() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlDatabaseCommentRequest.class,
                    UpdateGaussMySqlDatabaseCommentResponse.class)
                .withName("UpdateGaussMySqlDatabaseComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/comment")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDatabaseCommentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseCommentRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserComment =
        genForupdateGaussMySqlDatabaseUserComment();

    private static HttpRequestDef<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> genForupdateGaussMySqlDatabaseUserComment() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlDatabaseUserCommentRequest.class,
                    UpdateGaussMySqlDatabaseUserCommentResponse.class)
                .withName("UpdateGaussMySqlDatabaseUserComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/comment")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDatabaseUserCommentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseUserCommentRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAlias =
        genForupdateGaussMySqlInstanceAlias();

    private static HttpRequestDef<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> genForupdateGaussMySqlInstanceAlias() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceAliasRequest.class,
                    UpdateGaussMySqlInstanceAliasResponse.class)
                .withName("UpdateGaussMySqlInstanceAlias")
                .withUri("/v3/{project_id}/instances/{instance_id}/alias")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyAliasRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyAliasRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEip =
        genForupdateGaussMySqlInstanceEip();

    private static HttpRequestDef<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> genForupdateGaussMySqlInstanceEip() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceEipRequest.class,
                    UpdateGaussMySqlInstanceEipResponse.class)
                .withName("UpdateGaussMySqlInstanceEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips/bind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyBindEipRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyBindEipRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIp =
        genForupdateGaussMySqlInstanceInternalIp();

    private static HttpRequestDef<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> genForupdateGaussMySqlInstanceInternalIp() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceInternalIpRequest.class,
                    UpdateGaussMySqlInstanceInternalIpResponse.class)
                .withName("UpdateGaussMySqlInstanceInternalIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/internal-ip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyInternalIpRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyInternalIpRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceName =
        genForupdateGaussMySqlInstanceName();

    private static HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> genForupdateGaussMySqlInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceNameRequest.class,
                    UpdateGaussMySqlInstanceNameResponse.class)
                .withName("UpdateGaussMySqlInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlUpdateInstanceNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateInstanceNameRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindow =
        genForupdateGaussMySqlInstanceOpsWindow();

    private static HttpRequestDef<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> genForupdateGaussMySqlInstanceOpsWindow() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceOpsWindowRequest.class,
                    UpdateGaussMySqlInstanceOpsWindowResponse.class)
                .withName("UpdateGaussMySqlInstanceOpsWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/ops-window")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyOpsWindow>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOpsWindow.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePort =
        genForupdateGaussMySqlInstancePort();

    private static HttpRequestDef<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> genForupdateGaussMySqlInstancePort() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstancePortRequest.class,
                    UpdateGaussMySqlInstancePortResponse.class)
                .withName("UpdateGaussMySqlInstancePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/port")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyPortRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPortRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroup =
        genForupdateGaussMySqlInstanceSecurityGroup();

    private static HttpRequestDef<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> genForupdateGaussMySqlInstanceSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceSecurityGroupRequest.class,
                    UpdateGaussMySqlInstanceSecurityGroupResponse.class)
                .withName("UpdateGaussMySqlInstanceSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifySecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifySecurityGroupRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotas =
        genForupdateGaussMySqlQuotas();

    private static HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> genForupdateGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGaussMySqlQuotasRequest.class, UpdateGaussMySqlQuotasResponse.class)
            .withName("UpdateGaussMySqlQuotas")
            .withUri("/v3/{project_id}/quotas")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(UpdateGaussMySqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitor =
        genForupdateInstanceMonitor();

    private static HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> genForupdateInstanceMonitor() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceMonitorRequest.class, UpdateInstanceMonitorResponse.class)
            .withName("UpdateInstanceMonitor")
            .withUri("/v3/{project_id}/instances/{instance_id}/monitor-policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusModifyInstanceMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusModifyInstanceMonitorRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolType =
        genForupdateProxyConnectionPoolType();

    private static HttpRequestDef<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> genForupdateProxyConnectionPoolType() {
        // basic
        HttpRequestDef.Builder<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxyConnectionPoolTypeRequest.class,
                    UpdateProxyConnectionPoolTypeResponse.class)
                .withName("UpdateProxyConnectionPoolType")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/connection-pool-type")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ProxyUpdateProxyConnectionPoolTypeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyUpdateProxyConnectionPoolTypeRequest.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> updateProxySessionConsistence =
        genForupdateProxySessionConsistence();

    private static HttpRequestDef<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> genForupdateProxySessionConsistence() {
        // basic
        HttpRequestDef.Builder<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxySessionConsistenceRequest.class,
                    UpdateProxySessionConsistenceResponse.class)
                .withName("UpdateProxySessionConsistence")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/session-consistence")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyProxyConsistRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyProxyConsistRequest.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> updateTransactionSplitStatus =
        genForupdateTransactionSplitStatus();

    private static HttpRequestDef<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> genForupdateTransactionSplitStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateTransactionSplitStatusRequest.class,
                    UpdateTransactionSplitStatusResponse.class)
                .withName("UpdateTransactionSplitStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/transaction-split")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ProxyTransactionSplitRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyTransactionSplitRequest.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabase =
        genForupgradeGaussMySqlInstanceDatabase();

    private static HttpRequestDef<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> genForupgradeGaussMySqlInstanceDatabase() {
        // basic
        HttpRequestDef.Builder<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpgradeGaussMySqlInstanceDatabaseRequest.class,
                    UpgradeGaussMySqlInstanceDatabaseResponse.class)
                .withName("UpgradeGaussMySqlInstanceDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpgradeDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeDatabaseRequest.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> deleteSqlFilterRule =
        genFordeleteSqlFilterRule();

    private static HttpRequestDef<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> genFordeleteSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSqlFilterRuleRequest.class, DeleteSqlFilterRuleResponse.class)
            .withName("DeleteSqlFilterRule")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteSqlFilterRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSqlFilterRuleReq.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> setSqlFilterRule =
        genForsetSqlFilterRule();

    private static HttpRequestDef<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> genForsetSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetSqlFilterRuleRequest.class, SetSqlFilterRuleResponse.class)
                .withName("SetSqlFilterRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OperateSqlFilterRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateSqlFilterRuleReq.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> showSqlFilterControl =
        genForshowSqlFilterControl();

    private static HttpRequestDef<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> genForshowSqlFilterControl() {
        // basic
        HttpRequestDef.Builder<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSqlFilterControlRequest.class, ShowSqlFilterControlResponse.class)
            .withName("ShowSqlFilterControl")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterControlRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterControlRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> showSqlFilterRule =
        genForshowSqlFilterRule();

    private static HttpRequestDef<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> genForshowSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlFilterRuleRequest.class, ShowSqlFilterRuleResponse.class)
                .withName("ShowSqlFilterRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> updateSqlFilterControl =
        genForupdateSqlFilterControl();

    private static HttpRequestDef<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> genForupdateSqlFilterControl() {
        // basic
        HttpRequestDef.Builder<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSqlFilterControlRequest.class, UpdateSqlFilterControlResponse.class)
            .withName("UpdateSqlFilterControl")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/switch")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OperateSqlFilterControlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateSqlFilterControlReq.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

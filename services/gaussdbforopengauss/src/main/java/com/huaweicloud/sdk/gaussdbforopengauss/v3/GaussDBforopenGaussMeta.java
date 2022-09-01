package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.*;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class GaussDBforopenGaussMeta {

    public static final HttpRequestDef<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> allowDbPrivileges = genForallowDbPrivileges();

    private static HttpRequestDef<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> genForallowDbPrivileges() {
        // basic
        HttpRequestDef.Builder<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AllowDbPrivilegesRequest.class, AllowDbPrivilegesResponse.class)
                .withName("AllowDbPrivileges")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-privilege")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbPrivilegesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbPrivilegesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<GaussDBforOpenGaussGrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenGaussGrantRequest.class),
            f -> f.withMarshaller(AllowDbPrivilegesRequest::getBody, (req, v) -> {
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<GaussDBforOpenDatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenDatabaseForCreation.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> createDatabaseSchemas = genForcreateDatabaseSchemas();

    private static HttpRequestDef<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> genForcreateDatabaseSchemas() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseSchemasRequest.class, CreateDatabaseSchemasResponse.class)
                .withName("CreateDatabaseSchemas")
                .withUri("/v3/{project_id}/instances/{instance_id}/schema")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseSchemasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseSchemasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<GaussDBforOpenGaussDatabaseSchemaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenGaussDatabaseSchemaReq.class),
            f -> f.withMarshaller(CreateDatabaseSchemasRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<GaussDBforOpenGaussUserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GaussDBforOpenGaussUserForCreation.class),
            f -> f.withMarshaller(CreateDbUserRequest::getBody, (req, v) -> {
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpenGaussInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussInstanceRequest.class),
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManualBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<CreateManualBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManualBackupRequestBody.class),
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateRestoreInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRestoreInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpengaussRestoreInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpengaussRestoreInstanceRequest.class),
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getBody, (req, v) -> {
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
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
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
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getXLanguage, (req, v) -> {
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
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<ListBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
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
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListComponentInfosRequest, ListComponentInfosResponse> listComponentInfos = genForlistComponentInfos();

    private static HttpRequestDef<ListComponentInfosRequest, ListComponentInfosResponse> genForlistComponentInfos() {
        // basic
        HttpRequestDef.Builder<ListComponentInfosRequest, ListComponentInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListComponentInfosRequest.class, ListComponentInfosResponse.class)
                .withName("ListComponentInfos")
                .withUri("/v3/{project_id}/instances/{instance_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInfosRequest::getXLanguage, (req, v) -> {
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
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListConfigurationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConfigurationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> listDatabaseSchemas = genForlistDatabaseSchemas();

    private static HttpRequestDef<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> genForlistDatabaseSchemas() {
        // basic
        HttpRequestDef.Builder<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseSchemasRequest.class, ListDatabaseSchemasResponse.class)
                .withName("ListDatabaseSchemas")
                .withUri("/v3/{project_id}/instances/{instance_id}/schemas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseSchemasRequest::getXLanguage, (req, v) -> {
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
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getXLanguage, (req, v) -> {
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
                .withUri("/v3/{project_id}/datastore/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatastoresRequest::getXLanguage, (req, v) -> {
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
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, (req, v) -> {
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
                .withUri("/v3/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            })
        );
        builder.<String>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getHaMode, (req, v) -> {
                req.setHaMode(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
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
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<ListInstancesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<ListInstancesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            })
        );
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getXLanguage, (req, v) -> {
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
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getDate, (req, v) -> {
                req.setDate(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getXLanguage, (req, v) -> {
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
                .withUri("/v3/{project_id}/storage-type")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );
        builder.<ListStorageTypesRequest.HaModeEnum>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStorageTypesRequest.HaModeEnum.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getHaMode, (req, v) -> {
                req.setHaMode(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getXLanguage, (req, v) -> {
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<PwdResetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PwdResetRequest.class),
            f -> f.withMarshaller(ResetPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> resizeInstanceFlavor = genForresizeInstanceFlavor();

    private static HttpRequestDef<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> genForresizeInstanceFlavor() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeInstanceFlavorRequest.class, ResizeInstanceFlavorResponse.class)
                .withName("ResizeInstanceFlavor")
                .withUri("/v3/{project_id}/instance/{instance_id}/flavor")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceFlavorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceFlavorRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpenGaussResizeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussResizeRequest.class),
            f -> f.withMarshaller(ResizeInstanceFlavorRequest::getBody, (req, v) -> {
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
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<RestartInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestartInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(RestartInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunInstanceActionRequest, RunInstanceActionResponse> runInstanceAction = genForrunInstanceAction();

    private static HttpRequestDef<RunInstanceActionRequest, RunInstanceActionResponse> genForrunInstanceAction() {
        // basic
        HttpRequestDef.Builder<RunInstanceActionRequest, RunInstanceActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunInstanceActionRequest.class, RunInstanceActionResponse.class)
                .withName("RunInstanceAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunInstanceActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunInstanceActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpenGaussInstanceActionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussInstanceActionRequest.class),
            f -> f.withMarshaller(RunInstanceActionRequest::getBody, (req, v) -> {
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<SetBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, (req, v) -> {
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
            HttpRequestDef.builder(HttpMethod.PUT, SetDbUserPwdRequest.class, SetDbUserPwdResponse.class)
                .withName("SetDbUserPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<SetDbUserPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetDbUserPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<DbUserPwdRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPwdRequest.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getBody, (req, v) -> {
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
                .withName("ShowBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getXLanguage, (req, v) -> {
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
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<SwitchShardRequest, SwitchShardResponse> switchShard = genForswitchShard();

    private static HttpRequestDef<SwitchShardRequest, SwitchShardResponse> genForswitchShard() {
        // basic
        HttpRequestDef.Builder<SwitchShardRequest, SwitchShardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchShardRequest.class, SwitchShardResponse.class)
                .withName("SwitchShard")
                .withUri("/v3/{project_id}/instances/{instance_id}/switch-shard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchShardRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<SwitchShardRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchShardRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SwitchShardRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<SwitchShardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchShardRequestBody.class),
            f -> f.withMarshaller(SwitchShardRequest::getBody, (req, v) -> {
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpenGaussModifyInstanceConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussModifyInstanceConfigurationRequest.class),
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
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<UpdateNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNameRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

}

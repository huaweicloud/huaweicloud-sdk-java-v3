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

    public static final HttpRequestDef<AddInstanceTagsRequest, AddInstanceTagsResponse> addInstanceTags = genForaddInstanceTags();

    private static HttpRequestDef<AddInstanceTagsRequest, AddInstanceTagsResponse> genForaddInstanceTags() {
        // basic
        HttpRequestDef.Builder<AddInstanceTagsRequest, AddInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddInstanceTagsRequest.class, AddInstanceTagsResponse.class)
                .withName("AddInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<AddInstanceTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddInstanceTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(AddInstanceTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<AddTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTagsRequestBody.class),
            f -> f.withMarshaller(AddInstanceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

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

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForattachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForattachEip() {
        // basic
        HttpRequestDef.Builder<AttachEipRequest, AttachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachEipRequest.class, AttachEipResponse.class)
                .withName("AttachEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/public-ip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEipRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEipRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<AttachEipRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AttachEipRequest.XLanguageEnum.class),
            f -> f.withMarshaller(AttachEipRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<BindEIPRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEIPRequestBody.class),
            f -> f.withMarshaller(AttachEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> copyConfiguration = genForcopyConfiguration();

    private static HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> genForcopyConfiguration() {
        // basic
        HttpRequestDef.Builder<CopyConfigurationRequest, CopyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyConfigurationRequest.class, CopyConfigurationResponse.class)
                .withName("CopyConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<CopyConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CopyConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<ParamGroupCopyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParamGroupCopyRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> createConfigurationTemplate = genForcreateConfigurationTemplate();

    private static HttpRequestDef<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> genForcreateConfigurationTemplate() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigurationTemplateRequest.class, CreateConfigurationTemplateResponse.class)
                .withName("CreateConfigurationTemplate")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateConfigurationTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateConfigurationTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateConfigurationTemplateRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<CreateConfigurationTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationTemplateRequestBody.class),
            f -> f.withMarshaller(CreateConfigurationTemplateRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<CreateDbInstanceRequest, CreateDbInstanceResponse> createDbInstance = genForcreateDbInstance();

    private static HttpRequestDef<CreateDbInstanceRequest, CreateDbInstanceResponse> genForcreateDbInstance() {
        // basic
        HttpRequestDef.Builder<CreateDbInstanceRequest, CreateDbInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbInstanceRequest.class, CreateDbInstanceResponse.class)
                .withName("CreateDbInstance")
                .withUri("/v3.1/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpenGaussInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenGaussInstanceRequestBody.class),
            f -> f.withMarshaller(CreateDbInstanceRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration = genFordeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genFordeleteConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationRequest, DeleteConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfigurationRequest.class, DeleteConfigurationResponse.class)
                .withName("DeleteConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<DeleteConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteConfigurationRequest.XLanguageEnum.class),
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

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v3/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.<DeleteJobRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteJobRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteJobRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ListApplicableInstancesRequest, ListApplicableInstancesResponse> listApplicableInstances = genForlistApplicableInstances();

    private static HttpRequestDef<ListApplicableInstancesRequest, ListApplicableInstancesResponse> genForlistApplicableInstances() {
        // basic
        HttpRequestDef.Builder<ListApplicableInstancesRequest, ListApplicableInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicableInstancesRequest.class, ListApplicableInstancesResponse.class)
                .withName("ListApplicableInstances")
                .withUri("/v3/{project_id}/configurations/{config_id}/applicable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListApplicableInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplicableInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListApplicableInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> listAppliedHistories = genForlistAppliedHistories();

    private static HttpRequestDef<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> genForlistAppliedHistories() {
        // basic
        HttpRequestDef.Builder<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppliedHistoriesRequest.class, ListAppliedHistoriesResponse.class)
                .withName("ListAppliedHistories")
                .withUri("/v3/{project_id}/configurations/{config_id}/applied-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListAppliedHistoriesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAppliedHistoriesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAppliedHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> listAvailableFlavors = genForlistAvailableFlavors();

    private static HttpRequestDef<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> genForlistAvailableFlavors() {
        // basic
        HttpRequestDef.Builder<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableFlavorsRequest.class, ListAvailableFlavorsResponse.class)
                .withName("ListAvailableFlavors")
                .withUri("/v3/{project_id}/instances/{instance_id}/available-flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListAvailableFlavorsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAvailableFlavorsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListAvailableFlavorsRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ListBindedEipsRequest, ListBindedEipsResponse> listBindedEips = genForlistBindedEips();

    private static HttpRequestDef<ListBindedEipsRequest, ListBindedEipsResponse> genForlistBindedEips() {
        // basic
        HttpRequestDef.Builder<ListBindedEipsRequest, ListBindedEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBindedEipsRequest.class, ListBindedEipsResponse.class)
                .withName("ListBindedEips")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListBindedEipsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBindedEipsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListBindedEipsRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> listConfigurationsDiff = genForlistConfigurationsDiff();

    private static HttpRequestDef<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> genForlistConfigurationsDiff() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListConfigurationsDiffRequest.class, ListConfigurationsDiffResponse.class)
                .withName("ListConfigurationsDiff")
                .withUri("/v3/{project_id}/configurations/comparison")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListConfigurationsDiffRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConfigurationsDiffRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListConfigurationsDiffRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<ParamGroupDiffRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParamGroupDiffRequestBody.class),
            f -> f.withMarshaller(ListConfigurationsDiffRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<ListDbBackupsRequest, ListDbBackupsResponse> listDbBackups = genForlistDbBackups();

    private static HttpRequestDef<ListDbBackupsRequest, ListDbBackupsResponse> genForlistDbBackups() {
        // basic
        HttpRequestDef.Builder<ListDbBackupsRequest, ListDbBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbBackupsRequest.class, ListDbBackupsResponse.class)
                .withName("ListDbBackups")
                .withUri("/v3.1/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<ListDbBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDbBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbBackupsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListDbFlavorsRequest, ListDbFlavorsResponse> listDbFlavors = genForlistDbFlavors();

    private static HttpRequestDef<ListDbFlavorsRequest, ListDbFlavorsResponse> genForlistDbFlavors() {
        // basic
        HttpRequestDef.Builder<ListDbFlavorsRequest, ListDbFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbFlavorsRequest.class, ListDbFlavorsResponse.class)
                .withName("ListDbFlavors")
                .withUri("/v3.1/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            })
        );
        builder.<String>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getHaMode, (req, v) -> {
                req.setHaMode(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbFlavorsRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotas = genForlistEpsQuotas();

    private static HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> genForlistEpsQuotas() {
        // basic
        HttpRequestDef.Builder<ListEpsQuotasRequest, ListEpsQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEpsQuotasRequest.class, ListEpsQuotasResponse.class)
                .withName("ListEpsQuotas")
                .withUri("/v3/{project_id}/enterprise-projects/quotas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.<ListEpsQuotasRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEpsQuotasRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> listGaussDbDatastores = genForlistGaussDbDatastores();

    private static HttpRequestDef<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> genForlistGaussDbDatastores() {
        // basic
        HttpRequestDef.Builder<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGaussDbDatastoresRequest.class, ListGaussDbDatastoresResponse.class)
                .withName("ListGaussDbDatastores")
                .withUri("/v3/{project_id}/datastores")
                .withContentType("application/json");

        // requests
        builder.<ListGaussDbDatastoresRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListGaussDbDatastoresRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListGaussDbDatastoresRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOperationsRequest, ListHistoryOperationsResponse> listHistoryOperations = genForlistHistoryOperations();

    private static HttpRequestDef<ListHistoryOperationsRequest, ListHistoryOperationsResponse> genForlistHistoryOperations() {
        // basic
        HttpRequestDef.Builder<ListHistoryOperationsRequest, ListHistoryOperationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistoryOperationsRequest.class, ListHistoryOperationsResponse.class)
                .withName("ListHistoryOperations")
                .withUri("/v3/{project_id}/configurations/{config_id}/histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListHistoryOperationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHistoryOperationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListHistoryOperationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetails = genForlistInstancesDetails();

    private static HttpRequestDef<ListInstancesDetailsRequest, ListInstancesDetailsResponse> genForlistInstancesDetails() {
        // basic
        HttpRequestDef.Builder<ListInstancesDetailsRequest, ListInstancesDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesDetailsRequest.class, ListInstancesDetailsResponse.class)
                .withName("ListInstancesDetails")
                .withUri("/v3.1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<ListInstancesDetailsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<ListInstancesDetailsRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            })
        );
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> listParamGroupTemplates = genForlistParamGroupTemplates();

    private static HttpRequestDef<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> genForlistParamGroupTemplates() {
        // basic
        HttpRequestDef.Builder<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListParamGroupTemplatesRequest.class, ListParamGroupTemplatesResponse.class)
                .withName("ListParamGroupTemplates")
                .withUri("/v3.1/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParamGroupTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParamGroupTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListParamGroupTemplatesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListParamGroupTemplatesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListParamGroupTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListPredefinedTagsRequest, ListPredefinedTagsResponse> listPredefinedTags = genForlistPredefinedTags();

    private static HttpRequestDef<ListPredefinedTagsRequest, ListPredefinedTagsResponse> genForlistPredefinedTags() {
        // basic
        HttpRequestDef.Builder<ListPredefinedTagsRequest, ListPredefinedTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPredefinedTagsRequest.class, ListPredefinedTagsResponse.class)
                .withName("ListPredefinedTags")
                .withUri("/v3/{project_id}/predefined-tags")
                .withContentType("application/json");

        // requests
        builder.<ListPredefinedTagsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPredefinedTagsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPredefinedTagsRequest::getXLanguage, (req, v) -> {
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
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstances = genForlistRecycleInstances();

    private static HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> genForlistRecycleInstances() {
        // basic
        HttpRequestDef.Builder<ListRecycleInstancesRequest, ListRecycleInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecycleInstancesRequest.class, ListRecycleInstancesResponse.class)
                .withName("ListRecycleInstances")
                .withUri("/v3/{project_id}/recycle-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ListRecycleInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRecycleInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListRestorableInstancesRequest, ListRestorableInstancesResponse> listRestorableInstances = genForlistRestorableInstances();

    private static HttpRequestDef<ListRestorableInstancesRequest, ListRestorableInstancesResponse> genForlistRestorableInstances() {
        // basic
        HttpRequestDef.Builder<ListRestorableInstancesRequest, ListRestorableInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestorableInstancesRequest.class, ListRestorableInstancesResponse.class)
                .withName("ListRestorableInstances")
                .withUri("/v3/{project_id}/restorable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getSourceInstanceId, (req, v) -> {
                req.setSourceInstanceId(v);
            })
        );
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getRestoreTime, (req, v) -> {
                req.setRestoreTime(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestorableInstancesRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForlistTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForlistTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v3/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<ListTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.<ListTasksRequest.NameEnum>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.NameEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> modifyEpsQuota = genFormodifyEpsQuota();

    private static HttpRequestDef<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> genFormodifyEpsQuota() {
        // basic
        HttpRequestDef.Builder<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyEpsQuotaRequest.class, ModifyEpsQuotaResponse.class)
                .withName("ModifyEpsQuota")
                .withUri("/v3/{project_id}/enterprise-projects/quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ModifyEpsQuotaRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyEpsQuotaRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ModifyEpsQuotaRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<ModifyEpsQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyEpsQuotaRequestBody.class),
            f -> f.withMarshaller(ModifyEpsQuotaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ResetConfigurationRequest, ResetConfigurationResponse> resetConfiguration = genForresetConfiguration();

    private static HttpRequestDef<ResetConfigurationRequest, ResetConfigurationResponse> genForresetConfiguration() {
        // basic
        HttpRequestDef.Builder<ResetConfigurationRequest, ResetConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetConfigurationRequest.class, ResetConfigurationResponse.class)
                .withName("ResetConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<ResetConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ResetConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetConfigurationResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

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
        builder.<SetBackupPolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequest.XLanguageEnum.class),
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

    public static final HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicy = genForsetRecyclePolicy();

    private static HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> genForsetRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<SetRecyclePolicyRequest, SetRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRecyclePolicyRequest.class, SetRecyclePolicyResponse.class)
                .withName("SetRecyclePolicy")
                .withUri("/v3/{project_id}/recycle-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RecyclePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecyclePolicyRequestBody.class),
            f -> f.withMarshaller(SetRecyclePolicyRequest::getBody, (req, v) -> {
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
        builder.<ShowBackupPolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowBackupPolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowBalanceStatusRequest, ShowBalanceStatusResponse> showBalanceStatus = genForshowBalanceStatus();

    private static HttpRequestDef<ShowBalanceStatusRequest, ShowBalanceStatusResponse> genForshowBalanceStatus() {
        // basic
        HttpRequestDef.Builder<ShowBalanceStatusRequest, ShowBalanceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBalanceStatusRequest.class, ShowBalanceStatusResponse.class)
                .withName("ShowBalanceStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/balance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBalanceStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBalanceStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetail = genForshowConfigurationDetail();

    private static HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> genForshowConfigurationDetail() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigurationDetailRequest.class, ShowConfigurationDetailResponse.class)
                .withName("ShowConfigurationDetail")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<ShowConfigurationDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowConfigurationDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentFormRequest, ShowDeploymentFormResponse> showDeploymentForm = genForshowDeploymentForm();

    private static HttpRequestDef<ShowDeploymentFormRequest, ShowDeploymentFormResponse> genForshowDeploymentForm() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentFormRequest, ShowDeploymentFormResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentFormRequest.class, ShowDeploymentFormResponse.class)
                .withName("ShowDeploymentForm")
                .withUri("/v3/{project_id}/deployment-form")
                .withContentType("application/json");

        // requests
        builder.<ShowDeploymentFormRequest.SolutionEnum>withRequestField("solution",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDeploymentFormRequest.SolutionEnum.class),
            f -> f.withMarshaller(ShowDeploymentFormRequest::getSolution, (req, v) -> {
                req.setSolution(v);
            })
        );
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentFormRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentFormRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ShowInstanceDiskRequest, ShowInstanceDiskResponse> showInstanceDisk = genForshowInstanceDisk();

    private static HttpRequestDef<ShowInstanceDiskRequest, ShowInstanceDiskResponse> genForshowInstanceDisk() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDiskRequest, ShowInstanceDiskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceDiskRequest.class, ShowInstanceDiskResponse.class)
                .withName("ShowInstanceDisk")
                .withUri("/v3/{project_id}/instances/{instance_id}/volume-usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDiskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDiskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> showInstanceParamGroup = genForshowInstanceParamGroup();

    private static HttpRequestDef<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> genForshowInstanceParamGroup() {
        // basic
        HttpRequestDef.Builder<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceParamGroupRequest.class, ShowInstanceParamGroupResponse.class)
                .withName("ShowInstanceParamGroup")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceParamGroupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> showInstanceSnapshot = genForshowInstanceSnapshot();

    private static HttpRequestDef<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> genForshowInstanceSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceSnapshotRequest.class, ShowInstanceSnapshotResponse.class)
                .withName("ShowInstanceSnapshot")
                .withUri("/v3/{project_id}/instance-snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getRestoreTime, (req, v) -> {
                req.setRestoreTime(v);
            })
        );
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<ShowInstanceSnapshotRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowInstanceSnapshotRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowInstanceSnapshotRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail = genForshowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForshowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectQuotasRequest, ShowProjectQuotasResponse> showProjectQuotas = genForshowProjectQuotas();

    private static HttpRequestDef<ShowProjectQuotasRequest, ShowProjectQuotasResponse> genForshowProjectQuotas() {
        // basic
        HttpRequestDef.Builder<ShowProjectQuotasRequest, ShowProjectQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectQuotasRequest.class, ShowProjectQuotasResponse.class)
                .withName("ShowProjectQuotas")
                .withUri("/v3/{project_id}/project-quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowProjectQuotasRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowProjectQuotasRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowProjectQuotasRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicy = genForshowRecyclePolicy();

    private static HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> genForshowRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecyclePolicyRequest.class, ShowRecyclePolicyResponse.class)
                .withName("ShowRecyclePolicy")
                .withUri("/v3/{project_id}/recycle-policy")
                .withContentType("application/json");

        // requests
        builder.<ShowRecyclePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowRecyclePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowRecyclePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> showSslCertDownloadLink = genForshowSslCertDownloadLink();

    private static HttpRequestDef<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> genForshowSslCertDownloadLink() {
        // basic
        HttpRequestDef.Builder<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSslCertDownloadLinkRequest.class, ShowSslCertDownloadLinkResponse.class)
                .withName("ShowSslCertDownloadLink")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl-cert/download-link")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSslCertDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<ShowSslCertDownloadLinkRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSslCertDownloadLinkRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSslCertDownloadLinkRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfiguration = genForswitchConfiguration();

    private static HttpRequestDef<SwitchConfigurationRequest, SwitchConfigurationResponse> genForswitchConfiguration() {
        // basic
        HttpRequestDef.Builder<SwitchConfigurationRequest, SwitchConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchConfigurationRequest.class, SwitchConfigurationResponse.class)
                .withName("SwitchConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<SwitchConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> validateParaGroupName = genForvalidateParaGroupName();

    private static HttpRequestDef<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> genForvalidateParaGroupName() {
        // basic
        HttpRequestDef.Builder<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ValidateParaGroupNameRequest.class, ValidateParaGroupNameResponse.class)
                .withName("ValidateParaGroupName")
                .withUri("/v3/{project_id}/configurations/name-validation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateParaGroupNameRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<ValidateParaGroupNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ValidateParaGroupNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ValidateParaGroupNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPassword = genForvalidateWeakPassword();

    private static HttpRequestDef<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> genForvalidateWeakPassword() {
        // basic
        HttpRequestDef.Builder<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateWeakPasswordRequest.class, ValidateWeakPasswordResponse.class)
                .withName("ValidateWeakPassword")
                .withUri("/v3/{project_id}/weak-password-verification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ValidateWeakPasswordRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ValidateWeakPasswordRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ValidateWeakPasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<WeakPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WeakPasswordRequestBody.class),
            f -> f.withMarshaller(ValidateWeakPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

}

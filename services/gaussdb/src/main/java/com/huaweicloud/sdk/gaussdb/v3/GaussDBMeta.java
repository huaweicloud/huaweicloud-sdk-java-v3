package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdb.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class GaussDBMeta {

    public static final HttpRequestDef<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse> changeMysqlInstanceSpecification = genForchangeMysqlInstanceSpecification();

    private static HttpRequestDef<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse> genForchangeMysqlInstanceSpecification() {
        // basic
        HttpRequestDef.Builder<ChangeMysqlInstanceSpecificationRequest, ChangeMysqlInstanceSpecificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeMysqlInstanceSpecificationRequest.class, ChangeMysqlInstanceSpecificationResponse.class)
                .withName("ChangeMysqlInstanceSpecification")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeMysqlInstanceSpecificationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeMysqlInstanceSpecificationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlChangeSpecificationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlChangeSpecificationRequest.class),
            f -> f.withMarshaller(ChangeMysqlInstanceSpecificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateMysqlBackupRequest, CreateMysqlBackupResponse> createMysqlBackup = genForcreateMysqlBackup();

    private static HttpRequestDef<CreateMysqlBackupRequest, CreateMysqlBackupResponse> genForcreateMysqlBackup() {
        // basic
        HttpRequestDef.Builder<CreateMysqlBackupRequest, CreateMysqlBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMysqlBackupRequest.class, CreateMysqlBackupResponse.class)
                .withName("CreateMysqlBackup")
                .withUri("/mysql/v3/{project_id}/backups/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMysqlBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlCreateBackupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateBackupRequest.class),
            f -> f.withMarshaller(CreateMysqlBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse> createMysqlInstance = genForcreateMysqlInstance();

    private static HttpRequestDef<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse> genForcreateMysqlInstance() {
        // basic
        HttpRequestDef.Builder<CreateMysqlInstanceRequest, CreateMysqlInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMysqlInstanceRequest.class, CreateMysqlInstanceResponse.class)
                .withName("CreateMysqlInstance")
                .withUri("/mysql/v3/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMysqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlInstanceRequest.class),
            f -> f.withMarshaller(CreateMysqlInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateMysqlProxyRequest, CreateMysqlProxyResponse> createMysqlProxy = genForcreateMysqlProxy();

    private static HttpRequestDef<CreateMysqlProxyRequest, CreateMysqlProxyResponse> genForcreateMysqlProxy() {
        // basic
        HttpRequestDef.Builder<CreateMysqlProxyRequest, CreateMysqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMysqlProxyRequest.class, CreateMysqlProxyResponse.class)
                .withName("CreateMysqlProxy")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMysqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMysqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpenMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenMysqlProxyRequestBody.class),
            f -> f.withMarshaller(CreateMysqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse> createMysqlReadonlyNode = genForcreateMysqlReadonlyNode();

    private static HttpRequestDef<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse> genForcreateMysqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<CreateMysqlReadonlyNodeRequest, CreateMysqlReadonlyNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMysqlReadonlyNodeRequest.class, CreateMysqlReadonlyNodeResponse.class)
                .withName("CreateMysqlReadonlyNode")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/nodes/enlarge")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMysqlReadonlyNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMysqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlCreateReadonlyNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateReadonlyNodeRequest.class),
            f -> f.withMarshaller(CreateMysqlReadonlyNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse> deleteMysqlInstance = genFordeleteMysqlInstance();

    private static HttpRequestDef<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse> genFordeleteMysqlInstance() {
        // basic
        HttpRequestDef.Builder<DeleteMysqlInstanceRequest, DeleteMysqlInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMysqlInstanceRequest.class, DeleteMysqlInstanceResponse.class)
                .withName("DeleteMysqlInstance")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMysqlInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMysqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse> deleteMysqlProxy = genFordeleteMysqlProxy();

    private static HttpRequestDef<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse> genFordeleteMysqlProxy() {
        // basic
        HttpRequestDef.Builder<DeleteMysqlProxyRequest, DeleteMysqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMysqlProxyRequest.class, DeleteMysqlProxyResponse.class)
                .withName("DeleteMysqlProxy")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMysqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMysqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse> deleteMysqlReadonlyNode = genFordeleteMysqlReadonlyNode();

    private static HttpRequestDef<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse> genFordeleteMysqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<DeleteMysqlReadonlyNodeRequest, DeleteMysqlReadonlyNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMysqlReadonlyNodeRequest.class, DeleteMysqlReadonlyNodeResponse.class)
                .withName("DeleteMysqlReadonlyNode")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMysqlReadonlyNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMysqlReadonlyNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMysqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse> expandMysqlInstanceVolume = genForexpandMysqlInstanceVolume();

    private static HttpRequestDef<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse> genForexpandMysqlInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ExpandMysqlInstanceVolumeRequest, ExpandMysqlInstanceVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandMysqlInstanceVolumeRequest.class, ExpandMysqlInstanceVolumeResponse.class)
                .withName("ExpandMysqlInstanceVolume")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/volume/extend")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandMysqlInstanceVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandMysqlInstanceVolumeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlExtendInstanceVolumeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlExtendInstanceVolumeRequest.class),
            f -> f.withMarshaller(ExpandMysqlInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse> expandMysqlProxy = genForexpandMysqlProxy();

    private static HttpRequestDef<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse> genForexpandMysqlProxy() {
        // basic
        HttpRequestDef.Builder<ExpandMysqlProxyRequest, ExpandMysqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandMysqlProxyRequest.class, ExpandMysqlProxyResponse.class)
                .withName("ExpandMysqlProxy")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/proxy/enlarge")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandMysqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandMysqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<EnlargeProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeProxyRequest.class),
            f -> f.withMarshaller(ExpandMysqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResources = genForlistDedicatedResources();

    private static HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> genForlistDedicatedResources() {
        // basic
        HttpRequestDef.Builder<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDedicatedResourcesRequest.class, ListDedicatedResourcesResponse.class)
                .withName("ListDedicatedResources")
                .withUri("/mysql/v3/{project_id}/dedicated-resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse> listMysqlConfigurations = genForlistMysqlConfigurations();

    private static HttpRequestDef<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse> genForlistMysqlConfigurations() {
        // basic
        HttpRequestDef.Builder<ListMysqlConfigurationsRequest, ListMysqlConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMysqlConfigurationsRequest.class, ListMysqlConfigurationsResponse.class)
                .withName("ListMysqlConfigurations")
                .withUri("/mysql/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse> listMysqlErrorLog = genForlistMysqlErrorLog();

    private static HttpRequestDef<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse> genForlistMysqlErrorLog() {
        // basic
        HttpRequestDef.Builder<ListMysqlErrorLogRequest, ListMysqlErrorLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMysqlErrorLogRequest.class, ListMysqlErrorLogResponse.class)
                .withName("ListMysqlErrorLog")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/errorlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlErrorLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse> listMysqlSlowLog = genForlistMysqlSlowLog();

    private static HttpRequestDef<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse> genForlistMysqlSlowLog() {
        // basic
        HttpRequestDef.Builder<ListMysqlSlowLogRequest, ListMysqlSlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMysqlSlowLogRequest.class, ListMysqlSlowLogResponse.class)
                .withName("ListMysqlSlowLog")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMysqlSlowLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse> resetMysqlPassword = genForresetMysqlPassword();

    private static HttpRequestDef<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse> genForresetMysqlPassword() {
        // basic
        HttpRequestDef.Builder<ResetMysqlPasswordRequest, ResetMysqlPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetMysqlPasswordRequest.class, ResetMysqlPasswordResponse.class)
                .withName("ResetMysqlPassword")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMysqlPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMysqlPasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlResetPasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlResetPasswordRequest.class),
            f -> f.withMarshaller(ResetMysqlPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetMysqlQuotasRequest, SetMysqlQuotasResponse> setMysqlQuotas = genForsetMysqlQuotas();

    private static HttpRequestDef<SetMysqlQuotasRequest, SetMysqlQuotasResponse> genForsetMysqlQuotas() {
        // basic
        HttpRequestDef.Builder<SetMysqlQuotasRequest, SetMysqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetMysqlQuotasRequest.class, SetMysqlQuotasResponse.class)
                .withName("SetMysqlQuotas")
                .withUri("/mysql/v3/{project_id}/quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetMysqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(SetMysqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse> showMysqlBackupList = genForshowMysqlBackupList();

    private static HttpRequestDef<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse> genForshowMysqlBackupList() {
        // basic
        HttpRequestDef.Builder<ShowMysqlBackupListRequest, ShowMysqlBackupListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlBackupListRequest.class, ShowMysqlBackupListResponse.class)
                .withName("ShowMysqlBackupList")
                .withUri("/mysql/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<String>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            })
        );
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse> showMysqlBackupPolicy = genForshowMysqlBackupPolicy();

    private static HttpRequestDef<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse> genForshowMysqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowMysqlBackupPolicyRequest, ShowMysqlBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlBackupPolicyRequest.class, ShowMysqlBackupPolicyResponse.class)
                .withName("ShowMysqlBackupPolicy")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse> showMysqlEngineVersion = genForshowMysqlEngineVersion();

    private static HttpRequestDef<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse> genForshowMysqlEngineVersion() {
        // basic
        HttpRequestDef.Builder<ShowMysqlEngineVersionRequest, ShowMysqlEngineVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlEngineVersionRequest.class, ShowMysqlEngineVersionResponse.class)
                .withName("ShowMysqlEngineVersion")
                .withUri("/mysql/v3/{project_id}/datastores/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlEngineVersionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlEngineVersionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse> showMysqlFlavors = genForshowMysqlFlavors();

    private static HttpRequestDef<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse> genForshowMysqlFlavors() {
        // basic
        HttpRequestDef.Builder<ShowMysqlFlavorsRequest, ShowMysqlFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlFlavorsRequest.class, ShowMysqlFlavorsResponse.class)
                .withName("ShowMysqlFlavors")
                .withUri("/mysql/v3/{project_id}/flavors/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlFlavorsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            })
        );
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlFlavorsRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            })
        );
        builder.<ShowMysqlFlavorsRequest.AvailabilityZoneModeEnum>withRequestField("availability_zone_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowMysqlFlavorsRequest.AvailabilityZoneModeEnum.class),
            f -> f.withMarshaller(ShowMysqlFlavorsRequest::getAvailabilityZoneMode, (req, v) -> {
                req.setAvailabilityZoneMode(v);
            })
        );
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse> showMysqlInstanceInfo = genForshowMysqlInstanceInfo();

    private static HttpRequestDef<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse> genForshowMysqlInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowMysqlInstanceInfoRequest, ShowMysqlInstanceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlInstanceInfoRequest.class, ShowMysqlInstanceInfoResponse.class)
                .withName("ShowMysqlInstanceInfo")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse> showMysqlInstanceList = genForshowMysqlInstanceList();

    private static HttpRequestDef<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse> genForshowMysqlInstanceList() {
        // basic
        HttpRequestDef.Builder<ShowMysqlInstanceListRequest, ShowMysqlInstanceListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlInstanceListRequest.class, ShowMysqlInstanceListResponse.class)
                .withName("ShowMysqlInstanceList")
                .withUri("/mysql/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            })
        );
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlInstanceListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse> showMysqlJobInfo = genForshowMysqlJobInfo();

    private static HttpRequestDef<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse> genForshowMysqlJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowMysqlJobInfoRequest, ShowMysqlJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlJobInfoRequest.class, ShowMysqlJobInfoResponse.class)
                .withName("ShowMysqlJobInfo")
                .withUri("/mysql/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlJobInfoRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlJobInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse> showMysqlProjectQuotas = genForshowMysqlProjectQuotas();

    private static HttpRequestDef<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse> genForshowMysqlProjectQuotas() {
        // basic
        HttpRequestDef.Builder<ShowMysqlProjectQuotasRequest, ShowMysqlProjectQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlProjectQuotasRequest.class, ShowMysqlProjectQuotasResponse.class)
                .withName("ShowMysqlProjectQuotas")
                .withUri("/mysql/v3/{project_id}/project-quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowMysqlProjectQuotasRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMysqlProjectQuotasRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowMysqlProjectQuotasRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlProjectQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlProxyRequest, ShowMysqlProxyResponse> showMysqlProxy = genForshowMysqlProxy();

    private static HttpRequestDef<ShowMysqlProxyRequest, ShowMysqlProxyResponse> genForshowMysqlProxy() {
        // basic
        HttpRequestDef.Builder<ShowMysqlProxyRequest, ShowMysqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlProxyRequest.class, ShowMysqlProxyResponse.class)
                .withName("ShowMysqlProxy")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse> showMysqlProxyFlavors = genForshowMysqlProxyFlavors();

    private static HttpRequestDef<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse> genForshowMysqlProxyFlavors() {
        // basic
        HttpRequestDef.Builder<ShowMysqlProxyFlavorsRequest, ShowMysqlProxyFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlProxyFlavorsRequest.class, ShowMysqlProxyFlavorsResponse.class)
                .withName("ShowMysqlProxyFlavors")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/proxy/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlProxyFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlProxyFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse> showMysqlQuotas = genForshowMysqlQuotas();

    private static HttpRequestDef<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse> genForshowMysqlQuotas() {
        // basic
        HttpRequestDef.Builder<ShowMysqlQuotasRequest, ShowMysqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMysqlQuotasRequest.class, ShowMysqlQuotasResponse.class)
                .withName("ShowMysqlQuotas")
                .withUri("/mysql/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlQuotasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlQuotasRequest::getEnterpriseProjectName, (req, v) -> {
                req.setEnterpriseProjectName(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMysqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse> updateMysqlBackupPolicy = genForupdateMysqlBackupPolicy();

    private static HttpRequestDef<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse> genForupdateMysqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateMysqlBackupPolicyRequest, UpdateMysqlBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMysqlBackupPolicyRequest.class, UpdateMysqlBackupPolicyResponse.class)
                .withName("UpdateMysqlBackupPolicy")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/backups/policy/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMysqlBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMysqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlUpdateBackupPolicyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateBackupPolicyRequest.class),
            f -> f.withMarshaller(UpdateMysqlBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse> updateMysqlInstanceName = genForupdateMysqlInstanceName();

    private static HttpRequestDef<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse> genForupdateMysqlInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateMysqlInstanceNameRequest, UpdateMysqlInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMysqlInstanceNameRequest.class, UpdateMysqlInstanceNameResponse.class)
                .withName("UpdateMysqlInstanceName")
                .withUri("/mysql/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMysqlInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMysqlInstanceNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlUpdateInstanceNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateInstanceNameRequest.class),
            f -> f.withMarshaller(UpdateMysqlInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse> updateMysqlQuotas = genForupdateMysqlQuotas();

    private static HttpRequestDef<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse> genForupdateMysqlQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateMysqlQuotasRequest, UpdateMysqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMysqlQuotasRequest.class, UpdateMysqlQuotasResponse.class)
                .withName("UpdateMysqlQuotas")
                .withUri("/mysql/v3/{project_id}/quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMysqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(UpdateMysqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

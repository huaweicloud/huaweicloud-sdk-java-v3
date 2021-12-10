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

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction = genForbatchTagAction();

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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<BatchOperateInstanceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateInstanceTagRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecification = genForchangeGaussMySqlInstanceSpecification();

    private static HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> genForchangeGaussMySqlInstanceSpecification() {
        // basic
        HttpRequestDef.Builder<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeGaussMySqlInstanceSpecificationRequest.class, ChangeGaussMySqlInstanceSpecificationResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlChangeSpecificationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlChangeSpecificationRequest.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackup = genForcreateGaussMySqlBackup();

    private static HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> genForcreateGaussMySqlBackup() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGaussMySqlBackupRequest.class, CreateGaussMySqlBackupResponse.class)
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
            })
        );
        builder.<MysqlCreateBackupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateBackupRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstance = genForcreateGaussMySqlInstance();

    private static HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> genForcreateGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGaussMySqlInstanceRequest.class, CreateGaussMySqlInstanceResponse.class)
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
            })
        );
        builder.<MysqlInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlInstanceRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxy = genForcreateGaussMySqlProxy();

    private static HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> genForcreateGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGaussMySqlProxyRequest.class, CreateGaussMySqlProxyResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<OpenMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenMysqlProxyRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNode = genForcreateGaussMySqlReadonlyNode();

    private static HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> genForcreateGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGaussMySqlReadonlyNodeRequest.class, CreateGaussMySqlReadonlyNodeResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlCreateReadonlyNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateReadonlyNodeRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstance = genFordeleteGaussMySqlInstance();

    private static HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> genFordeleteGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGaussMySqlInstanceRequest.class, DeleteGaussMySqlInstanceResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxy = genFordeleteGaussMySqlProxy();

    private static HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> genFordeleteGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGaussMySqlProxyRequest.class, DeleteGaussMySqlProxyResponse.class)
                .withName("DeleteGaussMySqlProxy")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNode = genFordeleteGaussMySqlReadonlyNode();

    private static HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> genFordeleteGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGaussMySqlReadonlyNodeRequest.class, DeleteGaussMySqlReadonlyNodeResponse.class)
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
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolume = genForexpandGaussMySqlInstanceVolume();

    private static HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> genForexpandGaussMySqlInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandGaussMySqlInstanceVolumeRequest.class, ExpandGaussMySqlInstanceVolumeResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlExtendInstanceVolumeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlExtendInstanceVolumeRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxy = genForexpandGaussMySqlProxy();

    private static HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> genForexpandGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandGaussMySqlProxyRequest.class, ExpandGaussMySqlProxyResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<EnlargeProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeProxyRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurations = genForlistGaussMySqlConfigurations();

    private static HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> genForlistGaussMySqlConfigurations() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGaussMySqlConfigurationsRequest.class, ListGaussMySqlConfigurationsResponse.class)
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
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResources = genForlistGaussMySqlDedicatedResources();

    private static HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> genForlistGaussMySqlDedicatedResources() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGaussMySqlDedicatedResourcesRequest.class, ListGaussMySqlDedicatedResourcesResponse.class)
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
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse> listGaussMySqlErrorLog = genForlistGaussMySqlErrorLog();

    private static HttpRequestDef<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse> genForlistGaussMySqlErrorLog() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGaussMySqlErrorLogRequest.class, ListGaussMySqlErrorLogResponse.class)
                .withName("ListGaussMySqlErrorLog")
                .withUri("/v3/{project_id}/instances/{instance_id}/errorlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlErrorLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstances = genForlistGaussMySqlInstances();

    private static HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> genForlistGaussMySqlInstances() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGaussMySqlInstancesRequest.class, ListGaussMySqlInstancesResponse.class)
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
            })
        );
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            })
        );
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse> listGaussMySqlSlowLog = genForlistGaussMySqlSlowLog();

    private static HttpRequestDef<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse> genForlistGaussMySqlSlowLog() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGaussMySqlSlowLogRequest.class, ListGaussMySqlSlowLogResponse.class)
                .withName("ListGaussMySqlSlowLog")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            })
        );
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlSlowLogRequest::getXLanguage, (req, v) -> {
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
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
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

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags = genForlistProjectTags();

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
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
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

    public static final HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPassword = genForresetGaussMySqlPassword();

    private static HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> genForresetGaussMySqlPassword() {
        // basic
        HttpRequestDef.Builder<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetGaussMySqlPasswordRequest.class, ResetGaussMySqlPasswordResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlResetPasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlResetPasswordRequest.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotas = genForsetGaussMySqlQuotas();

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
            })
        );
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(SetGaussMySqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupList = genForshowGaussMySqlBackupList();

    private static HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> genForshowGaussMySqlBackupList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlBackupListRequest.class, ShowGaussMySqlBackupListResponse.class)
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
            })
        );
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            })
        );
        builder.<String>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            })
        );
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicy = genForshowGaussMySqlBackupPolicy();

    private static HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> genForshowGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlBackupPolicyRequest.class, ShowGaussMySqlBackupPolicyResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersion = genForshowGaussMySqlEngineVersion();

    private static HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> genForshowGaussMySqlEngineVersion() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlEngineVersionRequest.class, ShowGaussMySqlEngineVersionResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlEngineVersionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavors = genForshowGaussMySqlFlavors();

    private static HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> genForshowGaussMySqlFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlFlavorsRequest.class, ShowGaussMySqlFlavorsResponse.class)
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
            })
        );
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            })
        );
        builder.<String>withRequestField("availability_zone_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getAvailabilityZoneMode, (req, v) -> {
                req.setAvailabilityZoneMode(v);
            })
        );
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfo = genForshowGaussMySqlInstanceInfo();

    private static HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> genForshowGaussMySqlInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlInstanceInfoRequest.class, ShowGaussMySqlInstanceInfoResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfo = genForshowGaussMySqlJobInfo();

    private static HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> genForshowGaussMySqlJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlJobInfoRequest.class, ShowGaussMySqlJobInfoResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlJobInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotas = genForshowGaussMySqlProjectQuotas();

    private static HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> genForshowGaussMySqlProjectQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlProjectQuotasRequest.class, ShowGaussMySqlProjectQuotasResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProjectQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse> showGaussMySqlProxy = genForshowGaussMySqlProxy();

    private static HttpRequestDef<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse> genForshowGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlProxyRequest.class, ShowGaussMySqlProxyResponse.class)
                .withName("ShowGaussMySqlProxy")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavors = genForshowGaussMySqlProxyFlavors();

    private static HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> genForshowGaussMySqlProxyFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlProxyFlavorsRequest.class, ShowGaussMySqlProxyFlavorsResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotas = genForshowGaussMySqlQuotas();

    private static HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> genForshowGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGaussMySqlQuotasRequest.class, ShowGaussMySqlQuotasResponse.class)
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
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getEnterpriseProjectName, (req, v) -> {
                req.setEnterpriseProjectName(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtend = genForshowInstanceMonitorExtend();

    private static HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> genForshowInstanceMonitorExtend() {
        // basic
        HttpRequestDef.Builder<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceMonitorExtendRequest.class, ShowInstanceMonitorExtendResponse.class)
                .withName("ShowInstanceMonitorExtend")
                .withUri("/v3/{project_id}/instances/{instance_id}/monitorPolicy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicy = genForupdateGaussMySqlBackupPolicy();

    private static HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> genForupdateGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGaussMySqlBackupPolicyRequest.class, UpdateGaussMySqlBackupPolicyResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlUpdateBackupPolicyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateBackupPolicyRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceName = genForupdateGaussMySqlInstanceName();

    private static HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> genForupdateGaussMySqlInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGaussMySqlInstanceNameRequest.class, UpdateGaussMySqlInstanceNameResponse.class)
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
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<MysqlUpdateInstanceNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateInstanceNameRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotas = genForupdateGaussMySqlQuotas();

    private static HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> genForupdateGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGaussMySqlQuotasRequest.class, UpdateGaussMySqlQuotasResponse.class)
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
            })
        );
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(UpdateGaussMySqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitor = genForupdateInstanceMonitor();

    private static HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> genForupdateInstanceMonitor() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceMonitorRequest.class, UpdateInstanceMonitorResponse.class)
                .withName("UpdateInstanceMonitor")
                .withUri("/v3/{project_id}/instances/{instance_id}/monitorPolicy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.<TaurusModifyInstanceMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusModifyInstanceMonitorRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

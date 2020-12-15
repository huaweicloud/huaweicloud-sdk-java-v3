package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kafka.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class KafkaMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteInstanceTagRequest, BatchCreateOrDeleteInstanceTagResponse> batchCreateOrDeleteInstanceTag = genForbatchCreateOrDeleteInstanceTag();

    private static HttpRequestDef<BatchCreateOrDeleteInstanceTagRequest, BatchCreateOrDeleteInstanceTagResponse> genForbatchCreateOrDeleteInstanceTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteInstanceTagRequest, BatchCreateOrDeleteInstanceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateOrDeleteInstanceTagRequest.class, BatchCreateOrDeleteInstanceTagResponse.class)
                .withUri("/v2/{project_id}/kafka/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateOrDeleteInstanceTagRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateOrDeleteTagReq.class,
            f -> f.withMarshaller(BatchCreateOrDeleteInstanceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopic = genForbatchDeleteInstanceTopic();

    private static HttpRequestDef<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> genForbatchDeleteInstanceTopic() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteInstanceTopicRequest.class, BatchDeleteInstanceTopicResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/delete")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteInstanceTopicReq.class,
            f -> f.withMarshaller(BatchDeleteInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstances = genForbatchRestartOrDeleteInstances();

    private static HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> genForbatchRestartOrDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRestartOrDeleteInstancesRequest.class, BatchRestartOrDeleteInstancesResponse.class)
                .withUri("/v2/{project_id}/instances/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchRestartOrDeleteInstanceReq.class,
            f -> f.withMarshaller(BatchRestartOrDeleteInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectorRequest, CreateConnectorResponse> createConnector = genForcreateConnector();

    private static HttpRequestDef<CreateConnectorRequest, CreateConnectorResponse> genForcreateConnector() {
        // basic
        HttpRequestDef.Builder<CreateConnectorRequest, CreateConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectorRequest.class, CreateConnectorResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/connector")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateConnectorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateConnectorReq.class,
            f -> f.withMarshaller(CreateConnectorRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceTopicRequest, CreateInstanceTopicResponse> createInstanceTopic = genForcreateInstanceTopic();

    private static HttpRequestDef<CreateInstanceTopicRequest, CreateInstanceTopicResponse> genForcreateInstanceTopic() {
        // basic
        HttpRequestDef.Builder<CreateInstanceTopicRequest, CreateInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceTopicRequest.class, CreateInstanceTopicResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateInstanceTopicReq.class,
            f -> f.withMarshaller(CreateInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> createPartition = genForcreatePartition();

    private static HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> genForcreatePartition() {
        // basic
        HttpRequestDef.Builder<CreatePartitionRequest, CreatePartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePartitionRequest.class, CreatePartitionResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions-reassignment")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePartitionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePartitionRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePartitionReq.class,
            f -> f.withMarshaller(CreatePartitionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstance = genForcreatePostPaidInstance();

    private static HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> genForcreatePostPaidInstance() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostPaidInstanceRequest.class, CreatePostPaidInstanceResponse.class)
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePostPaidInstanceReq.class,
            f -> f.withMarshaller(CreatePostPaidInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSinkTaskRequest, CreateSinkTaskResponse> createSinkTask = genForcreateSinkTask();

    private static HttpRequestDef<CreateSinkTaskRequest, CreateSinkTaskResponse> genForcreateSinkTask() {
        // basic
        HttpRequestDef.Builder<CreateSinkTaskRequest, CreateSinkTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSinkTaskRequest.class, CreateSinkTaskResponse.class)
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSinkTaskRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSinkTaskReq.class,
            f -> f.withMarshaller(CreateSinkTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance = genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}")
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

    public static final HttpRequestDef<DeleteSinkTaskRequest, DeleteSinkTaskResponse> deleteSinkTask = genFordeleteSinkTask();

    private static HttpRequestDef<DeleteSinkTaskRequest, DeleteSinkTaskResponse> genFordeleteSinkTask() {
        // basic
        HttpRequestDef.Builder<DeleteSinkTaskRequest, DeleteSinkTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSinkTaskRequest.class, DeleteSinkTaskResponse.class)
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSinkTaskRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            })
        );
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSinkTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
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
                .withUri("/v2/available-zones")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasks = genForlistBackgroundTasks();

    private static HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> genForlistBackgroundTasks() {
        // basic
        HttpRequestDef.Builder<ListBackgroundTasksRequest, ListBackgroundTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackgroundTasksRequest.class, ListBackgroundTasksResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBackgroundTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackgroundTasksRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackgroundTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackgroundTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackgroundTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTopicsRequest, ListInstanceTopicsResponse> listInstanceTopics = genForlistInstanceTopics();

    private static HttpRequestDef<ListInstanceTopicsRequest, ListInstanceTopicsResponse> genForlistInstanceTopics() {
        // basic
        HttpRequestDef.Builder<ListInstanceTopicsRequest, ListInstanceTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTopicsRequest.class, ListInstanceTopicsResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListInstanceTopicsRequest::getInstanceId, (req, v) -> {
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
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListInstancesRequest.EngineEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getEngine, (req, v) -> {
                req.setEngine(v);
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
        builder.withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListInstancesRequest.StatusEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListInstancesRequest.IncludeFailureEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getIncludeFailure, (req, v) -> {
                req.setIncludeFailure(v);
            })
        );
        builder.withRequestField("exact_match_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListInstancesRequest.ExactMatchNameEnum.class,
            f -> f.withMarshaller(ListInstancesRequest::getExactMatchName, (req, v) -> {
                req.setExactMatchName(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withUri("/v2/products")
                .withContentType("application/json");

        // requests
        builder.withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListProductsRequest.EngineEnum.class,
            f -> f.withMarshaller(ListProductsRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSinkTasksRequest, ListSinkTasksResponse> listSinkTasks = genForlistSinkTasks();

    private static HttpRequestDef<ListSinkTasksRequest, ListSinkTasksResponse> genForlistSinkTasks() {
        // basic
        HttpRequestDef.Builder<ListSinkTasksRequest, ListSinkTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSinkTasksRequest.class, ListSinkTasksResponse.class)
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSinkTasksRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetManagerPasswordRequest, ResetManagerPasswordResponse> resetManagerPassword = genForresetManagerPassword();

    private static HttpRequestDef<ResetManagerPasswordRequest, ResetManagerPasswordResponse> genForresetManagerPassword() {
        // basic
        HttpRequestDef.Builder<ResetManagerPasswordRequest, ResetManagerPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetManagerPasswordRequest.class, ResetManagerPasswordResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/kafka-manager-password")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetManagerPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetManagerPasswordReq.class,
            f -> f.withMarshaller(ResetManagerPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetMessageOffsetRequest, ResetMessageOffsetResponse> resetMessageOffset = genForresetMessageOffset();

    private static HttpRequestDef<ResetMessageOffsetRequest, ResetMessageOffsetResponse> genForresetMessageOffset() {
        // basic
        HttpRequestDef.Builder<ResetMessageOffsetRequest, ResetMessageOffsetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetMessageOffsetRequest.class, ResetMessageOffsetResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/groups/{group}/reset-message-offset")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetMessageOffsetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetMessageOffsetRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetMessageOffsetReq.class,
            f -> f.withMarshaller(ResetMessageOffsetRequest::getBody, (req, v) -> {
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
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/password")
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
            ResetPasswordReq.class,
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
                .withUri("/v2/{project_id}/instances/{instance_id}/extend")
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
            ResizeInstanceReq.class,
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartManagerRequest, RestartManagerResponse> restartManager = genForrestartManager();

    private static HttpRequestDef<RestartManagerRequest, RestartManagerResponse> genForrestartManager() {
        // basic
        HttpRequestDef.Builder<RestartManagerRequest, RestartManagerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RestartManagerRequest.class, RestartManagerResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/restart-kafka-manager")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestartManagerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTask = genForshowBackgroundTask();

    private static HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> genForshowBackgroundTask() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackgroundTaskRequest.class, ShowBackgroundTaskResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchy = genForshowCesHierarchy();

    private static HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> genForshowCesHierarchy() {
        // basic
        HttpRequestDef.Builder<ShowCesHierarchyRequest, ShowCesHierarchyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCesHierarchyRequest.class, ShowCesHierarchyResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/ces-hierarchy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCesHierarchyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForshowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForshowCluster() {
        // basic
        HttpRequestDef.Builder<ShowClusterRequest, ShowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterRequest.class, ShowClusterResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/cluster")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowClusterRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCoordinatorsRequest, ShowCoordinatorsResponse> showCoordinators = genForshowCoordinators();

    private static HttpRequestDef<ShowCoordinatorsRequest, ShowCoordinatorsResponse> genForshowCoordinators() {
        // basic
        HttpRequestDef.Builder<ShowCoordinatorsRequest, ShowCoordinatorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCoordinatorsRequest.class, ShowCoordinatorsResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/coordinators")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCoordinatorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupsRequest, ShowGroupsResponse> showGroups = genForshowGroups();

    private static HttpRequestDef<ShowGroupsRequest, ShowGroupsResponse> genForshowGroups() {
        // basic
        HttpRequestDef.Builder<ShowGroupsRequest, ShowGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupsRequest.class, ShowGroupsResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/groups/{group}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowGroupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowGroupsRequest::getGroup, (req, v) -> {
                req.setGroup(v);
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

    public static final HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfo = genForshowInstanceExtendProductInfo();

    private static HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> genForshowInstanceExtendProductInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceExtendProductInfoRequest.class, ShowInstanceExtendProductInfoResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowInstanceExtendProductInfoRequest.TypeEnum.class,
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowInstanceExtendProductInfoRequest.EngineEnum.class,
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTags = genForshowInstanceTags();

    private static HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> genForshowInstanceTags() {
        // basic
        HttpRequestDef.Builder<ShowInstanceTagsRequest, ShowInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceTagsRequest.class, ShowInstanceTagsResponse.class)
                .withUri("/v2/{project_id}/kafka/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> showInstanceTopicDetail = genForshowInstanceTopicDetail();

    private static HttpRequestDef<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> genForshowInstanceTopicDetail() {
        // basic
        HttpRequestDef.Builder<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceTopicDetailRequest.class, ShowInstanceTopicDetailResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceTopicDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceTopicDetailRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindows = genForshowMaintainWindows();

    private static HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> genForshowMaintainWindows() {
        // basic
        HttpRequestDef.Builder<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMaintainWindowsRequest.class, ShowMaintainWindowsResponse.class)
                .withUri("/v2/instances/maintain-windows")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessagesRequest, ShowMessagesResponse> showMessages = genForshowMessages();

    private static HttpRequestDef<ShowMessagesRequest, ShowMessagesResponse> genForshowMessages() {
        // basic
        HttpRequestDef.Builder<ShowMessagesRequest, ShowMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMessagesRequest.class, ShowMessagesResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMessagesRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMessagesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMessagesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowMessagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("partition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMessagesRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> showPartitionBeginningMessage = genForshowPartitionBeginningMessage();

    private static HttpRequestDef<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> genForshowPartitionBeginningMessage() {
        // basic
        HttpRequestDef.Builder<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartitionBeginningMessageRequest.class, ShowPartitionBeginningMessageResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions/{partition}/beginning-message")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );
        builder.withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> showPartitionEndMessage = genForshowPartitionEndMessage();

    private static HttpRequestDef<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> genForshowPartitionEndMessage() {
        // basic
        HttpRequestDef.Builder<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartitionEndMessageRequest.class, ShowPartitionEndMessageResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions/{partition}/end-message")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );
        builder.withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionMessageRequest, ShowPartitionMessageResponse> showPartitionMessage = genForshowPartitionMessage();

    private static HttpRequestDef<ShowPartitionMessageRequest, ShowPartitionMessageResponse> genForshowPartitionMessage() {
        // basic
        HttpRequestDef.Builder<ShowPartitionMessageRequest, ShowPartitionMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartitionMessageRequest.class, ShowPartitionMessageResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions/{partition}/message")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPartitionMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPartitionMessageRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );
        builder.withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowPartitionMessageRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            })
        );
        builder.withRequestField("message_offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPartitionMessageRequest::getMessageOffset, (req, v) -> {
                req.setMessageOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTagsRequest, ShowProjectTagsResponse> showProjectTags = genForshowProjectTags();

    private static HttpRequestDef<ShowProjectTagsRequest, ShowProjectTagsResponse> genForshowProjectTags() {
        // basic
        HttpRequestDef.Builder<ShowProjectTagsRequest, ShowProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectTagsRequest.class, ShowProjectTagsResponse.class)
                .withUri("/v2/{project_id}/kafka/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> showSinkTaskDetail = genForshowSinkTaskDetail();

    private static HttpRequestDef<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> genForshowSinkTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSinkTaskDetailRequest.class, ShowSinkTaskDetailResponse.class)
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSinkTaskDetailRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            })
        );
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSinkTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
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
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

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
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceReq.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopic = genForupdateInstanceAutoCreateTopic();

    private static HttpRequestDef<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> genForupdateInstanceAutoCreateTopic() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateInstanceAutoCreateTopicRequest.class, UpdateInstanceAutoCreateTopicResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/autotopic")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceAutoCreateTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceAutoCreateTopicReq.class,
            f -> f.withMarshaller(UpdateInstanceAutoCreateTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIp = genForupdateInstanceCrossVpcIp();

    private static HttpRequestDef<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> genForupdateInstanceCrossVpcIp() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateInstanceCrossVpcIpRequest.class, UpdateInstanceCrossVpcIpResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/crossvpc/modify")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceCrossVpcIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceCrossVpcIpReq.class,
            f -> f.withMarshaller(UpdateInstanceCrossVpcIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> updateInstanceTopic = genForupdateInstanceTopic();

    private static HttpRequestDef<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> genForupdateInstanceTopic() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceTopicRequest.class, UpdateInstanceTopicResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateInstanceTopicReq.class,
            f -> f.withMarshaller(UpdateInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> updateSinkTaskQuota = genForupdateSinkTaskQuota();

    private static HttpRequestDef<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> genForupdateSinkTaskQuota() {
        // basic
        HttpRequestDef.Builder<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSinkTaskQuotaRequest.class, UpdateSinkTaskQuotaResponse.class)
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSinkTaskQuotaRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSinkTaskQuotaReq.class,
            f -> f.withMarshaller(UpdateSinkTaskQuotaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> updateTopicReplica = genForupdateTopicReplica();

    private static HttpRequestDef<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> genForupdateTopicReplica() {
        // basic
        HttpRequestDef.Builder<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTopicReplicaRequest.class, UpdateTopicReplicaResponse.class)
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/replicas-reassignment")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetReplicaReq.class,
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

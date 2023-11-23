package com.huaweicloud.sdk.kafka.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kafka.v2.model.BatchCreateOrDeleteKafkaTagRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchCreateOrDeleteKafkaTagResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchCreateOrDeleteTagReq;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteGroupReq;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceTopicReq;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceUsersReq;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceUsersRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceUsersResponse;
import com.huaweicloud.sdk.kafka.v2.model.BatchRestartOrDeleteInstanceReq;
import com.huaweicloud.sdk.kafka.v2.model.BatchRestartOrDeleteInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.BatchRestartOrDeleteInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.CloseKafkaManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.CloseKafkaManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.ConnectorOrderRequestBody;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateDeleteConnectorOrderRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateDeleteConnectorOrderResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateGroupReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceByEngineReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceByEngineRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceByEngineResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceTopicReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceUserReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceUserRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateInstanceUserResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaConsumerGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaConsumerGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaUserClientQuotaTaskReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreatePartitionReq;
import com.huaweicloud.sdk.kafka.v2.model.CreatePartitionRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePartitionResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceReq;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateSinkTaskReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateSinkTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateSinkTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskReq;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteSinkTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteSinkTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstanceTopicsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListSinkTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListSinkTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsReq;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsResponse;
import com.huaweicloud.sdk.kafka.v2.model.PartitionReassignRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordReq;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetReq;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetPasswordReq;
import com.huaweicloud.sdk.kafka.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetReplicaReq;
import com.huaweicloud.sdk.kafka.v2.model.ResetUserPasswrodReq;
import com.huaweicloud.sdk.kafka.v2.model.ResetUserPasswrodRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetUserPasswrodResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResizeEngineInstanceReq;
import com.huaweicloud.sdk.kafka.v2.model.ResizeEngineInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResizeEngineInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResizeInstanceReq;
import com.huaweicloud.sdk.kafka.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCoordinatorsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowGroupsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowGroupsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceConfigsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceConfigsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceMessagesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceMessagesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceTopicDetailRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceTopicDetailResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceUsersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowInstanceUsersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProjectTagsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaProjectTagsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTagsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTagsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicPartitionDiskusageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicPartitionDiskusageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaUserClientQuotaRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaUserClientQuotaResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowMaintainWindowsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowMaintainWindowsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowMessagesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowMessagesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionBeginningMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionBeginningMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionEndMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionEndMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowPartitionMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowSinkTaskDetailRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowSinkTaskDetailResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowTopicAccessPolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowTopicAccessPolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceAutoCreateTopicReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceAutoCreateTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceAutoCreateTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceConsumerGroupRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceConsumerGroupResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVpcIpReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVpcIpRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVpcIpResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceUserRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceUserResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaUserClientQuotaTaskReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateSinkTaskQuotaReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateSinkTaskQuotaRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateSinkTaskQuotaResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicReplicaRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicReplicaResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateUserReq;

@SuppressWarnings("unchecked")
public class KafkaMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTag =
        genForbatchCreateOrDeleteKafkaTag();

    private static HttpRequestDef<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> genForbatchCreateOrDeleteKafkaTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateOrDeleteKafkaTagRequest.class,
                    BatchCreateOrDeleteKafkaTagResponse.class)
                .withName("BatchCreateOrDeleteKafkaTag")
                .withUri("/v2/{project_id}/kafka/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteKafkaTagRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchCreateOrDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagReq.class),
            f -> f.withMarshaller(BatchCreateOrDeleteKafkaTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteGroupRequest, BatchDeleteGroupResponse> batchDeleteGroup =
        genForbatchDeleteGroup();

    private static HttpRequestDef<BatchDeleteGroupRequest, BatchDeleteGroupResponse> genForbatchDeleteGroup() {
        // basic
        HttpRequestDef.Builder<BatchDeleteGroupRequest, BatchDeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteGroupRequest.class, BatchDeleteGroupResponse.class)
                .withName("BatchDeleteGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchDeleteGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteGroupReq.class),
            f -> f.withMarshaller(BatchDeleteGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopic =
        genForbatchDeleteInstanceTopic();

    private static HttpRequestDef<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> genForbatchDeleteInstanceTopic() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteInstanceTopicRequest.class, BatchDeleteInstanceTopicResponse.class)
                .withName("BatchDeleteInstanceTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchDeleteInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteInstanceTopicReq.class),
            f -> f.withMarshaller(BatchDeleteInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsers =
        genForbatchDeleteInstanceUsers();

    private static HttpRequestDef<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> genForbatchDeleteInstanceUsers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, BatchDeleteInstanceUsersRequest.class, BatchDeleteInstanceUsersResponse.class)
                .withName("BatchDeleteInstanceUsers")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteInstanceUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchDeleteInstanceUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteInstanceUsersReq.class),
            f -> f.withMarshaller(BatchDeleteInstanceUsersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstances =
        genForbatchRestartOrDeleteInstances();

    private static HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> genForbatchRestartOrDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRestartOrDeleteInstancesRequest.class,
                    BatchRestartOrDeleteInstancesResponse.class)
                .withName("BatchRestartOrDeleteInstances")
                .withUri("/v2/{project_id}/instances/action")
                .withContentType("application/json");

        // requests
        builder.<BatchRestartOrDeleteInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRestartOrDeleteInstanceReq.class),
            f -> f.withMarshaller(BatchRestartOrDeleteInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloseKafkaManagerRequest, CloseKafkaManagerResponse> closeKafkaManager =
        genForcloseKafkaManager();

    private static HttpRequestDef<CloseKafkaManagerRequest, CloseKafkaManagerResponse> genForcloseKafkaManager() {
        // basic
        HttpRequestDef.Builder<CloseKafkaManagerRequest, CloseKafkaManagerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CloseKafkaManagerRequest.class, CloseKafkaManagerResponse.class)
                .withName("CloseKafkaManager")
                .withUri("/v2/{project_id}/kafka/instances/{instance_id}/management")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseKafkaManagerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectorRequest, CreateConnectorResponse> createConnector =
        genForcreateConnector();

    private static HttpRequestDef<CreateConnectorRequest, CreateConnectorResponse> genForcreateConnector() {
        // basic
        HttpRequestDef.Builder<CreateConnectorRequest, CreateConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectorRequest.class, CreateConnectorResponse.class)
                .withName("CreateConnector")
                .withUri("/v2/{project_id}/instances/{instance_id}/connector")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateConnectorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectorReq.class),
            f -> f.withMarshaller(CreateConnectorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeleteConnectorOrderRequest, CreateDeleteConnectorOrderResponse> createDeleteConnectorOrder =
        genForcreateDeleteConnectorOrder();

    private static HttpRequestDef<CreateDeleteConnectorOrderRequest, CreateDeleteConnectorOrderResponse> genForcreateDeleteConnectorOrder() {
        // basic
        HttpRequestDef.Builder<CreateDeleteConnectorOrderRequest, CreateDeleteConnectorOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDeleteConnectorOrderRequest.class,
                    CreateDeleteConnectorOrderResponse.class)
                .withName("CreateDeleteConnectorOrder")
                .withUri("/v2/{project_id}/kafka/instances/{instance_id}/delete-connector-order")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeleteConnectorOrderRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ConnectorOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConnectorOrderRequestBody.class),
            f -> f.withMarshaller(CreateDeleteConnectorOrderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngine =
        genForcreateInstanceByEngine();

    private static HttpRequestDef<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> genForcreateInstanceByEngine() {
        // basic
        HttpRequestDef.Builder<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInstanceByEngineRequest.class, CreateInstanceByEngineResponse.class)
            .withName("CreateInstanceByEngine")
            .withUri("/v2/{engine}/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<CreateInstanceByEngineRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceByEngineRequest.EngineEnum.class),
            f -> f.withMarshaller(CreateInstanceByEngineRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<CreateInstanceByEngineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceByEngineReq.class),
            f -> f.withMarshaller(CreateInstanceByEngineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceTopicRequest, CreateInstanceTopicResponse> createInstanceTopic =
        genForcreateInstanceTopic();

    private static HttpRequestDef<CreateInstanceTopicRequest, CreateInstanceTopicResponse> genForcreateInstanceTopic() {
        // basic
        HttpRequestDef.Builder<CreateInstanceTopicRequest, CreateInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceTopicRequest.class, CreateInstanceTopicResponse.class)
                .withName("CreateInstanceTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceTopicReq.class),
            f -> f.withMarshaller(CreateInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceUserRequest, CreateInstanceUserResponse> createInstanceUser =
        genForcreateInstanceUser();

    private static HttpRequestDef<CreateInstanceUserRequest, CreateInstanceUserResponse> genForcreateInstanceUser() {
        // basic
        HttpRequestDef.Builder<CreateInstanceUserRequest, CreateInstanceUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceUserRequest.class, CreateInstanceUserResponse.class)
                .withName("CreateInstanceUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateInstanceUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceUserReq.class),
            f -> f.withMarshaller(CreateInstanceUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse> createKafkaConsumerGroup =
        genForcreateKafkaConsumerGroup();

    private static HttpRequestDef<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse> genForcreateKafkaConsumerGroup() {
        // basic
        HttpRequestDef.Builder<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateKafkaConsumerGroupRequest.class, CreateKafkaConsumerGroupResponse.class)
                .withName("CreateKafkaConsumerGroup")
                .withUri("/v2/{project_id}/kafka/instances/{instance_id}/group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKafkaConsumerGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupReq.class),
            f -> f.withMarshaller(CreateKafkaConsumerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKafkaConsumerGroupResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse> createKafkaUserClientQuotaTask =
        genForcreateKafkaUserClientQuotaTask();

    private static HttpRequestDef<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse> genForcreateKafkaUserClientQuotaTask() {
        // basic
        HttpRequestDef.Builder<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateKafkaUserClientQuotaTaskRequest.class,
                    CreateKafkaUserClientQuotaTaskResponse.class)
                .withName("CreateKafkaUserClientQuotaTask")
                .withUri("/v2/kafka/{project_id}/instances/{instance_id}/kafka-user-client-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKafkaUserClientQuotaTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateKafkaUserClientQuotaTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKafkaUserClientQuotaTaskReq.class),
            f -> f.withMarshaller(CreateKafkaUserClientQuotaTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> createPartition =
        genForcreatePartition();

    private static HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> genForcreatePartition() {
        // basic
        HttpRequestDef.Builder<CreatePartitionRequest, CreatePartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePartitionRequest.class, CreatePartitionResponse.class)
                .withName("CreatePartition")
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions-reassignment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePartitionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePartitionRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<CreatePartitionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePartitionReq.class),
            f -> f.withMarshaller(CreatePartitionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstance =
        genForcreatePostPaidInstance();

    private static HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> genForcreatePostPaidInstance() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePostPaidInstanceRequest.class, CreatePostPaidInstanceResponse.class)
            .withName("CreatePostPaidInstance")
            .withUri("/v2/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<CreatePostPaidInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePostPaidInstanceReq.class),
            f -> f.withMarshaller(CreatePostPaidInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> createReassignmentTask =
        genForcreateReassignmentTask();

    private static HttpRequestDef<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> genForcreateReassignmentTask() {
        // basic
        HttpRequestDef.Builder<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateReassignmentTaskRequest.class, CreateReassignmentTaskResponse.class)
            .withName("CreateReassignmentTask")
            .withUri("/v2/kafka/{project_id}/instances/{instance_id}/reassign")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReassignmentTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<PartitionReassignRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PartitionReassignRequest.class),
            f -> f.withMarshaller(CreateReassignmentTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSinkTaskRequest, CreateSinkTaskResponse> createSinkTask =
        genForcreateSinkTask();

    private static HttpRequestDef<CreateSinkTaskRequest, CreateSinkTaskResponse> genForcreateSinkTask() {
        // basic
        HttpRequestDef.Builder<CreateSinkTaskRequest, CreateSinkTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSinkTaskRequest.class, CreateSinkTaskResponse.class)
                .withName("CreateSinkTask")
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSinkTaskRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<CreateSinkTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSinkTaskReq.class),
            f -> f.withMarshaller(CreateSinkTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTask =
        genFordeleteBackgroundTask();

    private static HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> genFordeleteBackgroundTask() {
        // basic
        HttpRequestDef.Builder<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackgroundTaskRequest.class, DeleteBackgroundTaskResponse.class)
            .withName("DeleteBackgroundTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectorRequest, DeleteConnectorResponse> deleteConnector =
        genFordeleteConnector();

    private static HttpRequestDef<DeleteConnectorRequest, DeleteConnectorResponse> genFordeleteConnector() {
        // basic
        HttpRequestDef.Builder<DeleteConnectorRequest, DeleteConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteConnectorRequest.class, DeleteConnectorResponse.class)
                .withName("DeleteConnector")
                .withUri("/v2/{project_id}/kafka/instances/{instance_id}/delete-connector")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse> deleteKafkaUserClientQuotaTask =
        genFordeleteKafkaUserClientQuotaTask();

    private static HttpRequestDef<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse> genFordeleteKafkaUserClientQuotaTask() {
        // basic
        HttpRequestDef.Builder<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteKafkaUserClientQuotaTaskRequest.class,
                    DeleteKafkaUserClientQuotaTaskResponse.class)
                .withName("DeleteKafkaUserClientQuotaTask")
                .withUri("/v2/kafka/{project_id}/instances/{instance_id}/kafka-user-client-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKafkaUserClientQuotaTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeleteKafkaUserClientQuotaTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteKafkaUserClientQuotaTaskReq.class),
            f -> f.withMarshaller(DeleteKafkaUserClientQuotaTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSinkTaskRequest, DeleteSinkTaskResponse> deleteSinkTask =
        genFordeleteSinkTask();

    private static HttpRequestDef<DeleteSinkTaskRequest, DeleteSinkTaskResponse> genFordeleteSinkTask() {
        // basic
        HttpRequestDef.Builder<DeleteSinkTaskRequest, DeleteSinkTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSinkTaskRequest.class, DeleteSinkTaskResponse.class)
                .withName("DeleteSinkTask")
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSinkTaskRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSinkTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForlistAvailableZones();

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

    public static final HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasks =
        genForlistBackgroundTasks();

    private static HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> genForlistBackgroundTasks() {
        // basic
        HttpRequestDef.Builder<ListBackgroundTasksRequest, ListBackgroundTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackgroundTasksRequest.class, ListBackgroundTasksResponse.class)
                .withName("ListBackgroundTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProducts =
        genForlistEngineProducts();

    private static HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> genForlistEngineProducts() {
        // basic
        HttpRequestDef.Builder<ListEngineProductsRequest, ListEngineProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEngineProductsRequest.class, ListEngineProductsResponse.class)
                .withName("ListEngineProducts")
                .withUri("/v2/{engine}/products")
                .withContentType("application/json");

        // requests
        builder.<ListEngineProductsRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListEngineProductsRequest.EngineEnum.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroups =
        genForlistInstanceConsumerGroups();

    private static HttpRequestDef<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> genForlistInstanceConsumerGroups() {
        // basic
        HttpRequestDef.Builder<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceConsumerGroupsRequest.class,
                    ListInstanceConsumerGroupsResponse.class)
                .withName("ListInstanceConsumerGroups")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTopicsRequest, ListInstanceTopicsResponse> listInstanceTopics =
        genForlistInstanceTopics();

    private static HttpRequestDef<ListInstanceTopicsRequest, ListInstanceTopicsResponse> genForlistInstanceTopics() {
        // basic
        HttpRequestDef.Builder<ListInstanceTopicsRequest, ListInstanceTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTopicsRequest.class, ListInstanceTopicsResponse.class)
                .withName("ListInstanceTopics")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTopicsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.EngineEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListInstancesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListInstancesRequest.IncludeFailureEnum>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.IncludeFailureEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getIncludeFailure, (req, v) -> {
                req.setIncludeFailure(v);
            }));
        builder.<ListInstancesRequest.ExactMatchNameEnum>withRequestField("exact_match_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.ExactMatchNameEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getExactMatchName, (req, v) -> {
                req.setExactMatchName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/products")
                .withContentType("application/json");

        // requests
        builder.<ListProductsRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProductsRequest.EngineEnum.class),
            f -> f.withMarshaller(ListProductsRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSinkTasksRequest, ListSinkTasksResponse> listSinkTasks =
        genForlistSinkTasks();

    private static HttpRequestDef<ListSinkTasksRequest, ListSinkTasksResponse> genForlistSinkTasks() {
        // basic
        HttpRequestDef.Builder<ListSinkTasksRequest, ListSinkTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSinkTasksRequest.class, ListSinkTasksResponse.class)
                .withName("ListSinkTasks")
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSinkTasksRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicPartitionsRequest, ListTopicPartitionsResponse> listTopicPartitions =
        genForlistTopicPartitions();

    private static HttpRequestDef<ListTopicPartitionsRequest, ListTopicPartitionsResponse> genForlistTopicPartitions() {
        // basic
        HttpRequestDef.Builder<ListTopicPartitionsRequest, ListTopicPartitionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopicPartitionsRequest.class, ListTopicPartitionsResponse.class)
                .withName("ListTopicPartitions")
                .withUri("/v2/{project_id}/kafka/instances/{instance_id}/topics/{topic}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicPartitionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicPartitionsRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicPartitionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicPartitionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicProducersRequest, ListTopicProducersResponse> listTopicProducers =
        genForlistTopicProducers();

    private static HttpRequestDef<ListTopicProducersRequest, ListTopicProducersResponse> genForlistTopicProducers() {
        // basic
        HttpRequestDef.Builder<ListTopicProducersRequest, ListTopicProducersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopicProducersRequest.class, ListTopicProducersResponse.class)
                .withName("ListTopicProducers")
                .withUri("/v2/{project_id}/kafka/instances/{instance_id}/topics/{topic}/producers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicProducersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicProducersRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicProducersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicProducersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse> modifyInstanceConfigs =
        genFormodifyInstanceConfigs();

    private static HttpRequestDef<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse> genFormodifyInstanceConfigs() {
        // basic
        HttpRequestDef.Builder<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ModifyInstanceConfigsRequest.class, ModifyInstanceConfigsResponse.class)
            .withName("ModifyInstanceConfigs")
            .withUri("/v2/{project_id}/instances/{instance_id}/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyInstanceConfigsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyInstanceConfigsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyInstanceConfigsReq.class),
            f -> f.withMarshaller(ModifyInstanceConfigsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetManagerPasswordRequest, ResetManagerPasswordResponse> resetManagerPassword =
        genForresetManagerPassword();

    private static HttpRequestDef<ResetManagerPasswordRequest, ResetManagerPasswordResponse> genForresetManagerPassword() {
        // basic
        HttpRequestDef.Builder<ResetManagerPasswordRequest, ResetManagerPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResetManagerPasswordRequest.class, ResetManagerPasswordResponse.class)
            .withName("ResetManagerPassword")
            .withUri("/v2/{project_id}/instances/{instance_id}/kafka-manager-password")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetManagerPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetManagerPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetManagerPasswordReq.class),
            f -> f.withMarshaller(ResetManagerPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetMessageOffsetRequest, ResetMessageOffsetResponse> resetMessageOffset =
        genForresetMessageOffset();

    private static HttpRequestDef<ResetMessageOffsetRequest, ResetMessageOffsetResponse> genForresetMessageOffset() {
        // basic
        HttpRequestDef.Builder<ResetMessageOffsetRequest, ResetMessageOffsetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetMessageOffsetRequest.class, ResetMessageOffsetResponse.class)
                .withName("ResetMessageOffset")
                .withUri("/v2/{project_id}/instances/{instance_id}/management/groups/{group}/reset-message-offset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMessageOffsetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMessageOffsetRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));
        builder.<ResetMessageOffsetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetMessageOffsetReq.class),
            f -> f.withMarshaller(ResetMessageOffsetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetUserPasswrodRequest, ResetUserPasswrodResponse> resetUserPasswrod =
        genForresetUserPasswrod();

    private static HttpRequestDef<ResetUserPasswrodRequest, ResetUserPasswrodResponse> genForresetUserPasswrod() {
        // basic
        HttpRequestDef.Builder<ResetUserPasswrodRequest, ResetUserPasswrodResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetUserPasswrodRequest.class, ResetUserPasswrodResponse.class)
                .withName("ResetUserPasswrod")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetUserPasswrodRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetUserPasswrodRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<ResetUserPasswrodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetUserPasswrodReq.class),
            f -> f.withMarshaller(ResetUserPasswrodRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstance =
        genForresizeEngineInstance();

    private static HttpRequestDef<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> genForresizeEngineInstance() {
        // basic
        HttpRequestDef.Builder<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResizeEngineInstanceRequest.class, ResizeEngineInstanceResponse.class)
            .withName("ResizeEngineInstance")
            .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/extend")
            .withContentType("application/json");

        // requests
        builder.<ResizeEngineInstanceRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceRequest.EngineEnum.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeEngineInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceReq.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceReq.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartManagerRequest, RestartManagerResponse> restartManager =
        genForrestartManager();

    private static HttpRequestDef<RestartManagerRequest, RestartManagerResponse> genForrestartManager() {
        // basic
        HttpRequestDef.Builder<RestartManagerRequest, RestartManagerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RestartManagerRequest.class, RestartManagerResponse.class)
                .withName("RestartManager")
                .withUri("/v2/{project_id}/instances/{instance_id}/restart-kafka-manager")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartManagerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTask =
        genForshowBackgroundTask();

    private static HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> genForshowBackgroundTask() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackgroundTaskRequest.class, ShowBackgroundTaskResponse.class)
                .withName("ShowBackgroundTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchy =
        genForshowCesHierarchy();

    private static HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> genForshowCesHierarchy() {
        // basic
        HttpRequestDef.Builder<ShowCesHierarchyRequest, ShowCesHierarchyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCesHierarchyRequest.class, ShowCesHierarchyResponse.class)
                .withName("ShowCesHierarchy")
                .withUri("/v2/{project_id}/instances/{instance_id}/ces-hierarchy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCesHierarchyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForshowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForshowCluster() {
        // basic
        HttpRequestDef.Builder<ShowClusterRequest, ShowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterRequest.class, ShowClusterResponse.class)
                .withName("ShowCluster")
                .withUri("/v2/{project_id}/instances/{instance_id}/management/cluster")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCoordinatorsRequest, ShowCoordinatorsResponse> showCoordinators =
        genForshowCoordinators();

    private static HttpRequestDef<ShowCoordinatorsRequest, ShowCoordinatorsResponse> genForshowCoordinators() {
        // basic
        HttpRequestDef.Builder<ShowCoordinatorsRequest, ShowCoordinatorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCoordinatorsRequest.class, ShowCoordinatorsResponse.class)
                .withName("ShowCoordinators")
                .withUri("/v2/{project_id}/instances/{instance_id}/management/coordinators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCoordinatorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfo =
        genForshowEngineInstanceExtendProductInfo();

    private static HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> genForshowEngineInstanceExtendProductInfo() {
        // basic
        HttpRequestDef.Builder<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEngineInstanceExtendProductInfoRequest.class,
                    ShowEngineInstanceExtendProductInfoResponse.class)
                .withName("ShowEngineInstanceExtendProductInfo")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<ShowEngineInstanceExtendProductInfoRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoRequest.EngineEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ShowEngineInstanceExtendProductInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupsRequest, ShowGroupsResponse> showGroups = genForshowGroups();

    private static HttpRequestDef<ShowGroupsRequest, ShowGroupsResponse> genForshowGroups() {
        // basic
        HttpRequestDef.Builder<ShowGroupsRequest, ShowGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupsRequest.class, ShowGroupsResponse.class)
                .withName("ShowGroups")
                .withUri("/v2/{project_id}/instances/{instance_id}/management/groups/{group}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupsRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));

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
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse> showInstanceConfigs =
        genForshowInstanceConfigs();

    private static HttpRequestDef<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse> genForshowInstanceConfigs() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceConfigsRequest.class, ShowInstanceConfigsResponse.class)
                .withName("ShowInstanceConfigs")
                .withUri("/v2/{project_id}/instances/{instance_id}/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfo =
        genForshowInstanceExtendProductInfo();

    private static HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> genForshowInstanceExtendProductInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceExtendProductInfoRequest.class,
                    ShowInstanceExtendProductInfoResponse.class)
                .withName("ShowInstanceExtendProductInfo")
                .withUri("/v2/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ShowInstanceExtendProductInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ShowInstanceExtendProductInfoRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceExtendProductInfoRequest.EngineEnum.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> showInstanceMessages =
        genForshowInstanceMessages();

    private static HttpRequestDef<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> genForshowInstanceMessages() {
        // basic
        HttpRequestDef.Builder<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceMessagesRequest.class, ShowInstanceMessagesResponse.class)
            .withName("ShowInstanceMessages")
            .withUri("/v2/{project_id}/instances/{instance_id}/messages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getAsc, (req, v) -> {
                req.setAsc(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Boolean>withRequestField("download",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getDownload, (req, v) -> {
                req.setDownload(v);
            }));
        builder.<String>withRequestField("message_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getMessageOffset, (req, v) -> {
                req.setMessageOffset(v);
            }));
        builder.<String>withRequestField("partition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> showInstanceTopicDetail =
        genForshowInstanceTopicDetail();

    private static HttpRequestDef<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> genForshowInstanceTopicDetail() {
        // basic
        HttpRequestDef.Builder<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceTopicDetailRequest.class, ShowInstanceTopicDetailResponse.class)
            .withName("ShowInstanceTopicDetail")
            .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceTopicDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceTopicDetailRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceUsersRequest, ShowInstanceUsersResponse> showInstanceUsers =
        genForshowInstanceUsers();

    private static HttpRequestDef<ShowInstanceUsersRequest, ShowInstanceUsersResponse> genForshowInstanceUsers() {
        // basic
        HttpRequestDef.Builder<ShowInstanceUsersRequest, ShowInstanceUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceUsersRequest.class, ShowInstanceUsersResponse.class)
                .withName("ShowInstanceUsers")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> showKafkaProjectTags =
        genForshowKafkaProjectTags();

    private static HttpRequestDef<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> genForshowKafkaProjectTags() {
        // basic
        HttpRequestDef.Builder<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowKafkaProjectTagsRequest.class, ShowKafkaProjectTagsResponse.class)
            .withName("ShowKafkaProjectTags")
            .withUri("/v2/{project_id}/kafka/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKafkaTagsRequest, ShowKafkaTagsResponse> showKafkaTags =
        genForshowKafkaTags();

    private static HttpRequestDef<ShowKafkaTagsRequest, ShowKafkaTagsResponse> genForshowKafkaTags() {
        // basic
        HttpRequestDef.Builder<ShowKafkaTagsRequest, ShowKafkaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKafkaTagsRequest.class, ShowKafkaTagsResponse.class)
                .withName("ShowKafkaTags")
                .withUri("/v2/{project_id}/kafka/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusage =
        genForshowKafkaTopicPartitionDiskusage();

    private static HttpRequestDef<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> genForshowKafkaTopicPartitionDiskusage() {
        // basic
        HttpRequestDef.Builder<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowKafkaTopicPartitionDiskusageRequest.class,
                    ShowKafkaTopicPartitionDiskusageResponse.class)
                .withName("ShowKafkaTopicPartitionDiskusage")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/diskusage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("minSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getMinSize, (req, v) -> {
                req.setMinSize(v);
            }));
        builder.<String>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getTop, (req, v) -> {
                req.setTop(v);
            }));
        builder.<String>withRequestField("percentage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getPercentage, (req, v) -> {
                req.setPercentage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse> showKafkaUserClientQuota =
        genForshowKafkaUserClientQuota();

    private static HttpRequestDef<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse> genForshowKafkaUserClientQuota() {
        // basic
        HttpRequestDef.Builder<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowKafkaUserClientQuotaRequest.class, ShowKafkaUserClientQuotaResponse.class)
                .withName("ShowKafkaUserClientQuota")
                .withUri("/v2/kafka/{project_id}/instances/{instance_id}/kafka-user-client-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaUserClientQuotaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKafkaUserClientQuotaRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKafkaUserClientQuotaRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindows =
        genForshowMaintainWindows();

    private static HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> genForshowMaintainWindows() {
        // basic
        HttpRequestDef.Builder<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMaintainWindowsRequest.class, ShowMaintainWindowsResponse.class)
                .withName("ShowMaintainWindows")
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
                .withName("ShowMessages")
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMessagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("partition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> showPartitionBeginningMessage =
        genForshowPartitionBeginningMessage();

    private static HttpRequestDef<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> genForshowPartitionBeginningMessage() {
        // basic
        HttpRequestDef.Builder<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPartitionBeginningMessageRequest.class,
                    ShowPartitionBeginningMessageResponse.class)
                .withName("ShowPartitionBeginningMessage")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions/{partition}/beginning-message")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<Integer>withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> showPartitionEndMessage =
        genForshowPartitionEndMessage();

    private static HttpRequestDef<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> genForshowPartitionEndMessage() {
        // basic
        HttpRequestDef.Builder<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPartitionEndMessageRequest.class, ShowPartitionEndMessageResponse.class)
            .withName("ShowPartitionEndMessage")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions/{partition}/end-message")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<Integer>withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionMessageRequest, ShowPartitionMessageResponse> showPartitionMessage =
        genForshowPartitionMessage();

    private static HttpRequestDef<ShowPartitionMessageRequest, ShowPartitionMessageResponse> genForshowPartitionMessage() {
        // basic
        HttpRequestDef.Builder<ShowPartitionMessageRequest, ShowPartitionMessageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPartitionMessageRequest.class, ShowPartitionMessageResponse.class)
            .withName("ShowPartitionMessage")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/partitions/{partition}/message")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMessageRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<Integer>withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionMessageRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            }));
        builder.<String>withRequestField("message_offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMessageRequest::getMessageOffset, (req, v) -> {
                req.setMessageOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> showSinkTaskDetail =
        genForshowSinkTaskDetail();

    private static HttpRequestDef<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> genForshowSinkTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowSinkTaskDetailRequest, ShowSinkTaskDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSinkTaskDetailRequest.class, ShowSinkTaskDetailResponse.class)
                .withName("ShowSinkTaskDetail")
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSinkTaskDetailRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSinkTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<ShowSinkTaskDetailRequest.TopicInfoEnum>withRequestField("topic-info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSinkTaskDetailRequest.TopicInfoEnum.class),
            f -> f.withMarshaller(ShowSinkTaskDetailRequest::getTopicInfo, (req, v) -> {
                req.setTopicInfo(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> showTopicAccessPolicy =
        genForshowTopicAccessPolicy();

    private static HttpRequestDef<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> genForshowTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTopicAccessPolicyRequest.class, ShowTopicAccessPolicyResponse.class)
            .withName("ShowTopicAccessPolicy")
            .withUri("/v1/{project_id}/instances/{instance_id}/topics/{topic_name}/accesspolicy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicAccessPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicAccessPolicyRequest::getTopicName, (req, v) -> {
                req.setTopicName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceReq.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopic =
        genForupdateInstanceAutoCreateTopic();

    private static HttpRequestDef<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> genForupdateInstanceAutoCreateTopic() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateInstanceAutoCreateTopicRequest.class,
                    UpdateInstanceAutoCreateTopicResponse.class)
                .withName("UpdateInstanceAutoCreateTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/autotopic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceAutoCreateTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceAutoCreateTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceAutoCreateTopicReq.class),
            f -> f.withMarshaller(UpdateInstanceAutoCreateTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse> updateInstanceConsumerGroup =
        genForupdateInstanceConsumerGroup();

    private static HttpRequestDef<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse> genForupdateInstanceConsumerGroup() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConsumerGroupRequest.class,
                    UpdateInstanceConsumerGroupResponse.class)
                .withName("UpdateInstanceConsumerGroup")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/groups/{group}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));
        builder.<CreateGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupReq.class),
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIp =
        genForupdateInstanceCrossVpcIp();

    private static HttpRequestDef<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> genForupdateInstanceCrossVpcIp() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateInstanceCrossVpcIpRequest.class, UpdateInstanceCrossVpcIpResponse.class)
                .withName("UpdateInstanceCrossVpcIp")
                .withUri("/v2/{project_id}/instances/{instance_id}/crossvpc/modify")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceCrossVpcIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceCrossVpcIpReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceCrossVpcIpReq.class),
            f -> f.withMarshaller(UpdateInstanceCrossVpcIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> updateInstanceTopic =
        genForupdateInstanceTopic();

    private static HttpRequestDef<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> genForupdateInstanceTopic() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceTopicRequest.class, UpdateInstanceTopicResponse.class)
                .withName("UpdateInstanceTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceTopicReq.class),
            f -> f.withMarshaller(UpdateInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceUserRequest, UpdateInstanceUserResponse> updateInstanceUser =
        genForupdateInstanceUser();

    private static HttpRequestDef<UpdateInstanceUserRequest, UpdateInstanceUserResponse> genForupdateInstanceUser() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceUserRequest, UpdateInstanceUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceUserRequest.class, UpdateInstanceUserResponse.class)
                .withName("UpdateInstanceUser")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceUserRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<UpdateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReq.class),
            f -> f.withMarshaller(UpdateInstanceUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse> updateKafkaUserClientQuotaTask =
        genForupdateKafkaUserClientQuotaTask();

    private static HttpRequestDef<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse> genForupdateKafkaUserClientQuotaTask() {
        // basic
        HttpRequestDef.Builder<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateKafkaUserClientQuotaTaskRequest.class,
                    UpdateKafkaUserClientQuotaTaskResponse.class)
                .withName("UpdateKafkaUserClientQuotaTask")
                .withUri("/v2/kafka/{project_id}/instances/{instance_id}/kafka-user-client-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKafkaUserClientQuotaTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateKafkaUserClientQuotaTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKafkaUserClientQuotaTaskReq.class),
            f -> f.withMarshaller(UpdateKafkaUserClientQuotaTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> updateSinkTaskQuota =
        genForupdateSinkTaskQuota();

    private static HttpRequestDef<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> genForupdateSinkTaskQuota() {
        // basic
        HttpRequestDef.Builder<UpdateSinkTaskQuotaRequest, UpdateSinkTaskQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSinkTaskQuotaRequest.class, UpdateSinkTaskQuotaResponse.class)
                .withName("UpdateSinkTaskQuota")
                .withUri("/v2/{project_id}/connectors/{connector_id}/sink-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSinkTaskQuotaRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<UpdateSinkTaskQuotaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSinkTaskQuotaReq.class),
            f -> f.withMarshaller(UpdateSinkTaskQuotaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicy =
        genForupdateTopicAccessPolicy();

    private static HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> genForupdateTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateTopicAccessPolicyRequest.class, UpdateTopicAccessPolicyResponse.class)
            .withName("UpdateTopicAccessPolicy")
            .withUri("/v1/{project_id}/instances/{instance_id}/topics/accesspolicy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateTopicAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicAccessPolicyReq.class),
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> updateTopicReplica =
        genForupdateTopicReplica();

    private static HttpRequestDef<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> genForupdateTopicReplica() {
        // basic
        HttpRequestDef.Builder<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTopicReplicaRequest.class, UpdateTopicReplicaResponse.class)
                .withName("UpdateTopicReplica")
                .withUri("/v2/{project_id}/instances/{instance_id}/management/topics/{topic}/replicas-reassignment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<ResetReplicaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetReplicaReq.class),
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

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
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorReq;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateConnectorTaskResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceReq;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.CreateReassignmentTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.CreateSmartConnectTaskReq;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskReq;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.DeleteKafkaUserClientQuotaTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListConnectorTasksRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListConnectorTasksResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicPartitionsResponse;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersRequest;
import com.huaweicloud.sdk.kafka.v2.model.ListTopicProducersResponse;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsReq;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsRequest;
import com.huaweicloud.sdk.kafka.v2.model.ModifyInstanceConfigsResponse;
import com.huaweicloud.sdk.kafka.v2.model.PartitionReassignRequest;
import com.huaweicloud.sdk.kafka.v2.model.PauseConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.PauseConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordReq;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetManagerPasswordResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetReq;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetWithEngineRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResetMessageOffsetWithEngineResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.RestartConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerRequest;
import com.huaweicloud.sdk.kafka.v2.model.RestartManagerResponse;
import com.huaweicloud.sdk.kafka.v2.model.ResumeConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ResumeConnectorTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageRequest;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageRequestBody;
import com.huaweicloud.sdk.kafka.v2.model.SendKafkaMessageResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterResponse;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorTaskRequest;
import com.huaweicloud.sdk.kafka.v2.model.ShowConnectorTaskResponse;
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
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyReq;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicReplicaRequest;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicReplicaResponse;
import com.huaweicloud.sdk.kafka.v2.model.UpdateUserReq;

@SuppressWarnings("unchecked")
public class KafkaMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> batchCreateOrDeleteKafkaTag =
        genForBatchCreateOrDeleteKafkaTag();

    private static HttpRequestDef<BatchCreateOrDeleteKafkaTagRequest, BatchCreateOrDeleteKafkaTagResponse> genForBatchCreateOrDeleteKafkaTag() {
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
            f -> f.withMarshaller(BatchCreateOrDeleteKafkaTagRequest::getInstanceId,
                BatchCreateOrDeleteKafkaTagRequest::setInstanceId));
        builder.<BatchCreateOrDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagReq.class),
            f -> f.withMarshaller(BatchCreateOrDeleteKafkaTagRequest::getBody,
                BatchCreateOrDeleteKafkaTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteGroupRequest, BatchDeleteGroupResponse> batchDeleteGroup =
        genForBatchDeleteGroup();

    private static HttpRequestDef<BatchDeleteGroupRequest, BatchDeleteGroupResponse> genForBatchDeleteGroup() {
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
            f -> f.withMarshaller(BatchDeleteGroupRequest::getInstanceId, BatchDeleteGroupRequest::setInstanceId));
        builder.<BatchDeleteGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteGroupReq.class),
            f -> f.withMarshaller(BatchDeleteGroupRequest::getBody, BatchDeleteGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> batchDeleteInstanceTopic =
        genForBatchDeleteInstanceTopic();

    private static HttpRequestDef<BatchDeleteInstanceTopicRequest, BatchDeleteInstanceTopicResponse> genForBatchDeleteInstanceTopic() {
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
            f -> f.withMarshaller(BatchDeleteInstanceTopicRequest::getInstanceId,
                BatchDeleteInstanceTopicRequest::setInstanceId));
        builder.<BatchDeleteInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteInstanceTopicReq.class),
            f -> f.withMarshaller(BatchDeleteInstanceTopicRequest::getBody, BatchDeleteInstanceTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> batchDeleteInstanceUsers =
        genForBatchDeleteInstanceUsers();

    private static HttpRequestDef<BatchDeleteInstanceUsersRequest, BatchDeleteInstanceUsersResponse> genForBatchDeleteInstanceUsers() {
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
            f -> f.withMarshaller(BatchDeleteInstanceUsersRequest::getInstanceId,
                BatchDeleteInstanceUsersRequest::setInstanceId));
        builder.<BatchDeleteInstanceUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteInstanceUsersReq.class),
            f -> f.withMarshaller(BatchDeleteInstanceUsersRequest::getBody, BatchDeleteInstanceUsersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstances =
        genForBatchRestartOrDeleteInstances();

    private static HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> genForBatchRestartOrDeleteInstances() {
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
            f -> f.withMarshaller(BatchRestartOrDeleteInstancesRequest::getBody,
                BatchRestartOrDeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloseKafkaManagerRequest, CloseKafkaManagerResponse> closeKafkaManager =
        genForCloseKafkaManager();

    private static HttpRequestDef<CloseKafkaManagerRequest, CloseKafkaManagerResponse> genForCloseKafkaManager() {
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
            f -> f.withMarshaller(CloseKafkaManagerRequest::getInstanceId, CloseKafkaManagerRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> createInstanceByEngine =
        genForCreateInstanceByEngine();

    private static HttpRequestDef<CreateInstanceByEngineRequest, CreateInstanceByEngineResponse> genForCreateInstanceByEngine() {
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
            f -> f.withMarshaller(CreateInstanceByEngineRequest::getEngine, CreateInstanceByEngineRequest::setEngine));
        builder.<CreateInstanceByEngineReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceByEngineReq.class),
            f -> f.withMarshaller(CreateInstanceByEngineRequest::getBody, CreateInstanceByEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceTopicRequest, CreateInstanceTopicResponse> createInstanceTopic =
        genForCreateInstanceTopic();

    private static HttpRequestDef<CreateInstanceTopicRequest, CreateInstanceTopicResponse> genForCreateInstanceTopic() {
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
            f -> f.withMarshaller(CreateInstanceTopicRequest::getInstanceId,
                CreateInstanceTopicRequest::setInstanceId));
        builder.<CreateInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceTopicReq.class),
            f -> f.withMarshaller(CreateInstanceTopicRequest::getBody, CreateInstanceTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceUserRequest, CreateInstanceUserResponse> createInstanceUser =
        genForCreateInstanceUser();

    private static HttpRequestDef<CreateInstanceUserRequest, CreateInstanceUserResponse> genForCreateInstanceUser() {
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
            f -> f.withMarshaller(CreateInstanceUserRequest::getInstanceId, CreateInstanceUserRequest::setInstanceId));
        builder.<CreateInstanceUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceUserReq.class),
            f -> f.withMarshaller(CreateInstanceUserRequest::getBody, CreateInstanceUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse> createKafkaConsumerGroup =
        genForCreateKafkaConsumerGroup();

    private static HttpRequestDef<CreateKafkaConsumerGroupRequest, CreateKafkaConsumerGroupResponse> genForCreateKafkaConsumerGroup() {
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
            f -> f.withMarshaller(CreateKafkaConsumerGroupRequest::getInstanceId,
                CreateKafkaConsumerGroupRequest::setInstanceId));
        builder.<CreateGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupReq.class),
            f -> f.withMarshaller(CreateKafkaConsumerGroupRequest::getBody, CreateKafkaConsumerGroupRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKafkaConsumerGroupResponse::getBody,
                CreateKafkaConsumerGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse> createKafkaUserClientQuotaTask =
        genForCreateKafkaUserClientQuotaTask();

    private static HttpRequestDef<CreateKafkaUserClientQuotaTaskRequest, CreateKafkaUserClientQuotaTaskResponse> genForCreateKafkaUserClientQuotaTask() {
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
            f -> f.withMarshaller(CreateKafkaUserClientQuotaTaskRequest::getInstanceId,
                CreateKafkaUserClientQuotaTaskRequest::setInstanceId));
        builder.<CreateKafkaUserClientQuotaTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKafkaUserClientQuotaTaskReq.class),
            f -> f.withMarshaller(CreateKafkaUserClientQuotaTaskRequest::getBody,
                CreateKafkaUserClientQuotaTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstance =
        genForCreatePostPaidInstance();

    private static HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> genForCreatePostPaidInstance() {
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
            f -> f.withMarshaller(CreatePostPaidInstanceRequest::getBody, CreatePostPaidInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> createReassignmentTask =
        genForCreateReassignmentTask();

    private static HttpRequestDef<CreateReassignmentTaskRequest, CreateReassignmentTaskResponse> genForCreateReassignmentTask() {
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
            f -> f.withMarshaller(CreateReassignmentTaskRequest::getInstanceId,
                CreateReassignmentTaskRequest::setInstanceId));
        builder.<PartitionReassignRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PartitionReassignRequest.class),
            f -> f.withMarshaller(CreateReassignmentTaskRequest::getBody, CreateReassignmentTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTask =
        genForDeleteBackgroundTask();

    private static HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> genForDeleteBackgroundTask() {
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
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getInstanceId,
                DeleteBackgroundTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getTaskId, DeleteBackgroundTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
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
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse> deleteKafkaUserClientQuotaTask =
        genForDeleteKafkaUserClientQuotaTask();

    private static HttpRequestDef<DeleteKafkaUserClientQuotaTaskRequest, DeleteKafkaUserClientQuotaTaskResponse> genForDeleteKafkaUserClientQuotaTask() {
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
            f -> f.withMarshaller(DeleteKafkaUserClientQuotaTaskRequest::getInstanceId,
                DeleteKafkaUserClientQuotaTaskRequest::setInstanceId));
        builder.<DeleteKafkaUserClientQuotaTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteKafkaUserClientQuotaTaskReq.class),
            f -> f.withMarshaller(DeleteKafkaUserClientQuotaTaskRequest::getBody,
                DeleteKafkaUserClientQuotaTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForListAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForListAvailableZones() {
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
        genForListBackgroundTasks();

    private static HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> genForListBackgroundTasks() {
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
            f -> f.withMarshaller(ListBackgroundTasksRequest::getInstanceId,
                ListBackgroundTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getStart, ListBackgroundTasksRequest::setStart));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getLimit, ListBackgroundTasksRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getBeginTime, ListBackgroundTasksRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getEndTime, ListBackgroundTasksRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProducts =
        genForListEngineProducts();

    private static HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> genForListEngineProducts() {
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
            f -> f.withMarshaller(ListEngineProductsRequest::getEngine, ListEngineProductsRequest::setEngine));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getProductId, ListEngineProductsRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> listInstanceConsumerGroups =
        genForListInstanceConsumerGroups();

    private static HttpRequestDef<ListInstanceConsumerGroupsRequest, ListInstanceConsumerGroupsResponse> genForListInstanceConsumerGroups() {
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
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getInstanceId,
                ListInstanceConsumerGroupsRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getOffset,
                ListInstanceConsumerGroupsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getLimit,
                ListInstanceConsumerGroupsRequest::setLimit));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getGroup,
                ListInstanceConsumerGroupsRequest::setGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTopicsRequest, ListInstanceTopicsResponse> listInstanceTopics =
        genForListInstanceTopics();

    private static HttpRequestDef<ListInstanceTopicsRequest, ListInstanceTopicsResponse> genForListInstanceTopics() {
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
            f -> f.withMarshaller(ListInstanceTopicsRequest::getInstanceId, ListInstanceTopicsRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTopicsRequest::getOffset, ListInstanceTopicsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTopicsRequest::getLimit, ListInstanceTopicsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
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
            f -> f.withMarshaller(ListInstancesRequest::getEngine, ListInstancesRequest::setEngine));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, ListInstancesRequest::setInstanceId));
        builder.<ListInstancesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getStatus, ListInstancesRequest::setStatus));
        builder.<ListInstancesRequest.IncludeFailureEnum>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.IncludeFailureEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getIncludeFailure, ListInstancesRequest::setIncludeFailure));
        builder.<ListInstancesRequest.ExactMatchNameEnum>withRequestField("exact_match_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.ExactMatchNameEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getExactMatchName, ListInstancesRequest::setExactMatchName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getEnterpriseProjectId,
                ListInstancesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
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
            f -> f.withMarshaller(ListProductsRequest::getEngine, ListProductsRequest::setEngine));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicPartitionsRequest, ListTopicPartitionsResponse> listTopicPartitions =
        genForListTopicPartitions();

    private static HttpRequestDef<ListTopicPartitionsRequest, ListTopicPartitionsResponse> genForListTopicPartitions() {
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
            f -> f.withMarshaller(ListTopicPartitionsRequest::getInstanceId,
                ListTopicPartitionsRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicPartitionsRequest::getTopic, ListTopicPartitionsRequest::setTopic));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicPartitionsRequest::getOffset, ListTopicPartitionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicPartitionsRequest::getLimit, ListTopicPartitionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicProducersRequest, ListTopicProducersResponse> listTopicProducers =
        genForListTopicProducers();

    private static HttpRequestDef<ListTopicProducersRequest, ListTopicProducersResponse> genForListTopicProducers() {
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
            f -> f.withMarshaller(ListTopicProducersRequest::getInstanceId, ListTopicProducersRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicProducersRequest::getTopic, ListTopicProducersRequest::setTopic));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicProducersRequest::getOffset, ListTopicProducersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicProducersRequest::getLimit, ListTopicProducersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse> modifyInstanceConfigs =
        genForModifyInstanceConfigs();

    private static HttpRequestDef<ModifyInstanceConfigsRequest, ModifyInstanceConfigsResponse> genForModifyInstanceConfigs() {
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
            f -> f.withMarshaller(ModifyInstanceConfigsRequest::getInstanceId,
                ModifyInstanceConfigsRequest::setInstanceId));
        builder.<ModifyInstanceConfigsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyInstanceConfigsReq.class),
            f -> f.withMarshaller(ModifyInstanceConfigsRequest::getBody, ModifyInstanceConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetManagerPasswordRequest, ResetManagerPasswordResponse> resetManagerPassword =
        genForResetManagerPassword();

    private static HttpRequestDef<ResetManagerPasswordRequest, ResetManagerPasswordResponse> genForResetManagerPassword() {
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
            f -> f.withMarshaller(ResetManagerPasswordRequest::getInstanceId,
                ResetManagerPasswordRequest::setInstanceId));
        builder.<ResetManagerPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetManagerPasswordReq.class),
            f -> f.withMarshaller(ResetManagerPasswordRequest::getBody, ResetManagerPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetMessageOffsetRequest, ResetMessageOffsetResponse> resetMessageOffset =
        genForResetMessageOffset();

    private static HttpRequestDef<ResetMessageOffsetRequest, ResetMessageOffsetResponse> genForResetMessageOffset() {
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
            f -> f.withMarshaller(ResetMessageOffsetRequest::getInstanceId, ResetMessageOffsetRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMessageOffsetRequest::getGroup, ResetMessageOffsetRequest::setGroup));
        builder.<ResetMessageOffsetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetMessageOffsetReq.class),
            f -> f.withMarshaller(ResetMessageOffsetRequest::getBody, ResetMessageOffsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetMessageOffsetWithEngineRequest, ResetMessageOffsetWithEngineResponse> resetMessageOffsetWithEngine =
        genForResetMessageOffsetWithEngine();

    private static HttpRequestDef<ResetMessageOffsetWithEngineRequest, ResetMessageOffsetWithEngineResponse> genForResetMessageOffsetWithEngine() {
        // basic
        HttpRequestDef.Builder<ResetMessageOffsetWithEngineRequest, ResetMessageOffsetWithEngineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResetMessageOffsetWithEngineRequest.class,
                    ResetMessageOffsetWithEngineResponse.class)
                .withName("ResetMessageOffsetWithEngine")
                .withUri("/v2/kafka/{project_id}/instances/{instance_id}/groups/{group}/reset-message-offset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMessageOffsetWithEngineRequest::getInstanceId,
                ResetMessageOffsetWithEngineRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMessageOffsetWithEngineRequest::getGroup,
                ResetMessageOffsetWithEngineRequest::setGroup));
        builder.<ResetMessageOffsetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetMessageOffsetReq.class),
            f -> f.withMarshaller(ResetMessageOffsetWithEngineRequest::getBody,
                ResetMessageOffsetWithEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
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
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, ResetPasswordRequest::setInstanceId));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, ResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetUserPasswrodRequest, ResetUserPasswrodResponse> resetUserPasswrod =
        genForResetUserPasswrod();

    private static HttpRequestDef<ResetUserPasswrodRequest, ResetUserPasswrodResponse> genForResetUserPasswrod() {
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
            f -> f.withMarshaller(ResetUserPasswrodRequest::getInstanceId, ResetUserPasswrodRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetUserPasswrodRequest::getUserName, ResetUserPasswrodRequest::setUserName));
        builder.<ResetUserPasswrodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetUserPasswrodReq.class),
            f -> f.withMarshaller(ResetUserPasswrodRequest::getBody, ResetUserPasswrodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstance =
        genForResizeEngineInstance();

    private static HttpRequestDef<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> genForResizeEngineInstance() {
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
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getEngine, ResizeEngineInstanceRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getInstanceId,
                ResizeEngineInstanceRequest::setInstanceId));
        builder.<ResizeEngineInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceReq.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getBody, ResizeEngineInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForResizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForResizeInstance() {
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
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, ResizeInstanceRequest::setInstanceId));
        builder.<ResizeInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceReq.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartManagerRequest, RestartManagerResponse> restartManager =
        genForRestartManager();

    private static HttpRequestDef<RestartManagerRequest, RestartManagerResponse> genForRestartManager() {
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
            f -> f.withMarshaller(RestartManagerRequest::getInstanceId, RestartManagerRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendKafkaMessageRequest, SendKafkaMessageResponse> sendKafkaMessage =
        genForSendKafkaMessage();

    private static HttpRequestDef<SendKafkaMessageRequest, SendKafkaMessageResponse> genForSendKafkaMessage() {
        // basic
        HttpRequestDef.Builder<SendKafkaMessageRequest, SendKafkaMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendKafkaMessageRequest.class, SendKafkaMessageResponse.class)
                .withName("SendKafkaMessage")
                .withUri("/v2/{project_id}/instances/{instance_id}/messages/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendKafkaMessageRequest::getInstanceId, SendKafkaMessageRequest::setInstanceId));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendKafkaMessageRequest::getActionId, SendKafkaMessageRequest::setActionId));
        builder.<SendKafkaMessageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendKafkaMessageRequestBody.class),
            f -> f.withMarshaller(SendKafkaMessageRequest::getBody, SendKafkaMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTask =
        genForShowBackgroundTask();

    private static HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> genForShowBackgroundTask() {
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
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getInstanceId, ShowBackgroundTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getTaskId, ShowBackgroundTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchy =
        genForShowCesHierarchy();

    private static HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> genForShowCesHierarchy() {
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
            f -> f.withMarshaller(ShowCesHierarchyRequest::getInstanceId, ShowCesHierarchyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForShowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForShowCluster() {
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
            f -> f.withMarshaller(ShowClusterRequest::getInstanceId, ShowClusterRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCoordinatorsRequest, ShowCoordinatorsResponse> showCoordinators =
        genForShowCoordinators();

    private static HttpRequestDef<ShowCoordinatorsRequest, ShowCoordinatorsResponse> genForShowCoordinators() {
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
            f -> f.withMarshaller(ShowCoordinatorsRequest::getInstanceId, ShowCoordinatorsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfo =
        genForShowEngineInstanceExtendProductInfo();

    private static HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> genForShowEngineInstanceExtendProductInfo() {
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
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getEngine,
                ShowEngineInstanceExtendProductInfoRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getInstanceId,
                ShowEngineInstanceExtendProductInfoRequest::setInstanceId));
        builder.<ShowEngineInstanceExtendProductInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getType,
                ShowEngineInstanceExtendProductInfoRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupsRequest, ShowGroupsResponse> showGroups = genForShowGroups();

    private static HttpRequestDef<ShowGroupsRequest, ShowGroupsResponse> genForShowGroups() {
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
            f -> f.withMarshaller(ShowGroupsRequest::getInstanceId, ShowGroupsRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupsRequest::getGroup, ShowGroupsRequest::setGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
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
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse> showInstanceConfigs =
        genForShowInstanceConfigs();

    private static HttpRequestDef<ShowInstanceConfigsRequest, ShowInstanceConfigsResponse> genForShowInstanceConfigs() {
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
            f -> f.withMarshaller(ShowInstanceConfigsRequest::getInstanceId,
                ShowInstanceConfigsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfo =
        genForShowInstanceExtendProductInfo();

    private static HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> genForShowInstanceExtendProductInfo() {
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
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getInstanceId,
                ShowInstanceExtendProductInfoRequest::setInstanceId));
        builder.<ShowInstanceExtendProductInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getType,
                ShowInstanceExtendProductInfoRequest::setType));
        builder.<ShowInstanceExtendProductInfoRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceExtendProductInfoRequest.EngineEnum.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getEngine,
                ShowInstanceExtendProductInfoRequest::setEngine));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> showInstanceMessages =
        genForShowInstanceMessages();

    private static HttpRequestDef<ShowInstanceMessagesRequest, ShowInstanceMessagesResponse> genForShowInstanceMessages() {
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
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getInstanceId,
                ShowInstanceMessagesRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getTopic, ShowInstanceMessagesRequest::setTopic));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getAsc, ShowInstanceMessagesRequest::setAsc));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getStartTime,
                ShowInstanceMessagesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getEndTime, ShowInstanceMessagesRequest::setEndTime));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getLimit, ShowInstanceMessagesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getOffset, ShowInstanceMessagesRequest::setOffset));
        builder.<Boolean>withRequestField("download",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getDownload, ShowInstanceMessagesRequest::setDownload));
        builder.<String>withRequestField("message_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getMessageOffset,
                ShowInstanceMessagesRequest::setMessageOffset));
        builder.<String>withRequestField("partition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getPartition,
                ShowInstanceMessagesRequest::setPartition));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMessagesRequest::getKeyword, ShowInstanceMessagesRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> showInstanceTopicDetail =
        genForShowInstanceTopicDetail();

    private static HttpRequestDef<ShowInstanceTopicDetailRequest, ShowInstanceTopicDetailResponse> genForShowInstanceTopicDetail() {
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
            f -> f.withMarshaller(ShowInstanceTopicDetailRequest::getInstanceId,
                ShowInstanceTopicDetailRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceTopicDetailRequest::getTopic, ShowInstanceTopicDetailRequest::setTopic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceUsersRequest, ShowInstanceUsersResponse> showInstanceUsers =
        genForShowInstanceUsers();

    private static HttpRequestDef<ShowInstanceUsersRequest, ShowInstanceUsersResponse> genForShowInstanceUsers() {
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
            f -> f.withMarshaller(ShowInstanceUsersRequest::getInstanceId, ShowInstanceUsersRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> showKafkaProjectTags =
        genForShowKafkaProjectTags();

    private static HttpRequestDef<ShowKafkaProjectTagsRequest, ShowKafkaProjectTagsResponse> genForShowKafkaProjectTags() {
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
        genForShowKafkaTags();

    private static HttpRequestDef<ShowKafkaTagsRequest, ShowKafkaTagsResponse> genForShowKafkaTags() {
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
            f -> f.withMarshaller(ShowKafkaTagsRequest::getInstanceId, ShowKafkaTagsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> showKafkaTopicPartitionDiskusage =
        genForShowKafkaTopicPartitionDiskusage();

    private static HttpRequestDef<ShowKafkaTopicPartitionDiskusageRequest, ShowKafkaTopicPartitionDiskusageResponse> genForShowKafkaTopicPartitionDiskusage() {
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
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getInstanceId,
                ShowKafkaTopicPartitionDiskusageRequest::setInstanceId));
        builder.<String>withRequestField("minSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getMinSize,
                ShowKafkaTopicPartitionDiskusageRequest::setMinSize));
        builder.<String>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getTop,
                ShowKafkaTopicPartitionDiskusageRequest::setTop));
        builder.<String>withRequestField("percentage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKafkaTopicPartitionDiskusageRequest::getPercentage,
                ShowKafkaTopicPartitionDiskusageRequest::setPercentage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse> showKafkaUserClientQuota =
        genForShowKafkaUserClientQuota();

    private static HttpRequestDef<ShowKafkaUserClientQuotaRequest, ShowKafkaUserClientQuotaResponse> genForShowKafkaUserClientQuota() {
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
            f -> f.withMarshaller(ShowKafkaUserClientQuotaRequest::getInstanceId,
                ShowKafkaUserClientQuotaRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKafkaUserClientQuotaRequest::getOffset,
                ShowKafkaUserClientQuotaRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKafkaUserClientQuotaRequest::getLimit,
                ShowKafkaUserClientQuotaRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindows =
        genForShowMaintainWindows();

    private static HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> genForShowMaintainWindows() {
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

    public static final HttpRequestDef<ShowMessagesRequest, ShowMessagesResponse> showMessages = genForShowMessages();

    private static HttpRequestDef<ShowMessagesRequest, ShowMessagesResponse> genForShowMessages() {
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
            f -> f.withMarshaller(ShowMessagesRequest::getInstanceId, ShowMessagesRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getTopic, ShowMessagesRequest::setTopic));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getStartTime, ShowMessagesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getEndTime, ShowMessagesRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMessagesRequest::getLimit, ShowMessagesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMessagesRequest::getOffset, ShowMessagesRequest::setOffset));
        builder.<String>withRequestField("partition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMessagesRequest::getPartition, ShowMessagesRequest::setPartition));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> showPartitionBeginningMessage =
        genForShowPartitionBeginningMessage();

    private static HttpRequestDef<ShowPartitionBeginningMessageRequest, ShowPartitionBeginningMessageResponse> genForShowPartitionBeginningMessage() {
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
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getInstanceId,
                ShowPartitionBeginningMessageRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getTopic,
                ShowPartitionBeginningMessageRequest::setTopic));
        builder.<Integer>withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionBeginningMessageRequest::getPartition,
                ShowPartitionBeginningMessageRequest::setPartition));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> showPartitionEndMessage =
        genForShowPartitionEndMessage();

    private static HttpRequestDef<ShowPartitionEndMessageRequest, ShowPartitionEndMessageResponse> genForShowPartitionEndMessage() {
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
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getInstanceId,
                ShowPartitionEndMessageRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getTopic, ShowPartitionEndMessageRequest::setTopic));
        builder.<Integer>withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionEndMessageRequest::getPartition,
                ShowPartitionEndMessageRequest::setPartition));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionMessageRequest, ShowPartitionMessageResponse> showPartitionMessage =
        genForShowPartitionMessage();

    private static HttpRequestDef<ShowPartitionMessageRequest, ShowPartitionMessageResponse> genForShowPartitionMessage() {
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
            f -> f.withMarshaller(ShowPartitionMessageRequest::getInstanceId,
                ShowPartitionMessageRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMessageRequest::getTopic, ShowPartitionMessageRequest::setTopic));
        builder.<Integer>withRequestField("partition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPartitionMessageRequest::getPartition,
                ShowPartitionMessageRequest::setPartition));
        builder.<String>withRequestField("message_offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMessageRequest::getMessageOffset,
                ShowPartitionMessageRequest::setMessageOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> showTopicAccessPolicy =
        genForShowTopicAccessPolicy();

    private static HttpRequestDef<ShowTopicAccessPolicyRequest, ShowTopicAccessPolicyResponse> genForShowTopicAccessPolicy() {
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
            f -> f.withMarshaller(ShowTopicAccessPolicyRequest::getInstanceId,
                ShowTopicAccessPolicyRequest::setInstanceId));
        builder.<String>withRequestField("topic_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicAccessPolicyRequest::getTopicName,
                ShowTopicAccessPolicyRequest::setTopicName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
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
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));
        builder.<UpdateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceReq.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> updateInstanceAutoCreateTopic =
        genForUpdateInstanceAutoCreateTopic();

    private static HttpRequestDef<UpdateInstanceAutoCreateTopicRequest, UpdateInstanceAutoCreateTopicResponse> genForUpdateInstanceAutoCreateTopic() {
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
            f -> f.withMarshaller(UpdateInstanceAutoCreateTopicRequest::getInstanceId,
                UpdateInstanceAutoCreateTopicRequest::setInstanceId));
        builder.<UpdateInstanceAutoCreateTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceAutoCreateTopicReq.class),
            f -> f.withMarshaller(UpdateInstanceAutoCreateTopicRequest::getBody,
                UpdateInstanceAutoCreateTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse> updateInstanceConsumerGroup =
        genForUpdateInstanceConsumerGroup();

    private static HttpRequestDef<UpdateInstanceConsumerGroupRequest, UpdateInstanceConsumerGroupResponse> genForUpdateInstanceConsumerGroup() {
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
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getEngine,
                UpdateInstanceConsumerGroupRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getInstanceId,
                UpdateInstanceConsumerGroupRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getGroup,
                UpdateInstanceConsumerGroupRequest::setGroup));
        builder.<CreateGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupReq.class),
            f -> f.withMarshaller(UpdateInstanceConsumerGroupRequest::getBody,
                UpdateInstanceConsumerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> updateInstanceCrossVpcIp =
        genForUpdateInstanceCrossVpcIp();

    private static HttpRequestDef<UpdateInstanceCrossVpcIpRequest, UpdateInstanceCrossVpcIpResponse> genForUpdateInstanceCrossVpcIp() {
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
            f -> f.withMarshaller(UpdateInstanceCrossVpcIpRequest::getInstanceId,
                UpdateInstanceCrossVpcIpRequest::setInstanceId));
        builder.<UpdateInstanceCrossVpcIpReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceCrossVpcIpReq.class),
            f -> f.withMarshaller(UpdateInstanceCrossVpcIpRequest::getBody, UpdateInstanceCrossVpcIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> updateInstanceTopic =
        genForUpdateInstanceTopic();

    private static HttpRequestDef<UpdateInstanceTopicRequest, UpdateInstanceTopicResponse> genForUpdateInstanceTopic() {
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
            f -> f.withMarshaller(UpdateInstanceTopicRequest::getInstanceId,
                UpdateInstanceTopicRequest::setInstanceId));
        builder.<UpdateInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceTopicReq.class),
            f -> f.withMarshaller(UpdateInstanceTopicRequest::getBody, UpdateInstanceTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceUserRequest, UpdateInstanceUserResponse> updateInstanceUser =
        genForUpdateInstanceUser();

    private static HttpRequestDef<UpdateInstanceUserRequest, UpdateInstanceUserResponse> genForUpdateInstanceUser() {
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
            f -> f.withMarshaller(UpdateInstanceUserRequest::getEngine, UpdateInstanceUserRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceUserRequest::getInstanceId, UpdateInstanceUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceUserRequest::getUserName, UpdateInstanceUserRequest::setUserName));
        builder.<UpdateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReq.class),
            f -> f.withMarshaller(UpdateInstanceUserRequest::getBody, UpdateInstanceUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse> updateKafkaUserClientQuotaTask =
        genForUpdateKafkaUserClientQuotaTask();

    private static HttpRequestDef<UpdateKafkaUserClientQuotaTaskRequest, UpdateKafkaUserClientQuotaTaskResponse> genForUpdateKafkaUserClientQuotaTask() {
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
            f -> f.withMarshaller(UpdateKafkaUserClientQuotaTaskRequest::getInstanceId,
                UpdateKafkaUserClientQuotaTaskRequest::setInstanceId));
        builder.<UpdateKafkaUserClientQuotaTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKafkaUserClientQuotaTaskReq.class),
            f -> f.withMarshaller(UpdateKafkaUserClientQuotaTaskRequest::getBody,
                UpdateKafkaUserClientQuotaTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicy =
        genForUpdateTopicAccessPolicy();

    private static HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> genForUpdateTopicAccessPolicy() {
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
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getInstanceId,
                UpdateTopicAccessPolicyRequest::setInstanceId));
        builder.<UpdateTopicAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicAccessPolicyReq.class),
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getBody, UpdateTopicAccessPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> updateTopicReplica =
        genForUpdateTopicReplica();

    private static HttpRequestDef<UpdateTopicReplicaRequest, UpdateTopicReplicaResponse> genForUpdateTopicReplica() {
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
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getInstanceId, UpdateTopicReplicaRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getTopic, UpdateTopicReplicaRequest::setTopic));
        builder.<ResetReplicaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetReplicaReq.class),
            f -> f.withMarshaller(UpdateTopicReplicaRequest::getBody, UpdateTopicReplicaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectorRequest, CreateConnectorResponse> createConnector =
        genForCreateConnector();

    private static HttpRequestDef<CreateConnectorRequest, CreateConnectorResponse> genForCreateConnector() {
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
            f -> f.withMarshaller(CreateConnectorRequest::getInstanceId, CreateConnectorRequest::setInstanceId));
        builder.<CreateConnectorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectorReq.class),
            f -> f.withMarshaller(CreateConnectorRequest::getBody, CreateConnectorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectorTaskRequest, CreateConnectorTaskResponse> createConnectorTask =
        genForCreateConnectorTask();

    private static HttpRequestDef<CreateConnectorTaskRequest, CreateConnectorTaskResponse> genForCreateConnectorTask() {
        // basic
        HttpRequestDef.Builder<CreateConnectorTaskRequest, CreateConnectorTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectorTaskRequest.class, CreateConnectorTaskResponse.class)
                .withName("CreateConnectorTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/connector/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectorTaskRequest::getInstanceId,
                CreateConnectorTaskRequest::setInstanceId));
        builder.<CreateSmartConnectTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSmartConnectTaskReq.class),
            f -> f.withMarshaller(CreateConnectorTaskRequest::getBody, CreateConnectorTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectorRequest, DeleteConnectorResponse> deleteConnector =
        genForDeleteConnector();

    private static HttpRequestDef<DeleteConnectorRequest, DeleteConnectorResponse> genForDeleteConnector() {
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
            f -> f.withMarshaller(DeleteConnectorRequest::getInstanceId, DeleteConnectorRequest::setInstanceId));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteConnectorRequest::getBody, DeleteConnectorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectorTaskRequest, DeleteConnectorTaskResponse> deleteConnectorTask =
        genForDeleteConnectorTask();

    private static HttpRequestDef<DeleteConnectorTaskRequest, DeleteConnectorTaskResponse> genForDeleteConnectorTask() {
        // basic
        HttpRequestDef.Builder<DeleteConnectorTaskRequest, DeleteConnectorTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConnectorTaskRequest.class, DeleteConnectorTaskResponse.class)
            .withName("DeleteConnectorTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/connector/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorTaskRequest::getInstanceId,
                DeleteConnectorTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectorTaskRequest::getTaskId, DeleteConnectorTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectorTasksRequest, ListConnectorTasksResponse> listConnectorTasks =
        genForListConnectorTasks();

    private static HttpRequestDef<ListConnectorTasksRequest, ListConnectorTasksResponse> genForListConnectorTasks() {
        // basic
        HttpRequestDef.Builder<ListConnectorTasksRequest, ListConnectorTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectorTasksRequest.class, ListConnectorTasksResponse.class)
                .withName("ListConnectorTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/connector/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectorTasksRequest::getInstanceId, ListConnectorTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorTasksRequest::getOffset, ListConnectorTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectorTasksRequest::getLimit, ListConnectorTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseConnectorTaskRequest, PauseConnectorTaskResponse> pauseConnectorTask =
        genForPauseConnectorTask();

    private static HttpRequestDef<PauseConnectorTaskRequest, PauseConnectorTaskResponse> genForPauseConnectorTask() {
        // basic
        HttpRequestDef.Builder<PauseConnectorTaskRequest, PauseConnectorTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, PauseConnectorTaskRequest.class, PauseConnectorTaskResponse.class)
                .withName("PauseConnectorTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/connector/tasks/{task_id}/pause")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseConnectorTaskRequest::getInstanceId, PauseConnectorTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseConnectorTaskRequest::getTaskId, PauseConnectorTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartConnectorTaskRequest, RestartConnectorTaskResponse> restartConnectorTask =
        genForRestartConnectorTask();

    private static HttpRequestDef<RestartConnectorTaskRequest, RestartConnectorTaskResponse> genForRestartConnectorTask() {
        // basic
        HttpRequestDef.Builder<RestartConnectorTaskRequest, RestartConnectorTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RestartConnectorTaskRequest.class, RestartConnectorTaskResponse.class)
            .withName("RestartConnectorTask")
            .withUri("/v2/{project_id}/kafka/instances/{instance_id}/connector/tasks/{task_id}/restart")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartConnectorTaskRequest::getInstanceId,
                RestartConnectorTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartConnectorTaskRequest::getTaskId, RestartConnectorTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResumeConnectorTaskRequest, ResumeConnectorTaskResponse> resumeConnectorTask =
        genForResumeConnectorTask();

    private static HttpRequestDef<ResumeConnectorTaskRequest, ResumeConnectorTaskResponse> genForResumeConnectorTask() {
        // basic
        HttpRequestDef.Builder<ResumeConnectorTaskRequest, ResumeConnectorTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResumeConnectorTaskRequest.class, ResumeConnectorTaskResponse.class)
                .withName("ResumeConnectorTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/connector/tasks/{task_id}/resume")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeConnectorTaskRequest::getInstanceId,
                ResumeConnectorTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeConnectorTaskRequest::getTaskId, ResumeConnectorTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectorTaskRequest, ShowConnectorTaskResponse> showConnectorTask =
        genForShowConnectorTask();

    private static HttpRequestDef<ShowConnectorTaskRequest, ShowConnectorTaskResponse> genForShowConnectorTask() {
        // basic
        HttpRequestDef.Builder<ShowConnectorTaskRequest, ShowConnectorTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectorTaskRequest.class, ShowConnectorTaskResponse.class)
                .withName("ShowConnectorTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/connector/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorTaskRequest::getInstanceId, ShowConnectorTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorTaskRequest::getTaskId, ShowConnectorTaskRequest::setTaskId));

        // response

        return builder.build();
    }

}

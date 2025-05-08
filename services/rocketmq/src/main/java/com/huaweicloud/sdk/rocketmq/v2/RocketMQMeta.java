package com.huaweicloud.sdk.rocketmq.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteRocketmqTagResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchCreateOrDeleteTagReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupReq;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.BatchUpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateConsumerGroupOrBatchDeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateInstanceByEngineResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicReq;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateTopicOrBatchDeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.CreateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeadletterResendReq;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.EnableDnsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ExportDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListBrokersResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumeGroupAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListConsumerGroupOfTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstanceConsumerGroupsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessageTraceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListMessagesResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketInstanceTopicsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListRocketMqMigrationTaskResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListTopicAccessPolicyResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.Message;
import com.huaweicloud.sdk.rocketmq.v2.model.MetadataDeleteReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ModifyConfigReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ResendReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResetConsumeOffsetResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeEngineInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.RestartInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.RestartInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.SendDlqMessageResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerConnectionsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowConsumerListOrDetailsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowOneTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqProjectTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowRocketmqTagsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowTopicStatusResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ShowUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroup;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateConsumerGroupResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceReq;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateRocketMqConfigsResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicReq;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateTopicResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.UpdateUserResponse;
import com.huaweicloud.sdk.rocketmq.v2.model.User;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageRequest;
import com.huaweicloud.sdk.rocketmq.v2.model.ValidateConsumedMessageResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class RocketMQMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> batchCreateOrDeleteRocketmqTag =
        genForBatchCreateOrDeleteRocketmqTag();

    private static HttpRequestDef<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> genForBatchCreateOrDeleteRocketmqTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteRocketmqTagRequest, BatchCreateOrDeleteRocketmqTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateOrDeleteRocketmqTagRequest.class,
                    BatchCreateOrDeleteRocketmqTagResponse.class)
                .withName("BatchCreateOrDeleteRocketmqTag")
                .withUri("/v2/{project_id}/rocketmq/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteRocketmqTagRequest::getInstanceId,
                BatchCreateOrDeleteRocketmqTagRequest::setInstanceId));
        builder.<BatchCreateOrDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagReq.class),
            f -> f.withMarshaller(BatchCreateOrDeleteRocketmqTagRequest::getBody,
                BatchCreateOrDeleteRocketmqTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstances =
        genForBatchDeleteInstances();

    private static HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> genForBatchDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteInstancesRequest.class, BatchDeleteInstancesResponse.class)
            .withName("BatchDeleteInstances")
            .withUri("/v2/{project_id}/instances/action")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteInstanceReq.class),
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getBody, BatchDeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroup =
        genForBatchUpdateConsumerGroup();

    private static HttpRequestDef<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> genForBatchUpdateConsumerGroup() {
        // basic
        HttpRequestDef.Builder<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, BatchUpdateConsumerGroupRequest.class, BatchUpdateConsumerGroupResponse.class)
                .withName("BatchUpdateConsumerGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateConsumerGroupRequest::getInstanceId,
                BatchUpdateConsumerGroupRequest::setInstanceId));
        builder.<BatchUpdateConsumerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateConsumerGroupReq.class),
            f -> f.withMarshaller(BatchUpdateConsumerGroupRequest::getBody, BatchUpdateConsumerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroup =
        genForCreateConsumerGroupOrBatchDeleteConsumerGroup();

    private static HttpRequestDef<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> genForCreateConsumerGroupOrBatchDeleteConsumerGroup() {
        // basic
        HttpRequestDef.Builder<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateConsumerGroupOrBatchDeleteConsumerGroupRequest.class,
                    CreateConsumerGroupOrBatchDeleteConsumerGroupResponse.class)
                .withName("CreateConsumerGroupOrBatchDeleteConsumerGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getInstanceId,
                CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getAction,
                CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::setAction));
        builder.<CreateConsumerGroupOrBatchDeleteConsumerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConsumerGroupOrBatchDeleteConsumerGroupReq.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getBody,
                CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::setBody));

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

    public static final HttpRequestDef<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> createRocketMqMigrationTask =
        genForCreateRocketMqMigrationTask();

    private static HttpRequestDef<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> genForCreateRocketMqMigrationTask() {
        // basic
        HttpRequestDef.Builder<CreateRocketMqMigrationTaskRequest, CreateRocketMqMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRocketMqMigrationTaskRequest.class,
                    CreateRocketMqMigrationTaskResponse.class)
                .withName("CreateRocketMqMigrationTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getInstanceId,
                CreateRocketMqMigrationTaskRequest::setInstanceId));
        builder.<CreateRocketMqMigrationTaskRequest.OverwriteEnum>withRequestField("overwrite",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRocketMqMigrationTaskRequest.OverwriteEnum.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getOverwrite,
                CreateRocketMqMigrationTaskRequest::setOverwrite));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getName,
                CreateRocketMqMigrationTaskRequest::setName));
        builder.<CreateRocketMqMigrationTaskRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRocketMqMigrationTaskRequest.TypeEnum.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getType,
                CreateRocketMqMigrationTaskRequest::setType));
        builder.<CreateRocketMqMigrationTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRocketMqMigrationTaskReq.class),
            f -> f.withMarshaller(CreateRocketMqMigrationTaskRequest::getBody,
                CreateRocketMqMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForCreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForCreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRequest::getInstanceId, CreateUserRequest::setInstanceId));
        builder.<User>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(User.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, CreateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroup =
        genForDeleteConsumerGroup();

    private static HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> genForDeleteConsumerGroup() {
        // basic
        HttpRequestDef.Builder<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConsumerGroupRequest.class, DeleteConsumerGroupResponse.class)
            .withName("DeleteConsumerGroup")
            .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getInstanceId,
                DeleteConsumerGroupRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getGroup, DeleteConsumerGroupRequest::setGroup));

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

    public static final HttpRequestDef<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse> deleteRocketMqMigrationTask =
        genForDeleteRocketMqMigrationTask();

    private static HttpRequestDef<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse> genForDeleteRocketMqMigrationTask() {
        // basic
        HttpRequestDef.Builder<DeleteRocketMqMigrationTaskRequest, DeleteRocketMqMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRocketMqMigrationTaskRequest.class,
                    DeleteRocketMqMigrationTaskResponse.class)
                .withName("DeleteRocketMqMigrationTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRocketMqMigrationTaskRequest::getInstanceId,
                DeleteRocketMqMigrationTaskRequest::setInstanceId));
        builder.<MetadataDeleteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetadataDeleteReq.class),
            f -> f.withMarshaller(DeleteRocketMqMigrationTaskRequest::getBody,
                DeleteRocketMqMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getInstanceId, DeleteUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserName, DeleteUserRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDnsRequest, EnableDnsResponse> enableDns = genForEnableDns();

    private static HttpRequestDef<EnableDnsRequest, EnableDnsResponse> genForEnableDns() {
        // basic
        HttpRequestDef.Builder<EnableDnsRequest, EnableDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableDnsRequest.class, EnableDnsResponse.class)
                .withName("EnableDns")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/dns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDnsRequest::getInstanceId, EnableDnsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDlqMessageRequest, ExportDlqMessageResponse> exportDlqMessage =
        genForExportDlqMessage();

    private static HttpRequestDef<ExportDlqMessageRequest, ExportDlqMessageResponse> genForExportDlqMessage() {
        // basic
        HttpRequestDef.Builder<ExportDlqMessageRequest, ExportDlqMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportDlqMessageRequest.class, ExportDlqMessageResponse.class)
                .withName("ExportDlqMessage")
                .withUri("/v2/{project_id}/instances/{instance_id}/messages/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDlqMessageRequest::getInstanceId, ExportDlqMessageRequest::setInstanceId));
        builder.<ExportDlqMessageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportDlqMessageReq.class),
            f -> f.withMarshaller(ExportDlqMessageRequest::getBody, ExportDlqMessageRequest::setBody));

        // response
        builder.<List<Message>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ExportDlqMessageResponse::getBody, ExportDlqMessageResponse::setBody)
                .withInnerContainerType(Message.class));

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

    public static final HttpRequestDef<ListBrokersRequest, ListBrokersResponse> listBrokers = genForListBrokers();

    private static HttpRequestDef<ListBrokersRequest, ListBrokersResponse> genForListBrokers() {
        // basic
        HttpRequestDef.Builder<ListBrokersRequest, ListBrokersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBrokersRequest.class, ListBrokersResponse.class)
                .withName("ListBrokers")
                .withUri("/v2/{project_id}/instances/{instance_id}/brokers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBrokersRequest::getInstanceId, ListBrokersRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBrokersRequest::getLimit, ListBrokersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBrokersRequest::getOffset, ListBrokersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicy =
        genForListConsumeGroupAccessPolicy();

    private static HttpRequestDef<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> genForListConsumeGroupAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConsumeGroupAccessPolicyRequest.class,
                    ListConsumeGroupAccessPolicyResponse.class)
                .withName("ListConsumeGroupAccessPolicy")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/groups/{group_id}/accesspolicy")
                .withContentType("application/json");

        // requests
        builder.<ListConsumeGroupAccessPolicyRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConsumeGroupAccessPolicyRequest.EngineEnum.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getEngine,
                ListConsumeGroupAccessPolicyRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getInstanceId,
                ListConsumeGroupAccessPolicyRequest::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getGroupId,
                ListConsumeGroupAccessPolicyRequest::setGroupId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getOffset,
                ListConsumeGroupAccessPolicyRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getLimit,
                ListConsumeGroupAccessPolicyRequest::setLimit));

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
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getEngine, ListEngineProductsRequest::setEngine));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getType, ListEngineProductsRequest::setType));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getProductId, ListEngineProductsRequest::setProductId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getLimit, ListEngineProductsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getOffset, ListEngineProductsRequest::setOffset));

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
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getGroup,
                ListInstanceConsumerGroupsRequest::setGroup));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getLimit,
                ListInstanceConsumerGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getOffset,
                ListInstanceConsumerGroupsRequest::setOffset));

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
            FieldExistence.NON_NULL_NON_EMPTY,
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
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTraceRequest, ListMessageTraceResponse> listMessageTrace =
        genForListMessageTrace();

    private static HttpRequestDef<ListMessageTraceRequest, ListMessageTraceResponse> genForListMessageTrace() {
        // basic
        HttpRequestDef.Builder<ListMessageTraceRequest, ListMessageTraceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessageTraceRequest.class, ListMessageTraceResponse.class)
                .withName("ListMessageTrace")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/trace")
                .withContentType("application/json");

        // requests
        builder.<ListMessageTraceRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMessageTraceRequest.EngineEnum.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getEngine, ListMessageTraceRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getInstanceId, ListMessageTraceRequest::setInstanceId));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getMsgId, ListMessageTraceRequest::setMsgId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getLimit, ListMessageTraceRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getOffset, ListMessageTraceRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessagesRequest, ListMessagesResponse> listMessages = genForListMessages();

    private static HttpRequestDef<ListMessagesRequest, ListMessagesResponse> genForListMessages() {
        // basic
        HttpRequestDef.Builder<ListMessagesRequest, ListMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessagesRequest.class, ListMessagesResponse.class)
                .withName("ListMessages")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<ListMessagesRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMessagesRequest.EngineEnum.class),
            f -> f.withMarshaller(ListMessagesRequest::getEngine, ListMessagesRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getInstanceId, ListMessagesRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getTopic, ListMessagesRequest::setTopic));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getLimit, ListMessagesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getOffset, ListMessagesRequest::setOffset));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getKey, ListMessagesRequest::setKey));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getStartTime, ListMessagesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getEndTime, ListMessagesRequest::setEndTime));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getMsgId, ListMessagesRequest::setMsgId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> listRocketMqMigrationTask =
        genForListRocketMqMigrationTask();

    private static HttpRequestDef<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> genForListRocketMqMigrationTask() {
        // basic
        HttpRequestDef.Builder<ListRocketMqMigrationTaskRequest, ListRocketMqMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRocketMqMigrationTaskRequest.class,
                    ListRocketMqMigrationTaskResponse.class)
                .withName("ListRocketMqMigrationTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getInstanceId,
                ListRocketMqMigrationTaskRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getId, ListRocketMqMigrationTaskRequest::setId));
        builder.<ListRocketMqMigrationTaskRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRocketMqMigrationTaskRequest.TypeEnum.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getType,
                ListRocketMqMigrationTaskRequest::setType));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getOffset,
                ListRocketMqMigrationTaskRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getLimit,
                ListRocketMqMigrationTaskRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketMqMigrationTaskRequest::getName,
                ListRocketMqMigrationTaskRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> listTopicAccessPolicy =
        genForListTopicAccessPolicy();

    private static HttpRequestDef<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> genForListTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTopicAccessPolicyRequest.class, ListTopicAccessPolicyResponse.class)
            .withName("ListTopicAccessPolicy")
            .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}/accesspolicy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getInstanceId,
                ListTopicAccessPolicyRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getTopic, ListTopicAccessPolicyRequest::setTopic));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getOffset, ListTopicAccessPolicyRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getLimit, ListTopicAccessPolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRequest, ListUserResponse> listUser = genForListUser();

    private static HttpRequestDef<ListUserRequest, ListUserResponse> genForListUser() {
        // basic
        HttpRequestDef.Builder<ListUserRequest, ListUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserRequest.class, ListUserResponse.class)
                .withName("ListUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getInstanceId, ListUserRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getOffset, ListUserRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getLimit, ListUserRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> resetConsumeOffset =
        genForResetConsumeOffset();

    private static HttpRequestDef<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> genForResetConsumeOffset() {
        // basic
        HttpRequestDef.Builder<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetConsumeOffsetRequest.class, ResetConsumeOffsetResponse.class)
                .withName("ResetConsumeOffset")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/groups/{group_id}/reset-message-offset")
                .withContentType("application/json");

        // requests
        builder.<ResetConsumeOffsetRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetConsumeOffsetRequest.EngineEnum.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getEngine, ResetConsumeOffsetRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getInstanceId, ResetConsumeOffsetRequest::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getGroupId, ResetConsumeOffsetRequest::setGroupId));
        builder.<ResetConsumeOffsetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetConsumeOffsetReq.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getBody, ResetConsumeOffsetRequest::setBody));

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
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getEngine, ResizeInstanceRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, ResizeInstanceRequest::setInstanceId));
        builder.<ResizeEngineInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceReq.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> restartInstance =
        genForRestartInstance();

    private static HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> genForRestartInstance() {
        // basic
        HttpRequestDef.Builder<RestartInstanceRequest, RestartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartInstanceRequest.class, RestartInstanceResponse.class)
                .withName("RestartInstance")
                .withUri("/v2/{project_id}/{engine}/instances/{instance_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartInstanceRequest::getEngine, RestartInstanceRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartInstanceRequest::getInstanceId, RestartInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendDlqMessageRequest, SendDlqMessageResponse> sendDlqMessage =
        genForSendDlqMessage();

    private static HttpRequestDef<SendDlqMessageRequest, SendDlqMessageResponse> genForSendDlqMessage() {
        // basic
        HttpRequestDef.Builder<SendDlqMessageRequest, SendDlqMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendDlqMessageRequest.class, SendDlqMessageResponse.class)
                .withName("SendDlqMessage")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/messages/deadletter-resend")
                .withContentType("application/json");

        // requests
        builder.<SendDlqMessageRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendDlqMessageRequest.EngineEnum.class),
            f -> f.withMarshaller(SendDlqMessageRequest::getEngine, SendDlqMessageRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendDlqMessageRequest::getInstanceId, SendDlqMessageRequest::setInstanceId));
        builder.<DeadletterResendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeadletterResendReq.class),
            f -> f.withMarshaller(SendDlqMessageRequest::getBody, SendDlqMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> showConsumerConnections =
        genForShowConsumerConnections();

    private static HttpRequestDef<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> genForShowConsumerConnections() {
        // basic
        HttpRequestDef.Builder<ShowConsumerConnectionsRequest, ShowConsumerConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConsumerConnectionsRequest.class, ShowConsumerConnectionsResponse.class)
            .withName("ShowConsumerConnections")
            .withUri("/v2/rocketmq/{project_id}/instances/{instance_id}/groups/{group}/clients")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getInstanceId,
                ShowConsumerConnectionsRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getGroup, ShowConsumerConnectionsRequest::setGroup));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getLimit, ShowConsumerConnectionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getOffset,
                ShowConsumerConnectionsRequest::setOffset));
        builder.<Boolean>withRequestField("is_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowConsumerConnectionsRequest::getIsDetail,
                ShowConsumerConnectionsRequest::setIsDetail));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> showConsumerListOrDetails =
        genForShowConsumerListOrDetails();

    private static HttpRequestDef<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> genForShowConsumerListOrDetails() {
        // basic
        HttpRequestDef.Builder<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConsumerListOrDetailsRequest.class,
                    ShowConsumerListOrDetailsResponse.class)
                .withName("ShowConsumerListOrDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getInstanceId,
                ShowConsumerListOrDetailsRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getGroup,
                ShowConsumerListOrDetailsRequest::setGroup));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getTopic,
                ShowConsumerListOrDetailsRequest::setTopic));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getLimit,
                ShowConsumerListOrDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getOffset,
                ShowConsumerListOrDetailsRequest::setOffset));

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
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
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
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getType,
                ShowEngineInstanceExtendProductInfoRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getLimit,
                ShowEngineInstanceExtendProductInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getOffset,
                ShowEngineInstanceExtendProductInfoRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupRequest, ShowGroupResponse> showGroup = genForShowGroup();

    private static HttpRequestDef<ShowGroupRequest, ShowGroupResponse> genForShowGroup() {
        // basic
        HttpRequestDef.Builder<ShowGroupRequest, ShowGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupRequest.class, ShowGroupResponse.class)
                .withName("ShowGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupRequest::getInstanceId, ShowGroupRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupRequest::getGroup, ShowGroupRequest::setGroup));

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

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> showRocketMqConfigs =
        genForShowRocketMqConfigs();

    private static HttpRequestDef<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> genForShowRocketMqConfigs() {
        // basic
        HttpRequestDef.Builder<ShowRocketMqConfigsRequest, ShowRocketMqConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRocketMqConfigsRequest.class, ShowRocketMqConfigsResponse.class)
                .withName("ShowRocketMqConfigs")
                .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketMqConfigsRequest::getInstanceId,
                ShowRocketMqConfigsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketMqConfigsRequest::getLimit, ShowRocketMqConfigsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketMqConfigsRequest::getOffset, ShowRocketMqConfigsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> showRocketmqProjectTags =
        genForShowRocketmqProjectTags();

    private static HttpRequestDef<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> genForShowRocketmqProjectTags() {
        // basic
        HttpRequestDef.Builder<ShowRocketmqProjectTagsRequest, ShowRocketmqProjectTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRocketmqProjectTagsRequest.class, ShowRocketmqProjectTagsResponse.class)
            .withName("ShowRocketmqProjectTags")
            .withUri("/v2/{project_id}/rocketmq/tags")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqProjectTagsRequest::getLimit, ShowRocketmqProjectTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqProjectTagsRequest::getOffset,
                ShowRocketmqProjectTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> showRocketmqTags =
        genForShowRocketmqTags();

    private static HttpRequestDef<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> genForShowRocketmqTags() {
        // basic
        HttpRequestDef.Builder<ShowRocketmqTagsRequest, ShowRocketmqTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRocketmqTagsRequest.class, ShowRocketmqTagsResponse.class)
                .withName("ShowRocketmqTags")
                .withUri("/v2/{project_id}/rocketmq/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRocketmqTagsRequest::getInstanceId, ShowRocketmqTagsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqTagsRequest::getLimit, ShowRocketmqTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRocketmqTagsRequest::getOffset, ShowRocketmqTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForShowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForShowUser() {
        // basic
        HttpRequestDef.Builder<ShowUserRequest, ShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserRequest.class, ShowUserResponse.class)
                .withName("ShowUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getInstanceId, ShowUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getUserName, ShowUserRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> updateConsumerGroup =
        genForUpdateConsumerGroup();

    private static HttpRequestDef<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> genForUpdateConsumerGroup() {
        // basic
        HttpRequestDef.Builder<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConsumerGroupRequest.class, UpdateConsumerGroupResponse.class)
                .withName("UpdateConsumerGroup")
                .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getInstanceId,
                UpdateConsumerGroupRequest::setInstanceId));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getGroup, UpdateConsumerGroupRequest::setGroup));
        builder.<UpdateConsumerGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConsumerGroup.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getBody, UpdateConsumerGroupRequest::setBody));

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

    public static final HttpRequestDef<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> updateRocketMqConfigs =
        genForUpdateRocketMqConfigs();

    private static HttpRequestDef<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> genForUpdateRocketMqConfigs() {
        // basic
        HttpRequestDef.Builder<UpdateRocketMqConfigsRequest, UpdateRocketMqConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRocketMqConfigsRequest.class, UpdateRocketMqConfigsResponse.class)
            .withName("UpdateRocketMqConfigs")
            .withUri("/v2/{project_id}/rocketmq/instances/{instance_id}/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRocketMqConfigsRequest::getInstanceId,
                UpdateRocketMqConfigsRequest::setInstanceId));
        builder.<ModifyConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyConfigReq.class),
            f -> f.withMarshaller(UpdateRocketMqConfigsRequest::getBody, UpdateRocketMqConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getInstanceId, UpdateUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserName, UpdateUserRequest::setUserName));
        builder.<User>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(User.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> validateConsumedMessage =
        genForValidateConsumedMessage();

    private static HttpRequestDef<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> genForValidateConsumedMessage() {
        // basic
        HttpRequestDef.Builder<ValidateConsumedMessageRequest, ValidateConsumedMessageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ValidateConsumedMessageRequest.class, ValidateConsumedMessageResponse.class)
            .withName("ValidateConsumedMessage")
            .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/messages/resend")
            .withContentType("application/json");

        // requests
        builder.<ValidateConsumedMessageRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateConsumedMessageRequest.EngineEnum.class),
            f -> f.withMarshaller(ValidateConsumedMessageRequest::getEngine,
                ValidateConsumedMessageRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateConsumedMessageRequest::getInstanceId,
                ValidateConsumedMessageRequest::setInstanceId));
        builder.<ResendReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResendReq.class),
            f -> f.withMarshaller(ValidateConsumedMessageRequest::getBody, ValidateConsumedMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopic =
        genForCreateTopicOrBatchDeleteTopic();

    private static HttpRequestDef<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> genForCreateTopicOrBatchDeleteTopic() {
        // basic
        HttpRequestDef.Builder<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTopicOrBatchDeleteTopicRequest.class,
                    CreateTopicOrBatchDeleteTopicResponse.class)
                .withName("CreateTopicOrBatchDeleteTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getInstanceId,
                CreateTopicOrBatchDeleteTopicRequest::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getAction,
                CreateTopicOrBatchDeleteTopicRequest::setAction));
        builder.<CreateTopicOrBatchDeleteTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTopicOrBatchDeleteTopicReq.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getBody,
                CreateTopicOrBatchDeleteTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> deleteTopic = genForDeleteTopic();

    private static HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> genForDeleteTopic() {
        // basic
        HttpRequestDef.Builder<DeleteTopicRequest, DeleteTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTopicRequest.class, DeleteTopicResponse.class)
                .withName("DeleteTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicRequest::getInstanceId, DeleteTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicRequest::getTopic, DeleteTopicRequest::setTopic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopic =
        genForListConsumerGroupOfTopic();

    private static HttpRequestDef<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> genForListConsumerGroupOfTopic() {
        // basic
        HttpRequestDef.Builder<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListConsumerGroupOfTopicRequest.class, ListConsumerGroupOfTopicResponse.class)
                .withName("ListConsumerGroupOfTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getInstanceId,
                ListConsumerGroupOfTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getTopic,
                ListConsumerGroupOfTopicRequest::setTopic));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getLimit,
                ListConsumerGroupOfTopicRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getOffset,
                ListConsumerGroupOfTopicRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> listRocketInstanceTopics =
        genForListRocketInstanceTopics();

    private static HttpRequestDef<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> genForListRocketInstanceTopics() {
        // basic
        HttpRequestDef.Builder<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRocketInstanceTopicsRequest.class, ListRocketInstanceTopicsResponse.class)
                .withName("ListRocketInstanceTopics")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getInstanceId,
                ListRocketInstanceTopicsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getLimit,
                ListRocketInstanceTopicsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getOffset,
                ListRocketInstanceTopicsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOneTopicRequest, ShowOneTopicResponse> showOneTopic = genForShowOneTopic();

    private static HttpRequestDef<ShowOneTopicRequest, ShowOneTopicResponse> genForShowOneTopic() {
        // basic
        HttpRequestDef.Builder<ShowOneTopicRequest, ShowOneTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOneTopicRequest.class, ShowOneTopicResponse.class)
                .withName("ShowOneTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOneTopicRequest::getInstanceId, ShowOneTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOneTopicRequest::getTopic, ShowOneTopicRequest::setTopic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopicStatusRequest, ShowTopicStatusResponse> showTopicStatus =
        genForShowTopicStatus();

    private static HttpRequestDef<ShowTopicStatusRequest, ShowTopicStatusResponse> genForShowTopicStatus() {
        // basic
        HttpRequestDef.Builder<ShowTopicStatusRequest, ShowTopicStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopicStatusRequest.class, ShowTopicStatusResponse.class)
                .withName("ShowTopicStatus")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicStatusRequest::getInstanceId, ShowTopicStatusRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicStatusRequest::getTopic, ShowTopicStatusRequest::setTopic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> updateTopic = genForUpdateTopic();

    private static HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> genForUpdateTopic() {
        // basic
        HttpRequestDef.Builder<UpdateTopicRequest, UpdateTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTopicRequest.class, UpdateTopicResponse.class)
                .withName("UpdateTopic")
                .withUri("/v2/{project_id}/instances/{instance_id}/topics/{topic}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicRequest::getInstanceId, UpdateTopicRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicRequest::getTopic, UpdateTopicRequest::setTopic));
        builder.<UpdateTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicReq.class),
            f -> f.withMarshaller(UpdateTopicRequest::getBody, UpdateTopicRequest::setBody));

        // response

        return builder.build();
    }

}

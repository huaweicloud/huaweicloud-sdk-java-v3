package com.huaweicloud.sdk.rocketmq.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rocketmq.v2.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class RocketMQMeta {

    public static final HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstances =
        genForbatchDeleteInstances();

    private static HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> genForbatchDeleteInstances() {
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
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> batchUpdateConsumerGroup =
        genForbatchUpdateConsumerGroup();

    private static HttpRequestDef<BatchUpdateConsumerGroupRequest, BatchUpdateConsumerGroupResponse> genForbatchUpdateConsumerGroup() {
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
            f -> f.withMarshaller(BatchUpdateConsumerGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchUpdateConsumerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateConsumerGroupReq.class),
            f -> f.withMarshaller(BatchUpdateConsumerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> createConsumerGroupOrBatchDeleteConsumerGroup =
        genForcreateConsumerGroupOrBatchDeleteConsumerGroup();

    private static HttpRequestDef<CreateConsumerGroupOrBatchDeleteConsumerGroupRequest, CreateConsumerGroupOrBatchDeleteConsumerGroupResponse> genForcreateConsumerGroupOrBatchDeleteConsumerGroup() {
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
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<CreateConsumerGroupOrBatchDeleteConsumerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConsumerGroupOrBatchDeleteConsumerGroupReq.class),
            f -> f.withMarshaller(CreateConsumerGroupOrBatchDeleteConsumerGroupRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForcreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForcreateUser() {
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
            f -> f.withMarshaller(CreateUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<User>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(User.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> deleteConsumerGroup =
        genFordeleteConsumerGroup();

    private static HttpRequestDef<DeleteConsumerGroupRequest, DeleteConsumerGroupResponse> genFordeleteConsumerGroup() {
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
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConsumerGroupRequest::getGroup, (req, v) -> {
                req.setGroup(v);
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

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genFordeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genFordeleteUser() {
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
            f -> f.withMarshaller(DeleteUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDlqMessageRequest, ExportDlqMessageResponse> exportDlqMessage =
        genForexportDlqMessage();

    private static HttpRequestDef<ExportDlqMessageRequest, ExportDlqMessageResponse> genForexportDlqMessage() {
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
            f -> f.withMarshaller(ExportDlqMessageRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ExportDlqMessageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportDlqMessageReq.class),
            f -> f.withMarshaller(ExportDlqMessageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<Message>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ExportDlqMessageResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Message.class));

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

    public static final HttpRequestDef<ListBrokersRequest, ListBrokersResponse> listBrokers = genForlistBrokers();

    private static HttpRequestDef<ListBrokersRequest, ListBrokersResponse> genForlistBrokers() {
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
            f -> f.withMarshaller(ListBrokersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> listConsumeGroupAccessPolicy =
        genForlistConsumeGroupAccessPolicy();

    private static HttpRequestDef<ListConsumeGroupAccessPolicyRequest, ListConsumeGroupAccessPolicyResponse> genForlistConsumeGroupAccessPolicy() {
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
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumeGroupAccessPolicyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
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
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConsumerGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
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
        builder.<String>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTraceRequest, ListMessageTraceResponse> listMessageTrace =
        genForlistMessageTrace();

    private static HttpRequestDef<ListMessageTraceRequest, ListMessageTraceResponse> genForlistMessageTrace() {
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
            f -> f.withMarshaller(ListMessageTraceRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTraceRequest::getMsgId, (req, v) -> {
                req.setMsgId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessagesRequest, ListMessagesResponse> listMessages = genForlistMessages();

    private static HttpRequestDef<ListMessagesRequest, ListMessagesResponse> genForlistMessages() {
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
            f -> f.withMarshaller(ListMessagesRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("msg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessagesRequest::getMsgId, (req, v) -> {
                req.setMsgId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> listTopicAccessPolicy =
        genForlistTopicAccessPolicy();

    private static HttpRequestDef<ListTopicAccessPolicyRequest, ListTopicAccessPolicyResponse> genForlistTopicAccessPolicy() {
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
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAccessPolicyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRequest, ListUserResponse> listUser = genForlistUser();

    private static HttpRequestDef<ListUserRequest, ListUserResponse> genForlistUser() {
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
            f -> f.withMarshaller(ListUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> resetConsumeOffset =
        genForresetConsumeOffset();

    private static HttpRequestDef<ResetConsumeOffsetRequest, ResetConsumeOffsetResponse> genForresetConsumeOffset() {
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
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ResetConsumeOffsetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetConsumeOffsetReq.class),
            f -> f.withMarshaller(ResetConsumeOffsetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> showConsumerListOrDetails =
        genForshowConsumerListOrDetails();

    private static HttpRequestDef<ShowConsumerListOrDetailsRequest, ShowConsumerListOrDetailsResponse> genForshowConsumerListOrDetails() {
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
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerListOrDetailsRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupRequest, ShowGroupResponse> showGroup = genForshowGroup();

    private static HttpRequestDef<ShowGroupRequest, ShowGroupResponse> genForshowGroup() {
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
            f -> f.withMarshaller(ShowGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupRequest::getGroup, (req, v) -> {
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

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForshowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForshowUser() {
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
            f -> f.withMarshaller(ShowUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> updateConsumerGroup =
        genForupdateConsumerGroup();

    private static HttpRequestDef<UpdateConsumerGroupRequest, UpdateConsumerGroupResponse> genForupdateConsumerGroup() {
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
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getGroup, (req, v) -> {
                req.setGroup(v);
            }));
        builder.<ConsumerGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConsumerGroup.class),
            f -> f.withMarshaller(UpdateConsumerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForupdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForupdateUser() {
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
            f -> f.withMarshaller(UpdateUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<User>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(User.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> createTopicOrBatchDeleteTopic =
        genForcreateTopicOrBatchDeleteTopic();

    private static HttpRequestDef<CreateTopicOrBatchDeleteTopicRequest, CreateTopicOrBatchDeleteTopicResponse> genForcreateTopicOrBatchDeleteTopic() {
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
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<CreateTopicOrBatchDeleteTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTopicOrBatchDeleteTopicReq.class),
            f -> f.withMarshaller(CreateTopicOrBatchDeleteTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> deleteTopic = genFordeleteTopic();

    private static HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> genFordeleteTopic() {
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
            f -> f.withMarshaller(DeleteTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> listConsumerGroupOfTopic =
        genForlistConsumerGroupOfTopic();

    private static HttpRequestDef<ListConsumerGroupOfTopicRequest, ListConsumerGroupOfTopicResponse> genForlistConsumerGroupOfTopic() {
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
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConsumerGroupOfTopicRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> listRocketInstanceTopics =
        genForlistRocketInstanceTopics();

    private static HttpRequestDef<ListRocketInstanceTopicsRequest, ListRocketInstanceTopicsResponse> genForlistRocketInstanceTopics() {
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
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRocketInstanceTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOneTopicRequest, ShowOneTopicResponse> showOneTopic = genForshowOneTopic();

    private static HttpRequestDef<ShowOneTopicRequest, ShowOneTopicResponse> genForshowOneTopic() {
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
            f -> f.withMarshaller(ShowOneTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOneTopicRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopicStatusRequest, ShowTopicStatusResponse> showTopicStatus =
        genForshowTopicStatus();

    private static HttpRequestDef<ShowTopicStatusRequest, ShowTopicStatusResponse> genForshowTopicStatus() {
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
            f -> f.withMarshaller(ShowTopicStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopicStatusRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> updateTopic = genForupdateTopic();

    private static HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> genForupdateTopic() {
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
            f -> f.withMarshaller(UpdateTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("topic",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            }));
        builder.<UpdateTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicReq.class),
            f -> f.withMarshaller(UpdateTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

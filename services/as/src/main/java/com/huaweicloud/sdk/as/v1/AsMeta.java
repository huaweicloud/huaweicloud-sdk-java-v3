package com.huaweicloud.sdk.as.v1;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.as.v1.model.*;

@SuppressWarnings("unchecked")
public class AsMeta {

    public static final HttpRequestDef<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> batchDeleteScalingConfigs = genForbatchDeleteScalingConfigs();

    private static HttpRequestDef<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> genForbatchDeleteScalingConfigs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteScalingConfigsRequest.class, BatchDeleteScalingConfigsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                BatchDeleteScalingConfigsRequestBody.class,
                f -> f.withMarshaller(BatchDeleteScalingConfigsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CompleteLifecycleActionRequest, CompleteLifecycleActionResponse> completeLifecycleAction = genForcompleteLifecycleAction();

    private static HttpRequestDef<CompleteLifecycleActionRequest, CompleteLifecycleActionResponse> genForcompleteLifecycleAction() {
        // basic
        HttpRequestDef.Builder<CompleteLifecycleActionRequest, CompleteLifecycleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CompleteLifecycleActionRequest.class, CompleteLifecycleActionResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_instance_hook/{scaling_group_id}/callback")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CompleteLifecycleActionRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CompleteLifecycleActionRequestBody.class,
                f -> f.withMarshaller(CompleteLifecycleActionRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> createLifyCycleHook = genForcreateLifyCycleHook();

    private static HttpRequestDef<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> genForcreateLifyCycleHook() {
        // basic
        HttpRequestDef.Builder<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLifyCycleHookRequest.class, CreateLifyCycleHookResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CreateLifyCycleHookRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateLifeCycleHookRequestBody.class,
                f -> f.withMarshaller(CreateLifyCycleHookRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateScalingConfigRequest, CreateScalingConfigResponse> createScalingConfig = genForcreateScalingConfig();

    private static HttpRequestDef<CreateScalingConfigRequest, CreateScalingConfigResponse> genForcreateScalingConfig() {
        // basic
        HttpRequestDef.Builder<CreateScalingConfigRequest, CreateScalingConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingConfigRequest.class, CreateScalingConfigResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateScalingConfigRequestBody.class,
                f -> f.withMarshaller(CreateScalingConfigRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateScalingGroupRequest, CreateScalingGroupResponse> createScalingGroup = genForcreateScalingGroup();

    private static HttpRequestDef<CreateScalingGroupRequest, CreateScalingGroupResponse> genForcreateScalingGroup() {
        // basic
        HttpRequestDef.Builder<CreateScalingGroupRequest, CreateScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingGroupRequest.class, CreateScalingGroupResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateScalingGroupRequestBody.class,
                f -> f.withMarshaller(CreateScalingGroupRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateScalingNotificationRequest, CreateScalingNotificationResponse> createScalingNotification = genForcreateScalingNotification();

    private static HttpRequestDef<CreateScalingNotificationRequest, CreateScalingNotificationResponse> genForcreateScalingNotification() {
        // basic
        HttpRequestDef.Builder<CreateScalingNotificationRequest, CreateScalingNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateScalingNotificationRequest.class, CreateScalingNotificationResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CreateScalingNotificationRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateNotificationRequestBody.class,
                f -> f.withMarshaller(CreateScalingNotificationRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateScalingPolicyRequest, CreateScalingPolicyResponse> createScalingPolicy = genForcreateScalingPolicy();

    private static HttpRequestDef<CreateScalingPolicyRequest, CreateScalingPolicyResponse> genForcreateScalingPolicy() {
        // basic
        HttpRequestDef.Builder<CreateScalingPolicyRequest, CreateScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingPolicyRequest.class, CreateScalingPolicyResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateScalingPolicyRequestBody.class,
                f -> f.withMarshaller(CreateScalingPolicyRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateScalingTagsRequest, CreateScalingTagsResponse> createScalingTags = genForcreateScalingTags();

    private static HttpRequestDef<CreateScalingTagsRequest, CreateScalingTagsResponse> genForcreateScalingTags() {
        // basic
        HttpRequestDef.Builder<CreateScalingTagsRequest, CreateScalingTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingTagsRequest.class, CreateScalingTagsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("resource_type",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateScalingTagsRequest.ResourceTypeEnum.class,
                f -> f.withMarshaller(CreateScalingTagsRequest::getResourceType, (req, v) -> {
                    req.setResourceType(v);
                })
        );
        builder.withRequestField("resource_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CreateScalingTagsRequest::getResourceId, (req, v) -> {
                    req.setResourceId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateScalingTagsRequestBody.class,
                f -> f.withMarshaller(CreateScalingTagsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> deleteLifecycleHook = genFordeleteLifecycleHook();

    private static HttpRequestDef<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> genFordeleteLifecycleHook() {
        // basic
        HttpRequestDef.Builder<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLifecycleHookRequest.class, DeleteLifecycleHookResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteLifecycleHookRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("lifecycle_hook_name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteLifecycleHookRequest::getLifecycleHookName, (req, v) -> {
                    req.setLifecycleHookName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteScalingConfigRequest, DeleteScalingConfigResponse> deleteScalingConfig = genFordeleteScalingConfig();

    private static HttpRequestDef<DeleteScalingConfigRequest, DeleteScalingConfigResponse> genFordeleteScalingConfig() {
        // basic
        HttpRequestDef.Builder<DeleteScalingConfigRequest, DeleteScalingConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScalingConfigRequest.class, DeleteScalingConfigResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration/{scaling_configuration_id}");

        // requests
        builder.withRequestField("scaling_configuration_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteScalingConfigRequest::getScalingConfigurationId, (req, v) -> {
                    req.setScalingConfigurationId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteScalingGroupRequest, DeleteScalingGroupResponse> deleteScalingGroup = genFordeleteScalingGroup();

    private static HttpRequestDef<DeleteScalingGroupRequest, DeleteScalingGroupResponse> genFordeleteScalingGroup() {
        // basic
        HttpRequestDef.Builder<DeleteScalingGroupRequest, DeleteScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScalingGroupRequest.class, DeleteScalingGroupResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteScalingGroupRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("force_delete",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                DeleteScalingGroupRequest.ForceDeleteEnum.class,
                f -> f.withMarshaller(DeleteScalingGroupRequest::getForceDelete, (req, v) -> {
                    req.setForceDelete(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> deleteScalingInstance = genFordeleteScalingInstance();

    private static HttpRequestDef<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> genFordeleteScalingInstance() {
        // basic
        HttpRequestDef.Builder<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScalingInstanceRequest.class, DeleteScalingInstanceResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{instance_id}");

        // requests
        builder.withRequestField("instance_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteScalingInstanceRequest::getInstanceId, (req, v) -> {
                    req.setInstanceId(v);
                })
        );
        builder.withRequestField("instance_delete",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                DeleteScalingInstanceRequest.InstanceDeleteEnum.class,
                f -> f.withMarshaller(DeleteScalingInstanceRequest::getInstanceDelete, (req, v) -> {
                    req.setInstanceDelete(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> deleteScalingNotification = genFordeleteScalingNotification();

    private static HttpRequestDef<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> genFordeleteScalingNotification() {
        // basic
        HttpRequestDef.Builder<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScalingNotificationRequest.class, DeleteScalingNotificationResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}/{topic_urn}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteScalingNotificationRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("topic_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteScalingNotificationRequest::getTopicUrn, (req, v) -> {
                    req.setTopicUrn(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> deleteScalingPolicy = genFordeleteScalingPolicy();

    private static HttpRequestDef<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> genFordeleteScalingPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScalingPolicyRequest.class, DeleteScalingPolicyResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}");

        // requests
        builder.withRequestField("scaling_policy_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteScalingPolicyRequest::getScalingPolicyId, (req, v) -> {
                    req.setScalingPolicyId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteScalingTagsRequest, DeleteScalingTagsResponse> deleteScalingTags = genFordeleteScalingTags();

    private static HttpRequestDef<DeleteScalingTagsRequest, DeleteScalingTagsResponse> genFordeleteScalingTags() {
        // basic
        HttpRequestDef.Builder<DeleteScalingTagsRequest, DeleteScalingTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteScalingTagsRequest.class, DeleteScalingTagsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("resource_type",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                DeleteScalingTagsRequest.ResourceTypeEnum.class,
                f -> f.withMarshaller(DeleteScalingTagsRequest::getResourceType, (req, v) -> {
                    req.setResourceType(v);
                })
        );
        builder.withRequestField("resource_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteScalingTagsRequest::getResourceId, (req, v) -> {
                    req.setResourceId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                DeleteScalingTagsRequestBody.class,
                f -> f.withMarshaller(DeleteScalingTagsRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<EnableOrDisableScalingGroupRequest, EnableOrDisableScalingGroupResponse> enableOrDisableScalingGroup = genForenableOrDisableScalingGroup();

    private static HttpRequestDef<EnableOrDisableScalingGroupRequest, EnableOrDisableScalingGroupResponse> genForenableOrDisableScalingGroup() {
        // basic
        HttpRequestDef.Builder<EnableOrDisableScalingGroupRequest, EnableOrDisableScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableOrDisableScalingGroupRequest.class, EnableOrDisableScalingGroupResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(EnableOrDisableScalingGroupRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                EnableOrDisableScalingGroupRequestBody.class,
                f -> f.withMarshaller(EnableOrDisableScalingGroupRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> executeScalingPolicy = genForexecuteScalingPolicy();

    private static HttpRequestDef<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> genForexecuteScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteScalingPolicyRequest.class, ExecuteScalingPolicyResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_policy_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ExecuteScalingPolicyRequest::getScalingPolicyId, (req, v) -> {
                    req.setScalingPolicyId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                ExecuteScalingPolicyRequestBody.class,
                f -> f.withMarshaller(ExecuteScalingPolicyRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListHookInstancesRequest, ListHookInstancesResponse> listHookInstances = genForlistHookInstances();

    private static HttpRequestDef<ListHookInstancesRequest, ListHookInstancesResponse> genForlistHookInstances() {
        // basic
        HttpRequestDef.Builder<ListHookInstancesRequest, ListHookInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHookInstancesRequest.class, ListHookInstancesResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_instance_hook/{scaling_group_id}/list");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListHookInstancesRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("instance_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListHookInstancesRequest::getInstanceId, (req, v) -> {
                    req.setInstanceId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> listLifeCycleHooks = genForlistLifeCycleHooks();

    private static HttpRequestDef<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> genForlistLifeCycleHooks() {
        // basic
        HttpRequestDef.Builder<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLifeCycleHooksRequest.class, ListLifeCycleHooksResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/list");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListLifeCycleHooksRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances = genForlistResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForlistResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("resource_type",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                ListResourceInstancesRequest.ResourceTypeEnum.class,
                f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType, (req, v) -> {
                    req.setResourceType(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                ShowTagsRequestBody.class,
                f -> f.withMarshaller(ListResourceInstancesRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> listScalingActivityLogs = genForlistScalingActivityLogs();

    private static HttpRequestDef<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> genForlistScalingActivityLogs() {
        // basic
        HttpRequestDef.Builder<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingActivityLogsRequest.class, ListScalingActivityLogsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_activity_log/{scaling_group_id}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListScalingActivityLogsRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("start_time",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                OffsetDateTime.class,
                f -> f.withMarshaller(ListScalingActivityLogsRequest::getStartTime, (req, v) -> {
                    req.setStartTime(v);
                })
        );
        builder.withRequestField("end_time",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                OffsetDateTime.class,
                f -> f.withMarshaller(ListScalingActivityLogsRequest::getEndTime, (req, v) -> {
                    req.setEndTime(v);
                })
        );
        builder.withRequestField("start_number",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingActivityLogsRequest::getStartNumber, (req, v) -> {
                    req.setStartNumber(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingActivityLogsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingConfigsRequest, ListScalingConfigsResponse> listScalingConfigs = genForlistScalingConfigs();

    private static HttpRequestDef<ListScalingConfigsRequest, ListScalingConfigsResponse> genForlistScalingConfigs() {
        // basic
        HttpRequestDef.Builder<ListScalingConfigsRequest, ListScalingConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingConfigsRequest.class, ListScalingConfigsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration");

        // requests
        builder.withRequestField("scaling_configuration_name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingConfigsRequest::getScalingConfigurationName, (req, v) -> {
                    req.setScalingConfigurationName(v);
                })
        );
        builder.withRequestField("image_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingConfigsRequest::getImageId, (req, v) -> {
                    req.setImageId(v);
                })
        );
        builder.withRequestField("start_number",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingConfigsRequest::getStartNumber, (req, v) -> {
                    req.setStartNumber(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingConfigsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingGroupsRequest, ListScalingGroupsResponse> listScalingGroups = genForlistScalingGroups();

    private static HttpRequestDef<ListScalingGroupsRequest, ListScalingGroupsResponse> genForlistScalingGroups() {
        // basic
        HttpRequestDef.Builder<ListScalingGroupsRequest, ListScalingGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingGroupsRequest.class, ListScalingGroupsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group");

        // requests
        builder.withRequestField("scaling_group_name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingGroupsRequest::getScalingGroupName, (req, v) -> {
                    req.setScalingGroupName(v);
                })
        );
        builder.withRequestField("scaling_configuration_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingGroupsRequest::getScalingConfigurationId, (req, v) -> {
                    req.setScalingConfigurationId(v);
                })
        );
        builder.withRequestField("scaling_group_status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListScalingGroupsRequest.ScalingGroupStatusEnum.class,
                f -> f.withMarshaller(ListScalingGroupsRequest::getScalingGroupStatus, (req, v) -> {
                    req.setScalingGroupStatus(v);
                })
        );
        builder.withRequestField("start_number",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingGroupsRequest::getStartNumber, (req, v) -> {
                    req.setStartNumber(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingGroupsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingInstancesRequest, ListScalingInstancesResponse> listScalingInstances = genForlistScalingInstances();

    private static HttpRequestDef<ListScalingInstancesRequest, ListScalingInstancesResponse> genForlistScalingInstances() {
        // basic
        HttpRequestDef.Builder<ListScalingInstancesRequest, ListScalingInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingInstancesRequest.class, ListScalingInstancesResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/list");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListScalingInstancesRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("life_cycle_state",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListScalingInstancesRequest.LifeCycleStateEnum.class,
                f -> f.withMarshaller(ListScalingInstancesRequest::getLifeCycleState, (req, v) -> {
                    req.setLifeCycleState(v);
                })
        );
        builder.withRequestField("health_status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListScalingInstancesRequest.HealthStatusEnum.class,
                f -> f.withMarshaller(ListScalingInstancesRequest::getHealthStatus, (req, v) -> {
                    req.setHealthStatus(v);
                })
        );
        builder.withRequestField("protect_from_scaling_down",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListScalingInstancesRequest.ProtectFromScalingDownEnum.class,
                f -> f.withMarshaller(ListScalingInstancesRequest::getProtectFromScalingDown, (req, v) -> {
                    req.setProtectFromScalingDown(v);
                })
        );
        builder.withRequestField("start_number",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingInstancesRequest::getStartNumber, (req, v) -> {
                    req.setStartNumber(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingInstancesRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingNotificationsRequest, ListScalingNotificationsResponse> listScalingNotifications = genForlistScalingNotifications();

    private static HttpRequestDef<ListScalingNotificationsRequest, ListScalingNotificationsResponse> genForlistScalingNotifications() {
        // basic
        HttpRequestDef.Builder<ListScalingNotificationsRequest, ListScalingNotificationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingNotificationsRequest.class, ListScalingNotificationsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListScalingNotificationsRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingPoliciesRequest, ListScalingPoliciesResponse> listScalingPolicies = genForlistScalingPolicies();

    private static HttpRequestDef<ListScalingPoliciesRequest, ListScalingPoliciesResponse> genForlistScalingPolicies() {
        // basic
        HttpRequestDef.Builder<ListScalingPoliciesRequest, ListScalingPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingPoliciesRequest.class, ListScalingPoliciesResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_group_id}/list");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("scaling_policy_name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingPolicyName, (req, v) -> {
                    req.setScalingPolicyName(v);
                })
        );
        builder.withRequestField("scaling_policy_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListScalingPoliciesRequest.ScalingPolicyTypeEnum.class,
                f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingPolicyType, (req, v) -> {
                    req.setScalingPolicyType(v);
                })
        );
        builder.withRequestField("scaling_policy_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingPolicyId, (req, v) -> {
                    req.setScalingPolicyId(v);
                })
        );
        builder.withRequestField("start_number",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingPoliciesRequest::getStartNumber, (req, v) -> {
                    req.setStartNumber(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingPoliciesRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> listScalingPolicyExecuteLogs = genForlistScalingPolicyExecuteLogs();

    private static HttpRequestDef<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> genForlistScalingPolicyExecuteLogs() {
        // basic
        HttpRequestDef.Builder<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingPolicyExecuteLogsRequest.class, ListScalingPolicyExecuteLogsResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy_execute_log/{scaling_policy_id}");

        // requests
        builder.withRequestField("scaling_policy_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getScalingPolicyId, (req, v) -> {
                    req.setScalingPolicyId(v);
                })
        );
        builder.withRequestField("log_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getLogId, (req, v) -> {
                    req.setLogId(v);
                })
        );
        builder.withRequestField("scaling_resource_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListScalingPolicyExecuteLogsRequest.ScalingResourceTypeEnum.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getScalingResourceType, (req, v) -> {
                    req.setScalingResourceType(v);
                })
        );
        builder.withRequestField("scaling_resource_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getScalingResourceId, (req, v) -> {
                    req.setScalingResourceId(v);
                })
        );
        builder.withRequestField("execute_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                ListScalingPolicyExecuteLogsRequest.ExecuteTypeEnum.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getExecuteType, (req, v) -> {
                    req.setExecuteType(v);
                })
        );
        builder.withRequestField("start_time",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                OffsetDateTime.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getStartTime, (req, v) -> {
                    req.setStartTime(v);
                })
        );
        builder.withRequestField("end_time",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                OffsetDateTime.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getEndTime, (req, v) -> {
                    req.setEndTime(v);
                })
        );
        builder.withRequestField("start_number",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getStartNumber, (req, v) -> {
                    req.setStartNumber(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> listScalingTagInfosByResourceId = genForlistScalingTagInfosByResourceId();

    private static HttpRequestDef<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> genForlistScalingTagInfosByResourceId() {
        // basic
        HttpRequestDef.Builder<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingTagInfosByResourceIdRequest.class, ListScalingTagInfosByResourceIdResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags");

        // requests
        builder.withRequestField("resource_type",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                ListScalingTagInfosByResourceIdRequest.ResourceTypeEnum.class,
                f -> f.withMarshaller(ListScalingTagInfosByResourceIdRequest::getResourceType, (req, v) -> {
                    req.setResourceType(v);
                })
        );
        builder.withRequestField("resource_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListScalingTagInfosByResourceIdRequest::getResourceId, (req, v) -> {
                    req.setResourceId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> listScalingTagInfosByTenantId = genForlistScalingTagInfosByTenantId();

    private static HttpRequestDef<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> genForlistScalingTagInfosByTenantId() {
        // basic
        HttpRequestDef.Builder<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingTagInfosByTenantIdRequest.class, ListScalingTagInfosByTenantIdResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/tags");

        // requests
        builder.withRequestField("resource_type",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                ListScalingTagInfosByTenantIdRequest.ResourceTypeEnum.class,
                f -> f.withMarshaller(ListScalingTagInfosByTenantIdRequest::getResourceType, (req, v) -> {
                    req.setResourceType(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> showLifeCycleHook = genForshowLifeCycleHook();

    private static HttpRequestDef<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> genForshowLifeCycleHook() {
        // basic
        HttpRequestDef.Builder<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLifeCycleHookRequest.class, ShowLifeCycleHookResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowLifeCycleHookRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("lifecycle_hook_name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowLifeCycleHookRequest::getLifecycleHookName, (req, v) -> {
                    req.setLifecycleHookName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> showPolicyAndInstanceQuota = genForshowPolicyAndInstanceQuota();

    private static HttpRequestDef<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> genForshowPolicyAndInstanceQuota() {
        // basic
        HttpRequestDef.Builder<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyAndInstanceQuotaRequest.class, ShowPolicyAndInstanceQuotaResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/quotas/{scaling_group_id}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowPolicyAndInstanceQuotaRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowResourceQuotaRequest, ShowResourceQuotaResponse> showResourceQuota = genForshowResourceQuota();

    private static HttpRequestDef<ShowResourceQuotaRequest, ShowResourceQuotaResponse> genForshowResourceQuota() {
        // basic
        HttpRequestDef.Builder<ShowResourceQuotaRequest, ShowResourceQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceQuotaRequest.class, ShowResourceQuotaResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/quotas");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowScalingConfigRequest, ShowScalingConfigResponse> showScalingConfig = genForshowScalingConfig();

    private static HttpRequestDef<ShowScalingConfigRequest, ShowScalingConfigResponse> genForshowScalingConfig() {
        // basic
        HttpRequestDef.Builder<ShowScalingConfigRequest, ShowScalingConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingConfigRequest.class, ShowScalingConfigResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration/{scaling_configuration_id}");

        // requests
        builder.withRequestField("scaling_configuration_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowScalingConfigRequest::getScalingConfigurationId, (req, v) -> {
                    req.setScalingConfigurationId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowScalingGroupRequest, ShowScalingGroupResponse> showScalingGroup = genForshowScalingGroup();

    private static HttpRequestDef<ShowScalingGroupRequest, ShowScalingGroupResponse> genForshowScalingGroup() {
        // basic
        HttpRequestDef.Builder<ShowScalingGroupRequest, ShowScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingGroupRequest.class, ShowScalingGroupResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowScalingGroupRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowScalingPolicyRequest, ShowScalingPolicyResponse> showScalingPolicy = genForshowScalingPolicy();

    private static HttpRequestDef<ShowScalingPolicyRequest, ShowScalingPolicyResponse> genForshowScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowScalingPolicyRequest, ShowScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingPolicyRequest.class, ShowScalingPolicyResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}");

        // requests
        builder.withRequestField("scaling_policy_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowScalingPolicyRequest::getScalingPolicyId, (req, v) -> {
                    req.setScalingPolicyId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> updateLifeCycleHook = genForupdateLifeCycleHook();

    private static HttpRequestDef<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> genForupdateLifeCycleHook() {
        // basic
        HttpRequestDef.Builder<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLifeCycleHookRequest.class, UpdateLifeCycleHookResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateLifeCycleHookRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("lifecycle_hook_name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateLifeCycleHookRequest::getLifecycleHookName, (req, v) -> {
                    req.setLifecycleHookName(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateLifeCycleHookRequestBody.class,
                f -> f.withMarshaller(UpdateLifeCycleHookRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateScalingGroupRequest, UpdateScalingGroupResponse> updateScalingGroup = genForupdateScalingGroup();

    private static HttpRequestDef<UpdateScalingGroupRequest, UpdateScalingGroupResponse> genForupdateScalingGroup() {
        // basic
        HttpRequestDef.Builder<UpdateScalingGroupRequest, UpdateScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScalingGroupRequest.class, UpdateScalingGroupResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateScalingGroupRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateScalingGroupRequestBody.class,
                f -> f.withMarshaller(UpdateScalingGroupRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateScalingGroupInstanceRequest, UpdateScalingGroupInstanceResponse> updateScalingGroupInstance = genForupdateScalingGroupInstance();

    private static HttpRequestDef<UpdateScalingGroupInstanceRequest, UpdateScalingGroupInstanceResponse> genForupdateScalingGroupInstance() {
        // basic
        HttpRequestDef.Builder<UpdateScalingGroupInstanceRequest, UpdateScalingGroupInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateScalingGroupInstanceRequest.class, UpdateScalingGroupInstanceResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateScalingGroupInstanceRequest::getScalingGroupId, (req, v) -> {
                    req.setScalingGroupId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateScalingGroupInstanceRequestBody.class,
                f -> f.withMarshaller(UpdateScalingGroupInstanceRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> updateScalingPolicy = genForupdateScalingPolicy();

    private static HttpRequestDef<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> genForupdateScalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScalingPolicyRequest.class, UpdateScalingPolicyResponse.class)
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_policy_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateScalingPolicyRequest::getScalingPolicyId, (req, v) -> {
                    req.setScalingPolicyId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateScalingPolicyRequestBody.class,
                f -> f.withMarshaller(UpdateScalingPolicyRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

}


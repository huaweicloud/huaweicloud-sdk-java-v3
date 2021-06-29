package com.huaweicloud.sdk.as.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.as.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class AsMeta {

    public static final HttpRequestDef<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> attachCallbackInstanceLifeCycleHook = genForattachCallbackInstanceLifeCycleHook();

    private static HttpRequestDef<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> genForattachCallbackInstanceLifeCycleHook() {
        // basic
        HttpRequestDef.Builder<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AttachCallbackInstanceLifeCycleHookRequest.class, AttachCallbackInstanceLifeCycleHookResponse.class)
                .withName("AttachCallbackInstanceLifeCycleHook")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_instance_hook/{scaling_group_id}/callback")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AttachCallbackInstanceLifeCycleHookRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CallbackLifeCycleHookOption.class,
            f -> f.withMarshaller(AttachCallbackInstanceLifeCycleHookRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> batchAddScalingInstances = genForbatchAddScalingInstances();

    private static HttpRequestDef<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> genForbatchAddScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddScalingInstancesRequest.class, BatchAddScalingInstancesResponse.class)
                .withName("BatchAddScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchAddScalingInstancesRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchAddInstancesOption.class,
            f -> f.withMarshaller(BatchAddScalingInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> batchDeleteScalingConfigs = genForbatchDeleteScalingConfigs();

    private static HttpRequestDef<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> genForbatchDeleteScalingConfigs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteScalingConfigsRequest.class, BatchDeleteScalingConfigsResponse.class)
                .withName("BatchDeleteScalingConfigs")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteScalingConfigOption.class,
            f -> f.withMarshaller(BatchDeleteScalingConfigsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> batchDeleteScalingPolicies = genForbatchDeleteScalingPolicies();

    private static HttpRequestDef<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> genForbatchDeleteScalingPolicies() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteScalingPoliciesRequest.class, BatchDeleteScalingPoliciesResponse.class)
                .withName("BatchDeleteScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policies/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteScalingPoliciesOption.class,
            f -> f.withMarshaller(BatchDeleteScalingPoliciesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> batchPauseScalingPolicies = genForbatchPauseScalingPolicies();

    private static HttpRequestDef<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> genForbatchPauseScalingPolicies() {
        // basic
        HttpRequestDef.Builder<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchPauseScalingPoliciesRequest.class, BatchPauseScalingPoliciesResponse.class)
                .withName("BatchPauseScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policies/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchPauseScalingPoliciesOption.class,
            f -> f.withMarshaller(BatchPauseScalingPoliciesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> batchProtectScalingInstances = genForbatchProtectScalingInstances();

    private static HttpRequestDef<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> genForbatchProtectScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchProtectScalingInstancesRequest.class, BatchProtectScalingInstancesResponse.class)
                .withName("BatchProtectScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchProtectScalingInstancesRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchProtectInstancesOption.class,
            f -> f.withMarshaller(BatchProtectScalingInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> batchRemoveScalingInstances = genForbatchRemoveScalingInstances();

    private static HttpRequestDef<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> genForbatchRemoveScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRemoveScalingInstancesRequest.class, BatchRemoveScalingInstancesResponse.class)
                .withName("BatchRemoveScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchRemoveScalingInstancesRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchRemoveInstancesOption.class,
            f -> f.withMarshaller(BatchRemoveScalingInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> batchResumeScalingPolicies = genForbatchResumeScalingPolicies();

    private static HttpRequestDef<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> genForbatchResumeScalingPolicies() {
        // basic
        HttpRequestDef.Builder<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchResumeScalingPoliciesRequest.class, BatchResumeScalingPoliciesResponse.class)
                .withName("BatchResumeScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policies/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchResumeScalingPoliciesOption.class,
            f -> f.withMarshaller(BatchResumeScalingPoliciesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> batchSetScalingInstancesStandby = genForbatchSetScalingInstancesStandby();

    private static HttpRequestDef<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> genForbatchSetScalingInstancesStandby() {
        // basic
        HttpRequestDef.Builder<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetScalingInstancesStandbyRequest.class, BatchSetScalingInstancesStandbyResponse.class)
                .withName("BatchSetScalingInstancesStandby")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchSetScalingInstancesStandbyRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchEnterStandbyInstancesOption.class,
            f -> f.withMarshaller(BatchSetScalingInstancesStandbyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> batchUnprotectScalingInstances = genForbatchUnprotectScalingInstances();

    private static HttpRequestDef<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> genForbatchUnprotectScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUnprotectScalingInstancesRequest.class, BatchUnprotectScalingInstancesResponse.class)
                .withName("BatchUnprotectScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchUnprotectScalingInstancesRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchUnprotectInstancesOption.class,
            f -> f.withMarshaller(BatchUnprotectScalingInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> batchUnsetScalingInstancesStantby = genForbatchUnsetScalingInstancesStantby();

    private static HttpRequestDef<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> genForbatchUnsetScalingInstancesStantby() {
        // basic
        HttpRequestDef.Builder<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUnsetScalingInstancesStantbyRequest.class, BatchUnsetScalingInstancesStantbyResponse.class)
                .withName("BatchUnsetScalingInstancesStantby")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchUnsetScalingInstancesStantbyRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchExitStandByInstancesOption.class,
            f -> f.withMarshaller(BatchUnsetScalingInstancesStantbyRequest::getBody, (req, v) -> {
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
                .withName("CreateLifyCycleHook")
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
            CreateLifeCycleHookOption.class,
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
                .withName("CreateScalingConfig")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateScalingConfigOption.class,
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
                .withName("CreateScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateScalingGroupOption.class,
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
                .withName("CreateScalingNotification")
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
            CreateNotificationOption.class,
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
                .withName("CreateScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateScalingPolicyOption.class,
            f -> f.withMarshaller(CreateScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> createScalingTagInfo = genForcreateScalingTagInfo();

    private static HttpRequestDef<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> genForcreateScalingTagInfo() {
        // basic
        HttpRequestDef.Builder<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingTagInfoRequest.class, CreateScalingTagInfoResponse.class)
                .withName("CreateScalingTagInfo")
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateScalingTagInfoRequest.ResourceTypeEnum.class,
            f -> f.withMarshaller(CreateScalingTagInfoRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            })
        );
        builder.withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateScalingTagInfoRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTagsOption.class,
            f -> f.withMarshaller(CreateScalingTagInfoRequest::getBody, (req, v) -> {
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
                .withName("DeleteLifecycleHook")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}")
                .withContentType("application/json");

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
                .withName("DeleteScalingConfig")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration/{scaling_configuration_id}")
                .withContentType("application/json");

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
                .withName("DeleteScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}")
                .withContentType("application/json");

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
                .withName("DeleteScalingInstance")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{instance_id}")
                .withContentType("application/json");

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
                .withName("DeleteScalingNotification")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}/{topic_urn}")
                .withContentType("application/json");

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
                .withName("DeleteScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> deleteScalingTagInfo = genFordeleteScalingTagInfo();

    private static HttpRequestDef<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> genFordeleteScalingTagInfo() {
        // basic
        HttpRequestDef.Builder<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteScalingTagInfoRequest.class, DeleteScalingTagInfoResponse.class)
                .withName("DeleteScalingTagInfo")
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteScalingTagInfoRequest.ResourceTypeEnum.class,
            f -> f.withMarshaller(DeleteScalingTagInfoRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            })
        );
        builder.withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteScalingTagInfoRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteTagsOption.class,
            f -> f.withMarshaller(DeleteScalingTagInfoRequest::getBody, (req, v) -> {
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
                .withName("ExecuteScalingPolicy")
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
            ExecuteScalingPolicyOption.class,
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
                .withName("ListHookInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_instance_hook/{scaling_group_id}/list")
                .withContentType("application/json");

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
                .withName("ListLifeCycleHooks")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/list")
                .withContentType("application/json");

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
                .withName("ListResourceInstances")
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
            QueryTagsOption.class,
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
                .withName("ListScalingActivityLogs")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_activity_log/{scaling_group_id}")
                .withContentType("application/json");

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
            String.class,
            f -> f.withMarshaller(ListScalingActivityLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
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

    public static final HttpRequestDef<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> listScalingActivityV2Logs = genForlistScalingActivityV2Logs();

    private static HttpRequestDef<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> genForlistScalingActivityV2Logs() {
        // basic
        HttpRequestDef.Builder<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingActivityV2LogsRequest.class, ListScalingActivityV2LogsResponse.class)
                .withName("ListScalingActivityV2Logs")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_activity_log/{scaling_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getLogId, (req, v) -> {
                req.setLogId(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getStartNumber, (req, v) -> {
                req.setStartNumber(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListScalingActivityV2LogsRequest.TypeEnum.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListScalingActivityV2LogsRequest.StatusEnum.class,
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
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
                .withName("ListScalingConfigs")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration")
                .withContentType("application/json");

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
                .withName("ListScalingGroups")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group")
                .withContentType("application/json");

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
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScalingGroupsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
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
                .withName("ListScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/list")
                .withContentType("application/json");

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
                .withName("ListScalingNotifications")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}")
                .withContentType("application/json");

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
                .withName("ListScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_group_id}/list")
                .withContentType("application/json");

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
                .withName("ListScalingPolicyExecuteLogs")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy_execute_log/{scaling_policy_id}")
                .withContentType("application/json");

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
            String.class,
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
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
                .withName("ListScalingTagInfosByResourceId")
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

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
                .withName("ListScalingTagInfosByTenantId")
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

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

    public static final HttpRequestDef<PauseScalingGroupRequest, PauseScalingGroupResponse> pauseScalingGroup = genForpauseScalingGroup();

    private static HttpRequestDef<PauseScalingGroupRequest, PauseScalingGroupResponse> genForpauseScalingGroup() {
        // basic
        HttpRequestDef.Builder<PauseScalingGroupRequest, PauseScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PauseScalingGroupRequest.class, PauseScalingGroupResponse.class)
                .withName("PauseScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(PauseScalingGroupRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PauseScalingGroupOption.class,
            f -> f.withMarshaller(PauseScalingGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<PauseScalingPolicyRequest, PauseScalingPolicyResponse> pauseScalingPolicy = genForpauseScalingPolicy();

    private static HttpRequestDef<PauseScalingPolicyRequest, PauseScalingPolicyResponse> genForpauseScalingPolicy() {
        // basic
        HttpRequestDef.Builder<PauseScalingPolicyRequest, PauseScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PauseScalingPolicyRequest.class, PauseScalingPolicyResponse.class)
                .withName("PauseScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(PauseScalingPolicyRequest::getScalingPolicyId, (req, v) -> {
                req.setScalingPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PauseScalingPolicyOption.class,
            f -> f.withMarshaller(PauseScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResumeScalingGroupRequest, ResumeScalingGroupResponse> resumeScalingGroup = genForresumeScalingGroup();

    private static HttpRequestDef<ResumeScalingGroupRequest, ResumeScalingGroupResponse> genForresumeScalingGroup() {
        // basic
        HttpRequestDef.Builder<ResumeScalingGroupRequest, ResumeScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResumeScalingGroupRequest.class, ResumeScalingGroupResponse.class)
                .withName("ResumeScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResumeScalingGroupRequest::getScalingGroupId, (req, v) -> {
                req.setScalingGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResumeScalingGroupOption.class,
            f -> f.withMarshaller(ResumeScalingGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> resumeScalingPolicy = genForresumeScalingPolicy();

    private static HttpRequestDef<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> genForresumeScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResumeScalingPolicyRequest.class, ResumeScalingPolicyResponse.class)
                .withName("ResumeScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResumeScalingPolicyRequest::getScalingPolicyId, (req, v) -> {
                req.setScalingPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResumeScalingPolicyOption.class,
            f -> f.withMarshaller(ResumeScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withName("ShowLifeCycleHook")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}")
                .withContentType("application/json");

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
                .withName("ShowPolicyAndInstanceQuota")
                .withUri("/autoscaling-api/v1/{project_id}/quotas/{scaling_group_id}")
                .withContentType("application/json");

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
                .withName("ShowResourceQuota")
                .withUri("/autoscaling-api/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowScalingConfigRequest, ShowScalingConfigResponse> showScalingConfig = genForshowScalingConfig();

    private static HttpRequestDef<ShowScalingConfigRequest, ShowScalingConfigResponse> genForshowScalingConfig() {
        // basic
        HttpRequestDef.Builder<ShowScalingConfigRequest, ShowScalingConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingConfigRequest.class, ShowScalingConfigResponse.class)
                .withName("ShowScalingConfig")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration/{scaling_configuration_id}")
                .withContentType("application/json");

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
                .withName("ShowScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}")
                .withContentType("application/json");

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
                .withName("ShowScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json");

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
                .withName("UpdateLifeCycleHook")
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
            UpdateLifeCycleHookOption.class,
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
                .withName("UpdateScalingGroup")
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
            UpdateScalingGroupOption.class,
            f -> f.withMarshaller(UpdateScalingGroupRequest::getBody, (req, v) -> {
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
                .withName("UpdateScalingPolicy")
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
            UpdateScalingPolicyOption.class,
            f -> f.withMarshaller(UpdateScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions = genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowApiVersionRequest.ApiVersionEnum.class,
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> createScalingV2Policy = genForcreateScalingV2Policy();

    private static HttpRequestDef<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> genForcreateScalingV2Policy() {
        // basic
        HttpRequestDef.Builder<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingV2PolicyRequest.class, CreateScalingV2PolicyResponse.class)
                .withName("CreateScalingV2Policy")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateScalingPolicyV2Option.class,
            f -> f.withMarshaller(CreateScalingV2PolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> listAllScalingV2Policies = genForlistAllScalingV2Policies();

    private static HttpRequestDef<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> genForlistAllScalingV2Policies() {
        // basic
        HttpRequestDef.Builder<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllScalingV2PoliciesRequest.class, ListAllScalingV2PoliciesResponse.class)
                .withName("ListAllScalingV2Policies")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("scaling_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingResourceId, (req, v) -> {
                req.setScalingResourceId(v);
            })
        );
        builder.withRequestField("scaling_resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAllScalingV2PoliciesRequest.ScalingResourceTypeEnum.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingResourceType, (req, v) -> {
                req.setScalingResourceType(v);
            })
        );
        builder.withRequestField("scaling_policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingPolicyName, (req, v) -> {
                req.setScalingPolicyName(v);
            })
        );
        builder.withRequestField("scaling_policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAllScalingV2PoliciesRequest.ScalingPolicyTypeEnum.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingPolicyType, (req, v) -> {
                req.setScalingPolicyType(v);
            })
        );
        builder.withRequestField("scaling_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingPolicyId, (req, v) -> {
                req.setScalingPolicyId(v);
            })
        );
        builder.withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getStartNumber, (req, v) -> {
                req.setStartNumber(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAllScalingV2PoliciesRequest.SortByEnum.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getSortBy, (req, v) -> {
                req.setSortBy(v);
            })
        );
        builder.withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAllScalingV2PoliciesRequest.OrderEnum.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> listScalingV2Policies = genForlistScalingV2Policies();

    private static HttpRequestDef<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> genForlistScalingV2Policies() {
        // basic
        HttpRequestDef.Builder<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingV2PoliciesRequest.class, ListScalingV2PoliciesResponse.class)
                .withName("ListScalingV2Policies")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_policy/{scaling_resource_id}/list")
                .withContentType("application/json");

        // requests
        builder.withRequestField("scaling_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingResourceId, (req, v) -> {
                req.setScalingResourceId(v);
            })
        );
        builder.withRequestField("scaling_policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingPolicyName, (req, v) -> {
                req.setScalingPolicyName(v);
            })
        );
        builder.withRequestField("scaling_policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingPolicyType, (req, v) -> {
                req.setScalingPolicyType(v);
            })
        );
        builder.withRequestField("scaling_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingPolicyId, (req, v) -> {
                req.setScalingPolicyId(v);
            })
        );
        builder.withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getStartNumber, (req, v) -> {
                req.setStartNumber(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> showScalingV2Policy = genForshowScalingV2Policy();

    private static HttpRequestDef<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> genForshowScalingV2Policy() {
        // basic
        HttpRequestDef.Builder<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingV2PolicyRequest.class, ShowScalingV2PolicyResponse.class)
                .withName("ShowScalingV2Policy")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowScalingV2PolicyRequest::getScalingPolicyId, (req, v) -> {
                req.setScalingPolicyId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> updateScalingV2Policy = genForupdateScalingV2Policy();

    private static HttpRequestDef<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> genForupdateScalingV2Policy() {
        // basic
        HttpRequestDef.Builder<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScalingV2PolicyRequest.class, UpdateScalingV2PolicyResponse.class)
                .withName("UpdateScalingV2Policy")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateScalingV2PolicyRequest::getScalingPolicyId, (req, v) -> {
                req.setScalingPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateScalingV2PolicyOption.class,
            f -> f.withMarshaller(UpdateScalingV2PolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

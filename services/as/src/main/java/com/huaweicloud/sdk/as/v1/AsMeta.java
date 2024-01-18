package com.huaweicloud.sdk.as.v1;

import com.huaweicloud.sdk.as.v1.model.AttachCallbackInstanceLifeCycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.AttachCallbackInstanceLifeCycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.BatchAddInstancesOption;
import com.huaweicloud.sdk.as.v1.model.BatchAddScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchAddScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingConfigOption;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingConfigsRequest;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingConfigsResponse;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingPoliciesOption;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingPoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingPoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchEnterStandbyInstancesOption;
import com.huaweicloud.sdk.as.v1.model.BatchExitStandByInstancesOption;
import com.huaweicloud.sdk.as.v1.model.BatchPauseScalingPoliciesOption;
import com.huaweicloud.sdk.as.v1.model.BatchPauseScalingPoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchPauseScalingPoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchProtectInstancesOption;
import com.huaweicloud.sdk.as.v1.model.BatchProtectScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchProtectScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchRemoveInstancesOption;
import com.huaweicloud.sdk.as.v1.model.BatchRemoveScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchRemoveScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchResumeScalingPoliciesOption;
import com.huaweicloud.sdk.as.v1.model.BatchResumeScalingPoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchResumeScalingPoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchSetScalingInstancesStandbyRequest;
import com.huaweicloud.sdk.as.v1.model.BatchSetScalingInstancesStandbyResponse;
import com.huaweicloud.sdk.as.v1.model.BatchUnprotectInstancesOption;
import com.huaweicloud.sdk.as.v1.model.BatchUnprotectScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchUnprotectScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchUnsetScalingInstancesStantbyRequest;
import com.huaweicloud.sdk.as.v1.model.BatchUnsetScalingInstancesStantbyResponse;
import com.huaweicloud.sdk.as.v1.model.CallbackLifeCycleHookOption;
import com.huaweicloud.sdk.as.v1.model.CreateGroupScheduledTaskRequest;
import com.huaweicloud.sdk.as.v1.model.CreateGroupScheduledTaskResponse;
import com.huaweicloud.sdk.as.v1.model.CreateLifeCycleHookOption;
import com.huaweicloud.sdk.as.v1.model.CreateLifyCycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.CreateLifyCycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.CreateNotificationOption;
import com.huaweicloud.sdk.as.v1.model.CreateScalingConfigOption;
import com.huaweicloud.sdk.as.v1.model.CreateScalingConfigRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingConfigResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingGroupOption;
import com.huaweicloud.sdk.as.v1.model.CreateScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingNotificationRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingNotificationResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingPolicyOption;
import com.huaweicloud.sdk.as.v1.model.CreateScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingPolicyV2Option;
import com.huaweicloud.sdk.as.v1.model.CreateScalingTagInfoRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingTagInfoResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingV2PolicyRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingV2PolicyResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScheduledTaskOption;
import com.huaweicloud.sdk.as.v1.model.CreateTagsOption;
import com.huaweicloud.sdk.as.v1.model.DeleteGroupScheduledTaskRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteGroupScheduledTaskResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteLifecycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteLifecycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingConfigRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingConfigResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingInstanceRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingInstanceResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingNotificationRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingNotificationResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingTagInfoRequest;
import com.huaweicloud.sdk.as.v1.model.DeleteScalingTagInfoResponse;
import com.huaweicloud.sdk.as.v1.model.DeleteTagsOption;
import com.huaweicloud.sdk.as.v1.model.ExecuteScalingPolicyOption;
import com.huaweicloud.sdk.as.v1.model.ExecuteScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.ExecuteScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.ListAllScalingV2PoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.ListAllScalingV2PoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.as.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.as.v1.model.ListGroupScheduledTasksRequest;
import com.huaweicloud.sdk.as.v1.model.ListGroupScheduledTasksResponse;
import com.huaweicloud.sdk.as.v1.model.ListHookInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.ListHookInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.ListLifeCycleHooksRequest;
import com.huaweicloud.sdk.as.v1.model.ListLifeCycleHooksResponse;
import com.huaweicloud.sdk.as.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingActivityLogsRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingActivityLogsResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingActivityV2LogsRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingActivityV2LogsResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingConfigsRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingConfigsResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingGroupsRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingGroupsResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingNotificationsRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingNotificationsResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingPoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingPoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingPolicyExecuteLogsRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingPolicyExecuteLogsResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingTagInfosByResourceIdRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingTagInfosByResourceIdResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingTagInfosByTenantIdRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingTagInfosByTenantIdResponse;
import com.huaweicloud.sdk.as.v1.model.ListScalingV2PoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.ListScalingV2PoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.PauseScalingGroupOption;
import com.huaweicloud.sdk.as.v1.model.PauseScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.PauseScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.PauseScalingPolicyOption;
import com.huaweicloud.sdk.as.v1.model.PauseScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.PauseScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.QueryTagsOption;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingGroupOption;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingPolicyOption;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.as.v1.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.as.v1.model.ShowLifeCycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.ShowLifeCycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.ShowPolicyAndInstanceQuotaRequest;
import com.huaweicloud.sdk.as.v1.model.ShowPolicyAndInstanceQuotaResponse;
import com.huaweicloud.sdk.as.v1.model.ShowResourceQuotaRequest;
import com.huaweicloud.sdk.as.v1.model.ShowResourceQuotaResponse;
import com.huaweicloud.sdk.as.v1.model.ShowScalingConfigRequest;
import com.huaweicloud.sdk.as.v1.model.ShowScalingConfigResponse;
import com.huaweicloud.sdk.as.v1.model.ShowScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.ShowScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.ShowScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.ShowScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.ShowScalingV2PolicyRequest;
import com.huaweicloud.sdk.as.v1.model.ShowScalingV2PolicyResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateGroupScheduledTaskRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateGroupScheduledTaskResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateLifeCycleHookOption;
import com.huaweicloud.sdk.as.v1.model.UpdateLifeCycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateLifeCycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingGroupOption;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingPolicyOption;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingV2PolicyOption;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingV2PolicyRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingV2PolicyResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScheduledTaskOption;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AsMeta {

    public static final HttpRequestDef<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> attachCallbackInstanceLifeCycleHook =
        genForAttachCallbackInstanceLifeCycleHook();

    private static HttpRequestDef<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> genForAttachCallbackInstanceLifeCycleHook() {
        // basic
        HttpRequestDef.Builder<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AttachCallbackInstanceLifeCycleHookRequest.class,
                    AttachCallbackInstanceLifeCycleHookResponse.class)
                .withName("AttachCallbackInstanceLifeCycleHook")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_instance_hook/{scaling_group_id}/callback")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachCallbackInstanceLifeCycleHookRequest::getScalingGroupId,
                AttachCallbackInstanceLifeCycleHookRequest::setScalingGroupId));
        builder.<CallbackLifeCycleHookOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CallbackLifeCycleHookOption.class),
            f -> f.withMarshaller(AttachCallbackInstanceLifeCycleHookRequest::getBody,
                AttachCallbackInstanceLifeCycleHookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> batchAddScalingInstances =
        genForBatchAddScalingInstances();

    private static HttpRequestDef<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> genForBatchAddScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchAddScalingInstancesRequest.class, BatchAddScalingInstancesResponse.class)
                .withName("BatchAddScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddScalingInstancesRequest::getScalingGroupId,
                BatchAddScalingInstancesRequest::setScalingGroupId));
        builder.<BatchAddInstancesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddInstancesOption.class),
            f -> f.withMarshaller(BatchAddScalingInstancesRequest::getBody, BatchAddScalingInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> batchDeleteScalingConfigs =
        genForBatchDeleteScalingConfigs();

    private static HttpRequestDef<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> genForBatchDeleteScalingConfigs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteScalingConfigsRequest.class,
                    BatchDeleteScalingConfigsResponse.class)
                .withName("BatchDeleteScalingConfigs")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteScalingConfigOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteScalingConfigOption.class),
            f -> f.withMarshaller(BatchDeleteScalingConfigsRequest::getBody,
                BatchDeleteScalingConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> batchDeleteScalingPolicies =
        genForBatchDeleteScalingPolicies();

    private static HttpRequestDef<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> genForBatchDeleteScalingPolicies() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteScalingPoliciesRequest.class,
                    BatchDeleteScalingPoliciesResponse.class)
                .withName("BatchDeleteScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policies/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteScalingPoliciesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteScalingPoliciesOption.class),
            f -> f.withMarshaller(BatchDeleteScalingPoliciesRequest::getBody,
                BatchDeleteScalingPoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> batchPauseScalingPolicies =
        genForBatchPauseScalingPolicies();

    private static HttpRequestDef<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> genForBatchPauseScalingPolicies() {
        // basic
        HttpRequestDef.Builder<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchPauseScalingPoliciesRequest.class,
                    BatchPauseScalingPoliciesResponse.class)
                .withName("BatchPauseScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policies/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchPauseScalingPoliciesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchPauseScalingPoliciesOption.class),
            f -> f.withMarshaller(BatchPauseScalingPoliciesRequest::getBody,
                BatchPauseScalingPoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> batchProtectScalingInstances =
        genForBatchProtectScalingInstances();

    private static HttpRequestDef<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> genForBatchProtectScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchProtectScalingInstancesRequest.class,
                    BatchProtectScalingInstancesResponse.class)
                .withName("BatchProtectScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchProtectScalingInstancesRequest::getScalingGroupId,
                BatchProtectScalingInstancesRequest::setScalingGroupId));
        builder.<BatchProtectInstancesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchProtectInstancesOption.class),
            f -> f.withMarshaller(BatchProtectScalingInstancesRequest::getBody,
                BatchProtectScalingInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> batchRemoveScalingInstances =
        genForBatchRemoveScalingInstances();

    private static HttpRequestDef<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> genForBatchRemoveScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRemoveScalingInstancesRequest.class,
                    BatchRemoveScalingInstancesResponse.class)
                .withName("BatchRemoveScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveScalingInstancesRequest::getScalingGroupId,
                BatchRemoveScalingInstancesRequest::setScalingGroupId));
        builder.<BatchRemoveInstancesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRemoveInstancesOption.class),
            f -> f.withMarshaller(BatchRemoveScalingInstancesRequest::getBody,
                BatchRemoveScalingInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> batchResumeScalingPolicies =
        genForBatchResumeScalingPolicies();

    private static HttpRequestDef<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> genForBatchResumeScalingPolicies() {
        // basic
        HttpRequestDef.Builder<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchResumeScalingPoliciesRequest.class,
                    BatchResumeScalingPoliciesResponse.class)
                .withName("BatchResumeScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policies/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchResumeScalingPoliciesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchResumeScalingPoliciesOption.class),
            f -> f.withMarshaller(BatchResumeScalingPoliciesRequest::getBody,
                BatchResumeScalingPoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> batchSetScalingInstancesStandby =
        genForBatchSetScalingInstancesStandby();

    private static HttpRequestDef<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> genForBatchSetScalingInstancesStandby() {
        // basic
        HttpRequestDef.Builder<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchSetScalingInstancesStandbyRequest.class,
                    BatchSetScalingInstancesStandbyResponse.class)
                .withName("BatchSetScalingInstancesStandby")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSetScalingInstancesStandbyRequest::getScalingGroupId,
                BatchSetScalingInstancesStandbyRequest::setScalingGroupId));
        builder.<BatchEnterStandbyInstancesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchEnterStandbyInstancesOption.class),
            f -> f.withMarshaller(BatchSetScalingInstancesStandbyRequest::getBody,
                BatchSetScalingInstancesStandbyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> batchUnprotectScalingInstances =
        genForBatchUnprotectScalingInstances();

    private static HttpRequestDef<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> genForBatchUnprotectScalingInstances() {
        // basic
        HttpRequestDef.Builder<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUnprotectScalingInstancesRequest.class,
                    BatchUnprotectScalingInstancesResponse.class)
                .withName("BatchUnprotectScalingInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUnprotectScalingInstancesRequest::getScalingGroupId,
                BatchUnprotectScalingInstancesRequest::setScalingGroupId));
        builder.<BatchUnprotectInstancesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUnprotectInstancesOption.class),
            f -> f.withMarshaller(BatchUnprotectScalingInstancesRequest::getBody,
                BatchUnprotectScalingInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> batchUnsetScalingInstancesStantby =
        genForBatchUnsetScalingInstancesStantby();

    private static HttpRequestDef<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> genForBatchUnsetScalingInstancesStantby() {
        // basic
        HttpRequestDef.Builder<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUnsetScalingInstancesStantbyRequest.class,
                    BatchUnsetScalingInstancesStantbyResponse.class)
                .withName("BatchUnsetScalingInstancesStantby")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUnsetScalingInstancesStantbyRequest::getScalingGroupId,
                BatchUnsetScalingInstancesStantbyRequest::setScalingGroupId));
        builder.<BatchExitStandByInstancesOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchExitStandByInstancesOption.class),
            f -> f.withMarshaller(BatchUnsetScalingInstancesStantbyRequest::getBody,
                BatchUnsetScalingInstancesStantbyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupScheduledTaskRequest, CreateGroupScheduledTaskResponse> createGroupScheduledTask =
        genForCreateGroupScheduledTask();

    private static HttpRequestDef<CreateGroupScheduledTaskRequest, CreateGroupScheduledTaskResponse> genForCreateGroupScheduledTask() {
        // basic
        HttpRequestDef.Builder<CreateGroupScheduledTaskRequest, CreateGroupScheduledTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateGroupScheduledTaskRequest.class, CreateGroupScheduledTaskResponse.class)
                .withName("CreateGroupScheduledTask")
                .withUri("/autoscaling-api/v1/{project_id}/scaling-groups/{scaling_group_id}/scheduled-tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupScheduledTaskRequest::getScalingGroupId,
                CreateGroupScheduledTaskRequest::setScalingGroupId));
        builder.<CreateScheduledTaskOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScheduledTaskOption.class),
            f -> f.withMarshaller(CreateGroupScheduledTaskRequest::getBody, CreateGroupScheduledTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> createLifyCycleHook =
        genForCreateLifyCycleHook();

    private static HttpRequestDef<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> genForCreateLifyCycleHook() {
        // basic
        HttpRequestDef.Builder<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLifyCycleHookRequest.class, CreateLifyCycleHookResponse.class)
                .withName("CreateLifyCycleHook")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLifyCycleHookRequest::getScalingGroupId,
                CreateLifyCycleHookRequest::setScalingGroupId));
        builder.<CreateLifeCycleHookOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLifeCycleHookOption.class),
            f -> f.withMarshaller(CreateLifyCycleHookRequest::getBody, CreateLifyCycleHookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingConfigRequest, CreateScalingConfigResponse> createScalingConfig =
        genForCreateScalingConfig();

    private static HttpRequestDef<CreateScalingConfigRequest, CreateScalingConfigResponse> genForCreateScalingConfig() {
        // basic
        HttpRequestDef.Builder<CreateScalingConfigRequest, CreateScalingConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingConfigRequest.class, CreateScalingConfigResponse.class)
                .withName("CreateScalingConfig")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateScalingConfigOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScalingConfigOption.class),
            f -> f.withMarshaller(CreateScalingConfigRequest::getBody, CreateScalingConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingGroupRequest, CreateScalingGroupResponse> createScalingGroup =
        genForCreateScalingGroup();

    private static HttpRequestDef<CreateScalingGroupRequest, CreateScalingGroupResponse> genForCreateScalingGroup() {
        // basic
        HttpRequestDef.Builder<CreateScalingGroupRequest, CreateScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingGroupRequest.class, CreateScalingGroupResponse.class)
                .withName("CreateScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateScalingGroupOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScalingGroupOption.class),
            f -> f.withMarshaller(CreateScalingGroupRequest::getBody, CreateScalingGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingNotificationRequest, CreateScalingNotificationResponse> createScalingNotification =
        genForCreateScalingNotification();

    private static HttpRequestDef<CreateScalingNotificationRequest, CreateScalingNotificationResponse> genForCreateScalingNotification() {
        // basic
        HttpRequestDef.Builder<CreateScalingNotificationRequest, CreateScalingNotificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateScalingNotificationRequest.class,
                    CreateScalingNotificationResponse.class)
                .withName("CreateScalingNotification")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScalingNotificationRequest::getScalingGroupId,
                CreateScalingNotificationRequest::setScalingGroupId));
        builder.<CreateNotificationOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationOption.class),
            f -> f.withMarshaller(CreateScalingNotificationRequest::getBody,
                CreateScalingNotificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingPolicyRequest, CreateScalingPolicyResponse> createScalingPolicy =
        genForCreateScalingPolicy();

    private static HttpRequestDef<CreateScalingPolicyRequest, CreateScalingPolicyResponse> genForCreateScalingPolicy() {
        // basic
        HttpRequestDef.Builder<CreateScalingPolicyRequest, CreateScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScalingPolicyRequest.class, CreateScalingPolicyResponse.class)
                .withName("CreateScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateScalingPolicyOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScalingPolicyOption.class),
            f -> f.withMarshaller(CreateScalingPolicyRequest::getBody, CreateScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> createScalingTagInfo =
        genForCreateScalingTagInfo();

    private static HttpRequestDef<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> genForCreateScalingTagInfo() {
        // basic
        HttpRequestDef.Builder<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateScalingTagInfoRequest.class, CreateScalingTagInfoResponse.class)
            .withName("CreateScalingTagInfo")
            .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateScalingTagInfoRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScalingTagInfoRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateScalingTagInfoRequest::getResourceType,
                CreateScalingTagInfoRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScalingTagInfoRequest::getResourceId,
                CreateScalingTagInfoRequest::setResourceId));
        builder.<CreateTagsOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagsOption.class),
            f -> f.withMarshaller(CreateScalingTagInfoRequest::getBody, CreateScalingTagInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupScheduledTaskRequest, DeleteGroupScheduledTaskResponse> deleteGroupScheduledTask =
        genForDeleteGroupScheduledTask();

    private static HttpRequestDef<DeleteGroupScheduledTaskRequest, DeleteGroupScheduledTaskResponse> genForDeleteGroupScheduledTask() {
        // basic
        HttpRequestDef.Builder<DeleteGroupScheduledTaskRequest, DeleteGroupScheduledTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGroupScheduledTaskRequest.class,
                    DeleteGroupScheduledTaskResponse.class)
                .withName("DeleteGroupScheduledTask")
                .withUri(
                    "/autoscaling-api/v1/{project_id}/scaling-groups/{scaling_group_id}/scheduled-tasks/{scheduled_task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupScheduledTaskRequest::getScalingGroupId,
                DeleteGroupScheduledTaskRequest::setScalingGroupId));
        builder.<String>withRequestField("scheduled_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupScheduledTaskRequest::getScheduledTaskId,
                DeleteGroupScheduledTaskRequest::setScheduledTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> deleteLifecycleHook =
        genForDeleteLifecycleHook();

    private static HttpRequestDef<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> genForDeleteLifecycleHook() {
        // basic
        HttpRequestDef.Builder<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLifecycleHookRequest.class, DeleteLifecycleHookResponse.class)
            .withName("DeleteLifecycleHook")
            .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLifecycleHookRequest::getScalingGroupId,
                DeleteLifecycleHookRequest::setScalingGroupId));
        builder.<String>withRequestField("lifecycle_hook_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLifecycleHookRequest::getLifecycleHookName,
                DeleteLifecycleHookRequest::setLifecycleHookName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScalingConfigRequest, DeleteScalingConfigResponse> deleteScalingConfig =
        genForDeleteScalingConfig();

    private static HttpRequestDef<DeleteScalingConfigRequest, DeleteScalingConfigResponse> genForDeleteScalingConfig() {
        // basic
        HttpRequestDef.Builder<DeleteScalingConfigRequest, DeleteScalingConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScalingConfigRequest.class, DeleteScalingConfigResponse.class)
            .withName("DeleteScalingConfig")
            .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration/{scaling_configuration_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingConfigRequest::getScalingConfigurationId,
                DeleteScalingConfigRequest::setScalingConfigurationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScalingGroupRequest, DeleteScalingGroupResponse> deleteScalingGroup =
        genForDeleteScalingGroup();

    private static HttpRequestDef<DeleteScalingGroupRequest, DeleteScalingGroupResponse> genForDeleteScalingGroup() {
        // basic
        HttpRequestDef.Builder<DeleteScalingGroupRequest, DeleteScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScalingGroupRequest.class, DeleteScalingGroupResponse.class)
                .withName("DeleteScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingGroupRequest::getScalingGroupId,
                DeleteScalingGroupRequest::setScalingGroupId));
        builder.<DeleteScalingGroupRequest.ForceDeleteEnum>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteScalingGroupRequest.ForceDeleteEnum.class),
            f -> f.withMarshaller(DeleteScalingGroupRequest::getForceDelete,
                DeleteScalingGroupRequest::setForceDelete));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> deleteScalingInstance =
        genForDeleteScalingInstance();

    private static HttpRequestDef<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> genForDeleteScalingInstance() {
        // basic
        HttpRequestDef.Builder<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScalingInstanceRequest.class, DeleteScalingInstanceResponse.class)
            .withName("DeleteScalingInstance")
            .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingInstanceRequest::getInstanceId,
                DeleteScalingInstanceRequest::setInstanceId));
        builder.<DeleteScalingInstanceRequest.InstanceDeleteEnum>withRequestField("instance_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteScalingInstanceRequest.InstanceDeleteEnum.class),
            f -> f.withMarshaller(DeleteScalingInstanceRequest::getInstanceDelete,
                DeleteScalingInstanceRequest::setInstanceDelete));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> deleteScalingNotification =
        genForDeleteScalingNotification();

    private static HttpRequestDef<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> genForDeleteScalingNotification() {
        // basic
        HttpRequestDef.Builder<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteScalingNotificationRequest.class,
                    DeleteScalingNotificationResponse.class)
                .withName("DeleteScalingNotification")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}/{topic_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingNotificationRequest::getScalingGroupId,
                DeleteScalingNotificationRequest::setScalingGroupId));
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingNotificationRequest::getTopicUrn,
                DeleteScalingNotificationRequest::setTopicUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> deleteScalingPolicy =
        genForDeleteScalingPolicy();

    private static HttpRequestDef<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> genForDeleteScalingPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScalingPolicyRequest.class, DeleteScalingPolicyResponse.class)
            .withName("DeleteScalingPolicy")
            .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingPolicyRequest::getScalingPolicyId,
                DeleteScalingPolicyRequest::setScalingPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> deleteScalingTagInfo =
        genForDeleteScalingTagInfo();

    private static HttpRequestDef<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> genForDeleteScalingTagInfo() {
        // basic
        HttpRequestDef.Builder<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteScalingTagInfoRequest.class, DeleteScalingTagInfoResponse.class)
            .withName("DeleteScalingTagInfo")
            .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteScalingTagInfoRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteScalingTagInfoRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteScalingTagInfoRequest::getResourceType,
                DeleteScalingTagInfoRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingTagInfoRequest::getResourceId,
                DeleteScalingTagInfoRequest::setResourceId));
        builder.<DeleteTagsOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagsOption.class),
            f -> f.withMarshaller(DeleteScalingTagInfoRequest::getBody, DeleteScalingTagInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> executeScalingPolicy =
        genForExecuteScalingPolicy();

    private static HttpRequestDef<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> genForExecuteScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteScalingPolicyRequest.class, ExecuteScalingPolicyResponse.class)
            .withName("ExecuteScalingPolicy")
            .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScalingPolicyRequest::getScalingPolicyId,
                ExecuteScalingPolicyRequest::setScalingPolicyId));
        builder.<ExecuteScalingPolicyOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteScalingPolicyOption.class),
            f -> f.withMarshaller(ExecuteScalingPolicyRequest::getBody, ExecuteScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupScheduledTasksRequest, ListGroupScheduledTasksResponse> listGroupScheduledTasks =
        genForListGroupScheduledTasks();

    private static HttpRequestDef<ListGroupScheduledTasksRequest, ListGroupScheduledTasksResponse> genForListGroupScheduledTasks() {
        // basic
        HttpRequestDef.Builder<ListGroupScheduledTasksRequest, ListGroupScheduledTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGroupScheduledTasksRequest.class, ListGroupScheduledTasksResponse.class)
            .withName("ListGroupScheduledTasks")
            .withUri("/autoscaling-api/v1/{project_id}/scaling-groups/{scaling_group_id}/scheduled-tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupScheduledTasksRequest::getScalingGroupId,
                ListGroupScheduledTasksRequest::setScalingGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupScheduledTasksRequest::getLimit, ListGroupScheduledTasksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupScheduledTasksRequest::getMarker,
                ListGroupScheduledTasksRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHookInstancesRequest, ListHookInstancesResponse> listHookInstances =
        genForListHookInstances();

    private static HttpRequestDef<ListHookInstancesRequest, ListHookInstancesResponse> genForListHookInstances() {
        // basic
        HttpRequestDef.Builder<ListHookInstancesRequest, ListHookInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHookInstancesRequest.class, ListHookInstancesResponse.class)
                .withName("ListHookInstances")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_instance_hook/{scaling_group_id}/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHookInstancesRequest::getScalingGroupId,
                ListHookInstancesRequest::setScalingGroupId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHookInstancesRequest::getInstanceId, ListHookInstancesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> listLifeCycleHooks =
        genForListLifeCycleHooks();

    private static HttpRequestDef<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> genForListLifeCycleHooks() {
        // basic
        HttpRequestDef.Builder<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLifeCycleHooksRequest.class, ListLifeCycleHooksResponse.class)
                .withName("ListLifeCycleHooks")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLifeCycleHooksRequest::getScalingGroupId,
                ListLifeCycleHooksRequest::setScalingGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForListResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForListResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/resource_instances/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType,
                ListResourceInstancesRequest::setResourceType));
        builder.<QueryTagsOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTagsOption.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, ListResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> listScalingActivityLogs =
        genForListScalingActivityLogs();

    private static HttpRequestDef<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> genForListScalingActivityLogs() {
        // basic
        HttpRequestDef.Builder<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListScalingActivityLogsRequest.class, ListScalingActivityLogsResponse.class)
            .withName("ListScalingActivityLogs")
            .withUri("/autoscaling-api/v1/{project_id}/scaling_activity_log/{scaling_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingActivityLogsRequest::getScalingGroupId,
                ListScalingActivityLogsRequest::setScalingGroupId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingActivityLogsRequest::getStartTime,
                ListScalingActivityLogsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingActivityLogsRequest::getEndTime,
                ListScalingActivityLogsRequest::setEndTime));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingActivityLogsRequest::getStartNumber,
                ListScalingActivityLogsRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingActivityLogsRequest::getLimit, ListScalingActivityLogsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> listScalingActivityV2Logs =
        genForListScalingActivityV2Logs();

    private static HttpRequestDef<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> genForListScalingActivityV2Logs() {
        // basic
        HttpRequestDef.Builder<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListScalingActivityV2LogsRequest.class,
                    ListScalingActivityV2LogsResponse.class)
                .withName("ListScalingActivityV2Logs")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_activity_log/{scaling_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getScalingGroupId,
                ListScalingActivityV2LogsRequest::setScalingGroupId));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getLogId,
                ListScalingActivityV2LogsRequest::setLogId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getStartTime,
                ListScalingActivityV2LogsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getEndTime,
                ListScalingActivityV2LogsRequest::setEndTime));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getStartNumber,
                ListScalingActivityV2LogsRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getLimit,
                ListScalingActivityV2LogsRequest::setLimit));
        builder.<ListScalingActivityV2LogsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingActivityV2LogsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getType,
                ListScalingActivityV2LogsRequest::setType));
        builder.<ListScalingActivityV2LogsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingActivityV2LogsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListScalingActivityV2LogsRequest::getStatus,
                ListScalingActivityV2LogsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingConfigsRequest, ListScalingConfigsResponse> listScalingConfigs =
        genForListScalingConfigs();

    private static HttpRequestDef<ListScalingConfigsRequest, ListScalingConfigsResponse> genForListScalingConfigs() {
        // basic
        HttpRequestDef.Builder<ListScalingConfigsRequest, ListScalingConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingConfigsRequest.class, ListScalingConfigsResponse.class)
                .withName("ListScalingConfigs")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_configuration_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingConfigsRequest::getScalingConfigurationName,
                ListScalingConfigsRequest::setScalingConfigurationName));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingConfigsRequest::getImageId, ListScalingConfigsRequest::setImageId));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingConfigsRequest::getStartNumber,
                ListScalingConfigsRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingConfigsRequest::getLimit, ListScalingConfigsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingGroupsRequest, ListScalingGroupsResponse> listScalingGroups =
        genForListScalingGroups();

    private static HttpRequestDef<ListScalingGroupsRequest, ListScalingGroupsResponse> genForListScalingGroups() {
        // basic
        HttpRequestDef.Builder<ListScalingGroupsRequest, ListScalingGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingGroupsRequest.class, ListScalingGroupsResponse.class)
                .withName("ListScalingGroups")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingGroupsRequest::getScalingGroupName,
                ListScalingGroupsRequest::setScalingGroupName));
        builder.<String>withRequestField("scaling_configuration_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingGroupsRequest::getScalingConfigurationId,
                ListScalingGroupsRequest::setScalingConfigurationId));
        builder.<ListScalingGroupsRequest.ScalingGroupStatusEnum>withRequestField("scaling_group_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingGroupsRequest.ScalingGroupStatusEnum.class),
            f -> f.withMarshaller(ListScalingGroupsRequest::getScalingGroupStatus,
                ListScalingGroupsRequest::setScalingGroupStatus));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingGroupsRequest::getStartNumber, ListScalingGroupsRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingGroupsRequest::getLimit, ListScalingGroupsRequest::setLimit));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingGroupsRequest::getEnterpriseProjectId,
                ListScalingGroupsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingInstancesRequest, ListScalingInstancesResponse> listScalingInstances =
        genForListScalingInstances();

    private static HttpRequestDef<ListScalingInstancesRequest, ListScalingInstancesResponse> genForListScalingInstances() {
        // basic
        HttpRequestDef.Builder<ListScalingInstancesRequest, ListScalingInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListScalingInstancesRequest.class, ListScalingInstancesResponse.class)
            .withName("ListScalingInstances")
            .withUri("/autoscaling-api/v1/{project_id}/scaling_group_instance/{scaling_group_id}/list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingInstancesRequest::getScalingGroupId,
                ListScalingInstancesRequest::setScalingGroupId));
        builder.<ListScalingInstancesRequest.LifeCycleStateEnum>withRequestField("life_cycle_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingInstancesRequest.LifeCycleStateEnum.class),
            f -> f.withMarshaller(ListScalingInstancesRequest::getLifeCycleState,
                ListScalingInstancesRequest::setLifeCycleState));
        builder.<ListScalingInstancesRequest.HealthStatusEnum>withRequestField("health_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingInstancesRequest.HealthStatusEnum.class),
            f -> f.withMarshaller(ListScalingInstancesRequest::getHealthStatus,
                ListScalingInstancesRequest::setHealthStatus));
        builder.<ListScalingInstancesRequest.ProtectFromScalingDownEnum>withRequestField("protect_from_scaling_down",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingInstancesRequest.ProtectFromScalingDownEnum.class),
            f -> f.withMarshaller(ListScalingInstancesRequest::getProtectFromScalingDown,
                ListScalingInstancesRequest::setProtectFromScalingDown));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingInstancesRequest::getStartNumber,
                ListScalingInstancesRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingInstancesRequest::getLimit, ListScalingInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingNotificationsRequest, ListScalingNotificationsResponse> listScalingNotifications =
        genForListScalingNotifications();

    private static HttpRequestDef<ListScalingNotificationsRequest, ListScalingNotificationsResponse> genForListScalingNotifications() {
        // basic
        HttpRequestDef.Builder<ListScalingNotificationsRequest, ListScalingNotificationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListScalingNotificationsRequest.class, ListScalingNotificationsResponse.class)
                .withName("ListScalingNotifications")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_notification/{scaling_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingNotificationsRequest::getScalingGroupId,
                ListScalingNotificationsRequest::setScalingGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingPoliciesRequest, ListScalingPoliciesResponse> listScalingPolicies =
        genForListScalingPolicies();

    private static HttpRequestDef<ListScalingPoliciesRequest, ListScalingPoliciesResponse> genForListScalingPolicies() {
        // basic
        HttpRequestDef.Builder<ListScalingPoliciesRequest, ListScalingPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScalingPoliciesRequest.class, ListScalingPoliciesResponse.class)
                .withName("ListScalingPolicies")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_group_id}/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingGroupId,
                ListScalingPoliciesRequest::setScalingGroupId));
        builder.<String>withRequestField("scaling_policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingPolicyName,
                ListScalingPoliciesRequest::setScalingPolicyName));
        builder.<ListScalingPoliciesRequest.ScalingPolicyTypeEnum>withRequestField("scaling_policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingPoliciesRequest.ScalingPolicyTypeEnum.class),
            f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingPolicyType,
                ListScalingPoliciesRequest::setScalingPolicyType));
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPoliciesRequest::getScalingPolicyId,
                ListScalingPoliciesRequest::setScalingPolicyId));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingPoliciesRequest::getStartNumber,
                ListScalingPoliciesRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingPoliciesRequest::getLimit, ListScalingPoliciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> listScalingPolicyExecuteLogs =
        genForListScalingPolicyExecuteLogs();

    private static HttpRequestDef<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> genForListScalingPolicyExecuteLogs() {
        // basic
        HttpRequestDef.Builder<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListScalingPolicyExecuteLogsRequest.class,
                    ListScalingPolicyExecuteLogsResponse.class)
                .withName("ListScalingPolicyExecuteLogs")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy_execute_log/{scaling_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getScalingPolicyId,
                ListScalingPolicyExecuteLogsRequest::setScalingPolicyId));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getLogId,
                ListScalingPolicyExecuteLogsRequest::setLogId));
        builder.<ListScalingPolicyExecuteLogsRequest.ScalingResourceTypeEnum>withRequestField("scaling_resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingPolicyExecuteLogsRequest.ScalingResourceTypeEnum.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getScalingResourceType,
                ListScalingPolicyExecuteLogsRequest::setScalingResourceType));
        builder.<String>withRequestField("scaling_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getScalingResourceId,
                ListScalingPolicyExecuteLogsRequest::setScalingResourceId));
        builder.<ListScalingPolicyExecuteLogsRequest.ExecuteTypeEnum>withRequestField("execute_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScalingPolicyExecuteLogsRequest.ExecuteTypeEnum.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getExecuteType,
                ListScalingPolicyExecuteLogsRequest::setExecuteType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getStartTime,
                ListScalingPolicyExecuteLogsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getEndTime,
                ListScalingPolicyExecuteLogsRequest::setEndTime));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getStartNumber,
                ListScalingPolicyExecuteLogsRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingPolicyExecuteLogsRequest::getLimit,
                ListScalingPolicyExecuteLogsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> listScalingTagInfosByResourceId =
        genForListScalingTagInfosByResourceId();

    private static HttpRequestDef<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> genForListScalingTagInfosByResourceId() {
        // basic
        HttpRequestDef.Builder<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListScalingTagInfosByResourceIdRequest.class,
                    ListScalingTagInfosByResourceIdResponse.class)
                .withName("ListScalingTagInfosByResourceId")
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListScalingTagInfosByResourceIdRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListScalingTagInfosByResourceIdRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListScalingTagInfosByResourceIdRequest::getResourceType,
                ListScalingTagInfosByResourceIdRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingTagInfosByResourceIdRequest::getResourceId,
                ListScalingTagInfosByResourceIdRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> listScalingTagInfosByTenantId =
        genForListScalingTagInfosByTenantId();

    private static HttpRequestDef<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> genForListScalingTagInfosByTenantId() {
        // basic
        HttpRequestDef.Builder<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListScalingTagInfosByTenantIdRequest.class,
                    ListScalingTagInfosByTenantIdResponse.class)
                .withName("ListScalingTagInfosByTenantId")
                .withUri("/autoscaling-api/v1/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListScalingTagInfosByTenantIdRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListScalingTagInfosByTenantIdRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListScalingTagInfosByTenantIdRequest::getResourceType,
                ListScalingTagInfosByTenantIdRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseScalingGroupRequest, PauseScalingGroupResponse> pauseScalingGroup =
        genForPauseScalingGroup();

    private static HttpRequestDef<PauseScalingGroupRequest, PauseScalingGroupResponse> genForPauseScalingGroup() {
        // basic
        HttpRequestDef.Builder<PauseScalingGroupRequest, PauseScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PauseScalingGroupRequest.class, PauseScalingGroupResponse.class)
                .withName("PauseScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseScalingGroupRequest::getScalingGroupId,
                PauseScalingGroupRequest::setScalingGroupId));
        builder.<PauseScalingGroupOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PauseScalingGroupOption.class),
            f -> f.withMarshaller(PauseScalingGroupRequest::getBody, PauseScalingGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseScalingPolicyRequest, PauseScalingPolicyResponse> pauseScalingPolicy =
        genForPauseScalingPolicy();

    private static HttpRequestDef<PauseScalingPolicyRequest, PauseScalingPolicyResponse> genForPauseScalingPolicy() {
        // basic
        HttpRequestDef.Builder<PauseScalingPolicyRequest, PauseScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PauseScalingPolicyRequest.class, PauseScalingPolicyResponse.class)
                .withName("PauseScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseScalingPolicyRequest::getScalingPolicyId,
                PauseScalingPolicyRequest::setScalingPolicyId));
        builder.<PauseScalingPolicyOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PauseScalingPolicyOption.class),
            f -> f.withMarshaller(PauseScalingPolicyRequest::getBody, PauseScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResumeScalingGroupRequest, ResumeScalingGroupResponse> resumeScalingGroup =
        genForResumeScalingGroup();

    private static HttpRequestDef<ResumeScalingGroupRequest, ResumeScalingGroupResponse> genForResumeScalingGroup() {
        // basic
        HttpRequestDef.Builder<ResumeScalingGroupRequest, ResumeScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResumeScalingGroupRequest.class, ResumeScalingGroupResponse.class)
                .withName("ResumeScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeScalingGroupRequest::getScalingGroupId,
                ResumeScalingGroupRequest::setScalingGroupId));
        builder.<ResumeScalingGroupOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResumeScalingGroupOption.class),
            f -> f.withMarshaller(ResumeScalingGroupRequest::getBody, ResumeScalingGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> resumeScalingPolicy =
        genForResumeScalingPolicy();

    private static HttpRequestDef<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> genForResumeScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResumeScalingPolicyRequest.class, ResumeScalingPolicyResponse.class)
                .withName("ResumeScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeScalingPolicyRequest::getScalingPolicyId,
                ResumeScalingPolicyRequest::setScalingPolicyId));
        builder.<ResumeScalingPolicyOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResumeScalingPolicyOption.class),
            f -> f.withMarshaller(ResumeScalingPolicyRequest::getBody, ResumeScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> showLifeCycleHook =
        genForShowLifeCycleHook();

    private static HttpRequestDef<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> genForShowLifeCycleHook() {
        // basic
        HttpRequestDef.Builder<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLifeCycleHookRequest.class, ShowLifeCycleHookResponse.class)
                .withName("ShowLifeCycleHook")
                .withUri(
                    "/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLifeCycleHookRequest::getScalingGroupId,
                ShowLifeCycleHookRequest::setScalingGroupId));
        builder.<String>withRequestField("lifecycle_hook_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLifeCycleHookRequest::getLifecycleHookName,
                ShowLifeCycleHookRequest::setLifecycleHookName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> showPolicyAndInstanceQuota =
        genForShowPolicyAndInstanceQuota();

    private static HttpRequestDef<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> genForShowPolicyAndInstanceQuota() {
        // basic
        HttpRequestDef.Builder<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPolicyAndInstanceQuotaRequest.class,
                    ShowPolicyAndInstanceQuotaResponse.class)
                .withName("ShowPolicyAndInstanceQuota")
                .withUri("/autoscaling-api/v1/{project_id}/quotas/{scaling_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyAndInstanceQuotaRequest::getScalingGroupId,
                ShowPolicyAndInstanceQuotaRequest::setScalingGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceQuotaRequest, ShowResourceQuotaResponse> showResourceQuota =
        genForShowResourceQuota();

    private static HttpRequestDef<ShowResourceQuotaRequest, ShowResourceQuotaResponse> genForShowResourceQuota() {
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

    public static final HttpRequestDef<ShowScalingConfigRequest, ShowScalingConfigResponse> showScalingConfig =
        genForShowScalingConfig();

    private static HttpRequestDef<ShowScalingConfigRequest, ShowScalingConfigResponse> genForShowScalingConfig() {
        // basic
        HttpRequestDef.Builder<ShowScalingConfigRequest, ShowScalingConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingConfigRequest.class, ShowScalingConfigResponse.class)
                .withName("ShowScalingConfig")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_configuration/{scaling_configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScalingConfigRequest::getScalingConfigurationId,
                ShowScalingConfigRequest::setScalingConfigurationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScalingGroupRequest, ShowScalingGroupResponse> showScalingGroup =
        genForShowScalingGroup();

    private static HttpRequestDef<ShowScalingGroupRequest, ShowScalingGroupResponse> genForShowScalingGroup() {
        // basic
        HttpRequestDef.Builder<ShowScalingGroupRequest, ShowScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingGroupRequest.class, ShowScalingGroupResponse.class)
                .withName("ShowScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScalingGroupRequest::getScalingGroupId,
                ShowScalingGroupRequest::setScalingGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScalingPolicyRequest, ShowScalingPolicyResponse> showScalingPolicy =
        genForShowScalingPolicy();

    private static HttpRequestDef<ShowScalingPolicyRequest, ShowScalingPolicyResponse> genForShowScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowScalingPolicyRequest, ShowScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingPolicyRequest.class, ShowScalingPolicyResponse.class)
                .withName("ShowScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScalingPolicyRequest::getScalingPolicyId,
                ShowScalingPolicyRequest::setScalingPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupScheduledTaskRequest, UpdateGroupScheduledTaskResponse> updateGroupScheduledTask =
        genForUpdateGroupScheduledTask();

    private static HttpRequestDef<UpdateGroupScheduledTaskRequest, UpdateGroupScheduledTaskResponse> genForUpdateGroupScheduledTask() {
        // basic
        HttpRequestDef.Builder<UpdateGroupScheduledTaskRequest, UpdateGroupScheduledTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateGroupScheduledTaskRequest.class, UpdateGroupScheduledTaskResponse.class)
                .withName("UpdateGroupScheduledTask")
                .withUri(
                    "/autoscaling-api/v1/{project_id}/scaling-groups/{scaling_group_id}/scheduled-tasks/{scheduled_task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGroupScheduledTaskRequest::getScalingGroupId,
                UpdateGroupScheduledTaskRequest::setScalingGroupId));
        builder.<String>withRequestField("scheduled_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGroupScheduledTaskRequest::getScheduledTaskId,
                UpdateGroupScheduledTaskRequest::setScheduledTaskId));
        builder.<UpdateScheduledTaskOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScheduledTaskOption.class),
            f -> f.withMarshaller(UpdateGroupScheduledTaskRequest::getBody, UpdateGroupScheduledTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> updateLifeCycleHook =
        genForUpdateLifeCycleHook();

    private static HttpRequestDef<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> genForUpdateLifeCycleHook() {
        // basic
        HttpRequestDef.Builder<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLifeCycleHookRequest.class, UpdateLifeCycleHookResponse.class)
                .withName("UpdateLifeCycleHook")
                .withUri(
                    "/autoscaling-api/v1/{project_id}/scaling_lifecycle_hook/{scaling_group_id}/{lifecycle_hook_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLifeCycleHookRequest::getScalingGroupId,
                UpdateLifeCycleHookRequest::setScalingGroupId));
        builder.<String>withRequestField("lifecycle_hook_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLifeCycleHookRequest::getLifecycleHookName,
                UpdateLifeCycleHookRequest::setLifecycleHookName));
        builder.<UpdateLifeCycleHookOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLifeCycleHookOption.class),
            f -> f.withMarshaller(UpdateLifeCycleHookRequest::getBody, UpdateLifeCycleHookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScalingGroupRequest, UpdateScalingGroupResponse> updateScalingGroup =
        genForUpdateScalingGroup();

    private static HttpRequestDef<UpdateScalingGroupRequest, UpdateScalingGroupResponse> genForUpdateScalingGroup() {
        // basic
        HttpRequestDef.Builder<UpdateScalingGroupRequest, UpdateScalingGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScalingGroupRequest.class, UpdateScalingGroupResponse.class)
                .withName("UpdateScalingGroup")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_group/{scaling_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScalingGroupRequest::getScalingGroupId,
                UpdateScalingGroupRequest::setScalingGroupId));
        builder.<UpdateScalingGroupOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScalingGroupOption.class),
            f -> f.withMarshaller(UpdateScalingGroupRequest::getBody, UpdateScalingGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> updateScalingPolicy =
        genForUpdateScalingPolicy();

    private static HttpRequestDef<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> genForUpdateScalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScalingPolicyRequest.class, UpdateScalingPolicyResponse.class)
                .withName("UpdateScalingPolicy")
                .withUri("/autoscaling-api/v1/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScalingPolicyRequest::getScalingPolicyId,
                UpdateScalingPolicyRequest::setScalingPolicyId));
        builder.<UpdateScalingPolicyOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScalingPolicyOption.class),
            f -> f.withMarshaller(UpdateScalingPolicyRequest::getBody, UpdateScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
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

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<ShowApiVersionRequest.ApiVersionEnum>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApiVersionRequest.ApiVersionEnum.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, ShowApiVersionRequest::setApiVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> createScalingV2Policy =
        genForCreateScalingV2Policy();

    private static HttpRequestDef<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> genForCreateScalingV2Policy() {
        // basic
        HttpRequestDef.Builder<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateScalingV2PolicyRequest.class, CreateScalingV2PolicyResponse.class)
            .withName("CreateScalingV2Policy")
            .withUri("/autoscaling-api/v2/{project_id}/scaling_policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateScalingPolicyV2Option>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScalingPolicyV2Option.class),
            f -> f.withMarshaller(CreateScalingV2PolicyRequest::getBody, CreateScalingV2PolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> listAllScalingV2Policies =
        genForListAllScalingV2Policies();

    private static HttpRequestDef<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> genForListAllScalingV2Policies() {
        // basic
        HttpRequestDef.Builder<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAllScalingV2PoliciesRequest.class, ListAllScalingV2PoliciesResponse.class)
                .withName("ListAllScalingV2Policies")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingResourceId,
                ListAllScalingV2PoliciesRequest::setScalingResourceId));
        builder.<ListAllScalingV2PoliciesRequest.ScalingResourceTypeEnum>withRequestField("scaling_resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllScalingV2PoliciesRequest.ScalingResourceTypeEnum.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingResourceType,
                ListAllScalingV2PoliciesRequest::setScalingResourceType));
        builder.<String>withRequestField("scaling_policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingPolicyName,
                ListAllScalingV2PoliciesRequest::setScalingPolicyName));
        builder.<ListAllScalingV2PoliciesRequest.ScalingPolicyTypeEnum>withRequestField("scaling_policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllScalingV2PoliciesRequest.ScalingPolicyTypeEnum.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingPolicyType,
                ListAllScalingV2PoliciesRequest::setScalingPolicyType));
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getScalingPolicyId,
                ListAllScalingV2PoliciesRequest::setScalingPolicyId));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getStartNumber,
                ListAllScalingV2PoliciesRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getLimit,
                ListAllScalingV2PoliciesRequest::setLimit));
        builder.<ListAllScalingV2PoliciesRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllScalingV2PoliciesRequest.SortByEnum.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getSortBy,
                ListAllScalingV2PoliciesRequest::setSortBy));
        builder.<ListAllScalingV2PoliciesRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAllScalingV2PoliciesRequest.OrderEnum.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getOrder,
                ListAllScalingV2PoliciesRequest::setOrder));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getEnterpriseProjectId,
                ListAllScalingV2PoliciesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllScalingV2PoliciesRequest::getAlarmId,
                ListAllScalingV2PoliciesRequest::setAlarmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> listScalingV2Policies =
        genForListScalingV2Policies();

    private static HttpRequestDef<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> genForListScalingV2Policies() {
        // basic
        HttpRequestDef.Builder<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListScalingV2PoliciesRequest.class, ListScalingV2PoliciesResponse.class)
            .withName("ListScalingV2Policies")
            .withUri("/autoscaling-api/v2/{project_id}/scaling_policy/{scaling_resource_id}/list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingResourceId,
                ListScalingV2PoliciesRequest::setScalingResourceId));
        builder.<String>withRequestField("scaling_policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingPolicyName,
                ListScalingV2PoliciesRequest::setScalingPolicyName));
        builder.<String>withRequestField("scaling_policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingPolicyType,
                ListScalingV2PoliciesRequest::setScalingPolicyType));
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getScalingPolicyId,
                ListScalingV2PoliciesRequest::setScalingPolicyId));
        builder.<Integer>withRequestField("start_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getStartNumber,
                ListScalingV2PoliciesRequest::setStartNumber));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScalingV2PoliciesRequest::getLimit, ListScalingV2PoliciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> showScalingV2Policy =
        genForShowScalingV2Policy();

    private static HttpRequestDef<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> genForShowScalingV2Policy() {
        // basic
        HttpRequestDef.Builder<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingV2PolicyRequest.class, ShowScalingV2PolicyResponse.class)
                .withName("ShowScalingV2Policy")
                .withUri("/autoscaling-api/v2/{project_id}/scaling_policy/{scaling_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScalingV2PolicyRequest::getScalingPolicyId,
                ShowScalingV2PolicyRequest::setScalingPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> updateScalingV2Policy =
        genForUpdateScalingV2Policy();

    private static HttpRequestDef<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> genForUpdateScalingV2Policy() {
        // basic
        HttpRequestDef.Builder<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateScalingV2PolicyRequest.class, UpdateScalingV2PolicyResponse.class)
            .withName("UpdateScalingV2Policy")
            .withUri("/autoscaling-api/v2/{project_id}/scaling_policy/{scaling_policy_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("scaling_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScalingV2PolicyRequest::getScalingPolicyId,
                UpdateScalingV2PolicyRequest::setScalingPolicyId));
        builder.<UpdateScalingV2PolicyOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScalingV2PolicyOption.class),
            f -> f.withMarshaller(UpdateScalingV2PolicyRequest::getBody, UpdateScalingV2PolicyRequest::setBody));

        // response

        return builder.build();
    }

}

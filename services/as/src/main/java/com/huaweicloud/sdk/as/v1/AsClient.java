package com.huaweicloud.sdk.as.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.as.v1.model.*;

public class AsClient {
    protected HcClient hcClient;

    public AsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AsClient> newBuilder() {
        return new ClientBuilder<>(AsClient::new);
    }

    public BatchDeleteScalingConfigsResponse batchDeleteScalingConfigs(BatchDeleteScalingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchDeleteScalingConfigs);
    }

    public CompleteLifecycleActionResponse completeLifecycleAction(CompleteLifecycleActionRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.completeLifecycleAction);
    }

    public CreateLifyCycleHookResponse createLifyCycleHook(CreateLifyCycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createLifyCycleHook);
    }

    public CreateScalingConfigResponse createScalingConfig(CreateScalingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingConfig);
    }

    public CreateScalingGroupResponse createScalingGroup(CreateScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingGroup);
    }

    public CreateScalingNotificationResponse createScalingNotification(CreateScalingNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingNotification);
    }

    public CreateScalingPolicyResponse createScalingPolicy(CreateScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingPolicy);
    }

    public CreateScalingTagsResponse createScalingTags(CreateScalingTagsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingTags);
    }

    public DeleteLifecycleHookResponse deleteLifecycleHook(DeleteLifecycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteLifecycleHook);
    }

    public DeleteScalingConfigResponse deleteScalingConfig(DeleteScalingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingConfig);
    }

    public DeleteScalingGroupResponse deleteScalingGroup(DeleteScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingGroup);
    }

    public DeleteScalingInstanceResponse deleteScalingInstance(DeleteScalingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingInstance);
    }

    public DeleteScalingNotificationResponse deleteScalingNotification(DeleteScalingNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingNotification);
    }

    public DeleteScalingPolicyResponse deleteScalingPolicy(DeleteScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingPolicy);
    }

    public DeleteScalingTagsResponse deleteScalingTags(DeleteScalingTagsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingTags);
    }

    public EnableOrDisableScalingGroupResponse enableOrDisableScalingGroup(EnableOrDisableScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.enableOrDisableScalingGroup);
    }

    public ExecuteScalingPolicyResponse executeScalingPolicy(ExecuteScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.executeScalingPolicy);
    }

    public ListHookInstancesResponse listHookInstances(ListHookInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listHookInstances);
    }

    public ListLifeCycleHooksResponse listLifeCycleHooks(ListLifeCycleHooksRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listLifeCycleHooks);
    }

    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listResourceInstances);
    }

    public ListScalingActivityLogsResponse listScalingActivityLogs(ListScalingActivityLogsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingActivityLogs);
    }

    public ListScalingConfigsResponse listScalingConfigs(ListScalingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingConfigs);
    }

    public ListScalingGroupsResponse listScalingGroups(ListScalingGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingGroups);
    }

    public ListScalingInstancesResponse listScalingInstances(ListScalingInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingInstances);
    }

    public ListScalingNotificationsResponse listScalingNotifications(ListScalingNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingNotifications);
    }

    public ListScalingPoliciesResponse listScalingPolicies(ListScalingPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingPolicies);
    }

    public ListScalingPolicyExecuteLogsResponse listScalingPolicyExecuteLogs(ListScalingPolicyExecuteLogsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingPolicyExecuteLogs);
    }

    public ListScalingTagInfosByResourceIdResponse listScalingTagInfosByResourceId(ListScalingTagInfosByResourceIdRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingTagInfosByResourceId);
    }

    public ListScalingTagInfosByTenantIdResponse listScalingTagInfosByTenantId(ListScalingTagInfosByTenantIdRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingTagInfosByTenantId);
    }

    public ShowLifeCycleHookResponse showLifeCycleHook(ShowLifeCycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showLifeCycleHook);
    }

    public ShowPolicyAndInstanceQuotaResponse showPolicyAndInstanceQuota(ShowPolicyAndInstanceQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showPolicyAndInstanceQuota);
    }

    public ShowResourceQuotaResponse showResourceQuota(ShowResourceQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showResourceQuota);
    }

    public ShowScalingConfigResponse showScalingConfig(ShowScalingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showScalingConfig);
    }

    public ShowScalingGroupResponse showScalingGroup(ShowScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showScalingGroup);
    }

    public ShowScalingPolicyResponse showScalingPolicy(ShowScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showScalingPolicy);
    }

    public UpdateLifeCycleHookResponse updateLifeCycleHook(UpdateLifeCycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateLifeCycleHook);
    }

    public UpdateScalingGroupResponse updateScalingGroup(UpdateScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateScalingGroup);
    }

    public UpdateScalingGroupInstanceResponse updateScalingGroupInstance(UpdateScalingGroupInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateScalingGroupInstance);
    }

    public UpdateScalingPolicyResponse updateScalingPolicy(UpdateScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateScalingPolicy);
    }

}
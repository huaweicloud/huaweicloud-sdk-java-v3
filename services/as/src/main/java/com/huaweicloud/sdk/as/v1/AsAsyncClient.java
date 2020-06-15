package com.huaweicloud.sdk.as.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.as.v1.model.*;

public class AsAsyncClient {
    protected HcClient hcClient;

    public AsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AsAsyncClient> newBuilder() {
        return new ClientBuilder<>(AsAsyncClient::new);
    }


    public CompletableFuture<BatchDeleteScalingConfigsResponse> batchDeleteScalingConfigsAsync(BatchDeleteScalingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchDeleteScalingConfigs);
    }

    public CompletableFuture<CompleteLifecycleActionResponse> completeLifecycleActionAsync(CompleteLifecycleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.completeLifecycleAction);
    }

    public CompletableFuture<CreateLifyCycleHookResponse> createLifyCycleHookAsync(CreateLifyCycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createLifyCycleHook);
    }

    public CompletableFuture<CreateScalingConfigResponse> createScalingConfigAsync(CreateScalingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingConfig);
    }

    public CompletableFuture<CreateScalingGroupResponse> createScalingGroupAsync(CreateScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingGroup);
    }

    public CompletableFuture<CreateScalingNotificationResponse> createScalingNotificationAsync(CreateScalingNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingNotification);
    }

    public CompletableFuture<CreateScalingPolicyResponse> createScalingPolicyAsync(CreateScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingPolicy);
    }

    public CompletableFuture<CreateScalingTagsResponse> createScalingTagsAsync(CreateScalingTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingTags);
    }

    public CompletableFuture<DeleteLifecycleHookResponse> deleteLifecycleHookAsync(DeleteLifecycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteLifecycleHook);
    }

    public CompletableFuture<DeleteScalingConfigResponse> deleteScalingConfigAsync(DeleteScalingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingConfig);
    }

    public CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroupAsync(DeleteScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingGroup);
    }

    public CompletableFuture<DeleteScalingInstanceResponse> deleteScalingInstanceAsync(DeleteScalingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingInstance);
    }

    public CompletableFuture<DeleteScalingNotificationResponse> deleteScalingNotificationAsync(DeleteScalingNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingNotification);
    }

    public CompletableFuture<DeleteScalingPolicyResponse> deleteScalingPolicyAsync(DeleteScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingPolicy);
    }

    public CompletableFuture<DeleteScalingTagsResponse> deleteScalingTagsAsync(DeleteScalingTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingTags);
    }

    public CompletableFuture<EnableOrDisableScalingGroupResponse> enableOrDisableScalingGroupAsync(EnableOrDisableScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.enableOrDisableScalingGroup);
    }

    public CompletableFuture<ExecuteScalingPolicyResponse> executeScalingPolicyAsync(ExecuteScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.executeScalingPolicy);
    }

    public CompletableFuture<ListHookInstancesResponse> listHookInstancesAsync(ListHookInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listHookInstances);
    }

    public CompletableFuture<ListLifeCycleHooksResponse> listLifeCycleHooksAsync(ListLifeCycleHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listLifeCycleHooks);
    }

    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listResourceInstances);
    }

    public CompletableFuture<ListScalingActivityLogsResponse> listScalingActivityLogsAsync(ListScalingActivityLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingActivityLogs);
    }

    public CompletableFuture<ListScalingConfigsResponse> listScalingConfigsAsync(ListScalingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingConfigs);
    }

    public CompletableFuture<ListScalingGroupsResponse> listScalingGroupsAsync(ListScalingGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingGroups);
    }

    public CompletableFuture<ListScalingInstancesResponse> listScalingInstancesAsync(ListScalingInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingInstances);
    }

    public CompletableFuture<ListScalingNotificationsResponse> listScalingNotificationsAsync(ListScalingNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingNotifications);
    }

    public CompletableFuture<ListScalingPoliciesResponse> listScalingPoliciesAsync(ListScalingPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingPolicies);
    }

    public CompletableFuture<ListScalingPolicyExecuteLogsResponse> listScalingPolicyExecuteLogsAsync(ListScalingPolicyExecuteLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingPolicyExecuteLogs);
    }

    public CompletableFuture<ListScalingTagInfosByResourceIdResponse> listScalingTagInfosByResourceIdAsync(ListScalingTagInfosByResourceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingTagInfosByResourceId);
    }

    public CompletableFuture<ListScalingTagInfosByTenantIdResponse> listScalingTagInfosByTenantIdAsync(ListScalingTagInfosByTenantIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingTagInfosByTenantId);
    }

    public CompletableFuture<ShowLifeCycleHookResponse> showLifeCycleHookAsync(ShowLifeCycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showLifeCycleHook);
    }

    public CompletableFuture<ShowPolicyAndInstanceQuotaResponse> showPolicyAndInstanceQuotaAsync(ShowPolicyAndInstanceQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showPolicyAndInstanceQuota);
    }

    public CompletableFuture<ShowResourceQuotaResponse> showResourceQuotaAsync(ShowResourceQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showResourceQuota);
    }

    public CompletableFuture<ShowScalingConfigResponse> showScalingConfigAsync(ShowScalingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showScalingConfig);
    }

    public CompletableFuture<ShowScalingGroupResponse> showScalingGroupAsync(ShowScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showScalingGroup);
    }

    public CompletableFuture<ShowScalingPolicyResponse> showScalingPolicyAsync(ShowScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showScalingPolicy);
    }

    public CompletableFuture<UpdateLifeCycleHookResponse> updateLifeCycleHookAsync(UpdateLifeCycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateLifeCycleHook);
    }

    public CompletableFuture<UpdateScalingGroupResponse> updateScalingGroupAsync(UpdateScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateScalingGroup);
    }

    public CompletableFuture<UpdateScalingGroupInstanceResponse> updateScalingGroupInstanceAsync(UpdateScalingGroupInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateScalingGroupInstance);
    }

    public CompletableFuture<UpdateScalingPolicyResponse> updateScalingPolicyAsync(UpdateScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateScalingPolicy);
    }

}
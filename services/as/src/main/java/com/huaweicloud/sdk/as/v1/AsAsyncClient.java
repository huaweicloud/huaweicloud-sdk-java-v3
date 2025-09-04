package com.huaweicloud.sdk.as.v1;

import com.huaweicloud.sdk.as.v1.model.AttachCallbackInstanceLifeCycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.AttachCallbackInstanceLifeCycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.BatchAddScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchAddScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingConfigsRequest;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingConfigsResponse;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingPoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchDeleteScalingPoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchPauseScalingPoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchPauseScalingPoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchProtectScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchProtectScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchRemoveScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchRemoveScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchResumeScalingPoliciesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchResumeScalingPoliciesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchSetScalingInstancesStandbyRequest;
import com.huaweicloud.sdk.as.v1.model.BatchSetScalingInstancesStandbyResponse;
import com.huaweicloud.sdk.as.v1.model.BatchUnprotectScalingInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.BatchUnprotectScalingInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.BatchUnsetScalingInstancesStantbyRequest;
import com.huaweicloud.sdk.as.v1.model.BatchUnsetScalingInstancesStantbyResponse;
import com.huaweicloud.sdk.as.v1.model.CloseWarmPoolRequest;
import com.huaweicloud.sdk.as.v1.model.CloseWarmPoolResponse;
import com.huaweicloud.sdk.as.v1.model.CreateGroupScheduledTaskRequest;
import com.huaweicloud.sdk.as.v1.model.CreateGroupScheduledTaskResponse;
import com.huaweicloud.sdk.as.v1.model.CreateLifyCycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.CreateLifyCycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingConfigRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingConfigResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingNotificationRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingNotificationResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingTagInfoRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingTagInfoResponse;
import com.huaweicloud.sdk.as.v1.model.CreateScalingV2PolicyRequest;
import com.huaweicloud.sdk.as.v1.model.CreateScalingV2PolicyResponse;
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
import com.huaweicloud.sdk.as.v1.model.ListWarmPoolInstancesRequest;
import com.huaweicloud.sdk.as.v1.model.ListWarmPoolInstancesResponse;
import com.huaweicloud.sdk.as.v1.model.PauseScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.PauseScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.PauseScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.PauseScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.PutWarmPoolRequest;
import com.huaweicloud.sdk.as.v1.model.PutWarmPoolResponse;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.ResumeScalingGroupResponse;
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
import com.huaweicloud.sdk.as.v1.model.ShowWarmPoolRequest;
import com.huaweicloud.sdk.as.v1.model.ShowWarmPoolResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateGroupScheduledTaskRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateGroupScheduledTaskResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateLifeCycleHookRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateLifeCycleHookResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingConfigRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingConfigResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingGroupRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingGroupResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingPolicyRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingPolicyResponse;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingV2PolicyRequest;
import com.huaweicloud.sdk.as.v1.model.UpdateScalingV2PolicyResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AsAsyncClient {

    protected HcClient hcClient;

    public AsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AsAsyncClient> newBuilder() {
        ClientBuilder<AsAsyncClient> clientBuilder = new ClientBuilder<>(AsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 伸缩实例生命周期回调
     *
     * 通过生命周期操作令牌或者通过实例ID和生命周期挂钩名称对伸缩实例指定的挂钩进行回调操作。如果在超时时间结束前已完成自定义操作，选择终止或继续完成生命周期操作。如果需要更多时间完成自定义操作，选择延长超时时间，实例保持等待状态的时间将增加1小时。只有实例的生命周期挂钩状态为 HANGING 时才可以进行回调操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachCallbackInstanceLifeCycleHookRequest 请求对象
     * @return CompletableFuture<AttachCallbackInstanceLifeCycleHookResponse>
     */
    public CompletableFuture<AttachCallbackInstanceLifeCycleHookResponse> attachCallbackInstanceLifeCycleHookAsync(
        AttachCallbackInstanceLifeCycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.attachCallbackInstanceLifeCycleHook);
    }

    /**
     * 伸缩实例生命周期回调
     *
     * 通过生命周期操作令牌或者通过实例ID和生命周期挂钩名称对伸缩实例指定的挂钩进行回调操作。如果在超时时间结束前已完成自定义操作，选择终止或继续完成生命周期操作。如果需要更多时间完成自定义操作，选择延长超时时间，实例保持等待状态的时间将增加1小时。只有实例的生命周期挂钩状态为 HANGING 时才可以进行回调操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachCallbackInstanceLifeCycleHookRequest 请求对象
     * @return AsyncInvoker<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse>
     */
    public AsyncInvoker<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> attachCallbackInstanceLifeCycleHookAsyncInvoker(
        AttachCallbackInstanceLifeCycleHookRequest request) {
        return new AsyncInvoker<>(request, AsMeta.attachCallbackInstanceLifeCycleHook, hcClient);
    }

    /**
     * 批量添加实例
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。说明：- 单次最多批量操作实例个数为10。批量添加后实例数不能大于伸缩组的最大实例数，批量移出后实例数不能小于伸缩组的最小实例数。- 当伸缩组处于INSERVICE状态且没有伸缩活动时，才能添加实例。- 当伸缩组没有伸缩活动时，才能移出实例。- 向伸缩组中添加实例时，必须保证实例所在的可用区包含于伸缩组的可用区内。- 实例处于INSERVICE状态时才可以进行移出、设置或取消实例保护属性等操作。- 当伸缩组发生自动缩容活动时，设置了实例保护的实例不会被移出伸缩组。- 批量移出弹性伸缩组中的实例时，若该实例加入伸缩组时绑定的监听器和伸缩组本身的监听器相同，会解绑定实例和监听器。若该实例加入伸缩组时绑定的监听器和伸缩组本身的监听器不同，会保留实例和监听器的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddScalingInstancesRequest 请求对象
     * @return CompletableFuture<BatchAddScalingInstancesResponse>
     */
    public CompletableFuture<BatchAddScalingInstancesResponse> batchAddScalingInstancesAsync(
        BatchAddScalingInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchAddScalingInstances);
    }

    /**
     * 批量添加实例
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。说明：- 单次最多批量操作实例个数为10。批量添加后实例数不能大于伸缩组的最大实例数，批量移出后实例数不能小于伸缩组的最小实例数。- 当伸缩组处于INSERVICE状态且没有伸缩活动时，才能添加实例。- 当伸缩组没有伸缩活动时，才能移出实例。- 向伸缩组中添加实例时，必须保证实例所在的可用区包含于伸缩组的可用区内。- 实例处于INSERVICE状态时才可以进行移出、设置或取消实例保护属性等操作。- 当伸缩组发生自动缩容活动时，设置了实例保护的实例不会被移出伸缩组。- 批量移出弹性伸缩组中的实例时，若该实例加入伸缩组时绑定的监听器和伸缩组本身的监听器相同，会解绑定实例和监听器。若该实例加入伸缩组时绑定的监听器和伸缩组本身的监听器不同，会保留实例和监听器的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddScalingInstancesRequest 请求对象
     * @return AsyncInvoker<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse>
     */
    public AsyncInvoker<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> batchAddScalingInstancesAsyncInvoker(
        BatchAddScalingInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchAddScalingInstances, hcClient);
    }

    /**
     * 批量删除弹性伸缩配置
     *
     * 批量删除指定弹性伸缩配置。被伸缩组使用的伸缩配置不能被删除。单次最多删除伸缩配置个数为50。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScalingConfigsRequest 请求对象
     * @return CompletableFuture<BatchDeleteScalingConfigsResponse>
     */
    public CompletableFuture<BatchDeleteScalingConfigsResponse> batchDeleteScalingConfigsAsync(
        BatchDeleteScalingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchDeleteScalingConfigs);
    }

    /**
     * 批量删除弹性伸缩配置
     *
     * 批量删除指定弹性伸缩配置。被伸缩组使用的伸缩配置不能被删除。单次最多删除伸缩配置个数为50。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScalingConfigsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse>
     */
    public AsyncInvoker<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> batchDeleteScalingConfigsAsyncInvoker(
        BatchDeleteScalingConfigsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchDeleteScalingConfigs, hcClient);
    }

    /**
     * 批量删除弹性伸缩策略。
     *
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScalingPoliciesRequest 请求对象
     * @return CompletableFuture<BatchDeleteScalingPoliciesResponse>
     */
    public CompletableFuture<BatchDeleteScalingPoliciesResponse> batchDeleteScalingPoliciesAsync(
        BatchDeleteScalingPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchDeleteScalingPolicies);
    }

    /**
     * 批量删除弹性伸缩策略。
     *
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScalingPoliciesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse>
     */
    public AsyncInvoker<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> batchDeleteScalingPoliciesAsyncInvoker(
        BatchDeleteScalingPoliciesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchDeleteScalingPolicies, hcClient);
    }

    /**
     * 批量停用弹性伸缩策略。
     *
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPauseScalingPoliciesRequest 请求对象
     * @return CompletableFuture<BatchPauseScalingPoliciesResponse>
     */
    public CompletableFuture<BatchPauseScalingPoliciesResponse> batchPauseScalingPoliciesAsync(
        BatchPauseScalingPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchPauseScalingPolicies);
    }

    /**
     * 批量停用弹性伸缩策略。
     *
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPauseScalingPoliciesRequest 请求对象
     * @return AsyncInvoker<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse>
     */
    public AsyncInvoker<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> batchPauseScalingPoliciesAsyncInvoker(
        BatchPauseScalingPoliciesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchPauseScalingPolicies, hcClient);
    }

    /**
     * 批量设置实例保护
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchProtectScalingInstancesRequest 请求对象
     * @return CompletableFuture<BatchProtectScalingInstancesResponse>
     */
    public CompletableFuture<BatchProtectScalingInstancesResponse> batchProtectScalingInstancesAsync(
        BatchProtectScalingInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchProtectScalingInstances);
    }

    /**
     * 批量设置实例保护
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchProtectScalingInstancesRequest 请求对象
     * @return AsyncInvoker<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse>
     */
    public AsyncInvoker<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> batchProtectScalingInstancesAsyncInvoker(
        BatchProtectScalingInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchProtectScalingInstances, hcClient);
    }

    /**
     * 批量移除实例
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveScalingInstancesRequest 请求对象
     * @return CompletableFuture<BatchRemoveScalingInstancesResponse>
     */
    public CompletableFuture<BatchRemoveScalingInstancesResponse> batchRemoveScalingInstancesAsync(
        BatchRemoveScalingInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchRemoveScalingInstances);
    }

    /**
     * 批量移除实例
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveScalingInstancesRequest 请求对象
     * @return AsyncInvoker<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse>
     */
    public AsyncInvoker<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> batchRemoveScalingInstancesAsyncInvoker(
        BatchRemoveScalingInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchRemoveScalingInstances, hcClient);
    }

    /**
     * 批量启用弹性伸缩策略。
     *
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResumeScalingPoliciesRequest 请求对象
     * @return CompletableFuture<BatchResumeScalingPoliciesResponse>
     */
    public CompletableFuture<BatchResumeScalingPoliciesResponse> batchResumeScalingPoliciesAsync(
        BatchResumeScalingPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchResumeScalingPolicies);
    }

    /**
     * 批量启用弹性伸缩策略。
     *
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResumeScalingPoliciesRequest 请求对象
     * @return AsyncInvoker<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse>
     */
    public AsyncInvoker<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> batchResumeScalingPoliciesAsyncInvoker(
        BatchResumeScalingPoliciesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchResumeScalingPolicies, hcClient);
    }

    /**
     * 批量将实例转为备用状态
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetScalingInstancesStandbyRequest 请求对象
     * @return CompletableFuture<BatchSetScalingInstancesStandbyResponse>
     */
    public CompletableFuture<BatchSetScalingInstancesStandbyResponse> batchSetScalingInstancesStandbyAsync(
        BatchSetScalingInstancesStandbyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchSetScalingInstancesStandby);
    }

    /**
     * 批量将实例转为备用状态
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetScalingInstancesStandbyRequest 请求对象
     * @return AsyncInvoker<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse>
     */
    public AsyncInvoker<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> batchSetScalingInstancesStandbyAsyncInvoker(
        BatchSetScalingInstancesStandbyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchSetScalingInstancesStandby, hcClient);
    }

    /**
     * 批量取消实例保护
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnprotectScalingInstancesRequest 请求对象
     * @return CompletableFuture<BatchUnprotectScalingInstancesResponse>
     */
    public CompletableFuture<BatchUnprotectScalingInstancesResponse> batchUnprotectScalingInstancesAsync(
        BatchUnprotectScalingInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchUnprotectScalingInstances);
    }

    /**
     * 批量取消实例保护
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnprotectScalingInstancesRequest 请求对象
     * @return AsyncInvoker<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse>
     */
    public AsyncInvoker<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> batchUnprotectScalingInstancesAsyncInvoker(
        BatchUnprotectScalingInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchUnprotectScalingInstances, hcClient);
    }

    /**
     * 批量将实例移出备用状态
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnsetScalingInstancesStantbyRequest 请求对象
     * @return CompletableFuture<BatchUnsetScalingInstancesStantbyResponse>
     */
    public CompletableFuture<BatchUnsetScalingInstancesStantbyResponse> batchUnsetScalingInstancesStantbyAsync(
        BatchUnsetScalingInstancesStantbyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.batchUnsetScalingInstancesStantby);
    }

    /**
     * 批量将实例移出备用状态
     *
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUnsetScalingInstancesStantbyRequest 请求对象
     * @return AsyncInvoker<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse>
     */
    public AsyncInvoker<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> batchUnsetScalingInstancesStantbyAsyncInvoker(
        BatchUnsetScalingInstancesStantbyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.batchUnsetScalingInstancesStantby, hcClient);
    }

    /**
     * 关闭暖池
     *
     * 关闭伸缩组的暖池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseWarmPoolRequest 请求对象
     * @return CompletableFuture<CloseWarmPoolResponse>
     */
    public CompletableFuture<CloseWarmPoolResponse> closeWarmPoolAsync(CloseWarmPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.closeWarmPool);
    }

    /**
     * 关闭暖池
     *
     * 关闭伸缩组的暖池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseWarmPoolRequest 请求对象
     * @return AsyncInvoker<CloseWarmPoolRequest, CloseWarmPoolResponse>
     */
    public AsyncInvoker<CloseWarmPoolRequest, CloseWarmPoolResponse> closeWarmPoolAsyncInvoker(
        CloseWarmPoolRequest request) {
        return new AsyncInvoker<>(request, AsMeta.closeWarmPool, hcClient);
    }

    /**
     * 创建计划任务
     *
     * 创建计划任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupScheduledTaskRequest 请求对象
     * @return CompletableFuture<CreateGroupScheduledTaskResponse>
     */
    public CompletableFuture<CreateGroupScheduledTaskResponse> createGroupScheduledTaskAsync(
        CreateGroupScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createGroupScheduledTask);
    }

    /**
     * 创建计划任务
     *
     * 创建计划任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupScheduledTaskRequest 请求对象
     * @return AsyncInvoker<CreateGroupScheduledTaskRequest, CreateGroupScheduledTaskResponse>
     */
    public AsyncInvoker<CreateGroupScheduledTaskRequest, CreateGroupScheduledTaskResponse> createGroupScheduledTaskAsyncInvoker(
        CreateGroupScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createGroupScheduledTask, hcClient);
    }

    /**
     * 创建生命周期挂钩
     *
     * 创建生命周期挂钩，可为伸缩组添加一个或多个生命周期挂钩，最多添加5个。添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被生命周期挂钩挂起并置于等待状态（正在加入伸缩组或正在移出伸缩组），实例将保持此状态直至超时时间结束或者用户手动回调。用户能够在实例保持等待状态的时间段内执行自定义操作，例如，用户可以在新启动的实例上安装或配置软件，也可以在实例终止前从实例中下载日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLifyCycleHookRequest 请求对象
     * @return CompletableFuture<CreateLifyCycleHookResponse>
     */
    public CompletableFuture<CreateLifyCycleHookResponse> createLifyCycleHookAsync(CreateLifyCycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createLifyCycleHook);
    }

    /**
     * 创建生命周期挂钩
     *
     * 创建生命周期挂钩，可为伸缩组添加一个或多个生命周期挂钩，最多添加5个。添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被生命周期挂钩挂起并置于等待状态（正在加入伸缩组或正在移出伸缩组），实例将保持此状态直至超时时间结束或者用户手动回调。用户能够在实例保持等待状态的时间段内执行自定义操作，例如，用户可以在新启动的实例上安装或配置软件，也可以在实例终止前从实例中下载日志文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLifyCycleHookRequest 请求对象
     * @return AsyncInvoker<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse>
     */
    public AsyncInvoker<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> createLifyCycleHookAsyncInvoker(
        CreateLifyCycleHookRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createLifyCycleHook, hcClient);
    }

    /**
     * 创建弹性伸缩配置
     *
     * 创建弹性伸缩配置。伸缩配置是伸缩组内实例（弹性云服务器云主机）的模板，定义了伸缩组内待添加的实例的规格数据。伸缩配置与伸缩组是解耦的，同一伸缩配置可以被多个伸缩组使用。默认最多可以创建100个伸缩配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingConfigRequest 请求对象
     * @return CompletableFuture<CreateScalingConfigResponse>
     */
    public CompletableFuture<CreateScalingConfigResponse> createScalingConfigAsync(CreateScalingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingConfig);
    }

    /**
     * 创建弹性伸缩配置
     *
     * 创建弹性伸缩配置。伸缩配置是伸缩组内实例（弹性云服务器云主机）的模板，定义了伸缩组内待添加的实例的规格数据。伸缩配置与伸缩组是解耦的，同一伸缩配置可以被多个伸缩组使用。默认最多可以创建100个伸缩配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingConfigRequest 请求对象
     * @return AsyncInvoker<CreateScalingConfigRequest, CreateScalingConfigResponse>
     */
    public AsyncInvoker<CreateScalingConfigRequest, CreateScalingConfigResponse> createScalingConfigAsyncInvoker(
        CreateScalingConfigRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createScalingConfig, hcClient);
    }

    /**
     * 创建弹性伸缩组
     *
     * 伸缩组是具有相同应用场景的实例的集合，是启停伸缩策略和进行伸缩活动的基本单位。伸缩组内定义了最大实例数、期望实例数、最小实例数、虚拟私有云、子网、负载均衡等信息。默认最多可以创建10个伸缩组。如果伸缩组配置了负载均衡，在添加或移除实例时，会自动为实例绑定或解绑负载均衡监听器。如果伸缩组使用负载均衡健康检查方式，伸缩组中的实例需要启用负载均衡器的监听端口才能通过健康检查。端口启用可在安全组中进行配置，可参考添加安全组规则进行操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingGroupRequest 请求对象
     * @return CompletableFuture<CreateScalingGroupResponse>
     */
    public CompletableFuture<CreateScalingGroupResponse> createScalingGroupAsync(CreateScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingGroup);
    }

    /**
     * 创建弹性伸缩组
     *
     * 伸缩组是具有相同应用场景的实例的集合，是启停伸缩策略和进行伸缩活动的基本单位。伸缩组内定义了最大实例数、期望实例数、最小实例数、虚拟私有云、子网、负载均衡等信息。默认最多可以创建10个伸缩组。如果伸缩组配置了负载均衡，在添加或移除实例时，会自动为实例绑定或解绑负载均衡监听器。如果伸缩组使用负载均衡健康检查方式，伸缩组中的实例需要启用负载均衡器的监听端口才能通过健康检查。端口启用可在安全组中进行配置，可参考添加安全组规则进行操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingGroupRequest 请求对象
     * @return AsyncInvoker<CreateScalingGroupRequest, CreateScalingGroupResponse>
     */
    public AsyncInvoker<CreateScalingGroupRequest, CreateScalingGroupResponse> createScalingGroupAsyncInvoker(
        CreateScalingGroupRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createScalingGroup, hcClient);
    }

    /**
     * 配置伸缩组通知
     *
     * 给弹性伸缩组配置通知功能。每调用一次该接口，伸缩组即配置一个通知主题及其通知场景，每个伸缩组最多可以增加5个主题。通知主题由用户事先在SMN创建并进行订阅，当通知主题对应的通知场景出现时，伸缩组会向用户的订阅终端发送通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingNotificationRequest 请求对象
     * @return CompletableFuture<CreateScalingNotificationResponse>
     */
    public CompletableFuture<CreateScalingNotificationResponse> createScalingNotificationAsync(
        CreateScalingNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingNotification);
    }

    /**
     * 配置伸缩组通知
     *
     * 给弹性伸缩组配置通知功能。每调用一次该接口，伸缩组即配置一个通知主题及其通知场景，每个伸缩组最多可以增加5个主题。通知主题由用户事先在SMN创建并进行订阅，当通知主题对应的通知场景出现时，伸缩组会向用户的订阅终端发送通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingNotificationRequest 请求对象
     * @return AsyncInvoker<CreateScalingNotificationRequest, CreateScalingNotificationResponse>
     */
    public AsyncInvoker<CreateScalingNotificationRequest, CreateScalingNotificationResponse> createScalingNotificationAsyncInvoker(
        CreateScalingNotificationRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createScalingNotification, hcClient);
    }

    /**
     * 创建弹性伸缩策略
     *
     * 创建弹性伸缩策略。伸缩策略定义了伸缩组内实例的扩张和收缩操作。如果执行伸缩策略造成伸缩组期望实例数与伸缩组内实例数不符，弹性伸缩会自动调整实例资源，以匹配期望实例数。当前伸缩策略支持告警触发策略，周期触发策略，定时触发策略。在策略执行具体动作中，可设置实例变化的个数，或根据当前实例的百分比数进行伸缩。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingPolicyRequest 请求对象
     * @return CompletableFuture<CreateScalingPolicyResponse>
     */
    public CompletableFuture<CreateScalingPolicyResponse> createScalingPolicyAsync(CreateScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingPolicy);
    }

    /**
     * 创建弹性伸缩策略
     *
     * 创建弹性伸缩策略。伸缩策略定义了伸缩组内实例的扩张和收缩操作。如果执行伸缩策略造成伸缩组期望实例数与伸缩组内实例数不符，弹性伸缩会自动调整实例资源，以匹配期望实例数。当前伸缩策略支持告警触发策略，周期触发策略，定时触发策略。在策略执行具体动作中，可设置实例变化的个数，或根据当前实例的百分比数进行伸缩。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingPolicyRequest 请求对象
     * @return AsyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse>
     */
    public AsyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse> createScalingPolicyAsyncInvoker(
        CreateScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createScalingPolicy, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingTagInfoRequest 请求对象
     * @return CompletableFuture<CreateScalingTagInfoResponse>
     */
    public CompletableFuture<CreateScalingTagInfoResponse> createScalingTagInfoAsync(
        CreateScalingTagInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingTagInfo);
    }

    /**
     * 创建标签
     *
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingTagInfoRequest 请求对象
     * @return AsyncInvoker<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse>
     */
    public AsyncInvoker<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> createScalingTagInfoAsyncInvoker(
        CreateScalingTagInfoRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createScalingTagInfo, hcClient);
    }

    /**
     * 删除计划任务
     *
     * 删除计划任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupScheduledTaskRequest 请求对象
     * @return CompletableFuture<DeleteGroupScheduledTaskResponse>
     */
    public CompletableFuture<DeleteGroupScheduledTaskResponse> deleteGroupScheduledTaskAsync(
        DeleteGroupScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteGroupScheduledTask);
    }

    /**
     * 删除计划任务
     *
     * 删除计划任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupScheduledTaskRequest 请求对象
     * @return AsyncInvoker<DeleteGroupScheduledTaskRequest, DeleteGroupScheduledTaskResponse>
     */
    public AsyncInvoker<DeleteGroupScheduledTaskRequest, DeleteGroupScheduledTaskResponse> deleteGroupScheduledTaskAsyncInvoker(
        DeleteGroupScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteGroupScheduledTask, hcClient);
    }

    /**
     * 删除生命周期挂钩
     *
     * 删除一个指定生命周期挂钩。伸缩组进行伸缩活动时，不允许删除该伸缩组内的生命周期挂钩。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLifecycleHookRequest 请求对象
     * @return CompletableFuture<DeleteLifecycleHookResponse>
     */
    public CompletableFuture<DeleteLifecycleHookResponse> deleteLifecycleHookAsync(DeleteLifecycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteLifecycleHook);
    }

    /**
     * 删除生命周期挂钩
     *
     * 删除一个指定生命周期挂钩。伸缩组进行伸缩活动时，不允许删除该伸缩组内的生命周期挂钩。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLifecycleHookRequest 请求对象
     * @return AsyncInvoker<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse>
     */
    public AsyncInvoker<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> deleteLifecycleHookAsyncInvoker(
        DeleteLifecycleHookRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteLifecycleHook, hcClient);
    }

    /**
     * 删除弹性伸缩配置
     *
     * 删除一个指定弹性伸缩配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingConfigRequest 请求对象
     * @return CompletableFuture<DeleteScalingConfigResponse>
     */
    public CompletableFuture<DeleteScalingConfigResponse> deleteScalingConfigAsync(DeleteScalingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingConfig);
    }

    /**
     * 删除弹性伸缩配置
     *
     * 删除一个指定弹性伸缩配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingConfigRequest 请求对象
     * @return AsyncInvoker<DeleteScalingConfigRequest, DeleteScalingConfigResponse>
     */
    public AsyncInvoker<DeleteScalingConfigRequest, DeleteScalingConfigResponse> deleteScalingConfigAsyncInvoker(
        DeleteScalingConfigRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteScalingConfig, hcClient);
    }

    /**
     * 删除弹性伸缩组
     *
     * 删除一个指定弹性伸缩组。force_delete属性表示如果伸缩组存在ECS实例或正在进行伸缩活动，是否强制删除伸缩组并移出和释放ECS实例。默认值为no，表示不强制删除伸缩组。如果force_delete的值为no，必须满足以下两个条件，才能删除伸缩组：条件一：伸缩组没有正在进行的伸缩活动。条件二：伸缩组当前的ECS实例数量（current_instance_number）为0。如果force_delete的值为yes，伸缩组会被置于DELETING状态，拒绝接收新的伸缩活动请求，然后等待已有的伸缩活动完成，最后将伸缩组内所有ECS实例移出伸缩组（用户手动添加的ECS实例会被移出伸缩组，弹性伸缩自动创建的ECS实例会被自动删除）并删除伸缩组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingGroupRequest 请求对象
     * @return CompletableFuture<DeleteScalingGroupResponse>
     */
    public CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroupAsync(DeleteScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingGroup);
    }

    /**
     * 删除弹性伸缩组
     *
     * 删除一个指定弹性伸缩组。force_delete属性表示如果伸缩组存在ECS实例或正在进行伸缩活动，是否强制删除伸缩组并移出和释放ECS实例。默认值为no，表示不强制删除伸缩组。如果force_delete的值为no，必须满足以下两个条件，才能删除伸缩组：条件一：伸缩组没有正在进行的伸缩活动。条件二：伸缩组当前的ECS实例数量（current_instance_number）为0。如果force_delete的值为yes，伸缩组会被置于DELETING状态，拒绝接收新的伸缩活动请求，然后等待已有的伸缩活动完成，最后将伸缩组内所有ECS实例移出伸缩组（用户手动添加的ECS实例会被移出伸缩组，弹性伸缩自动创建的ECS实例会被自动删除）并删除伸缩组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingGroupRequest 请求对象
     * @return AsyncInvoker<DeleteScalingGroupRequest, DeleteScalingGroupResponse>
     */
    public AsyncInvoker<DeleteScalingGroupRequest, DeleteScalingGroupResponse> deleteScalingGroupAsyncInvoker(
        DeleteScalingGroupRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteScalingGroup, hcClient);
    }

    /**
     * 移出弹性伸缩组实例
     *
     * 从弹性伸缩组中移出一个指定实例。实例处于INSERVICE且移出后实例数不能小于伸缩组的最小实例数时才可以移出。当伸缩组没有伸缩活动时，才能移出实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingInstanceRequest 请求对象
     * @return CompletableFuture<DeleteScalingInstanceResponse>
     */
    public CompletableFuture<DeleteScalingInstanceResponse> deleteScalingInstanceAsync(
        DeleteScalingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingInstance);
    }

    /**
     * 移出弹性伸缩组实例
     *
     * 从弹性伸缩组中移出一个指定实例。实例处于INSERVICE且移出后实例数不能小于伸缩组的最小实例数时才可以移出。当伸缩组没有伸缩活动时，才能移出实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse>
     */
    public AsyncInvoker<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> deleteScalingInstanceAsyncInvoker(
        DeleteScalingInstanceRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteScalingInstance, hcClient);
    }

    /**
     * 删除伸缩组通知
     *
     * 删除指定的弹性伸缩组中指定的通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingNotificationRequest 请求对象
     * @return CompletableFuture<DeleteScalingNotificationResponse>
     */
    public CompletableFuture<DeleteScalingNotificationResponse> deleteScalingNotificationAsync(
        DeleteScalingNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingNotification);
    }

    /**
     * 删除伸缩组通知
     *
     * 删除指定的弹性伸缩组中指定的通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingNotificationRequest 请求对象
     * @return AsyncInvoker<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse>
     */
    public AsyncInvoker<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> deleteScalingNotificationAsyncInvoker(
        DeleteScalingNotificationRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteScalingNotification, hcClient);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除一个指定弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingPolicyRequest 请求对象
     * @return CompletableFuture<DeleteScalingPolicyResponse>
     */
    public CompletableFuture<DeleteScalingPolicyResponse> deleteScalingPolicyAsync(DeleteScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingPolicy);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除一个指定弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse>
     */
    public AsyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> deleteScalingPolicyAsyncInvoker(
        DeleteScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteScalingPolicy, hcClient);
    }

    /**
     * 删除标签
     *
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingTagInfoRequest 请求对象
     * @return CompletableFuture<DeleteScalingTagInfoResponse>
     */
    public CompletableFuture<DeleteScalingTagInfoResponse> deleteScalingTagInfoAsync(
        DeleteScalingTagInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.deleteScalingTagInfo);
    }

    /**
     * 删除标签
     *
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingTagInfoRequest 请求对象
     * @return AsyncInvoker<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse>
     */
    public AsyncInvoker<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> deleteScalingTagInfoAsyncInvoker(
        DeleteScalingTagInfoRequest request) {
        return new AsyncInvoker<>(request, AsMeta.deleteScalingTagInfo, hcClient);
    }

    /**
     * 执行弹性伸缩策略。
     *
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScalingPolicyRequest 请求对象
     * @return CompletableFuture<ExecuteScalingPolicyResponse>
     */
    public CompletableFuture<ExecuteScalingPolicyResponse> executeScalingPolicyAsync(
        ExecuteScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.executeScalingPolicy);
    }

    /**
     * 执行弹性伸缩策略。
     *
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScalingPolicyRequest 请求对象
     * @return AsyncInvoker<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse>
     */
    public AsyncInvoker<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> executeScalingPolicyAsyncInvoker(
        ExecuteScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.executeScalingPolicy, hcClient);
    }

    /**
     * 查询计划任务列表
     *
     * 查询计划任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupScheduledTasksRequest 请求对象
     * @return CompletableFuture<ListGroupScheduledTasksResponse>
     */
    public CompletableFuture<ListGroupScheduledTasksResponse> listGroupScheduledTasksAsync(
        ListGroupScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listGroupScheduledTasks);
    }

    /**
     * 查询计划任务列表
     *
     * 查询计划任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupScheduledTasksRequest 请求对象
     * @return AsyncInvoker<ListGroupScheduledTasksRequest, ListGroupScheduledTasksResponse>
     */
    public AsyncInvoker<ListGroupScheduledTasksRequest, ListGroupScheduledTasksResponse> listGroupScheduledTasksAsyncInvoker(
        ListGroupScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listGroupScheduledTasks, hcClient);
    }

    /**
     * 查询伸缩实例挂起信息
     *
     * 添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被挂钩挂起并置于等待状态，根据输入条件过滤查询弹性伸缩组中伸缩实例的挂起信息。可根据实例ID进行条件过滤查询。若不加过滤条件默认查询指定伸缩组内所有实例挂起信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHookInstancesRequest 请求对象
     * @return CompletableFuture<ListHookInstancesResponse>
     */
    public CompletableFuture<ListHookInstancesResponse> listHookInstancesAsync(ListHookInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listHookInstances);
    }

    /**
     * 查询伸缩实例挂起信息
     *
     * 添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被挂钩挂起并置于等待状态，根据输入条件过滤查询弹性伸缩组中伸缩实例的挂起信息。可根据实例ID进行条件过滤查询。若不加过滤条件默认查询指定伸缩组内所有实例挂起信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHookInstancesRequest 请求对象
     * @return AsyncInvoker<ListHookInstancesRequest, ListHookInstancesResponse>
     */
    public AsyncInvoker<ListHookInstancesRequest, ListHookInstancesResponse> listHookInstancesAsyncInvoker(
        ListHookInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listHookInstances, hcClient);
    }

    /**
     * 查询生命周期挂钩列表
     *
     * 根据伸缩组ID查询生命周期挂钩列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLifeCycleHooksRequest 请求对象
     * @return CompletableFuture<ListLifeCycleHooksResponse>
     */
    public CompletableFuture<ListLifeCycleHooksResponse> listLifeCycleHooksAsync(ListLifeCycleHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listLifeCycleHooks);
    }

    /**
     * 查询生命周期挂钩列表
     *
     * 根据伸缩组ID查询生命周期挂钩列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLifeCycleHooksRequest 请求对象
     * @return AsyncInvoker<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse>
     */
    public AsyncInvoker<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> listLifeCycleHooksAsyncInvoker(
        ListLifeCycleHooksRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listLifeCycleHooks, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据项目ID查询指定资源类型的资源实例。资源、资源tag默认按照创建时间倒序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse>
     */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listResourceInstances);
    }

    /**
     * 查询资源实例
     *
     * 根据项目ID查询指定资源类型的资源实例。资源、资源tag默认按照创建时间倒序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询伸缩活动日志
     *
     * 根据输入条件过滤查询伸缩活动日志。查询结果分页显示。可根据起始时间，截止时间，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingActivityLogsRequest 请求对象
     * @return CompletableFuture<ListScalingActivityLogsResponse>
     */
    public CompletableFuture<ListScalingActivityLogsResponse> listScalingActivityLogsAsync(
        ListScalingActivityLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingActivityLogs);
    }

    /**
     * 查询伸缩活动日志
     *
     * 根据输入条件过滤查询伸缩活动日志。查询结果分页显示。可根据起始时间，截止时间，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingActivityLogsRequest 请求对象
     * @return AsyncInvoker<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse>
     */
    public AsyncInvoker<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> listScalingActivityLogsAsyncInvoker(
        ListScalingActivityLogsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingActivityLogs, hcClient);
    }

    /**
     * 查询伸缩活动日志v2版本
     *
     * 根据输入条件过滤查询伸缩活动日志，支持查询实例伸缩、ELB迁移、实例备用等类型活动。查询结果分页显示。查询伸缩活动日志V2版本与V1版本区别在于，V2版本展示了更详细的实例伸缩日志，如ELB迁移日志，实例备用日志信息。可根据起始时间，截止时间，起始行号，记录数，伸缩活动类型等作为条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingActivityV2LogsRequest 请求对象
     * @return CompletableFuture<ListScalingActivityV2LogsResponse>
     */
    public CompletableFuture<ListScalingActivityV2LogsResponse> listScalingActivityV2LogsAsync(
        ListScalingActivityV2LogsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingActivityV2Logs);
    }

    /**
     * 查询伸缩活动日志v2版本
     *
     * 根据输入条件过滤查询伸缩活动日志，支持查询实例伸缩、ELB迁移、实例备用等类型活动。查询结果分页显示。查询伸缩活动日志V2版本与V1版本区别在于，V2版本展示了更详细的实例伸缩日志，如ELB迁移日志，实例备用日志信息。可根据起始时间，截止时间，起始行号，记录数，伸缩活动类型等作为条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingActivityV2LogsRequest 请求对象
     * @return AsyncInvoker<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse>
     */
    public AsyncInvoker<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> listScalingActivityV2LogsAsyncInvoker(
        ListScalingActivityV2LogsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingActivityV2Logs, hcClient);
    }

    /**
     * 查询弹性伸缩配置列表
     *
     * 根据输入条件过滤查询弹性伸缩配置。查询结果分页显示。可以根据伸缩配置名称，镜像ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingConfigsRequest 请求对象
     * @return CompletableFuture<ListScalingConfigsResponse>
     */
    public CompletableFuture<ListScalingConfigsResponse> listScalingConfigsAsync(ListScalingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingConfigs);
    }

    /**
     * 查询弹性伸缩配置列表
     *
     * 根据输入条件过滤查询弹性伸缩配置。查询结果分页显示。可以根据伸缩配置名称，镜像ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingConfigsRequest 请求对象
     * @return AsyncInvoker<ListScalingConfigsRequest, ListScalingConfigsResponse>
     */
    public AsyncInvoker<ListScalingConfigsRequest, ListScalingConfigsResponse> listScalingConfigsAsyncInvoker(
        ListScalingConfigsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingConfigs, hcClient);
    }

    /**
     * 查询弹性伸缩组列表
     *
     * 根据输入条件过滤查询弹性伸缩组列表。查询结果分页显示。可根据伸缩组名称，伸缩配置ID，伸缩组状态，企业项目ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingGroupsRequest 请求对象
     * @return CompletableFuture<ListScalingGroupsResponse>
     */
    public CompletableFuture<ListScalingGroupsResponse> listScalingGroupsAsync(ListScalingGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingGroups);
    }

    /**
     * 查询弹性伸缩组列表
     *
     * 根据输入条件过滤查询弹性伸缩组列表。查询结果分页显示。可根据伸缩组名称，伸缩配置ID，伸缩组状态，企业项目ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingGroupsRequest 请求对象
     * @return AsyncInvoker<ListScalingGroupsRequest, ListScalingGroupsResponse>
     */
    public AsyncInvoker<ListScalingGroupsRequest, ListScalingGroupsResponse> listScalingGroupsAsyncInvoker(
        ListScalingGroupsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingGroups, hcClient);
    }

    /**
     * 查询弹性伸缩组中的实例列表
     *
     * 根据输入条件过滤查询弹性伸缩组中实例信息。查询结果分页显示。可根据实例在伸缩组中的生命周期状态，实例健康状态，实例保护状态，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认查询组内最多20条实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingInstancesRequest 请求对象
     * @return CompletableFuture<ListScalingInstancesResponse>
     */
    public CompletableFuture<ListScalingInstancesResponse> listScalingInstancesAsync(
        ListScalingInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingInstances);
    }

    /**
     * 查询弹性伸缩组中的实例列表
     *
     * 根据输入条件过滤查询弹性伸缩组中实例信息。查询结果分页显示。可根据实例在伸缩组中的生命周期状态，实例健康状态，实例保护状态，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认查询组内最多20条实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingInstancesRequest 请求对象
     * @return AsyncInvoker<ListScalingInstancesRequest, ListScalingInstancesResponse>
     */
    public AsyncInvoker<ListScalingInstancesRequest, ListScalingInstancesResponse> listScalingInstancesAsyncInvoker(
        ListScalingInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingInstances, hcClient);
    }

    /**
     * 查询伸缩组通知列表
     *
     * 根据伸缩组ID查询指定弹性伸缩组的通知列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingNotificationsRequest 请求对象
     * @return CompletableFuture<ListScalingNotificationsResponse>
     */
    public CompletableFuture<ListScalingNotificationsResponse> listScalingNotificationsAsync(
        ListScalingNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingNotifications);
    }

    /**
     * 查询伸缩组通知列表
     *
     * 根据伸缩组ID查询指定弹性伸缩组的通知列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingNotificationsRequest 请求对象
     * @return AsyncInvoker<ListScalingNotificationsRequest, ListScalingNotificationsResponse>
     */
    public AsyncInvoker<ListScalingNotificationsRequest, ListScalingNotificationsResponse> listScalingNotificationsAsyncInvoker(
        ListScalingNotificationsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingNotifications, hcClient);
    }

    /**
     * 查询弹性伸缩策略列表
     *
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询租户下指定伸缩组内最多20条伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingPoliciesRequest 请求对象
     * @return CompletableFuture<ListScalingPoliciesResponse>
     */
    public CompletableFuture<ListScalingPoliciesResponse> listScalingPoliciesAsync(ListScalingPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingPolicies);
    }

    /**
     * 查询弹性伸缩策略列表
     *
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询租户下指定伸缩组内最多20条伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingPoliciesRequest 请求对象
     * @return AsyncInvoker<ListScalingPoliciesRequest, ListScalingPoliciesResponse>
     */
    public AsyncInvoker<ListScalingPoliciesRequest, ListScalingPoliciesResponse> listScalingPoliciesAsyncInvoker(
        ListScalingPoliciesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingPolicies, hcClient);
    }

    /**
     * 查询策略执行日志
     *
     * 根据输入条件过滤查询策略执行的历史记录。查询结果分页显示。可根据日志ID，伸缩资源类型，伸缩资源ID，策略执行类型，查询额起始，查询截止时间，查询起始行号，查询记录数进行条件过滤查询。若不加过滤条件默认查询最多20条策略执行日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingPolicyExecuteLogsRequest 请求对象
     * @return CompletableFuture<ListScalingPolicyExecuteLogsResponse>
     */
    public CompletableFuture<ListScalingPolicyExecuteLogsResponse> listScalingPolicyExecuteLogsAsync(
        ListScalingPolicyExecuteLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingPolicyExecuteLogs);
    }

    /**
     * 查询策略执行日志
     *
     * 根据输入条件过滤查询策略执行的历史记录。查询结果分页显示。可根据日志ID，伸缩资源类型，伸缩资源ID，策略执行类型，查询额起始，查询截止时间，查询起始行号，查询记录数进行条件过滤查询。若不加过滤条件默认查询最多20条策略执行日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingPolicyExecuteLogsRequest 请求对象
     * @return AsyncInvoker<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse>
     */
    public AsyncInvoker<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> listScalingPolicyExecuteLogsAsyncInvoker(
        ListScalingPolicyExecuteLogsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingPolicyExecuteLogs, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 根据项目ID和资源ID查询指定资源类型的资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingTagInfosByResourceIdRequest 请求对象
     * @return CompletableFuture<ListScalingTagInfosByResourceIdResponse>
     */
    public CompletableFuture<ListScalingTagInfosByResourceIdResponse> listScalingTagInfosByResourceIdAsync(
        ListScalingTagInfosByResourceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingTagInfosByResourceId);
    }

    /**
     * 查询资源标签
     *
     * 根据项目ID和资源ID查询指定资源类型的资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingTagInfosByResourceIdRequest 请求对象
     * @return AsyncInvoker<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse>
     */
    public AsyncInvoker<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> listScalingTagInfosByResourceIdAsyncInvoker(
        ListScalingTagInfosByResourceIdRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingTagInfosByResourceId, hcClient);
    }

    /**
     * 查询标签
     *
     * 根据项目ID查询指定资源类型的标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingTagInfosByTenantIdRequest 请求对象
     * @return CompletableFuture<ListScalingTagInfosByTenantIdResponse>
     */
    public CompletableFuture<ListScalingTagInfosByTenantIdResponse> listScalingTagInfosByTenantIdAsync(
        ListScalingTagInfosByTenantIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingTagInfosByTenantId);
    }

    /**
     * 查询标签
     *
     * 根据项目ID查询指定资源类型的标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingTagInfosByTenantIdRequest 请求对象
     * @return AsyncInvoker<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse>
     */
    public AsyncInvoker<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> listScalingTagInfosByTenantIdAsyncInvoker(
        ListScalingTagInfosByTenantIdRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingTagInfosByTenantId, hcClient);
    }

    /**
     * 查询暖池内实例信息
     *
     * 查询暖池内实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarmPoolInstancesRequest 请求对象
     * @return CompletableFuture<ListWarmPoolInstancesResponse>
     */
    public CompletableFuture<ListWarmPoolInstancesResponse> listWarmPoolInstancesAsync(
        ListWarmPoolInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listWarmPoolInstances);
    }

    /**
     * 查询暖池内实例信息
     *
     * 查询暖池内实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarmPoolInstancesRequest 请求对象
     * @return AsyncInvoker<ListWarmPoolInstancesRequest, ListWarmPoolInstancesResponse>
     */
    public AsyncInvoker<ListWarmPoolInstancesRequest, ListWarmPoolInstancesResponse> listWarmPoolInstancesAsyncInvoker(
        ListWarmPoolInstancesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listWarmPoolInstances, hcClient);
    }

    /**
     * 停止弹性伸缩组
     *
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseScalingGroupRequest 请求对象
     * @return CompletableFuture<PauseScalingGroupResponse>
     */
    public CompletableFuture<PauseScalingGroupResponse> pauseScalingGroupAsync(PauseScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.pauseScalingGroup);
    }

    /**
     * 停止弹性伸缩组
     *
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseScalingGroupRequest 请求对象
     * @return AsyncInvoker<PauseScalingGroupRequest, PauseScalingGroupResponse>
     */
    public AsyncInvoker<PauseScalingGroupRequest, PauseScalingGroupResponse> pauseScalingGroupAsyncInvoker(
        PauseScalingGroupRequest request) {
        return new AsyncInvoker<>(request, AsMeta.pauseScalingGroup, hcClient);
    }

    /**
     * 停止弹性伸缩策略。
     *
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseScalingPolicyRequest 请求对象
     * @return CompletableFuture<PauseScalingPolicyResponse>
     */
    public CompletableFuture<PauseScalingPolicyResponse> pauseScalingPolicyAsync(PauseScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.pauseScalingPolicy);
    }

    /**
     * 停止弹性伸缩策略。
     *
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseScalingPolicyRequest 请求对象
     * @return AsyncInvoker<PauseScalingPolicyRequest, PauseScalingPolicyResponse>
     */
    public AsyncInvoker<PauseScalingPolicyRequest, PauseScalingPolicyResponse> pauseScalingPolicyAsyncInvoker(
        PauseScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.pauseScalingPolicy, hcClient);
    }

    /**
     * 开启暖池
     *
     * 开启并修改暖池参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutWarmPoolRequest 请求对象
     * @return CompletableFuture<PutWarmPoolResponse>
     */
    public CompletableFuture<PutWarmPoolResponse> putWarmPoolAsync(PutWarmPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.putWarmPool);
    }

    /**
     * 开启暖池
     *
     * 开启并修改暖池参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutWarmPoolRequest 请求对象
     * @return AsyncInvoker<PutWarmPoolRequest, PutWarmPoolResponse>
     */
    public AsyncInvoker<PutWarmPoolRequest, PutWarmPoolResponse> putWarmPoolAsyncInvoker(PutWarmPoolRequest request) {
        return new AsyncInvoker<>(request, AsMeta.putWarmPool, hcClient);
    }

    /**
     * 启用弹性伸缩组
     *
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeScalingGroupRequest 请求对象
     * @return CompletableFuture<ResumeScalingGroupResponse>
     */
    public CompletableFuture<ResumeScalingGroupResponse> resumeScalingGroupAsync(ResumeScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.resumeScalingGroup);
    }

    /**
     * 启用弹性伸缩组
     *
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeScalingGroupRequest 请求对象
     * @return AsyncInvoker<ResumeScalingGroupRequest, ResumeScalingGroupResponse>
     */
    public AsyncInvoker<ResumeScalingGroupRequest, ResumeScalingGroupResponse> resumeScalingGroupAsyncInvoker(
        ResumeScalingGroupRequest request) {
        return new AsyncInvoker<>(request, AsMeta.resumeScalingGroup, hcClient);
    }

    /**
     * 启用弹性伸缩策略。
     *
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeScalingPolicyRequest 请求对象
     * @return CompletableFuture<ResumeScalingPolicyResponse>
     */
    public CompletableFuture<ResumeScalingPolicyResponse> resumeScalingPolicyAsync(ResumeScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.resumeScalingPolicy);
    }

    /**
     * 启用弹性伸缩策略。
     *
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeScalingPolicyRequest 请求对象
     * @return AsyncInvoker<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse>
     */
    public AsyncInvoker<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> resumeScalingPolicyAsyncInvoker(
        ResumeScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.resumeScalingPolicy, hcClient);
    }

    /**
     * 查询生命周期挂钩详情
     *
     * 根据伸缩组ID及生命周期挂钩名称查询指定的生命周期挂钩详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLifeCycleHookRequest 请求对象
     * @return CompletableFuture<ShowLifeCycleHookResponse>
     */
    public CompletableFuture<ShowLifeCycleHookResponse> showLifeCycleHookAsync(ShowLifeCycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showLifeCycleHook);
    }

    /**
     * 查询生命周期挂钩详情
     *
     * 根据伸缩组ID及生命周期挂钩名称查询指定的生命周期挂钩详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLifeCycleHookRequest 请求对象
     * @return AsyncInvoker<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse>
     */
    public AsyncInvoker<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> showLifeCycleHookAsyncInvoker(
        ShowLifeCycleHookRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showLifeCycleHook, hcClient);
    }

    /**
     * 查询弹性伸缩策略和伸缩实例配额
     *
     * 根据伸缩组ID查询指定弹性伸缩组下的伸缩策略和伸缩实例的配额总数及已使用配额数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyAndInstanceQuotaRequest 请求对象
     * @return CompletableFuture<ShowPolicyAndInstanceQuotaResponse>
     */
    public CompletableFuture<ShowPolicyAndInstanceQuotaResponse> showPolicyAndInstanceQuotaAsync(
        ShowPolicyAndInstanceQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showPolicyAndInstanceQuota);
    }

    /**
     * 查询弹性伸缩策略和伸缩实例配额
     *
     * 根据伸缩组ID查询指定弹性伸缩组下的伸缩策略和伸缩实例的配额总数及已使用配额数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyAndInstanceQuotaRequest 请求对象
     * @return AsyncInvoker<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse>
     */
    public AsyncInvoker<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> showPolicyAndInstanceQuotaAsyncInvoker(
        ShowPolicyAndInstanceQuotaRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showPolicyAndInstanceQuota, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询指定租户下的弹性伸缩组、伸缩配置、伸缩带宽策略、伸缩策略和伸缩实例的配额总数及已使用配额数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceQuotaRequest 请求对象
     * @return CompletableFuture<ShowResourceQuotaResponse>
     */
    public CompletableFuture<ShowResourceQuotaResponse> showResourceQuotaAsync(ShowResourceQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showResourceQuota);
    }

    /**
     * 查询配额
     *
     * 查询指定租户下的弹性伸缩组、伸缩配置、伸缩带宽策略、伸缩策略和伸缩实例的配额总数及已使用配额数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceQuotaRequest 请求对象
     * @return AsyncInvoker<ShowResourceQuotaRequest, ShowResourceQuotaResponse>
     */
    public AsyncInvoker<ShowResourceQuotaRequest, ShowResourceQuotaResponse> showResourceQuotaAsyncInvoker(
        ShowResourceQuotaRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showResourceQuota, hcClient);
    }

    /**
     * 查询弹性伸缩配置详情
     *
     * 根据伸缩配置ID查询一个弹性伸缩配置的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingConfigRequest 请求对象
     * @return CompletableFuture<ShowScalingConfigResponse>
     */
    public CompletableFuture<ShowScalingConfigResponse> showScalingConfigAsync(ShowScalingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showScalingConfig);
    }

    /**
     * 查询弹性伸缩配置详情
     *
     * 根据伸缩配置ID查询一个弹性伸缩配置的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingConfigRequest 请求对象
     * @return AsyncInvoker<ShowScalingConfigRequest, ShowScalingConfigResponse>
     */
    public AsyncInvoker<ShowScalingConfigRequest, ShowScalingConfigResponse> showScalingConfigAsyncInvoker(
        ShowScalingConfigRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showScalingConfig, hcClient);
    }

    /**
     * 查询弹性伸缩组详情
     *
     * 查询一个指定弹性伸缩组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingGroupRequest 请求对象
     * @return CompletableFuture<ShowScalingGroupResponse>
     */
    public CompletableFuture<ShowScalingGroupResponse> showScalingGroupAsync(ShowScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showScalingGroup);
    }

    /**
     * 查询弹性伸缩组详情
     *
     * 查询一个指定弹性伸缩组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingGroupRequest 请求对象
     * @return AsyncInvoker<ShowScalingGroupRequest, ShowScalingGroupResponse>
     */
    public AsyncInvoker<ShowScalingGroupRequest, ShowScalingGroupResponse> showScalingGroupAsyncInvoker(
        ShowScalingGroupRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showScalingGroup, hcClient);
    }

    /**
     * 查询弹性伸缩策略详情
     *
     * 查询指定弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingPolicyRequest 请求对象
     * @return CompletableFuture<ShowScalingPolicyResponse>
     */
    public CompletableFuture<ShowScalingPolicyResponse> showScalingPolicyAsync(ShowScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showScalingPolicy);
    }

    /**
     * 查询弹性伸缩策略详情
     *
     * 查询指定弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingPolicyRequest 请求对象
     * @return AsyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse>
     */
    public AsyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse> showScalingPolicyAsyncInvoker(
        ShowScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showScalingPolicy, hcClient);
    }

    /**
     * 查询暖池信息
     *
     * 查询暖池信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWarmPoolRequest 请求对象
     * @return CompletableFuture<ShowWarmPoolResponse>
     */
    public CompletableFuture<ShowWarmPoolResponse> showWarmPoolAsync(ShowWarmPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showWarmPool);
    }

    /**
     * 查询暖池信息
     *
     * 查询暖池信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWarmPoolRequest 请求对象
     * @return AsyncInvoker<ShowWarmPoolRequest, ShowWarmPoolResponse>
     */
    public AsyncInvoker<ShowWarmPoolRequest, ShowWarmPoolResponse> showWarmPoolAsyncInvoker(
        ShowWarmPoolRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showWarmPool, hcClient);
    }

    /**
     * 更新计划任务
     *
     * 更新计划任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupScheduledTaskRequest 请求对象
     * @return CompletableFuture<UpdateGroupScheduledTaskResponse>
     */
    public CompletableFuture<UpdateGroupScheduledTaskResponse> updateGroupScheduledTaskAsync(
        UpdateGroupScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateGroupScheduledTask);
    }

    /**
     * 更新计划任务
     *
     * 更新计划任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupScheduledTaskRequest 请求对象
     * @return AsyncInvoker<UpdateGroupScheduledTaskRequest, UpdateGroupScheduledTaskResponse>
     */
    public AsyncInvoker<UpdateGroupScheduledTaskRequest, UpdateGroupScheduledTaskResponse> updateGroupScheduledTaskAsyncInvoker(
        UpdateGroupScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, AsMeta.updateGroupScheduledTask, hcClient);
    }

    /**
     * 修改生命周期挂钩
     *
     * 修改一个指定生命周期挂钩中的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLifeCycleHookRequest 请求对象
     * @return CompletableFuture<UpdateLifeCycleHookResponse>
     */
    public CompletableFuture<UpdateLifeCycleHookResponse> updateLifeCycleHookAsync(UpdateLifeCycleHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateLifeCycleHook);
    }

    /**
     * 修改生命周期挂钩
     *
     * 修改一个指定生命周期挂钩中的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLifeCycleHookRequest 请求对象
     * @return AsyncInvoker<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse>
     */
    public AsyncInvoker<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> updateLifeCycleHookAsyncInvoker(
        UpdateLifeCycleHookRequest request) {
        return new AsyncInvoker<>(request, AsMeta.updateLifeCycleHook, hcClient);
    }

    /**
     * 修改伸缩配置
     *
     * 修改伸缩配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingConfigRequest 请求对象
     * @return CompletableFuture<UpdateScalingConfigResponse>
     */
    public CompletableFuture<UpdateScalingConfigResponse> updateScalingConfigAsync(UpdateScalingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateScalingConfig);
    }

    /**
     * 修改伸缩配置
     *
     * 修改伸缩配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingConfigRequest 请求对象
     * @return AsyncInvoker<UpdateScalingConfigRequest, UpdateScalingConfigResponse>
     */
    public AsyncInvoker<UpdateScalingConfigRequest, UpdateScalingConfigResponse> updateScalingConfigAsyncInvoker(
        UpdateScalingConfigRequest request) {
        return new AsyncInvoker<>(request, AsMeta.updateScalingConfig, hcClient);
    }

    /**
     * 修改弹性伸缩组
     *
     * 修改一个指定弹性伸缩组中的信息。更换伸缩组的伸缩配置，伸缩组中已经存在的使用之前伸缩配置创建的云服务器云主机不受影响。伸缩组为没有正在进行的伸缩活动时，可以修改伸缩组的子网、可用区和负载均衡配置。当伸缩组的期望实例数改变时，会触发伸缩活动加入或移出实例。期望实例数必须大于或等于最小实例数，必须小于或等于最大实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingGroupRequest 请求对象
     * @return CompletableFuture<UpdateScalingGroupResponse>
     */
    public CompletableFuture<UpdateScalingGroupResponse> updateScalingGroupAsync(UpdateScalingGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateScalingGroup);
    }

    /**
     * 修改弹性伸缩组
     *
     * 修改一个指定弹性伸缩组中的信息。更换伸缩组的伸缩配置，伸缩组中已经存在的使用之前伸缩配置创建的云服务器云主机不受影响。伸缩组为没有正在进行的伸缩活动时，可以修改伸缩组的子网、可用区和负载均衡配置。当伸缩组的期望实例数改变时，会触发伸缩活动加入或移出实例。期望实例数必须大于或等于最小实例数，必须小于或等于最大实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingGroupRequest 请求对象
     * @return AsyncInvoker<UpdateScalingGroupRequest, UpdateScalingGroupResponse>
     */
    public AsyncInvoker<UpdateScalingGroupRequest, UpdateScalingGroupResponse> updateScalingGroupAsyncInvoker(
        UpdateScalingGroupRequest request) {
        return new AsyncInvoker<>(request, AsMeta.updateScalingGroup, hcClient);
    }

    /**
     * 修改弹性伸缩策略
     *
     * 修改指定弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingPolicyRequest 请求对象
     * @return CompletableFuture<UpdateScalingPolicyResponse>
     */
    public CompletableFuture<UpdateScalingPolicyResponse> updateScalingPolicyAsync(UpdateScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateScalingPolicy);
    }

    /**
     * 修改弹性伸缩策略
     *
     * 修改指定弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse>
     */
    public AsyncInvoker<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> updateScalingPolicyAsyncInvoker(
        UpdateScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.updateScalingPolicy, hcClient);
    }

    /**
     * 查询弹性伸缩API所有版本信息
     *
     * 查询弹性伸缩API所有版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listApiVersions);
    }

    /**
     * 查询弹性伸缩API所有版本信息
     *
     * 查询弹性伸缩API所有版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询弹性伸缩API指定版本信息
     *
     * 根据租户id和资源id查询指定资源类型的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showApiVersion);
    }

    /**
     * 查询弹性伸缩API指定版本信息
     *
     * 根据租户id和资源id查询指定资源类型的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showApiVersion, hcClient);
    }

    /**
     * 创建弹性伸缩策略（V2版本）
     *
     * 可针对不同类型资源如伸缩组或带宽，创建弹性伸缩策略。创建弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持创建对带宽资源进行调整的策略，通过伸缩资源类型区分伸缩资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingV2PolicyRequest 请求对象
     * @return CompletableFuture<CreateScalingV2PolicyResponse>
     */
    public CompletableFuture<CreateScalingV2PolicyResponse> createScalingV2PolicyAsync(
        CreateScalingV2PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.createScalingV2Policy);
    }

    /**
     * 创建弹性伸缩策略（V2版本）
     *
     * 可针对不同类型资源如伸缩组或带宽，创建弹性伸缩策略。创建弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持创建对带宽资源进行调整的策略，通过伸缩资源类型区分伸缩资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScalingV2PolicyRequest 请求对象
     * @return AsyncInvoker<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse>
     */
    public AsyncInvoker<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> createScalingV2PolicyAsyncInvoker(
        CreateScalingV2PolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.createScalingV2Policy, hcClient);
    }

    /**
     * 查询弹性伸缩策略全量列表（V2版本）
     *
     * 根据输入条件过滤查询弹性伸缩策略，支持查询当前租户下全量伸缩策略。查询结果分页显示。可根据伸缩资源ID，伸缩资源类型，伸缩策略名称，伸缩策略ID，告警ID，企业项目ID，起始行号，记录数，排序方式等条件进行过滤查询。若不加过滤添加默认查询该租户下最多20条伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllScalingV2PoliciesRequest 请求对象
     * @return CompletableFuture<ListAllScalingV2PoliciesResponse>
     */
    public CompletableFuture<ListAllScalingV2PoliciesResponse> listAllScalingV2PoliciesAsync(
        ListAllScalingV2PoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listAllScalingV2Policies);
    }

    /**
     * 查询弹性伸缩策略全量列表（V2版本）
     *
     * 根据输入条件过滤查询弹性伸缩策略，支持查询当前租户下全量伸缩策略。查询结果分页显示。可根据伸缩资源ID，伸缩资源类型，伸缩策略名称，伸缩策略ID，告警ID，企业项目ID，起始行号，记录数，排序方式等条件进行过滤查询。若不加过滤添加默认查询该租户下最多20条伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllScalingV2PoliciesRequest 请求对象
     * @return AsyncInvoker<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse>
     */
    public AsyncInvoker<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> listAllScalingV2PoliciesAsyncInvoker(
        ListAllScalingV2PoliciesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listAllScalingV2Policies, hcClient);
    }

    /**
     * 查询弹性伸缩策略列表（V2版本）
     *
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。查询弹性伸缩策略V2版本与V1版本的区别在于，V2版本响应含伸缩资源类型。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询该租户下指定资源下最多20条伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingV2PoliciesRequest 请求对象
     * @return CompletableFuture<ListScalingV2PoliciesResponse>
     */
    public CompletableFuture<ListScalingV2PoliciesResponse> listScalingV2PoliciesAsync(
        ListScalingV2PoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.listScalingV2Policies);
    }

    /**
     * 查询弹性伸缩策略列表（V2版本）
     *
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。查询弹性伸缩策略V2版本与V1版本的区别在于，V2版本响应含伸缩资源类型。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询该租户下指定资源下最多20条伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScalingV2PoliciesRequest 请求对象
     * @return AsyncInvoker<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse>
     */
    public AsyncInvoker<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> listScalingV2PoliciesAsyncInvoker(
        ListScalingV2PoliciesRequest request) {
        return new AsyncInvoker<>(request, AsMeta.listScalingV2Policies, hcClient);
    }

    /**
     * 查询指定弹性伸缩策略详情（V2版本）
     *
     * 查询指定弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingV2PolicyRequest 请求对象
     * @return CompletableFuture<ShowScalingV2PolicyResponse>
     */
    public CompletableFuture<ShowScalingV2PolicyResponse> showScalingV2PolicyAsync(ShowScalingV2PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.showScalingV2Policy);
    }

    /**
     * 查询指定弹性伸缩策略详情（V2版本）
     *
     * 查询指定弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingV2PolicyRequest 请求对象
     * @return AsyncInvoker<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse>
     */
    public AsyncInvoker<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> showScalingV2PolicyAsyncInvoker(
        ShowScalingV2PolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.showScalingV2Policy, hcClient);
    }

    /**
     * 修改弹性伸缩策略（V2版本）
     *
     * 修改指定弹性伸缩策略。修改弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持修改伸缩资源类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingV2PolicyRequest 请求对象
     * @return CompletableFuture<UpdateScalingV2PolicyResponse>
     */
    public CompletableFuture<UpdateScalingV2PolicyResponse> updateScalingV2PolicyAsync(
        UpdateScalingV2PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AsMeta.updateScalingV2Policy);
    }

    /**
     * 修改弹性伸缩策略（V2版本）
     *
     * 修改指定弹性伸缩策略。修改弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持修改伸缩资源类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScalingV2PolicyRequest 请求对象
     * @return AsyncInvoker<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse>
     */
    public AsyncInvoker<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> updateScalingV2PolicyAsyncInvoker(
        UpdateScalingV2PolicyRequest request) {
        return new AsyncInvoker<>(request, AsMeta.updateScalingV2Policy, hcClient);
    }

}

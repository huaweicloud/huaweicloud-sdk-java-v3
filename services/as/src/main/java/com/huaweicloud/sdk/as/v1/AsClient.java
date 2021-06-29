package com.huaweicloud.sdk.as.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.as.v1.model.*;

public class AsClient {
    protected HcClient hcClient;

    public AsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AsClient> newBuilder() {
        return new ClientBuilder<>(AsClient::new);
    }


    /**
     * 伸缩实例生命周期回调
     * 通过生命周期操作令牌或者通过实例ID和生命周期挂钩名称对伸缩实例指定的挂钩进行回调操作。如果在超时时间结束前已完成自定义操作，选择终止或继续完成生命周期操作。如果需要更多时间完成自定义操作，选择延长超时时间，实例保持等待状态的时间将增加1小时。只有实例的生命周期挂钩状态为 HANGING 时才可以进行回调操作。
     *
     * @param AttachCallbackInstanceLifeCycleHookRequest 请求对象
     * @return AttachCallbackInstanceLifeCycleHookResponse
     */
    public AttachCallbackInstanceLifeCycleHookResponse attachCallbackInstanceLifeCycleHook(AttachCallbackInstanceLifeCycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.attachCallbackInstanceLifeCycleHook);
    }

    /**
     * 伸缩实例生命周期回调
     * 通过生命周期操作令牌或者通过实例ID和生命周期挂钩名称对伸缩实例指定的挂钩进行回调操作。如果在超时时间结束前已完成自定义操作，选择终止或继续完成生命周期操作。如果需要更多时间完成自定义操作，选择延长超时时间，实例保持等待状态的时间将增加1小时。只有实例的生命周期挂钩状态为 HANGING 时才可以进行回调操作。
     *
     * @param AttachCallbackInstanceLifeCycleHookRequest 请求对象
     * @return SyncInvoker<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse>
     */
    public SyncInvoker<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse> attachCallbackInstanceLifeCycleHookInvoker(AttachCallbackInstanceLifeCycleHookRequest request) {
        return new SyncInvoker<AttachCallbackInstanceLifeCycleHookRequest, AttachCallbackInstanceLifeCycleHookResponse>(request, AsMeta.attachCallbackInstanceLifeCycleHook, hcClient);
    }

    /**
     * 批量添加实例
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchAddScalingInstancesRequest 请求对象
     * @return BatchAddScalingInstancesResponse
     */
    public BatchAddScalingInstancesResponse batchAddScalingInstances(BatchAddScalingInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchAddScalingInstances);
    }

    /**
     * 批量添加实例
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchAddScalingInstancesRequest 请求对象
     * @return SyncInvoker<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse>
     */
    public SyncInvoker<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse> batchAddScalingInstancesInvoker(BatchAddScalingInstancesRequest request) {
        return new SyncInvoker<BatchAddScalingInstancesRequest, BatchAddScalingInstancesResponse>(request, AsMeta.batchAddScalingInstances, hcClient);
    }

    /**
     * 批量删除弹性伸缩配置
     * 批量删除指定弹性伸缩配置。被伸缩组使用的伸缩配置不能被删除。单次最多删除伸缩配置个数为50。
     *
     * @param BatchDeleteScalingConfigsRequest 请求对象
     * @return BatchDeleteScalingConfigsResponse
     */
    public BatchDeleteScalingConfigsResponse batchDeleteScalingConfigs(BatchDeleteScalingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchDeleteScalingConfigs);
    }

    /**
     * 批量删除弹性伸缩配置
     * 批量删除指定弹性伸缩配置。被伸缩组使用的伸缩配置不能被删除。单次最多删除伸缩配置个数为50。
     *
     * @param BatchDeleteScalingConfigsRequest 请求对象
     * @return SyncInvoker<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse>
     */
    public SyncInvoker<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse> batchDeleteScalingConfigsInvoker(BatchDeleteScalingConfigsRequest request) {
        return new SyncInvoker<BatchDeleteScalingConfigsRequest, BatchDeleteScalingConfigsResponse>(request, AsMeta.batchDeleteScalingConfigs, hcClient);
    }

    /**
     * 批量删除弹性伸缩策略。
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     *
     * @param BatchDeleteScalingPoliciesRequest 请求对象
     * @return BatchDeleteScalingPoliciesResponse
     */
    public BatchDeleteScalingPoliciesResponse batchDeleteScalingPolicies(BatchDeleteScalingPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchDeleteScalingPolicies);
    }

    /**
     * 批量删除弹性伸缩策略。
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     *
     * @param BatchDeleteScalingPoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse>
     */
    public SyncInvoker<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse> batchDeleteScalingPoliciesInvoker(BatchDeleteScalingPoliciesRequest request) {
        return new SyncInvoker<BatchDeleteScalingPoliciesRequest, BatchDeleteScalingPoliciesResponse>(request, AsMeta.batchDeleteScalingPolicies, hcClient);
    }

    /**
     * 批量停用弹性伸缩策略。
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     *
     * @param BatchPauseScalingPoliciesRequest 请求对象
     * @return BatchPauseScalingPoliciesResponse
     */
    public BatchPauseScalingPoliciesResponse batchPauseScalingPolicies(BatchPauseScalingPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchPauseScalingPolicies);
    }

    /**
     * 批量停用弹性伸缩策略。
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     *
     * @param BatchPauseScalingPoliciesRequest 请求对象
     * @return SyncInvoker<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse>
     */
    public SyncInvoker<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse> batchPauseScalingPoliciesInvoker(BatchPauseScalingPoliciesRequest request) {
        return new SyncInvoker<BatchPauseScalingPoliciesRequest, BatchPauseScalingPoliciesResponse>(request, AsMeta.batchPauseScalingPolicies, hcClient);
    }

    /**
     * 批量设置实例保护
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchProtectScalingInstancesRequest 请求对象
     * @return BatchProtectScalingInstancesResponse
     */
    public BatchProtectScalingInstancesResponse batchProtectScalingInstances(BatchProtectScalingInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchProtectScalingInstances);
    }

    /**
     * 批量设置实例保护
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchProtectScalingInstancesRequest 请求对象
     * @return SyncInvoker<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse>
     */
    public SyncInvoker<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse> batchProtectScalingInstancesInvoker(BatchProtectScalingInstancesRequest request) {
        return new SyncInvoker<BatchProtectScalingInstancesRequest, BatchProtectScalingInstancesResponse>(request, AsMeta.batchProtectScalingInstances, hcClient);
    }

    /**
     * 批量移除实例
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchRemoveScalingInstancesRequest 请求对象
     * @return BatchRemoveScalingInstancesResponse
     */
    public BatchRemoveScalingInstancesResponse batchRemoveScalingInstances(BatchRemoveScalingInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchRemoveScalingInstances);
    }

    /**
     * 批量移除实例
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchRemoveScalingInstancesRequest 请求对象
     * @return SyncInvoker<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse>
     */
    public SyncInvoker<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse> batchRemoveScalingInstancesInvoker(BatchRemoveScalingInstancesRequest request) {
        return new SyncInvoker<BatchRemoveScalingInstancesRequest, BatchRemoveScalingInstancesResponse>(request, AsMeta.batchRemoveScalingInstances, hcClient);
    }

    /**
     * 批量启用弹性伸缩策略。
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     *
     * @param BatchResumeScalingPoliciesRequest 请求对象
     * @return BatchResumeScalingPoliciesResponse
     */
    public BatchResumeScalingPoliciesResponse batchResumeScalingPolicies(BatchResumeScalingPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchResumeScalingPolicies);
    }

    /**
     * 批量启用弹性伸缩策略。
     * 批量启用、停用或者删除弹性伸缩策略。单次最多批量操作伸缩策略个数为20。
     *
     * @param BatchResumeScalingPoliciesRequest 请求对象
     * @return SyncInvoker<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse>
     */
    public SyncInvoker<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse> batchResumeScalingPoliciesInvoker(BatchResumeScalingPoliciesRequest request) {
        return new SyncInvoker<BatchResumeScalingPoliciesRequest, BatchResumeScalingPoliciesResponse>(request, AsMeta.batchResumeScalingPolicies, hcClient);
    }

    /**
     * 批量将实例转为备用状态
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchSetScalingInstancesStandbyRequest 请求对象
     * @return BatchSetScalingInstancesStandbyResponse
     */
    public BatchSetScalingInstancesStandbyResponse batchSetScalingInstancesStandby(BatchSetScalingInstancesStandbyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchSetScalingInstancesStandby);
    }

    /**
     * 批量将实例转为备用状态
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchSetScalingInstancesStandbyRequest 请求对象
     * @return SyncInvoker<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse>
     */
    public SyncInvoker<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse> batchSetScalingInstancesStandbyInvoker(BatchSetScalingInstancesStandbyRequest request) {
        return new SyncInvoker<BatchSetScalingInstancesStandbyRequest, BatchSetScalingInstancesStandbyResponse>(request, AsMeta.batchSetScalingInstancesStandby, hcClient);
    }

    /**
     * 批量取消实例保护
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchUnprotectScalingInstancesRequest 请求对象
     * @return BatchUnprotectScalingInstancesResponse
     */
    public BatchUnprotectScalingInstancesResponse batchUnprotectScalingInstances(BatchUnprotectScalingInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchUnprotectScalingInstances);
    }

    /**
     * 批量取消实例保护
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchUnprotectScalingInstancesRequest 请求对象
     * @return SyncInvoker<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse>
     */
    public SyncInvoker<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse> batchUnprotectScalingInstancesInvoker(BatchUnprotectScalingInstancesRequest request) {
        return new SyncInvoker<BatchUnprotectScalingInstancesRequest, BatchUnprotectScalingInstancesResponse>(request, AsMeta.batchUnprotectScalingInstances, hcClient);
    }

    /**
     * 批量将实例移出备用状态
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchUnsetScalingInstancesStantbyRequest 请求对象
     * @return BatchUnsetScalingInstancesStantbyResponse
     */
    public BatchUnsetScalingInstancesStantbyResponse batchUnsetScalingInstancesStantby(BatchUnsetScalingInstancesStantbyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.batchUnsetScalingInstancesStantby);
    }

    /**
     * 批量将实例移出备用状态
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param BatchUnsetScalingInstancesStantbyRequest 请求对象
     * @return SyncInvoker<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse>
     */
    public SyncInvoker<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse> batchUnsetScalingInstancesStantbyInvoker(BatchUnsetScalingInstancesStantbyRequest request) {
        return new SyncInvoker<BatchUnsetScalingInstancesStantbyRequest, BatchUnsetScalingInstancesStantbyResponse>(request, AsMeta.batchUnsetScalingInstancesStantby, hcClient);
    }

    /**
     * 创建生命周期挂钩
     * 创建生命周期挂钩，可为伸缩组添加一个或多个生命周期挂钩，最多添加5个。添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被生命周期挂钩挂起并置于等待状态（正在加入伸缩组或正在移出伸缩组），实例将保持此状态直至超时时间结束或者用户手动回调。用户能够在实例保持等待状态的时间段内执行自定义操作，例如，用户可以在新启动的实例上安装或配置软件，也可以在实例终止前从实例中下载日志文件。
     *
     * @param CreateLifyCycleHookRequest 请求对象
     * @return CreateLifyCycleHookResponse
     */
    public CreateLifyCycleHookResponse createLifyCycleHook(CreateLifyCycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createLifyCycleHook);
    }

    /**
     * 创建生命周期挂钩
     * 创建生命周期挂钩，可为伸缩组添加一个或多个生命周期挂钩，最多添加5个。添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被生命周期挂钩挂起并置于等待状态（正在加入伸缩组或正在移出伸缩组），实例将保持此状态直至超时时间结束或者用户手动回调。用户能够在实例保持等待状态的时间段内执行自定义操作，例如，用户可以在新启动的实例上安装或配置软件，也可以在实例终止前从实例中下载日志文件。
     *
     * @param CreateLifyCycleHookRequest 请求对象
     * @return SyncInvoker<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse>
     */
    public SyncInvoker<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse> createLifyCycleHookInvoker(CreateLifyCycleHookRequest request) {
        return new SyncInvoker<CreateLifyCycleHookRequest, CreateLifyCycleHookResponse>(request, AsMeta.createLifyCycleHook, hcClient);
    }

    /**
     * 创建弹性伸缩配置
     * 创建弹性伸缩配置。伸缩配置是伸缩组内实例（弹性云服务器云主机）的模板，定义了伸缩组内待添加的实例的规格数据。伸缩配置与伸缩组是解耦的，同一伸缩配置可以被多个伸缩组使用。默认最多可以创建100个伸缩配置。
     *
     * @param CreateScalingConfigRequest 请求对象
     * @return CreateScalingConfigResponse
     */
    public CreateScalingConfigResponse createScalingConfig(CreateScalingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingConfig);
    }

    /**
     * 创建弹性伸缩配置
     * 创建弹性伸缩配置。伸缩配置是伸缩组内实例（弹性云服务器云主机）的模板，定义了伸缩组内待添加的实例的规格数据。伸缩配置与伸缩组是解耦的，同一伸缩配置可以被多个伸缩组使用。默认最多可以创建100个伸缩配置。
     *
     * @param CreateScalingConfigRequest 请求对象
     * @return SyncInvoker<CreateScalingConfigRequest, CreateScalingConfigResponse>
     */
    public SyncInvoker<CreateScalingConfigRequest, CreateScalingConfigResponse> createScalingConfigInvoker(CreateScalingConfigRequest request) {
        return new SyncInvoker<CreateScalingConfigRequest, CreateScalingConfigResponse>(request, AsMeta.createScalingConfig, hcClient);
    }

    /**
     * 创建弹性伸缩组
     * 伸缩组是具有相同应用场景的实例的集合，是启停伸缩策略和进行伸缩活动的基本单位。伸缩组内定义了最大实例数、期望实例数、最小实例数、虚拟私有云、子网、负载均衡等信息。默认最多可以创建10个伸缩组。如果伸缩组配置了负载均衡，在添加或移除实例时，会自动为实例绑定或解绑负载均衡监听器。如果伸缩组使用负载均衡健康检查方式，伸缩组中的实例需要启用负载均衡器的监听端口才能通过健康检查。端口启用可在安全组中进行配置，可参考添加安全组规则进行操作。
     *
     * @param CreateScalingGroupRequest 请求对象
     * @return CreateScalingGroupResponse
     */
    public CreateScalingGroupResponse createScalingGroup(CreateScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingGroup);
    }

    /**
     * 创建弹性伸缩组
     * 伸缩组是具有相同应用场景的实例的集合，是启停伸缩策略和进行伸缩活动的基本单位。伸缩组内定义了最大实例数、期望实例数、最小实例数、虚拟私有云、子网、负载均衡等信息。默认最多可以创建10个伸缩组。如果伸缩组配置了负载均衡，在添加或移除实例时，会自动为实例绑定或解绑负载均衡监听器。如果伸缩组使用负载均衡健康检查方式，伸缩组中的实例需要启用负载均衡器的监听端口才能通过健康检查。端口启用可在安全组中进行配置，可参考添加安全组规则进行操作。
     *
     * @param CreateScalingGroupRequest 请求对象
     * @return SyncInvoker<CreateScalingGroupRequest, CreateScalingGroupResponse>
     */
    public SyncInvoker<CreateScalingGroupRequest, CreateScalingGroupResponse> createScalingGroupInvoker(CreateScalingGroupRequest request) {
        return new SyncInvoker<CreateScalingGroupRequest, CreateScalingGroupResponse>(request, AsMeta.createScalingGroup, hcClient);
    }

    /**
     * 配置伸缩组通知
     * 给弹性伸缩组配置通知功能。每调用一次该接口，伸缩组即配置一个通知主题及其通知场景，每个伸缩组最多可以增加5个主题。通知主题由用户事先在SMN创建并进行订阅，当通知主题对应的通知场景出现时，伸缩组会向用户的订阅终端发送通知。
     *
     * @param CreateScalingNotificationRequest 请求对象
     * @return CreateScalingNotificationResponse
     */
    public CreateScalingNotificationResponse createScalingNotification(CreateScalingNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingNotification);
    }

    /**
     * 配置伸缩组通知
     * 给弹性伸缩组配置通知功能。每调用一次该接口，伸缩组即配置一个通知主题及其通知场景，每个伸缩组最多可以增加5个主题。通知主题由用户事先在SMN创建并进行订阅，当通知主题对应的通知场景出现时，伸缩组会向用户的订阅终端发送通知。
     *
     * @param CreateScalingNotificationRequest 请求对象
     * @return SyncInvoker<CreateScalingNotificationRequest, CreateScalingNotificationResponse>
     */
    public SyncInvoker<CreateScalingNotificationRequest, CreateScalingNotificationResponse> createScalingNotificationInvoker(CreateScalingNotificationRequest request) {
        return new SyncInvoker<CreateScalingNotificationRequest, CreateScalingNotificationResponse>(request, AsMeta.createScalingNotification, hcClient);
    }

    /**
     * 创建弹性伸缩策略
     * 创建弹性伸缩策略。伸缩策略定义了伸缩组内实例的扩张和收缩操作。如果执行伸缩策略造成伸缩组期望实例数与伸缩组内实例数不符，弹性伸缩会自动调整实例资源，以匹配期望实例数。当前伸缩策略支持告警触发策略，周期触发策略，定时触发策略。在策略执行具体动作中，可设置实例变化的个数，或根据当前实例的百分比数进行伸缩。
     *
     * @param CreateScalingPolicyRequest 请求对象
     * @return CreateScalingPolicyResponse
     */
    public CreateScalingPolicyResponse createScalingPolicy(CreateScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingPolicy);
    }

    /**
     * 创建弹性伸缩策略
     * 创建弹性伸缩策略。伸缩策略定义了伸缩组内实例的扩张和收缩操作。如果执行伸缩策略造成伸缩组期望实例数与伸缩组内实例数不符，弹性伸缩会自动调整实例资源，以匹配期望实例数。当前伸缩策略支持告警触发策略，周期触发策略，定时触发策略。在策略执行具体动作中，可设置实例变化的个数，或根据当前实例的百分比数进行伸缩。
     *
     * @param CreateScalingPolicyRequest 请求对象
     * @return SyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse>
     */
    public SyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse> createScalingPolicyInvoker(CreateScalingPolicyRequest request) {
        return new SyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse>(request, AsMeta.createScalingPolicy, hcClient);
    }

    /**
     * 创建标签
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     *
     * @param CreateScalingTagInfoRequest 请求对象
     * @return CreateScalingTagInfoResponse
     */
    public CreateScalingTagInfoResponse createScalingTagInfo(CreateScalingTagInfoRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingTagInfo);
    }

    /**
     * 创建标签
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     *
     * @param CreateScalingTagInfoRequest 请求对象
     * @return SyncInvoker<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse>
     */
    public SyncInvoker<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse> createScalingTagInfoInvoker(CreateScalingTagInfoRequest request) {
        return new SyncInvoker<CreateScalingTagInfoRequest, CreateScalingTagInfoResponse>(request, AsMeta.createScalingTagInfo, hcClient);
    }

    /**
     * 删除生命周期挂钩
     * 删除一个指定生命周期挂钩。伸缩组进行伸缩活动时，不允许删除该伸缩组内的生命周期挂钩。
     *
     * @param DeleteLifecycleHookRequest 请求对象
     * @return DeleteLifecycleHookResponse
     */
    public DeleteLifecycleHookResponse deleteLifecycleHook(DeleteLifecycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteLifecycleHook);
    }

    /**
     * 删除生命周期挂钩
     * 删除一个指定生命周期挂钩。伸缩组进行伸缩活动时，不允许删除该伸缩组内的生命周期挂钩。
     *
     * @param DeleteLifecycleHookRequest 请求对象
     * @return SyncInvoker<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse>
     */
    public SyncInvoker<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse> deleteLifecycleHookInvoker(DeleteLifecycleHookRequest request) {
        return new SyncInvoker<DeleteLifecycleHookRequest, DeleteLifecycleHookResponse>(request, AsMeta.deleteLifecycleHook, hcClient);
    }

    /**
     * 删除弹性伸缩配置
     * 删除一个指定弹性伸缩配置。
     *
     * @param DeleteScalingConfigRequest 请求对象
     * @return DeleteScalingConfigResponse
     */
    public DeleteScalingConfigResponse deleteScalingConfig(DeleteScalingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingConfig);
    }

    /**
     * 删除弹性伸缩配置
     * 删除一个指定弹性伸缩配置。
     *
     * @param DeleteScalingConfigRequest 请求对象
     * @return SyncInvoker<DeleteScalingConfigRequest, DeleteScalingConfigResponse>
     */
    public SyncInvoker<DeleteScalingConfigRequest, DeleteScalingConfigResponse> deleteScalingConfigInvoker(DeleteScalingConfigRequest request) {
        return new SyncInvoker<DeleteScalingConfigRequest, DeleteScalingConfigResponse>(request, AsMeta.deleteScalingConfig, hcClient);
    }

    /**
     * 删除弹性伸缩组
     * 删除一个指定弹性伸缩组。force_delete属性表示如果伸缩组存在ECS实例或正在进行伸缩活动，是否强制删除伸缩组并移出和释放ECS实例。默认值为no，表示不强制删除伸缩组。如果force_delete的值为no，必须满足以下两个条件，才能删除伸缩组：条件一：伸缩组没有正在进行的伸缩活动。条件二：伸缩组当前的ECS实例数量（current_instance_number）为0。如果force_delete的值为yes，伸缩组会被置于DELETING状态，拒绝接收新的伸缩活动请求，然后等待已有的伸缩活动完成，最后将伸缩组内所有ECS实例移出伸缩组（用户手动添加的ECS实例会被移出伸缩组，弹性伸缩自动创建的ECS实例会被自动删除）并删除伸缩组。
     *
     * @param DeleteScalingGroupRequest 请求对象
     * @return DeleteScalingGroupResponse
     */
    public DeleteScalingGroupResponse deleteScalingGroup(DeleteScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingGroup);
    }

    /**
     * 删除弹性伸缩组
     * 删除一个指定弹性伸缩组。force_delete属性表示如果伸缩组存在ECS实例或正在进行伸缩活动，是否强制删除伸缩组并移出和释放ECS实例。默认值为no，表示不强制删除伸缩组。如果force_delete的值为no，必须满足以下两个条件，才能删除伸缩组：条件一：伸缩组没有正在进行的伸缩活动。条件二：伸缩组当前的ECS实例数量（current_instance_number）为0。如果force_delete的值为yes，伸缩组会被置于DELETING状态，拒绝接收新的伸缩活动请求，然后等待已有的伸缩活动完成，最后将伸缩组内所有ECS实例移出伸缩组（用户手动添加的ECS实例会被移出伸缩组，弹性伸缩自动创建的ECS实例会被自动删除）并删除伸缩组。
     *
     * @param DeleteScalingGroupRequest 请求对象
     * @return SyncInvoker<DeleteScalingGroupRequest, DeleteScalingGroupResponse>
     */
    public SyncInvoker<DeleteScalingGroupRequest, DeleteScalingGroupResponse> deleteScalingGroupInvoker(DeleteScalingGroupRequest request) {
        return new SyncInvoker<DeleteScalingGroupRequest, DeleteScalingGroupResponse>(request, AsMeta.deleteScalingGroup, hcClient);
    }

    /**
     * 移出弹性伸缩组实例
     * 从弹性伸缩组中移出一个指定实例。实例处于INSERVICE且移出后实例数不能小于伸缩组的最小实例数时才可以移出。当伸缩组没有伸缩活动时，才能移出实例。
     *
     * @param DeleteScalingInstanceRequest 请求对象
     * @return DeleteScalingInstanceResponse
     */
    public DeleteScalingInstanceResponse deleteScalingInstance(DeleteScalingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingInstance);
    }

    /**
     * 移出弹性伸缩组实例
     * 从弹性伸缩组中移出一个指定实例。实例处于INSERVICE且移出后实例数不能小于伸缩组的最小实例数时才可以移出。当伸缩组没有伸缩活动时，才能移出实例。
     *
     * @param DeleteScalingInstanceRequest 请求对象
     * @return SyncInvoker<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse>
     */
    public SyncInvoker<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse> deleteScalingInstanceInvoker(DeleteScalingInstanceRequest request) {
        return new SyncInvoker<DeleteScalingInstanceRequest, DeleteScalingInstanceResponse>(request, AsMeta.deleteScalingInstance, hcClient);
    }

    /**
     * 删除伸缩组通知
     * 删除指定的弹性伸缩组中指定的通知。
     *
     * @param DeleteScalingNotificationRequest 请求对象
     * @return DeleteScalingNotificationResponse
     */
    public DeleteScalingNotificationResponse deleteScalingNotification(DeleteScalingNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingNotification);
    }

    /**
     * 删除伸缩组通知
     * 删除指定的弹性伸缩组中指定的通知。
     *
     * @param DeleteScalingNotificationRequest 请求对象
     * @return SyncInvoker<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse>
     */
    public SyncInvoker<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse> deleteScalingNotificationInvoker(DeleteScalingNotificationRequest request) {
        return new SyncInvoker<DeleteScalingNotificationRequest, DeleteScalingNotificationResponse>(request, AsMeta.deleteScalingNotification, hcClient);
    }

    /**
     * 删除弹性伸缩策略
     * 删除一个指定弹性伸缩策略。
     *
     * @param DeleteScalingPolicyRequest 请求对象
     * @return DeleteScalingPolicyResponse
     */
    public DeleteScalingPolicyResponse deleteScalingPolicy(DeleteScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingPolicy);
    }

    /**
     * 删除弹性伸缩策略
     * 删除一个指定弹性伸缩策略。
     *
     * @param DeleteScalingPolicyRequest 请求对象
     * @return SyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse>
     */
    public SyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> deleteScalingPolicyInvoker(DeleteScalingPolicyRequest request) {
        return new SyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse>(request, AsMeta.deleteScalingPolicy, hcClient);
    }

    /**
     * 删除标签
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     *
     * @param DeleteScalingTagInfoRequest 请求对象
     * @return DeleteScalingTagInfoResponse
     */
    public DeleteScalingTagInfoResponse deleteScalingTagInfo(DeleteScalingTagInfoRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingTagInfo);
    }

    /**
     * 删除标签
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     *
     * @param DeleteScalingTagInfoRequest 请求对象
     * @return SyncInvoker<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse>
     */
    public SyncInvoker<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse> deleteScalingTagInfoInvoker(DeleteScalingTagInfoRequest request) {
        return new SyncInvoker<DeleteScalingTagInfoRequest, DeleteScalingTagInfoResponse>(request, AsMeta.deleteScalingTagInfo, hcClient);
    }

    /**
     * 执行弹性伸缩策略。
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     *
     * @param ExecuteScalingPolicyRequest 请求对象
     * @return ExecuteScalingPolicyResponse
     */
    public ExecuteScalingPolicyResponse executeScalingPolicy(ExecuteScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.executeScalingPolicy);
    }

    /**
     * 执行弹性伸缩策略。
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     *
     * @param ExecuteScalingPolicyRequest 请求对象
     * @return SyncInvoker<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse>
     */
    public SyncInvoker<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse> executeScalingPolicyInvoker(ExecuteScalingPolicyRequest request) {
        return new SyncInvoker<ExecuteScalingPolicyRequest, ExecuteScalingPolicyResponse>(request, AsMeta.executeScalingPolicy, hcClient);
    }

    /**
     * 查询伸缩实例挂起信息
     * 添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被挂钩挂起并置于等待状态，根据输入条件过滤查询弹性伸缩组中伸缩实例的挂起信息。可根据实例ID进行条件过滤查询。若不加过滤条件默认查询指定伸缩组内所有实例挂起信息。
     *
     * @param ListHookInstancesRequest 请求对象
     * @return ListHookInstancesResponse
     */
    public ListHookInstancesResponse listHookInstances(ListHookInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listHookInstances);
    }

    /**
     * 查询伸缩实例挂起信息
     * 添加生命周期挂钩后，当伸缩组进行伸缩活动时，实例将被挂钩挂起并置于等待状态，根据输入条件过滤查询弹性伸缩组中伸缩实例的挂起信息。可根据实例ID进行条件过滤查询。若不加过滤条件默认查询指定伸缩组内所有实例挂起信息。
     *
     * @param ListHookInstancesRequest 请求对象
     * @return SyncInvoker<ListHookInstancesRequest, ListHookInstancesResponse>
     */
    public SyncInvoker<ListHookInstancesRequest, ListHookInstancesResponse> listHookInstancesInvoker(ListHookInstancesRequest request) {
        return new SyncInvoker<ListHookInstancesRequest, ListHookInstancesResponse>(request, AsMeta.listHookInstances, hcClient);
    }

    /**
     * 查询生命周期挂钩列表
     * 根据伸缩组ID查询生命周期挂钩列表。
     *
     * @param ListLifeCycleHooksRequest 请求对象
     * @return ListLifeCycleHooksResponse
     */
    public ListLifeCycleHooksResponse listLifeCycleHooks(ListLifeCycleHooksRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listLifeCycleHooks);
    }

    /**
     * 查询生命周期挂钩列表
     * 根据伸缩组ID查询生命周期挂钩列表。
     *
     * @param ListLifeCycleHooksRequest 请求对象
     * @return SyncInvoker<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse>
     */
    public SyncInvoker<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse> listLifeCycleHooksInvoker(ListLifeCycleHooksRequest request) {
        return new SyncInvoker<ListLifeCycleHooksRequest, ListLifeCycleHooksResponse>(request, AsMeta.listLifeCycleHooks, hcClient);
    }

    /**
     * 查询资源实例
     * 根据项目ID查询指定资源类型的资源实例。资源、资源tag默认按照创建时间倒序。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listResourceInstances);
    }

    /**
     * 查询资源实例
     * 根据项目ID查询指定资源类型的资源实例。资源、资源tag默认按照创建时间倒序。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(ListResourceInstancesRequest request) {
        return new SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request, AsMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询伸缩活动日志
     * 根据输入条件过滤查询伸缩活动日志。查询结果分页显示。可根据起始时间，截止时间，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     *
     * @param ListScalingActivityLogsRequest 请求对象
     * @return ListScalingActivityLogsResponse
     */
    public ListScalingActivityLogsResponse listScalingActivityLogs(ListScalingActivityLogsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingActivityLogs);
    }

    /**
     * 查询伸缩活动日志
     * 根据输入条件过滤查询伸缩活动日志。查询结果分页显示。可根据起始时间，截止时间，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     *
     * @param ListScalingActivityLogsRequest 请求对象
     * @return SyncInvoker<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse>
     */
    public SyncInvoker<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse> listScalingActivityLogsInvoker(ListScalingActivityLogsRequest request) {
        return new SyncInvoker<ListScalingActivityLogsRequest, ListScalingActivityLogsResponse>(request, AsMeta.listScalingActivityLogs, hcClient);
    }

    /**
     * 查询伸缩活动日志v2版本
     * 根据输入条件过滤查询伸缩活动日志，支持查询实例伸缩、ELB迁移、实例备用等类型活动。查询结果分页显示。查询伸缩活动日志V2版本与V1版本区别在于，V2版本展示了更详细的实例伸缩日志，如ELB迁移日志，实例备用日志信息。可根据起始时间，截止时间，起始行号，记录数，伸缩活动类型等作为条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     *
     * @param ListScalingActivityV2LogsRequest 请求对象
     * @return ListScalingActivityV2LogsResponse
     */
    public ListScalingActivityV2LogsResponse listScalingActivityV2Logs(ListScalingActivityV2LogsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingActivityV2Logs);
    }

    /**
     * 查询伸缩活动日志v2版本
     * 根据输入条件过滤查询伸缩活动日志，支持查询实例伸缩、ELB迁移、实例备用等类型活动。查询结果分页显示。查询伸缩活动日志V2版本与V1版本区别在于，V2版本展示了更详细的实例伸缩日志，如ELB迁移日志，实例备用日志信息。可根据起始时间，截止时间，起始行号，记录数，伸缩活动类型等作为条件过滤查询。若不加过滤条件默认查询最多20条伸缩活动日志信息。
     *
     * @param ListScalingActivityV2LogsRequest 请求对象
     * @return SyncInvoker<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse>
     */
    public SyncInvoker<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse> listScalingActivityV2LogsInvoker(ListScalingActivityV2LogsRequest request) {
        return new SyncInvoker<ListScalingActivityV2LogsRequest, ListScalingActivityV2LogsResponse>(request, AsMeta.listScalingActivityV2Logs, hcClient);
    }

    /**
     * 查询弹性伸缩配置列表
     * 根据输入条件过滤查询弹性伸缩配置。查询结果分页显示。可以根据伸缩配置名称，镜像ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩配置信息。
     *
     * @param ListScalingConfigsRequest 请求对象
     * @return ListScalingConfigsResponse
     */
    public ListScalingConfigsResponse listScalingConfigs(ListScalingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingConfigs);
    }

    /**
     * 查询弹性伸缩配置列表
     * 根据输入条件过滤查询弹性伸缩配置。查询结果分页显示。可以根据伸缩配置名称，镜像ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩配置信息。
     *
     * @param ListScalingConfigsRequest 请求对象
     * @return SyncInvoker<ListScalingConfigsRequest, ListScalingConfigsResponse>
     */
    public SyncInvoker<ListScalingConfigsRequest, ListScalingConfigsResponse> listScalingConfigsInvoker(ListScalingConfigsRequest request) {
        return new SyncInvoker<ListScalingConfigsRequest, ListScalingConfigsResponse>(request, AsMeta.listScalingConfigs, hcClient);
    }

    /**
     * 查询弹性伸缩组列表
     * 根据输入条件过滤查询弹性伸缩组列表。查询结果分页显示。可根据伸缩组名称，伸缩配置ID，伸缩组状态，企业项目ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩组信息。
     *
     * @param ListScalingGroupsRequest 请求对象
     * @return ListScalingGroupsResponse
     */
    public ListScalingGroupsResponse listScalingGroups(ListScalingGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingGroups);
    }

    /**
     * 查询弹性伸缩组列表
     * 根据输入条件过滤查询弹性伸缩组列表。查询结果分页显示。可根据伸缩组名称，伸缩配置ID，伸缩组状态，企业项目ID，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认最多查询租户下20条伸缩组信息。
     *
     * @param ListScalingGroupsRequest 请求对象
     * @return SyncInvoker<ListScalingGroupsRequest, ListScalingGroupsResponse>
     */
    public SyncInvoker<ListScalingGroupsRequest, ListScalingGroupsResponse> listScalingGroupsInvoker(ListScalingGroupsRequest request) {
        return new SyncInvoker<ListScalingGroupsRequest, ListScalingGroupsResponse>(request, AsMeta.listScalingGroups, hcClient);
    }

    /**
     * 查询弹性伸缩组中的实例列表
     * 根据输入条件过滤查询弹性伸缩组中实例信息。查询结果分页显示。可根据实例在伸缩组中的生命周期状态，实例健康状态，实例保护状态，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认查询组内最多20条实例信息
     *
     * @param ListScalingInstancesRequest 请求对象
     * @return ListScalingInstancesResponse
     */
    public ListScalingInstancesResponse listScalingInstances(ListScalingInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingInstances);
    }

    /**
     * 查询弹性伸缩组中的实例列表
     * 根据输入条件过滤查询弹性伸缩组中实例信息。查询结果分页显示。可根据实例在伸缩组中的生命周期状态，实例健康状态，实例保护状态，起始行号，记录条数进行条件过滤查询。若不加过滤条件默认查询组内最多20条实例信息
     *
     * @param ListScalingInstancesRequest 请求对象
     * @return SyncInvoker<ListScalingInstancesRequest, ListScalingInstancesResponse>
     */
    public SyncInvoker<ListScalingInstancesRequest, ListScalingInstancesResponse> listScalingInstancesInvoker(ListScalingInstancesRequest request) {
        return new SyncInvoker<ListScalingInstancesRequest, ListScalingInstancesResponse>(request, AsMeta.listScalingInstances, hcClient);
    }

    /**
     * 查询伸缩组通知列表
     * 根据伸缩组ID查询指定弹性伸缩组的通知列表。
     *
     * @param ListScalingNotificationsRequest 请求对象
     * @return ListScalingNotificationsResponse
     */
    public ListScalingNotificationsResponse listScalingNotifications(ListScalingNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingNotifications);
    }

    /**
     * 查询伸缩组通知列表
     * 根据伸缩组ID查询指定弹性伸缩组的通知列表。
     *
     * @param ListScalingNotificationsRequest 请求对象
     * @return SyncInvoker<ListScalingNotificationsRequest, ListScalingNotificationsResponse>
     */
    public SyncInvoker<ListScalingNotificationsRequest, ListScalingNotificationsResponse> listScalingNotificationsInvoker(ListScalingNotificationsRequest request) {
        return new SyncInvoker<ListScalingNotificationsRequest, ListScalingNotificationsResponse>(request, AsMeta.listScalingNotifications, hcClient);
    }

    /**
     * 查询弹性伸缩策略列表
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询租户下指定伸缩组内最多20条伸缩策略信息。
     *
     * @param ListScalingPoliciesRequest 请求对象
     * @return ListScalingPoliciesResponse
     */
    public ListScalingPoliciesResponse listScalingPolicies(ListScalingPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingPolicies);
    }

    /**
     * 查询弹性伸缩策略列表
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询租户下指定伸缩组内最多20条伸缩策略信息。
     *
     * @param ListScalingPoliciesRequest 请求对象
     * @return SyncInvoker<ListScalingPoliciesRequest, ListScalingPoliciesResponse>
     */
    public SyncInvoker<ListScalingPoliciesRequest, ListScalingPoliciesResponse> listScalingPoliciesInvoker(ListScalingPoliciesRequest request) {
        return new SyncInvoker<ListScalingPoliciesRequest, ListScalingPoliciesResponse>(request, AsMeta.listScalingPolicies, hcClient);
    }

    /**
     * 查询策略执行日志
     * 根据输入条件过滤查询策略执行的历史记录。查询结果分页显示。可根据日志ID，伸缩资源类型，伸缩资源ID，策略执行类型，查询额起始，查询截止时间，查询起始行号，查询记录数进行条件过滤查询。若不加过滤条件默认查询最多20条策略执行日志信息。
     *
     * @param ListScalingPolicyExecuteLogsRequest 请求对象
     * @return ListScalingPolicyExecuteLogsResponse
     */
    public ListScalingPolicyExecuteLogsResponse listScalingPolicyExecuteLogs(ListScalingPolicyExecuteLogsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingPolicyExecuteLogs);
    }

    /**
     * 查询策略执行日志
     * 根据输入条件过滤查询策略执行的历史记录。查询结果分页显示。可根据日志ID，伸缩资源类型，伸缩资源ID，策略执行类型，查询额起始，查询截止时间，查询起始行号，查询记录数进行条件过滤查询。若不加过滤条件默认查询最多20条策略执行日志信息。
     *
     * @param ListScalingPolicyExecuteLogsRequest 请求对象
     * @return SyncInvoker<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse>
     */
    public SyncInvoker<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse> listScalingPolicyExecuteLogsInvoker(ListScalingPolicyExecuteLogsRequest request) {
        return new SyncInvoker<ListScalingPolicyExecuteLogsRequest, ListScalingPolicyExecuteLogsResponse>(request, AsMeta.listScalingPolicyExecuteLogs, hcClient);
    }

    /**
     * 查询资源标签
     * 根据项目ID和资源ID查询指定资源类型的资源标签列表。
     *
     * @param ListScalingTagInfosByResourceIdRequest 请求对象
     * @return ListScalingTagInfosByResourceIdResponse
     */
    public ListScalingTagInfosByResourceIdResponse listScalingTagInfosByResourceId(ListScalingTagInfosByResourceIdRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingTagInfosByResourceId);
    }

    /**
     * 查询资源标签
     * 根据项目ID和资源ID查询指定资源类型的资源标签列表。
     *
     * @param ListScalingTagInfosByResourceIdRequest 请求对象
     * @return SyncInvoker<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse>
     */
    public SyncInvoker<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse> listScalingTagInfosByResourceIdInvoker(ListScalingTagInfosByResourceIdRequest request) {
        return new SyncInvoker<ListScalingTagInfosByResourceIdRequest, ListScalingTagInfosByResourceIdResponse>(request, AsMeta.listScalingTagInfosByResourceId, hcClient);
    }

    /**
     * 查询标签
     * 根据项目ID查询指定资源类型的标签列表。
     *
     * @param ListScalingTagInfosByTenantIdRequest 请求对象
     * @return ListScalingTagInfosByTenantIdResponse
     */
    public ListScalingTagInfosByTenantIdResponse listScalingTagInfosByTenantId(ListScalingTagInfosByTenantIdRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingTagInfosByTenantId);
    }

    /**
     * 查询标签
     * 根据项目ID查询指定资源类型的标签列表。
     *
     * @param ListScalingTagInfosByTenantIdRequest 请求对象
     * @return SyncInvoker<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse>
     */
    public SyncInvoker<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse> listScalingTagInfosByTenantIdInvoker(ListScalingTagInfosByTenantIdRequest request) {
        return new SyncInvoker<ListScalingTagInfosByTenantIdRequest, ListScalingTagInfosByTenantIdResponse>(request, AsMeta.listScalingTagInfosByTenantId, hcClient);
    }

    /**
     * 停止弹性伸缩组
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     *
     * @param PauseScalingGroupRequest 请求对象
     * @return PauseScalingGroupResponse
     */
    public PauseScalingGroupResponse pauseScalingGroup(PauseScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.pauseScalingGroup);
    }

    /**
     * 停止弹性伸缩组
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     *
     * @param PauseScalingGroupRequest 请求对象
     * @return SyncInvoker<PauseScalingGroupRequest, PauseScalingGroupResponse>
     */
    public SyncInvoker<PauseScalingGroupRequest, PauseScalingGroupResponse> pauseScalingGroupInvoker(PauseScalingGroupRequest request) {
        return new SyncInvoker<PauseScalingGroupRequest, PauseScalingGroupResponse>(request, AsMeta.pauseScalingGroup, hcClient);
    }

    /**
     * 停止弹性伸缩策略。
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     *
     * @param PauseScalingPolicyRequest 请求对象
     * @return PauseScalingPolicyResponse
     */
    public PauseScalingPolicyResponse pauseScalingPolicy(PauseScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.pauseScalingPolicy);
    }

    /**
     * 停止弹性伸缩策略。
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     *
     * @param PauseScalingPolicyRequest 请求对象
     * @return SyncInvoker<PauseScalingPolicyRequest, PauseScalingPolicyResponse>
     */
    public SyncInvoker<PauseScalingPolicyRequest, PauseScalingPolicyResponse> pauseScalingPolicyInvoker(PauseScalingPolicyRequest request) {
        return new SyncInvoker<PauseScalingPolicyRequest, PauseScalingPolicyResponse>(request, AsMeta.pauseScalingPolicy, hcClient);
    }

    /**
     * 启用弹性伸缩组
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     *
     * @param ResumeScalingGroupRequest 请求对象
     * @return ResumeScalingGroupResponse
     */
    public ResumeScalingGroupResponse resumeScalingGroup(ResumeScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.resumeScalingGroup);
    }

    /**
     * 启用弹性伸缩组
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     *
     * @param ResumeScalingGroupRequest 请求对象
     * @return SyncInvoker<ResumeScalingGroupRequest, ResumeScalingGroupResponse>
     */
    public SyncInvoker<ResumeScalingGroupRequest, ResumeScalingGroupResponse> resumeScalingGroupInvoker(ResumeScalingGroupRequest request) {
        return new SyncInvoker<ResumeScalingGroupRequest, ResumeScalingGroupResponse>(request, AsMeta.resumeScalingGroup, hcClient);
    }

    /**
     * 启用弹性伸缩策略。
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     *
     * @param ResumeScalingPolicyRequest 请求对象
     * @return ResumeScalingPolicyResponse
     */
    public ResumeScalingPolicyResponse resumeScalingPolicy(ResumeScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.resumeScalingPolicy);
    }

    /**
     * 启用弹性伸缩策略。
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     *
     * @param ResumeScalingPolicyRequest 请求对象
     * @return SyncInvoker<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse>
     */
    public SyncInvoker<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse> resumeScalingPolicyInvoker(ResumeScalingPolicyRequest request) {
        return new SyncInvoker<ResumeScalingPolicyRequest, ResumeScalingPolicyResponse>(request, AsMeta.resumeScalingPolicy, hcClient);
    }

    /**
     * 查询生命周期挂钩详情
     * 根据伸缩组ID及生命周期挂钩名称查询指定的生命周期挂钩详情。
     *
     * @param ShowLifeCycleHookRequest 请求对象
     * @return ShowLifeCycleHookResponse
     */
    public ShowLifeCycleHookResponse showLifeCycleHook(ShowLifeCycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showLifeCycleHook);
    }

    /**
     * 查询生命周期挂钩详情
     * 根据伸缩组ID及生命周期挂钩名称查询指定的生命周期挂钩详情。
     *
     * @param ShowLifeCycleHookRequest 请求对象
     * @return SyncInvoker<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse>
     */
    public SyncInvoker<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse> showLifeCycleHookInvoker(ShowLifeCycleHookRequest request) {
        return new SyncInvoker<ShowLifeCycleHookRequest, ShowLifeCycleHookResponse>(request, AsMeta.showLifeCycleHook, hcClient);
    }

    /**
     * 查询弹性伸缩策略和伸缩实例配额
     * 根据伸缩组ID查询指定弹性伸缩组下的伸缩策略和伸缩实例的配额总数及已使用配额数。
     *
     * @param ShowPolicyAndInstanceQuotaRequest 请求对象
     * @return ShowPolicyAndInstanceQuotaResponse
     */
    public ShowPolicyAndInstanceQuotaResponse showPolicyAndInstanceQuota(ShowPolicyAndInstanceQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showPolicyAndInstanceQuota);
    }

    /**
     * 查询弹性伸缩策略和伸缩实例配额
     * 根据伸缩组ID查询指定弹性伸缩组下的伸缩策略和伸缩实例的配额总数及已使用配额数。
     *
     * @param ShowPolicyAndInstanceQuotaRequest 请求对象
     * @return SyncInvoker<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse>
     */
    public SyncInvoker<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse> showPolicyAndInstanceQuotaInvoker(ShowPolicyAndInstanceQuotaRequest request) {
        return new SyncInvoker<ShowPolicyAndInstanceQuotaRequest, ShowPolicyAndInstanceQuotaResponse>(request, AsMeta.showPolicyAndInstanceQuota, hcClient);
    }

    /**
     * 查询配额
     * 查询指定租户下的弹性伸缩组、伸缩配置、伸缩带宽策略、伸缩策略和伸缩实例的配额总数及已使用配额数。
     *
     * @param ShowResourceQuotaRequest 请求对象
     * @return ShowResourceQuotaResponse
     */
    public ShowResourceQuotaResponse showResourceQuota(ShowResourceQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showResourceQuota);
    }

    /**
     * 查询配额
     * 查询指定租户下的弹性伸缩组、伸缩配置、伸缩带宽策略、伸缩策略和伸缩实例的配额总数及已使用配额数。
     *
     * @param ShowResourceQuotaRequest 请求对象
     * @return SyncInvoker<ShowResourceQuotaRequest, ShowResourceQuotaResponse>
     */
    public SyncInvoker<ShowResourceQuotaRequest, ShowResourceQuotaResponse> showResourceQuotaInvoker(ShowResourceQuotaRequest request) {
        return new SyncInvoker<ShowResourceQuotaRequest, ShowResourceQuotaResponse>(request, AsMeta.showResourceQuota, hcClient);
    }

    /**
     * 查询弹性伸缩配置详情
     * 根据伸缩配置ID查询一个弹性伸缩配置的详细信息。
     *
     * @param ShowScalingConfigRequest 请求对象
     * @return ShowScalingConfigResponse
     */
    public ShowScalingConfigResponse showScalingConfig(ShowScalingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showScalingConfig);
    }

    /**
     * 查询弹性伸缩配置详情
     * 根据伸缩配置ID查询一个弹性伸缩配置的详细信息。
     *
     * @param ShowScalingConfigRequest 请求对象
     * @return SyncInvoker<ShowScalingConfigRequest, ShowScalingConfigResponse>
     */
    public SyncInvoker<ShowScalingConfigRequest, ShowScalingConfigResponse> showScalingConfigInvoker(ShowScalingConfigRequest request) {
        return new SyncInvoker<ShowScalingConfigRequest, ShowScalingConfigResponse>(request, AsMeta.showScalingConfig, hcClient);
    }

    /**
     * 查询弹性伸缩组详情
     * 查询一个指定弹性伸缩组详情。
     *
     * @param ShowScalingGroupRequest 请求对象
     * @return ShowScalingGroupResponse
     */
    public ShowScalingGroupResponse showScalingGroup(ShowScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showScalingGroup);
    }

    /**
     * 查询弹性伸缩组详情
     * 查询一个指定弹性伸缩组详情。
     *
     * @param ShowScalingGroupRequest 请求对象
     * @return SyncInvoker<ShowScalingGroupRequest, ShowScalingGroupResponse>
     */
    public SyncInvoker<ShowScalingGroupRequest, ShowScalingGroupResponse> showScalingGroupInvoker(ShowScalingGroupRequest request) {
        return new SyncInvoker<ShowScalingGroupRequest, ShowScalingGroupResponse>(request, AsMeta.showScalingGroup, hcClient);
    }

    /**
     * 查询弹性伸缩策略详情
     * 查询指定弹性伸缩策略信息。
     *
     * @param ShowScalingPolicyRequest 请求对象
     * @return ShowScalingPolicyResponse
     */
    public ShowScalingPolicyResponse showScalingPolicy(ShowScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showScalingPolicy);
    }

    /**
     * 查询弹性伸缩策略详情
     * 查询指定弹性伸缩策略信息。
     *
     * @param ShowScalingPolicyRequest 请求对象
     * @return SyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse>
     */
    public SyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse> showScalingPolicyInvoker(ShowScalingPolicyRequest request) {
        return new SyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse>(request, AsMeta.showScalingPolicy, hcClient);
    }

    /**
     * 修改生命周期挂钩
     * 修改一个指定生命周期挂钩中的信息。
     *
     * @param UpdateLifeCycleHookRequest 请求对象
     * @return UpdateLifeCycleHookResponse
     */
    public UpdateLifeCycleHookResponse updateLifeCycleHook(UpdateLifeCycleHookRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateLifeCycleHook);
    }

    /**
     * 修改生命周期挂钩
     * 修改一个指定生命周期挂钩中的信息。
     *
     * @param UpdateLifeCycleHookRequest 请求对象
     * @return SyncInvoker<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse>
     */
    public SyncInvoker<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse> updateLifeCycleHookInvoker(UpdateLifeCycleHookRequest request) {
        return new SyncInvoker<UpdateLifeCycleHookRequest, UpdateLifeCycleHookResponse>(request, AsMeta.updateLifeCycleHook, hcClient);
    }

    /**
     * 修改弹性伸缩组
     * 修改一个指定弹性伸缩组中的信息。更换伸缩组的伸缩配置，伸缩组中已经存在的使用之前伸缩配置创建的云服务器云主机不受影响。伸缩组为没有正在进行的伸缩活动时，可以修改伸缩组的子网、可用区和负载均衡配置。当伸缩组的期望实例数改变时，会触发伸缩活动加入或移出实例。期望实例数必须大于或等于最小实例数，必须小于或等于最大实例数。
     *
     * @param UpdateScalingGroupRequest 请求对象
     * @return UpdateScalingGroupResponse
     */
    public UpdateScalingGroupResponse updateScalingGroup(UpdateScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateScalingGroup);
    }

    /**
     * 修改弹性伸缩组
     * 修改一个指定弹性伸缩组中的信息。更换伸缩组的伸缩配置，伸缩组中已经存在的使用之前伸缩配置创建的云服务器云主机不受影响。伸缩组为没有正在进行的伸缩活动时，可以修改伸缩组的子网、可用区和负载均衡配置。当伸缩组的期望实例数改变时，会触发伸缩活动加入或移出实例。期望实例数必须大于或等于最小实例数，必须小于或等于最大实例数。
     *
     * @param UpdateScalingGroupRequest 请求对象
     * @return SyncInvoker<UpdateScalingGroupRequest, UpdateScalingGroupResponse>
     */
    public SyncInvoker<UpdateScalingGroupRequest, UpdateScalingGroupResponse> updateScalingGroupInvoker(UpdateScalingGroupRequest request) {
        return new SyncInvoker<UpdateScalingGroupRequest, UpdateScalingGroupResponse>(request, AsMeta.updateScalingGroup, hcClient);
    }

    /**
     * 修改弹性伸缩策略
     * 修改指定弹性伸缩策略。
     *
     * @param UpdateScalingPolicyRequest 请求对象
     * @return UpdateScalingPolicyResponse
     */
    public UpdateScalingPolicyResponse updateScalingPolicy(UpdateScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateScalingPolicy);
    }

    /**
     * 修改弹性伸缩策略
     * 修改指定弹性伸缩策略。
     *
     * @param UpdateScalingPolicyRequest 请求对象
     * @return SyncInvoker<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse>
     */
    public SyncInvoker<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse> updateScalingPolicyInvoker(UpdateScalingPolicyRequest request) {
        return new SyncInvoker<UpdateScalingPolicyRequest, UpdateScalingPolicyResponse>(request, AsMeta.updateScalingPolicy, hcClient);
    }

    /**
     * 查询弹性伸缩API所有版本信息
     * 查询弹性伸缩API所有版本信息
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listApiVersions);
    }

    /**
     * 查询弹性伸缩API所有版本信息
     * 查询弹性伸缩API所有版本信息
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, AsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询弹性伸缩API指定版本信息
     * 根据租户id和资源id查询指定资源类型的标签列表
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showApiVersion);
    }

    /**
     * 查询弹性伸缩API指定版本信息
     * 根据租户id和资源id查询指定资源类型的标签列表
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, AsMeta.showApiVersion, hcClient);
    }

    /**
     * 创建弹性伸缩策略（V2版本）
     * 可针对不同类型资源如伸缩组或带宽，创建弹性伸缩策略。创建弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持创建对带宽资源进行调整的策略，通过伸缩资源类型区分伸缩资源。
     *
     * @param CreateScalingV2PolicyRequest 请求对象
     * @return CreateScalingV2PolicyResponse
     */
    public CreateScalingV2PolicyResponse createScalingV2Policy(CreateScalingV2PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingV2Policy);
    }

    /**
     * 创建弹性伸缩策略（V2版本）
     * 可针对不同类型资源如伸缩组或带宽，创建弹性伸缩策略。创建弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持创建对带宽资源进行调整的策略，通过伸缩资源类型区分伸缩资源。
     *
     * @param CreateScalingV2PolicyRequest 请求对象
     * @return SyncInvoker<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse>
     */
    public SyncInvoker<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse> createScalingV2PolicyInvoker(CreateScalingV2PolicyRequest request) {
        return new SyncInvoker<CreateScalingV2PolicyRequest, CreateScalingV2PolicyResponse>(request, AsMeta.createScalingV2Policy, hcClient);
    }

    /**
     * 查询弹性伸缩策略全量列表（V2版本）
     * 根据输入条件过滤查询弹性伸缩策略，支持查询当前租户下全量伸缩策略。查询结果分页显示。可根据伸缩资源ID，伸缩资源类型，伸缩策略名称，伸缩策略ID，告警ID，企业项目ID，起始行号，记录数，排序方式等条件进行过滤查询。若不加过滤添加默认查询该租户下最多20条伸缩策略信息。
     *
     * @param ListAllScalingV2PoliciesRequest 请求对象
     * @return ListAllScalingV2PoliciesResponse
     */
    public ListAllScalingV2PoliciesResponse listAllScalingV2Policies(ListAllScalingV2PoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listAllScalingV2Policies);
    }

    /**
     * 查询弹性伸缩策略全量列表（V2版本）
     * 根据输入条件过滤查询弹性伸缩策略，支持查询当前租户下全量伸缩策略。查询结果分页显示。可根据伸缩资源ID，伸缩资源类型，伸缩策略名称，伸缩策略ID，告警ID，企业项目ID，起始行号，记录数，排序方式等条件进行过滤查询。若不加过滤添加默认查询该租户下最多20条伸缩策略信息。
     *
     * @param ListAllScalingV2PoliciesRequest 请求对象
     * @return SyncInvoker<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse>
     */
    public SyncInvoker<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse> listAllScalingV2PoliciesInvoker(ListAllScalingV2PoliciesRequest request) {
        return new SyncInvoker<ListAllScalingV2PoliciesRequest, ListAllScalingV2PoliciesResponse>(request, AsMeta.listAllScalingV2Policies, hcClient);
    }

    /**
     * 查询弹性伸缩策略列表（V2版本）
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。查询弹性伸缩策略V2版本与V1版本的区别在于，V2版本响应含伸缩资源类型。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询该租户下指定资源下最多20条伸缩策略信息。
     *
     * @param ListScalingV2PoliciesRequest 请求对象
     * @return ListScalingV2PoliciesResponse
     */
    public ListScalingV2PoliciesResponse listScalingV2Policies(ListScalingV2PoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.listScalingV2Policies);
    }

    /**
     * 查询弹性伸缩策略列表（V2版本）
     * 根据输入条件过滤查询弹性伸缩策略。查询结果分页显示。查询弹性伸缩策略V2版本与V1版本的区别在于，V2版本响应含伸缩资源类型。可根据伸缩策略名称，策略类型，伸缩策略ID，起始行号，记录数进行条件过滤查询。若不加过滤条件默认查询该租户下指定资源下最多20条伸缩策略信息。
     *
     * @param ListScalingV2PoliciesRequest 请求对象
     * @return SyncInvoker<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse>
     */
    public SyncInvoker<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse> listScalingV2PoliciesInvoker(ListScalingV2PoliciesRequest request) {
        return new SyncInvoker<ListScalingV2PoliciesRequest, ListScalingV2PoliciesResponse>(request, AsMeta.listScalingV2Policies, hcClient);
    }

    /**
     * 查询指定弹性伸缩策略详情（V2版本）
     * 查询指定弹性伸缩策略信息。
     *
     * @param ShowScalingV2PolicyRequest 请求对象
     * @return ShowScalingV2PolicyResponse
     */
    public ShowScalingV2PolicyResponse showScalingV2Policy(ShowScalingV2PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.showScalingV2Policy);
    }

    /**
     * 查询指定弹性伸缩策略详情（V2版本）
     * 查询指定弹性伸缩策略信息。
     *
     * @param ShowScalingV2PolicyRequest 请求对象
     * @return SyncInvoker<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse>
     */
    public SyncInvoker<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse> showScalingV2PolicyInvoker(ShowScalingV2PolicyRequest request) {
        return new SyncInvoker<ShowScalingV2PolicyRequest, ShowScalingV2PolicyResponse>(request, AsMeta.showScalingV2Policy, hcClient);
    }

    /**
     * 修改弹性伸缩策略（V2版本）
     * 修改指定弹性伸缩策略。修改弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持修改伸缩资源类型。
     *
     * @param UpdateScalingV2PolicyRequest 请求对象
     * @return UpdateScalingV2PolicyResponse
     */
    public UpdateScalingV2PolicyResponse updateScalingV2Policy(UpdateScalingV2PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateScalingV2Policy);
    }

    /**
     * 修改弹性伸缩策略（V2版本）
     * 修改指定弹性伸缩策略。修改弹性伸缩策略V2版本与V1版本的区别在于，V2版本支持修改伸缩资源类型。
     *
     * @param UpdateScalingV2PolicyRequest 请求对象
     * @return SyncInvoker<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse>
     */
    public SyncInvoker<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse> updateScalingV2PolicyInvoker(UpdateScalingV2PolicyRequest request) {
        return new SyncInvoker<UpdateScalingV2PolicyRequest, UpdateScalingV2PolicyResponse>(request, AsMeta.updateScalingV2Policy, hcClient);
    }

}
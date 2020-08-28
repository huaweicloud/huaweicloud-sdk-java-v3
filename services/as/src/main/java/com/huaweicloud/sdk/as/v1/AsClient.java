package com.huaweicloud.sdk.as.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 伸缩实例生命周期回调
     * 通过生命周期操作令牌或者通过实例ID和生命周期挂钩名称对伸缩实例指定的挂钩进行回调操作。如果在超时时间结束前已完成自定义操作，选择终止或继续完成生命周期操作。如果需要更多时间完成自定义操作，选择延长超时时间，实例保持等待状态的时间将增加1小时。只有实例的生命周期挂钩状态为 HANGING 时才可以进行回调操作。
     *
     * @param CompleteLifecycleActionRequest 请求对象
     * @return CompleteLifecycleActionResponse
    */
    public CompleteLifecycleActionResponse completeLifecycleAction(CompleteLifecycleActionRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.completeLifecycleAction);
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
     * 创建标签
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     *
     * @param CreateScalingTagsRequest 请求对象
     * @return CreateScalingTagsResponse
    */
    public CreateScalingTagsResponse createScalingTags(CreateScalingTagsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.createScalingTags);
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
     * 删除标签
     * 创建或删除指定资源的标签。每个伸缩组最多添加10个标签。
     *
     * @param DeleteScalingTagsRequest 请求对象
     * @return DeleteScalingTagsResponse
    */
    public DeleteScalingTagsResponse deleteScalingTags(DeleteScalingTagsRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.deleteScalingTags);
    }

    /**
     * 启用或停止弹性伸缩组
     * 启用或停止一个指定弹性伸缩组。已停用状态的伸缩组，不会自动触发任何伸缩活动。当伸缩组正在进行伸缩活动，即使停用，正在进行的伸缩活动也不会立即停止。
     *
     * @param EnableOrDisableScalingGroupRequest 请求对象
     * @return EnableOrDisableScalingGroupResponse
    */
    public EnableOrDisableScalingGroupResponse enableOrDisableScalingGroup(EnableOrDisableScalingGroupRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.enableOrDisableScalingGroup);
    }

    /**
     * 执行或启用或停止弹性伸缩策略。
     * 立即执行或启用或停止一个指定弹性伸缩策略。当伸缩组、伸缩策略状态处于INSERVICE时，伸缩策略才能被正确执行，否则会执行失败。
     *
     * @param ExecuteScalingPolicyRequest 请求对象
     * @return ExecuteScalingPolicyResponse
    */
    public ExecuteScalingPolicyResponse executeScalingPolicy(ExecuteScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.executeScalingPolicy);
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
     * 批量操作实例
     * 批量移出伸缩组中的实例或批量添加伸缩组外的实例。批量对伸缩组中的实例设置或取消其实例保护属性。批量将伸缩组中的实例转入或移出备用状态。
     *
     * @param UpdateScalingGroupInstanceRequest 请求对象
     * @return UpdateScalingGroupInstanceResponse
    */
    public UpdateScalingGroupInstanceResponse updateScalingGroupInstance(UpdateScalingGroupInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AsMeta.updateScalingGroupInstance);
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

}
package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkParameterDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkParameterDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAutoScalingPolicyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAutoScalingPolicyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListAutoScalingPolicyDetailsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAutoScalingPolicyDetailsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionItemsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionItemsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListLogDiagnosisJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListLogDiagnosisJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobAlarmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobAlarmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobProxyResponseDelimitRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobProxyResponseDelimitResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListProfilingDiagnosisJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListProfilingDiagnosisJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoScalingPolicyDetailRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoScalingPolicyDetailResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionStatisticsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionStatisticsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobResultRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobResultResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobResultRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobResultResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateProfilingDiagnosisJobResponse;

public class ModelArtsClient {

    protected HcClient hcClient;

    public ModelArtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModelArtsClient> newBuilder() {
        ClientBuilder<ModelArtsClient> clientBuilder = new ClientBuilder<>(ModelArtsClient::new);
        return clientBuilder;
    }

    /**
     * 计划事件授权
     *
     * 计划事件授权接口用于为指定的计划事件分配或调整权限。该接口适用于以下场景：当创建新的计划事件、调整现有计划事件的权限设置或变更权限分配时，用户可通过此接口为指定的计划事件授予或修改权限。使用该接口的前提条件是计划事件已存在且用户具有管理员权限。授权操作完成后，计划事件的权限设置将被更新，相关变更将被记录以便审计。若计划事件不存在、用户无权限操作或授权信息格式不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return AcceptScheduledEventResponse
     */
    public AcceptScheduledEventResponse acceptScheduledEvent(AcceptScheduledEventRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.acceptScheduledEvent);
    }

    /**
     * 计划事件授权
     *
     * 计划事件授权接口用于为指定的计划事件分配或调整权限。该接口适用于以下场景：当创建新的计划事件、调整现有计划事件的权限设置或变更权限分配时，用户可通过此接口为指定的计划事件授予或修改权限。使用该接口的前提条件是计划事件已存在且用户具有管理员权限。授权操作完成后，计划事件的权限设置将被更新，相关变更将被记录以便审计。若计划事件不存在、用户无权限操作或授权信息格式不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return SyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse>
     */
    public SyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEventInvoker(
        AcceptScheduledEventRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.acceptScheduledEvent, hcClient);
    }

    /**
     * 创建自动扩缩容策略
     *
     * 创建自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoScalingPolicyRequest 请求对象
     * @return CreateAutoScalingPolicyResponse
     */
    public CreateAutoScalingPolicyResponse createAutoScalingPolicy(CreateAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createAutoScalingPolicy);
    }

    /**
     * 创建自动扩缩容策略
     *
     * 创建自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse>
     */
    public SyncInvoker<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> createAutoScalingPolicyInvoker(
        CreateAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createAutoScalingPolicy, hcClient);
    }

    /**
     * 创建巡检作业
     *
     * 创建巡检作业功能允许用户根据需求创建标准巡检或深度巡检任务，支持对集群或节点进行巡检。该功能适用于需要定期检查集群或节点健康状态、排查潜在问题或在部署新服务前进行全面检查的场景。使用此功能前，请确保您具备创建巡检作业的权限，并提供有效的巡检对象ID。成功创建后，巡检任务将被下发，收集主机配置和状态、NPU驱动配置和状态、网络状态等信息，并进行AICore压测、HBM压测等。巡检结果将存储在指定位置，供后续查询和分析。若权限不足、巡检对象ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInspectionJobRequest 请求对象
     * @return CreateInspectionJobResponse
     */
    public CreateInspectionJobResponse createInspectionJob(CreateInspectionJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createInspectionJob);
    }

    /**
     * 创建巡检作业
     *
     * 创建巡检作业功能允许用户根据需求创建标准巡检或深度巡检任务，支持对集群或节点进行巡检。该功能适用于需要定期检查集群或节点健康状态、排查潜在问题或在部署新服务前进行全面检查的场景。使用此功能前，请确保您具备创建巡检作业的权限，并提供有效的巡检对象ID。成功创建后，巡检任务将被下发，收集主机配置和状态、NPU驱动配置和状态、网络状态等信息，并进行AICore压测、HBM压测等。巡检结果将存储在指定位置，供后续查询和分析。若权限不足、巡检对象ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInspectionJobRequest 请求对象
     * @return SyncInvoker<CreateInspectionJobRequest, CreateInspectionJobResponse>
     */
    public SyncInvoker<CreateInspectionJobRequest, CreateInspectionJobResponse> createInspectionJobInvoker(
        CreateInspectionJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createInspectionJob, hcClient);
    }

    /**
     * 创建日志诊断作业
     *
     * 创建日志诊断作业接口用于通过CSS（Cloud Search Service）完成训练作业日志的导入和分析，提升日志查询效率和问题定位效率。该接口适用于以下场景：用户需要快速分析训练作业的日志以定位问题、优化训练作业性能或监控训练过程。使用该接口的前提条件是训练作业已存在且用户具有相应的权限，同时日志存储路径需正确且可访问。调用该接口后，系统将创建一个日志诊断作业，开始导入和分析日志数据。若日志路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogDiagnosisJobRequest 请求对象
     * @return CreateLogDiagnosisJobResponse
     */
    public CreateLogDiagnosisJobResponse createLogDiagnosisJob(CreateLogDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createLogDiagnosisJob);
    }

    /**
     * 创建日志诊断作业
     *
     * 创建日志诊断作业接口用于通过CSS（Cloud Search Service）完成训练作业日志的导入和分析，提升日志查询效率和问题定位效率。该接口适用于以下场景：用户需要快速分析训练作业的日志以定位问题、优化训练作业性能或监控训练过程。使用该接口的前提条件是训练作业已存在且用户具有相应的权限，同时日志存储路径需正确且可访问。调用该接口后，系统将创建一个日志诊断作业，开始导入和分析日志数据。若日志路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogDiagnosisJobRequest 请求对象
     * @return SyncInvoker<CreateLogDiagnosisJobRequest, CreateLogDiagnosisJobResponse>
     */
    public SyncInvoker<CreateLogDiagnosisJobRequest, CreateLogDiagnosisJobResponse> createLogDiagnosisJobInvoker(
        CreateLogDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createLogDiagnosisJob, hcClient);
    }

    /**
     * 创建网络大脑参数面诊断作业
     *
     * 创建网络大脑参数面诊断作业接口用于启动网络诊断任务，支持通过作业ID或选择特定节点进行网络拓扑还原、交换机告警筛选、KPI分析，从而定位网络问题并查看相关信息。该接口适用于以下场景：用户需要诊断网络性能问题、排查网络连接异常或分析网络设备告警。使用该接口的前提条件是用户已具备诊断权限，并提供有效的作业ID或节点信息。调用该接口后，系统将生成诊断报告，帮助用户快速定位问题。若作业ID无效或节点信息错误，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkParameterDiagnosisJobRequest 请求对象
     * @return CreateNetworkParameterDiagnosisJobResponse
     */
    public CreateNetworkParameterDiagnosisJobResponse createNetworkParameterDiagnosisJob(
        CreateNetworkParameterDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createNetworkParameterDiagnosisJob);
    }

    /**
     * 创建网络大脑参数面诊断作业
     *
     * 创建网络大脑参数面诊断作业接口用于启动网络诊断任务，支持通过作业ID或选择特定节点进行网络拓扑还原、交换机告警筛选、KPI分析，从而定位网络问题并查看相关信息。该接口适用于以下场景：用户需要诊断网络性能问题、排查网络连接异常或分析网络设备告警。使用该接口的前提条件是用户已具备诊断权限，并提供有效的作业ID或节点信息。调用该接口后，系统将生成诊断报告，帮助用户快速定位问题。若作业ID无效或节点信息错误，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkParameterDiagnosisJobRequest 请求对象
     * @return SyncInvoker<CreateNetworkParameterDiagnosisJobRequest, CreateNetworkParameterDiagnosisJobResponse>
     */
    public SyncInvoker<CreateNetworkParameterDiagnosisJobRequest, CreateNetworkParameterDiagnosisJobResponse> createNetworkParameterDiagnosisJobInvoker(
        CreateNetworkParameterDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createNetworkParameterDiagnosisJob, hcClient);
    }

    /**
     * 创建profiling诊断作业
     *
     * 创建profiling诊断作业用于通过分析profiling性能数据文件*_ascend_pt或*_ascend_ms目录，提升性能问题定位效率。该接口适用于以下场景：用户需要快速分析profiling性能文件以定位慢卡慢节点等性能问题。使用该接口的前提条件是用户将profiling性能数据文件按指定格式组织，同时组织路径可访问。调用该接口后，系统将创建一个profiling诊断作业，开始分析profiling性能数据。若路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProfilingDiagnosisJobRequest 请求对象
     * @return CreateProfilingDiagnosisJobResponse
     */
    public CreateProfilingDiagnosisJobResponse createProfilingDiagnosisJob(CreateProfilingDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.createProfilingDiagnosisJob);
    }

    /**
     * 创建profiling诊断作业
     *
     * 创建profiling诊断作业用于通过分析profiling性能数据文件*_ascend_pt或*_ascend_ms目录，提升性能问题定位效率。该接口适用于以下场景：用户需要快速分析profiling性能文件以定位慢卡慢节点等性能问题。使用该接口的前提条件是用户将profiling性能数据文件按指定格式组织，同时组织路径可访问。调用该接口后，系统将创建一个profiling诊断作业，开始分析profiling性能数据。若路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProfilingDiagnosisJobRequest 请求对象
     * @return SyncInvoker<CreateProfilingDiagnosisJobRequest, CreateProfilingDiagnosisJobResponse>
     */
    public SyncInvoker<CreateProfilingDiagnosisJobRequest, CreateProfilingDiagnosisJobResponse> createProfilingDiagnosisJobInvoker(
        CreateProfilingDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.createProfilingDiagnosisJob, hcClient);
    }

    /**
     * 删除自动扩缩容
     *
     * 删除自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoScalingPolicyRequest 请求对象
     * @return DeleteAutoScalingPolicyResponse
     */
    public DeleteAutoScalingPolicyResponse deleteAutoScalingPolicy(DeleteAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteAutoScalingPolicy);
    }

    /**
     * 删除自动扩缩容
     *
     * 删除自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse>
     */
    public SyncInvoker<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicyInvoker(
        DeleteAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteAutoScalingPolicy, hcClient);
    }

    /**
     * 删除巡检作业
     *
     * 删除巡检作业接口用于移除已创建的巡检任务。该接口适用于以下场景：当巡检任务完成、配置错误或需要清理资源时，用户可通过此接口删除指定的巡检作业。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。删除操作完成后，巡检作业将被永久移除，相关资源和配置也将被清理。若巡检作业不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInspectionJobRequest 请求对象
     * @return DeleteInspectionJobResponse
     */
    public DeleteInspectionJobResponse deleteInspectionJob(DeleteInspectionJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteInspectionJob);
    }

    /**
     * 删除巡检作业
     *
     * 删除巡检作业接口用于移除已创建的巡检任务。该接口适用于以下场景：当巡检任务完成、配置错误或需要清理资源时，用户可通过此接口删除指定的巡检作业。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。删除操作完成后，巡检作业将被永久移除，相关资源和配置也将被清理。若巡检作业不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInspectionJobRequest 请求对象
     * @return SyncInvoker<DeleteInspectionJobRequest, DeleteInspectionJobResponse>
     */
    public SyncInvoker<DeleteInspectionJobRequest, DeleteInspectionJobResponse> deleteInspectionJobInvoker(
        DeleteInspectionJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteInspectionJob, hcClient);
    }

    /**
     * 删除日志诊断作业
     *
     * 删除日志诊断作业用于移除系统中已创建的日志诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogDiagnosisJobRequest 请求对象
     * @return DeleteLogDiagnosisJobResponse
     */
    public DeleteLogDiagnosisJobResponse deleteLogDiagnosisJob(DeleteLogDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteLogDiagnosisJob);
    }

    /**
     * 删除日志诊断作业
     *
     * 删除日志诊断作业用于移除系统中已创建的日志诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogDiagnosisJobRequest 请求对象
     * @return SyncInvoker<DeleteLogDiagnosisJobRequest, DeleteLogDiagnosisJobResponse>
     */
    public SyncInvoker<DeleteLogDiagnosisJobRequest, DeleteLogDiagnosisJobResponse> deleteLogDiagnosisJobInvoker(
        DeleteLogDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteLogDiagnosisJob, hcClient);
    }

    /**
     * 删除网络诊断作业
     *
     * 删除网络诊断作业接口用于删除指定的网络诊断作业，适用于用户在完成诊断任务后需要清理资源的场景。使用该接口的前提条件是用户具有删除权限，并且目标诊断作业已处于可删除状态。调用该接口后，系统将删除指定的诊断作业，释放相关资源。若用户无权限或诊断作业不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkDiagnosisJobRequest 请求对象
     * @return DeleteNetworkDiagnosisJobResponse
     */
    public DeleteNetworkDiagnosisJobResponse deleteNetworkDiagnosisJob(DeleteNetworkDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteNetworkDiagnosisJob);
    }

    /**
     * 删除网络诊断作业
     *
     * 删除网络诊断作业接口用于删除指定的网络诊断作业，适用于用户在完成诊断任务后需要清理资源的场景。使用该接口的前提条件是用户具有删除权限，并且目标诊断作业已处于可删除状态。调用该接口后，系统将删除指定的诊断作业，释放相关资源。若用户无权限或诊断作业不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkDiagnosisJobRequest 请求对象
     * @return SyncInvoker<DeleteNetworkDiagnosisJobRequest, DeleteNetworkDiagnosisJobResponse>
     */
    public SyncInvoker<DeleteNetworkDiagnosisJobRequest, DeleteNetworkDiagnosisJobResponse> deleteNetworkDiagnosisJobInvoker(
        DeleteNetworkDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteNetworkDiagnosisJob, hcClient);
    }

    /**
     * 删除profiling诊断作业
     *
     * 删除profiling诊断作业用于移除系统中已创建的profiling诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfilingDiagnosisJobRequest 请求对象
     * @return DeleteProfilingDiagnosisJobResponse
     */
    public DeleteProfilingDiagnosisJobResponse deleteProfilingDiagnosisJob(DeleteProfilingDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.deleteProfilingDiagnosisJob);
    }

    /**
     * 删除profiling诊断作业
     *
     * 删除profiling诊断作业用于移除系统中已创建的profiling诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfilingDiagnosisJobRequest 请求对象
     * @return SyncInvoker<DeleteProfilingDiagnosisJobRequest, DeleteProfilingDiagnosisJobResponse>
     */
    public SyncInvoker<DeleteProfilingDiagnosisJobRequest, DeleteProfilingDiagnosisJobResponse> deleteProfilingDiagnosisJobInvoker(
        DeleteProfilingDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.deleteProfilingDiagnosisJob, hcClient);
    }

    /**
     * 查询自动扩缩容策略列表
     *
     * 查询自动扩缩容策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoScalingPolicyDetailsRequest 请求对象
     * @return ListAutoScalingPolicyDetailsResponse
     */
    public ListAutoScalingPolicyDetailsResponse listAutoScalingPolicyDetails(
        ListAutoScalingPolicyDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listAutoScalingPolicyDetails);
    }

    /**
     * 查询自动扩缩容策略列表
     *
     * 查询自动扩缩容策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoScalingPolicyDetailsRequest 请求对象
     * @return SyncInvoker<ListAutoScalingPolicyDetailsRequest, ListAutoScalingPolicyDetailsResponse>
     */
    public SyncInvoker<ListAutoScalingPolicyDetailsRequest, ListAutoScalingPolicyDetailsResponse> listAutoScalingPolicyDetailsInvoker(
        ListAutoScalingPolicyDetailsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listAutoScalingPolicyDetails, hcClient);
    }

    /**
     * 查询巡检项列表
     *
     * 查询巡检项列表用于获取系统中已定义的巡检检查项信息，适用于查看特定任务的检查内容、创建或修改任务时选择检查项，以及根据设备类型或区域筛选巡检项等场景。使用该功能前需确保用户具有查询权限，且系统中存在巡检项数据。查询成功后，系统返回巡检项的详细列表，并记录操作日志。若出现权限不足、参数错误或资源不存在等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionItemsRequest 请求对象
     * @return ListInspectionItemsResponse
     */
    public ListInspectionItemsResponse listInspectionItems(ListInspectionItemsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInspectionItems);
    }

    /**
     * 查询巡检项列表
     *
     * 查询巡检项列表用于获取系统中已定义的巡检检查项信息，适用于查看特定任务的检查内容、创建或修改任务时选择检查项，以及根据设备类型或区域筛选巡检项等场景。使用该功能前需确保用户具有查询权限，且系统中存在巡检项数据。查询成功后，系统返回巡检项的详细列表，并记录操作日志。若出现权限不足、参数错误或资源不存在等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionItemsRequest 请求对象
     * @return SyncInvoker<ListInspectionItemsRequest, ListInspectionItemsResponse>
     */
    public SyncInvoker<ListInspectionItemsRequest, ListInspectionItemsResponse> listInspectionItemsInvoker(
        ListInspectionItemsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInspectionItems, hcClient);
    }

    /**
     * 查询巡检作业列表
     *
     * 查询巡检作业列表功能允许用户根据需求查询已创建的巡检作业列表。该功能适用于需要监控巡检作业状态、管理巡检任务或查看巡检结果的场景。使用此功能前，请确保您具备查询巡检作业的权限，并提供有效的项目ID。成功调用后，将返回符合条件的巡检作业列表，包括作业总数、当前页的作业数量以及每个作业的详细信息。若权限不足、项目ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionJobsRequest 请求对象
     * @return ListInspectionJobsResponse
     */
    public ListInspectionJobsResponse listInspectionJobs(ListInspectionJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInspectionJobs);
    }

    /**
     * 查询巡检作业列表
     *
     * 查询巡检作业列表功能允许用户根据需求查询已创建的巡检作业列表。该功能适用于需要监控巡检作业状态、管理巡检任务或查看巡检结果的场景。使用此功能前，请确保您具备查询巡检作业的权限，并提供有效的项目ID。成功调用后，将返回符合条件的巡检作业列表，包括作业总数、当前页的作业数量以及每个作业的详细信息。若权限不足、项目ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionJobsRequest 请求对象
     * @return SyncInvoker<ListInspectionJobsRequest, ListInspectionJobsResponse>
     */
    public SyncInvoker<ListInspectionJobsRequest, ListInspectionJobsResponse> listInspectionJobsInvoker(
        ListInspectionJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInspectionJobs, hcClient);
    }

    /**
     * 查询巡检节点列表
     *
     * 查询巡检节点列表接口用于获取指定巡检任务的节点信息，包括节点状态、资源使用情况等。该接口适用于以下场景：用户需要监控巡检任务的节点状态、查看节点资源分配情况或分析节点执行情况。使用该接口的前提条件是巡检任务已创建且用户具有管理员权限。调用该接口后，用户将获得巡检节点的详细信息，便于进一步分析或处理。若巡检任务不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionNodesRequest 请求对象
     * @return ListInspectionNodesResponse
     */
    public ListInspectionNodesResponse listInspectionNodes(ListInspectionNodesRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listInspectionNodes);
    }

    /**
     * 查询巡检节点列表
     *
     * 查询巡检节点列表接口用于获取指定巡检任务的节点信息，包括节点状态、资源使用情况等。该接口适用于以下场景：用户需要监控巡检任务的节点状态、查看节点资源分配情况或分析节点执行情况。使用该接口的前提条件是巡检任务已创建且用户具有管理员权限。调用该接口后，用户将获得巡检节点的详细信息，便于进一步分析或处理。若巡检任务不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionNodesRequest 请求对象
     * @return SyncInvoker<ListInspectionNodesRequest, ListInspectionNodesResponse>
     */
    public SyncInvoker<ListInspectionNodesRequest, ListInspectionNodesResponse> listInspectionNodesInvoker(
        ListInspectionNodesRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listInspectionNodes, hcClient);
    }

    /**
     * 查询日志诊断作业列表
     *
     * 查询日志诊断作业列表接口用于获取指定工作空间下的日志诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个日志诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个日志诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得日志诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogDiagnosisJobsRequest 请求对象
     * @return ListLogDiagnosisJobsResponse
     */
    public ListLogDiagnosisJobsResponse listLogDiagnosisJobs(ListLogDiagnosisJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listLogDiagnosisJobs);
    }

    /**
     * 查询日志诊断作业列表
     *
     * 查询日志诊断作业列表接口用于获取指定工作空间下的日志诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个日志诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个日志诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得日志诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogDiagnosisJobsRequest 请求对象
     * @return SyncInvoker<ListLogDiagnosisJobsRequest, ListLogDiagnosisJobsResponse>
     */
    public SyncInvoker<ListLogDiagnosisJobsRequest, ListLogDiagnosisJobsResponse> listLogDiagnosisJobsInvoker(
        ListLogDiagnosisJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listLogDiagnosisJobs, hcClient);
    }

    /**
     * 查询网络诊断作业告警
     *
     * 查询网络诊断作业告警接口用于获取指定网络诊断作业的告警信息，适用于用户需要监控网络诊断任务中的异常情况或排查网络问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的作业ID或筛选条件。调用该接口后，系统将返回与诊断作业相关的告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobAlarmRequest 请求对象
     * @return ListNetworkDiagnosisJobAlarmResponse
     */
    public ListNetworkDiagnosisJobAlarmResponse listNetworkDiagnosisJobAlarm(
        ListNetworkDiagnosisJobAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listNetworkDiagnosisJobAlarm);
    }

    /**
     * 查询网络诊断作业告警
     *
     * 查询网络诊断作业告警接口用于获取指定网络诊断作业的告警信息，适用于用户需要监控网络诊断任务中的异常情况或排查网络问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的作业ID或筛选条件。调用该接口后，系统将返回与诊断作业相关的告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobAlarmRequest 请求对象
     * @return SyncInvoker<ListNetworkDiagnosisJobAlarmRequest, ListNetworkDiagnosisJobAlarmResponse>
     */
    public SyncInvoker<ListNetworkDiagnosisJobAlarmRequest, ListNetworkDiagnosisJobAlarmResponse> listNetworkDiagnosisJobAlarmInvoker(
        ListNetworkDiagnosisJobAlarmRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listNetworkDiagnosisJobAlarm, hcClient);
    }

    /**
     * 查询网络诊断作业超时代答列表
     *
     * 查询网络诊断作业超时代答列表接口用于获取指定网络诊断作业中超时的告警信息，适用于用户需要监控网络诊断任务执行状态、及时发现和处理超时问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的项目ID和诊断作业ID。调用该接口后，系统将返回与诊断作业相关的超时告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobProxyResponseDelimitRequest 请求对象
     * @return ListNetworkDiagnosisJobProxyResponseDelimitResponse
     */
    public ListNetworkDiagnosisJobProxyResponseDelimitResponse listNetworkDiagnosisJobProxyResponseDelimit(
        ListNetworkDiagnosisJobProxyResponseDelimitRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listNetworkDiagnosisJobProxyResponseDelimit);
    }

    /**
     * 查询网络诊断作业超时代答列表
     *
     * 查询网络诊断作业超时代答列表接口用于获取指定网络诊断作业中超时的告警信息，适用于用户需要监控网络诊断任务执行状态、及时发现和处理超时问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的项目ID和诊断作业ID。调用该接口后，系统将返回与诊断作业相关的超时告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobProxyResponseDelimitRequest 请求对象
     * @return SyncInvoker<ListNetworkDiagnosisJobProxyResponseDelimitRequest, ListNetworkDiagnosisJobProxyResponseDelimitResponse>
     */
    public SyncInvoker<ListNetworkDiagnosisJobProxyResponseDelimitRequest, ListNetworkDiagnosisJobProxyResponseDelimitResponse> listNetworkDiagnosisJobProxyResponseDelimitInvoker(
        ListNetworkDiagnosisJobProxyResponseDelimitRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listNetworkDiagnosisJobProxyResponseDelimit, hcClient);
    }

    /**
     * 查询网络诊断作业列表
     *
     * 查询网络诊断作业列表接口用于获取所有网络诊断作业的详细信息，包括作业ID、状态、创建时间等。该接口适用于以下场景：用户需要监控网络诊断作业的运行状态、管理多个诊断任务或查看历史诊断记录。使用该接口的前提条件是用户已具备查询权限，并提供有效的项目ID。调用该接口后，用户将获得网络诊断作业的列表信息，便于进一步管理和分析。若项目ID无效或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobsRequest 请求对象
     * @return ListNetworkDiagnosisJobsResponse
     */
    public ListNetworkDiagnosisJobsResponse listNetworkDiagnosisJobs(ListNetworkDiagnosisJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listNetworkDiagnosisJobs);
    }

    /**
     * 查询网络诊断作业列表
     *
     * 查询网络诊断作业列表接口用于获取所有网络诊断作业的详细信息，包括作业ID、状态、创建时间等。该接口适用于以下场景：用户需要监控网络诊断作业的运行状态、管理多个诊断任务或查看历史诊断记录。使用该接口的前提条件是用户已具备查询权限，并提供有效的项目ID。调用该接口后，用户将获得网络诊断作业的列表信息，便于进一步管理和分析。若项目ID无效或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobsRequest 请求对象
     * @return SyncInvoker<ListNetworkDiagnosisJobsRequest, ListNetworkDiagnosisJobsResponse>
     */
    public SyncInvoker<ListNetworkDiagnosisJobsRequest, ListNetworkDiagnosisJobsResponse> listNetworkDiagnosisJobsInvoker(
        ListNetworkDiagnosisJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listNetworkDiagnosisJobs, hcClient);
    }

    /**
     * 查询profiling诊断作业列表
     *
     * 查询profiling诊断作业列表接口用于获取指定工作空间下的profiling诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个profiling诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个profiling诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得profiling诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilingDiagnosisJobsRequest 请求对象
     * @return ListProfilingDiagnosisJobsResponse
     */
    public ListProfilingDiagnosisJobsResponse listProfilingDiagnosisJobs(ListProfilingDiagnosisJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listProfilingDiagnosisJobs);
    }

    /**
     * 查询profiling诊断作业列表
     *
     * 查询profiling诊断作业列表接口用于获取指定工作空间下的profiling诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个profiling诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个profiling诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得profiling诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilingDiagnosisJobsRequest 请求对象
     * @return SyncInvoker<ListProfilingDiagnosisJobsRequest, ListProfilingDiagnosisJobsResponse>
     */
    public SyncInvoker<ListProfilingDiagnosisJobsRequest, ListProfilingDiagnosisJobsResponse> listProfilingDiagnosisJobsInvoker(
        ListProfilingDiagnosisJobsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listProfilingDiagnosisJobs, hcClient);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return ListScheduledEventsResponse
     */
    public ListScheduledEventsResponse listScheduledEvents(ListScheduledEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.listScheduledEvents);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return SyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse>
     */
    public SyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEventsInvoker(
        ListScheduledEventsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.listScheduledEvents, hcClient);
    }

    /**
     * 查询自动扩缩容策略
     *
     * 获取自动扩缩容策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyDetailRequest 请求对象
     * @return ShowAutoScalingPolicyDetailResponse
     */
    public ShowAutoScalingPolicyDetailResponse showAutoScalingPolicyDetail(ShowAutoScalingPolicyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showAutoScalingPolicyDetail);
    }

    /**
     * 查询自动扩缩容策略
     *
     * 获取自动扩缩容策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyDetailRequest 请求对象
     * @return SyncInvoker<ShowAutoScalingPolicyDetailRequest, ShowAutoScalingPolicyDetailResponse>
     */
    public SyncInvoker<ShowAutoScalingPolicyDetailRequest, ShowAutoScalingPolicyDetailResponse> showAutoScalingPolicyDetailInvoker(
        ShowAutoScalingPolicyDetailRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showAutoScalingPolicyDetail, hcClient);
    }

    /**
     * 查询巡检作业详情
     *
     * 查询巡检作业详情接口用于获取指定巡检任务的详细信息，包括任务状态、配置参数、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的执行情况、查看任务结果或分析任务状态。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的详细信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionJobRequest 请求对象
     * @return ShowInspectionJobResponse
     */
    public ShowInspectionJobResponse showInspectionJob(ShowInspectionJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInspectionJob);
    }

    /**
     * 查询巡检作业详情
     *
     * 查询巡检作业详情接口用于获取指定巡检任务的详细信息，包括任务状态、配置参数、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的执行情况、查看任务结果或分析任务状态。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的详细信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionJobRequest 请求对象
     * @return SyncInvoker<ShowInspectionJobRequest, ShowInspectionJobResponse>
     */
    public SyncInvoker<ShowInspectionJobRequest, ShowInspectionJobResponse> showInspectionJobInvoker(
        ShowInspectionJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInspectionJob, hcClient);
    }

    /**
     * 查询巡检作业统计信息
     *
     * 查询巡检作业统计信息接口用于获取指定巡检任务的统计数据，包括任务完成情况、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的整体执行情况、分析任务完成率或查看历史统计数据。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的统计信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionStatisticsRequest 请求对象
     * @return ShowInspectionStatisticsResponse
     */
    public ShowInspectionStatisticsResponse showInspectionStatistics(ShowInspectionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showInspectionStatistics);
    }

    /**
     * 查询巡检作业统计信息
     *
     * 查询巡检作业统计信息接口用于获取指定巡检任务的统计数据，包括任务完成情况、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的整体执行情况、分析任务完成率或查看历史统计数据。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的统计信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionStatisticsRequest 请求对象
     * @return SyncInvoker<ShowInspectionStatisticsRequest, ShowInspectionStatisticsResponse>
     */
    public SyncInvoker<ShowInspectionStatisticsRequest, ShowInspectionStatisticsResponse> showInspectionStatisticsInvoker(
        ShowInspectionStatisticsRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showInspectionStatistics, hcClient);
    }

    /**
     * 查询日志诊断作业详情
     *
     * 查询日志诊断作业详情接口用于获取指定日志诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控日志诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobRequest 请求对象
     * @return ShowLogDiagnosisJobResponse
     */
    public ShowLogDiagnosisJobResponse showLogDiagnosisJob(ShowLogDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showLogDiagnosisJob);
    }

    /**
     * 查询日志诊断作业详情
     *
     * 查询日志诊断作业详情接口用于获取指定日志诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控日志诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobRequest 请求对象
     * @return SyncInvoker<ShowLogDiagnosisJobRequest, ShowLogDiagnosisJobResponse>
     */
    public SyncInvoker<ShowLogDiagnosisJobRequest, ShowLogDiagnosisJobResponse> showLogDiagnosisJobInvoker(
        ShowLogDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showLogDiagnosisJob, hcClient);
    }

    /**
     * 查询日志诊断作业诊断结果
     *
     * 查询日志诊断作业诊断结果接口用于获取指定日志诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解日志诊断作业的分析结果、优化训练作业性能或解决问题。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobResultRequest 请求对象
     * @return ShowLogDiagnosisJobResultResponse
     */
    public ShowLogDiagnosisJobResultResponse showLogDiagnosisJobResult(ShowLogDiagnosisJobResultRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showLogDiagnosisJobResult);
    }

    /**
     * 查询日志诊断作业诊断结果
     *
     * 查询日志诊断作业诊断结果接口用于获取指定日志诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解日志诊断作业的分析结果、优化训练作业性能或解决问题。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobResultRequest 请求对象
     * @return SyncInvoker<ShowLogDiagnosisJobResultRequest, ShowLogDiagnosisJobResultResponse>
     */
    public SyncInvoker<ShowLogDiagnosisJobResultRequest, ShowLogDiagnosisJobResultResponse> showLogDiagnosisJobResultInvoker(
        ShowLogDiagnosisJobResultRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showLogDiagnosisJobResult, hcClient);
    }

    /**
     * 查询profiling诊断作业详情
     *
     * 查询profiling诊断作业详情接口用于获取指定profiling诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控profiling诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobRequest 请求对象
     * @return ShowProfilingDiagnosisJobResponse
     */
    public ShowProfilingDiagnosisJobResponse showProfilingDiagnosisJob(ShowProfilingDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showProfilingDiagnosisJob);
    }

    /**
     * 查询profiling诊断作业详情
     *
     * 查询profiling诊断作业详情接口用于获取指定profiling诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控profiling诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobRequest 请求对象
     * @return SyncInvoker<ShowProfilingDiagnosisJobRequest, ShowProfilingDiagnosisJobResponse>
     */
    public SyncInvoker<ShowProfilingDiagnosisJobRequest, ShowProfilingDiagnosisJobResponse> showProfilingDiagnosisJobInvoker(
        ShowProfilingDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showProfilingDiagnosisJob, hcClient);
    }

    /**
     * 查询profiling诊断作业诊断结果
     *
     * 查询profiling诊断作业诊断结果接口用于获取指定profiling诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解profiling诊断作业的分析结果。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobResultRequest 请求对象
     * @return ShowProfilingDiagnosisJobResultResponse
     */
    public ShowProfilingDiagnosisJobResultResponse showProfilingDiagnosisJobResult(
        ShowProfilingDiagnosisJobResultRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.showProfilingDiagnosisJobResult);
    }

    /**
     * 查询profiling诊断作业诊断结果
     *
     * 查询profiling诊断作业诊断结果接口用于获取指定profiling诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解profiling诊断作业的分析结果。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobResultRequest 请求对象
     * @return SyncInvoker<ShowProfilingDiagnosisJobResultRequest, ShowProfilingDiagnosisJobResultResponse>
     */
    public SyncInvoker<ShowProfilingDiagnosisJobResultRequest, ShowProfilingDiagnosisJobResultResponse> showProfilingDiagnosisJobResultInvoker(
        ShowProfilingDiagnosisJobResultRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.showProfilingDiagnosisJobResult, hcClient);
    }

    /**
     * 终止巡检作业
     *
     * 终止巡检作业接口用于停止正在巡检中的作业。该接口适用于以下场景：当巡检作业在巡检中时，用户可通过此接口终止指定的巡检作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInspectionJobRequest 请求对象
     * @return StopInspectionJobResponse
     */
    public StopInspectionJobResponse stopInspectionJob(StopInspectionJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopInspectionJob);
    }

    /**
     * 终止巡检作业
     *
     * 终止巡检作业接口用于停止正在巡检中的作业。该接口适用于以下场景：当巡检作业在巡检中时，用户可通过此接口终止指定的巡检作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInspectionJobRequest 请求对象
     * @return SyncInvoker<StopInspectionJobRequest, StopInspectionJobResponse>
     */
    public SyncInvoker<StopInspectionJobRequest, StopInspectionJobResponse> stopInspectionJobInvoker(
        StopInspectionJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopInspectionJob, hcClient);
    }

    /**
     * 终止日志诊断作业
     *
     * 终止日志诊断作业接口用于停止正在诊断中的作业。该接口适用于以下场景：当日志诊断作业在诊断中时，用户可通过此接口终止指定的诊断作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogDiagnosisJobRequest 请求对象
     * @return StopLogDiagnosisJobResponse
     */
    public StopLogDiagnosisJobResponse stopLogDiagnosisJob(StopLogDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopLogDiagnosisJob);
    }

    /**
     * 终止日志诊断作业
     *
     * 终止日志诊断作业接口用于停止正在诊断中的作业。该接口适用于以下场景：当日志诊断作业在诊断中时，用户可通过此接口终止指定的诊断作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopLogDiagnosisJobRequest 请求对象
     * @return SyncInvoker<StopLogDiagnosisJobRequest, StopLogDiagnosisJobResponse>
     */
    public SyncInvoker<StopLogDiagnosisJobRequest, StopLogDiagnosisJobResponse> stopLogDiagnosisJobInvoker(
        StopLogDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopLogDiagnosisJob, hcClient);
    }

    /**
     * 终止profiling诊断作业
     *
     * 终止profiling诊断作业接口用于停止正在诊断中的作业。该接口适用于以下场景：当profiling诊断作业在诊断中时，用户可通过此接口终止指定的诊断作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProfilingDiagnosisJobRequest 请求对象
     * @return StopProfilingDiagnosisJobResponse
     */
    public StopProfilingDiagnosisJobResponse stopProfilingDiagnosisJob(StopProfilingDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.stopProfilingDiagnosisJob);
    }

    /**
     * 终止profiling诊断作业
     *
     * 终止profiling诊断作业接口用于停止正在诊断中的作业。该接口适用于以下场景：当profiling诊断作业在诊断中时，用户可通过此接口终止指定的诊断作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProfilingDiagnosisJobRequest 请求对象
     * @return SyncInvoker<StopProfilingDiagnosisJobRequest, StopProfilingDiagnosisJobResponse>
     */
    public SyncInvoker<StopProfilingDiagnosisJobRequest, StopProfilingDiagnosisJobResponse> stopProfilingDiagnosisJobInvoker(
        StopProfilingDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.stopProfilingDiagnosisJob, hcClient);
    }

    /**
     * 更新自动扩缩容
     *
     * 更新自动扩缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return UpdateAutoScalingPolicyResponse
     */
    public UpdateAutoScalingPolicyResponse updateAutoScalingPolicy(UpdateAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateAutoScalingPolicy);
    }

    /**
     * 更新自动扩缩容
     *
     * 更新自动扩缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse>
     */
    public SyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicyInvoker(
        UpdateAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateAutoScalingPolicy, hcClient);
    }

    /**
     * 更新巡检作业
     *
     * 更新巡检作业功能允许用户对已创建的巡检作业信息进行更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInspectionJobRequest 请求对象
     * @return UpdateInspectionJobResponse
     */
    public UpdateInspectionJobResponse updateInspectionJob(UpdateInspectionJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateInspectionJob);
    }

    /**
     * 更新巡检作业
     *
     * 更新巡检作业功能允许用户对已创建的巡检作业信息进行更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInspectionJobRequest 请求对象
     * @return SyncInvoker<UpdateInspectionJobRequest, UpdateInspectionJobResponse>
     */
    public SyncInvoker<UpdateInspectionJobRequest, UpdateInspectionJobResponse> updateInspectionJobInvoker(
        UpdateInspectionJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateInspectionJob, hcClient);
    }

    /**
     * 更新日志诊断作业
     *
     * 更新日志诊断作业接口用于用户更新已有日志诊断作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogDiagnosisJobRequest 请求对象
     * @return UpdateLogDiagnosisJobResponse
     */
    public UpdateLogDiagnosisJobResponse updateLogDiagnosisJob(UpdateLogDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateLogDiagnosisJob);
    }

    /**
     * 更新日志诊断作业
     *
     * 更新日志诊断作业接口用于用户更新已有日志诊断作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogDiagnosisJobRequest 请求对象
     * @return SyncInvoker<UpdateLogDiagnosisJobRequest, UpdateLogDiagnosisJobResponse>
     */
    public SyncInvoker<UpdateLogDiagnosisJobRequest, UpdateLogDiagnosisJobResponse> updateLogDiagnosisJobInvoker(
        UpdateLogDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateLogDiagnosisJob, hcClient);
    }

    /**
     * 更新profiling诊断作业信息
     *
     * 更新profiling诊断作业描述用于用户更新已有作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProfilingDiagnosisJobRequest 请求对象
     * @return UpdateProfilingDiagnosisJobResponse
     */
    public UpdateProfilingDiagnosisJobResponse updateProfilingDiagnosisJob(UpdateProfilingDiagnosisJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModelArtsMeta.updateProfilingDiagnosisJob);
    }

    /**
     * 更新profiling诊断作业信息
     *
     * 更新profiling诊断作业描述用于用户更新已有作业的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProfilingDiagnosisJobRequest 请求对象
     * @return SyncInvoker<UpdateProfilingDiagnosisJobRequest, UpdateProfilingDiagnosisJobResponse>
     */
    public SyncInvoker<UpdateProfilingDiagnosisJobRequest, UpdateProfilingDiagnosisJobResponse> updateProfilingDiagnosisJobInvoker(
        UpdateProfilingDiagnosisJobRequest request) {
        return new SyncInvoker<>(request, ModelArtsMeta.updateProfilingDiagnosisJob, hcClient);
    }

}

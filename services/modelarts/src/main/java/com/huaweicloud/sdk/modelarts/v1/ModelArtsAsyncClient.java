package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.modelarts.v1.model.ListFeaturesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListFeaturesResponse;
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
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAutoScalingPolicyResponse;

import java.util.concurrent.CompletableFuture;

public class ModelArtsAsyncClient {

    protected HcClient hcClient;

    public ModelArtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModelArtsAsyncClient> newBuilder() {
        ClientBuilder<ModelArtsAsyncClient> clientBuilder = new ClientBuilder<>(ModelArtsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建自动扩缩容策略
     *
     * 创建自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<CreateAutoScalingPolicyResponse>
     */
    public CompletableFuture<CreateAutoScalingPolicyResponse> createAutoScalingPolicyAsync(
        CreateAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createAutoScalingPolicy);
    }

    /**
     * 创建自动扩缩容策略
     *
     * 创建自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse>
     */
    public AsyncInvoker<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> createAutoScalingPolicyAsyncInvoker(
        CreateAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createAutoScalingPolicy, hcClient);
    }

    /**
     * 创建巡检作业
     *
     * 创建巡检作业功能允许用户根据需求创建标准巡检或深度巡检任务，支持对集群或节点进行巡检。该功能适用于需要定期检查集群或节点健康状态、排查潜在问题或在部署新服务前进行全面检查的场景。使用此功能前，请确保您具备创建巡检作业的权限，并提供有效的巡检对象ID。成功创建后，巡检任务将被下发，收集主机配置和状态、NPU驱动配置和状态、网络状态等信息，并进行AICore压测、HBM压测等。巡检结果将存储在指定位置，供后续查询和分析。若权限不足、巡检对象ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInspectionJobRequest 请求对象
     * @return CompletableFuture<CreateInspectionJobResponse>
     */
    public CompletableFuture<CreateInspectionJobResponse> createInspectionJobAsync(CreateInspectionJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createInspectionJob);
    }

    /**
     * 创建巡检作业
     *
     * 创建巡检作业功能允许用户根据需求创建标准巡检或深度巡检任务，支持对集群或节点进行巡检。该功能适用于需要定期检查集群或节点健康状态、排查潜在问题或在部署新服务前进行全面检查的场景。使用此功能前，请确保您具备创建巡检作业的权限，并提供有效的巡检对象ID。成功创建后，巡检任务将被下发，收集主机配置和状态、NPU驱动配置和状态、网络状态等信息，并进行AICore压测、HBM压测等。巡检结果将存储在指定位置，供后续查询和分析。若权限不足、巡检对象ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInspectionJobRequest 请求对象
     * @return AsyncInvoker<CreateInspectionJobRequest, CreateInspectionJobResponse>
     */
    public AsyncInvoker<CreateInspectionJobRequest, CreateInspectionJobResponse> createInspectionJobAsyncInvoker(
        CreateInspectionJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createInspectionJob, hcClient);
    }

    /**
     * 创建日志诊断作业
     *
     * 创建日志诊断作业接口用于通过CSS（Cloud Search Service）完成训练作业日志的导入和分析，提升日志查询效率和问题定位效率。该接口适用于以下场景：用户需要快速分析训练作业的日志以定位问题、优化训练作业性能或监控训练过程。使用该接口的前提条件是训练作业已存在且用户具有相应的权限，同时日志存储路径需正确且可访问。调用该接口后，系统将创建一个日志诊断作业，开始导入和分析日志数据。若日志路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogDiagnosisJobRequest 请求对象
     * @return CompletableFuture<CreateLogDiagnosisJobResponse>
     */
    public CompletableFuture<CreateLogDiagnosisJobResponse> createLogDiagnosisJobAsync(
        CreateLogDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createLogDiagnosisJob);
    }

    /**
     * 创建日志诊断作业
     *
     * 创建日志诊断作业接口用于通过CSS（Cloud Search Service）完成训练作业日志的导入和分析，提升日志查询效率和问题定位效率。该接口适用于以下场景：用户需要快速分析训练作业的日志以定位问题、优化训练作业性能或监控训练过程。使用该接口的前提条件是训练作业已存在且用户具有相应的权限，同时日志存储路径需正确且可访问。调用该接口后，系统将创建一个日志诊断作业，开始导入和分析日志数据。若日志路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<CreateLogDiagnosisJobRequest, CreateLogDiagnosisJobResponse>
     */
    public AsyncInvoker<CreateLogDiagnosisJobRequest, CreateLogDiagnosisJobResponse> createLogDiagnosisJobAsyncInvoker(
        CreateLogDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createLogDiagnosisJob, hcClient);
    }

    /**
     * 创建网络大脑参数面诊断作业
     *
     * 创建网络大脑参数面诊断作业接口用于启动网络诊断任务，支持通过作业ID或选择特定节点进行网络拓扑还原、交换机告警筛选、KPI分析，从而定位网络问题并查看相关信息。该接口适用于以下场景：用户需要诊断网络性能问题、排查网络连接异常或分析网络设备告警。使用该接口的前提条件是用户已具备诊断权限，并提供有效的作业ID或节点信息。调用该接口后，系统将生成诊断报告，帮助用户快速定位问题。若作业ID无效或节点信息错误，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkParameterDiagnosisJobRequest 请求对象
     * @return CompletableFuture<CreateNetworkParameterDiagnosisJobResponse>
     */
    public CompletableFuture<CreateNetworkParameterDiagnosisJobResponse> createNetworkParameterDiagnosisJobAsync(
        CreateNetworkParameterDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createNetworkParameterDiagnosisJob);
    }

    /**
     * 创建网络大脑参数面诊断作业
     *
     * 创建网络大脑参数面诊断作业接口用于启动网络诊断任务，支持通过作业ID或选择特定节点进行网络拓扑还原、交换机告警筛选、KPI分析，从而定位网络问题并查看相关信息。该接口适用于以下场景：用户需要诊断网络性能问题、排查网络连接异常或分析网络设备告警。使用该接口的前提条件是用户已具备诊断权限，并提供有效的作业ID或节点信息。调用该接口后，系统将生成诊断报告，帮助用户快速定位问题。若作业ID无效或节点信息错误，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNetworkParameterDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<CreateNetworkParameterDiagnosisJobRequest, CreateNetworkParameterDiagnosisJobResponse>
     */
    public AsyncInvoker<CreateNetworkParameterDiagnosisJobRequest, CreateNetworkParameterDiagnosisJobResponse> createNetworkParameterDiagnosisJobAsyncInvoker(
        CreateNetworkParameterDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createNetworkParameterDiagnosisJob, hcClient);
    }

    /**
     * 创建profiling诊断作业
     *
     * 创建profiling诊断作业用于通过分析profiling性能数据文件*_ascend_pt或*_ascend_ms目录，提升性能问题定位效率。该接口适用于以下场景：用户需要快速分析profiling性能文件以定位慢卡慢节点等性能问题。使用该接口的前提条件是用户将profiling性能数据文件按指定格式组织，同时组织路径可访问。调用该接口后，系统将创建一个profiling诊断作业，开始分析profiling性能数据。若路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProfilingDiagnosisJobRequest 请求对象
     * @return CompletableFuture<CreateProfilingDiagnosisJobResponse>
     */
    public CompletableFuture<CreateProfilingDiagnosisJobResponse> createProfilingDiagnosisJobAsync(
        CreateProfilingDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.createProfilingDiagnosisJob);
    }

    /**
     * 创建profiling诊断作业
     *
     * 创建profiling诊断作业用于通过分析profiling性能数据文件*_ascend_pt或*_ascend_ms目录，提升性能问题定位效率。该接口适用于以下场景：用户需要快速分析profiling性能文件以定位慢卡慢节点等性能问题。使用该接口的前提条件是用户将profiling性能数据文件按指定格式组织，同时组织路径可访问。调用该接口后，系统将创建一个profiling诊断作业，开始分析profiling性能数据。若路径不存在、权限不足或诊断作业创建失败，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProfilingDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<CreateProfilingDiagnosisJobRequest, CreateProfilingDiagnosisJobResponse>
     */
    public AsyncInvoker<CreateProfilingDiagnosisJobRequest, CreateProfilingDiagnosisJobResponse> createProfilingDiagnosisJobAsyncInvoker(
        CreateProfilingDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.createProfilingDiagnosisJob, hcClient);
    }

    /**
     * 删除自动扩缩容
     *
     * 删除自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<DeleteAutoScalingPolicyResponse>
     */
    public CompletableFuture<DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicyAsync(
        DeleteAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteAutoScalingPolicy);
    }

    /**
     * 删除自动扩缩容
     *
     * 删除自动扩缩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse>
     */
    public AsyncInvoker<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicyAsyncInvoker(
        DeleteAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteAutoScalingPolicy, hcClient);
    }

    /**
     * 删除巡检作业
     *
     * 删除巡检作业接口用于移除已创建的巡检任务。该接口适用于以下场景：当巡检任务完成、配置错误或需要清理资源时，用户可通过此接口删除指定的巡检作业。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。删除操作完成后，巡检作业将被永久移除，相关资源和配置也将被清理。若巡检作业不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInspectionJobRequest 请求对象
     * @return CompletableFuture<DeleteInspectionJobResponse>
     */
    public CompletableFuture<DeleteInspectionJobResponse> deleteInspectionJobAsync(DeleteInspectionJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteInspectionJob);
    }

    /**
     * 删除巡检作业
     *
     * 删除巡检作业接口用于移除已创建的巡检任务。该接口适用于以下场景：当巡检任务完成、配置错误或需要清理资源时，用户可通过此接口删除指定的巡检作业。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。删除操作完成后，巡检作业将被永久移除，相关资源和配置也将被清理。若巡检作业不存在或用户无权限操作，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInspectionJobRequest 请求对象
     * @return AsyncInvoker<DeleteInspectionJobRequest, DeleteInspectionJobResponse>
     */
    public AsyncInvoker<DeleteInspectionJobRequest, DeleteInspectionJobResponse> deleteInspectionJobAsyncInvoker(
        DeleteInspectionJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteInspectionJob, hcClient);
    }

    /**
     * 删除日志诊断作业
     *
     * 删除日志诊断作业用于移除系统中已创建的日志诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogDiagnosisJobRequest 请求对象
     * @return CompletableFuture<DeleteLogDiagnosisJobResponse>
     */
    public CompletableFuture<DeleteLogDiagnosisJobResponse> deleteLogDiagnosisJobAsync(
        DeleteLogDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteLogDiagnosisJob);
    }

    /**
     * 删除日志诊断作业
     *
     * 删除日志诊断作业用于移除系统中已创建的日志诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<DeleteLogDiagnosisJobRequest, DeleteLogDiagnosisJobResponse>
     */
    public AsyncInvoker<DeleteLogDiagnosisJobRequest, DeleteLogDiagnosisJobResponse> deleteLogDiagnosisJobAsyncInvoker(
        DeleteLogDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteLogDiagnosisJob, hcClient);
    }

    /**
     * 删除网络诊断作业
     *
     * 删除网络诊断作业接口用于删除指定的网络诊断作业，适用于用户在完成诊断任务后需要清理资源的场景。使用该接口的前提条件是用户具有删除权限，并且目标诊断作业已处于可删除状态。调用该接口后，系统将删除指定的诊断作业，释放相关资源。若用户无权限或诊断作业不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkDiagnosisJobRequest 请求对象
     * @return CompletableFuture<DeleteNetworkDiagnosisJobResponse>
     */
    public CompletableFuture<DeleteNetworkDiagnosisJobResponse> deleteNetworkDiagnosisJobAsync(
        DeleteNetworkDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteNetworkDiagnosisJob);
    }

    /**
     * 删除网络诊断作业
     *
     * 删除网络诊断作业接口用于删除指定的网络诊断作业，适用于用户在完成诊断任务后需要清理资源的场景。使用该接口的前提条件是用户具有删除权限，并且目标诊断作业已处于可删除状态。调用该接口后，系统将删除指定的诊断作业，释放相关资源。若用户无权限或诊断作业不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNetworkDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<DeleteNetworkDiagnosisJobRequest, DeleteNetworkDiagnosisJobResponse>
     */
    public AsyncInvoker<DeleteNetworkDiagnosisJobRequest, DeleteNetworkDiagnosisJobResponse> deleteNetworkDiagnosisJobAsyncInvoker(
        DeleteNetworkDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteNetworkDiagnosisJob, hcClient);
    }

    /**
     * 删除profiling诊断作业
     *
     * 删除profiling诊断作业用于移除系统中已创建的profiling诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfilingDiagnosisJobRequest 请求对象
     * @return CompletableFuture<DeleteProfilingDiagnosisJobResponse>
     */
    public CompletableFuture<DeleteProfilingDiagnosisJobResponse> deleteProfilingDiagnosisJobAsync(
        DeleteProfilingDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.deleteProfilingDiagnosisJob);
    }

    /**
     * 删除profiling诊断作业
     *
     * 删除profiling诊断作业用于移除系统中已创建的profiling诊断任务，适用于任务完成、错误创建或需要重新设计等场景。使用该功能前需确保用户具有删除权限，且待删除任务未处于执行状态。删除成功后，任务及其相关数据将被移除，并记录操作日志。若出现权限不足、任务不存在或执行中等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProfilingDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<DeleteProfilingDiagnosisJobRequest, DeleteProfilingDiagnosisJobResponse>
     */
    public AsyncInvoker<DeleteProfilingDiagnosisJobRequest, DeleteProfilingDiagnosisJobResponse> deleteProfilingDiagnosisJobAsyncInvoker(
        DeleteProfilingDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.deleteProfilingDiagnosisJob, hcClient);
    }

    /**
     * 查询自动扩缩容策略列表
     *
     * 查询自动扩缩容策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoScalingPolicyDetailsRequest 请求对象
     * @return CompletableFuture<ListAutoScalingPolicyDetailsResponse>
     */
    public CompletableFuture<ListAutoScalingPolicyDetailsResponse> listAutoScalingPolicyDetailsAsync(
        ListAutoScalingPolicyDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listAutoScalingPolicyDetails);
    }

    /**
     * 查询自动扩缩容策略列表
     *
     * 查询自动扩缩容策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoScalingPolicyDetailsRequest 请求对象
     * @return AsyncInvoker<ListAutoScalingPolicyDetailsRequest, ListAutoScalingPolicyDetailsResponse>
     */
    public AsyncInvoker<ListAutoScalingPolicyDetailsRequest, ListAutoScalingPolicyDetailsResponse> listAutoScalingPolicyDetailsAsyncInvoker(
        ListAutoScalingPolicyDetailsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listAutoScalingPolicyDetails, hcClient);
    }

    /**
     * 查询用户支持特性
     *
     * 查询用户支持特性接口用于获取当前用户可使用的特性功能列表，适用于用户需要了解自身权限范围、规划服务功能或申请新特性白名单的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的项目ID。调用该接口后，系统将返回用户当前支持的特性功能列表，帮助用户更好地管理和使用服务。若用户无权限、项目ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return CompletableFuture<ListFeaturesResponse>
     */
    public CompletableFuture<ListFeaturesResponse> listFeaturesAsync(ListFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listFeatures);
    }

    /**
     * 查询用户支持特性
     *
     * 查询用户支持特性接口用于获取当前用户可使用的特性功能列表，适用于用户需要了解自身权限范围、规划服务功能或申请新特性白名单的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的项目ID。调用该接口后，系统将返回用户当前支持的特性功能列表，帮助用户更好地管理和使用服务。若用户无权限、项目ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse>
     */
    public AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse> listFeaturesAsyncInvoker(
        ListFeaturesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listFeatures, hcClient);
    }

    /**
     * 查询巡检项列表
     *
     * 查询巡检项列表用于获取系统中已定义的巡检检查项信息，适用于查看特定任务的检查内容、创建或修改任务时选择检查项，以及根据设备类型或区域筛选巡检项等场景。使用该功能前需确保用户具有查询权限，且系统中存在巡检项数据。查询成功后，系统返回巡检项的详细列表，并记录操作日志。若出现权限不足、参数错误或资源不存在等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionItemsRequest 请求对象
     * @return CompletableFuture<ListInspectionItemsResponse>
     */
    public CompletableFuture<ListInspectionItemsResponse> listInspectionItemsAsync(ListInspectionItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listInspectionItems);
    }

    /**
     * 查询巡检项列表
     *
     * 查询巡检项列表用于获取系统中已定义的巡检检查项信息，适用于查看特定任务的检查内容、创建或修改任务时选择检查项，以及根据设备类型或区域筛选巡检项等场景。使用该功能前需确保用户具有查询权限，且系统中存在巡检项数据。查询成功后，系统返回巡检项的详细列表，并记录操作日志。若出现权限不足、参数错误或资源不存在等情况，系统将返回相应错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionItemsRequest 请求对象
     * @return AsyncInvoker<ListInspectionItemsRequest, ListInspectionItemsResponse>
     */
    public AsyncInvoker<ListInspectionItemsRequest, ListInspectionItemsResponse> listInspectionItemsAsyncInvoker(
        ListInspectionItemsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listInspectionItems, hcClient);
    }

    /**
     * 查询巡检作业列表
     *
     * 查询巡检作业列表功能允许用户根据需求查询已创建的巡检作业列表。该功能适用于需要监控巡检作业状态、管理巡检任务或查看巡检结果的场景。使用此功能前，请确保您具备查询巡检作业的权限，并提供有效的项目ID。成功调用后，将返回符合条件的巡检作业列表，包括作业总数、当前页的作业数量以及每个作业的详细信息。若权限不足、项目ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionJobsRequest 请求对象
     * @return CompletableFuture<ListInspectionJobsResponse>
     */
    public CompletableFuture<ListInspectionJobsResponse> listInspectionJobsAsync(ListInspectionJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listInspectionJobs);
    }

    /**
     * 查询巡检作业列表
     *
     * 查询巡检作业列表功能允许用户根据需求查询已创建的巡检作业列表。该功能适用于需要监控巡检作业状态、管理巡检任务或查看巡检结果的场景。使用此功能前，请确保您具备查询巡检作业的权限，并提供有效的项目ID。成功调用后，将返回符合条件的巡检作业列表，包括作业总数、当前页的作业数量以及每个作业的详细信息。若权限不足、项目ID无效或系统内部出现错误，将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionJobsRequest 请求对象
     * @return AsyncInvoker<ListInspectionJobsRequest, ListInspectionJobsResponse>
     */
    public AsyncInvoker<ListInspectionJobsRequest, ListInspectionJobsResponse> listInspectionJobsAsyncInvoker(
        ListInspectionJobsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listInspectionJobs, hcClient);
    }

    /**
     * 查询巡检节点列表
     *
     * 查询巡检节点列表接口用于获取指定巡检任务的节点信息，包括节点状态、资源使用情况等。该接口适用于以下场景：用户需要监控巡检任务的节点状态、查看节点资源分配情况或分析节点执行情况。使用该接口的前提条件是巡检任务已创建且用户具有管理员权限。调用该接口后，用户将获得巡检节点的详细信息，便于进一步分析或处理。若巡检任务不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionNodesRequest 请求对象
     * @return CompletableFuture<ListInspectionNodesResponse>
     */
    public CompletableFuture<ListInspectionNodesResponse> listInspectionNodesAsync(ListInspectionNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listInspectionNodes);
    }

    /**
     * 查询巡检节点列表
     *
     * 查询巡检节点列表接口用于获取指定巡检任务的节点信息，包括节点状态、资源使用情况等。该接口适用于以下场景：用户需要监控巡检任务的节点状态、查看节点资源分配情况或分析节点执行情况。使用该接口的前提条件是巡检任务已创建且用户具有管理员权限。调用该接口后，用户将获得巡检节点的详细信息，便于进一步分析或处理。若巡检任务不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionNodesRequest 请求对象
     * @return AsyncInvoker<ListInspectionNodesRequest, ListInspectionNodesResponse>
     */
    public AsyncInvoker<ListInspectionNodesRequest, ListInspectionNodesResponse> listInspectionNodesAsyncInvoker(
        ListInspectionNodesRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listInspectionNodes, hcClient);
    }

    /**
     * 查询日志诊断作业列表
     *
     * 查询日志诊断作业列表接口用于获取指定工作空间下的日志诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个日志诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个日志诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得日志诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogDiagnosisJobsRequest 请求对象
     * @return CompletableFuture<ListLogDiagnosisJobsResponse>
     */
    public CompletableFuture<ListLogDiagnosisJobsResponse> listLogDiagnosisJobsAsync(
        ListLogDiagnosisJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listLogDiagnosisJobs);
    }

    /**
     * 查询日志诊断作业列表
     *
     * 查询日志诊断作业列表接口用于获取指定工作空间下的日志诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个日志诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个日志诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得日志诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogDiagnosisJobsRequest 请求对象
     * @return AsyncInvoker<ListLogDiagnosisJobsRequest, ListLogDiagnosisJobsResponse>
     */
    public AsyncInvoker<ListLogDiagnosisJobsRequest, ListLogDiagnosisJobsResponse> listLogDiagnosisJobsAsyncInvoker(
        ListLogDiagnosisJobsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listLogDiagnosisJobs, hcClient);
    }

    /**
     * 查询网络诊断作业告警
     *
     * 查询网络诊断作业告警接口用于获取指定网络诊断作业的告警信息，适用于用户需要监控网络诊断任务中的异常情况或排查网络问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的作业ID或筛选条件。调用该接口后，系统将返回与诊断作业相关的告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobAlarmRequest 请求对象
     * @return CompletableFuture<ListNetworkDiagnosisJobAlarmResponse>
     */
    public CompletableFuture<ListNetworkDiagnosisJobAlarmResponse> listNetworkDiagnosisJobAlarmAsync(
        ListNetworkDiagnosisJobAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listNetworkDiagnosisJobAlarm);
    }

    /**
     * 查询网络诊断作业告警
     *
     * 查询网络诊断作业告警接口用于获取指定网络诊断作业的告警信息，适用于用户需要监控网络诊断任务中的异常情况或排查网络问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的作业ID或筛选条件。调用该接口后，系统将返回与诊断作业相关的告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobAlarmRequest 请求对象
     * @return AsyncInvoker<ListNetworkDiagnosisJobAlarmRequest, ListNetworkDiagnosisJobAlarmResponse>
     */
    public AsyncInvoker<ListNetworkDiagnosisJobAlarmRequest, ListNetworkDiagnosisJobAlarmResponse> listNetworkDiagnosisJobAlarmAsyncInvoker(
        ListNetworkDiagnosisJobAlarmRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listNetworkDiagnosisJobAlarm, hcClient);
    }

    /**
     * 查询网络诊断作业超时代答列表
     *
     * 查询网络诊断作业超时代答列表接口用于获取指定网络诊断作业中超时的告警信息，适用于用户需要监控网络诊断任务执行状态、及时发现和处理超时问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的项目ID和诊断作业ID。调用该接口后，系统将返回与诊断作业相关的超时告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobProxyResponseDelimitRequest 请求对象
     * @return CompletableFuture<ListNetworkDiagnosisJobProxyResponseDelimitResponse>
     */
    public CompletableFuture<ListNetworkDiagnosisJobProxyResponseDelimitResponse> listNetworkDiagnosisJobProxyResponseDelimitAsync(
        ListNetworkDiagnosisJobProxyResponseDelimitRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listNetworkDiagnosisJobProxyResponseDelimit);
    }

    /**
     * 查询网络诊断作业超时代答列表
     *
     * 查询网络诊断作业超时代答列表接口用于获取指定网络诊断作业中超时的告警信息，适用于用户需要监控网络诊断任务执行状态、及时发现和处理超时问题的场景。使用该接口的前提条件是用户具备查询权限，并提供有效的项目ID和诊断作业ID。调用该接口后，系统将返回与诊断作业相关的超时告警信息，包括告警级别、时间、描述等内容，帮助用户快速定位和处理问题。若用户无权限、作业ID无效或网络资源不可用，接口将返回相应的错误提示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobProxyResponseDelimitRequest 请求对象
     * @return AsyncInvoker<ListNetworkDiagnosisJobProxyResponseDelimitRequest, ListNetworkDiagnosisJobProxyResponseDelimitResponse>
     */
    public AsyncInvoker<ListNetworkDiagnosisJobProxyResponseDelimitRequest, ListNetworkDiagnosisJobProxyResponseDelimitResponse> listNetworkDiagnosisJobProxyResponseDelimitAsyncInvoker(
        ListNetworkDiagnosisJobProxyResponseDelimitRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listNetworkDiagnosisJobProxyResponseDelimit, hcClient);
    }

    /**
     * 查询网络诊断作业列表
     *
     * 查询网络诊断作业列表接口用于获取所有网络诊断作业的详细信息，包括作业ID、状态、创建时间等。该接口适用于以下场景：用户需要监控网络诊断作业的运行状态、管理多个诊断任务或查看历史诊断记录。使用该接口的前提条件是用户已具备查询权限，并提供有效的项目ID。调用该接口后，用户将获得网络诊断作业的列表信息，便于进一步管理和分析。若项目ID无效或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobsRequest 请求对象
     * @return CompletableFuture<ListNetworkDiagnosisJobsResponse>
     */
    public CompletableFuture<ListNetworkDiagnosisJobsResponse> listNetworkDiagnosisJobsAsync(
        ListNetworkDiagnosisJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listNetworkDiagnosisJobs);
    }

    /**
     * 查询网络诊断作业列表
     *
     * 查询网络诊断作业列表接口用于获取所有网络诊断作业的详细信息，包括作业ID、状态、创建时间等。该接口适用于以下场景：用户需要监控网络诊断作业的运行状态、管理多个诊断任务或查看历史诊断记录。使用该接口的前提条件是用户已具备查询权限，并提供有效的项目ID。调用该接口后，用户将获得网络诊断作业的列表信息，便于进一步管理和分析。若项目ID无效或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDiagnosisJobsRequest 请求对象
     * @return AsyncInvoker<ListNetworkDiagnosisJobsRequest, ListNetworkDiagnosisJobsResponse>
     */
    public AsyncInvoker<ListNetworkDiagnosisJobsRequest, ListNetworkDiagnosisJobsResponse> listNetworkDiagnosisJobsAsyncInvoker(
        ListNetworkDiagnosisJobsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listNetworkDiagnosisJobs, hcClient);
    }

    /**
     * 查询profiling诊断作业列表
     *
     * 查询profiling诊断作业列表接口用于获取指定工作空间下的profiling诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个profiling诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个profiling诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得profiling诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilingDiagnosisJobsRequest 请求对象
     * @return CompletableFuture<ListProfilingDiagnosisJobsResponse>
     */
    public CompletableFuture<ListProfilingDiagnosisJobsResponse> listProfilingDiagnosisJobsAsync(
        ListProfilingDiagnosisJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listProfilingDiagnosisJobs);
    }

    /**
     * 查询profiling诊断作业列表
     *
     * 查询profiling诊断作业列表接口用于获取指定工作空间下的profiling诊断作业信息，包括作业状态、创建时间等。该接口适用于以下场景：用户需要监控多个profiling诊断作业的状态、查看作业执行情况或管理诊断任务。使用该接口的前提条件是用户已创建至少一个profiling诊断作业且具有管理员权限，同时需提供正确的项目ID和工作空间ID。调用该接口后，用户将获得profiling诊断作业的列表信息，便于进一步分析或处理。若用户无权限访问或指定的工作空间不存在，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProfilingDiagnosisJobsRequest 请求对象
     * @return AsyncInvoker<ListProfilingDiagnosisJobsRequest, ListProfilingDiagnosisJobsResponse>
     */
    public AsyncInvoker<ListProfilingDiagnosisJobsRequest, ListProfilingDiagnosisJobsResponse> listProfilingDiagnosisJobsAsyncInvoker(
        ListProfilingDiagnosisJobsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listProfilingDiagnosisJobs, hcClient);
    }

    /**
     * 查询自动扩缩容策略
     *
     * 获取自动扩缩容策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyDetailRequest 请求对象
     * @return CompletableFuture<ShowAutoScalingPolicyDetailResponse>
     */
    public CompletableFuture<ShowAutoScalingPolicyDetailResponse> showAutoScalingPolicyDetailAsync(
        ShowAutoScalingPolicyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showAutoScalingPolicyDetail);
    }

    /**
     * 查询自动扩缩容策略
     *
     * 获取自动扩缩容策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyDetailRequest 请求对象
     * @return AsyncInvoker<ShowAutoScalingPolicyDetailRequest, ShowAutoScalingPolicyDetailResponse>
     */
    public AsyncInvoker<ShowAutoScalingPolicyDetailRequest, ShowAutoScalingPolicyDetailResponse> showAutoScalingPolicyDetailAsyncInvoker(
        ShowAutoScalingPolicyDetailRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showAutoScalingPolicyDetail, hcClient);
    }

    /**
     * 查询巡检作业详情
     *
     * 查询巡检作业详情接口用于获取指定巡检任务的详细信息，包括任务状态、配置参数、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的执行情况、查看任务结果或分析任务状态。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的详细信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionJobRequest 请求对象
     * @return CompletableFuture<ShowInspectionJobResponse>
     */
    public CompletableFuture<ShowInspectionJobResponse> showInspectionJobAsync(ShowInspectionJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showInspectionJob);
    }

    /**
     * 查询巡检作业详情
     *
     * 查询巡检作业详情接口用于获取指定巡检任务的详细信息，包括任务状态、配置参数、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的执行情况、查看任务结果或分析任务状态。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的详细信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionJobRequest 请求对象
     * @return AsyncInvoker<ShowInspectionJobRequest, ShowInspectionJobResponse>
     */
    public AsyncInvoker<ShowInspectionJobRequest, ShowInspectionJobResponse> showInspectionJobAsyncInvoker(
        ShowInspectionJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showInspectionJob, hcClient);
    }

    /**
     * 查询巡检作业统计信息
     *
     * 查询巡检作业统计信息接口用于获取指定巡检任务的统计数据，包括任务完成情况、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的整体执行情况、分析任务完成率或查看历史统计数据。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的统计信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionStatisticsRequest 请求对象
     * @return CompletableFuture<ShowInspectionStatisticsResponse>
     */
    public CompletableFuture<ShowInspectionStatisticsResponse> showInspectionStatisticsAsync(
        ShowInspectionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showInspectionStatistics);
    }

    /**
     * 查询巡检作业统计信息
     *
     * 查询巡检作业统计信息接口用于获取指定巡检任务的统计数据，包括任务完成情况、执行结果等。该接口适用于以下场景：用户需要监控巡检任务的整体执行情况、分析任务完成率或查看历史统计数据。使用该接口的前提条件是巡检作业已存在且用户具有管理员权限。调用该接口后，用户将获得巡检作业的统计信息，便于进一步分析或处理。若巡检作业不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInspectionStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowInspectionStatisticsRequest, ShowInspectionStatisticsResponse>
     */
    public AsyncInvoker<ShowInspectionStatisticsRequest, ShowInspectionStatisticsResponse> showInspectionStatisticsAsyncInvoker(
        ShowInspectionStatisticsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showInspectionStatistics, hcClient);
    }

    /**
     * 查询日志诊断作业详情
     *
     * 查询日志诊断作业详情接口用于获取指定日志诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控日志诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobRequest 请求对象
     * @return CompletableFuture<ShowLogDiagnosisJobResponse>
     */
    public CompletableFuture<ShowLogDiagnosisJobResponse> showLogDiagnosisJobAsync(ShowLogDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showLogDiagnosisJob);
    }

    /**
     * 查询日志诊断作业详情
     *
     * 查询日志诊断作业详情接口用于获取指定日志诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控日志诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<ShowLogDiagnosisJobRequest, ShowLogDiagnosisJobResponse>
     */
    public AsyncInvoker<ShowLogDiagnosisJobRequest, ShowLogDiagnosisJobResponse> showLogDiagnosisJobAsyncInvoker(
        ShowLogDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showLogDiagnosisJob, hcClient);
    }

    /**
     * 查询日志诊断作业诊断结果
     *
     * 查询日志诊断作业诊断结果接口用于获取指定日志诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解日志诊断作业的分析结果、优化训练作业性能或解决问题。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobResultRequest 请求对象
     * @return CompletableFuture<ShowLogDiagnosisJobResultResponse>
     */
    public CompletableFuture<ShowLogDiagnosisJobResultResponse> showLogDiagnosisJobResultAsync(
        ShowLogDiagnosisJobResultRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showLogDiagnosisJobResult);
    }

    /**
     * 查询日志诊断作业诊断结果
     *
     * 查询日志诊断作业诊断结果接口用于获取指定日志诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解日志诊断作业的分析结果、优化训练作业性能或解决问题。使用该接口的前提条件是用户已创建日志诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得日志诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogDiagnosisJobResultRequest 请求对象
     * @return AsyncInvoker<ShowLogDiagnosisJobResultRequest, ShowLogDiagnosisJobResultResponse>
     */
    public AsyncInvoker<ShowLogDiagnosisJobResultRequest, ShowLogDiagnosisJobResultResponse> showLogDiagnosisJobResultAsyncInvoker(
        ShowLogDiagnosisJobResultRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showLogDiagnosisJobResult, hcClient);
    }

    /**
     * 查询profiling诊断作业详情
     *
     * 查询profiling诊断作业详情接口用于获取指定profiling诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控profiling诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobRequest 请求对象
     * @return CompletableFuture<ShowProfilingDiagnosisJobResponse>
     */
    public CompletableFuture<ShowProfilingDiagnosisJobResponse> showProfilingDiagnosisJobAsync(
        ShowProfilingDiagnosisJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showProfilingDiagnosisJob);
    }

    /**
     * 查询profiling诊断作业详情
     *
     * 查询profiling诊断作业详情接口用于获取指定profiling诊断作业的详细信息，包括作业状态、进度、结果等。该接口适用于以下场景：用户需要监控profiling诊断作业的执行情况、查看诊断结果或分析作业状态。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细信息，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobRequest 请求对象
     * @return AsyncInvoker<ShowProfilingDiagnosisJobRequest, ShowProfilingDiagnosisJobResponse>
     */
    public AsyncInvoker<ShowProfilingDiagnosisJobRequest, ShowProfilingDiagnosisJobResponse> showProfilingDiagnosisJobAsyncInvoker(
        ShowProfilingDiagnosisJobRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showProfilingDiagnosisJob, hcClient);
    }

    /**
     * 查询profiling诊断作业诊断结果
     *
     * 查询profiling诊断作业诊断结果接口用于获取指定profiling诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解profiling诊断作业的分析结果。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobResultRequest 请求对象
     * @return CompletableFuture<ShowProfilingDiagnosisJobResultResponse>
     */
    public CompletableFuture<ShowProfilingDiagnosisJobResultResponse> showProfilingDiagnosisJobResultAsync(
        ShowProfilingDiagnosisJobResultRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.showProfilingDiagnosisJobResult);
    }

    /**
     * 查询profiling诊断作业诊断结果
     *
     * 查询profiling诊断作业诊断结果接口用于获取指定profiling诊断作业的详细诊断结果，包括问题原因、建议解决方案等信息。该接口适用于以下场景：用户需要了解profiling诊断作业的分析结果。使用该接口的前提条件是用户已创建profiling诊断作业且具有管理员权限，同时需提供正确的作业ID。调用该接口后，用户将获得profiling诊断作业的详细诊断结果，便于进一步分析或处理。若作业ID不存在或用户无权限访问，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProfilingDiagnosisJobResultRequest 请求对象
     * @return AsyncInvoker<ShowProfilingDiagnosisJobResultRequest, ShowProfilingDiagnosisJobResultResponse>
     */
    public AsyncInvoker<ShowProfilingDiagnosisJobResultRequest, ShowProfilingDiagnosisJobResultResponse> showProfilingDiagnosisJobResultAsyncInvoker(
        ShowProfilingDiagnosisJobResultRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.showProfilingDiagnosisJobResult, hcClient);
    }

    /**
     * 更新自动扩缩容
     *
     * 更新自动扩缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAutoScalingPolicyResponse>
     */
    public CompletableFuture<UpdateAutoScalingPolicyResponse> updateAutoScalingPolicyAsync(
        UpdateAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.updateAutoScalingPolicy);
    }

    /**
     * 更新自动扩缩容
     *
     * 更新自动扩缩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse>
     */
    public AsyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicyAsyncInvoker(
        UpdateAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.updateAutoScalingPolicy, hcClient);
    }

}

package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dgc.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class DgcAsyncClient {

    protected HcClient hcClient;

    public DgcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DgcAsyncClient> newBuilder() {
        return new ClientBuilder<>(DgcAsyncClient::new);
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScriptRequest 请求对象
     * @return CompletableFuture<CancelScriptResponse>
     */
    public CompletableFuture<CancelScriptResponse> cancelScriptAsync(CancelScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.cancelScript);
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScriptRequest 请求对象
     * @return AsyncInvoker<CancelScriptRequest, CancelScriptResponse>
     */
    public AsyncInvoker<CancelScriptRequest, CancelScriptResponse> cancelScriptAsyncInvoker(
        CancelScriptRequest request) {
        return new AsyncInvoker<CancelScriptRequest, CancelScriptResponse>(request, DgcMeta.cancelScript, hcClient);
    }

    /**
     * 创建连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createConnection);
    }

    /**
     * 创建连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionAsyncInvoker(
        CreateConnectionRequest request) {
        return new AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>(request, DgcMeta.createConnection,
            hcClient);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return CompletableFuture<CreateJobResponse>
     */
    public CompletableFuture<CreateJobResponse> createJobAsync(CreateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createJob);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<CreateJobRequest, CreateJobResponse>(request, DgcMeta.createJob, hcClient);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceRequest 请求对象
     * @return CompletableFuture<CreateResourceResponse>
     */
    public CompletableFuture<CreateResourceResponse> createResourceAsync(CreateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createResource);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceRequest 请求对象
     * @return AsyncInvoker<CreateResourceRequest, CreateResourceResponse>
     */
    public AsyncInvoker<CreateResourceRequest, CreateResourceResponse> createResourceAsyncInvoker(
        CreateResourceRequest request) {
        return new AsyncInvoker<CreateResourceRequest, CreateResourceResponse>(request, DgcMeta.createResource,
            hcClient);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateScriptRequest 请求对象
     * @return CompletableFuture<CreateScriptResponse>
     */
    public CompletableFuture<CreateScriptResponse> createScriptAsync(CreateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createScript);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateScriptRequest 请求对象
     * @return AsyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public AsyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptAsyncInvoker(
        CreateScriptRequest request) {
        return new AsyncInvoker<CreateScriptRequest, CreateScriptResponse>(request, DgcMeta.createScript, hcClient);
    }

    /**
     * 删除连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnctionRequest 请求对象
     * @return CompletableFuture<DeleteConnctionResponse>
     */
    public CompletableFuture<DeleteConnctionResponse> deleteConnctionAsync(DeleteConnctionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteConnction);
    }

    /**
     * 删除连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnctionRequest 请求对象
     * @return AsyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse>
     */
    public AsyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnctionAsyncInvoker(
        DeleteConnctionRequest request) {
        return new AsyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse>(request, DgcMeta.deleteConnction,
            hcClient);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, DgcMeta.deleteJob, hcClient);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteResource);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceAsyncInvoker(
        DeleteResourceRequest request) {
        return new AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, DgcMeta.deleteResource,
            hcClient);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteScriptRequest 请求对象
     * @return CompletableFuture<DeleteScriptResponse>
     */
    public CompletableFuture<DeleteScriptResponse> deleteScriptAsync(DeleteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteScript);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteScriptRequest 请求对象
     * @return AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptAsyncInvoker(
        DeleteScriptRequest request) {
        return new AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse>(request, DgcMeta.deleteScript, hcClient);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteScriptRequest 请求对象
     * @return CompletableFuture<ExecuteScriptResponse>
     */
    public CompletableFuture<ExecuteScriptResponse> executeScriptAsync(ExecuteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.executeScript);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteScriptRequest 请求对象
     * @return AsyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public AsyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptAsyncInvoker(
        ExecuteScriptRequest request) {
        return new AsyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>(request, DgcMeta.executeScript, hcClient);
    }

    /**
     * 导出连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportConnectionsRequest 请求对象
     * @return CompletableFuture<ExportConnectionsResponse>
     */
    public CompletableFuture<ExportConnectionsResponse> exportConnectionsAsync(ExportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.exportConnections);
    }

    /**
     * 导出连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportConnectionsRequest 请求对象
     * @return AsyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse>
     */
    public AsyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse> exportConnectionsAsyncInvoker(
        ExportConnectionsRequest request) {
        return new AsyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse>(request, DgcMeta.exportConnections,
            hcClient);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobRequest 请求对象
     * @return CompletableFuture<ExportJobResponse>
     */
    public CompletableFuture<ExportJobResponse> exportJobAsync(ExportJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.exportJob);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobRequest 请求对象
     * @return AsyncInvoker<ExportJobRequest, ExportJobResponse>
     */
    public AsyncInvoker<ExportJobRequest, ExportJobResponse> exportJobAsyncInvoker(ExportJobRequest request) {
        return new AsyncInvoker<ExportJobRequest, ExportJobResponse>(request, DgcMeta.exportJob, hcClient);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobListRequest 请求对象
     * @return CompletableFuture<ExportJobListResponse>
     */
    public CompletableFuture<ExportJobListResponse> exportJobListAsync(ExportJobListRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.exportJobList);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportJobListRequest 请求对象
     * @return AsyncInvoker<ExportJobListRequest, ExportJobListResponse>
     */
    public AsyncInvoker<ExportJobListRequest, ExportJobListResponse> exportJobListAsyncInvoker(
        ExportJobListRequest request) {
        return new AsyncInvoker<ExportJobListRequest, ExportJobListResponse>(request, DgcMeta.exportJobList, hcClient);
    }

    /**
     * 导入连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportConnectionsRequest 请求对象
     * @return CompletableFuture<ImportConnectionsResponse>
     */
    public CompletableFuture<ImportConnectionsResponse> importConnectionsAsync(ImportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.importConnections);
    }

    /**
     * 导入连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportConnectionsRequest 请求对象
     * @return AsyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse>
     */
    public AsyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse> importConnectionsAsyncInvoker(
        ImportConnectionsRequest request) {
        return new AsyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse>(request, DgcMeta.importConnections,
            hcClient);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportJobRequest 请求对象
     * @return CompletableFuture<ImportJobResponse>
     */
    public CompletableFuture<ImportJobResponse> importJobAsync(ImportJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.importJob);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportJobRequest 请求对象
     * @return AsyncInvoker<ImportJobRequest, ImportJobResponse>
     */
    public AsyncInvoker<ImportJobRequest, ImportJobResponse> importJobAsyncInvoker(ImportJobRequest request) {
        return new AsyncInvoker<ImportJobRequest, ImportJobResponse>(request, DgcMeta.importJob, hcClient);
    }

    /**
     * 查询连接列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listConnections);
    }

    /**
     * 查询连接列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>(request, DgcMeta.listConnections,
            hcClient);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInstancesRequest 请求对象
     * @return CompletableFuture<ListJobInstancesResponse>
     */
    public CompletableFuture<ListJobInstancesResponse> listJobInstancesAsync(ListJobInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listJobInstances);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobInstancesRequest 请求对象
     * @return AsyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>
     */
    public AsyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstancesAsyncInvoker(
        ListJobInstancesRequest request) {
        return new AsyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>(request, DgcMeta.listJobInstances,
            hcClient);
    }

    /**
     * 查询作业列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listJobs);
    }

    /**
     * 查询作业列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, DgcMeta.listJobs, hcClient);
    }

    /**
     * 查询资源列表
     *
     *
     * @param ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listResources);
    }

    /**
     * 查询资源列表
     *
     *
     * @param ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, DgcMeta.listResources, hcClient);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptResultsRequest 请求对象
     * @return CompletableFuture<ListScriptResultsResponse>
     */
    public CompletableFuture<ListScriptResultsResponse> listScriptResultsAsync(ListScriptResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listScriptResults);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptResultsRequest 请求对象
     * @return AsyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>
     */
    public AsyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResultsAsyncInvoker(
        ListScriptResultsRequest request) {
        return new AsyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>(request, DgcMeta.listScriptResults,
            hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptsRequest 请求对象
     * @return CompletableFuture<ListScriptsResponse>
     */
    public CompletableFuture<ListScriptsResponse> listScriptsAsync(ListScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScriptsRequest 请求对象
     * @return AsyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public AsyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsAsyncInvoker(ListScriptsRequest request) {
        return new AsyncInvoker<ListScriptsRequest, ListScriptsResponse>(request, DgcMeta.listScripts, hcClient);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemTasksRequest 请求对象
     * @return CompletableFuture<ListSystemTasksResponse>
     */
    public CompletableFuture<ListSystemTasksResponse> listSystemTasksAsync(ListSystemTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listSystemTasks);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemTasksRequest 请求对象
     * @return AsyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>
     */
    public AsyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasksAsyncInvoker(
        ListSystemTasksRequest request) {
        return new AsyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>(request, DgcMeta.listSystemTasks,
            hcClient);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreJobInstanceRequest 请求对象
     * @return CompletableFuture<RestoreJobInstanceResponse>
     */
    public CompletableFuture<RestoreJobInstanceResponse> restoreJobInstanceAsync(RestoreJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.restoreJobInstance);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreJobInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>
     */
    public AsyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstanceAsyncInvoker(
        RestoreJobInstanceRequest request) {
        return new AsyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>(request,
            DgcMeta.restoreJobInstance, hcClient);
    }

    /**
     * 单次执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunOnceRequest 请求对象
     * @return CompletableFuture<RunOnceResponse>
     */
    public CompletableFuture<RunOnceResponse> runOnceAsync(RunOnceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.runOnce);
    }

    /**
     * 单次执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunOnceRequest 请求对象
     * @return AsyncInvoker<RunOnceRequest, RunOnceResponse>
     */
    public AsyncInvoker<RunOnceRequest, RunOnceResponse> runOnceAsyncInvoker(RunOnceRequest request) {
        return new AsyncInvoker<RunOnceRequest, RunOnceResponse>(request, DgcMeta.runOnce, hcClient);
    }

    /**
     * 查询连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionRequest 请求对象
     * @return CompletableFuture<ShowConnectionResponse>
     */
    public CompletableFuture<ShowConnectionResponse> showConnectionAsync(ShowConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showConnection);
    }

    /**
     * 查询连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionRequest 请求对象
     * @return AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionAsyncInvoker(
        ShowConnectionRequest request) {
        return new AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse>(request, DgcMeta.showConnection,
            hcClient);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileInfoRequest 请求对象
     * @return CompletableFuture<ShowFileInfoResponse>
     */
    public CompletableFuture<ShowFileInfoResponse> showFileInfoAsync(ShowFileInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showFileInfo);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileInfoRequest 请求对象
     * @return AsyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>
     */
    public AsyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfoAsyncInvoker(
        ShowFileInfoRequest request) {
        return new AsyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>(request, DgcMeta.showFileInfo, hcClient);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showJob);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, DgcMeta.showJob, hcClient);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInstanceRequest 请求对象
     * @return CompletableFuture<ShowJobInstanceResponse>
     */
    public CompletableFuture<ShowJobInstanceResponse> showJobInstanceAsync(ShowJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showJobInstance);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInstanceRequest 请求对象
     * @return AsyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>
     */
    public AsyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstanceAsyncInvoker(
        ShowJobInstanceRequest request) {
        return new AsyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>(request, DgcMeta.showJobInstance,
            hcClient);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showJobStatus);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, DgcMeta.showJobStatus, hcClient);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRequest 请求对象
     * @return CompletableFuture<ShowResourceResponse>
     */
    public CompletableFuture<ShowResourceResponse> showResourceAsync(ShowResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showResource);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRequest 请求对象
     * @return AsyncInvoker<ShowResourceRequest, ShowResourceResponse>
     */
    public AsyncInvoker<ShowResourceRequest, ShowResourceResponse> showResourceAsyncInvoker(
        ShowResourceRequest request) {
        return new AsyncInvoker<ShowResourceRequest, ShowResourceResponse>(request, DgcMeta.showResource, hcClient);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScriptRequest 请求对象
     * @return CompletableFuture<ShowScriptResponse>
     */
    public CompletableFuture<ShowScriptResponse> showScriptAsync(ShowScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showScript);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScriptRequest 请求对象
     * @return AsyncInvoker<ShowScriptRequest, ShowScriptResponse>
     */
    public AsyncInvoker<ShowScriptRequest, ShowScriptResponse> showScriptAsyncInvoker(ShowScriptRequest request) {
        return new AsyncInvoker<ShowScriptRequest, ShowScriptResponse>(request, DgcMeta.showScript, hcClient);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return CompletableFuture<StartJobResponse>
     */
    public CompletableFuture<StartJobResponse> startJobAsync(StartJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.startJob);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return AsyncInvoker<StartJobRequest, StartJobResponse>
     */
    public AsyncInvoker<StartJobRequest, StartJobResponse> startJobAsyncInvoker(StartJobRequest request) {
        return new AsyncInvoker<StartJobRequest, StartJobResponse>(request, DgcMeta.startJob, hcClient);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return CompletableFuture<StopJobResponse>
     */
    public CompletableFuture<StopJobResponse> stopJobAsync(StopJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.stopJob);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return AsyncInvoker<StopJobRequest, StopJobResponse>
     */
    public AsyncInvoker<StopJobRequest, StopJobResponse> stopJobAsyncInvoker(StopJobRequest request) {
        return new AsyncInvoker<StopJobRequest, StopJobResponse>(request, DgcMeta.stopJob, hcClient);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobInstanceRequest 请求对象
     * @return CompletableFuture<StopJobInstanceResponse>
     */
    public CompletableFuture<StopJobInstanceResponse> stopJobInstanceAsync(StopJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.stopJobInstance);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobInstanceRequest 请求对象
     * @return AsyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>
     */
    public AsyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstanceAsyncInvoker(
        StopJobInstanceRequest request) {
        return new AsyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>(request, DgcMeta.stopJobInstance,
            hcClient);
    }

    /**
     * 修改连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.updateConnection);
    }

    /**
     * 修改连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionAsyncInvoker(
        UpdateConnectionRequest request) {
        return new AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>(request, DgcMeta.updateConnection,
            hcClient);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return CompletableFuture<UpdateJobResponse>
     */
    public CompletableFuture<UpdateJobResponse> updateJobAsync(UpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.updateJob);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, DgcMeta.updateJob, hcClient);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceRequest 请求对象
     * @return CompletableFuture<UpdateResourceResponse>
     */
    public CompletableFuture<UpdateResourceResponse> updateResourceAsync(UpdateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.updateResource);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceRequest 请求对象
     * @return AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse>
     */
    public AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceAsyncInvoker(
        UpdateResourceRequest request) {
        return new AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse>(request, DgcMeta.updateResource,
            hcClient);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScriptRequest 请求对象
     * @return CompletableFuture<UpdateScriptResponse>
     */
    public CompletableFuture<UpdateScriptResponse> updateScriptAsync(UpdateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.updateScript);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScriptRequest 请求对象
     * @return AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptAsyncInvoker(
        UpdateScriptRequest request) {
        return new AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse>(request, DgcMeta.updateScript, hcClient);
    }

}

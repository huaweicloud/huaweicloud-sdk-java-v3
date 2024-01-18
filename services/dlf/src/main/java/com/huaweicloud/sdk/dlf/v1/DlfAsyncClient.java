package com.huaweicloud.sdk.dlf.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dlf.v1.model.CancelScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.CancelScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.CreateConnectionRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateConnectionResponse;
import com.huaweicloud.sdk.dlf.v1.model.CreateJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.CreateResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteConnctionRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteConnctionResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExportConnectionsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExportConnectionsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobListRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobListResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.ImportConnectionsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ImportConnectionsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ImportJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.ImportJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListConnectionsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListConnectionsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListJobInstancesRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListJobInstancesResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptResultsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptResultsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListSystemTasksRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListSystemTasksResponse;
import com.huaweicloud.sdk.dlf.v1.model.RestoreJobInstanceRequest;
import com.huaweicloud.sdk.dlf.v1.model.RestoreJobInstanceResponse;
import com.huaweicloud.sdk.dlf.v1.model.RunOnceRequest;
import com.huaweicloud.sdk.dlf.v1.model.RunOnceResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowConnectionRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowConnectionResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowDirectoryTreeRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowDirectoryTreeResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowFileInfoRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowFileInfoResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobInstanceRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobInstanceResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.StartJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.StartJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.StopJobInstanceRequest;
import com.huaweicloud.sdk.dlf.v1.model.StopJobInstanceResponse;
import com.huaweicloud.sdk.dlf.v1.model.StopJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.StopJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateScriptResponse;

import java.util.concurrent.CompletableFuture;

public class DlfAsyncClient {

    protected HcClient hcClient;

    public DlfAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DlfAsyncClient> newBuilder() {
        ClientBuilder<DlfAsyncClient> clientBuilder = new ClientBuilder<>(DlfAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScriptRequest 请求对象
     * @return CompletableFuture<CancelScriptResponse>
     */
    public CompletableFuture<CancelScriptResponse> cancelScriptAsync(CancelScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.cancelScript);
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScriptRequest 请求对象
     * @return AsyncInvoker<CancelScriptRequest, CancelScriptResponse>
     */
    public AsyncInvoker<CancelScriptRequest, CancelScriptResponse> cancelScriptAsyncInvoker(
        CancelScriptRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.cancelScript, hcClient);
    }

    /**
     * 创建连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.createConnection);
    }

    /**
     * 创建连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionAsyncInvoker(
        CreateConnectionRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.createConnection, hcClient);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
     * @return CompletableFuture<CreateJobResponse>
     */
    public CompletableFuture<CreateJobResponse> createJobAsync(CreateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.createJob);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.createJob, hcClient);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceRequest 请求对象
     * @return CompletableFuture<CreateResourceResponse>
     */
    public CompletableFuture<CreateResourceResponse> createResourceAsync(CreateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.createResource);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceRequest 请求对象
     * @return AsyncInvoker<CreateResourceRequest, CreateResourceResponse>
     */
    public AsyncInvoker<CreateResourceRequest, CreateResourceResponse> createResourceAsyncInvoker(
        CreateResourceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.createResource, hcClient);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return CompletableFuture<CreateScriptResponse>
     */
    public CompletableFuture<CreateScriptResponse> createScriptAsync(CreateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.createScript);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return AsyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public AsyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptAsyncInvoker(
        CreateScriptRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.createScript, hcClient);
    }

    /**
     * 删除连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnctionRequest 请求对象
     * @return CompletableFuture<DeleteConnctionResponse>
     */
    public CompletableFuture<DeleteConnctionResponse> deleteConnctionAsync(DeleteConnctionRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.deleteConnction);
    }

    /**
     * 删除连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnctionRequest 请求对象
     * @return AsyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse>
     */
    public AsyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnctionAsyncInvoker(
        DeleteConnctionRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.deleteConnction, hcClient);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.deleteJob, hcClient);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.deleteResource);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceAsyncInvoker(
        DeleteResourceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.deleteResource, hcClient);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return CompletableFuture<DeleteScriptResponse>
     */
    public CompletableFuture<DeleteScriptResponse> deleteScriptAsync(DeleteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.deleteScript);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptAsyncInvoker(
        DeleteScriptRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.deleteScript, hcClient);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return CompletableFuture<ExecuteScriptResponse>
     */
    public CompletableFuture<ExecuteScriptResponse> executeScriptAsync(ExecuteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.executeScript);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return AsyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public AsyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptAsyncInvoker(
        ExecuteScriptRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.executeScript, hcClient);
    }

    /**
     * 导出连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportConnectionsRequest 请求对象
     * @return CompletableFuture<ExportConnectionsResponse>
     */
    public CompletableFuture<ExportConnectionsResponse> exportConnectionsAsync(ExportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.exportConnections);
    }

    /**
     * 导出连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportConnectionsRequest 请求对象
     * @return AsyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse>
     */
    public AsyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse> exportConnectionsAsyncInvoker(
        ExportConnectionsRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.exportConnections, hcClient);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobRequest 请求对象
     * @return CompletableFuture<ExportJobResponse>
     */
    public CompletableFuture<ExportJobResponse> exportJobAsync(ExportJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.exportJob);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobRequest 请求对象
     * @return AsyncInvoker<ExportJobRequest, ExportJobResponse>
     */
    public AsyncInvoker<ExportJobRequest, ExportJobResponse> exportJobAsyncInvoker(ExportJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.exportJob, hcClient);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobListRequest 请求对象
     * @return CompletableFuture<ExportJobListResponse>
     */
    public CompletableFuture<ExportJobListResponse> exportJobListAsync(ExportJobListRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.exportJobList);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobListRequest 请求对象
     * @return AsyncInvoker<ExportJobListRequest, ExportJobListResponse>
     */
    public AsyncInvoker<ExportJobListRequest, ExportJobListResponse> exportJobListAsyncInvoker(
        ExportJobListRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.exportJobList, hcClient);
    }

    /**
     * 导入连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportConnectionsRequest 请求对象
     * @return CompletableFuture<ImportConnectionsResponse>
     */
    public CompletableFuture<ImportConnectionsResponse> importConnectionsAsync(ImportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.importConnections);
    }

    /**
     * 导入连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportConnectionsRequest 请求对象
     * @return AsyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse>
     */
    public AsyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse> importConnectionsAsyncInvoker(
        ImportConnectionsRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.importConnections, hcClient);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportJobRequest 请求对象
     * @return CompletableFuture<ImportJobResponse>
     */
    public CompletableFuture<ImportJobResponse> importJobAsync(ImportJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.importJob);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportJobRequest 请求对象
     * @return AsyncInvoker<ImportJobRequest, ImportJobResponse>
     */
    public AsyncInvoker<ImportJobRequest, ImportJobResponse> importJobAsyncInvoker(ImportJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.importJob, hcClient);
    }

    /**
     * 查询连接列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.listConnections);
    }

    /**
     * 查询连接列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.listConnections, hcClient);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInstancesRequest 请求对象
     * @return CompletableFuture<ListJobInstancesResponse>
     */
    public CompletableFuture<ListJobInstancesResponse> listJobInstancesAsync(ListJobInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.listJobInstances);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInstancesRequest 请求对象
     * @return AsyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>
     */
    public AsyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstancesAsyncInvoker(
        ListJobInstancesRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.listJobInstances, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.listJobs);
    }

    /**
     * 查询作业列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.listJobs, hcClient);
    }

    /**
     * 查询资源列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.listResources);
    }

    /**
     * 查询资源列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.listResources, hcClient);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResultsRequest 请求对象
     * @return CompletableFuture<ListScriptResultsResponse>
     */
    public CompletableFuture<ListScriptResultsResponse> listScriptResultsAsync(ListScriptResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.listScriptResults);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResultsRequest 请求对象
     * @return AsyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>
     */
    public AsyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResultsAsyncInvoker(
        ListScriptResultsRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.listScriptResults, hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return CompletableFuture<ListScriptsResponse>
     */
    public CompletableFuture<ListScriptsResponse> listScriptsAsync(ListScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return AsyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public AsyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsAsyncInvoker(ListScriptsRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.listScripts, hcClient);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemTasksRequest 请求对象
     * @return CompletableFuture<ListSystemTasksResponse>
     */
    public CompletableFuture<ListSystemTasksResponse> listSystemTasksAsync(ListSystemTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.listSystemTasks);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemTasksRequest 请求对象
     * @return AsyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>
     */
    public AsyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasksAsyncInvoker(
        ListSystemTasksRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.listSystemTasks, hcClient);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreJobInstanceRequest 请求对象
     * @return CompletableFuture<RestoreJobInstanceResponse>
     */
    public CompletableFuture<RestoreJobInstanceResponse> restoreJobInstanceAsync(RestoreJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.restoreJobInstance);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreJobInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>
     */
    public AsyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstanceAsyncInvoker(
        RestoreJobInstanceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.restoreJobInstance, hcClient);
    }

    /**
     * 单次执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunOnceRequest 请求对象
     * @return CompletableFuture<RunOnceResponse>
     */
    public CompletableFuture<RunOnceResponse> runOnceAsync(RunOnceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.runOnce);
    }

    /**
     * 单次执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunOnceRequest 请求对象
     * @return AsyncInvoker<RunOnceRequest, RunOnceResponse>
     */
    public AsyncInvoker<RunOnceRequest, RunOnceResponse> runOnceAsyncInvoker(RunOnceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.runOnce, hcClient);
    }

    /**
     * 查询连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return CompletableFuture<ShowConnectionResponse>
     */
    public CompletableFuture<ShowConnectionResponse> showConnectionAsync(ShowConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showConnection);
    }

    /**
     * 查询连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionAsyncInvoker(
        ShowConnectionRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showConnection, hcClient);
    }

    /**
     * 查询目录树
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectoryTreeRequest 请求对象
     * @return CompletableFuture<ShowDirectoryTreeResponse>
     */
    public CompletableFuture<ShowDirectoryTreeResponse> showDirectoryTreeAsync(ShowDirectoryTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showDirectoryTree);
    }

    /**
     * 查询目录树
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectoryTreeRequest 请求对象
     * @return AsyncInvoker<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse>
     */
    public AsyncInvoker<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse> showDirectoryTreeAsyncInvoker(
        ShowDirectoryTreeRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showDirectoryTree, hcClient);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileInfoRequest 请求对象
     * @return CompletableFuture<ShowFileInfoResponse>
     */
    public CompletableFuture<ShowFileInfoResponse> showFileInfoAsync(ShowFileInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showFileInfo);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileInfoRequest 请求对象
     * @return AsyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>
     */
    public AsyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfoAsyncInvoker(
        ShowFileInfoRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showFileInfo, hcClient);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showJob);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showJob, hcClient);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInstanceRequest 请求对象
     * @return CompletableFuture<ShowJobInstanceResponse>
     */
    public CompletableFuture<ShowJobInstanceResponse> showJobInstanceAsync(ShowJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showJobInstance);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInstanceRequest 请求对象
     * @return AsyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>
     */
    public AsyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstanceAsyncInvoker(
        ShowJobInstanceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showJobInstance, hcClient);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showJobStatus);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showJobStatus, hcClient);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return CompletableFuture<ShowResourceResponse>
     */
    public CompletableFuture<ShowResourceResponse> showResourceAsync(ShowResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showResource);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return AsyncInvoker<ShowResourceRequest, ShowResourceResponse>
     */
    public AsyncInvoker<ShowResourceRequest, ShowResourceResponse> showResourceAsyncInvoker(
        ShowResourceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showResource, hcClient);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRequest 请求对象
     * @return CompletableFuture<ShowScriptResponse>
     */
    public CompletableFuture<ShowScriptResponse> showScriptAsync(ShowScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.showScript);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRequest 请求对象
     * @return AsyncInvoker<ShowScriptRequest, ShowScriptResponse>
     */
    public AsyncInvoker<ShowScriptRequest, ShowScriptResponse> showScriptAsyncInvoker(ShowScriptRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.showScript, hcClient);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartJobRequest 请求对象
     * @return CompletableFuture<StartJobResponse>
     */
    public CompletableFuture<StartJobResponse> startJobAsync(StartJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.startJob);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartJobRequest 请求对象
     * @return AsyncInvoker<StartJobRequest, StartJobResponse>
     */
    public AsyncInvoker<StartJobRequest, StartJobResponse> startJobAsyncInvoker(StartJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.startJob, hcClient);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return CompletableFuture<StopJobResponse>
     */
    public CompletableFuture<StopJobResponse> stopJobAsync(StopJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.stopJob);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return AsyncInvoker<StopJobRequest, StopJobResponse>
     */
    public AsyncInvoker<StopJobRequest, StopJobResponse> stopJobAsyncInvoker(StopJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.stopJob, hcClient);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobInstanceRequest 请求对象
     * @return CompletableFuture<StopJobInstanceResponse>
     */
    public CompletableFuture<StopJobInstanceResponse> stopJobInstanceAsync(StopJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.stopJobInstance);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobInstanceRequest 请求对象
     * @return AsyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>
     */
    public AsyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstanceAsyncInvoker(
        StopJobInstanceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.stopJobInstance, hcClient);
    }

    /**
     * 修改连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.updateConnection);
    }

    /**
     * 修改连接
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionAsyncInvoker(
        UpdateConnectionRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.updateConnection, hcClient);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return CompletableFuture<UpdateJobResponse>
     */
    public CompletableFuture<UpdateJobResponse> updateJobAsync(UpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.updateJob);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.updateJob, hcClient);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return CompletableFuture<UpdateResourceResponse>
     */
    public CompletableFuture<UpdateResourceResponse> updateResourceAsync(UpdateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.updateResource);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse>
     */
    public AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceAsyncInvoker(
        UpdateResourceRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.updateResource, hcClient);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return CompletableFuture<UpdateScriptResponse>
     */
    public CompletableFuture<UpdateScriptResponse> updateScriptAsync(UpdateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DlfMeta.updateScript);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptAsyncInvoker(
        UpdateScriptRequest request) {
        return new AsyncInvoker<>(request, DlfMeta.updateScript, hcClient);
    }

}

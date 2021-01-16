package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dgc.v1.model.*;

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
     * @param CancelScriptRequest 请求对象
     * @return CompletableFuture<CancelScriptResponse>
     */
    public CompletableFuture<CancelScriptResponse> cancelScriptAsync(CancelScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.cancelScript);
    }

    /**
     * 创建连接
     * 
     *
     * @param CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createConnection);
    }

    /**
     * 创建作业
     * 
     *
     * @param CreateJobRequest 请求对象
     * @return CompletableFuture<CreateJobResponse>
     */
    public CompletableFuture<CreateJobResponse> createJobAsync(CreateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createJob);
    }

    /**
     * 创建资源
     * 
     *
     * @param CreateResourceRequest 请求对象
     * @return CompletableFuture<CreateResourceResponse>
     */
    public CompletableFuture<CreateResourceResponse> createResourceAsync(CreateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createResource);
    }

    /**
     * 创建脚本
     * 
     *
     * @param CreateScriptRequest 请求对象
     * @return CompletableFuture<CreateScriptResponse>
     */
    public CompletableFuture<CreateScriptResponse> createScriptAsync(CreateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createScript);
    }

    /**
     * 删除连接
     * 
     *
     * @param DeleteConnctionRequest 请求对象
     * @return CompletableFuture<DeleteConnctionResponse>
     */
    public CompletableFuture<DeleteConnctionResponse> deleteConnctionAsync(DeleteConnctionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteConnction);
    }

    /**
     * 删除作业
     * 
     *
     * @param DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteJob);
    }

    /**
     * 删除资源
     * 
     *
     * @param DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteResource);
    }

    /**
     * 删除脚本
     * 
     *
     * @param DeleteScriptRequest 请求对象
     * @return CompletableFuture<DeleteScriptResponse>
     */
    public CompletableFuture<DeleteScriptResponse> deleteScriptAsync(DeleteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteScript);
    }

    /**
     * 执行脚本
     * 
     *
     * @param ExecuteScriptRequest 请求对象
     * @return CompletableFuture<ExecuteScriptResponse>
     */
    public CompletableFuture<ExecuteScriptResponse> executeScriptAsync(ExecuteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.executeScript);
    }

    /**
     * 导出连接
     * 
     *
     * @param ExportConnectionsRequest 请求对象
     * @return CompletableFuture<ExportConnectionsResponse>
     */
    public CompletableFuture<ExportConnectionsResponse> exportConnectionsAsync(ExportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.exportConnections);
    }

    /**
     * 导出作业
     * 
     *
     * @param ExportJobRequest 请求对象
     * @return CompletableFuture<ExportJobResponse>
     */
    public CompletableFuture<ExportJobResponse> exportJobAsync(ExportJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.exportJob);
    }

    /**
     * 批量导出作业
     * 
     *
     * @param ExportJobListRequest 请求对象
     * @return CompletableFuture<ExportJobListResponse>
     */
    public CompletableFuture<ExportJobListResponse> exportJobListAsync(ExportJobListRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.exportJobList);
    }

    /**
     * 导入连接
     * 
     *
     * @param ImportConnectionsRequest 请求对象
     * @return CompletableFuture<ImportConnectionsResponse>
     */
    public CompletableFuture<ImportConnectionsResponse> importConnectionsAsync(ImportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.importConnections);
    }

    /**
     * 导入作业
     * 
     *
     * @param ImportJobRequest 请求对象
     * @return CompletableFuture<ImportJobResponse>
     */
    public CompletableFuture<ImportJobResponse> importJobAsync(ImportJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.importJob);
    }

    /**
     * 查询连接列表
     * 
     *
     * @param ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listConnections);
    }

    /**
     * 查询作业实例列表
     * 
     *
     * @param ListJobInstancesRequest 请求对象
     * @return CompletableFuture<ListJobInstancesResponse>
     */
    public CompletableFuture<ListJobInstancesResponse> listJobInstancesAsync(ListJobInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listJobInstances);
    }

    /**
     * 查询作业列表
     * 
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listJobs);
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
     * 查询脚本实例执行结果
     * 
     *
     * @param ListScriptResultsRequest 请求对象
     * @return CompletableFuture<ListScriptResultsResponse>
     */
    public CompletableFuture<ListScriptResultsResponse> listScriptResultsAsync(ListScriptResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listScriptResults);
    }

    /**
     * 查询脚本列表
     * 
     *
     * @param ListScriptsRequest 请求对象
     * @return CompletableFuture<ListScriptsResponse>
     */
    public CompletableFuture<ListScriptsResponse> listScriptsAsync(ListScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listScripts);
    }

    /**
     * 查询系统任务详情
     * 
     *
     * @param ListSystemTasksRequest 请求对象
     * @return CompletableFuture<ListSystemTasksResponse>
     */
    public CompletableFuture<ListSystemTasksResponse> listSystemTasksAsync(ListSystemTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listSystemTasks);
    }

    /**
     * 修改作业
     * 
     *
     * @param ModifyJobRequest 请求对象
     * @return CompletableFuture<ModifyJobResponse>
     */
    public CompletableFuture<ModifyJobResponse> modifyJobAsync(ModifyJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.modifyJob);
    }

    /**
     * 修改资源
     * 
     *
     * @param ModifyResourceRequest 请求对象
     * @return CompletableFuture<ModifyResourceResponse>
     */
    public CompletableFuture<ModifyResourceResponse> modifyResourceAsync(ModifyResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.modifyResource);
    }

    /**
     * 修改脚本内容
     * 
     *
     * @param ModifyScriptRequest 请求对象
     * @return CompletableFuture<ModifyScriptResponse>
     */
    public CompletableFuture<ModifyScriptResponse> modifyScriptAsync(ModifyScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.modifyScript);
    }

    /**
     * 重跑作业实例
     * 
     *
     * @param RestoreJobInstanceRequest 请求对象
     * @return CompletableFuture<RestoreJobInstanceResponse>
     */
    public CompletableFuture<RestoreJobInstanceResponse> restoreJobInstanceAsync(RestoreJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.restoreJobInstance);
    }

    /**
     * 单次执行作业
     * 
     *
     * @param RunOnceRequest 请求对象
     * @return CompletableFuture<RunOnceResponse>
     */
    public CompletableFuture<RunOnceResponse> runOnceAsync(RunOnceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.runOnce);
    }

    /**
     * 查询连接详情
     * 
     *
     * @param ShowConnectionRequest 请求对象
     * @return CompletableFuture<ShowConnectionResponse>
     */
    public CompletableFuture<ShowConnectionResponse> showConnectionAsync(ShowConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showConnection);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     * 
     *
     * @param ShowFileInfoRequest 请求对象
     * @return CompletableFuture<ShowFileInfoResponse>
     */
    public CompletableFuture<ShowFileInfoResponse> showFileInfoAsync(ShowFileInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showFileInfo);
    }

    /**
     * 查询作业详情
     * 
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showJob);
    }

    /**
     * 查询作业实例详情
     * 
     *
     * @param ShowJobInstanceRequest 请求对象
     * @return CompletableFuture<ShowJobInstanceResponse>
     */
    public CompletableFuture<ShowJobInstanceResponse> showJobInstanceAsync(ShowJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showJobInstance);
    }

    /**
     * 查询实时作业的运行状态
     * 
     *
     * @param ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showJobStatus);
    }

    /**
     * 查询资源详情
     * 
     *
     * @param ShowResourceRequest 请求对象
     * @return CompletableFuture<ShowResourceResponse>
     */
    public CompletableFuture<ShowResourceResponse> showResourceAsync(ShowResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showResource);
    }

    /**
     * 查询脚本信息
     * 
     *
     * @param ShowScriptRequest 请求对象
     * @return CompletableFuture<ShowScriptResponse>
     */
    public CompletableFuture<ShowScriptResponse> showScriptAsync(ShowScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showScript);
    }

    /**
     * 启动作业
     * 
     *
     * @param StartJobRequest 请求对象
     * @return CompletableFuture<StartJobResponse>
     */
    public CompletableFuture<StartJobResponse> startJobAsync(StartJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.startJob);
    }

    /**
     * 停止作业
     * 
     *
     * @param StopJobRequest 请求对象
     * @return CompletableFuture<StopJobResponse>
     */
    public CompletableFuture<StopJobResponse> stopJobAsync(StopJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.stopJob);
    }

    /**
     * 停止作业实例
     * 
     *
     * @param StopJobInstanceRequest 请求对象
     * @return CompletableFuture<StopJobInstanceResponse>
     */
    public CompletableFuture<StopJobInstanceResponse> stopJobInstanceAsync(StopJobInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.stopJobInstance);
    }

    /**
     * 修改连接
     * 
     *
     * @param UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.updateConnection);
    }

}
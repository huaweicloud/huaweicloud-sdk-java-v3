package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dgc.v1.model.*;

public class DgcClient {
    protected HcClient hcClient;

    public DgcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DgcClient> newBuilder() {
        return new ClientBuilder<>(DgcClient::new);
    }


    /**
     * 停止脚本实例的执行
     * 
     *
     * @param CancelScriptRequest 请求对象
     * @return CancelScriptResponse
     */
    public CancelScriptResponse cancelScript(CancelScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.cancelScript);
    }

    /**
     * 停止脚本实例的执行
     * 
     *
     * @param CancelScriptRequest 请求对象
     * @return SyncInvoker<CancelScriptRequest, CancelScriptResponse>
     */
    public SyncInvoker<CancelScriptRequest, CancelScriptResponse> cancelScriptInvoker(CancelScriptRequest request) {
        return new SyncInvoker<CancelScriptRequest, CancelScriptResponse>(request, DgcMeta.cancelScript, hcClient);
    }

    /**
     * 创建连接
     * 
     *
     * @param CreateConnectionRequest 请求对象
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createConnection);
    }

    /**
     * 创建连接
     * 
     *
     * @param CreateConnectionRequest 请求对象
     * @return SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public SyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionInvoker(CreateConnectionRequest request) {
        return new SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>(request, DgcMeta.createConnection, hcClient);
    }

    /**
     * 创建作业
     * 
     *
     * @param CreateJobRequest 请求对象
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createJob);
    }

    /**
     * 创建作业
     * 
     *
     * @param CreateJobRequest 请求对象
     * @return SyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public SyncInvoker<CreateJobRequest, CreateJobResponse> createJobInvoker(CreateJobRequest request) {
        return new SyncInvoker<CreateJobRequest, CreateJobResponse>(request, DgcMeta.createJob, hcClient);
    }

    /**
     * 创建资源
     * 
     *
     * @param CreateResourceRequest 请求对象
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createResource);
    }

    /**
     * 创建资源
     * 
     *
     * @param CreateResourceRequest 请求对象
     * @return SyncInvoker<CreateResourceRequest, CreateResourceResponse>
     */
    public SyncInvoker<CreateResourceRequest, CreateResourceResponse> createResourceInvoker(CreateResourceRequest request) {
        return new SyncInvoker<CreateResourceRequest, CreateResourceResponse>(request, DgcMeta.createResource, hcClient);
    }

    /**
     * 创建脚本
     * 
     *
     * @param CreateScriptRequest 请求对象
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createScript);
    }

    /**
     * 创建脚本
     * 
     *
     * @param CreateScriptRequest 请求对象
     * @return SyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public SyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptInvoker(CreateScriptRequest request) {
        return new SyncInvoker<CreateScriptRequest, CreateScriptResponse>(request, DgcMeta.createScript, hcClient);
    }

    /**
     * 删除连接
     * 
     *
     * @param DeleteConnctionRequest 请求对象
     * @return DeleteConnctionResponse
     */
    public DeleteConnctionResponse deleteConnction(DeleteConnctionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteConnction);
    }

    /**
     * 删除连接
     * 
     *
     * @param DeleteConnctionRequest 请求对象
     * @return SyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse>
     */
    public SyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnctionInvoker(DeleteConnctionRequest request) {
        return new SyncInvoker<DeleteConnctionRequest, DeleteConnctionResponse>(request, DgcMeta.deleteConnction, hcClient);
    }

    /**
     * 删除作业
     * 
     *
     * @param DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteJob);
    }

    /**
     * 删除作业
     * 
     *
     * @param DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, DgcMeta.deleteJob, hcClient);
    }

    /**
     * 删除资源
     * 
     *
     * @param DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteResource);
    }

    /**
     * 删除资源
     * 
     *
     * @param DeleteResourceRequest 请求对象
     * @return SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceInvoker(DeleteResourceRequest request) {
        return new SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, DgcMeta.deleteResource, hcClient);
    }

    /**
     * 删除脚本
     * 
     *
     * @param DeleteScriptRequest 请求对象
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteScript);
    }

    /**
     * 删除脚本
     * 
     *
     * @param DeleteScriptRequest 请求对象
     * @return SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public SyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptInvoker(DeleteScriptRequest request) {
        return new SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>(request, DgcMeta.deleteScript, hcClient);
    }

    /**
     * 执行脚本
     * 
     *
     * @param ExecuteScriptRequest 请求对象
     * @return ExecuteScriptResponse
     */
    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.executeScript);
    }

    /**
     * 执行脚本
     * 
     *
     * @param ExecuteScriptRequest 请求对象
     * @return SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptInvoker(ExecuteScriptRequest request) {
        return new SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>(request, DgcMeta.executeScript, hcClient);
    }

    /**
     * 导出连接
     * 
     *
     * @param ExportConnectionsRequest 请求对象
     * @return ExportConnectionsResponse
     */
    public ExportConnectionsResponse exportConnections(ExportConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.exportConnections);
    }

    /**
     * 导出连接
     * 
     *
     * @param ExportConnectionsRequest 请求对象
     * @return SyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse>
     */
    public SyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse> exportConnectionsInvoker(ExportConnectionsRequest request) {
        return new SyncInvoker<ExportConnectionsRequest, ExportConnectionsResponse>(request, DgcMeta.exportConnections, hcClient);
    }

    /**
     * 导出作业
     * 
     *
     * @param ExportJobRequest 请求对象
     * @return ExportJobResponse
     */
    public ExportJobResponse exportJob(ExportJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.exportJob);
    }

    /**
     * 导出作业
     * 
     *
     * @param ExportJobRequest 请求对象
     * @return SyncInvoker<ExportJobRequest, ExportJobResponse>
     */
    public SyncInvoker<ExportJobRequest, ExportJobResponse> exportJobInvoker(ExportJobRequest request) {
        return new SyncInvoker<ExportJobRequest, ExportJobResponse>(request, DgcMeta.exportJob, hcClient);
    }

    /**
     * 批量导出作业
     * 
     *
     * @param ExportJobListRequest 请求对象
     * @return ExportJobListResponse
     */
    public ExportJobListResponse exportJobList(ExportJobListRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.exportJobList);
    }

    /**
     * 批量导出作业
     * 
     *
     * @param ExportJobListRequest 请求对象
     * @return SyncInvoker<ExportJobListRequest, ExportJobListResponse>
     */
    public SyncInvoker<ExportJobListRequest, ExportJobListResponse> exportJobListInvoker(ExportJobListRequest request) {
        return new SyncInvoker<ExportJobListRequest, ExportJobListResponse>(request, DgcMeta.exportJobList, hcClient);
    }

    /**
     * 导入连接
     * 
     *
     * @param ImportConnectionsRequest 请求对象
     * @return ImportConnectionsResponse
     */
    public ImportConnectionsResponse importConnections(ImportConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.importConnections);
    }

    /**
     * 导入连接
     * 
     *
     * @param ImportConnectionsRequest 请求对象
     * @return SyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse>
     */
    public SyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse> importConnectionsInvoker(ImportConnectionsRequest request) {
        return new SyncInvoker<ImportConnectionsRequest, ImportConnectionsResponse>(request, DgcMeta.importConnections, hcClient);
    }

    /**
     * 导入作业
     * 
     *
     * @param ImportJobRequest 请求对象
     * @return ImportJobResponse
     */
    public ImportJobResponse importJob(ImportJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.importJob);
    }

    /**
     * 导入作业
     * 
     *
     * @param ImportJobRequest 请求对象
     * @return SyncInvoker<ImportJobRequest, ImportJobResponse>
     */
    public SyncInvoker<ImportJobRequest, ImportJobResponse> importJobInvoker(ImportJobRequest request) {
        return new SyncInvoker<ImportJobRequest, ImportJobResponse>(request, DgcMeta.importJob, hcClient);
    }

    /**
     * 查询连接列表
     * 
     *
     * @param ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listConnections);
    }

    /**
     * 查询连接列表
     * 
     *
     * @param ListConnectionsRequest 请求对象
     * @return SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public SyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsInvoker(ListConnectionsRequest request) {
        return new SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>(request, DgcMeta.listConnections, hcClient);
    }

    /**
     * 查询作业实例列表
     * 
     *
     * @param ListJobInstancesRequest 请求对象
     * @return ListJobInstancesResponse
     */
    public ListJobInstancesResponse listJobInstances(ListJobInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listJobInstances);
    }

    /**
     * 查询作业实例列表
     * 
     *
     * @param ListJobInstancesRequest 请求对象
     * @return SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>
     */
    public SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstancesInvoker(ListJobInstancesRequest request) {
        return new SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>(request, DgcMeta.listJobInstances, hcClient);
    }

    /**
     * 查询作业列表
     * 
     *
     * @param ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listJobs);
    }

    /**
     * 查询作业列表
     * 
     *
     * @param ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<ListJobsRequest, ListJobsResponse>(request, DgcMeta.listJobs, hcClient);
    }

    /**
     * 查询资源列表
     * 
     *
     * @param ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listResources);
    }

    /**
     * 查询资源列表
     * 
     *
     * @param ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, DgcMeta.listResources, hcClient);
    }

    /**
     * 查询脚本实例执行结果
     * 
     *
     * @param ListScriptResultsRequest 请求对象
     * @return ListScriptResultsResponse
     */
    public ListScriptResultsResponse listScriptResults(ListScriptResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listScriptResults);
    }

    /**
     * 查询脚本实例执行结果
     * 
     *
     * @param ListScriptResultsRequest 请求对象
     * @return SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>
     */
    public SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResultsInvoker(ListScriptResultsRequest request) {
        return new SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>(request, DgcMeta.listScriptResults, hcClient);
    }

    /**
     * 查询脚本列表
     * 
     *
     * @param ListScriptsRequest 请求对象
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listScripts);
    }

    /**
     * 查询脚本列表
     * 
     *
     * @param ListScriptsRequest 请求对象
     * @return SyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public SyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsInvoker(ListScriptsRequest request) {
        return new SyncInvoker<ListScriptsRequest, ListScriptsResponse>(request, DgcMeta.listScripts, hcClient);
    }

    /**
     * 查询系统任务详情
     * 
     *
     * @param ListSystemTasksRequest 请求对象
     * @return ListSystemTasksResponse
     */
    public ListSystemTasksResponse listSystemTasks(ListSystemTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listSystemTasks);
    }

    /**
     * 查询系统任务详情
     * 
     *
     * @param ListSystemTasksRequest 请求对象
     * @return SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>
     */
    public SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasksInvoker(ListSystemTasksRequest request) {
        return new SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>(request, DgcMeta.listSystemTasks, hcClient);
    }

    /**
     * 修改作业
     * 
     *
     * @param ModifyJobRequest 请求对象
     * @return ModifyJobResponse
     */
    public ModifyJobResponse modifyJob(ModifyJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.modifyJob);
    }

    /**
     * 修改作业
     * 
     *
     * @param ModifyJobRequest 请求对象
     * @return SyncInvoker<ModifyJobRequest, ModifyJobResponse>
     */
    public SyncInvoker<ModifyJobRequest, ModifyJobResponse> modifyJobInvoker(ModifyJobRequest request) {
        return new SyncInvoker<ModifyJobRequest, ModifyJobResponse>(request, DgcMeta.modifyJob, hcClient);
    }

    /**
     * 修改资源
     * 
     *
     * @param ModifyResourceRequest 请求对象
     * @return ModifyResourceResponse
     */
    public ModifyResourceResponse modifyResource(ModifyResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.modifyResource);
    }

    /**
     * 修改资源
     * 
     *
     * @param ModifyResourceRequest 请求对象
     * @return SyncInvoker<ModifyResourceRequest, ModifyResourceResponse>
     */
    public SyncInvoker<ModifyResourceRequest, ModifyResourceResponse> modifyResourceInvoker(ModifyResourceRequest request) {
        return new SyncInvoker<ModifyResourceRequest, ModifyResourceResponse>(request, DgcMeta.modifyResource, hcClient);
    }

    /**
     * 修改脚本内容
     * 
     *
     * @param ModifyScriptRequest 请求对象
     * @return ModifyScriptResponse
     */
    public ModifyScriptResponse modifyScript(ModifyScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.modifyScript);
    }

    /**
     * 修改脚本内容
     * 
     *
     * @param ModifyScriptRequest 请求对象
     * @return SyncInvoker<ModifyScriptRequest, ModifyScriptResponse>
     */
    public SyncInvoker<ModifyScriptRequest, ModifyScriptResponse> modifyScriptInvoker(ModifyScriptRequest request) {
        return new SyncInvoker<ModifyScriptRequest, ModifyScriptResponse>(request, DgcMeta.modifyScript, hcClient);
    }

    /**
     * 重跑作业实例
     * 
     *
     * @param RestoreJobInstanceRequest 请求对象
     * @return RestoreJobInstanceResponse
     */
    public RestoreJobInstanceResponse restoreJobInstance(RestoreJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.restoreJobInstance);
    }

    /**
     * 重跑作业实例
     * 
     *
     * @param RestoreJobInstanceRequest 请求对象
     * @return SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>
     */
    public SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstanceInvoker(RestoreJobInstanceRequest request) {
        return new SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>(request, DgcMeta.restoreJobInstance, hcClient);
    }

    /**
     * 单次执行作业
     * 
     *
     * @param RunOnceRequest 请求对象
     * @return RunOnceResponse
     */
    public RunOnceResponse runOnce(RunOnceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.runOnce);
    }

    /**
     * 单次执行作业
     * 
     *
     * @param RunOnceRequest 请求对象
     * @return SyncInvoker<RunOnceRequest, RunOnceResponse>
     */
    public SyncInvoker<RunOnceRequest, RunOnceResponse> runOnceInvoker(RunOnceRequest request) {
        return new SyncInvoker<RunOnceRequest, RunOnceResponse>(request, DgcMeta.runOnce, hcClient);
    }

    /**
     * 查询连接详情
     * 
     *
     * @param ShowConnectionRequest 请求对象
     * @return ShowConnectionResponse
     */
    public ShowConnectionResponse showConnection(ShowConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showConnection);
    }

    /**
     * 查询连接详情
     * 
     *
     * @param ShowConnectionRequest 请求对象
     * @return SyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public SyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionInvoker(ShowConnectionRequest request) {
        return new SyncInvoker<ShowConnectionRequest, ShowConnectionResponse>(request, DgcMeta.showConnection, hcClient);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     * 
     *
     * @param ShowFileInfoRequest 请求对象
     * @return ShowFileInfoResponse
     */
    public ShowFileInfoResponse showFileInfo(ShowFileInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showFileInfo);
    }

    /**
     * 检查导入作业文件中的作业和脚本
     * 
     *
     * @param ShowFileInfoRequest 请求对象
     * @return SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>
     */
    public SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfoInvoker(ShowFileInfoRequest request) {
        return new SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>(request, DgcMeta.showFileInfo, hcClient);
    }

    /**
     * 查询作业详情
     * 
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showJob);
    }

    /**
     * 查询作业详情
     * 
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, DgcMeta.showJob, hcClient);
    }

    /**
     * 查询作业实例详情
     * 
     *
     * @param ShowJobInstanceRequest 请求对象
     * @return ShowJobInstanceResponse
     */
    public ShowJobInstanceResponse showJobInstance(ShowJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showJobInstance);
    }

    /**
     * 查询作业实例详情
     * 
     *
     * @param ShowJobInstanceRequest 请求对象
     * @return SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>
     */
    public SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstanceInvoker(ShowJobInstanceRequest request) {
        return new SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>(request, DgcMeta.showJobInstance, hcClient);
    }

    /**
     * 查询实时作业的运行状态
     * 
     *
     * @param ShowJobStatusRequest 请求对象
     * @return ShowJobStatusResponse
     */
    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showJobStatus);
    }

    /**
     * 查询实时作业的运行状态
     * 
     *
     * @param ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, DgcMeta.showJobStatus, hcClient);
    }

    /**
     * 查询资源详情
     * 
     *
     * @param ShowResourceRequest 请求对象
     * @return ShowResourceResponse
     */
    public ShowResourceResponse showResource(ShowResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showResource);
    }

    /**
     * 查询资源详情
     * 
     *
     * @param ShowResourceRequest 请求对象
     * @return SyncInvoker<ShowResourceRequest, ShowResourceResponse>
     */
    public SyncInvoker<ShowResourceRequest, ShowResourceResponse> showResourceInvoker(ShowResourceRequest request) {
        return new SyncInvoker<ShowResourceRequest, ShowResourceResponse>(request, DgcMeta.showResource, hcClient);
    }

    /**
     * 查询脚本信息
     * 
     *
     * @param ShowScriptRequest 请求对象
     * @return ShowScriptResponse
     */
    public ShowScriptResponse showScript(ShowScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showScript);
    }

    /**
     * 查询脚本信息
     * 
     *
     * @param ShowScriptRequest 请求对象
     * @return SyncInvoker<ShowScriptRequest, ShowScriptResponse>
     */
    public SyncInvoker<ShowScriptRequest, ShowScriptResponse> showScriptInvoker(ShowScriptRequest request) {
        return new SyncInvoker<ShowScriptRequest, ShowScriptResponse>(request, DgcMeta.showScript, hcClient);
    }

    /**
     * 启动作业
     * 
     *
     * @param StartJobRequest 请求对象
     * @return StartJobResponse
     */
    public StartJobResponse startJob(StartJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.startJob);
    }

    /**
     * 启动作业
     * 
     *
     * @param StartJobRequest 请求对象
     * @return SyncInvoker<StartJobRequest, StartJobResponse>
     */
    public SyncInvoker<StartJobRequest, StartJobResponse> startJobInvoker(StartJobRequest request) {
        return new SyncInvoker<StartJobRequest, StartJobResponse>(request, DgcMeta.startJob, hcClient);
    }

    /**
     * 停止作业
     * 
     *
     * @param StopJobRequest 请求对象
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.stopJob);
    }

    /**
     * 停止作业
     * 
     *
     * @param StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<StopJobRequest, StopJobResponse>(request, DgcMeta.stopJob, hcClient);
    }

    /**
     * 停止作业实例
     * 
     *
     * @param StopJobInstanceRequest 请求对象
     * @return StopJobInstanceResponse
     */
    public StopJobInstanceResponse stopJobInstance(StopJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.stopJobInstance);
    }

    /**
     * 停止作业实例
     * 
     *
     * @param StopJobInstanceRequest 请求对象
     * @return SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>
     */
    public SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstanceInvoker(StopJobInstanceRequest request) {
        return new SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>(request, DgcMeta.stopJobInstance, hcClient);
    }

    /**
     * 修改连接
     * 
     *
     * @param UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.updateConnection);
    }

    /**
     * 修改连接
     * 
     *
     * @param UpdateConnectionRequest 请求对象
     * @return SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionInvoker(UpdateConnectionRequest request) {
        return new SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>(request, DgcMeta.updateConnection, hcClient);
    }

}
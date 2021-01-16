package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 修改连接
     * 
     *
     * @param UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.updateConnection);
    }

}
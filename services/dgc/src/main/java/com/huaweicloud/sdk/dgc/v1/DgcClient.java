package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dgc.v1.model.CancelScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.CancelScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.CreateJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.CreateResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobListRequest;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobListResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.ImportJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.ImportJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListJobInstancesRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListJobInstancesResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptResultsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptResultsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListSystemTasksRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListSystemTasksResponse;
import com.huaweicloud.sdk.dgc.v1.model.RestoreJobInstanceRequest;
import com.huaweicloud.sdk.dgc.v1.model.RestoreJobInstanceResponse;
import com.huaweicloud.sdk.dgc.v1.model.RunOnceRequest;
import com.huaweicloud.sdk.dgc.v1.model.RunOnceResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowFileInfoRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowFileInfoResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobInstanceRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobInstanceResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.StartJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.StartJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.StopJobInstanceRequest;
import com.huaweicloud.sdk.dgc.v1.model.StopJobInstanceResponse;
import com.huaweicloud.sdk.dgc.v1.model.StopJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.StopJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.UpdateResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.UpdateResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.UpdateScriptResponse;

public class DgcClient {

    protected HcClient hcClient;

    public DgcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DgcClient> newBuilder() {
        ClientBuilder<DgcClient> clientBuilder = new ClientBuilder<>(DgcClient::new);
        return clientBuilder;
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScriptRequest 请求对象
     * @return CancelScriptResponse
     */
    public CancelScriptResponse cancelScript(CancelScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.cancelScript);
    }

    /**
     * 停止脚本实例的执行
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScriptRequest 请求对象
     * @return SyncInvoker<CancelScriptRequest, CancelScriptResponse>
     */
    public SyncInvoker<CancelScriptRequest, CancelScriptResponse> cancelScriptInvoker(CancelScriptRequest request) {
        return new SyncInvoker<>(request, DgcMeta.cancelScript, hcClient);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createJob);
    }

    /**
     * 创建作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
     * @return SyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public SyncInvoker<CreateJobRequest, CreateJobResponse> createJobInvoker(CreateJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.createJob, hcClient);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceRequest 请求对象
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createResource);
    }

    /**
     * 创建资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceRequest 请求对象
     * @return SyncInvoker<CreateResourceRequest, CreateResourceResponse>
     */
    public SyncInvoker<CreateResourceRequest, CreateResourceResponse> createResourceInvoker(
        CreateResourceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.createResource, hcClient);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createScript);
    }

    /**
     * 创建脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return SyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public SyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptInvoker(CreateScriptRequest request) {
        return new SyncInvoker<>(request, DgcMeta.createScript, hcClient);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.deleteJob, hcClient);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteResource);
    }

    /**
     * 删除资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceInvoker(
        DeleteResourceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.deleteResource, hcClient);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteScript);
    }

    /**
     * 删除脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public SyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptInvoker(DeleteScriptRequest request) {
        return new SyncInvoker<>(request, DgcMeta.deleteScript, hcClient);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return ExecuteScriptResponse
     */
    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.executeScript);
    }

    /**
     * 执行脚本
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptInvoker(ExecuteScriptRequest request) {
        return new SyncInvoker<>(request, DgcMeta.executeScript, hcClient);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobRequest 请求对象
     * @return ExportJobResponse
     */
    public ExportJobResponse exportJob(ExportJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.exportJob);
    }

    /**
     * 导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobRequest 请求对象
     * @return SyncInvoker<ExportJobRequest, ExportJobResponse>
     */
    public SyncInvoker<ExportJobRequest, ExportJobResponse> exportJobInvoker(ExportJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.exportJob, hcClient);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobListRequest 请求对象
     * @return ExportJobListResponse
     */
    public ExportJobListResponse exportJobList(ExportJobListRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.exportJobList);
    }

    /**
     * 批量导出作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportJobListRequest 请求对象
     * @return SyncInvoker<ExportJobListRequest, ExportJobListResponse>
     */
    public SyncInvoker<ExportJobListRequest, ExportJobListResponse> exportJobListInvoker(ExportJobListRequest request) {
        return new SyncInvoker<>(request, DgcMeta.exportJobList, hcClient);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportJobRequest 请求对象
     * @return ImportJobResponse
     */
    public ImportJobResponse importJob(ImportJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.importJob);
    }

    /**
     * 导入作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportJobRequest 请求对象
     * @return SyncInvoker<ImportJobRequest, ImportJobResponse>
     */
    public SyncInvoker<ImportJobRequest, ImportJobResponse> importJobInvoker(ImportJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.importJob, hcClient);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInstancesRequest 请求对象
     * @return ListJobInstancesResponse
     */
    public ListJobInstancesResponse listJobInstances(ListJobInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listJobInstances);
    }

    /**
     * 查询作业实例列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInstancesRequest 请求对象
     * @return SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse>
     */
    public SyncInvoker<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstancesInvoker(
        ListJobInstancesRequest request) {
        return new SyncInvoker<>(request, DgcMeta.listJobInstances, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listJobs);
    }

    /**
     * 查询作业列表
     *
     * 查询作业列表清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, DgcMeta.listJobs, hcClient);
    }

    /**
     * 查询资源列表
     *
     *
     * @param request ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listResources);
    }

    /**
     * 查询资源列表
     *
     *
     * @param request ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<>(request, DgcMeta.listResources, hcClient);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResultsRequest 请求对象
     * @return ListScriptResultsResponse
     */
    public ListScriptResultsResponse listScriptResults(ListScriptResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listScriptResults);
    }

    /**
     * 查询脚本实例执行结果
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResultsRequest 请求对象
     * @return SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse>
     */
    public SyncInvoker<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResultsInvoker(
        ListScriptResultsRequest request) {
        return new SyncInvoker<>(request, DgcMeta.listScriptResults, hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return SyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public SyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsInvoker(ListScriptsRequest request) {
        return new SyncInvoker<>(request, DgcMeta.listScripts, hcClient);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemTasksRequest 请求对象
     * @return ListSystemTasksResponse
     */
    public ListSystemTasksResponse listSystemTasks(ListSystemTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listSystemTasks);
    }

    /**
     * 查询系统任务详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemTasksRequest 请求对象
     * @return SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse>
     */
    public SyncInvoker<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasksInvoker(
        ListSystemTasksRequest request) {
        return new SyncInvoker<>(request, DgcMeta.listSystemTasks, hcClient);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreJobInstanceRequest 请求对象
     * @return RestoreJobInstanceResponse
     */
    public RestoreJobInstanceResponse restoreJobInstance(RestoreJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.restoreJobInstance);
    }

    /**
     * 重跑作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreJobInstanceRequest 请求对象
     * @return SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse>
     */
    public SyncInvoker<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstanceInvoker(
        RestoreJobInstanceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.restoreJobInstance, hcClient);
    }

    /**
     * 立即执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunOnceRequest 请求对象
     * @return RunOnceResponse
     */
    public RunOnceResponse runOnce(RunOnceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.runOnce);
    }

    /**
     * 立即执行作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunOnceRequest 请求对象
     * @return SyncInvoker<RunOnceRequest, RunOnceResponse>
     */
    public SyncInvoker<RunOnceRequest, RunOnceResponse> runOnceInvoker(RunOnceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.runOnce, hcClient);
    }

    /**
     * 查询作业文件
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileInfoRequest 请求对象
     * @return ShowFileInfoResponse
     */
    public ShowFileInfoResponse showFileInfo(ShowFileInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showFileInfo);
    }

    /**
     * 查询作业文件
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileInfoRequest 请求对象
     * @return SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse>
     */
    public SyncInvoker<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfoInvoker(ShowFileInfoRequest request) {
        return new SyncInvoker<>(request, DgcMeta.showFileInfo, hcClient);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showJob);
    }

    /**
     * 查询作业详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.showJob, hcClient);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInstanceRequest 请求对象
     * @return ShowJobInstanceResponse
     */
    public ShowJobInstanceResponse showJobInstance(ShowJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showJobInstance);
    }

    /**
     * 查询作业实例详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInstanceRequest 请求对象
     * @return SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse>
     */
    public SyncInvoker<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstanceInvoker(
        ShowJobInstanceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.showJobInstance, hcClient);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return ShowJobStatusResponse
     */
    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showJobStatus);
    }

    /**
     * 查询实时作业的运行状态
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<>(request, DgcMeta.showJobStatus, hcClient);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return ShowResourceResponse
     */
    public ShowResourceResponse showResource(ShowResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showResource);
    }

    /**
     * 查询资源详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRequest 请求对象
     * @return SyncInvoker<ShowResourceRequest, ShowResourceResponse>
     */
    public SyncInvoker<ShowResourceRequest, ShowResourceResponse> showResourceInvoker(ShowResourceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.showResource, hcClient);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRequest 请求对象
     * @return ShowScriptResponse
     */
    public ShowScriptResponse showScript(ShowScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showScript);
    }

    /**
     * 查询脚本信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRequest 请求对象
     * @return SyncInvoker<ShowScriptRequest, ShowScriptResponse>
     */
    public SyncInvoker<ShowScriptRequest, ShowScriptResponse> showScriptInvoker(ShowScriptRequest request) {
        return new SyncInvoker<>(request, DgcMeta.showScript, hcClient);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartJobRequest 请求对象
     * @return StartJobResponse
     */
    public StartJobResponse startJob(StartJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.startJob);
    }

    /**
     * 启动作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartJobRequest 请求对象
     * @return SyncInvoker<StartJobRequest, StartJobResponse>
     */
    public SyncInvoker<StartJobRequest, StartJobResponse> startJobInvoker(StartJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.startJob, hcClient);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.stopJob);
    }

    /**
     * 停止作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.stopJob, hcClient);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobInstanceRequest 请求对象
     * @return StopJobInstanceResponse
     */
    public StopJobInstanceResponse stopJobInstance(StopJobInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.stopJobInstance);
    }

    /**
     * 停止作业实例
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobInstanceRequest 请求对象
     * @return SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse>
     */
    public SyncInvoker<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstanceInvoker(
        StopJobInstanceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.stopJobInstance, hcClient);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.updateJob);
    }

    /**
     * 修改作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<>(request, DgcMeta.updateJob, hcClient);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.updateResource);
    }

    /**
     * 修改资源
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return SyncInvoker<UpdateResourceRequest, UpdateResourceResponse>
     */
    public SyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceInvoker(
        UpdateResourceRequest request) {
        return new SyncInvoker<>(request, DgcMeta.updateResource, hcClient);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.updateScript);
    }

    /**
     * 修改脚本内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return SyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public SyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptInvoker(UpdateScriptRequest request) {
        return new SyncInvoker<>(request, DgcMeta.updateScript, hcClient);
    }

}

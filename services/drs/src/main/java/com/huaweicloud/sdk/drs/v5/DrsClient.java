package com.huaweicloud.sdk.drs.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CopyJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CopyJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListLinksRequest;
import com.huaweicloud.sdk.drs.v5.model.ListLinksResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameRequest;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameResponse;

public class DrsClient {

    protected HcClient hcClient;

    public DrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsClient> newBuilder() {
        ClientBuilder<DrsClient> clientBuilder = new ClientBuilder<>(DrsClient::new);
        return clientBuilder;
    }

    /**
     * 批量异步创建任务
     *
     * 批量异步创建任务，根据请求参数不同，可以批量异步创建实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateJobsAsyncRequest 请求对象
     * @return BatchCreateJobsAsyncResponse
     */
    public BatchCreateJobsAsyncResponse batchCreateJobsAsync(BatchCreateJobsAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCreateJobsAsync);
    }

    /**
     * 批量异步创建任务
     *
     * 批量异步创建任务，根据请求参数不同，可以批量异步创建实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateJobsAsyncRequest 请求对象
     * @return SyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>
     */
    public SyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> batchCreateJobsAsyncInvoker(
        BatchCreateJobsAsyncRequest request) {
        return new SyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>(request,
            DrsMeta.batchCreateJobsAsync, hcClient);
    }

    /**
     * 批量删除任务
     *
     * 批量删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobsByIdRequest 请求对象
     * @return BatchDeleteJobsByIdResponse
     */
    public BatchDeleteJobsByIdResponse batchDeleteJobsById(BatchDeleteJobsByIdRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchDeleteJobsById);
    }

    /**
     * 批量删除任务
     *
     * 批量删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobsByIdRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>
     */
    public SyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> batchDeleteJobsByIdInvoker(
        BatchDeleteJobsByIdRequest request) {
        return new SyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>(request,
            DrsMeta.batchDeleteJobsById, hcClient);
    }

    /**
     * 批量操作指定ID任务
     *
     * 批量操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExecuteJobActionsRequest 请求对象
     * @return BatchExecuteJobActionsResponse
     */
    public BatchExecuteJobActionsResponse batchExecuteJobActions(BatchExecuteJobActionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchExecuteJobActions);
    }

    /**
     * 批量操作指定ID任务
     *
     * 批量操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExecuteJobActionsRequest 请求对象
     * @return SyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>
     */
    public SyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> batchExecuteJobActionsInvoker(
        BatchExecuteJobActionsRequest request) {
        return new SyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>(request,
            DrsMeta.batchExecuteJobActions, hcClient);
    }

    /**
     * 提交查询数据库对象信息
     *
     * 提交查询数据库对象信息。例如：
     * - 当type取值为source时，表示查询源库库表信息。
     * - 当源库库表信息有变化时，则type取值为source，is_refresh取值为true。
     * - 当已同步到目标库的库表信息过大，需要提前将数据加载到缓存中时，type取值为synchronized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectDbObjectsAsyncRequest 请求对象
     * @return CollectDbObjectsAsyncResponse
     */
    public CollectDbObjectsAsyncResponse collectDbObjectsAsync(CollectDbObjectsAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.collectDbObjectsAsync);
    }

    /**
     * 提交查询数据库对象信息
     *
     * 提交查询数据库对象信息。例如：
     * - 当type取值为source时，表示查询源库库表信息。
     * - 当源库库表信息有变化时，则type取值为source，is_refresh取值为true。
     * - 当已同步到目标库的库表信息过大，需要提前将数据加载到缓存中时，type取值为synchronized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectDbObjectsAsyncRequest 请求对象
     * @return SyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>
     */
    public SyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> collectDbObjectsAsyncInvoker(
        CollectDbObjectsAsyncRequest request) {
        return new SyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>(request,
            DrsMeta.collectDbObjectsAsync, hcClient);
    }

    /**
     * 提交批量创建异步任务
     *
     * 提交批量创建异步任务，当批量异步任务创建或更新参数后，系统会自动开始进行参数校验，待所有任务成功完成参数校验后并且无报错时，可调用此接口开始创建DRS任务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitAsyncJobRequest 请求对象
     * @return CommitAsyncJobResponse
     */
    public CommitAsyncJobResponse commitAsyncJob(CommitAsyncJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.commitAsyncJob);
    }

    /**
     * 提交批量创建异步任务
     *
     * 提交批量创建异步任务，当批量异步任务创建或更新参数后，系统会自动开始进行参数校验，待所有任务成功完成参数校验后并且无报错时，可调用此接口开始创建DRS任务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitAsyncJobRequest 请求对象
     * @return SyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>
     */
    public SyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse> commitAsyncJobInvoker(
        CommitAsyncJobRequest request) {
        return new SyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>(request, DrsMeta.commitAsyncJob,
            hcClient);
    }

    /**
     * 克隆任务
     *
     * DRS支持通过克隆功能，快速复制现有同步任务的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyJobRequest 请求对象
     * @return CopyJobResponse
     */
    public CopyJobResponse copyJob(CopyJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.copyJob);
    }

    /**
     * 克隆任务
     *
     * DRS支持通过克隆功能，快速复制现有同步任务的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyJobRequest 请求对象
     * @return SyncInvoker<CopyJobRequest, CopyJobResponse>
     */
    public SyncInvoker<CopyJobRequest, CopyJobResponse> copyJobInvoker(CopyJobRequest request) {
        return new SyncInvoker<CopyJobRequest, CopyJobResponse>(request, DrsMeta.copyJob, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建单个任务，根据请求参数不同，可以创建单个实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.createJob);
    }

    /**
     * 创建任务
     *
     * 创建单个任务，根据请求参数不同，可以创建单个实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return SyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public SyncInvoker<CreateJobRequest, CreateJobResponse> createJobInvoker(CreateJobRequest request) {
        return new SyncInvoker<CreateJobRequest, CreateJobResponse>(request, DrsMeta.createJob, hcClient);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.deleteJob);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, DrsMeta.deleteJob, hcClient);
    }

    /**
     * 下载批量导入任务模板
     *
     * 下载批量导入任务模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBatchCreateTemplateRequest 请求对象
     * @return DownloadBatchCreateTemplateResponse
     */
    public DownloadBatchCreateTemplateResponse downloadBatchCreateTemplate(DownloadBatchCreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.downloadBatchCreateTemplate);
    }

    /**
     * 下载批量导入任务模板
     *
     * 下载批量导入任务模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBatchCreateTemplateRequest 请求对象
     * @return SyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse>
     */
    public SyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplateInvoker(
        DownloadBatchCreateTemplateRequest request) {
        return new SyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse>(request,
            DrsMeta.downloadBatchCreateTemplate, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDbObjectTemplateRequest 请求对象
     * @return DownloadDbObjectTemplateResponse
     */
    public DownloadDbObjectTemplateResponse downloadDbObjectTemplate(DownloadDbObjectTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.downloadDbObjectTemplate);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDbObjectTemplateRequest 请求对象
     * @return SyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>
     */
    public SyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> downloadDbObjectTemplateInvoker(
        DownloadDbObjectTemplateRequest request) {
        return new SyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>(request,
            DrsMeta.downloadDbObjectTemplate, hcClient);
    }

    /**
     * 操作指定ID任务
     *
     * 操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobActionRequest 请求对象
     * @return ExecuteJobActionResponse
     */
    public ExecuteJobActionResponse executeJobAction(ExecuteJobActionRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.executeJobAction);
    }

    /**
     * 操作指定ID任务
     *
     * 操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobActionRequest 请求对象
     * @return SyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>
     */
    public SyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse> executeJobActionInvoker(
        ExecuteJobActionRequest request) {
        return new SyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>(request, DrsMeta.executeJobAction,
            hcClient);
    }

    /**
     * 批量导入任务
     *
     * 批量导入任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportBatchCreateJobsRequest 请求对象
     * @return ImportBatchCreateJobsResponse
     */
    public ImportBatchCreateJobsResponse importBatchCreateJobs(ImportBatchCreateJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.importBatchCreateJobs);
    }

    /**
     * 批量导入任务
     *
     * 批量导入任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportBatchCreateJobsRequest 请求对象
     * @return SyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse>
     */
    public SyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> importBatchCreateJobsInvoker(
        ImportBatchCreateJobsRequest request) {
        return new SyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse>(request,
            DrsMeta.importBatchCreateJobs, hcClient);
    }

    /**
     * 查询指定ID批量异步任务详情
     *
     * 查询租户指定ID批量异步任务详情，默认为任务的“create_time”降序排序获取结果，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobDetailRequest 请求对象
     * @return ListAsyncJobDetailResponse
     */
    public ListAsyncJobDetailResponse listAsyncJobDetail(ListAsyncJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listAsyncJobDetail);
    }

    /**
     * 查询指定ID批量异步任务详情
     *
     * 查询租户指定ID批量异步任务详情，默认为任务的“create_time”降序排序获取结果，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobDetailRequest 请求对象
     * @return SyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>
     */
    public SyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> listAsyncJobDetailInvoker(
        ListAsyncJobDetailRequest request) {
        return new SyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>(request,
            DrsMeta.listAsyncJobDetail, hcClient);
    }

    /**
     * 查询批量异步创建的任务列表
     *
     * 查询租户批量异步创建的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobsRequest 请求对象
     * @return ListAsyncJobsResponse
     */
    public ListAsyncJobsResponse listAsyncJobs(ListAsyncJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listAsyncJobs);
    }

    /**
     * 查询批量异步创建的任务列表
     *
     * 查询租户批量异步创建的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobsRequest 请求对象
     * @return SyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>
     */
    public SyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse> listAsyncJobsInvoker(ListAsyncJobsRequest request) {
        return new SyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>(request, DrsMeta.listAsyncJobs, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbObjectsRequest 请求对象
     * @return ListDbObjectsResponse
     */
    public ListDbObjectsResponse listDbObjects(ListDbObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listDbObjects);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbObjectsRequest 请求对象
     * @return SyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>
     */
    public SyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse> listDbObjectsInvoker(ListDbObjectsRequest request) {
        return new SyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>(request, DrsMeta.listDbObjects, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listJobs);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<ListJobsRequest, ListJobsResponse>(request, DrsMeta.listJobs, hcClient);
    }

    /**
     * 查询可用链路信息
     *
     * 根据参数不同，可查询实时迁移、实时同步、实时灾备等可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLinksRequest 请求对象
     * @return ListLinksResponse
     */
    public ListLinksResponse listLinks(ListLinksRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listLinks);
    }

    /**
     * 查询可用链路信息
     *
     * 根据参数不同，可查询实时迁移、实时同步、实时灾备等可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLinksRequest 请求对象
     * @return SyncInvoker<ListLinksRequest, ListLinksResponse>
     */
    public SyncInvoker<ListLinksRequest, ListLinksResponse> listLinksInvoker(ListLinksRequest request) {
        return new SyncInvoker<ListLinksRequest, ListLinksResponse>(request, DrsMeta.listLinks, hcClient);
    }

    /**
     * 获取指定任务操作信息
     *
     * 获取指定任务允许、不允许、当前操作信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowActionsRequest 请求对象
     * @return ShowActionsResponse
     */
    public ShowActionsResponse showActions(ShowActionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showActions);
    }

    /**
     * 获取指定任务操作信息
     *
     * 获取指定任务允许、不允许、当前操作信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowActionsRequest 请求对象
     * @return SyncInvoker<ShowActionsRequest, ShowActionsResponse>
     */
    public SyncInvoker<ShowActionsRequest, ShowActionsResponse> showActionsInvoker(ShowActionsRequest request) {
        return new SyncInvoker<ShowActionsRequest, ShowActionsResponse>(request, DrsMeta.showActions, hcClient);
    }

    /**
     * 查询对比策略
     *
     * 查询对比策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComparePolicyRequest 请求对象
     * @return ShowComparePolicyResponse
     */
    public ShowComparePolicyResponse showComparePolicy(ShowComparePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showComparePolicy);
    }

    /**
     * 查询对比策略
     *
     * 查询对比策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComparePolicyRequest 请求对象
     * @return SyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse>
     */
    public SyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse> showComparePolicyInvoker(
        ShowComparePolicyRequest request) {
        return new SyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse>(request, DrsMeta.showComparePolicy,
            hcClient);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectCollectionStatusRequest 请求对象
     * @return ShowDbObjectCollectionStatusResponse
     */
    public ShowDbObjectCollectionStatusResponse showDbObjectCollectionStatus(
        ShowDbObjectCollectionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDbObjectCollectionStatus);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectCollectionStatusRequest 请求对象
     * @return SyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>
     */
    public SyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatusInvoker(
        ShowDbObjectCollectionStatusRequest request) {
        return new SyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>(request,
            DrsMeta.showDbObjectCollectionStatus, hcClient);
    }

    /**
     * 对象选择（文件导入 - 进度查询）
     *
     * 对象选择（文件导入 - 进度查询）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateProgressRequest 请求对象
     * @return ShowDbObjectTemplateProgressResponse
     */
    public ShowDbObjectTemplateProgressResponse showDbObjectTemplateProgress(
        ShowDbObjectTemplateProgressRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDbObjectTemplateProgress);
    }

    /**
     * 对象选择（文件导入 - 进度查询）
     *
     * 对象选择（文件导入 - 进度查询）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateProgressRequest 请求对象
     * @return SyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>
     */
    public SyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgressInvoker(
        ShowDbObjectTemplateProgressRequest request) {
        return new SyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>(request,
            DrsMeta.showDbObjectTemplateProgress, hcClient);
    }

    /**
     * 对象选择（文件导入 - 获取导入结果）
     *
     * 对象选择（文件导入 - 获取导入结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateResultRequest 请求对象
     * @return ShowDbObjectTemplateResultResponse
     */
    public ShowDbObjectTemplateResultResponse showDbObjectTemplateResult(ShowDbObjectTemplateResultRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDbObjectTemplateResult);
    }

    /**
     * 对象选择（文件导入 - 获取导入结果）
     *
     * 对象选择（文件导入 - 获取导入结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateResultRequest 请求对象
     * @return SyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>
     */
    public SyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> showDbObjectTemplateResultInvoker(
        ShowDbObjectTemplateResultRequest request) {
        return new SyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>(request,
            DrsMeta.showDbObjectTemplateResult, hcClient);
    }

    /**
     * 查询异常数据列表
     *
     * 查询异常数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDirtyDataRequest 请求对象
     * @return ShowDirtyDataResponse
     */
    public ShowDirtyDataResponse showDirtyData(ShowDirtyDataRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDirtyData);
    }

    /**
     * 查询异常数据列表
     *
     * 查询异常数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDirtyDataRequest 请求对象
     * @return SyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse>
     */
    public SyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse> showDirtyDataInvoker(ShowDirtyDataRequest request) {
        return new SyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse>(request, DrsMeta.showDirtyData, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return ShowEnterpriseProjectResponse
     */
    public ShowEnterpriseProjectResponse showEnterpriseProject(ShowEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showEnterpriseProject);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectInvoker(
        ShowEnterpriseProjectRequest request) {
        return new SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>(request,
            DrsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询健康对比列表
     *
     * 查询健康对比列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthCompareJobListRequest 请求对象
     * @return ShowHealthCompareJobListResponse
     */
    public ShowHealthCompareJobListResponse showHealthCompareJobList(ShowHealthCompareJobListRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showHealthCompareJobList);
    }

    /**
     * 查询健康对比列表
     *
     * 查询健康对比列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthCompareJobListRequest 请求对象
     * @return SyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse>
     */
    public SyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> showHealthCompareJobListInvoker(
        ShowHealthCompareJobListRequest request) {
        return new SyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse>(request,
            DrsMeta.showHealthCompareJobList, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showJobDetail);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DrsMeta.showJobDetail, hcClient);
    }

    /**
     * 获取任务价格信息
     *
     * 获取询价接口的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMeteringRequest 请求对象
     * @return ShowMeteringResponse
     */
    public ShowMeteringResponse showMetering(ShowMeteringRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showMetering);
    }

    /**
     * 获取任务价格信息
     *
     * 获取询价接口的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMeteringRequest 请求对象
     * @return SyncInvoker<ShowMeteringRequest, ShowMeteringResponse>
     */
    public SyncInvoker<ShowMeteringRequest, ShowMeteringResponse> showMeteringInvoker(ShowMeteringRequest request) {
        return new SyncInvoker<ShowMeteringRequest, ShowMeteringResponse>(request, DrsMeta.showMetering, hcClient);
    }

    /**
     * 查询同步映射列表
     *
     * 查询实时同步映射关系包括对象选择时的库映射、schema映射、表映射和数据加工时的列映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowObjectMappingRequest 请求对象
     * @return ShowObjectMappingResponse
     */
    public ShowObjectMappingResponse showObjectMapping(ShowObjectMappingRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showObjectMapping);
    }

    /**
     * 查询同步映射列表
     *
     * 查询实时同步映射关系包括对象选择时的库映射、schema映射、表映射和数据加工时的列映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowObjectMappingRequest 请求对象
     * @return SyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse>
     */
    public SyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse> showObjectMappingInvoker(
        ShowObjectMappingRequest request) {
        return new SyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse>(request, DrsMeta.showObjectMapping,
            hcClient);
    }

    /**
     * 查询数据级流式对比列表
     *
     * 查询不同迁移对象类型的迁移进度。
     * 说明：
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MongoDB-&gt;DDS、DDS-&gt;MongoDB的迁移支持查看迁移明细。
     * - 在任务未结束前，不能修改源库和目标库的所有用户、密码和用户权限等。
     * - 全量、增量完成不代表任务结束，如果存在触发器和事件将会进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProgressDataRequest 请求对象
     * @return ShowProgressDataResponse
     */
    public ShowProgressDataResponse showProgressData(ShowProgressDataRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showProgressData);
    }

    /**
     * 查询数据级流式对比列表
     *
     * 查询不同迁移对象类型的迁移进度。
     * 说明：
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MongoDB-&gt;DDS、DDS-&gt;MongoDB的迁移支持查看迁移明细。
     * - 在任务未结束前，不能修改源库和目标库的所有用户、密码和用户权限等。
     * - 全量、增量完成不代表任务结束，如果存在触发器和事件将会进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProgressDataRequest 请求对象
     * @return SyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse>
     */
    public SyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse> showProgressDataInvoker(
        ShowProgressDataRequest request) {
        return new SyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse>(request, DrsMeta.showProgressData,
            hcClient);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpdateObjectSavingStatusRequest 请求对象
     * @return ShowUpdateObjectSavingStatusResponse
     */
    public ShowUpdateObjectSavingStatusResponse showUpdateObjectSavingStatus(
        ShowUpdateObjectSavingStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showUpdateObjectSavingStatus);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpdateObjectSavingStatusRequest 请求对象
     * @return SyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>
     */
    public SyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatusInvoker(
        ShowUpdateObjectSavingStatusRequest request) {
        return new SyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>(request,
            DrsMeta.showUpdateObjectSavingStatus, hcClient);
    }

    /**
     * 更新指定ID批量异步任务详情
     *
     * 更新租户指定ID批量异步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchAsyncJobsRequest 请求对象
     * @return UpdateBatchAsyncJobsResponse
     */
    public UpdateBatchAsyncJobsResponse updateBatchAsyncJobs(UpdateBatchAsyncJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateBatchAsyncJobs);
    }

    /**
     * 更新指定ID批量异步任务详情
     *
     * 更新租户指定ID批量异步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchAsyncJobsRequest 请求对象
     * @return SyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>
     */
    public SyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> updateBatchAsyncJobsInvoker(
        UpdateBatchAsyncJobsRequest request) {
        return new SyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>(request,
            DrsMeta.updateBatchAsyncJobs, hcClient);
    }

    /**
     * 更新指定ID任务详情
     *
     * 更新租户指定ID任务详情。
     * 当type取值为db_object， 进行异步处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateJob);
    }

    /**
     * 更新指定ID任务详情
     *
     * 更新租户指定ID任务详情。
     * 当type取值为db_object， 进行异步处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, DrsMeta.updateJob, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDbObjectTemplateRequest 请求对象
     * @return UploadDbObjectTemplateResponse
     */
    public UploadDbObjectTemplateResponse uploadDbObjectTemplate(UploadDbObjectTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.uploadDbObjectTemplate);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDbObjectTemplateRequest 请求对象
     * @return SyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>
     */
    public SyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> uploadDbObjectTemplateInvoker(
        UploadDbObjectTemplateRequest request) {
        return new SyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>(request,
            DrsMeta.uploadDbObjectTemplate, hcClient);
    }

    /**
     * 任务名称校验
     *
     * 创建任务时对任务名称进行校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateJobNameRequest 请求对象
     * @return ValidateJobNameResponse
     */
    public ValidateJobNameResponse validateJobName(ValidateJobNameRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.validateJobName);
    }

    /**
     * 任务名称校验
     *
     * 创建任务时对任务名称进行校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateJobNameRequest 请求对象
     * @return SyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse>
     */
    public SyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse> validateJobNameInvoker(
        ValidateJobNameRequest request) {
        return new SyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse>(request, DrsMeta.validateJobName,
            hcClient);
    }

}

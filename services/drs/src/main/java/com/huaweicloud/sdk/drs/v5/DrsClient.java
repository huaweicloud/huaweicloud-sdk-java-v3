package com.huaweicloud.sdk.drs.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.drs.v5.model.*;

public class DrsClient {

    protected HcClient hcClient;

    public DrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsClient> newBuilder() {
        return new ClientBuilder<>(DrsClient::new);
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
     * 查询可用链路信息。
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
     * 查询可用链路信息。
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
     * 获取数据库对象信息的结果
     *
     * 获取数据库对象信息的结果
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
     * 获取数据库对象信息的结果
     *
     * 获取数据库对象信息的结果
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

}

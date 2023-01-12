package com.huaweicloud.sdk.drs.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.drs.v5.model.*;

import java.util.concurrent.CompletableFuture;

public class DrsAsyncClient {

    protected HcClient hcClient;

    public DrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DrsAsyncClient::new);
    }

    /**
     * 批量异步创建任务
     *
     * 批量异步创建任务，根据请求参数不同，可以批量异步创建实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateJobsAsyncRequest 请求对象
     * @return CompletableFuture<BatchCreateJobsAsyncResponse>
     */
    public CompletableFuture<BatchCreateJobsAsyncResponse> batchCreateJobsAsyncAsync(
        BatchCreateJobsAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCreateJobsAsync);
    }

    /**
     * 批量异步创建任务
     *
     * 批量异步创建任务，根据请求参数不同，可以批量异步创建实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateJobsAsyncRequest 请求对象
     * @return AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>
     */
    public AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> batchCreateJobsAsyncAsyncInvoker(
        BatchCreateJobsAsyncRequest request) {
        return new AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>(request,
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
     * @return CompletableFuture<BatchDeleteJobsByIdResponse>
     */
    public CompletableFuture<BatchDeleteJobsByIdResponse> batchDeleteJobsByIdAsync(BatchDeleteJobsByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchDeleteJobsById);
    }

    /**
     * 批量删除任务
     *
     * 批量删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobsByIdRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>
     */
    public AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> batchDeleteJobsByIdAsyncInvoker(
        BatchDeleteJobsByIdRequest request) {
        return new AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>(request,
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
     * @return CompletableFuture<BatchExecuteJobActionsResponse>
     */
    public CompletableFuture<BatchExecuteJobActionsResponse> batchExecuteJobActionsAsync(
        BatchExecuteJobActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchExecuteJobActions);
    }

    /**
     * 批量操作指定ID任务
     *
     * 批量操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExecuteJobActionsRequest 请求对象
     * @return AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>
     */
    public AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> batchExecuteJobActionsAsyncInvoker(
        BatchExecuteJobActionsRequest request) {
        return new AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>(request,
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
     * @return CompletableFuture<CollectDbObjectsAsyncResponse>
     */
    public CompletableFuture<CollectDbObjectsAsyncResponse> collectDbObjectsAsyncAsync(
        CollectDbObjectsAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectDbObjectsAsync);
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
     * @return AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>
     */
    public AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> collectDbObjectsAsyncAsyncInvoker(
        CollectDbObjectsAsyncRequest request) {
        return new AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>(request,
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
     * @return CompletableFuture<CommitAsyncJobResponse>
     */
    public CompletableFuture<CommitAsyncJobResponse> commitAsyncJobAsync(CommitAsyncJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.commitAsyncJob);
    }

    /**
     * 提交批量创建异步任务
     *
     * 提交批量创建异步任务，当批量异步任务创建或更新参数后，系统会自动开始进行参数校验，待所有任务成功完成参数校验后并且无报错时，可调用此接口开始创建DRS任务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitAsyncJobRequest 请求对象
     * @return AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>
     */
    public AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse> commitAsyncJobAsyncInvoker(
        CommitAsyncJobRequest request) {
        return new AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>(request, DrsMeta.commitAsyncJob,
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
     * @return CompletableFuture<CreateJobResponse>
     */
    public CompletableFuture<CreateJobResponse> createJobAsync(CreateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createJob);
    }

    /**
     * 创建任务
     *
     * 创建单个任务，根据请求参数不同，可以创建单个实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<CreateJobRequest, CreateJobResponse>(request, DrsMeta.createJob, hcClient);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteJob);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, DrsMeta.deleteJob, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDbObjectTemplateRequest 请求对象
     * @return CompletableFuture<DownloadDbObjectTemplateResponse>
     */
    public CompletableFuture<DownloadDbObjectTemplateResponse> downloadDbObjectTemplateAsync(
        DownloadDbObjectTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.downloadDbObjectTemplate);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDbObjectTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>
     */
    public AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> downloadDbObjectTemplateAsyncInvoker(
        DownloadDbObjectTemplateRequest request) {
        return new AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>(request,
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
     * @return CompletableFuture<ExecuteJobActionResponse>
     */
    public CompletableFuture<ExecuteJobActionResponse> executeJobActionAsync(ExecuteJobActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.executeJobAction);
    }

    /**
     * 操作指定ID任务
     *
     * 操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobActionRequest 请求对象
     * @return AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>
     */
    public AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse> executeJobActionAsyncInvoker(
        ExecuteJobActionRequest request) {
        return new AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>(request, DrsMeta.executeJobAction,
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
     * @return CompletableFuture<ListAsyncJobDetailResponse>
     */
    public CompletableFuture<ListAsyncJobDetailResponse> listAsyncJobDetailAsync(ListAsyncJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listAsyncJobDetail);
    }

    /**
     * 查询指定ID批量异步任务详情
     *
     * 查询租户指定ID批量异步任务详情，默认为任务的“create_time”降序排序获取结果，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobDetailRequest 请求对象
     * @return AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>
     */
    public AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> listAsyncJobDetailAsyncInvoker(
        ListAsyncJobDetailRequest request) {
        return new AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>(request,
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
     * @return CompletableFuture<ListAsyncJobsResponse>
     */
    public CompletableFuture<ListAsyncJobsResponse> listAsyncJobsAsync(ListAsyncJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listAsyncJobs);
    }

    /**
     * 查询批量异步创建的任务列表
     *
     * 查询租户批量异步创建的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobsRequest 请求对象
     * @return AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>
     */
    public AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse> listAsyncJobsAsyncInvoker(
        ListAsyncJobsRequest request) {
        return new AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>(request, DrsMeta.listAsyncJobs, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbObjectsRequest 请求对象
     * @return CompletableFuture<ListDbObjectsResponse>
     */
    public CompletableFuture<ListDbObjectsResponse> listDbObjectsAsync(ListDbObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listDbObjects);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbObjectsRequest 请求对象
     * @return AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>
     */
    public AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse> listDbObjectsAsyncInvoker(
        ListDbObjectsRequest request) {
        return new AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>(request, DrsMeta.listDbObjects, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listJobs);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, DrsMeta.listJobs, hcClient);
    }

    /**
     * 查询可用链路信息
     *
     * 查询可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLinksRequest 请求对象
     * @return CompletableFuture<ListLinksResponse>
     */
    public CompletableFuture<ListLinksResponse> listLinksAsync(ListLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listLinks);
    }

    /**
     * 查询可用链路信息
     *
     * 查询可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLinksRequest 请求对象
     * @return AsyncInvoker<ListLinksRequest, ListLinksResponse>
     */
    public AsyncInvoker<ListLinksRequest, ListLinksResponse> listLinksAsyncInvoker(ListLinksRequest request) {
        return new AsyncInvoker<ListLinksRequest, ListLinksResponse>(request, DrsMeta.listLinks, hcClient);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectCollectionStatusRequest 请求对象
     * @return CompletableFuture<ShowDbObjectCollectionStatusResponse>
     */
    public CompletableFuture<ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatusAsync(
        ShowDbObjectCollectionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectCollectionStatus);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectCollectionStatusRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>
     */
    public AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatusAsyncInvoker(
        ShowDbObjectCollectionStatusRequest request) {
        return new AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>(request,
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
     * @return CompletableFuture<ShowDbObjectTemplateProgressResponse>
     */
    public CompletableFuture<ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgressAsync(
        ShowDbObjectTemplateProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectTemplateProgress);
    }

    /**
     * 对象选择（文件导入 - 进度查询）
     *
     * 对象选择（文件导入 - 进度查询）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateProgressRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>
     */
    public AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgressAsyncInvoker(
        ShowDbObjectTemplateProgressRequest request) {
        return new AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>(request,
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
     * @return CompletableFuture<ShowDbObjectTemplateResultResponse>
     */
    public CompletableFuture<ShowDbObjectTemplateResultResponse> showDbObjectTemplateResultAsync(
        ShowDbObjectTemplateResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectTemplateResult);
    }

    /**
     * 对象选择（文件导入 - 获取导入结果）
     *
     * 对象选择（文件导入 - 获取导入结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateResultRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>
     */
    public AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> showDbObjectTemplateResultAsyncInvoker(
        ShowDbObjectTemplateResultRequest request) {
        return new AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>(request,
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
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showJobDetail);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DrsMeta.showJobDetail, hcClient);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpdateObjectSavingStatusRequest 请求对象
     * @return CompletableFuture<ShowUpdateObjectSavingStatusResponse>
     */
    public CompletableFuture<ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatusAsync(
        ShowUpdateObjectSavingStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showUpdateObjectSavingStatus);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpdateObjectSavingStatusRequest 请求对象
     * @return AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>
     */
    public AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatusAsyncInvoker(
        ShowUpdateObjectSavingStatusRequest request) {
        return new AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>(request,
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
     * @return CompletableFuture<UpdateBatchAsyncJobsResponse>
     */
    public CompletableFuture<UpdateBatchAsyncJobsResponse> updateBatchAsyncJobsAsync(
        UpdateBatchAsyncJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateBatchAsyncJobs);
    }

    /**
     * 更新指定ID批量异步任务详情
     *
     * 更新租户指定ID批量异步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchAsyncJobsRequest 请求对象
     * @return AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>
     */
    public AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> updateBatchAsyncJobsAsyncInvoker(
        UpdateBatchAsyncJobsRequest request) {
        return new AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>(request,
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
     * @return CompletableFuture<UpdateJobResponse>
     */
    public CompletableFuture<UpdateJobResponse> updateJobAsync(UpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateJob);
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
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, DrsMeta.updateJob, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDbObjectTemplateRequest 请求对象
     * @return CompletableFuture<UploadDbObjectTemplateResponse>
     */
    public CompletableFuture<UploadDbObjectTemplateResponse> uploadDbObjectTemplateAsync(
        UploadDbObjectTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.uploadDbObjectTemplate);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDbObjectTemplateRequest 请求对象
     * @return AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>
     */
    public AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> uploadDbObjectTemplateAsyncInvoker(
        UploadDbObjectTemplateRequest request) {
        return new AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>(request,
            DrsMeta.uploadDbObjectTemplate, hcClient);
    }

}

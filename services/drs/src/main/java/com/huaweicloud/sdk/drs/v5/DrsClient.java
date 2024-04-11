package com.huaweicloud.sdk.drs.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchStopJobsActionRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchStopJobsActionResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchTagActionRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchTagActionResponse;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterRequest;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectColumnsRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectColumnsResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectPositionAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectPositionAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CopyJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CopyJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CountInstanceByTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.CountInstanceByTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobHistoryParametersRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobHistoryParametersResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobParametersRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobParametersResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListLinksRequest;
import com.huaweicloud.sdk.drs.v5.model.ListLinksResponse;
import com.huaweicloud.sdk.drs.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListsAgencyPermissionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListsAgencyPermissionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataFilteringResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataFilteringResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProcessingRulesResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProcessingRulesResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectsListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectsListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowIncrementComponentsDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowIncrementComponentsDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowInstanceTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowInstanceTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowMonitorDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowMonitorDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowPositionResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowPositionResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowReplayResultsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowReplayResultsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.SyncJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.SyncJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverResponse;
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
     * @param request BatchCreateJobsAsyncRequest 请求对象
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
     * @param request BatchCreateJobsAsyncRequest 请求对象
     * @return SyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>
     */
    public SyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> batchCreateJobsAsyncInvoker(
        BatchCreateJobsAsyncRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchCreateJobsAsync, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return BatchCreateTagsResponse
     */
    public BatchCreateTagsResponse batchCreateTags(BatchCreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchCreateTags);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsInvoker(
        BatchCreateTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchCreateTags, hcClient);
    }

    /**
     * 批量删除任务
     *
     * 批量删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsByIdRequest 请求对象
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
     * @param request BatchDeleteJobsByIdRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>
     */
    public SyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> batchDeleteJobsByIdInvoker(
        BatchDeleteJobsByIdRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchDeleteJobsById, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchDeleteTags);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchDeleteTags, hcClient);
    }

    /**
     * 批量操作指定ID任务
     *
     * 批量操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteJobActionsRequest 请求对象
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
     * @param request BatchExecuteJobActionsRequest 请求对象
     * @return SyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>
     */
    public SyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> batchExecuteJobActionsInvoker(
        BatchExecuteJobActionsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchExecuteJobActions, hcClient);
    }

    /**
     * 批量结束任务
     *
     * 批量结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsActionRequest 请求对象
     * @return BatchStopJobsActionResponse
     */
    public BatchStopJobsActionResponse batchStopJobsAction(BatchStopJobsActionRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchStopJobsAction);
    }

    /**
     * 批量结束任务
     *
     * 批量结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsActionRequest 请求对象
     * @return SyncInvoker<BatchStopJobsActionRequest, BatchStopJobsActionResponse>
     */
    public SyncInvoker<BatchStopJobsActionRequest, BatchStopJobsActionResponse> batchStopJobsActionInvoker(
        BatchStopJobsActionRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchStopJobsAction, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return BatchTagActionResponse
     */
    public BatchTagActionResponse batchTagAction(BatchTagActionRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(
        BatchTagActionRequest request) {
        return new SyncInvoker<>(request, DrsMeta.batchTagAction, hcClient);
    }

    /**
     * 数据过滤规则校验
     *
     * 数据过滤规则校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataFilterRequest 请求对象
     * @return CheckDataFilterResponse
     */
    public CheckDataFilterResponse checkDataFilter(CheckDataFilterRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.checkDataFilter);
    }

    /**
     * 数据过滤规则校验
     *
     * 数据过滤规则校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataFilterRequest 请求对象
     * @return SyncInvoker<CheckDataFilterRequest, CheckDataFilterResponse>
     */
    public SyncInvoker<CheckDataFilterRequest, CheckDataFilterResponse> checkDataFilterInvoker(
        CheckDataFilterRequest request) {
        return new SyncInvoker<>(request, DrsMeta.checkDataFilter, hcClient);
    }

    /**
     * 采集指定数据库表的列信息
     *
     * 采集指定数据库表的列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectColumnsRequest 请求对象
     * @return CollectColumnsResponse
     */
    public CollectColumnsResponse collectColumns(CollectColumnsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.collectColumns);
    }

    /**
     * 采集指定数据库表的列信息
     *
     * 采集指定数据库表的列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectColumnsRequest 请求对象
     * @return SyncInvoker<CollectColumnsRequest, CollectColumnsResponse>
     */
    public SyncInvoker<CollectColumnsRequest, CollectColumnsResponse> collectColumnsInvoker(
        CollectColumnsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.collectColumns, hcClient);
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
     * @param request CollectDbObjectsAsyncRequest 请求对象
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
     * @param request CollectDbObjectsAsyncRequest 请求对象
     * @return SyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>
     */
    public SyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> collectDbObjectsAsyncInvoker(
        CollectDbObjectsAsyncRequest request) {
        return new SyncInvoker<>(request, DrsMeta.collectDbObjectsAsync, hcClient);
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
     * @param request CollectDbObjectsInfoRequest 请求对象
     * @return CollectDbObjectsInfoResponse
     */
    public CollectDbObjectsInfoResponse collectDbObjectsInfo(CollectDbObjectsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.collectDbObjectsInfo);
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
     * @param request CollectDbObjectsInfoRequest 请求对象
     * @return SyncInvoker<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse>
     */
    public SyncInvoker<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> collectDbObjectsInfoInvoker(
        CollectDbObjectsInfoRequest request) {
        return new SyncInvoker<>(request, DrsMeta.collectDbObjectsInfo, hcClient);
    }

    /**
     * 采集数据库位点信息
     *
     * 采集数据库位点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPositionAsyncRequest 请求对象
     * @return CollectPositionAsyncResponse
     */
    public CollectPositionAsyncResponse collectPositionAsync(CollectPositionAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.collectPositionAsync);
    }

    /**
     * 采集数据库位点信息
     *
     * 采集数据库位点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPositionAsyncRequest 请求对象
     * @return SyncInvoker<CollectPositionAsyncRequest, CollectPositionAsyncResponse>
     */
    public SyncInvoker<CollectPositionAsyncRequest, CollectPositionAsyncResponse> collectPositionAsyncInvoker(
        CollectPositionAsyncRequest request) {
        return new SyncInvoker<>(request, DrsMeta.collectPositionAsync, hcClient);
    }

    /**
     * 提交批量创建异步任务
     *
     * 提交批量创建异步任务，当批量异步任务创建或更新参数后，系统会自动开始进行参数校验，待所有任务成功完成参数校验后并且无报错时，可调用此接口开始创建DRS任务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitAsyncJobRequest 请求对象
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
     * @param request CommitAsyncJobRequest 请求对象
     * @return SyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>
     */
    public SyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse> commitAsyncJobInvoker(
        CommitAsyncJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.commitAsyncJob, hcClient);
    }

    /**
     * 克隆任务
     *
     * DRS支持通过克隆功能，快速复制现有同步任务的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyJobRequest 请求对象
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
     * @param request CopyJobRequest 请求对象
     * @return SyncInvoker<CopyJobRequest, CopyJobResponse>
     */
    public SyncInvoker<CopyJobRequest, CopyJobResponse> copyJobInvoker(CopyJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.copyJob, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInstanceByTagsRequest 请求对象
     * @return CountInstanceByTagsResponse
     */
    public CountInstanceByTagsResponse countInstanceByTags(CountInstanceByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.countInstanceByTags);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInstanceByTagsRequest 请求对象
     * @return SyncInvoker<CountInstanceByTagsRequest, CountInstanceByTagsResponse>
     */
    public SyncInvoker<CountInstanceByTagsRequest, CountInstanceByTagsResponse> countInstanceByTagsInvoker(
        CountInstanceByTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.countInstanceByTags, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建单个任务，根据请求参数不同，可以创建单个实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
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
     * @param request CreateJobRequest 请求对象
     * @return SyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public SyncInvoker<CreateJobRequest, CreateJobResponse> createJobInvoker(CreateJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.createJob, hcClient);
    }

    /**
     * 删除驱动文件
     *
     * 删除驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJdbcDriverRequest 请求对象
     * @return DeleteJdbcDriverResponse
     */
    public DeleteJdbcDriverResponse deleteJdbcDriver(DeleteJdbcDriverRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.deleteJdbcDriver);
    }

    /**
     * 删除驱动文件
     *
     * 删除驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJdbcDriverRequest 请求对象
     * @return SyncInvoker<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse>
     */
    public SyncInvoker<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse> deleteJdbcDriverInvoker(
        DeleteJdbcDriverRequest request) {
        return new SyncInvoker<>(request, DrsMeta.deleteJdbcDriver, hcClient);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
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
     * @param request DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.deleteJob, hcClient);
    }

    /**
     * 下载批量导入任务模板
     *
     * 下载批量导入任务模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBatchCreateTemplateRequest 请求对象
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
     * @param request DownloadBatchCreateTemplateRequest 请求对象
     * @return SyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse>
     */
    public SyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplateInvoker(
        DownloadBatchCreateTemplateRequest request) {
        return new SyncInvoker<>(request, DrsMeta.downloadBatchCreateTemplate, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDbObjectTemplateRequest 请求对象
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
     * @param request DownloadDbObjectTemplateRequest 请求对象
     * @return SyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>
     */
    public SyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> downloadDbObjectTemplateInvoker(
        DownloadDbObjectTemplateRequest request) {
        return new SyncInvoker<>(request, DrsMeta.downloadDbObjectTemplate, hcClient);
    }

    /**
     * 操作指定ID任务
     *
     * 操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobActionRequest 请求对象
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
     * @param request ExecuteJobActionRequest 请求对象
     * @return SyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>
     */
    public SyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse> executeJobActionInvoker(
        ExecuteJobActionRequest request) {
        return new SyncInvoker<>(request, DrsMeta.executeJobAction, hcClient);
    }

    /**
     * 导出任务操作统计信息
     *
     * 导出指定任务操作统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportOperationInfoRequest 请求对象
     * @return ExportOperationInfoResponse
     */
    public ExportOperationInfoResponse exportOperationInfo(ExportOperationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.exportOperationInfo);
    }

    /**
     * 导出任务操作统计信息
     *
     * 导出指定任务操作统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportOperationInfoRequest 请求对象
     * @return SyncInvoker<ExportOperationInfoRequest, ExportOperationInfoResponse>
     */
    public SyncInvoker<ExportOperationInfoRequest, ExportOperationInfoResponse> exportOperationInfoInvoker(
        ExportOperationInfoRequest request) {
        return new SyncInvoker<>(request, DrsMeta.exportOperationInfo, hcClient);
    }

    /**
     * 批量导入任务
     *
     * 批量导入任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBatchCreateJobsRequest 请求对象
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
     * @param request ImportBatchCreateJobsRequest 请求对象
     * @return SyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse>
     */
    public SyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> importBatchCreateJobsInvoker(
        ImportBatchCreateJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.importBatchCreateJobs, hcClient);
    }

    /**
     * 查询指定ID批量异步任务详情
     *
     * 查询租户指定ID批量异步任务详情，默认为任务的“create_time”降序排序获取结果，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncJobDetailRequest 请求对象
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
     * @param request ListAsyncJobDetailRequest 请求对象
     * @return SyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>
     */
    public SyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> listAsyncJobDetailInvoker(
        ListAsyncJobDetailRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listAsyncJobDetail, hcClient);
    }

    /**
     * 查询批量异步创建的任务列表
     *
     * 查询租户批量异步创建的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncJobsRequest 请求对象
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
     * @param request ListAsyncJobsRequest 请求对象
     * @return SyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>
     */
    public SyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse> listAsyncJobsInvoker(ListAsyncJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listAsyncJobs, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbObjectsRequest 请求对象
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
     * @param request ListDbObjectsRequest 请求对象
     * @return SyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>
     */
    public SyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse> listDbObjectsInvoker(ListDbObjectsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listDbObjects, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceByTagsRequest 请求对象
     * @return ListInstanceByTagsResponse
     */
    public ListInstanceByTagsResponse listInstanceByTags(ListInstanceByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listInstanceByTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceByTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceByTagsRequest, ListInstanceByTagsResponse>
     */
    public SyncInvoker<ListInstanceByTagsRequest, ListInstanceByTagsResponse> listInstanceByTagsInvoker(
        ListInstanceByTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listInstanceByTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询驱动文件列表
     *
     * 查询驱动文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJdbcDriversRequest 请求对象
     * @return ListJdbcDriversResponse
     */
    public ListJdbcDriversResponse listJdbcDrivers(ListJdbcDriversRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listJdbcDrivers);
    }

    /**
     * 查询驱动文件列表
     *
     * 查询驱动文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJdbcDriversRequest 请求对象
     * @return SyncInvoker<ListJdbcDriversRequest, ListJdbcDriversResponse>
     */
    public SyncInvoker<ListJdbcDriversRequest, ListJdbcDriversResponse> listJdbcDriversInvoker(
        ListJdbcDriversRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listJdbcDrivers, hcClient);
    }

    /**
     * 查询任务的参数配置修改历史
     *
     * 查询任务的参数配置修改历史
     * - 仅engine_type为mysql、mysql-to-pgl、mysql-to-gaussdbv5、mysql-to-gaussdbv5ha、mysql-to-dws、mysql-to-taurus、mysql-to-kafka、mysql-to-elasticsearch、mysql-to-oracle且任务状态只能为配置中、全量中、增量中、全量失败、增量失败、暂停中的实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobHistoryParametersRequest 请求对象
     * @return ListJobHistoryParametersResponse
     */
    public ListJobHistoryParametersResponse listJobHistoryParameters(ListJobHistoryParametersRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listJobHistoryParameters);
    }

    /**
     * 查询任务的参数配置修改历史
     *
     * 查询任务的参数配置修改历史
     * - 仅engine_type为mysql、mysql-to-pgl、mysql-to-gaussdbv5、mysql-to-gaussdbv5ha、mysql-to-dws、mysql-to-taurus、mysql-to-kafka、mysql-to-elasticsearch、mysql-to-oracle且任务状态只能为配置中、全量中、增量中、全量失败、增量失败、暂停中的实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobHistoryParametersRequest 请求对象
     * @return SyncInvoker<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse>
     */
    public SyncInvoker<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse> listJobHistoryParametersInvoker(
        ListJobHistoryParametersRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listJobHistoryParameters, hcClient);
    }

    /**
     * 查询任务参数配置列表
     *
     * 查询任务的参数配置列表信息
     * - 仅engine_type为mysql、mysql-to-pgl、mysql-to-gaussdbv5、mysql-to-gaussdbv5ha、mysql-to-dws、mysql-to-taurus、mysql-to-kafka、mysql-to-elasticsearch、mysql-to-oracle且任务状态只能为配置中、全量中、增量中、全量失败、增量失败、暂停中的实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobParametersRequest 请求对象
     * @return ListJobParametersResponse
     */
    public ListJobParametersResponse listJobParameters(ListJobParametersRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listJobParameters);
    }

    /**
     * 查询任务参数配置列表
     *
     * 查询任务的参数配置列表信息
     * - 仅engine_type为mysql、mysql-to-pgl、mysql-to-gaussdbv5、mysql-to-gaussdbv5ha、mysql-to-dws、mysql-to-taurus、mysql-to-kafka、mysql-to-elasticsearch、mysql-to-oracle且任务状态只能为配置中、全量中、增量中、全量失败、增量失败、暂停中的实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobParametersRequest 请求对象
     * @return SyncInvoker<ListJobParametersRequest, ListJobParametersResponse>
     */
    public SyncInvoker<ListJobParametersRequest, ListJobParametersResponse> listJobParametersInvoker(
        ListJobParametersRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listJobParameters, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
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
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listJobs, hcClient);
    }

    /**
     * 查询可用链路信息
     *
     * 根据参数不同，可查询实时迁移、实时同步、实时灾备等可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLinksRequest 请求对象
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
     * @param request ListLinksRequest 请求对象
     * @return SyncInvoker<ListLinksRequest, ListLinksResponse>
     */
    public SyncInvoker<ListLinksRequest, ListLinksResponse> listLinksInvoker(ListLinksRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listLinks, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下不同任务类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下不同任务类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listProjectTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listTags, hcClient);
    }

    /**
     * 查询委托的权限列表
     *
     * 根据源库类型，目标库类型，是否自建，获取委托所需要的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListsAgencyPermissionsRequest 请求对象
     * @return ListsAgencyPermissionsResponse
     */
    public ListsAgencyPermissionsResponse listsAgencyPermissions(ListsAgencyPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.listsAgencyPermissions);
    }

    /**
     * 查询委托的权限列表
     *
     * 根据源库类型，目标库类型，是否自建，获取委托所需要的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListsAgencyPermissionsRequest 请求对象
     * @return SyncInvoker<ListsAgencyPermissionsRequest, ListsAgencyPermissionsResponse>
     */
    public SyncInvoker<ListsAgencyPermissionsRequest, ListsAgencyPermissionsResponse> listsAgencyPermissionsInvoker(
        ListsAgencyPermissionsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.listsAgencyPermissions, hcClient);
    }

    /**
     * 获取指定任务操作信息
     *
     * 获取指定任务允许、不允许、当前操作信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActionsRequest 请求对象
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
     * @param request ShowActionsRequest 请求对象
     * @return SyncInvoker<ShowActionsRequest, ShowActionsResponse>
     */
    public SyncInvoker<ShowActionsRequest, ShowActionsResponse> showActionsInvoker(ShowActionsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showActions, hcClient);
    }

    /**
     * 获取指定数据库表列信息
     *
     * 获取指定数据库表列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowColumnInfoResultRequest 请求对象
     * @return ShowColumnInfoResultResponse
     */
    public ShowColumnInfoResultResponse showColumnInfoResult(ShowColumnInfoResultRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showColumnInfoResult);
    }

    /**
     * 获取指定数据库表列信息
     *
     * 获取指定数据库表列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowColumnInfoResultRequest 请求对象
     * @return SyncInvoker<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse>
     */
    public SyncInvoker<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> showColumnInfoResultInvoker(
        ShowColumnInfoResultRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showColumnInfoResult, hcClient);
    }

    /**
     * 查询对比策略
     *
     * 查询对比策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComparePolicyRequest 请求对象
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
     * @param request ShowComparePolicyRequest 请求对象
     * @return SyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse>
     */
    public SyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse> showComparePolicyInvoker(
        ShowComparePolicyRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showComparePolicy, hcClient);
    }

    /**
     * 获取数据过滤校验结果
     *
     * 获取数据过滤校验结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataFilteringResultRequest 请求对象
     * @return ShowDataFilteringResultResponse
     */
    public ShowDataFilteringResultResponse showDataFilteringResult(ShowDataFilteringResultRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDataFilteringResult);
    }

    /**
     * 获取数据过滤校验结果
     *
     * 获取数据过滤校验结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataFilteringResultRequest 请求对象
     * @return SyncInvoker<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse>
     */
    public SyncInvoker<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> showDataFilteringResultInvoker(
        ShowDataFilteringResultRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDataFilteringResult, hcClient);
    }

    /**
     * 获取指定任务数据加工规则更新结果
     *
     * 获取指定任务数据加工规则更新结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProcessingRulesResultRequest 请求对象
     * @return ShowDataProcessingRulesResultResponse
     */
    public ShowDataProcessingRulesResultResponse showDataProcessingRulesResult(
        ShowDataProcessingRulesResultRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDataProcessingRulesResult);
    }

    /**
     * 获取指定任务数据加工规则更新结果
     *
     * 获取指定任务数据加工规则更新结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProcessingRulesResultRequest 请求对象
     * @return SyncInvoker<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse>
     */
    public SyncInvoker<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> showDataProcessingRulesResultInvoker(
        ShowDataProcessingRulesResultRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDataProcessingRulesResult, hcClient);
    }

    /**
     * 查询数据加工规则
     *
     * 查询数据加工规则:包含数据库表的映射信息、列信息、数据过滤信息、附加列信息、DDL以及DML信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProgressRequest 请求对象
     * @return ShowDataProgressResponse
     */
    public ShowDataProgressResponse showDataProgress(ShowDataProgressRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDataProgress);
    }

    /**
     * 查询数据加工规则
     *
     * 查询数据加工规则:包含数据库表的映射信息、列信息、数据过滤信息、附加列信息、DDL以及DML信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProgressRequest 请求对象
     * @return SyncInvoker<ShowDataProgressRequest, ShowDataProgressResponse>
     */
    public SyncInvoker<ShowDataProgressRequest, ShowDataProgressResponse> showDataProgressInvoker(
        ShowDataProgressRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDataProgress, hcClient);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectCollectionStatusRequest 请求对象
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
     * @param request ShowDbObjectCollectionStatusRequest 请求对象
     * @return SyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>
     */
    public SyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatusInvoker(
        ShowDbObjectCollectionStatusRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDbObjectCollectionStatus, hcClient);
    }

    /**
     * 对象选择（文件导入 - 进度查询）
     *
     * 对象选择（文件导入 - 进度查询）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectTemplateProgressRequest 请求对象
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
     * @param request ShowDbObjectTemplateProgressRequest 请求对象
     * @return SyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>
     */
    public SyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgressInvoker(
        ShowDbObjectTemplateProgressRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDbObjectTemplateProgress, hcClient);
    }

    /**
     * 对象选择（文件导入 - 获取导入结果）
     *
     * 对象选择（文件导入 - 获取导入结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectTemplateResultRequest 请求对象
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
     * @param request ShowDbObjectTemplateResultRequest 请求对象
     * @return SyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>
     */
    public SyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> showDbObjectTemplateResultInvoker(
        ShowDbObjectTemplateResultRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDbObjectTemplateResult, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectsListRequest 请求对象
     * @return ShowDbObjectsListResponse
     */
    public ShowDbObjectsListResponse showDbObjectsList(ShowDbObjectsListRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showDbObjectsList);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectsListRequest 请求对象
     * @return SyncInvoker<ShowDbObjectsListRequest, ShowDbObjectsListResponse>
     */
    public SyncInvoker<ShowDbObjectsListRequest, ShowDbObjectsListResponse> showDbObjectsListInvoker(
        ShowDbObjectsListRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDbObjectsList, hcClient);
    }

    /**
     * 查询异常数据列表
     *
     * 查询异常数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirtyDataRequest 请求对象
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
     * @param request ShowDirtyDataRequest 请求对象
     * @return SyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse>
     */
    public SyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse> showDirtyDataInvoker(ShowDirtyDataRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showDirtyData, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectRequest 请求对象
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
     * @param request ShowEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public SyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectInvoker(
        ShowEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询健康对比列表
     *
     * 查询健康对比列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCompareJobListRequest 请求对象
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
     * @param request ShowHealthCompareJobListRequest 请求对象
     * @return SyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse>
     */
    public SyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> showHealthCompareJobListInvoker(
        ShowHealthCompareJobListRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showHealthCompareJobList, hcClient);
    }

    /**
     * 查询增量组件详情
     *
     * 查询任务同步的增量组件的详细信息，实时同步任务，任务模式为增量或者全量+增量才支持。具体介绍可以参考：[查询同步进度](https://support.huaweicloud.com/realtimesyn-drs/drs_10_0007.html)
     * - 支持的引擎：oracle-to-gaussdbv5，oracle-to-gaussdbv5ha，gaussdbv5，gaussdbv5-to-mysql，gaussdbv5-to-gaussdbv5ha，gaussdbv5ha，gaussdbv5ha-to-gaussdbv5，gaussdbv5-to-dws，gaussdbv5ha-to-dws，gaussdbv5-to-oracle，gaussdbv5ha-to-oracle，oracle-to-dws，oracle-to-mysql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncrementComponentsDetailRequest 请求对象
     * @return ShowIncrementComponentsDetailResponse
     */
    public ShowIncrementComponentsDetailResponse showIncrementComponentsDetail(
        ShowIncrementComponentsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showIncrementComponentsDetail);
    }

    /**
     * 查询增量组件详情
     *
     * 查询任务同步的增量组件的详细信息，实时同步任务，任务模式为增量或者全量+增量才支持。具体介绍可以参考：[查询同步进度](https://support.huaweicloud.com/realtimesyn-drs/drs_10_0007.html)
     * - 支持的引擎：oracle-to-gaussdbv5，oracle-to-gaussdbv5ha，gaussdbv5，gaussdbv5-to-mysql，gaussdbv5-to-gaussdbv5ha，gaussdbv5ha，gaussdbv5ha-to-gaussdbv5，gaussdbv5-to-dws，gaussdbv5ha-to-dws，gaussdbv5-to-oracle，gaussdbv5ha-to-oracle，oracle-to-dws，oracle-to-mysql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncrementComponentsDetailRequest 请求对象
     * @return SyncInvoker<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse>
     */
    public SyncInvoker<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> showIncrementComponentsDetailInvoker(
        ShowIncrementComponentsDetailRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showIncrementComponentsDetail, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTagsRequest 请求对象
     * @return ShowInstanceTagsResponse
     */
    public ShowInstanceTagsResponse showInstanceTags(ShowInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTagsRequest 请求对象
     * @return SyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse>
     */
    public SyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTagsInvoker(
        ShowInstanceTagsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showInstanceTags, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
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
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showJobDetail, hcClient);
    }

    /**
     * 获取任务价格信息
     *
     * 获取询价接口的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeteringRequest 请求对象
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
     * @param request ShowMeteringRequest 请求对象
     * @return SyncInvoker<ShowMeteringRequest, ShowMeteringResponse>
     */
    public SyncInvoker<ShowMeteringRequest, ShowMeteringResponse> showMeteringInvoker(ShowMeteringRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showMetering, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 获取任务监控数据。
     * - Cassandra灾备不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorDataRequest 请求对象
     * @return ShowMonitorDataResponse
     */
    public ShowMonitorDataResponse showMonitorData(ShowMonitorDataRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showMonitorData);
    }

    /**
     * 查询监控数据
     *
     * 获取任务监控数据。
     * - Cassandra灾备不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorDataRequest 请求对象
     * @return SyncInvoker<ShowMonitorDataRequest, ShowMonitorDataResponse>
     */
    public SyncInvoker<ShowMonitorDataRequest, ShowMonitorDataResponse> showMonitorDataInvoker(
        ShowMonitorDataRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showMonitorData, hcClient);
    }

    /**
     * 查询同步映射列表
     *
     * 查询实时同步映射关系包括对象选择时的库映射、schema映射、表映射和数据加工时的列映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowObjectMappingRequest 请求对象
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
     * @param request ShowObjectMappingRequest 请求对象
     * @return SyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse>
     */
    public SyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse> showObjectMappingInvoker(
        ShowObjectMappingRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showObjectMapping, hcClient);
    }

    /**
     * 获取查询数据库位点的结果
     *
     * 获取查询数据库位点的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPositionResultRequest 请求对象
     * @return ShowPositionResultResponse
     */
    public ShowPositionResultResponse showPositionResult(ShowPositionResultRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showPositionResult);
    }

    /**
     * 获取查询数据库位点的结果
     *
     * 获取查询数据库位点的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPositionResultRequest 请求对象
     * @return SyncInvoker<ShowPositionResultRequest, ShowPositionResultResponse>
     */
    public SyncInvoker<ShowPositionResultRequest, ShowPositionResultResponse> showPositionResultInvoker(
        ShowPositionResultRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showPositionResult, hcClient);
    }

    /**
     * 查询数据级流式对比列表
     *
     * 查询不同迁移对象类型的迁移进度。
     * 说明：
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MongoDB-&gt;DDS、DDS-&gt;MongoDB的实时迁移和所有实时同步链路支持查看迁移明细。
     * - 在任务未结束前，不能修改源库和目标库的所有用户、密码和用户权限等。
     * - 全量、增量完成不代表任务结束，如果存在触发器和事件将会进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressDataRequest 请求对象
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
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MongoDB-&gt;DDS、DDS-&gt;MongoDB的实时迁移和所有实时同步链路支持查看迁移明细。
     * - 在任务未结束前，不能修改源库和目标库的所有用户、密码和用户权限等。
     * - 全量、增量完成不代表任务结束，如果存在触发器和事件将会进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressDataRequest 请求对象
     * @return SyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse>
     */
    public SyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse> showProgressDataInvoker(
        ShowProgressDataRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showProgressData, hcClient);
    }

    /**
     * 查询录制回放结果
     *
     * 获取录制回放结果数据，包括：回放基于时间维度统计信息，异常SQL及统计结果、慢SQL及统计结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplayResultsRequest 请求对象
     * @return ShowReplayResultsResponse
     */
    public ShowReplayResultsResponse showReplayResults(ShowReplayResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showReplayResults);
    }

    /**
     * 查询录制回放结果
     *
     * 获取录制回放结果数据，包括：回放基于时间维度统计信息，异常SQL及统计结果、慢SQL及统计结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplayResultsRequest 请求对象
     * @return SyncInvoker<ShowReplayResultsRequest, ShowReplayResultsResponse>
     */
    public SyncInvoker<ShowReplayResultsRequest, ShowReplayResultsResponse> showReplayResultsInvoker(
        ShowReplayResultsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showReplayResults, hcClient);
    }

    /**
     * 查询是否支持对象选择和列映射
     *
     * 查询任务支持的对象选择类型、列映射、支持搜索的对象类型等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportObjectTypeRequest 请求对象
     * @return ShowSupportObjectTypeResponse
     */
    public ShowSupportObjectTypeResponse showSupportObjectType(ShowSupportObjectTypeRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.showSupportObjectType);
    }

    /**
     * 查询是否支持对象选择和列映射
     *
     * 查询任务支持的对象选择类型、列映射、支持搜索的对象类型等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportObjectTypeRequest 请求对象
     * @return SyncInvoker<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse>
     */
    public SyncInvoker<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> showSupportObjectTypeInvoker(
        ShowSupportObjectTypeRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showSupportObjectType, hcClient);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateObjectSavingStatusRequest 请求对象
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
     * @param request ShowUpdateObjectSavingStatusRequest 请求对象
     * @return SyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>
     */
    public SyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatusInvoker(
        ShowUpdateObjectSavingStatusRequest request) {
        return new SyncInvoker<>(request, DrsMeta.showUpdateObjectSavingStatus, hcClient);
    }

    /**
     * 结束任务
     *
     * 结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobActionRequest 请求对象
     * @return StopJobActionResponse
     */
    public StopJobActionResponse stopJobAction(StopJobActionRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.stopJobAction);
    }

    /**
     * 结束任务
     *
     * 结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobActionRequest 请求对象
     * @return SyncInvoker<StopJobActionRequest, StopJobActionResponse>
     */
    public SyncInvoker<StopJobActionRequest, StopJobActionResponse> stopJobActionInvoker(StopJobActionRequest request) {
        return new SyncInvoker<>(request, DrsMeta.stopJobAction, hcClient);
    }

    /**
     * 同步驱动文件
     *
     * 同步驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncJdbcDriverRequest 请求对象
     * @return SyncJdbcDriverResponse
     */
    public SyncJdbcDriverResponse syncJdbcDriver(SyncJdbcDriverRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.syncJdbcDriver);
    }

    /**
     * 同步驱动文件
     *
     * 同步驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncJdbcDriverRequest 请求对象
     * @return SyncInvoker<SyncJdbcDriverRequest, SyncJdbcDriverResponse>
     */
    public SyncInvoker<SyncJdbcDriverRequest, SyncJdbcDriverResponse> syncJdbcDriverInvoker(
        SyncJdbcDriverRequest request) {
        return new SyncInvoker<>(request, DrsMeta.syncJdbcDriver, hcClient);
    }

    /**
     * 更新指定ID批量异步任务详情
     *
     * 更新租户指定ID批量异步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchAsyncJobsRequest 请求对象
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
     * @param request UpdateBatchAsyncJobsRequest 请求对象
     * @return SyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>
     */
    public SyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> updateBatchAsyncJobsInvoker(
        UpdateBatchAsyncJobsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.updateBatchAsyncJobs, hcClient);
    }

    /**
     * 更新指定任务数据加工规则
     *
     * 更新指定任务数据加工规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataProgressRequest 请求对象
     * @return UpdateDataProgressResponse
     */
    public UpdateDataProgressResponse updateDataProgress(UpdateDataProgressRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateDataProgress);
    }

    /**
     * 更新指定任务数据加工规则
     *
     * 更新指定任务数据加工规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataProgressRequest 请求对象
     * @return SyncInvoker<UpdateDataProgressRequest, UpdateDataProgressResponse>
     */
    public SyncInvoker<UpdateDataProgressRequest, UpdateDataProgressResponse> updateDataProgressInvoker(
        UpdateDataProgressRequest request) {
        return new SyncInvoker<>(request, DrsMeta.updateDataProgress, hcClient);
    }

    /**
     * 更新指定ID任务详情
     *
     * 更新租户指定ID任务详情。
     * 当type取值为db_object， 进行异步处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
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
     * @param request UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<>(request, DrsMeta.updateJob, hcClient);
    }

    /**
     * 更新任务的参数信息
     *
     * 更新任务的参数信息。
     * - 仅engine_type为mysql、mysql-to-pgl、mysql-to-gaussdbv5、mysql-to-gaussdbv5ha、mysql-to-dws、mysql-to-taurus、mysql-to-kafka、mysql-to-elasticsearch、mysql-to-oracle且任务状态只能为配置中、全量中、增量中、全量失败、增量失败、暂停中的实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobConfigurationsRequest 请求对象
     * @return UpdateJobConfigurationsResponse
     */
    public UpdateJobConfigurationsResponse updateJobConfigurations(UpdateJobConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateJobConfigurations);
    }

    /**
     * 更新任务的参数信息
     *
     * 更新任务的参数信息。
     * - 仅engine_type为mysql、mysql-to-pgl、mysql-to-gaussdbv5、mysql-to-gaussdbv5ha、mysql-to-dws、mysql-to-taurus、mysql-to-kafka、mysql-to-elasticsearch、mysql-to-oracle且任务状态只能为配置中、全量中、增量中、全量失败、增量失败、暂停中的实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobConfigurationsRequest 请求对象
     * @return SyncInvoker<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse>
     */
    public SyncInvoker<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse> updateJobConfigurationsInvoker(
        UpdateJobConfigurationsRequest request) {
        return new SyncInvoker<>(request, DrsMeta.updateJobConfigurations, hcClient);
    }

    /**
     * 更新增量任务启动位点
     *
     * 更新增量任务的启动位点。
     * - 仅engine_type为mysql,mysql-to-dws,mysql-to-taurus,taurus,mysql-to-oracle,taurus-to-oracle,taurus-to-mysql,mysql-to-kafka,taurus-to-kafka,mongodb-to-kafka,mongodb且为单增量实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStartPositionRequest 请求对象
     * @return UpdateStartPositionResponse
     */
    public UpdateStartPositionResponse updateStartPosition(UpdateStartPositionRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.updateStartPosition);
    }

    /**
     * 更新增量任务启动位点
     *
     * 更新增量任务的启动位点。
     * - 仅engine_type为mysql,mysql-to-dws,mysql-to-taurus,taurus,mysql-to-oracle,taurus-to-oracle,taurus-to-mysql,mysql-to-kafka,taurus-to-kafka,mongodb-to-kafka,mongodb且为单增量实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStartPositionRequest 请求对象
     * @return SyncInvoker<UpdateStartPositionRequest, UpdateStartPositionResponse>
     */
    public SyncInvoker<UpdateStartPositionRequest, UpdateStartPositionResponse> updateStartPositionInvoker(
        UpdateStartPositionRequest request) {
        return new SyncInvoker<>(request, DrsMeta.updateStartPosition, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadDbObjectTemplateRequest 请求对象
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
     * @param request UploadDbObjectTemplateRequest 请求对象
     * @return SyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>
     */
    public SyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> uploadDbObjectTemplateInvoker(
        UploadDbObjectTemplateRequest request) {
        return new SyncInvoker<>(request, DrsMeta.uploadDbObjectTemplate, hcClient);
    }

    /**
     * 上传驱动文件
     *
     * 上传驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJdbcDriverRequest 请求对象
     * @return UploadJdbcDriverResponse
     */
    public UploadJdbcDriverResponse uploadJdbcDriver(UploadJdbcDriverRequest request) {
        return hcClient.syncInvokeHttp(request, DrsMeta.uploadJdbcDriver);
    }

    /**
     * 上传驱动文件
     *
     * 上传驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJdbcDriverRequest 请求对象
     * @return SyncInvoker<UploadJdbcDriverRequest, UploadJdbcDriverResponse>
     */
    public SyncInvoker<UploadJdbcDriverRequest, UploadJdbcDriverResponse> uploadJdbcDriverInvoker(
        UploadJdbcDriverRequest request) {
        return new SyncInvoker<>(request, DrsMeta.uploadJdbcDriver, hcClient);
    }

    /**
     * 任务名称校验
     *
     * 创建任务时对任务名称进行校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateJobNameRequest 请求对象
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
     * @param request ValidateJobNameRequest 请求对象
     * @return SyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse>
     */
    public SyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse> validateJobNameInvoker(
        ValidateJobNameRequest request) {
        return new SyncInvoker<>(request, DrsMeta.validateJobName, hcClient);
    }

}

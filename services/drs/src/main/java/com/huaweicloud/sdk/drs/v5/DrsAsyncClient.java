package com.huaweicloud.sdk.drs.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.drs.v5.model.ChangeToPeriodRequest;
import com.huaweicloud.sdk.drs.v5.model.ChangeToPeriodResponse;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterRequest;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterResponse;
import com.huaweicloud.sdk.drs.v5.model.CleanAlarmsRequest;
import com.huaweicloud.sdk.drs.v5.model.CleanAlarmsResponse;
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
import com.huaweicloud.sdk.drs.v5.model.CreateConnectionRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateConnectionResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateReplicationJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteColumnInfosRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteColumnInfosResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteReplicationJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteUserJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteUserJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadCreateTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadCreateTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.ExportCreationTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.ExportCreationTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListConnectionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListConnectionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceByTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJdbcDriversResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobDdlsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobDdlsResponse;
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
import com.huaweicloud.sdk.drs.v5.model.ListReplicationJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListReplicationJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListTemplatesRequest;
import com.huaweicloud.sdk.drs.v5.model.ListTemplatesResponse;
import com.huaweicloud.sdk.drs.v5.model.ListUserJdbcDriversRequest;
import com.huaweicloud.sdk.drs.v5.model.ListUserJdbcDriversResponse;
import com.huaweicloud.sdk.drs.v5.model.ListsAgencyPermissionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListsAgencyPermissionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ModifyColumnInfosRequest;
import com.huaweicloud.sdk.drs.v5.model.ModifyColumnInfosResponse;
import com.huaweicloud.sdk.drs.v5.model.ModifyConnectionRequest;
import com.huaweicloud.sdk.drs.v5.model.ModifyConnectionResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowAgencyInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowAgencyInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfosRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfosResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowCompareProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowCompareProgressResponse;
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
import com.huaweicloud.sdk.drs.v5.model.ShowExportProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowExportProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthObjectCompareJobOverviewRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthObjectCompareJobOverviewResponse;
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
import com.huaweicloud.sdk.drs.v5.model.ShowReplayProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowReplayProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowReplayResultsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowReplayResultsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowReplicationJobResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowSubscriptionListsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowSubscriptionListsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowTimelineRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowTimelineResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.SyncJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.SyncJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.SyncUserJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.SyncUserJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateAgencyPolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateAgencyPolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateComparePolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateComparePolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobConfigurationsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateReplicationJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateReplicationJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadUserJdbcDriverRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadUserJdbcDriverResponse;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameRequest;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameResponse;

import java.util.concurrent.CompletableFuture;

public class DrsAsyncClient {

    protected HcClient hcClient;

    public DrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsAsyncClient> newBuilder() {
        ClientBuilder<DrsAsyncClient> clientBuilder = new ClientBuilder<>(DrsAsyncClient::new);
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
     * @param request BatchCreateJobsAsyncRequest 请求对象
     * @return AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>
     */
    public AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> batchCreateJobsAsyncAsyncInvoker(
        BatchCreateJobsAsyncRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchCreateJobsAsync, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateTagsResponse>
     */
    public CompletableFuture<BatchCreateTagsResponse> batchCreateTagsAsync(BatchCreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCreateTags);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsAsyncInvoker(
        BatchCreateTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchCreateTags, hcClient);
    }

    /**
     * 批量删除任务
     *
     * 批量删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsByIdRequest 请求对象
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
     * @param request BatchDeleteJobsByIdRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>
     */
    public AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> batchDeleteJobsByIdAsyncInvoker(
        BatchDeleteJobsByIdRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchDeleteJobsById, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchDeleteTags);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchDeleteTags, hcClient);
    }

    /**
     * 批量操作指定ID任务
     *
     * 批量操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteJobActionsRequest 请求对象
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
     * @param request BatchExecuteJobActionsRequest 请求对象
     * @return AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>
     */
    public AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> batchExecuteJobActionsAsyncInvoker(
        BatchExecuteJobActionsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchExecuteJobActions, hcClient);
    }

    /**
     * 批量结束任务
     *
     * 批量结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsActionRequest 请求对象
     * @return CompletableFuture<BatchStopJobsActionResponse>
     */
    public CompletableFuture<BatchStopJobsActionResponse> batchStopJobsActionAsync(BatchStopJobsActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchStopJobsAction);
    }

    /**
     * 批量结束任务
     *
     * 批量结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopJobsActionRequest 请求对象
     * @return AsyncInvoker<BatchStopJobsActionRequest, BatchStopJobsActionResponse>
     */
    public AsyncInvoker<BatchStopJobsActionRequest, BatchStopJobsActionResponse> batchStopJobsActionAsyncInvoker(
        BatchStopJobsActionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchStopJobsAction, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    @Deprecated
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    @Deprecated
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.batchTagAction, hcClient);
    }

    /**
     * 按需转包周期
     *
     * DRS同步和灾备任务按需计费转包周期计费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeToPeriodRequest 请求对象
     * @return CompletableFuture<ChangeToPeriodResponse>
     */
    public CompletableFuture<ChangeToPeriodResponse> changeToPeriodAsync(ChangeToPeriodRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.changeToPeriod);
    }

    /**
     * 按需转包周期
     *
     * DRS同步和灾备任务按需计费转包周期计费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeToPeriodRequest 请求对象
     * @return AsyncInvoker<ChangeToPeriodRequest, ChangeToPeriodResponse>
     */
    public AsyncInvoker<ChangeToPeriodRequest, ChangeToPeriodResponse> changeToPeriodAsyncInvoker(
        ChangeToPeriodRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.changeToPeriod, hcClient);
    }

    /**
     * 数据过滤规则校验
     *
     * 数据过滤规则校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataFilterRequest 请求对象
     * @return CompletableFuture<CheckDataFilterResponse>
     */
    public CompletableFuture<CheckDataFilterResponse> checkDataFilterAsync(CheckDataFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.checkDataFilter);
    }

    /**
     * 数据过滤规则校验
     *
     * 数据过滤规则校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataFilterRequest 请求对象
     * @return AsyncInvoker<CheckDataFilterRequest, CheckDataFilterResponse>
     */
    public AsyncInvoker<CheckDataFilterRequest, CheckDataFilterResponse> checkDataFilterAsyncInvoker(
        CheckDataFilterRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.checkDataFilter, hcClient);
    }

    /**
     * 清除DDL告警
     *
     * 清除DDL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanAlarmsRequest 请求对象
     * @return CompletableFuture<CleanAlarmsResponse>
     */
    public CompletableFuture<CleanAlarmsResponse> cleanAlarmsAsync(CleanAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.cleanAlarms);
    }

    /**
     * 清除DDL告警
     *
     * 清除DDL告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanAlarmsRequest 请求对象
     * @return AsyncInvoker<CleanAlarmsRequest, CleanAlarmsResponse>
     */
    public AsyncInvoker<CleanAlarmsRequest, CleanAlarmsResponse> cleanAlarmsAsyncInvoker(CleanAlarmsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.cleanAlarms, hcClient);
    }

    /**
     * 采集指定数据库表的列信息
     *
     * 采集指定数据库表的列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectColumnsRequest 请求对象
     * @return CompletableFuture<CollectColumnsResponse>
     */
    public CompletableFuture<CollectColumnsResponse> collectColumnsAsync(CollectColumnsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectColumns);
    }

    /**
     * 采集指定数据库表的列信息
     *
     * 采集指定数据库表的列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectColumnsRequest 请求对象
     * @return AsyncInvoker<CollectColumnsRequest, CollectColumnsResponse>
     */
    public AsyncInvoker<CollectColumnsRequest, CollectColumnsResponse> collectColumnsAsyncInvoker(
        CollectColumnsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.collectColumns, hcClient);
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
     * @return CompletableFuture<CollectDbObjectsAsyncResponse>
     */
    @Deprecated
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
     * @param request CollectDbObjectsAsyncRequest 请求对象
     * @return AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>
     */
    @Deprecated
    public AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> collectDbObjectsAsyncAsyncInvoker(
        CollectDbObjectsAsyncRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.collectDbObjectsAsync, hcClient);
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
     * @return CompletableFuture<CollectDbObjectsInfoResponse>
     */
    public CompletableFuture<CollectDbObjectsInfoResponse> collectDbObjectsInfoAsync(
        CollectDbObjectsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectDbObjectsInfo);
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
     * @return AsyncInvoker<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse>
     */
    public AsyncInvoker<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> collectDbObjectsInfoAsyncInvoker(
        CollectDbObjectsInfoRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.collectDbObjectsInfo, hcClient);
    }

    /**
     * 采集数据库位点信息
     *
     * 采集数据库位点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPositionAsyncRequest 请求对象
     * @return CompletableFuture<CollectPositionAsyncResponse>
     */
    public CompletableFuture<CollectPositionAsyncResponse> collectPositionAsyncAsync(
        CollectPositionAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectPositionAsync);
    }

    /**
     * 采集数据库位点信息
     *
     * 采集数据库位点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPositionAsyncRequest 请求对象
     * @return AsyncInvoker<CollectPositionAsyncRequest, CollectPositionAsyncResponse>
     */
    public AsyncInvoker<CollectPositionAsyncRequest, CollectPositionAsyncResponse> collectPositionAsyncAsyncInvoker(
        CollectPositionAsyncRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.collectPositionAsync, hcClient);
    }

    /**
     * 提交批量创建异步任务
     *
     * 提交批量创建异步任务，当批量异步任务创建或更新参数后，系统会自动开始进行参数校验，待所有任务成功完成参数校验后并且无报错时，可调用此接口开始创建DRS任务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitAsyncJobRequest 请求对象
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
     * @param request CommitAsyncJobRequest 请求对象
     * @return AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>
     */
    public AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse> commitAsyncJobAsyncInvoker(
        CommitAsyncJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.commitAsyncJob, hcClient);
    }

    /**
     * 克隆任务
     *
     * DRS支持通过克隆功能，快速复制现有同步任务的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyJobRequest 请求对象
     * @return CompletableFuture<CopyJobResponse>
     */
    public CompletableFuture<CopyJobResponse> copyJobAsync(CopyJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.copyJob);
    }

    /**
     * 克隆任务
     *
     * DRS支持通过克隆功能，快速复制现有同步任务的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyJobRequest 请求对象
     * @return AsyncInvoker<CopyJobRequest, CopyJobResponse>
     */
    public AsyncInvoker<CopyJobRequest, CopyJobResponse> copyJobAsyncInvoker(CopyJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.copyJob, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInstanceByTagsRequest 请求对象
     * @return CompletableFuture<CountInstanceByTagsResponse>
     */
    public CompletableFuture<CountInstanceByTagsResponse> countInstanceByTagsAsync(CountInstanceByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.countInstanceByTags);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInstanceByTagsRequest 请求对象
     * @return AsyncInvoker<CountInstanceByTagsRequest, CountInstanceByTagsResponse>
     */
    public AsyncInvoker<CountInstanceByTagsRequest, CountInstanceByTagsResponse> countInstanceByTagsAsyncInvoker(
        CountInstanceByTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.countInstanceByTags, hcClient);
    }

    /**
     * 创建连接
     *
     * 创建单个连接，该连接可以为线下自建库或云上RDS等，目前支持的数据库引擎包括MySQL、PostgreSQL、Oracle和MongoDB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createConnection);
    }

    /**
     * 创建连接
     *
     * 创建单个连接，该连接可以为线下自建库或云上RDS等，目前支持的数据库引擎包括MySQL、PostgreSQL、Oracle和MongoDB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionAsyncInvoker(
        CreateConnectionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.createConnection, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建单个任务，根据请求参数不同，可以创建单个实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
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
     * @param request CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.createJob, hcClient);
    }

    /**
     * 创建备份迁移任务
     *
     * 该接口主要用于三种常见场景下备份迁移任务的配置。
     * 备份迁移支持如下的常见场景：
     * - 通过OBS桶备份文件进行全量数据迁移。
     * - 通过OBS桶备份文件进行全量+增量数据迁移。
     * - 通过RDS全量备份进行全量数据迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReplicationJobRequest 请求对象
     * @return CompletableFuture<CreateReplicationJobResponse>
     */
    public CompletableFuture<CreateReplicationJobResponse> createReplicationJobAsync(
        CreateReplicationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createReplicationJob);
    }

    /**
     * 创建备份迁移任务
     *
     * 该接口主要用于三种常见场景下备份迁移任务的配置。
     * 备份迁移支持如下的常见场景：
     * - 通过OBS桶备份文件进行全量数据迁移。
     * - 通过OBS桶备份文件进行全量+增量数据迁移。
     * - 通过RDS全量备份进行全量数据迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReplicationJobRequest 请求对象
     * @return AsyncInvoker<CreateReplicationJobRequest, CreateReplicationJobResponse>
     */
    public AsyncInvoker<CreateReplicationJobRequest, CreateReplicationJobResponse> createReplicationJobAsyncInvoker(
        CreateReplicationJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.createReplicationJob, hcClient);
    }

    /**
     * 删除对象的列信息（列映射、列过滤）
     *
     * 删除对象的列信息（列映射、列过滤）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteColumnInfosRequest 请求对象
     * @return CompletableFuture<DeleteColumnInfosResponse>
     */
    public CompletableFuture<DeleteColumnInfosResponse> deleteColumnInfosAsync(DeleteColumnInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteColumnInfos);
    }

    /**
     * 删除对象的列信息（列映射、列过滤）
     *
     * 删除对象的列信息（列映射、列过滤）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteColumnInfosRequest 请求对象
     * @return AsyncInvoker<DeleteColumnInfosRequest, DeleteColumnInfosResponse>
     */
    public AsyncInvoker<DeleteColumnInfosRequest, DeleteColumnInfosResponse> deleteColumnInfosAsyncInvoker(
        DeleteColumnInfosRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.deleteColumnInfos, hcClient);
    }

    /**
     * 删除连接
     *
     * 删除租户指定的连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return CompletableFuture<DeleteConnectionResponse>
     */
    public CompletableFuture<DeleteConnectionResponse> deleteConnectionAsync(DeleteConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteConnection);
    }

    /**
     * 删除连接
     *
     * 删除租户指定的连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionAsyncInvoker(
        DeleteConnectionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.deleteConnection, hcClient);
    }

    /**
     * 删除驱动文件（不再推广）
     *
     * 删除驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJdbcDriverRequest 请求对象
     * @return CompletableFuture<DeleteJdbcDriverResponse>
     */
    public CompletableFuture<DeleteJdbcDriverResponse> deleteJdbcDriverAsync(DeleteJdbcDriverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteJdbcDriver);
    }

    /**
     * 删除驱动文件（不再推广）
     *
     * 删除驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJdbcDriverRequest 请求对象
     * @return AsyncInvoker<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse>
     */
    public AsyncInvoker<DeleteJdbcDriverRequest, DeleteJdbcDriverResponse> deleteJdbcDriverAsyncInvoker(
        DeleteJdbcDriverRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.deleteJdbcDriver, hcClient);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
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
     * @param request DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.deleteJob, hcClient);
    }

    /**
     * 删除备份迁移任务
     *
     * 对于已经完成的备份迁移任务，可以选择删除迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReplicationJobRequest 请求对象
     * @return CompletableFuture<DeleteReplicationJobResponse>
     */
    public CompletableFuture<DeleteReplicationJobResponse> deleteReplicationJobAsync(
        DeleteReplicationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteReplicationJob);
    }

    /**
     * 删除备份迁移任务
     *
     * 对于已经完成的备份迁移任务，可以选择删除迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReplicationJobRequest 请求对象
     * @return AsyncInvoker<DeleteReplicationJobRequest, DeleteReplicationJobResponse>
     */
    public AsyncInvoker<DeleteReplicationJobRequest, DeleteReplicationJobResponse> deleteReplicationJobAsyncInvoker(
        DeleteReplicationJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.deleteReplicationJob, hcClient);
    }

    /**
     * 删除驱动文件
     *
     * 删除驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserJdbcDriverRequest 请求对象
     * @return CompletableFuture<DeleteUserJdbcDriverResponse>
     */
    public CompletableFuture<DeleteUserJdbcDriverResponse> deleteUserJdbcDriverAsync(
        DeleteUserJdbcDriverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteUserJdbcDriver);
    }

    /**
     * 删除驱动文件
     *
     * 删除驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserJdbcDriverRequest 请求对象
     * @return AsyncInvoker<DeleteUserJdbcDriverRequest, DeleteUserJdbcDriverResponse>
     */
    public AsyncInvoker<DeleteUserJdbcDriverRequest, DeleteUserJdbcDriverResponse> deleteUserJdbcDriverAsyncInvoker(
        DeleteUserJdbcDriverRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.deleteUserJdbcDriver, hcClient);
    }

    /**
     * 下载批量导入任务模板
     *
     * 下载批量导入任务模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBatchCreateTemplateRequest 请求对象
     * @return CompletableFuture<DownloadBatchCreateTemplateResponse>
     */
    public CompletableFuture<DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplateAsync(
        DownloadBatchCreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.downloadBatchCreateTemplate);
    }

    /**
     * 下载批量导入任务模板
     *
     * 下载批量导入任务模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBatchCreateTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse>
     */
    public AsyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplateAsyncInvoker(
        DownloadBatchCreateTemplateRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.downloadBatchCreateTemplate, hcClient);
    }

    /**
     * 下载创建模板
     *
     * 下载根据已有任务导出的创建模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCreateTemplateRequest 请求对象
     * @return CompletableFuture<DownloadCreateTemplateResponse>
     */
    public CompletableFuture<DownloadCreateTemplateResponse> downloadCreateTemplateAsync(
        DownloadCreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.downloadCreateTemplate);
    }

    /**
     * 下载创建模板
     *
     * 下载根据已有任务导出的创建模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadCreateTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadCreateTemplateRequest, DownloadCreateTemplateResponse>
     */
    public AsyncInvoker<DownloadCreateTemplateRequest, DownloadCreateTemplateResponse> downloadCreateTemplateAsyncInvoker(
        DownloadCreateTemplateRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.downloadCreateTemplate, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadDbObjectTemplateRequest 请求对象
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
     * @param request DownloadDbObjectTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>
     */
    public AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> downloadDbObjectTemplateAsyncInvoker(
        DownloadDbObjectTemplateRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.downloadDbObjectTemplate, hcClient);
    }

    /**
     * 操作指定ID任务
     *
     * 操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobActionRequest 请求对象
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
     * @param request ExecuteJobActionRequest 请求对象
     * @return AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>
     */
    public AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse> executeJobActionAsyncInvoker(
        ExecuteJobActionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.executeJobAction, hcClient);
    }

    /**
     * 导出创建模板
     *
     * 根据已有任务导出创建模板。（异步操作，需要调查询导出进度接口查询结果。）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCreationTemplateRequest 请求对象
     * @return CompletableFuture<ExportCreationTemplateResponse>
     */
    public CompletableFuture<ExportCreationTemplateResponse> exportCreationTemplateAsync(
        ExportCreationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.exportCreationTemplate);
    }

    /**
     * 导出创建模板
     *
     * 根据已有任务导出创建模板。（异步操作，需要调查询导出进度接口查询结果。）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCreationTemplateRequest 请求对象
     * @return AsyncInvoker<ExportCreationTemplateRequest, ExportCreationTemplateResponse>
     */
    public AsyncInvoker<ExportCreationTemplateRequest, ExportCreationTemplateResponse> exportCreationTemplateAsyncInvoker(
        ExportCreationTemplateRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.exportCreationTemplate, hcClient);
    }

    /**
     * 导出任务操作统计信息
     *
     * 导出指定任务操作统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportOperationInfoRequest 请求对象
     * @return CompletableFuture<ExportOperationInfoResponse>
     */
    public CompletableFuture<ExportOperationInfoResponse> exportOperationInfoAsync(ExportOperationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.exportOperationInfo);
    }

    /**
     * 导出任务操作统计信息
     *
     * 导出指定任务操作统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportOperationInfoRequest 请求对象
     * @return AsyncInvoker<ExportOperationInfoRequest, ExportOperationInfoResponse>
     */
    public AsyncInvoker<ExportOperationInfoRequest, ExportOperationInfoResponse> exportOperationInfoAsyncInvoker(
        ExportOperationInfoRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.exportOperationInfo, hcClient);
    }

    /**
     * 批量导入任务
     *
     * 批量导入任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBatchCreateJobsRequest 请求对象
     * @return CompletableFuture<ImportBatchCreateJobsResponse>
     */
    public CompletableFuture<ImportBatchCreateJobsResponse> importBatchCreateJobsAsync(
        ImportBatchCreateJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.importBatchCreateJobs);
    }

    /**
     * 批量导入任务
     *
     * 批量导入任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBatchCreateJobsRequest 请求对象
     * @return AsyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse>
     */
    public AsyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> importBatchCreateJobsAsyncInvoker(
        ImportBatchCreateJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.importBatchCreateJobs, hcClient);
    }

    /**
     * 查询指定ID批量异步任务详情
     *
     * 查询租户指定ID批量异步任务详情，默认为任务的“create_time”降序排序获取结果，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncJobDetailRequest 请求对象
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
     * @param request ListAsyncJobDetailRequest 请求对象
     * @return AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>
     */
    public AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> listAsyncJobDetailAsyncInvoker(
        ListAsyncJobDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listAsyncJobDetail, hcClient);
    }

    /**
     * 查询批量异步创建的任务列表
     *
     * 查询租户批量异步创建的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncJobsRequest 请求对象
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
     * @param request ListAsyncJobsRequest 请求对象
     * @return AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>
     */
    public AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse> listAsyncJobsAsyncInvoker(
        ListAsyncJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listAsyncJobs, hcClient);
    }

    /**
     * 查询连接列表
     *
     * 查询连接列表，可根据连接类型进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listConnections);
    }

    /**
     * 查询连接列表
     *
     * 查询连接列表，可根据连接类型进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listConnections, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbObjectsRequest 请求对象
     * @return CompletableFuture<ListDbObjectsResponse>
     */
    @Deprecated
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
     * @param request ListDbObjectsRequest 请求对象
     * @return AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse> listDbObjectsAsyncInvoker(
        ListDbObjectsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listDbObjects, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceByTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceByTagsResponse>
     */
    public CompletableFuture<ListInstanceByTagsResponse> listInstanceByTagsAsync(ListInstanceByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listInstanceByTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceByTagsRequest, ListInstanceByTagsResponse>
     */
    public AsyncInvoker<ListInstanceByTagsRequest, ListInstanceByTagsResponse> listInstanceByTagsAsyncInvoker(
        ListInstanceByTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listInstanceByTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询驱动文件列表（不再推广）
     *
     * 查询驱动文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJdbcDriversRequest 请求对象
     * @return CompletableFuture<ListJdbcDriversResponse>
     */
    public CompletableFuture<ListJdbcDriversResponse> listJdbcDriversAsync(ListJdbcDriversRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listJdbcDrivers);
    }

    /**
     * 查询驱动文件列表（不再推广）
     *
     * 查询驱动文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJdbcDriversRequest 请求对象
     * @return AsyncInvoker<ListJdbcDriversRequest, ListJdbcDriversResponse>
     */
    public AsyncInvoker<ListJdbcDriversRequest, ListJdbcDriversResponse> listJdbcDriversAsyncInvoker(
        ListJdbcDriversRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listJdbcDrivers, hcClient);
    }

    /**
     * 查询增量DDL列表
     *
     * 查询增量DDL列表，可根据status查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobDdlsRequest 请求对象
     * @return CompletableFuture<ListJobDdlsResponse>
     */
    public CompletableFuture<ListJobDdlsResponse> listJobDdlsAsync(ListJobDdlsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listJobDdls);
    }

    /**
     * 查询增量DDL列表
     *
     * 查询增量DDL列表，可根据status查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobDdlsRequest 请求对象
     * @return AsyncInvoker<ListJobDdlsRequest, ListJobDdlsResponse>
     */
    public AsyncInvoker<ListJobDdlsRequest, ListJobDdlsResponse> listJobDdlsAsyncInvoker(ListJobDdlsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listJobDdls, hcClient);
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
     * @return CompletableFuture<ListJobHistoryParametersResponse>
     */
    public CompletableFuture<ListJobHistoryParametersResponse> listJobHistoryParametersAsync(
        ListJobHistoryParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listJobHistoryParameters);
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
     * @return AsyncInvoker<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse>
     */
    public AsyncInvoker<ListJobHistoryParametersRequest, ListJobHistoryParametersResponse> listJobHistoryParametersAsyncInvoker(
        ListJobHistoryParametersRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listJobHistoryParameters, hcClient);
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
     * @return CompletableFuture<ListJobParametersResponse>
     */
    public CompletableFuture<ListJobParametersResponse> listJobParametersAsync(ListJobParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listJobParameters);
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
     * @return AsyncInvoker<ListJobParametersRequest, ListJobParametersResponse>
     */
    public AsyncInvoker<ListJobParametersRequest, ListJobParametersResponse> listJobParametersAsyncInvoker(
        ListJobParametersRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listJobParameters, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
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
     * @param request ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listJobs, hcClient);
    }

    /**
     * 查询可用链路信息
     *
     * 根据参数不同，可查询实时迁移、实时同步、实时灾备等可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLinksRequest 请求对象
     * @return CompletableFuture<ListLinksResponse>
     */
    public CompletableFuture<ListLinksResponse> listLinksAsync(ListLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listLinks);
    }

    /**
     * 查询可用链路信息
     *
     * 根据参数不同，可查询实时迁移、实时同步、实时灾备等可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLinksRequest 请求对象
     * @return AsyncInvoker<ListLinksRequest, ListLinksResponse>
     */
    public AsyncInvoker<ListLinksRequest, ListLinksResponse> listLinksAsyncInvoker(ListLinksRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listLinks, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下不同任务类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    @Deprecated
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下不同任务类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listProjectTags, hcClient);
    }

    /**
     * 查询备份迁移任务列表
     *
     * 获取当前备份迁移任务列表，不包含已删除的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReplicationJobsRequest 请求对象
     * @return CompletableFuture<ListReplicationJobsResponse>
     */
    public CompletableFuture<ListReplicationJobsResponse> listReplicationJobsAsync(ListReplicationJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listReplicationJobs);
    }

    /**
     * 查询备份迁移任务列表
     *
     * 获取当前备份迁移任务列表，不包含已删除的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReplicationJobsRequest 请求对象
     * @return AsyncInvoker<ListReplicationJobsRequest, ListReplicationJobsResponse>
     */
    public AsyncInvoker<ListReplicationJobsRequest, ListReplicationJobsResponse> listReplicationJobsAsyncInvoker(
        ListReplicationJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listReplicationJobs, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listTags, hcClient);
    }

    /**
     * 查询创建模板列表
     *
     * 查询批量创建模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listTemplates);
    }

    /**
     * 查询创建模板列表
     *
     * 查询批量创建模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listTemplates, hcClient);
    }

    /**
     * 查询驱动文件列表
     *
     * 查询驱动文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserJdbcDriversRequest 请求对象
     * @return CompletableFuture<ListUserJdbcDriversResponse>
     */
    public CompletableFuture<ListUserJdbcDriversResponse> listUserJdbcDriversAsync(ListUserJdbcDriversRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listUserJdbcDrivers);
    }

    /**
     * 查询驱动文件列表
     *
     * 查询驱动文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserJdbcDriversRequest 请求对象
     * @return AsyncInvoker<ListUserJdbcDriversRequest, ListUserJdbcDriversResponse>
     */
    public AsyncInvoker<ListUserJdbcDriversRequest, ListUserJdbcDriversResponse> listUserJdbcDriversAsyncInvoker(
        ListUserJdbcDriversRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listUserJdbcDrivers, hcClient);
    }

    /**
     * 查询委托的权限列表
     *
     * 根据源库类型，目标库类型，是否自建，获取委托所需要的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListsAgencyPermissionsRequest 请求对象
     * @return CompletableFuture<ListsAgencyPermissionsResponse>
     */
    public CompletableFuture<ListsAgencyPermissionsResponse> listsAgencyPermissionsAsync(
        ListsAgencyPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listsAgencyPermissions);
    }

    /**
     * 查询委托的权限列表
     *
     * 根据源库类型，目标库类型，是否自建，获取委托所需要的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListsAgencyPermissionsRequest 请求对象
     * @return AsyncInvoker<ListsAgencyPermissionsRequest, ListsAgencyPermissionsResponse>
     */
    public AsyncInvoker<ListsAgencyPermissionsRequest, ListsAgencyPermissionsResponse> listsAgencyPermissionsAsyncInvoker(
        ListsAgencyPermissionsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.listsAgencyPermissions, hcClient);
    }

    /**
     * 修改对象的列信息（列映射、列过滤）
     *
     * 修改对象的列信息（列映射、列过滤）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyColumnInfosRequest 请求对象
     * @return CompletableFuture<ModifyColumnInfosResponse>
     */
    public CompletableFuture<ModifyColumnInfosResponse> modifyColumnInfosAsync(ModifyColumnInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.modifyColumnInfos);
    }

    /**
     * 修改对象的列信息（列映射、列过滤）
     *
     * 修改对象的列信息（列映射、列过滤）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyColumnInfosRequest 请求对象
     * @return AsyncInvoker<ModifyColumnInfosRequest, ModifyColumnInfosResponse>
     */
    public AsyncInvoker<ModifyColumnInfosRequest, ModifyColumnInfosResponse> modifyColumnInfosAsyncInvoker(
        ModifyColumnInfosRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.modifyColumnInfos, hcClient);
    }

    /**
     * 修改连接
     *
     * 修改创建的连接信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConnectionRequest 请求对象
     * @return CompletableFuture<ModifyConnectionResponse>
     */
    public CompletableFuture<ModifyConnectionResponse> modifyConnectionAsync(ModifyConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.modifyConnection);
    }

    /**
     * 修改连接
     *
     * 修改创建的连接信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConnectionRequest 请求对象
     * @return AsyncInvoker<ModifyConnectionRequest, ModifyConnectionResponse>
     */
    public AsyncInvoker<ModifyConnectionRequest, ModifyConnectionResponse> modifyConnectionAsyncInvoker(
        ModifyConnectionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.modifyConnection, hcClient);
    }

    /**
     * 获取指定任务操作信息
     *
     * 获取指定任务允许、不允许、当前操作信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActionsRequest 请求对象
     * @return CompletableFuture<ShowActionsResponse>
     */
    public CompletableFuture<ShowActionsResponse> showActionsAsync(ShowActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showActions);
    }

    /**
     * 获取指定任务操作信息
     *
     * 获取指定任务允许、不允许、当前操作信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActionsRequest 请求对象
     * @return AsyncInvoker<ShowActionsRequest, ShowActionsResponse>
     */
    public AsyncInvoker<ShowActionsRequest, ShowActionsResponse> showActionsAsyncInvoker(ShowActionsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showActions, hcClient);
    }

    /**
     * 查询委托权限详情
     *
     * 查询委托权限详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyInfoRequest 请求对象
     * @return CompletableFuture<ShowAgencyInfoResponse>
     */
    public CompletableFuture<ShowAgencyInfoResponse> showAgencyInfoAsync(ShowAgencyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showAgencyInfo);
    }

    /**
     * 查询委托权限详情
     *
     * 查询委托权限详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyInfoRequest 请求对象
     * @return AsyncInvoker<ShowAgencyInfoRequest, ShowAgencyInfoResponse>
     */
    public AsyncInvoker<ShowAgencyInfoRequest, ShowAgencyInfoResponse> showAgencyInfoAsyncInvoker(
        ShowAgencyInfoRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showAgencyInfo, hcClient);
    }

    /**
     * 获取指定数据库表列信息
     *
     * 获取指定数据库表列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowColumnInfoResultRequest 请求对象
     * @return CompletableFuture<ShowColumnInfoResultResponse>
     */
    public CompletableFuture<ShowColumnInfoResultResponse> showColumnInfoResultAsync(
        ShowColumnInfoResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showColumnInfoResult);
    }

    /**
     * 获取指定数据库表列信息
     *
     * 获取指定数据库表列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowColumnInfoResultRequest 请求对象
     * @return AsyncInvoker<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse>
     */
    public AsyncInvoker<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> showColumnInfoResultAsyncInvoker(
        ShowColumnInfoResultRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showColumnInfoResult, hcClient);
    }

    /**
     * 查询对象的列信息（列映射、列过滤）
     *
     * 查询对象的列信息（列映射、列过滤）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowColumnInfosRequest 请求对象
     * @return CompletableFuture<ShowColumnInfosResponse>
     */
    public CompletableFuture<ShowColumnInfosResponse> showColumnInfosAsync(ShowColumnInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showColumnInfos);
    }

    /**
     * 查询对象的列信息（列映射、列过滤）
     *
     * 查询对象的列信息（列映射、列过滤）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowColumnInfosRequest 请求对象
     * @return AsyncInvoker<ShowColumnInfosRequest, ShowColumnInfosResponse>
     */
    public AsyncInvoker<ShowColumnInfosRequest, ShowColumnInfosResponse> showColumnInfosAsyncInvoker(
        ShowColumnInfosRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showColumnInfos, hcClient);
    }

    /**
     * 查询对比策略
     *
     * 查询对比策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComparePolicyRequest 请求对象
     * @return CompletableFuture<ShowComparePolicyResponse>
     */
    public CompletableFuture<ShowComparePolicyResponse> showComparePolicyAsync(ShowComparePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showComparePolicy);
    }

    /**
     * 查询对比策略
     *
     * 查询对比策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComparePolicyRequest 请求对象
     * @return AsyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse>
     */
    public AsyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse> showComparePolicyAsyncInvoker(
        ShowComparePolicyRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showComparePolicy, hcClient);
    }

    /**
     * 查询对比任务进度
     *
     * 查询运行中对比任务的对比进度。
     * 说明：
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB主备、GaussDB分布式-&gt;GaussDB分布式、GaussDB主备-&gt;MySQL、GaussDBv1-&gt;GaussDB主备、GaussDB主备-&gt;GaussDBv1的同步任务与独立校验任务支持查看对比进度。
     * - 运行中的行对比与内容对比支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompareProgressRequest 请求对象
     * @return CompletableFuture<ShowCompareProgressResponse>
     */
    public CompletableFuture<ShowCompareProgressResponse> showCompareProgressAsync(ShowCompareProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showCompareProgress);
    }

    /**
     * 查询对比任务进度
     *
     * 查询运行中对比任务的对比进度。
     * 说明：
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB主备、GaussDB分布式-&gt;GaussDB分布式、GaussDB主备-&gt;MySQL、GaussDBv1-&gt;GaussDB主备、GaussDB主备-&gt;GaussDBv1的同步任务与独立校验任务支持查看对比进度。
     * - 运行中的行对比与内容对比支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompareProgressRequest 请求对象
     * @return AsyncInvoker<ShowCompareProgressRequest, ShowCompareProgressResponse>
     */
    public AsyncInvoker<ShowCompareProgressRequest, ShowCompareProgressResponse> showCompareProgressAsyncInvoker(
        ShowCompareProgressRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showCompareProgress, hcClient);
    }

    /**
     * 获取数据过滤校验结果
     *
     * 获取数据过滤校验结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataFilteringResultRequest 请求对象
     * @return CompletableFuture<ShowDataFilteringResultResponse>
     */
    public CompletableFuture<ShowDataFilteringResultResponse> showDataFilteringResultAsync(
        ShowDataFilteringResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDataFilteringResult);
    }

    /**
     * 获取数据过滤校验结果
     *
     * 获取数据过滤校验结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataFilteringResultRequest 请求对象
     * @return AsyncInvoker<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse>
     */
    public AsyncInvoker<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> showDataFilteringResultAsyncInvoker(
        ShowDataFilteringResultRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDataFilteringResult, hcClient);
    }

    /**
     * 获取指定任务数据加工规则更新结果
     *
     * 获取指定任务数据加工规则更新结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProcessingRulesResultRequest 请求对象
     * @return CompletableFuture<ShowDataProcessingRulesResultResponse>
     */
    public CompletableFuture<ShowDataProcessingRulesResultResponse> showDataProcessingRulesResultAsync(
        ShowDataProcessingRulesResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDataProcessingRulesResult);
    }

    /**
     * 获取指定任务数据加工规则更新结果
     *
     * 获取指定任务数据加工规则更新结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProcessingRulesResultRequest 请求对象
     * @return AsyncInvoker<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse>
     */
    public AsyncInvoker<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> showDataProcessingRulesResultAsyncInvoker(
        ShowDataProcessingRulesResultRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDataProcessingRulesResult, hcClient);
    }

    /**
     * 查询数据加工规则
     *
     * 查询数据加工规则:包含数据库表的映射信息、列信息、数据过滤信息、附加列信息、DDL以及DML信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProgressRequest 请求对象
     * @return CompletableFuture<ShowDataProgressResponse>
     */
    public CompletableFuture<ShowDataProgressResponse> showDataProgressAsync(ShowDataProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDataProgress);
    }

    /**
     * 查询数据加工规则
     *
     * 查询数据加工规则:包含数据库表的映射信息、列信息、数据过滤信息、附加列信息、DDL以及DML信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataProgressRequest 请求对象
     * @return AsyncInvoker<ShowDataProgressRequest, ShowDataProgressResponse>
     */
    public AsyncInvoker<ShowDataProgressRequest, ShowDataProgressResponse> showDataProgressAsyncInvoker(
        ShowDataProgressRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDataProgress, hcClient);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectCollectionStatusRequest 请求对象
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
     * @param request ShowDbObjectCollectionStatusRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>
     */
    public AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatusAsyncInvoker(
        ShowDbObjectCollectionStatusRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDbObjectCollectionStatus, hcClient);
    }

    /**
     * 对象选择（文件导入 - 进度查询）
     *
     * 对象选择（文件导入 - 进度查询）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectTemplateProgressRequest 请求对象
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
     * @param request ShowDbObjectTemplateProgressRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>
     */
    public AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgressAsyncInvoker(
        ShowDbObjectTemplateProgressRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDbObjectTemplateProgress, hcClient);
    }

    /**
     * 对象选择（文件导入 - 获取导入结果）
     *
     * 对象选择（文件导入 - 获取导入结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectTemplateResultRequest 请求对象
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
     * @param request ShowDbObjectTemplateResultRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>
     */
    public AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> showDbObjectTemplateResultAsyncInvoker(
        ShowDbObjectTemplateResultRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDbObjectTemplateResult, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectsListRequest 请求对象
     * @return CompletableFuture<ShowDbObjectsListResponse>
     */
    public CompletableFuture<ShowDbObjectsListResponse> showDbObjectsListAsync(ShowDbObjectsListRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectsList);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbObjectsListRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectsListRequest, ShowDbObjectsListResponse>
     */
    public AsyncInvoker<ShowDbObjectsListRequest, ShowDbObjectsListResponse> showDbObjectsListAsyncInvoker(
        ShowDbObjectsListRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDbObjectsList, hcClient);
    }

    /**
     * 查询异常数据列表
     *
     * 查询异常数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirtyDataRequest 请求对象
     * @return CompletableFuture<ShowDirtyDataResponse>
     */
    public CompletableFuture<ShowDirtyDataResponse> showDirtyDataAsync(ShowDirtyDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDirtyData);
    }

    /**
     * 查询异常数据列表
     *
     * 查询异常数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirtyDataRequest 请求对象
     * @return AsyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse>
     */
    public AsyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse> showDirtyDataAsyncInvoker(
        ShowDirtyDataRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showDirtyData, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseProjectResponse>
     */
    public CompletableFuture<ShowEnterpriseProjectResponse> showEnterpriseProjectAsync(
        ShowEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showEnterpriseProject);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectAsyncInvoker(
        ShowEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询导出创建模板进度
     *
     * 查询导出批量创建模板进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportProgressRequest 请求对象
     * @return CompletableFuture<ShowExportProgressResponse>
     */
    public CompletableFuture<ShowExportProgressResponse> showExportProgressAsync(ShowExportProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showExportProgress);
    }

    /**
     * 查询导出创建模板进度
     *
     * 查询导出批量创建模板进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportProgressRequest 请求对象
     * @return AsyncInvoker<ShowExportProgressRequest, ShowExportProgressResponse>
     */
    public AsyncInvoker<ShowExportProgressRequest, ShowExportProgressResponse> showExportProgressAsyncInvoker(
        ShowExportProgressRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showExportProgress, hcClient);
    }

    /**
     * 查询健康对比任务详情
     *
     * 查询健康对比任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCompareJobDetailRequest 请求对象
     * @return CompletableFuture<ShowHealthCompareJobDetailResponse>
     */
    public CompletableFuture<ShowHealthCompareJobDetailResponse> showHealthCompareJobDetailAsync(
        ShowHealthCompareJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showHealthCompareJobDetail);
    }

    /**
     * 查询健康对比任务详情
     *
     * 查询健康对比任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCompareJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowHealthCompareJobDetailRequest, ShowHealthCompareJobDetailResponse>
     */
    public AsyncInvoker<ShowHealthCompareJobDetailRequest, ShowHealthCompareJobDetailResponse> showHealthCompareJobDetailAsyncInvoker(
        ShowHealthCompareJobDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showHealthCompareJobDetail, hcClient);
    }

    /**
     * 查询健康对比列表
     *
     * 查询健康对比列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCompareJobListRequest 请求对象
     * @return CompletableFuture<ShowHealthCompareJobListResponse>
     */
    public CompletableFuture<ShowHealthCompareJobListResponse> showHealthCompareJobListAsync(
        ShowHealthCompareJobListRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showHealthCompareJobList);
    }

    /**
     * 查询健康对比列表
     *
     * 查询健康对比列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthCompareJobListRequest 请求对象
     * @return AsyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse>
     */
    public AsyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> showHealthCompareJobListAsyncInvoker(
        ShowHealthCompareJobListRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showHealthCompareJobList, hcClient);
    }

    /**
     * 获取健康对比对象级对比概览
     *
     * 获取健康对比对象级对比概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthObjectCompareJobOverviewRequest 请求对象
     * @return CompletableFuture<ShowHealthObjectCompareJobOverviewResponse>
     */
    public CompletableFuture<ShowHealthObjectCompareJobOverviewResponse> showHealthObjectCompareJobOverviewAsync(
        ShowHealthObjectCompareJobOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showHealthObjectCompareJobOverview);
    }

    /**
     * 获取健康对比对象级对比概览
     *
     * 获取健康对比对象级对比概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthObjectCompareJobOverviewRequest 请求对象
     * @return AsyncInvoker<ShowHealthObjectCompareJobOverviewRequest, ShowHealthObjectCompareJobOverviewResponse>
     */
    public AsyncInvoker<ShowHealthObjectCompareJobOverviewRequest, ShowHealthObjectCompareJobOverviewResponse> showHealthObjectCompareJobOverviewAsyncInvoker(
        ShowHealthObjectCompareJobOverviewRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showHealthObjectCompareJobOverview, hcClient);
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
     * @return CompletableFuture<ShowIncrementComponentsDetailResponse>
     */
    public CompletableFuture<ShowIncrementComponentsDetailResponse> showIncrementComponentsDetailAsync(
        ShowIncrementComponentsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showIncrementComponentsDetail);
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
     * @return AsyncInvoker<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse>
     */
    public AsyncInvoker<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> showIncrementComponentsDetailAsyncInvoker(
        ShowIncrementComponentsDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showIncrementComponentsDetail, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTagsRequest 请求对象
     * @return CompletableFuture<ShowInstanceTagsResponse>
     */
    @Deprecated
    public CompletableFuture<ShowInstanceTagsResponse> showInstanceTagsAsync(ShowInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTagsAsyncInvoker(
        ShowInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showInstanceTags, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
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
     * @param request ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showJobDetail, hcClient);
    }

    /**
     * 获取任务价格信息
     *
     * 获取询价接口的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeteringRequest 请求对象
     * @return CompletableFuture<ShowMeteringResponse>
     */
    public CompletableFuture<ShowMeteringResponse> showMeteringAsync(ShowMeteringRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showMetering);
    }

    /**
     * 获取任务价格信息
     *
     * 获取询价接口的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeteringRequest 请求对象
     * @return AsyncInvoker<ShowMeteringRequest, ShowMeteringResponse>
     */
    public AsyncInvoker<ShowMeteringRequest, ShowMeteringResponse> showMeteringAsyncInvoker(
        ShowMeteringRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showMetering, hcClient);
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
     * @return CompletableFuture<ShowMonitorDataResponse>
     */
    public CompletableFuture<ShowMonitorDataResponse> showMonitorDataAsync(ShowMonitorDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showMonitorData);
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
     * @return AsyncInvoker<ShowMonitorDataRequest, ShowMonitorDataResponse>
     */
    public AsyncInvoker<ShowMonitorDataRequest, ShowMonitorDataResponse> showMonitorDataAsyncInvoker(
        ShowMonitorDataRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showMonitorData, hcClient);
    }

    /**
     * 查询同步映射列表
     *
     * 查询实时同步映射关系包括对象选择时的库映射、schema映射、表映射和数据加工时的列映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowObjectMappingRequest 请求对象
     * @return CompletableFuture<ShowObjectMappingResponse>
     */
    public CompletableFuture<ShowObjectMappingResponse> showObjectMappingAsync(ShowObjectMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showObjectMapping);
    }

    /**
     * 查询同步映射列表
     *
     * 查询实时同步映射关系包括对象选择时的库映射、schema映射、表映射和数据加工时的列映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowObjectMappingRequest 请求对象
     * @return AsyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse>
     */
    public AsyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse> showObjectMappingAsyncInvoker(
        ShowObjectMappingRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showObjectMapping, hcClient);
    }

    /**
     * 获取查询数据库位点的结果
     *
     * 获取查询数据库位点的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPositionResultRequest 请求对象
     * @return CompletableFuture<ShowPositionResultResponse>
     */
    public CompletableFuture<ShowPositionResultResponse> showPositionResultAsync(ShowPositionResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showPositionResult);
    }

    /**
     * 获取查询数据库位点的结果
     *
     * 获取查询数据库位点的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPositionResultRequest 请求对象
     * @return AsyncInvoker<ShowPositionResultRequest, ShowPositionResultResponse>
     */
    public AsyncInvoker<ShowPositionResultRequest, ShowPositionResultResponse> showPositionResultAsyncInvoker(
        ShowPositionResultRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showPositionResult, hcClient);
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
     * @return CompletableFuture<ShowProgressDataResponse>
     */
    public CompletableFuture<ShowProgressDataResponse> showProgressDataAsync(ShowProgressDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showProgressData);
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
     * @return AsyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse>
     */
    public AsyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse> showProgressDataAsyncInvoker(
        ShowProgressDataRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showProgressData, hcClient);
    }

    /**
     * 查询录制回放任务进度
     *
     * 查询录制回放任务进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplayProgressRequest 请求对象
     * @return CompletableFuture<ShowReplayProgressResponse>
     */
    public CompletableFuture<ShowReplayProgressResponse> showReplayProgressAsync(ShowReplayProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showReplayProgress);
    }

    /**
     * 查询录制回放任务进度
     *
     * 查询录制回放任务进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplayProgressRequest 请求对象
     * @return AsyncInvoker<ShowReplayProgressRequest, ShowReplayProgressResponse>
     */
    public AsyncInvoker<ShowReplayProgressRequest, ShowReplayProgressResponse> showReplayProgressAsyncInvoker(
        ShowReplayProgressRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showReplayProgress, hcClient);
    }

    /**
     * 查询录制回放结果
     *
     * 获取录制回放结果数据，包括：回放基于时间维度统计信息，异常SQL及统计结果、慢SQL及统计结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplayResultsRequest 请求对象
     * @return CompletableFuture<ShowReplayResultsResponse>
     */
    public CompletableFuture<ShowReplayResultsResponse> showReplayResultsAsync(ShowReplayResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showReplayResults);
    }

    /**
     * 查询录制回放结果
     *
     * 获取录制回放结果数据，包括：回放基于时间维度统计信息，异常SQL及统计结果、慢SQL及统计结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplayResultsRequest 请求对象
     * @return AsyncInvoker<ShowReplayResultsRequest, ShowReplayResultsResponse>
     */
    public AsyncInvoker<ShowReplayResultsRequest, ShowReplayResultsResponse> showReplayResultsAsyncInvoker(
        ShowReplayResultsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showReplayResults, hcClient);
    }

    /**
     * 查询备份迁移任务详细信息
     *
     * 获取指定备份迁移任务详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationJobRequest 请求对象
     * @return CompletableFuture<ShowReplicationJobResponse>
     */
    public CompletableFuture<ShowReplicationJobResponse> showReplicationJobAsync(ShowReplicationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showReplicationJob);
    }

    /**
     * 查询备份迁移任务详细信息
     *
     * 获取指定备份迁移任务详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationJobRequest 请求对象
     * @return AsyncInvoker<ShowReplicationJobRequest, ShowReplicationJobResponse>
     */
    public AsyncInvoker<ShowReplicationJobRequest, ShowReplicationJobResponse> showReplicationJobAsyncInvoker(
        ShowReplicationJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showReplicationJob, hcClient);
    }

    /**
     * 查询订阅任务列表
     *
     * 查询订阅任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionListsRequest 请求对象
     * @return CompletableFuture<ShowSubscriptionListsResponse>
     */
    public CompletableFuture<ShowSubscriptionListsResponse> showSubscriptionListsAsync(
        ShowSubscriptionListsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showSubscriptionLists);
    }

    /**
     * 查询订阅任务列表
     *
     * 查询订阅任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionListsRequest 请求对象
     * @return AsyncInvoker<ShowSubscriptionListsRequest, ShowSubscriptionListsResponse>
     */
    public AsyncInvoker<ShowSubscriptionListsRequest, ShowSubscriptionListsResponse> showSubscriptionListsAsyncInvoker(
        ShowSubscriptionListsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showSubscriptionLists, hcClient);
    }

    /**
     * 查询是否支持对象选择和列映射
     *
     * 查询任务支持的对象选择类型、列映射、支持搜索的对象类型等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportObjectTypeRequest 请求对象
     * @return CompletableFuture<ShowSupportObjectTypeResponse>
     */
    public CompletableFuture<ShowSupportObjectTypeResponse> showSupportObjectTypeAsync(
        ShowSupportObjectTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showSupportObjectType);
    }

    /**
     * 查询是否支持对象选择和列映射
     *
     * 查询任务支持的对象选择类型、列映射、支持搜索的对象类型等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportObjectTypeRequest 请求对象
     * @return AsyncInvoker<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse>
     */
    public AsyncInvoker<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> showSupportObjectTypeAsyncInvoker(
        ShowSupportObjectTypeRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showSupportObjectType, hcClient);
    }

    /**
     * 展示时间轴
     *
     * 指定不同的任务ID可以展示当前任务创建时间、启动时间、重试、重置等操作的时间轴信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTimelineRequest 请求对象
     * @return CompletableFuture<ShowTimelineResponse>
     */
    public CompletableFuture<ShowTimelineResponse> showTimelineAsync(ShowTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showTimeline);
    }

    /**
     * 展示时间轴
     *
     * 指定不同的任务ID可以展示当前任务创建时间、启动时间、重试、重置等操作的时间轴信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTimelineRequest 请求对象
     * @return AsyncInvoker<ShowTimelineRequest, ShowTimelineResponse>
     */
    public AsyncInvoker<ShowTimelineRequest, ShowTimelineResponse> showTimelineAsyncInvoker(
        ShowTimelineRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showTimeline, hcClient);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateObjectSavingStatusRequest 请求对象
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
     * @param request ShowUpdateObjectSavingStatusRequest 请求对象
     * @return AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>
     */
    public AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatusAsyncInvoker(
        ShowUpdateObjectSavingStatusRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.showUpdateObjectSavingStatus, hcClient);
    }

    /**
     * 结束任务
     *
     * 结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobActionRequest 请求对象
     * @return CompletableFuture<StopJobActionResponse>
     */
    public CompletableFuture<StopJobActionResponse> stopJobActionAsync(StopJobActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.stopJobAction);
    }

    /**
     * 结束任务
     *
     * 结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobActionRequest 请求对象
     * @return AsyncInvoker<StopJobActionRequest, StopJobActionResponse>
     */
    public AsyncInvoker<StopJobActionRequest, StopJobActionResponse> stopJobActionAsyncInvoker(
        StopJobActionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.stopJobAction, hcClient);
    }

    /**
     * 同步驱动文件（不再推广）
     *
     * 同步驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncJdbcDriverRequest 请求对象
     * @return CompletableFuture<SyncJdbcDriverResponse>
     */
    public CompletableFuture<SyncJdbcDriverResponse> syncJdbcDriverAsync(SyncJdbcDriverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.syncJdbcDriver);
    }

    /**
     * 同步驱动文件（不再推广）
     *
     * 同步驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncJdbcDriverRequest 请求对象
     * @return AsyncInvoker<SyncJdbcDriverRequest, SyncJdbcDriverResponse>
     */
    public AsyncInvoker<SyncJdbcDriverRequest, SyncJdbcDriverResponse> syncJdbcDriverAsyncInvoker(
        SyncJdbcDriverRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.syncJdbcDriver, hcClient);
    }

    /**
     * 同步驱动文件
     *
     * 同步驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncUserJdbcDriverRequest 请求对象
     * @return CompletableFuture<SyncUserJdbcDriverResponse>
     */
    public CompletableFuture<SyncUserJdbcDriverResponse> syncUserJdbcDriverAsync(SyncUserJdbcDriverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.syncUserJdbcDriver);
    }

    /**
     * 同步驱动文件
     *
     * 同步驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncUserJdbcDriverRequest 请求对象
     * @return AsyncInvoker<SyncUserJdbcDriverRequest, SyncUserJdbcDriverResponse>
     */
    public AsyncInvoker<SyncUserJdbcDriverRequest, SyncUserJdbcDriverResponse> syncUserJdbcDriverAsyncInvoker(
        SyncUserJdbcDriverRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.syncUserJdbcDriver, hcClient);
    }

    /**
     * 更新委托权限策略
     *
     * 更新委托权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAgencyPolicyResponse>
     */
    public CompletableFuture<UpdateAgencyPolicyResponse> updateAgencyPolicyAsync(UpdateAgencyPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateAgencyPolicy);
    }

    /**
     * 更新委托权限策略
     *
     * 更新委托权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyPolicyRequest, UpdateAgencyPolicyResponse>
     */
    public AsyncInvoker<UpdateAgencyPolicyRequest, UpdateAgencyPolicyResponse> updateAgencyPolicyAsyncInvoker(
        UpdateAgencyPolicyRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateAgencyPolicy, hcClient);
    }

    /**
     * 更新指定ID批量异步任务详情
     *
     * 更新租户指定ID批量异步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchAsyncJobsRequest 请求对象
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
     * @param request UpdateBatchAsyncJobsRequest 请求对象
     * @return AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>
     */
    public AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> updateBatchAsyncJobsAsyncInvoker(
        UpdateBatchAsyncJobsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateBatchAsyncJobs, hcClient);
    }

    /**
     * 修改对比策略
     *
     * 修改周期性对比的对比策略，目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MySQL-&gt;GaussDB(DWS)、GaussDB(for MySQL)-&gt;MySQL同步任务，MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)迁移任务，MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、GaussDB(for MySQL)-&gt;GaussDB(for MySQL)、DDM-&gt;DDM、DDS-DDS灾备任务支持对比策略设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComparePolicyRequest 请求对象
     * @return CompletableFuture<UpdateComparePolicyResponse>
     */
    public CompletableFuture<UpdateComparePolicyResponse> updateComparePolicyAsync(UpdateComparePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateComparePolicy);
    }

    /**
     * 修改对比策略
     *
     * 修改周期性对比的对比策略，目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MySQL-&gt;GaussDB(DWS)、GaussDB(for MySQL)-&gt;MySQL同步任务，MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)迁移任务，MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、GaussDB(for MySQL)-&gt;GaussDB(for MySQL)、DDM-&gt;DDM、DDS-DDS灾备任务支持对比策略设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComparePolicyRequest 请求对象
     * @return AsyncInvoker<UpdateComparePolicyRequest, UpdateComparePolicyResponse>
     */
    public AsyncInvoker<UpdateComparePolicyRequest, UpdateComparePolicyResponse> updateComparePolicyAsyncInvoker(
        UpdateComparePolicyRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateComparePolicy, hcClient);
    }

    /**
     * 更新指定任务数据加工规则
     *
     * 更新指定任务数据加工规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataProgressRequest 请求对象
     * @return CompletableFuture<UpdateDataProgressResponse>
     */
    public CompletableFuture<UpdateDataProgressResponse> updateDataProgressAsync(UpdateDataProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateDataProgress);
    }

    /**
     * 更新指定任务数据加工规则
     *
     * 更新指定任务数据加工规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataProgressRequest 请求对象
     * @return AsyncInvoker<UpdateDataProgressRequest, UpdateDataProgressResponse>
     */
    public AsyncInvoker<UpdateDataProgressRequest, UpdateDataProgressResponse> updateDataProgressAsyncInvoker(
        UpdateDataProgressRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateDataProgress, hcClient);
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
     * @param request UpdateJobRequest 请求对象
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateJob, hcClient);
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
     * @return CompletableFuture<UpdateJobConfigurationsResponse>
     */
    public CompletableFuture<UpdateJobConfigurationsResponse> updateJobConfigurationsAsync(
        UpdateJobConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateJobConfigurations);
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
     * @return AsyncInvoker<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse>
     */
    public AsyncInvoker<UpdateJobConfigurationsRequest, UpdateJobConfigurationsResponse> updateJobConfigurationsAsyncInvoker(
        UpdateJobConfigurationsRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateJobConfigurations, hcClient);
    }

    /**
     * 修改备份迁移任务信息
     *
     * 修改指定备份迁移任务信息，任务名与任务描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplicationJobRequest 请求对象
     * @return CompletableFuture<UpdateReplicationJobResponse>
     */
    public CompletableFuture<UpdateReplicationJobResponse> updateReplicationJobAsync(
        UpdateReplicationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateReplicationJob);
    }

    /**
     * 修改备份迁移任务信息
     *
     * 修改指定备份迁移任务信息，任务名与任务描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplicationJobRequest 请求对象
     * @return AsyncInvoker<UpdateReplicationJobRequest, UpdateReplicationJobResponse>
     */
    public AsyncInvoker<UpdateReplicationJobRequest, UpdateReplicationJobResponse> updateReplicationJobAsyncInvoker(
        UpdateReplicationJobRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateReplicationJob, hcClient);
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
     * @return CompletableFuture<UpdateStartPositionResponse>
     */
    public CompletableFuture<UpdateStartPositionResponse> updateStartPositionAsync(UpdateStartPositionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateStartPosition);
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
     * @return AsyncInvoker<UpdateStartPositionRequest, UpdateStartPositionResponse>
     */
    public AsyncInvoker<UpdateStartPositionRequest, UpdateStartPositionResponse> updateStartPositionAsyncInvoker(
        UpdateStartPositionRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.updateStartPosition, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadDbObjectTemplateRequest 请求对象
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
     * @param request UploadDbObjectTemplateRequest 请求对象
     * @return AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>
     */
    public AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> uploadDbObjectTemplateAsyncInvoker(
        UploadDbObjectTemplateRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.uploadDbObjectTemplate, hcClient);
    }

    /**
     * 上传驱动文件（不再推广）
     *
     * 上传驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJdbcDriverRequest 请求对象
     * @return CompletableFuture<UploadJdbcDriverResponse>
     */
    public CompletableFuture<UploadJdbcDriverResponse> uploadJdbcDriverAsync(UploadJdbcDriverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.uploadJdbcDriver);
    }

    /**
     * 上传驱动文件（不再推广）
     *
     * 上传驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadJdbcDriverRequest 请求对象
     * @return AsyncInvoker<UploadJdbcDriverRequest, UploadJdbcDriverResponse>
     */
    public AsyncInvoker<UploadJdbcDriverRequest, UploadJdbcDriverResponse> uploadJdbcDriverAsyncInvoker(
        UploadJdbcDriverRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.uploadJdbcDriver, hcClient);
    }

    /**
     * 上传驱动文件
     *
     * 上传驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadUserJdbcDriverRequest 请求对象
     * @return CompletableFuture<UploadUserJdbcDriverResponse>
     */
    public CompletableFuture<UploadUserJdbcDriverResponse> uploadUserJdbcDriverAsync(
        UploadUserJdbcDriverRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.uploadUserJdbcDriver);
    }

    /**
     * 上传驱动文件
     *
     * 上传驱动文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadUserJdbcDriverRequest 请求对象
     * @return AsyncInvoker<UploadUserJdbcDriverRequest, UploadUserJdbcDriverResponse>
     */
    public AsyncInvoker<UploadUserJdbcDriverRequest, UploadUserJdbcDriverResponse> uploadUserJdbcDriverAsyncInvoker(
        UploadUserJdbcDriverRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.uploadUserJdbcDriver, hcClient);
    }

    /**
     * 任务名称校验
     *
     * 创建任务时对任务名称进行校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateJobNameRequest 请求对象
     * @return CompletableFuture<ValidateJobNameResponse>
     */
    public CompletableFuture<ValidateJobNameResponse> validateJobNameAsync(ValidateJobNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.validateJobName);
    }

    /**
     * 任务名称校验
     *
     * 创建任务时对任务名称进行校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateJobNameRequest 请求对象
     * @return AsyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse>
     */
    public AsyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse> validateJobNameAsyncInvoker(
        ValidateJobNameRequest request) {
        return new AsyncInvoker<>(request, DrsMeta.validateJobName, hcClient);
    }

}

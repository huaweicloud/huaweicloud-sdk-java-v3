package com.huaweicloud.sdk.coc.v1;

import com.huaweicloud.sdk.coc.v1.model.AcceptScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.AcceptScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewRequest;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewResponse;
import com.huaweicloud.sdk.coc.v1.model.CheckScriptRiskRequest;
import com.huaweicloud.sdk.coc.v1.model.CheckScriptRiskResponse;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.GetDocumentAtomicInfoRequest;
import com.huaweicloud.sdk.coc.v1.model.GetDocumentAtomicInfoResponse;
import com.huaweicloud.sdk.coc.v1.model.GetDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.GetDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.GetExecutionRequest;
import com.huaweicloud.sdk.coc.v1.model.GetExecutionResponse;
import com.huaweicloud.sdk.coc.v1.model.GetPublicScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.GetPublicScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobBatchRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobBatchResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobInfoRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobInfoResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobStatisticsRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobStatisticsResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationModelRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationModelResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalResponse;
import com.huaweicloud.sdk.coc.v1.model.ListCceCompliantRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCceCompliantResponse;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentAtomicsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentAtomicsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionInstancesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionInstancesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionStepsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionStepsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInstancesBatchRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInstancesBatchResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInterruptRecordsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInterruptRecordsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListMultiCloudResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListMultiCloudResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListPersonnelRequest;
import com.huaweicloud.sdk.coc.v1.model.ListPersonnelResponse;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.ListResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskHistoryRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskHistoryResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobBatchesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobBatchesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptResourceTagsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptResourceTagsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateExecutionRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateExecutionResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowAccountRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowAccountResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowAlarmRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowAlarmResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowPatchBaselineRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowPatchBaselineResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaCustomizedTemplateRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaCustomizedTemplateResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaOrderRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowSlaOrderResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowSloDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowSloDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncAddPersonnelRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncAddPersonnelResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceTagsRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceTagsResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CocAsyncClient {

    protected HcClient hcClient;

    public CocAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CocAsyncClient> newBuilder() {
        ClientBuilder<CocAsyncClient> clientBuilder =
            new ClientBuilder<>(CocAsyncClient::new, "GlobalCredentials,BasicCredentials");
        return clientBuilder;
    }

    /**
     * 查询客户账号
     *
     * show account ，使用场景：托管功能 sre 账号使用，查询自己管理的客户账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountRequest 请求对象
     * @return CompletableFuture<ShowAccountResponse>
     */
    public CompletableFuture<ShowAccountResponse> showAccountAsync(ShowAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showAccount);
    }

    /**
     * 查询客户账号
     *
     * show account ，使用场景：托管功能 sre 账号使用，查询自己管理的客户账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountRequest 请求对象
     * @return AsyncInvoker<ShowAccountRequest, ShowAccountResponse>
     */
    public AsyncInvoker<ShowAccountRequest, ShowAccountResponse> showAccountAsyncInvoker(ShowAccountRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showAccount, hcClient);
    }

    /**
     * 查询告警工单历史
     *
     * 查询告警工单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHandleHistoriesRequest 请求对象
     * @return CompletableFuture<ListAlarmHandleHistoriesResponse>
     */
    public CompletableFuture<ListAlarmHandleHistoriesResponse> listAlarmHandleHistoriesAsync(
        ListAlarmHandleHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listAlarmHandleHistories);
    }

    /**
     * 查询告警工单历史
     *
     * 查询告警工单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHandleHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse>
     */
    public AsyncInvoker<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse> listAlarmHandleHistoriesAsyncInvoker(
        ListAlarmHandleHistoriesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listAlarmHandleHistories, hcClient);
    }

    /**
     * 查询Alarm
     *
     * Get alarm info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return CompletableFuture<ShowAlarmResponse>
     */
    public CompletableFuture<ShowAlarmResponse> showAlarmAsync(ShowAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showAlarm);
    }

    /**
     * 查询Alarm
     *
     * Get alarm info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse>
     */
    public AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse> showAlarmAsyncInvoker(ShowAlarmRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showAlarm, hcClient);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listApplications);
    }

    /**
     * 查询应用
     *
     * 查询应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listApplications, hcClient);
    }

    /**
     * 查询下一级的子应用、组件、分组
     *
     * 查询下一级的子应用、组件、分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationModelRequest 请求对象
     * @return CompletableFuture<ListApplicationModelResponse>
     */
    public CompletableFuture<ListApplicationModelResponse> listApplicationModelAsync(
        ListApplicationModelRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listApplicationModel);
    }

    /**
     * 查询下一级的子应用、组件、分组
     *
     * 查询下一级的子应用、组件、分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationModelRequest 请求对象
     * @return AsyncInvoker<ListApplicationModelRequest, ListApplicationModelResponse>
     */
    public AsyncInvoker<ListApplicationModelRequest, ListApplicationModelResponse> listApplicationModelAsyncInvoker(
        ListApplicationModelRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listApplicationModel, hcClient);
    }

    /**
     * 批量创建应用视图
     *
     * 批量创建应用视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateApplicationViewRequest 请求对象
     * @return CompletableFuture<BatchCreateApplicationViewResponse>
     */
    public CompletableFuture<BatchCreateApplicationViewResponse> batchCreateApplicationViewAsync(
        BatchCreateApplicationViewRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.batchCreateApplicationView);
    }

    /**
     * 批量创建应用视图
     *
     * 批量创建应用视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateApplicationViewRequest 请求对象
     * @return AsyncInvoker<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse>
     */
    public AsyncInvoker<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> batchCreateApplicationViewAsyncInvoker(
        BatchCreateApplicationViewRequest request) {
        return new AsyncInvoker<>(request, CocMeta.batchCreateApplicationView, hcClient);
    }

    /**
     * 查询Baseline
     *
     * Get baseline info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPatchBaselineRequest 请求对象
     * @return CompletableFuture<ShowPatchBaselineResponse>
     */
    public CompletableFuture<ShowPatchBaselineResponse> showPatchBaselineAsync(ShowPatchBaselineRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showPatchBaseline);
    }

    /**
     * 查询Baseline
     *
     * Get baseline info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPatchBaselineRequest 请求对象
     * @return AsyncInvoker<ShowPatchBaselineRequest, ShowPatchBaselineResponse>
     */
    public AsyncInvoker<ShowPatchBaselineRequest, ShowPatchBaselineResponse> showPatchBaselineAsyncInvoker(
        ShowPatchBaselineRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showPatchBaseline, hcClient);
    }

    /**
     * 获取合规性报告cce信息
     *
     * 分页获取合规性报告cce信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceCompliantRequest 请求对象
     * @return CompletableFuture<ListCceCompliantResponse>
     */
    public CompletableFuture<ListCceCompliantResponse> listCceCompliantAsync(ListCceCompliantRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listCceCompliant);
    }

    /**
     * 获取合规性报告cce信息
     *
     * 分页获取合规性报告cce信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceCompliantRequest 请求对象
     * @return AsyncInvoker<ListCceCompliantRequest, ListCceCompliantResponse>
     */
    public AsyncInvoker<ListCceCompliantRequest, ListCceCompliantResponse> listCceCompliantAsyncInvoker(
        ListCceCompliantRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listCceCompliant, hcClient);
    }

    /**
     * 获取节点合规性报告
     *
     * 分页获取节点合规性报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceCompliantRequest 请求对象
     * @return CompletableFuture<ListInstanceCompliantResponse>
     */
    public CompletableFuture<ListInstanceCompliantResponse> listInstanceCompliantAsync(
        ListInstanceCompliantRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listInstanceCompliant);
    }

    /**
     * 获取节点合规性报告
     *
     * 分页获取节点合规性报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceCompliantRequest 请求对象
     * @return AsyncInvoker<ListInstanceCompliantRequest, ListInstanceCompliantResponse>
     */
    public AsyncInvoker<ListInstanceCompliantRequest, ListInstanceCompliantResponse> listInstanceCompliantAsyncInvoker(
        ListInstanceCompliantRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listInstanceCompliant, hcClient);
    }

    /**
     * 分页获取节点补丁详情
     *
     * 分页获取节点补丁详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancePatchItemsRequest 请求对象
     * @return CompletableFuture<ShowInstancePatchItemsResponse>
     */
    public CompletableFuture<ShowInstancePatchItemsResponse> showInstancePatchItemsAsync(
        ShowInstancePatchItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showInstancePatchItems);
    }

    /**
     * 分页获取节点补丁详情
     *
     * 分页获取节点补丁详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancePatchItemsRequest 请求对象
     * @return AsyncInvoker<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse>
     */
    public AsyncInvoker<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> showInstancePatchItemsAsyncInvoker(
        ShowInstancePatchItemsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showInstancePatchItems, hcClient);
    }

    /**
     * 支持用户自主接入告警数据
     *
     * 支持租户将自开发的监控系统按照标准化集成至COC，集成后告警会按照标准格式上报至COC告警中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportCustomEventRequest 请求对象
     * @return CompletableFuture<CreateReportCustomEventResponse>
     */
    public CompletableFuture<CreateReportCustomEventResponse> createReportCustomEventAsync(
        CreateReportCustomEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createReportCustomEvent);
    }

    /**
     * 支持用户自主接入告警数据
     *
     * 支持租户将自开发的监控系统按照标准化集成至COC，集成后告警会按照标准格式上报至COC告警中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportCustomEventRequest 请求对象
     * @return AsyncInvoker<CreateReportCustomEventRequest, CreateReportCustomEventResponse>
     */
    public AsyncInvoker<CreateReportCustomEventRequest, CreateReportCustomEventResponse> createReportCustomEventAsyncInvoker(
        CreateReportCustomEventRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createReportCustomEvent, hcClient);
    }

    /**
     * 创建自定义作业
     *
     * 创建自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return CompletableFuture<CreateDocumentResponse>
     */
    public CompletableFuture<CreateDocumentResponse> createDocumentAsync(CreateDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createDocument);
    }

    /**
     * 创建自定义作业
     *
     * 创建自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return AsyncInvoker<CreateDocumentRequest, CreateDocumentResponse>
     */
    public AsyncInvoker<CreateDocumentRequest, CreateDocumentResponse> createDocumentAsyncInvoker(
        CreateDocumentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createDocument, hcClient);
    }

    /**
     * 删除自定义作业
     *
     * 删除自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDocumentRequest 请求对象
     * @return CompletableFuture<DeleteDocumentResponse>
     */
    public CompletableFuture<DeleteDocumentResponse> deleteDocumentAsync(DeleteDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteDocument);
    }

    /**
     * 删除自定义作业
     *
     * 删除自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDocumentRequest 请求对象
     * @return AsyncInvoker<DeleteDocumentRequest, DeleteDocumentResponse>
     */
    public AsyncInvoker<DeleteDocumentRequest, DeleteDocumentResponse> deleteDocumentAsyncInvoker(
        DeleteDocumentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteDocument, hcClient);
    }

    /**
     * 执行自定义作业
     *
     * 执行自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDocumentRequest 请求对象
     * @return CompletableFuture<ExecuteDocumentResponse>
     */
    public CompletableFuture<ExecuteDocumentResponse> executeDocumentAsync(ExecuteDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.executeDocument);
    }

    /**
     * 执行自定义作业
     *
     * 执行自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDocumentRequest 请求对象
     * @return AsyncInvoker<ExecuteDocumentRequest, ExecuteDocumentResponse>
     */
    public AsyncInvoker<ExecuteDocumentRequest, ExecuteDocumentResponse> executeDocumentAsyncInvoker(
        ExecuteDocumentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.executeDocument, hcClient);
    }

    /**
     * 查询自定义作业详情
     *
     * 查询自定义作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentRequest 请求对象
     * @return CompletableFuture<GetDocumentResponse>
     */
    public CompletableFuture<GetDocumentResponse> getDocumentAsync(GetDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getDocument);
    }

    /**
     * 查询自定义作业详情
     *
     * 查询自定义作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentRequest 请求对象
     * @return AsyncInvoker<GetDocumentRequest, GetDocumentResponse>
     */
    public AsyncInvoker<GetDocumentRequest, GetDocumentResponse> getDocumentAsyncInvoker(GetDocumentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getDocument, hcClient);
    }

    /**
     * 获取原子能力详细
     *
     * 获取原子能力详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentAtomicInfoRequest 请求对象
     * @return CompletableFuture<GetDocumentAtomicInfoResponse>
     */
    public CompletableFuture<GetDocumentAtomicInfoResponse> getDocumentAtomicInfoAsync(
        GetDocumentAtomicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getDocumentAtomicInfo);
    }

    /**
     * 获取原子能力详细
     *
     * 获取原子能力详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentAtomicInfoRequest 请求对象
     * @return AsyncInvoker<GetDocumentAtomicInfoRequest, GetDocumentAtomicInfoResponse>
     */
    public AsyncInvoker<GetDocumentAtomicInfoRequest, GetDocumentAtomicInfoResponse> getDocumentAtomicInfoAsyncInvoker(
        GetDocumentAtomicInfoRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getDocumentAtomicInfo, hcClient);
    }

    /**
     * 获取原子能力列表
     *
     * 获取原子能力列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentAtomicsRequest 请求对象
     * @return CompletableFuture<ListDocumentAtomicsResponse>
     */
    public CompletableFuture<ListDocumentAtomicsResponse> listDocumentAtomicsAsync(ListDocumentAtomicsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listDocumentAtomics);
    }

    /**
     * 获取原子能力列表
     *
     * 获取原子能力列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentAtomicsRequest 请求对象
     * @return AsyncInvoker<ListDocumentAtomicsRequest, ListDocumentAtomicsResponse>
     */
    public AsyncInvoker<ListDocumentAtomicsRequest, ListDocumentAtomicsResponse> listDocumentAtomicsAsyncInvoker(
        ListDocumentAtomicsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listDocumentAtomics, hcClient);
    }

    /**
     * 查询自定义作业列表
     *
     * 查询自定义作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentsRequest 请求对象
     * @return CompletableFuture<ListDocumentsResponse>
     */
    public CompletableFuture<ListDocumentsResponse> listDocumentsAsync(ListDocumentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listDocuments);
    }

    /**
     * 查询自定义作业列表
     *
     * 查询自定义作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentsRequest 请求对象
     * @return AsyncInvoker<ListDocumentsRequest, ListDocumentsResponse>
     */
    public AsyncInvoker<ListDocumentsRequest, ListDocumentsResponse> listDocumentsAsyncInvoker(
        ListDocumentsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listDocuments, hcClient);
    }

    /**
     * 修改自定义作业
     *
     * 修改自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return CompletableFuture<UpdateDocumentResponse>
     */
    public CompletableFuture<UpdateDocumentResponse> updateDocumentAsync(UpdateDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateDocument);
    }

    /**
     * 修改自定义作业
     *
     * 修改自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return AsyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse>
     */
    public AsyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse> updateDocumentAsyncInvoker(
        UpdateDocumentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateDocument, hcClient);
    }

    /**
     * Prometheus事件接入
     *
     * Prometheus事件接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportPrometheusEventRequest 请求对象
     * @return CompletableFuture<CreateReportPrometheusEventResponse>
     */
    public CompletableFuture<CreateReportPrometheusEventResponse> createReportPrometheusEventAsync(
        CreateReportPrometheusEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createReportPrometheusEvent);
    }

    /**
     * Prometheus事件接入
     *
     * Prometheus事件接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportPrometheusEventRequest 请求对象
     * @return AsyncInvoker<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse>
     */
    public AsyncInvoker<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> createReportPrometheusEventAsyncInvoker(
        CreateReportPrometheusEventRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createReportPrometheusEvent, hcClient);
    }

    /**
     * 查询作业工单详情
     *
     * 查询作业工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionRequest 请求对象
     * @return CompletableFuture<GetExecutionResponse>
     */
    public CompletableFuture<GetExecutionResponse> getExecutionAsync(GetExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getExecution);
    }

    /**
     * 查询作业工单详情
     *
     * 查询作业工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionRequest 请求对象
     * @return AsyncInvoker<GetExecutionRequest, GetExecutionResponse>
     */
    public AsyncInvoker<GetExecutionRequest, GetExecutionResponse> getExecutionAsyncInvoker(
        GetExecutionRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getExecution, hcClient);
    }

    /**
     * 查询工单步骤批次实例
     *
     * 查询工单步骤批次实例，如脚本分批操作里的ECS实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionInstancesRequest 请求对象
     * @return CompletableFuture<ListExecutionInstancesResponse>
     */
    public CompletableFuture<ListExecutionInstancesResponse> listExecutionInstancesAsync(
        ListExecutionInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listExecutionInstances);
    }

    /**
     * 查询工单步骤批次实例
     *
     * 查询工单步骤批次实例，如脚本分批操作里的ECS实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionInstancesRequest 请求对象
     * @return AsyncInvoker<ListExecutionInstancesRequest, ListExecutionInstancesResponse>
     */
    public AsyncInvoker<ListExecutionInstancesRequest, ListExecutionInstancesResponse> listExecutionInstancesAsyncInvoker(
        ListExecutionInstancesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listExecutionInstances, hcClient);
    }

    /**
     * 查询工单步骤详情
     *
     * 查询工单步骤详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionStepsRequest 请求对象
     * @return CompletableFuture<ListExecutionStepsResponse>
     */
    public CompletableFuture<ListExecutionStepsResponse> listExecutionStepsAsync(ListExecutionStepsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listExecutionSteps);
    }

    /**
     * 查询工单步骤详情
     *
     * 查询工单步骤详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionStepsRequest 请求对象
     * @return AsyncInvoker<ListExecutionStepsRequest, ListExecutionStepsResponse>
     */
    public AsyncInvoker<ListExecutionStepsRequest, ListExecutionStepsResponse> listExecutionStepsAsyncInvoker(
        ListExecutionStepsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listExecutionSteps, hcClient);
    }

    /**
     * 查询作业工单列表
     *
     * 查询作业工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionsRequest 请求对象
     * @return CompletableFuture<ListExecutionsResponse>
     */
    public CompletableFuture<ListExecutionsResponse> listExecutionsAsync(ListExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listExecutions);
    }

    /**
     * 查询作业工单列表
     *
     * 查询作业工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionsRequest 请求对象
     * @return AsyncInvoker<ListExecutionsRequest, ListExecutionsResponse>
     */
    public AsyncInvoker<ListExecutionsRequest, ListExecutionsResponse> listExecutionsAsyncInvoker(
        ListExecutionsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listExecutions, hcClient);
    }

    /**
     * 操作工单
     *
     * 操作工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateExecutionRequest 请求对象
     * @return CompletableFuture<OperateExecutionResponse>
     */
    public CompletableFuture<OperateExecutionResponse> operateExecutionAsync(OperateExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.operateExecution);
    }

    /**
     * 操作工单
     *
     * 操作工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateExecutionRequest 请求对象
     * @return AsyncInvoker<OperateExecutionRequest, OperateExecutionResponse>
     */
    public AsyncInvoker<OperateExecutionRequest, OperateExecutionResponse> operateExecutionAsyncInvoker(
        OperateExecutionRequest request) {
        return new AsyncInvoker<>(request, CocMeta.operateExecution, hcClient);
    }

    /**
     * CreateExternalIncident 创建事件单
     *
     * CreateExternalIncident 创建事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIncidentRequest 请求对象
     * @return CompletableFuture<CreateCocIncidentResponse>
     */
    public CompletableFuture<CreateCocIncidentResponse> createCocIncidentAsync(CreateCocIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createCocIncident);
    }

    /**
     * CreateExternalIncident 创建事件单
     *
     * CreateExternalIncident 创建事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIncidentRequest 请求对象
     * @return AsyncInvoker<CreateCocIncidentRequest, CreateCocIncidentResponse>
     */
    public AsyncInvoker<CreateCocIncidentRequest, CreateCocIncidentResponse> createCocIncidentAsyncInvoker(
        CreateCocIncidentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createCocIncident, hcClient);
    }

    /**
     * HandleCocIncident处理事件单
     *
     * HandleCocIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleCocIncidentRequest 请求对象
     * @return CompletableFuture<HandleCocIncidentResponse>
     */
    public CompletableFuture<HandleCocIncidentResponse> handleCocIncidentAsync(HandleCocIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.handleCocIncident);
    }

    /**
     * HandleCocIncident处理事件单
     *
     * HandleCocIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleCocIncidentRequest 请求对象
     * @return AsyncInvoker<HandleCocIncidentRequest, HandleCocIncidentResponse>
     */
    public AsyncInvoker<HandleCocIncidentRequest, HandleCocIncidentResponse> handleCocIncidentAsyncInvoker(
        HandleCocIncidentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.handleCocIncident, hcClient);
    }

    /**
     * GetCocTicketOperationHistories 获取事件单历史
     *
     * ListCocTicketOperationHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCocTicketOperationHistoriesRequest 请求对象
     * @return CompletableFuture<ListCocTicketOperationHistoriesResponse>
     */
    public CompletableFuture<ListCocTicketOperationHistoriesResponse> listCocTicketOperationHistoriesAsync(
        ListCocTicketOperationHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listCocTicketOperationHistories);
    }

    /**
     * GetCocTicketOperationHistories 获取事件单历史
     *
     * ListCocTicketOperationHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCocTicketOperationHistoriesRequest 请求对象
     * @return AsyncInvoker<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse>
     */
    public AsyncInvoker<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> listCocTicketOperationHistoriesAsyncInvoker(
        ListCocTicketOperationHistoriesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listCocTicketOperationHistories, hcClient);
    }

    /**
     * GetCocIncidentDetail 获取事件单详细
     *
     * ShowCocIncidentDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIncidentDetailRequest 请求对象
     * @return CompletableFuture<ShowCocIncidentDetailResponse>
     */
    public CompletableFuture<ShowCocIncidentDetailResponse> showCocIncidentDetailAsync(
        ShowCocIncidentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showCocIncidentDetail);
    }

    /**
     * GetCocIncidentDetail 获取事件单详细
     *
     * ShowCocIncidentDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIncidentDetailRequest 请求对象
     * @return AsyncInvoker<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse>
     */
    public AsyncInvoker<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> showCocIncidentDetailAsyncInvoker(
        ShowCocIncidentDetailRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showCocIncidentDetail, hcClient);
    }

    /**
     * CreateExternalIssues 创建问题单
     *
     * CreateExternalIssues 创建问题单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIssuesRequest 请求对象
     * @return CompletableFuture<CreateCocIssuesResponse>
     */
    public CompletableFuture<CreateCocIssuesResponse> createCocIssuesAsync(CreateCocIssuesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createCocIssues);
    }

    /**
     * CreateExternalIssues 创建问题单
     *
     * CreateExternalIssues 创建问题单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIssuesRequest 请求对象
     * @return AsyncInvoker<CreateCocIssuesRequest, CreateCocIssuesResponse>
     */
    public AsyncInvoker<CreateCocIssuesRequest, CreateCocIssuesResponse> createCocIssuesAsyncInvoker(
        CreateCocIssuesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createCocIssues, hcClient);
    }

    /**
     * GetCocIssuesDetail 获取事件单详细
     *
     * ShowCocIssuesDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIssuesDetailRequest 请求对象
     * @return CompletableFuture<ShowCocIssuesDetailResponse>
     */
    public CompletableFuture<ShowCocIssuesDetailResponse> showCocIssuesDetailAsync(ShowCocIssuesDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showCocIssuesDetail);
    }

    /**
     * GetCocIssuesDetail 获取事件单详细
     *
     * ShowCocIssuesDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIssuesDetailRequest 请求对象
     * @return AsyncInvoker<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse>
     */
    public AsyncInvoker<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> showCocIssuesDetailAsyncInvoker(
        ShowCocIssuesDetailRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showCocIssuesDetail, hcClient);
    }

    /**
     * 查询COC可授权单列表
     *
     * 查询COC可授权单列表（变更单号、事件单号、warroom和告警）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizableTicketsExternalRequest 请求对象
     * @return CompletableFuture<ListAuthorizableTicketsExternalResponse>
     */
    public CompletableFuture<ListAuthorizableTicketsExternalResponse> listAuthorizableTicketsExternalAsync(
        ListAuthorizableTicketsExternalRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listAuthorizableTicketsExternal);
    }

    /**
     * 查询COC可授权单列表
     *
     * 查询COC可授权单列表（变更单号、事件单号、warroom和告警）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizableTicketsExternalRequest 请求对象
     * @return AsyncInvoker<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse>
     */
    public AsyncInvoker<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> listAuthorizableTicketsExternalAsyncInvoker(
        ListAuthorizableTicketsExternalRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listAuthorizableTicketsExternal, hcClient);
    }

    /**
     * 查询用户在云厂商中的资源
     *
     * 查询用户在云厂商中的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudResourcesRequest 请求对象
     * @return CompletableFuture<ListMultiCloudResourcesResponse>
     */
    public CompletableFuture<ListMultiCloudResourcesResponse> listMultiCloudResourcesAsync(
        ListMultiCloudResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listMultiCloudResources);
    }

    /**
     * 查询用户在云厂商中的资源
     *
     * 查询用户在云厂商中的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudResourcesRequest 请求对象
     * @return AsyncInvoker<ListMultiCloudResourcesRequest, ListMultiCloudResourcesResponse>
     */
    public AsyncInvoker<ListMultiCloudResourcesRequest, ListMultiCloudResourcesResponse> listMultiCloudResourcesAsyncInvoker(
        ListMultiCloudResourcesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listMultiCloudResources, hcClient);
    }

    /**
     * 查询人员列表
     *
     * 获取人员列表（公网调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonnelRequest 请求对象
     * @return CompletableFuture<ListPersonnelResponse>
     */
    public CompletableFuture<ListPersonnelResponse> listPersonnelAsync(ListPersonnelRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listPersonnel);
    }

    /**
     * 查询人员列表
     *
     * 获取人员列表（公网调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonnelRequest 请求对象
     * @return AsyncInvoker<ListPersonnelRequest, ListPersonnelResponse>
     */
    public AsyncInvoker<ListPersonnelRequest, ListPersonnelResponse> listPersonnelAsyncInvoker(
        ListPersonnelRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listPersonnel, hcClient);
    }

    /**
     * 同步人员
     *
     * 同步人员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncAddPersonnelRequest 请求对象
     * @return CompletableFuture<SyncAddPersonnelResponse>
     */
    public CompletableFuture<SyncAddPersonnelResponse> syncAddPersonnelAsync(SyncAddPersonnelRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.syncAddPersonnel);
    }

    /**
     * 同步人员
     *
     * 同步人员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncAddPersonnelRequest 请求对象
     * @return AsyncInvoker<SyncAddPersonnelRequest, SyncAddPersonnelResponse>
     */
    public AsyncInvoker<SyncAddPersonnelRequest, SyncAddPersonnelResponse> syncAddPersonnelAsyncInvoker(
        SyncAddPersonnelRequest request) {
        return new AsyncInvoker<>(request, CocMeta.syncAddPersonnel, hcClient);
    }

    /**
     * 查询用户各种资源总数
     *
     * 查询用户各种资源总数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiResourcesRequest 请求对象
     * @return CompletableFuture<CountMultiResourcesResponse>
     */
    public CompletableFuture<CountMultiResourcesResponse> countMultiResourcesAsync(CountMultiResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.countMultiResources);
    }

    /**
     * 查询用户各种资源总数
     *
     * 查询用户各种资源总数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiResourcesRequest 请求对象
     * @return AsyncInvoker<CountMultiResourcesRequest, CountMultiResourcesResponse>
     */
    public AsyncInvoker<CountMultiResourcesRequest, CountMultiResourcesResponse> countMultiResourcesAsyncInvoker(
        CountMultiResourcesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.countMultiResources, hcClient);
    }

    /**
     * 查询用户所有资源
     *
     * 查询用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceRequest 请求对象
     * @return CompletableFuture<ListResourceResponse>
     */
    public CompletableFuture<ListResourceResponse> listResourceAsync(ListResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listResource);
    }

    /**
     * 查询用户所有资源
     *
     * 查询用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceRequest 请求对象
     * @return AsyncInvoker<ListResourceRequest, ListResourceResponse>
     */
    public AsyncInvoker<ListResourceRequest, ListResourceResponse> listResourceAsyncInvoker(
        ListResourceRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listResource, hcClient);
    }

    /**
     * 从RMS同步用户所有资源
     *
     * 从RMS同步用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceRequest 请求对象
     * @return CompletableFuture<SyncResourceResponse>
     */
    public CompletableFuture<SyncResourceResponse> syncResourceAsync(SyncResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.syncResource);
    }

    /**
     * 从RMS同步用户所有资源
     *
     * 从RMS同步用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceRequest 请求对象
     * @return AsyncInvoker<SyncResourceRequest, SyncResourceResponse>
     */
    public AsyncInvoker<SyncResourceRequest, SyncResourceResponse> syncResourceAsyncInvoker(
        SyncResourceRequest request) {
        return new AsyncInvoker<>(request, CocMeta.syncResource, hcClient);
    }

    /**
     * 查询资源标签列表
     *
     * 查询资源标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResourceTagsRequest 请求对象
     * @return CompletableFuture<ListScriptResourceTagsResponse>
     */
    public CompletableFuture<ListScriptResourceTagsResponse> listScriptResourceTagsAsync(
        ListScriptResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listScriptResourceTags);
    }

    /**
     * 查询资源标签列表
     *
     * 查询资源标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListScriptResourceTagsRequest, ListScriptResourceTagsResponse>
     */
    public AsyncInvoker<ListScriptResourceTagsRequest, ListScriptResourceTagsResponse> listScriptResourceTagsAsyncInvoker(
        ListScriptResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listScriptResourceTags, hcClient);
    }

    /**
     * 更新资源标签
     *
     * 更新资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceTagsRequest 请求对象
     * @return CompletableFuture<UpdateResourceTagsResponse>
     */
    public CompletableFuture<UpdateResourceTagsResponse> updateResourceTagsAsync(UpdateResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateResourceTags);
    }

    /**
     * 更新资源标签
     *
     * 更新资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceTagsRequest 请求对象
     * @return AsyncInvoker<UpdateResourceTagsRequest, UpdateResourceTagsResponse>
     */
    public AsyncInvoker<UpdateResourceTagsRequest, UpdateResourceTagsResponse> updateResourceTagsAsyncInvoker(
        UpdateResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateResourceTags, hcClient);
    }

    /**
     * 新建定时运维
     *
     * Create Scheduled Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTaskRequest 请求对象
     * @return CompletableFuture<CreateScheduledTaskResponse>
     */
    public CompletableFuture<CreateScheduledTaskResponse> createScheduledTaskAsync(CreateScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createScheduledTask);
    }

    /**
     * 新建定时运维
     *
     * Create Scheduled Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTaskRequest 请求对象
     * @return AsyncInvoker<CreateScheduledTaskRequest, CreateScheduledTaskResponse>
     */
    public AsyncInvoker<CreateScheduledTaskRequest, CreateScheduledTaskResponse> createScheduledTaskAsyncInvoker(
        CreateScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createScheduledTask, hcClient);
    }

    /**
     * 删除ScheduledTask
     *
     * Delete scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return CompletableFuture<DeleteScheduledTaskResponse>
     */
    public CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTaskAsync(DeleteScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteScheduledTask);
    }

    /**
     * 删除ScheduledTask
     *
     * Delete scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public AsyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskAsyncInvoker(
        DeleteScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 禁用ScheduledTask
     *
     * Disable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableScheduledTaskRequest 请求对象
     * @return CompletableFuture<DisableScheduledTaskResponse>
     */
    public CompletableFuture<DisableScheduledTaskResponse> disableScheduledTaskAsync(
        DisableScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.disableScheduledTask);
    }

    /**
     * 禁用ScheduledTask
     *
     * Disable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableScheduledTaskRequest 请求对象
     * @return AsyncInvoker<DisableScheduledTaskRequest, DisableScheduledTaskResponse>
     */
    public AsyncInvoker<DisableScheduledTaskRequest, DisableScheduledTaskResponse> disableScheduledTaskAsyncInvoker(
        DisableScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.disableScheduledTask, hcClient);
    }

    /**
     * 启用ScheduledTask
     *
     * Enable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableScheduledTaskRequest 请求对象
     * @return CompletableFuture<EnableScheduledTaskResponse>
     */
    public CompletableFuture<EnableScheduledTaskResponse> enableScheduledTaskAsync(EnableScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.enableScheduledTask);
    }

    /**
     * 启用ScheduledTask
     *
     * Enable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableScheduledTaskRequest 请求对象
     * @return AsyncInvoker<EnableScheduledTaskRequest, EnableScheduledTaskResponse>
     */
    public AsyncInvoker<EnableScheduledTaskRequest, EnableScheduledTaskResponse> enableScheduledTaskAsyncInvoker(
        EnableScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.enableScheduledTask, hcClient);
    }

    /**
     * 查询ScheduledTask列表
     *
     * Get ScheduledTask infos
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskRequest 请求对象
     * @return CompletableFuture<ListScheduledTaskResponse>
     */
    public CompletableFuture<ListScheduledTaskResponse> listScheduledTaskAsync(ListScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listScheduledTask);
    }

    /**
     * 查询ScheduledTask列表
     *
     * Get ScheduledTask infos
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskRequest 请求对象
     * @return AsyncInvoker<ListScheduledTaskRequest, ListScheduledTaskResponse>
     */
    public AsyncInvoker<ListScheduledTaskRequest, ListScheduledTaskResponse> listScheduledTaskAsyncInvoker(
        ListScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listScheduledTask, hcClient);
    }

    /**
     * 查询定时运维历史记录
     *
     * get scheduled task history list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskHistoryRequest 请求对象
     * @return CompletableFuture<ListScheduledTaskHistoryResponse>
     */
    public CompletableFuture<ListScheduledTaskHistoryResponse> listScheduledTaskHistoryAsync(
        ListScheduledTaskHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listScheduledTaskHistory);
    }

    /**
     * 查询定时运维历史记录
     *
     * get scheduled task history list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskHistoryRequest 请求对象
     * @return AsyncInvoker<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse>
     */
    public AsyncInvoker<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse> listScheduledTaskHistoryAsyncInvoker(
        ListScheduledTaskHistoryRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listScheduledTaskHistory, hcClient);
    }

    /**
     * 查询ScheduledTask
     *
     * Get ScheduledTask info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTaskRequest 请求对象
     * @return CompletableFuture<ShowScheduledTaskResponse>
     */
    public CompletableFuture<ShowScheduledTaskResponse> showScheduledTaskAsync(ShowScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showScheduledTask);
    }

    /**
     * 查询ScheduledTask
     *
     * Get ScheduledTask info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTaskRequest 请求对象
     * @return AsyncInvoker<ShowScheduledTaskRequest, ShowScheduledTaskResponse>
     */
    public AsyncInvoker<ShowScheduledTaskRequest, ShowScheduledTaskResponse> showScheduledTaskAsyncInvoker(
        ShowScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showScheduledTask, hcClient);
    }

    /**
     * 修改ScheduledTask
     *
     * Update ScheduledTask
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return CompletableFuture<UpdateScheduledTaskResponse>
     */
    public CompletableFuture<UpdateScheduledTaskResponse> updateScheduledTaskAsync(UpdateScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateScheduledTask);
    }

    /**
     * 修改ScheduledTask
     *
     * Update ScheduledTask
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return AsyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
     */
    public AsyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTaskAsyncInvoker(
        UpdateScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateScheduledTask, hcClient);
    }

    /**
     * 展示批次详情
     *
     * 查询：批次详情，分页获取批次中的实例列表。
     * 过滤条件：分页参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobBatchRequest 请求对象
     * @return CompletableFuture<GetScriptJobBatchResponse>
     */
    public CompletableFuture<GetScriptJobBatchResponse> getScriptJobBatchAsync(GetScriptJobBatchRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getScriptJobBatch);
    }

    /**
     * 展示批次详情
     *
     * 查询：批次详情，分页获取批次中的实例列表。
     * 过滤条件：分页参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobBatchRequest 请求对象
     * @return AsyncInvoker<GetScriptJobBatchRequest, GetScriptJobBatchResponse>
     */
    public AsyncInvoker<GetScriptJobBatchRequest, GetScriptJobBatchResponse> getScriptJobBatchAsyncInvoker(
        GetScriptJobBatchRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getScriptJobBatch, hcClient);
    }

    /**
     * 展示脚本工单基本信息
     *
     * 查询执行：基本信息
     * 执行类型、执行名称、创建人、创建时间、结束时间、执行状态、标签（脚本id，脚本名，执行脚本参数，执行用户，超时时长、成功率阈值）
     * 
     * 不同的任务类型消费标签中的不同key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobInfoRequest 请求对象
     * @return CompletableFuture<GetScriptJobInfoResponse>
     */
    public CompletableFuture<GetScriptJobInfoResponse> getScriptJobInfoAsync(GetScriptJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getScriptJobInfo);
    }

    /**
     * 展示脚本工单基本信息
     *
     * 查询执行：基本信息
     * 执行类型、执行名称、创建人、创建时间、结束时间、执行状态、标签（脚本id，脚本名，执行脚本参数，执行用户，超时时长、成功率阈值）
     * 
     * 不同的任务类型消费标签中的不同key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobInfoRequest 请求对象
     * @return AsyncInvoker<GetScriptJobInfoRequest, GetScriptJobInfoResponse>
     */
    public AsyncInvoker<GetScriptJobInfoRequest, GetScriptJobInfoResponse> getScriptJobInfoAsyncInvoker(
        GetScriptJobInfoRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getScriptJobInfo, hcClient);
    }

    /**
     * 展示实例状态统计信息
     *
     * 查询：实例状态统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobStatisticsRequest 请求对象
     * @return CompletableFuture<GetScriptJobStatisticsResponse>
     */
    public CompletableFuture<GetScriptJobStatisticsResponse> getScriptJobStatisticsAsync(
        GetScriptJobStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getScriptJobStatistics);
    }

    /**
     * 展示实例状态统计信息
     *
     * 查询：实例状态统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobStatisticsRequest 请求对象
     * @return AsyncInvoker<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse>
     */
    public AsyncInvoker<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> getScriptJobStatisticsAsyncInvoker(
        GetScriptJobStatisticsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getScriptJobStatistics, hcClient);
    }

    /**
     * 展示批次列表
     *
     * 查询：批次列表
     * 返回：批次index、批次标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobBatchesRequest 请求对象
     * @return CompletableFuture<ListScriptJobBatchesResponse>
     */
    public CompletableFuture<ListScriptJobBatchesResponse> listScriptJobBatchesAsync(
        ListScriptJobBatchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listScriptJobBatches);
    }

    /**
     * 展示批次列表
     *
     * 查询：批次列表
     * 返回：批次index、批次标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobBatchesRequest 请求对象
     * @return AsyncInvoker<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse>
     */
    public AsyncInvoker<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> listScriptJobBatchesAsyncInvoker(
        ListScriptJobBatchesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listScriptJobBatches, hcClient);
    }

    /**
     * 展示工单列表
     *
     * 查询作业工单列表，分页查询
     * 过滤：创建时间开始，创建时间结束、创建人
     * 返回：id、脚本名称、区域、创建人、创建时间、结束时间、总耗时、状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobsRequest 请求对象
     * @return CompletableFuture<ListScriptJobsResponse>
     */
    public CompletableFuture<ListScriptJobsResponse> listScriptJobsAsync(ListScriptJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listScriptJobs);
    }

    /**
     * 展示工单列表
     *
     * 查询作业工单列表，分页查询
     * 过滤：创建时间开始，创建时间结束、创建人
     * 返回：id、脚本名称、区域、创建人、创建时间、结束时间、总耗时、状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptJobsRequest 请求对象
     * @return AsyncInvoker<ListScriptJobsRequest, ListScriptJobsResponse>
     */
    public AsyncInvoker<ListScriptJobsRequest, ListScriptJobsResponse> listScriptJobsAsyncInvoker(
        ListScriptJobsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listScriptJobs, hcClient);
    }

    /**
     * 操作脚本工单
     *
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateScriptJobRequest 请求对象
     * @return CompletableFuture<OperateScriptJobResponse>
     */
    public CompletableFuture<OperateScriptJobResponse> operateScriptJobAsync(OperateScriptJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.operateScriptJob);
    }

    /**
     * 操作脚本工单
     *
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateScriptJobRequest 请求对象
     * @return AsyncInvoker<OperateScriptJobRequest, OperateScriptJobResponse>
     */
    public AsyncInvoker<OperateScriptJobRequest, OperateScriptJobResponse> operateScriptJobAsyncInvoker(
        OperateScriptJobRequest request) {
        return new AsyncInvoker<>(request, CocMeta.operateScriptJob, hcClient);
    }

    /**
     * 审批待审批的脚本
     *
     * 功能：审批脚本。
     * 约束条件：只有创建脚本填写了审批人，脚本为待审批状态才能审批。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScriptRequest 请求对象
     * @return CompletableFuture<AcceptScriptResponse>
     */
    public CompletableFuture<AcceptScriptResponse> acceptScriptAsync(AcceptScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.acceptScript);
    }

    /**
     * 审批待审批的脚本
     *
     * 功能：审批脚本。
     * 约束条件：只有创建脚本填写了审批人，脚本为待审批状态才能审批。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScriptRequest 请求对象
     * @return AsyncInvoker<AcceptScriptRequest, AcceptScriptResponse>
     */
    public AsyncInvoker<AcceptScriptRequest, AcceptScriptResponse> acceptScriptAsyncInvoker(
        AcceptScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.acceptScript, hcClient);
    }

    /**
     * 评估脚本风险等级
     *
     * 根据作业内容，对作业评估风险，返回相关分析的结果和信息，结果仅供参考。
     * 高危命令指影响系统或服务的正常运行，或造成系统特殊文件被恶意删除或修改命令。 高危命令检测通过校验规则正则匹配脚本内容中是否包含高危命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckScriptRiskRequest 请求对象
     * @return CompletableFuture<CheckScriptRiskResponse>
     */
    public CompletableFuture<CheckScriptRiskResponse> checkScriptRiskAsync(CheckScriptRiskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.checkScriptRisk);
    }

    /**
     * 评估脚本风险等级
     *
     * 根据作业内容，对作业评估风险，返回相关分析的结果和信息，结果仅供参考。
     * 高危命令指影响系统或服务的正常运行，或造成系统特殊文件被恶意删除或修改命令。 高危命令检测通过校验规则正则匹配脚本内容中是否包含高危命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckScriptRiskRequest 请求对象
     * @return AsyncInvoker<CheckScriptRiskRequest, CheckScriptRiskResponse>
     */
    public AsyncInvoker<CheckScriptRiskRequest, CheckScriptRiskResponse> checkScriptRiskAsyncInvoker(
        CheckScriptRiskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.checkScriptRisk, hcClient);
    }

    /**
     * 创建脚本
     *
     * 创建作业脚本：自定义脚本
     * - 脚本有标签属性，表示是高危脚本。创建时候不需要对脚本进行是否是高危的二次校验。
     * - 进行租户隔离；北向接口创建的脚本，审批人字段不填写，默认不需要审批
     * - 约束条件：
     * - 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * - 脚本内容最大100kb。
     * - 脚本参数个数最多20个。
     * - 脚本描述：最大256个字符。
     * - 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * - 单个参数的值最大1024个字符，正则表达式如下：^((?!\\.{2,})[a-zA-Z0-9_\\-/\\.\\*\\x20\\?:\&quot;,&#x3D;+@\\\\\\[\\{\\]\\}])*$。
     * - 审批人最多支持5人。
     * - 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return CompletableFuture<CreateScriptResponse>
     */
    public CompletableFuture<CreateScriptResponse> createScriptAsync(CreateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createScript);
    }

    /**
     * 创建脚本
     *
     * 创建作业脚本：自定义脚本
     * - 脚本有标签属性，表示是高危脚本。创建时候不需要对脚本进行是否是高危的二次校验。
     * - 进行租户隔离；北向接口创建的脚本，审批人字段不填写，默认不需要审批
     * - 约束条件：
     * - 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * - 脚本内容最大100kb。
     * - 脚本参数个数最多20个。
     * - 脚本描述：最大256个字符。
     * - 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * - 单个参数的值最大1024个字符，正则表达式如下：^((?!\\.{2,})[a-zA-Z0-9_\\-/\\.\\*\\x20\\?:\&quot;,&#x3D;+@\\\\\\[\\{\\]\\}])*$。
     * - 审批人最多支持5人。
     * - 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return AsyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public AsyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptAsyncInvoker(
        CreateScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createScript, hcClient);
    }

    /**
     * 删除自定义脚本
     *
     * 删除作业脚本：自定义脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return CompletableFuture<DeleteScriptResponse>
     */
    public CompletableFuture<DeleteScriptResponse> deleteScriptAsync(DeleteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteScript);
    }

    /**
     * 删除自定义脚本
     *
     * 删除作业脚本：自定义脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptAsyncInvoker(
        DeleteScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteScript, hcClient);
    }

    /**
     * 执行自定义脚本
     *
     * 执行脚本
     * 
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return CompletableFuture<ExecuteScriptResponse>
     */
    public CompletableFuture<ExecuteScriptResponse> executeScriptAsync(ExecuteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.executeScript);
    }

    /**
     * 执行自定义脚本
     *
     * 执行脚本
     * 
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 脚本输出的日志总量只支持1MB。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptRequest 请求对象
     * @return AsyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public AsyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptAsyncInvoker(
        ExecuteScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.executeScript, hcClient);
    }

    /**
     * 获取自定义脚本详情
     *
     * 获取脚本详情
     * 约束条件：
     * 只能查询自定义脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptRequest 请求对象
     * @return CompletableFuture<GetScriptResponse>
     */
    public CompletableFuture<GetScriptResponse> getScriptAsync(GetScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getScript);
    }

    /**
     * 获取自定义脚本详情
     *
     * 获取脚本详情
     * 约束条件：
     * 只能查询自定义脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptRequest 请求对象
     * @return AsyncInvoker<GetScriptRequest, GetScriptResponse>
     */
    public AsyncInvoker<GetScriptRequest, GetScriptResponse> getScriptAsyncInvoker(GetScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getScript, hcClient);
    }

    /**
     * 获取自动分批结果
     *
     * 根据分批策略获取分批结果，只支持自动分批：
     * 规则如下：
     * 1.单个批次的所有实例必须属于同一个区域；
     *      * 2.单个批次的所有实例必须属于同一个可用区；
     *      * 3.单个批次的所有实例必须属于同一个应用；
     *      * 4.单个批次内同一分组下的实例不超过50%（除分组下仅以一个实例的情况外）；
     *      * 5.前三批每批节点数量不超过10。
     *      * 6.每批次实例数量不超过10。
     * 
     *    总机器数量为200。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesBatchRequest 请求对象
     * @return CompletableFuture<ListInstancesBatchResponse>
     */
    public CompletableFuture<ListInstancesBatchResponse> listInstancesBatchAsync(ListInstancesBatchRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listInstancesBatch);
    }

    /**
     * 获取自动分批结果
     *
     * 根据分批策略获取分批结果，只支持自动分批：
     * 规则如下：
     * 1.单个批次的所有实例必须属于同一个区域；
     *      * 2.单个批次的所有实例必须属于同一个可用区；
     *      * 3.单个批次的所有实例必须属于同一个应用；
     *      * 4.单个批次内同一分组下的实例不超过50%（除分组下仅以一个实例的情况外）；
     *      * 5.前三批每批节点数量不超过10。
     *      * 6.每批次实例数量不超过10。
     * 
     *    总机器数量为200。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesBatchRequest 请求对象
     * @return AsyncInvoker<ListInstancesBatchRequest, ListInstancesBatchResponse>
     */
    public AsyncInvoker<ListInstancesBatchRequest, ListInstancesBatchResponse> listInstancesBatchAsyncInvoker(
        ListInstancesBatchRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listInstancesBatch, hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 作业脚本列表：自定义脚本
     * 
     * limit最大为100
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return CompletableFuture<ListScriptsResponse>
     */
    public CompletableFuture<ListScriptsResponse> listScriptsAsync(ListScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 作业脚本列表：自定义脚本
     * 
     * limit最大为100
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return AsyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public AsyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsAsyncInvoker(ListScriptsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listScripts, hcClient);
    }

    /**
     * 修改脚本
     *
     * 修改作业脚本：自定义脚本
     * 约束条件：
     * 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * 脚本内容最大4096个字符。
     * 脚本参数个数最多20个。
     * 脚本描述：最大256个字符。
     * 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * 单个参数的值最大1024个字符，正则表达式如下：^((?!.{2,})[a-zA-Z0-9_-/.*\\x20?:\&quot;,&#x3D;+@\\[{]}])*$。
     * 修改的脚本如果有审批人，在修改之后，需要再次选择审批人，查询审批
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return CompletableFuture<UpdateScriptResponse>
     */
    public CompletableFuture<UpdateScriptResponse> updateScriptAsync(UpdateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateScript);
    }

    /**
     * 修改脚本
     *
     * 修改作业脚本：自定义脚本
     * 约束条件：
     * 脚本名称：同一租户下，脚本名称不能重复，最大字符64个字符，支持中文+字母+数字+下划线。
     * 脚本内容最大4096个字符。
     * 脚本参数个数最多20个。
     * 脚本描述：最大256个字符。
     * 单个参数的参数名称 64个字符，只支持字母+数字+下划线。
     * 单个参数的值最大1024个字符，正则表达式如下：^((?!.{2,})[a-zA-Z0-9_-/.*\\x20?:\&quot;,&#x3D;+@\\[{]}])*$。
     * 修改的脚本如果有审批人，在修改之后，需要再次选择审批人，查询审批
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptAsyncInvoker(
        UpdateScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateScript, hcClient);
    }

    /**
     * 执行公共脚本
     *
     * 执行公共脚本
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePublicScriptRequest 请求对象
     * @return CompletableFuture<ExecutePublicScriptResponse>
     */
    public CompletableFuture<ExecutePublicScriptResponse> executePublicScriptAsync(ExecutePublicScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.executePublicScript);
    }

    /**
     * 执行公共脚本
     *
     * 执行公共脚本
     * 脚本入参、超时时间、执行用户、资源受限
     * 脚本入参支持20个。
     * 单次下发的机器支持200个。
     * 单次批次内机器数量最大10个。
     * 最大批次数量为20批。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePublicScriptRequest 请求对象
     * @return AsyncInvoker<ExecutePublicScriptRequest, ExecutePublicScriptResponse>
     */
    public AsyncInvoker<ExecutePublicScriptRequest, ExecutePublicScriptResponse> executePublicScriptAsyncInvoker(
        ExecutePublicScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.executePublicScript, hcClient);
    }

    /**
     * 展示公共脚本详情
     *
     * 展示公共脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPublicScriptRequest 请求对象
     * @return CompletableFuture<GetPublicScriptResponse>
     */
    public CompletableFuture<GetPublicScriptResponse> getPublicScriptAsync(GetPublicScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.getPublicScript);
    }

    /**
     * 展示公共脚本详情
     *
     * 展示公共脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPublicScriptRequest 请求对象
     * @return AsyncInvoker<GetPublicScriptRequest, GetPublicScriptResponse>
     */
    public AsyncInvoker<GetPublicScriptRequest, GetPublicScriptResponse> getPublicScriptAsyncInvoker(
        GetPublicScriptRequest request) {
        return new AsyncInvoker<>(request, CocMeta.getPublicScript, hcClient);
    }

    /**
     * 获取公共脚本列表
     *
     * 获取公共脚本列表，分页逻辑：采用limit+marker方式，提高分页效率。用自增id作为marker参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicScriptsRequest 请求对象
     * @return CompletableFuture<ListPublicScriptsResponse>
     */
    public CompletableFuture<ListPublicScriptsResponse> listPublicScriptsAsync(ListPublicScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listPublicScripts);
    }

    /**
     * 获取公共脚本列表
     *
     * 获取公共脚本列表，分页逻辑：采用limit+marker方式，提高分页效率。用自增id作为marker参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicScriptsRequest 请求对象
     * @return AsyncInvoker<ListPublicScriptsRequest, ListPublicScriptsResponse>
     */
    public AsyncInvoker<ListPublicScriptsRequest, ListPublicScriptsResponse> listPublicScriptsAsyncInvoker(
        ListPublicScriptsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listPublicScripts, hcClient);
    }

    /**
     * 查询Sla模板详情
     *
     * Get Sla Template info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaCustomizedTemplateRequest 请求对象
     * @return CompletableFuture<ShowSlaCustomizedTemplateResponse>
     */
    public CompletableFuture<ShowSlaCustomizedTemplateResponse> showSlaCustomizedTemplateAsync(
        ShowSlaCustomizedTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showSlaCustomizedTemplate);
    }

    /**
     * 查询Sla模板详情
     *
     * Get Sla Template info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaCustomizedTemplateRequest 请求对象
     * @return AsyncInvoker<ShowSlaCustomizedTemplateRequest, ShowSlaCustomizedTemplateResponse>
     */
    public AsyncInvoker<ShowSlaCustomizedTemplateRequest, ShowSlaCustomizedTemplateResponse> showSlaCustomizedTemplateAsyncInvoker(
        ShowSlaCustomizedTemplateRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showSlaCustomizedTemplate, hcClient);
    }

    /**
     * 查询SLA工单信息
     *
     * SLA 工单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaOrderRequest 请求对象
     * @return CompletableFuture<ShowSlaOrderResponse>
     */
    public CompletableFuture<ShowSlaOrderResponse> showSlaOrderAsync(ShowSlaOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showSlaOrder);
    }

    /**
     * 查询SLA工单信息
     *
     * SLA 工单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlaOrderRequest 请求对象
     * @return AsyncInvoker<ShowSlaOrderRequest, ShowSlaOrderResponse>
     */
    public AsyncInvoker<ShowSlaOrderRequest, ShowSlaOrderResponse> showSlaOrderAsyncInvoker(
        ShowSlaOrderRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showSlaOrder, hcClient);
    }

    /**
     * 查询中断记录
     *
     * 查询中断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInterruptRecordsRequest 请求对象
     * @return CompletableFuture<ListInterruptRecordsResponse>
     */
    public CompletableFuture<ListInterruptRecordsResponse> listInterruptRecordsAsync(
        ListInterruptRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listInterruptRecords);
    }

    /**
     * 查询中断记录
     *
     * 查询中断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInterruptRecordsRequest 请求对象
     * @return AsyncInvoker<ListInterruptRecordsRequest, ListInterruptRecordsResponse>
     */
    public AsyncInvoker<ListInterruptRecordsRequest, ListInterruptRecordsResponse> listInterruptRecordsAsyncInvoker(
        ListInterruptRecordsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listInterruptRecords, hcClient);
    }

    /**
     * 查询SLO详情
     *
     * 查询SLO详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSloDetailRequest 请求对象
     * @return CompletableFuture<ShowSloDetailResponse>
     */
    public CompletableFuture<ShowSloDetailResponse> showSloDetailAsync(ShowSloDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showSloDetail);
    }

    /**
     * 查询SLO详情
     *
     * 查询SLO详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSloDetailRequest 请求对象
     * @return AsyncInvoker<ShowSloDetailRequest, ShowSloDetailResponse>
     */
    public AsyncInvoker<ShowSloDetailRequest, ShowSloDetailResponse> showSloDetailAsyncInvoker(
        ShowSloDetailRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showSloDetail, hcClient);
    }

    /**
     * 创建租户区WarRoom
     *
     * 创建租户区WarRoom
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarRoomRequest 请求对象
     * @return CompletableFuture<CreateWarRoomResponse>
     */
    public CompletableFuture<CreateWarRoomResponse> createWarRoomAsync(CreateWarRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createWarRoom);
    }

    /**
     * 创建租户区WarRoom
     *
     * 创建租户区WarRoom
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarRoomRequest 请求对象
     * @return AsyncInvoker<CreateWarRoomRequest, CreateWarRoomResponse>
     */
    public AsyncInvoker<CreateWarRoomRequest, CreateWarRoomResponse> createWarRoomAsyncInvoker(
        CreateWarRoomRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createWarRoom, hcClient);
    }

    /**
     * 查询租户区WarRoom信息列表
     *
     * 查询租户区WarRoom信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarRoomsRequest 请求对象
     * @return CompletableFuture<ListWarRoomsResponse>
     */
    public CompletableFuture<ListWarRoomsResponse> listWarRoomsAsync(ListWarRoomsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listWarRooms);
    }

    /**
     * 查询租户区WarRoom信息列表
     *
     * 查询租户区WarRoom信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarRoomsRequest 请求对象
     * @return AsyncInvoker<ListWarRoomsRequest, ListWarRoomsResponse>
     */
    public AsyncInvoker<ListWarRoomsRequest, ListWarRoomsResponse> listWarRoomsAsyncInvoker(
        ListWarRoomsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listWarRooms, hcClient);
    }

}

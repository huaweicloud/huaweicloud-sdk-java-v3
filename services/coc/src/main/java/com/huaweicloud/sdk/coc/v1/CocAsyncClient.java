package com.huaweicloud.sdk.coc.v1;

import com.huaweicloud.sdk.coc.v1.model.AcceptScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.AcceptScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewRequest;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewResponse;
import com.huaweicloud.sdk.coc.v1.model.CancelDiagnosisTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CancelDiagnosisTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CheckScriptRiskRequest;
import com.huaweicloud.sdk.coc.v1.model.CheckScriptRiskResponse;
import com.huaweicloud.sdk.coc.v1.model.ClearAlarmRequest;
import com.huaweicloud.sdk.coc.v1.model.ClearAlarmResponse;
import com.huaweicloud.sdk.coc.v1.model.CountGroupRmsResourceRelationsRequest;
import com.huaweicloud.sdk.coc.v1.model.CountGroupRmsResourceRelationsResponse;
import com.huaweicloud.sdk.coc.v1.model.CountMultiCloudResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.CountMultiCloudResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.CountOtherResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.CountOtherResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.CountResourcesOfResourceViewRequest;
import com.huaweicloud.sdk.coc.v1.model.CountResourcesOfResourceViewResponse;
import com.huaweicloud.sdk.coc.v1.model.CountResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.CountResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateApplicationComponentsRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateApplicationComponentsResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateApplicationGroupRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateApplicationGroupResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateApplicationRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateApplicationResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateAssessTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateAssessTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateAttachmentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateAttachmentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalCocAttachmentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalCocAttachmentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateGroupRmsResourceRelationRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateGroupRmsResourceRelationResponse;
import com.huaweicloud.sdk.coc.v1.model.CreatePasswordChangePlanRequest;
import com.huaweicloud.sdk.coc.v1.model.CreatePasswordChangePlanResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateResourceTagsRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateResourceTagsResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateResourceViewsRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateResourceViewsResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateTicketRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateTicketResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateVendorAccountRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateVendorAccountResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteApplicationComponentRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteApplicationComponentResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteApplicationGroupRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteApplicationGroupResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteGroupRmsResourceRelationRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteGroupRmsResourceRelationResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteResourceViewsRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteResourceViewsResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteTicketInfoRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteTicketInfoResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteVendorAccountRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteVendorAccountResponse;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.DownloadAttachmentRequest;
import com.huaweicloud.sdk.coc.v1.model.DownloadAttachmentResponse;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteTicketActionRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteTicketActionResponse;
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
import com.huaweicloud.sdk.coc.v1.model.HandleIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.HandlerAlarmRequest;
import com.huaweicloud.sdk.coc.v1.model.HandlerAlarmResponse;
import com.huaweicloud.sdk.coc.v1.model.ImportOtherResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.ImportOtherResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationComponentsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationComponentsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationGroupsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationGroupsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationViewRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationViewResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAssessTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAssessTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalResponse;
import com.huaweicloud.sdk.coc.v1.model.ListCapacityOrderRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCapacityOrderResponse;
import com.huaweicloud.sdk.coc.v1.model.ListCapacityViewRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCapacityViewResponse;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListDiagnosisTasksRequest;
import com.huaweicloud.sdk.coc.v1.model.ListDiagnosisTasksResponse;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentAtomicsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentAtomicsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListDocumentsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListEnterpriseProjectCollectRequest;
import com.huaweicloud.sdk.coc.v1.model.ListEnterpriseProjectCollectResponse;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionInstancesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionInstancesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionStepsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionStepsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListExecutionsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListGroupAliResourceRelationsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListGroupAliResourceRelationsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListGroupOtherResourceRelationsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListGroupOtherResourceRelationsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListGroupRmsResourceRelationsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListGroupRmsResourceRelationsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListIncidentSimpleTicketsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListIncidentSimpleTicketsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListIncidentsHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListIncidentsHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListIncidentsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListIncidentsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInstancesBatchRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInstancesBatchResponse;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListResourceViewsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListResourceViewsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListResourcesOfResourceViewRequest;
import com.huaweicloud.sdk.coc.v1.model.ListResourcesOfResourceViewResponse;
import com.huaweicloud.sdk.coc.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListResourcesResponse;
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
import com.huaweicloud.sdk.coc.v1.model.ListSubTicketsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListSubTicketsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListTicketOperationHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListTicketOperationHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListTicketsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListTicketsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListVendorAccountRequest;
import com.huaweicloud.sdk.coc.v1.model.ListVendorAccountResponse;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateExecutionRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateExecutionResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobResponse;
import com.huaweicloud.sdk.coc.v1.model.ResetAccountPasswordRequest;
import com.huaweicloud.sdk.coc.v1.model.ResetAccountPasswordResponse;
import com.huaweicloud.sdk.coc.v1.model.RetryDiagnosisTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.RetryDiagnosisTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowAlarmRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowAlarmResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowDiagnosisNodeRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowDiagnosisNodeResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowDiagnosisSummaryRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowDiagnosisSummaryResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowDiagnosisTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowDiagnosisTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowIncidentTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowIncidentTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowTicketInfoRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowTicketInfoResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncGroupResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncGroupResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncMultiCloudResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncMultiCloudResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceAgentRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceAgentResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncResourcesOfResourceViewRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncResourcesOfResourceViewResponse;
import com.huaweicloud.sdk.coc.v1.model.TransferAlarmToIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.TransferAlarmToIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateAccountPasswordRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateAccountPasswordResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateApplicationComponentRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateApplicationComponentResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateApplicationGroupRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateApplicationGroupResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateApplicationResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateChangeRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateChangeResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateEnterpriseProjectCollectRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateEnterpriseProjectCollectResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateGroupRmsResourceRelationRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateGroupRmsResourceRelationResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceTagsRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceTagsResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceViewsRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceViewsResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateTicketRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateTicketResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateVendorAccountRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateVendorAccountResponse;
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
     * 创建改密计划
     *
     * 创建改密计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePasswordChangePlanRequest 请求对象
     * @return CompletableFuture<CreatePasswordChangePlanResponse>
     */
    public CompletableFuture<CreatePasswordChangePlanResponse> createPasswordChangePlanAsync(
        CreatePasswordChangePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createPasswordChangePlan);
    }

    /**
     * 创建改密计划
     *
     * 创建改密计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePasswordChangePlanRequest 请求对象
     * @return AsyncInvoker<CreatePasswordChangePlanRequest, CreatePasswordChangePlanResponse>
     */
    public AsyncInvoker<CreatePasswordChangePlanRequest, CreatePasswordChangePlanResponse> createPasswordChangePlanAsyncInvoker(
        CreatePasswordChangePlanRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createPasswordChangePlan, hcClient);
    }

    /**
     * 主机密码重置
     *
     * 主机密码重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAccountPasswordRequest 请求对象
     * @return CompletableFuture<ResetAccountPasswordResponse>
     */
    public CompletableFuture<ResetAccountPasswordResponse> resetAccountPasswordAsync(
        ResetAccountPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.resetAccountPassword);
    }

    /**
     * 主机密码重置
     *
     * 主机密码重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAccountPasswordRequest 请求对象
     * @return AsyncInvoker<ResetAccountPasswordRequest, ResetAccountPasswordResponse>
     */
    public AsyncInvoker<ResetAccountPasswordRequest, ResetAccountPasswordResponse> resetAccountPasswordAsyncInvoker(
        ResetAccountPasswordRequest request) {
        return new AsyncInvoker<>(request, CocMeta.resetAccountPassword, hcClient);
    }

    /**
     * 回写改密结果
     *
     * 回写改密结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccountPasswordRequest 请求对象
     * @return CompletableFuture<UpdateAccountPasswordResponse>
     */
    public CompletableFuture<UpdateAccountPasswordResponse> updateAccountPasswordAsync(
        UpdateAccountPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateAccountPassword);
    }

    /**
     * 回写改密结果
     *
     * 回写改密结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccountPasswordRequest 请求对象
     * @return AsyncInvoker<UpdateAccountPasswordRequest, UpdateAccountPasswordResponse>
     */
    public AsyncInvoker<UpdateAccountPasswordRequest, UpdateAccountPasswordResponse> updateAccountPasswordAsyncInvoker(
        UpdateAccountPasswordRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateAccountPassword, hcClient);
    }

    /**
     * 批量清除告警
     *
     * 清除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearAlarmRequest 请求对象
     * @return CompletableFuture<ClearAlarmResponse>
     */
    public CompletableFuture<ClearAlarmResponse> clearAlarmAsync(ClearAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.clearAlarm);
    }

    /**
     * 批量清除告警
     *
     * 清除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearAlarmRequest 请求对象
     * @return AsyncInvoker<ClearAlarmRequest, ClearAlarmResponse>
     */
    public AsyncInvoker<ClearAlarmRequest, ClearAlarmResponse> clearAlarmAsyncInvoker(ClearAlarmRequest request) {
        return new AsyncInvoker<>(request, CocMeta.clearAlarm, hcClient);
    }

    /**
     * 自动处理告警
     *
     * 自动处理告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandlerAlarmRequest 请求对象
     * @return CompletableFuture<HandlerAlarmResponse>
     */
    public CompletableFuture<HandlerAlarmResponse> handlerAlarmAsync(HandlerAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.handlerAlarm);
    }

    /**
     * 自动处理告警
     *
     * 自动处理告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandlerAlarmRequest 请求对象
     * @return AsyncInvoker<HandlerAlarmRequest, HandlerAlarmResponse>
     */
    public AsyncInvoker<HandlerAlarmRequest, HandlerAlarmResponse> handlerAlarmAsyncInvoker(
        HandlerAlarmRequest request) {
        return new AsyncInvoker<>(request, CocMeta.handlerAlarm, hcClient);
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
     * 批量告警转事件
     *
     * 批量告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferAlarmToIncidentRequest 请求对象
     * @return CompletableFuture<TransferAlarmToIncidentResponse>
     */
    public CompletableFuture<TransferAlarmToIncidentResponse> transferAlarmToIncidentAsync(
        TransferAlarmToIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.transferAlarmToIncident);
    }

    /**
     * 批量告警转事件
     *
     * 批量告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferAlarmToIncidentRequest 请求对象
     * @return AsyncInvoker<TransferAlarmToIncidentRequest, TransferAlarmToIncidentResponse>
     */
    public AsyncInvoker<TransferAlarmToIncidentRequest, TransferAlarmToIncidentResponse> transferAlarmToIncidentAsyncInvoker(
        TransferAlarmToIncidentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.transferAlarmToIncident, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteApplication, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationResponse>
     */
    public CompletableFuture<UpdateApplicationResponse> updateApplicationAsync(UpdateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateApplication);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationAsyncInvoker(
        UpdateApplicationRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateApplication, hcClient);
    }

    /**
     * 批量创建应用，分组，组件
     *
     * 批量创建应用，分组，组件。
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
     * 批量创建应用，分组，组件
     *
     * 批量创建应用，分组，组件。
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
     * 查询应用、组件、分组名称列表
     *
     * 查询应用、组件、分组名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationViewRequest 请求对象
     * @return CompletableFuture<ListApplicationViewResponse>
     */
    public CompletableFuture<ListApplicationViewResponse> listApplicationViewAsync(ListApplicationViewRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listApplicationView);
    }

    /**
     * 查询应用、组件、分组名称列表
     *
     * 查询应用、组件、分组名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationViewRequest 请求对象
     * @return AsyncInvoker<ListApplicationViewRequest, ListApplicationViewResponse>
     */
    public AsyncInvoker<ListApplicationViewRequest, ListApplicationViewResponse> listApplicationViewAsyncInvoker(
        ListApplicationViewRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listApplicationView, hcClient);
    }

    /**
     * 创建应用评估任务
     *
     * 创建应用评估任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssessTaskRequest 请求对象
     * @return CompletableFuture<CreateAssessTaskResponse>
     */
    public CompletableFuture<CreateAssessTaskResponse> createAssessTaskAsync(CreateAssessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createAssessTask);
    }

    /**
     * 创建应用评估任务
     *
     * 创建应用评估任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssessTaskRequest 请求对象
     * @return AsyncInvoker<CreateAssessTaskRequest, CreateAssessTaskResponse>
     */
    public AsyncInvoker<CreateAssessTaskRequest, CreateAssessTaskResponse> createAssessTaskAsyncInvoker(
        CreateAssessTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createAssessTask, hcClient);
    }

    /**
     * 分页查询评估任务列表
     *
     * 分页查询评估任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssessTaskRequest 请求对象
     * @return CompletableFuture<ListAssessTaskResponse>
     */
    public CompletableFuture<ListAssessTaskResponse> listAssessTaskAsync(ListAssessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listAssessTask);
    }

    /**
     * 分页查询评估任务列表
     *
     * 分页查询评估任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssessTaskRequest 请求对象
     * @return AsyncInvoker<ListAssessTaskRequest, ListAssessTaskResponse>
     */
    public AsyncInvoker<ListAssessTaskRequest, ListAssessTaskResponse> listAssessTaskAsyncInvoker(
        ListAssessTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listAssessTask, hcClient);
    }

    /**
     * UpdateChange 更新变更单
     *
     * UpdateChange 更新变更单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChangeRequest 请求对象
     * @return CompletableFuture<UpdateChangeResponse>
     */
    public CompletableFuture<UpdateChangeResponse> updateChangeAsync(UpdateChangeRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateChange);
    }

    /**
     * UpdateChange 更新变更单
     *
     * UpdateChange 更新变更单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChangeRequest 请求对象
     * @return AsyncInvoker<UpdateChangeRequest, UpdateChangeResponse>
     */
    public AsyncInvoker<UpdateChangeRequest, UpdateChangeResponse> updateChangeAsyncInvoker(
        UpdateChangeRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateChange, hcClient);
    }

    /**
     * HandleIncident 处理事件单
     *
     * HandleIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleIncidentRequest 请求对象
     * @return CompletableFuture<HandleIncidentResponse>
     */
    public CompletableFuture<HandleIncidentResponse> handleIncidentAsync(HandleIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.handleIncident);
    }

    /**
     * HandleIncident 处理事件单
     *
     * HandleIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleIncidentRequest 请求对象
     * @return AsyncInvoker<HandleIncidentRequest, HandleIncidentResponse>
     */
    public AsyncInvoker<HandleIncidentRequest, HandleIncidentResponse> handleIncidentAsyncInvoker(
        HandleIncidentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.handleIncident, hcClient);
    }

    /**
     * ListIncidents 查询事件单列表
     *
     * ListIncidents 查询事件单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return CompletableFuture<ListIncidentsResponse>
     */
    public CompletableFuture<ListIncidentsResponse> listIncidentsAsync(ListIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listIncidents);
    }

    /**
     * ListIncidents 查询事件单列表
     *
     * ListIncidents 查询事件单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsAsyncInvoker(
        ListIncidentsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listIncidents, hcClient);
    }

    /**
     * ListIncidentsHistories 获取事件单历史
     *
     * ListIncidentsHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsHistoriesRequest 请求对象
     * @return CompletableFuture<ListIncidentsHistoriesResponse>
     */
    public CompletableFuture<ListIncidentsHistoriesResponse> listIncidentsHistoriesAsync(
        ListIncidentsHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listIncidentsHistories);
    }

    /**
     * ListIncidentsHistories 获取事件单历史
     *
     * ListIncidentsHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsHistoriesRequest 请求对象
     * @return AsyncInvoker<ListIncidentsHistoriesRequest, ListIncidentsHistoriesResponse>
     */
    public AsyncInvoker<ListIncidentsHistoriesRequest, ListIncidentsHistoriesResponse> listIncidentsHistoriesAsyncInvoker(
        ListIncidentsHistoriesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listIncidentsHistories, hcClient);
    }

    /**
     * ShowIncidentTask 获取事件任务
     *
     * ShowIncidentTask 获取事件任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentTaskRequest 请求对象
     * @return CompletableFuture<ShowIncidentTaskResponse>
     */
    public CompletableFuture<ShowIncidentTaskResponse> showIncidentTaskAsync(ShowIncidentTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showIncidentTask);
    }

    /**
     * ShowIncidentTask 获取事件任务
     *
     * ShowIncidentTask 获取事件任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentTaskRequest 请求对象
     * @return AsyncInvoker<ShowIncidentTaskRequest, ShowIncidentTaskResponse>
     */
    public AsyncInvoker<ShowIncidentTaskRequest, ShowIncidentTaskResponse> showIncidentTaskAsyncInvoker(
        ShowIncidentTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showIncidentTask, hcClient);
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
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationComponentsRequest 请求对象
     * @return CompletableFuture<CreateApplicationComponentsResponse>
     */
    public CompletableFuture<CreateApplicationComponentsResponse> createApplicationComponentsAsync(
        CreateApplicationComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createApplicationComponents);
    }

    /**
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationComponentsRequest 请求对象
     * @return AsyncInvoker<CreateApplicationComponentsRequest, CreateApplicationComponentsResponse>
     */
    public AsyncInvoker<CreateApplicationComponentsRequest, CreateApplicationComponentsResponse> createApplicationComponentsAsyncInvoker(
        CreateApplicationComponentsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createApplicationComponents, hcClient);
    }

    /**
     * 删除组件
     *
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationComponentRequest 请求对象
     * @return CompletableFuture<DeleteApplicationComponentResponse>
     */
    public CompletableFuture<DeleteApplicationComponentResponse> deleteApplicationComponentAsync(
        DeleteApplicationComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteApplicationComponent);
    }

    /**
     * 删除组件
     *
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationComponentRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationComponentRequest, DeleteApplicationComponentResponse>
     */
    public AsyncInvoker<DeleteApplicationComponentRequest, DeleteApplicationComponentResponse> deleteApplicationComponentAsyncInvoker(
        DeleteApplicationComponentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteApplicationComponent, hcClient);
    }

    /**
     * 查询组件
     *
     * 查询组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationComponentsRequest 请求对象
     * @return CompletableFuture<ListApplicationComponentsResponse>
     */
    public CompletableFuture<ListApplicationComponentsResponse> listApplicationComponentsAsync(
        ListApplicationComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listApplicationComponents);
    }

    /**
     * 查询组件
     *
     * 查询组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationComponentsRequest 请求对象
     * @return AsyncInvoker<ListApplicationComponentsRequest, ListApplicationComponentsResponse>
     */
    public AsyncInvoker<ListApplicationComponentsRequest, ListApplicationComponentsResponse> listApplicationComponentsAsyncInvoker(
        ListApplicationComponentsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listApplicationComponents, hcClient);
    }

    /**
     * 修改组件
     *
     * 修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationComponentRequest 请求对象
     * @return CompletableFuture<UpdateApplicationComponentResponse>
     */
    public CompletableFuture<UpdateApplicationComponentResponse> updateApplicationComponentAsync(
        UpdateApplicationComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateApplicationComponent);
    }

    /**
     * 修改组件
     *
     * 修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationComponentRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationComponentRequest, UpdateApplicationComponentResponse>
     */
    public AsyncInvoker<UpdateApplicationComponentRequest, UpdateApplicationComponentResponse> updateApplicationComponentAsyncInvoker(
        UpdateApplicationComponentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateApplicationComponent, hcClient);
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
     * 查询线下IDC资源数量
     *
     * 查询IDC离线资源的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOtherResourceRequest 请求对象
     * @return CompletableFuture<CountOtherResourceResponse>
     */
    public CompletableFuture<CountOtherResourceResponse> countOtherResourceAsync(CountOtherResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.countOtherResource);
    }

    /**
     * 查询线下IDC资源数量
     *
     * 查询IDC离线资源的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOtherResourceRequest 请求对象
     * @return AsyncInvoker<CountOtherResourceRequest, CountOtherResourceResponse>
     */
    public AsyncInvoker<CountOtherResourceRequest, CountOtherResourceResponse> countOtherResourceAsyncInvoker(
        CountOtherResourceRequest request) {
        return new AsyncInvoker<>(request, CocMeta.countOtherResource, hcClient);
    }

    /**
     * 导入IDC离线资源
     *
     * 管理线下设备提供IDC离线资源纳管功能-导入IDC离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportOtherResourceRequest 请求对象
     * @return CompletableFuture<ImportOtherResourceResponse>
     */
    public CompletableFuture<ImportOtherResourceResponse> importOtherResourceAsync(ImportOtherResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.importOtherResource);
    }

    /**
     * 导入IDC离线资源
     *
     * 管理线下设备提供IDC离线资源纳管功能-导入IDC离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportOtherResourceRequest 请求对象
     * @return AsyncInvoker<ImportOtherResourceRequest, ImportOtherResourceResponse>
     */
    public AsyncInvoker<ImportOtherResourceRequest, ImportOtherResourceResponse> importOtherResourceAsyncInvoker(
        ImportOtherResourceRequest request) {
        return new AsyncInvoker<>(request, CocMeta.importOtherResource, hcClient);
    }

    /**
     * 取消诊断任务
     *
     * 取消诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<CancelDiagnosisTaskResponse>
     */
    public CompletableFuture<CancelDiagnosisTaskResponse> cancelDiagnosisTaskAsync(CancelDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.cancelDiagnosisTask);
    }

    /**
     * 取消诊断任务
     *
     * 取消诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<CancelDiagnosisTaskRequest, CancelDiagnosisTaskResponse>
     */
    public AsyncInvoker<CancelDiagnosisTaskRequest, CancelDiagnosisTaskResponse> cancelDiagnosisTaskAsyncInvoker(
        CancelDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.cancelDiagnosisTask, hcClient);
    }

    /**
     * 提交诊断任务
     *
     * 提交诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<CreateDiagnosisTaskResponse>
     */
    public CompletableFuture<CreateDiagnosisTaskResponse> createDiagnosisTaskAsync(CreateDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createDiagnosisTask);
    }

    /**
     * 提交诊断任务
     *
     * 提交诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskAsyncInvoker(
        CreateDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createDiagnosisTask, hcClient);
    }

    /**
     * 查询诊断记录
     *
     * 查询诊断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return CompletableFuture<ListDiagnosisTasksResponse>
     */
    public CompletableFuture<ListDiagnosisTasksResponse> listDiagnosisTasksAsync(ListDiagnosisTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listDiagnosisTasks);
    }

    /**
     * 查询诊断记录
     *
     * 查询诊断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return AsyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse>
     */
    public AsyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasksAsyncInvoker(
        ListDiagnosisTasksRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listDiagnosisTasks, hcClient);
    }

    /**
     * 重试诊断任务
     *
     * 重试诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<RetryDiagnosisTaskResponse>
     */
    public CompletableFuture<RetryDiagnosisTaskResponse> retryDiagnosisTaskAsync(RetryDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.retryDiagnosisTask);
    }

    /**
     * 重试诊断任务
     *
     * 重试诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<RetryDiagnosisTaskRequest, RetryDiagnosisTaskResponse>
     */
    public AsyncInvoker<RetryDiagnosisTaskRequest, RetryDiagnosisTaskResponse> retryDiagnosisTaskAsyncInvoker(
        RetryDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.retryDiagnosisTask, hcClient);
    }

    /**
     * 查询指定诊断记录下的指定诊断步骤的详情
     *
     * 查询指定诊断记录下的指定诊断步骤的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisNodeRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisNodeResponse>
     */
    public CompletableFuture<ShowDiagnosisNodeResponse> showDiagnosisNodeAsync(ShowDiagnosisNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showDiagnosisNode);
    }

    /**
     * 查询指定诊断记录下的指定诊断步骤的详情
     *
     * 查询指定诊断记录下的指定诊断步骤的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisNodeRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisNodeRequest, ShowDiagnosisNodeResponse>
     */
    public AsyncInvoker<ShowDiagnosisNodeRequest, ShowDiagnosisNodeResponse> showDiagnosisNodeAsyncInvoker(
        ShowDiagnosisNodeRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showDiagnosisNode, hcClient);
    }

    /**
     * 查询批量诊断任务的结果概要
     *
     * 查询诊断任务的结果概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisSummaryRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisSummaryResponse>
     */
    public CompletableFuture<ShowDiagnosisSummaryResponse> showDiagnosisSummaryAsync(
        ShowDiagnosisSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showDiagnosisSummary);
    }

    /**
     * 查询批量诊断任务的结果概要
     *
     * 查询诊断任务的结果概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisSummaryRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisSummaryRequest, ShowDiagnosisSummaryResponse>
     */
    public AsyncInvoker<ShowDiagnosisSummaryRequest, ShowDiagnosisSummaryResponse> showDiagnosisSummaryAsyncInvoker(
        ShowDiagnosisSummaryRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showDiagnosisSummary, hcClient);
    }

    /**
     * 查询单个诊断任务详情
     *
     * 查询单个诊断任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisTaskResponse>
     */
    public CompletableFuture<ShowDiagnosisTaskResponse> showDiagnosisTaskAsync(ShowDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showDiagnosisTask);
    }

    /**
     * 查询单个诊断任务详情
     *
     * 查询单个诊断任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisTaskRequest, ShowDiagnosisTaskResponse>
     */
    public AsyncInvoker<ShowDiagnosisTaskRequest, ShowDiagnosisTaskResponse> showDiagnosisTaskAsyncInvoker(
        ShowDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showDiagnosisTask, hcClient);
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
     * 查询企业项目收藏
     *
     * 查询企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectCollectRequest 请求对象
     * @return CompletableFuture<ListEnterpriseProjectCollectResponse>
     */
    public CompletableFuture<ListEnterpriseProjectCollectResponse> listEnterpriseProjectCollectAsync(
        ListEnterpriseProjectCollectRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listEnterpriseProjectCollect);
    }

    /**
     * 查询企业项目收藏
     *
     * 查询企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectCollectRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseProjectCollectRequest, ListEnterpriseProjectCollectResponse>
     */
    public AsyncInvoker<ListEnterpriseProjectCollectRequest, ListEnterpriseProjectCollectResponse> listEnterpriseProjectCollectAsyncInvoker(
        ListEnterpriseProjectCollectRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listEnterpriseProjectCollect, hcClient);
    }

    /**
     * 更新企业项目收藏
     *
     * 更新企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectCollectRequest 请求对象
     * @return CompletableFuture<UpdateEnterpriseProjectCollectResponse>
     */
    public CompletableFuture<UpdateEnterpriseProjectCollectResponse> updateEnterpriseProjectCollectAsync(
        UpdateEnterpriseProjectCollectRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateEnterpriseProjectCollect);
    }

    /**
     * 更新企业项目收藏
     *
     * 更新企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectCollectRequest 请求对象
     * @return AsyncInvoker<UpdateEnterpriseProjectCollectRequest, UpdateEnterpriseProjectCollectResponse>
     */
    public AsyncInvoker<UpdateEnterpriseProjectCollectRequest, UpdateEnterpriseProjectCollectResponse> updateEnterpriseProjectCollectAsyncInvoker(
        UpdateEnterpriseProjectCollectRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateEnterpriseProjectCollect, hcClient);
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
     * 删除变更单
     *
     * 删除变更单，当变更单为撤销状态下，变更单可进行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTicketInfoRequest 请求对象
     * @return CompletableFuture<DeleteTicketInfoResponse>
     */
    public CompletableFuture<DeleteTicketInfoResponse> deleteTicketInfoAsync(DeleteTicketInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteTicketInfo);
    }

    /**
     * 删除变更单
     *
     * 删除变更单，当变更单为撤销状态下，变更单可进行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTicketInfoRequest 请求对象
     * @return AsyncInvoker<DeleteTicketInfoRequest, DeleteTicketInfoResponse>
     */
    public AsyncInvoker<DeleteTicketInfoRequest, DeleteTicketInfoResponse> deleteTicketInfoAsyncInvoker(
        DeleteTicketInfoRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteTicketInfo, hcClient);
    }

    /**
     * 搜索变更工单子单
     *
     * 搜索变更工单子单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTicketsRequest 请求对象
     * @return CompletableFuture<ListSubTicketsResponse>
     */
    public CompletableFuture<ListSubTicketsResponse> listSubTicketsAsync(ListSubTicketsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listSubTickets);
    }

    /**
     * 搜索变更工单子单
     *
     * 搜索变更工单子单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTicketsRequest 请求对象
     * @return AsyncInvoker<ListSubTicketsRequest, ListSubTicketsResponse>
     */
    public AsyncInvoker<ListSubTicketsRequest, ListSubTicketsResponse> listSubTicketsAsyncInvoker(
        ListSubTicketsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listSubTickets, hcClient);
    }

    /**
     * 变更单状态修改
     *
     * 变更单状态修改，请求路径中的ticket_type为固定值change，且ticket_id传递变更单单号。此接口可操作变更开始、变更结束、变更取消和添加变更结果操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTicketRequest 请求对象
     * @return CompletableFuture<UpdateTicketResponse>
     */
    public CompletableFuture<UpdateTicketResponse> updateTicketAsync(UpdateTicketRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateTicket);
    }

    /**
     * 变更单状态修改
     *
     * 变更单状态修改，请求路径中的ticket_type为固定值change，且ticket_id传递变更单单号。此接口可操作变更开始、变更结束、变更取消和添加变更结果操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTicketRequest 请求对象
     * @return AsyncInvoker<UpdateTicketRequest, UpdateTicketResponse>
     */
    public AsyncInvoker<UpdateTicketRequest, UpdateTicketResponse> updateTicketAsyncInvoker(
        UpdateTicketRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateTicket, hcClient);
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
     * 上传附件
     *
     * 上传附件，创建事件单的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalCocAttachmentRequest 请求对象
     * @return CompletableFuture<CreateExternalCocAttachmentResponse>
     */
    public CompletableFuture<CreateExternalCocAttachmentResponse> createExternalCocAttachmentAsync(
        CreateExternalCocAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createExternalCocAttachment);
    }

    /**
     * 上传附件
     *
     * 上传附件，创建事件单的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalCocAttachmentRequest 请求对象
     * @return AsyncInvoker<CreateExternalCocAttachmentRequest, CreateExternalCocAttachmentResponse>
     */
    public AsyncInvoker<CreateExternalCocAttachmentRequest, CreateExternalCocAttachmentResponse> createExternalCocAttachmentAsyncInvoker(
        CreateExternalCocAttachmentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createExternalCocAttachment, hcClient);
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
     * 查询简易版事件单列表
     *
     * 该接口可分页查询到事件单列表信息，分页参数为limit与offset。该接口不支持对事件单进行除分页参数外的条件过滤，且返回的列表字段相对简单，只有事件单标题、事件单单号、描述信息、工单状态、事件级别、企业项目ID、事件单来源、创建人及责任人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentSimpleTicketsRequest 请求对象
     * @return CompletableFuture<ListIncidentSimpleTicketsResponse>
     */
    public CompletableFuture<ListIncidentSimpleTicketsResponse> listIncidentSimpleTicketsAsync(
        ListIncidentSimpleTicketsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listIncidentSimpleTickets);
    }

    /**
     * 查询简易版事件单列表
     *
     * 该接口可分页查询到事件单列表信息，分页参数为limit与offset。该接口不支持对事件单进行除分页参数外的条件过滤，且返回的列表字段相对简单，只有事件单标题、事件单单号、描述信息、工单状态、事件级别、企业项目ID、事件单来源、创建人及责任人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentSimpleTicketsRequest 请求对象
     * @return AsyncInvoker<ListIncidentSimpleTicketsRequest, ListIncidentSimpleTicketsResponse>
     */
    public AsyncInvoker<ListIncidentSimpleTicketsRequest, ListIncidentSimpleTicketsResponse> listIncidentSimpleTicketsAsyncInvoker(
        ListIncidentSimpleTicketsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listIncidentSimpleTickets, hcClient);
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
     * 上传附件
     *
     * 上传附件，创建工单（事件单、变更单、问题单）的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttachmentRequest 请求对象
     * @return CompletableFuture<CreateAttachmentResponse>
     */
    public CompletableFuture<CreateAttachmentResponse> createAttachmentAsync(CreateAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createAttachment);
    }

    /**
     * 上传附件
     *
     * 上传附件，创建工单（事件单、变更单、问题单）的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttachmentRequest 请求对象
     * @return AsyncInvoker<CreateAttachmentRequest, CreateAttachmentResponse>
     */
    public AsyncInvoker<CreateAttachmentRequest, CreateAttachmentResponse> createAttachmentAsyncInvoker(
        CreateAttachmentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createAttachment, hcClient);
    }

    /**
     * 新建工单
     *
     * 创建变更单或问题单的接口，通过路径参数ticket_type区分需要创建的工单类型。ticket_type为change表示要创建变更单，ticket_type为issues_mgmt为创建问题单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTicketRequest 请求对象
     * @return CompletableFuture<CreateTicketResponse>
     */
    public CompletableFuture<CreateTicketResponse> createTicketAsync(CreateTicketRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createTicket);
    }

    /**
     * 新建工单
     *
     * 创建变更单或问题单的接口，通过路径参数ticket_type区分需要创建的工单类型。ticket_type为change表示要创建变更单，ticket_type为issues_mgmt为创建问题单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTicketRequest 请求对象
     * @return AsyncInvoker<CreateTicketRequest, CreateTicketResponse>
     */
    public AsyncInvoker<CreateTicketRequest, CreateTicketResponse> createTicketAsyncInvoker(
        CreateTicketRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createTicket, hcClient);
    }

    /**
     * 下载附件
     *
     * 附件下载操作需基于已上传的附件资源。上传附件时，需调用/v1/{ticket_type}/attachments接口完成上传；成功上传后，可从接口响应中获取doc_id参数。下载附件时，凭借此doc_id再次调用/v1/{ticket_type}/attachments接口，即可获取已上传的对应附件资源，实现附件全生命周期管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return CompletableFuture<DownloadAttachmentResponse>
     */
    public CompletableFuture<DownloadAttachmentResponse> downloadAttachmentAsync(DownloadAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.downloadAttachment);
    }

    /**
     * 下载附件
     *
     * 附件下载操作需基于已上传的附件资源。上传附件时，需调用/v1/{ticket_type}/attachments接口完成上传；成功上传后，可从接口响应中获取doc_id参数。下载附件时，凭借此doc_id再次调用/v1/{ticket_type}/attachments接口，即可获取已上传的对应附件资源，实现附件全生命周期管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return AsyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse>
     */
    public AsyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachmentAsyncInvoker(
        DownloadAttachmentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.downloadAttachment, hcClient);
    }

    /**
     * 工单操作
     *
     * 变更单审批、撤销以及问题单的所有操作均通过此接口完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTicketActionRequest 请求对象
     * @return CompletableFuture<ExecuteTicketActionResponse>
     */
    public CompletableFuture<ExecuteTicketActionResponse> executeTicketActionAsync(ExecuteTicketActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.executeTicketAction);
    }

    /**
     * 工单操作
     *
     * 变更单审批、撤销以及问题单的所有操作均通过此接口完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTicketActionRequest 请求对象
     * @return AsyncInvoker<ExecuteTicketActionRequest, ExecuteTicketActionResponse>
     */
    public AsyncInvoker<ExecuteTicketActionRequest, ExecuteTicketActionResponse> executeTicketActionAsyncInvoker(
        ExecuteTicketActionRequest request) {
        return new AsyncInvoker<>(request, CocMeta.executeTicketAction, hcClient);
    }

    /**
     * 搜索工单历史
     *
     * List Histories
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketOperationHistoriesRequest 请求对象
     * @return CompletableFuture<ListTicketOperationHistoriesResponse>
     */
    public CompletableFuture<ListTicketOperationHistoriesResponse> listTicketOperationHistoriesAsync(
        ListTicketOperationHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listTicketOperationHistories);
    }

    /**
     * 搜索工单历史
     *
     * List Histories
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketOperationHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTicketOperationHistoriesRequest, ListTicketOperationHistoriesResponse>
     */
    public AsyncInvoker<ListTicketOperationHistoriesRequest, ListTicketOperationHistoriesResponse> listTicketOperationHistoriesAsyncInvoker(
        ListTicketOperationHistoriesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listTicketOperationHistories, hcClient);
    }

    /**
     * 搜索工单
     *
     * List ticket
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketsRequest 请求对象
     * @return CompletableFuture<ListTicketsResponse>
     */
    public CompletableFuture<ListTicketsResponse> listTicketsAsync(ListTicketsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listTickets);
    }

    /**
     * 搜索工单
     *
     * List ticket
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketsRequest 请求对象
     * @return AsyncInvoker<ListTicketsRequest, ListTicketsResponse>
     */
    public AsyncInvoker<ListTicketsRequest, ListTicketsResponse> listTicketsAsyncInvoker(ListTicketsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listTickets, hcClient);
    }

    /**
     * 查询Ticket
     *
     * Get Ticket info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTicketInfoRequest 请求对象
     * @return CompletableFuture<ShowTicketInfoResponse>
     */
    public CompletableFuture<ShowTicketInfoResponse> showTicketInfoAsync(ShowTicketInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.showTicketInfo);
    }

    /**
     * 查询Ticket
     *
     * Get Ticket info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTicketInfoRequest 请求对象
     * @return AsyncInvoker<ShowTicketInfoRequest, ShowTicketInfoResponse>
     */
    public AsyncInvoker<ShowTicketInfoRequest, ShowTicketInfoResponse> showTicketInfoAsyncInvoker(
        ShowTicketInfoRequest request) {
        return new AsyncInvoker<>(request, CocMeta.showTicketInfo, hcClient);
    }

    /**
     * 创建分组
     *
     * 创建分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationGroupRequest 请求对象
     * @return CompletableFuture<CreateApplicationGroupResponse>
     */
    public CompletableFuture<CreateApplicationGroupResponse> createApplicationGroupAsync(
        CreateApplicationGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createApplicationGroup);
    }

    /**
     * 创建分组
     *
     * 创建分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationGroupRequest 请求对象
     * @return AsyncInvoker<CreateApplicationGroupRequest, CreateApplicationGroupResponse>
     */
    public AsyncInvoker<CreateApplicationGroupRequest, CreateApplicationGroupResponse> createApplicationGroupAsyncInvoker(
        CreateApplicationGroupRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createApplicationGroup, hcClient);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationGroupRequest 请求对象
     * @return CompletableFuture<DeleteApplicationGroupResponse>
     */
    public CompletableFuture<DeleteApplicationGroupResponse> deleteApplicationGroupAsync(
        DeleteApplicationGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteApplicationGroup);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationGroupRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationGroupRequest, DeleteApplicationGroupResponse>
     */
    public AsyncInvoker<DeleteApplicationGroupRequest, DeleteApplicationGroupResponse> deleteApplicationGroupAsyncInvoker(
        DeleteApplicationGroupRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteApplicationGroup, hcClient);
    }

    /**
     * 查询分组
     *
     * 查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationGroupsRequest 请求对象
     * @return CompletableFuture<ListApplicationGroupsResponse>
     */
    public CompletableFuture<ListApplicationGroupsResponse> listApplicationGroupsAsync(
        ListApplicationGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listApplicationGroups);
    }

    /**
     * 查询分组
     *
     * 查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationGroupsRequest 请求对象
     * @return AsyncInvoker<ListApplicationGroupsRequest, ListApplicationGroupsResponse>
     */
    public AsyncInvoker<ListApplicationGroupsRequest, ListApplicationGroupsResponse> listApplicationGroupsAsyncInvoker(
        ListApplicationGroupsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listApplicationGroups, hcClient);
    }

    /**
     * 分组智能同步资源
     *
     * 分组智能同步资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncGroupResourceRequest 请求对象
     * @return CompletableFuture<SyncGroupResourceResponse>
     */
    public CompletableFuture<SyncGroupResourceResponse> syncGroupResourceAsync(SyncGroupResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.syncGroupResource);
    }

    /**
     * 分组智能同步资源
     *
     * 分组智能同步资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncGroupResourceRequest 请求对象
     * @return AsyncInvoker<SyncGroupResourceRequest, SyncGroupResourceResponse>
     */
    public AsyncInvoker<SyncGroupResourceRequest, SyncGroupResourceResponse> syncGroupResourceAsyncInvoker(
        SyncGroupResourceRequest request) {
        return new AsyncInvoker<>(request, CocMeta.syncGroupResource, hcClient);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationGroupRequest 请求对象
     * @return CompletableFuture<UpdateApplicationGroupResponse>
     */
    public CompletableFuture<UpdateApplicationGroupResponse> updateApplicationGroupAsync(
        UpdateApplicationGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateApplicationGroup);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationGroupRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationGroupRequest, UpdateApplicationGroupResponse>
     */
    public AsyncInvoker<UpdateApplicationGroupRequest, UpdateApplicationGroupResponse> updateApplicationGroupAsyncInvoker(
        UpdateApplicationGroupRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateApplicationGroup, hcClient);
    }

    /**
     * 查询分组关联的阿里云资源
     *
     * 查询分组关联的阿里云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAliResourceRelationsRequest 请求对象
     * @return CompletableFuture<ListGroupAliResourceRelationsResponse>
     */
    public CompletableFuture<ListGroupAliResourceRelationsResponse> listGroupAliResourceRelationsAsync(
        ListGroupAliResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listGroupAliResourceRelations);
    }

    /**
     * 查询分组关联的阿里云资源
     *
     * 查询分组关联的阿里云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAliResourceRelationsRequest 请求对象
     * @return AsyncInvoker<ListGroupAliResourceRelationsRequest, ListGroupAliResourceRelationsResponse>
     */
    public AsyncInvoker<ListGroupAliResourceRelationsRequest, ListGroupAliResourceRelationsResponse> listGroupAliResourceRelationsAsyncInvoker(
        ListGroupAliResourceRelationsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listGroupAliResourceRelations, hcClient);
    }

    /**
     * 查询分组关联的离线资源
     *
     * 查询分组关联的离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupOtherResourceRelationsRequest 请求对象
     * @return CompletableFuture<ListGroupOtherResourceRelationsResponse>
     */
    public CompletableFuture<ListGroupOtherResourceRelationsResponse> listGroupOtherResourceRelationsAsync(
        ListGroupOtherResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listGroupOtherResourceRelations);
    }

    /**
     * 查询分组关联的离线资源
     *
     * 查询分组关联的离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupOtherResourceRelationsRequest 请求对象
     * @return AsyncInvoker<ListGroupOtherResourceRelationsRequest, ListGroupOtherResourceRelationsResponse>
     */
    public AsyncInvoker<ListGroupOtherResourceRelationsRequest, ListGroupOtherResourceRelationsResponse> listGroupOtherResourceRelationsAsyncInvoker(
        ListGroupOtherResourceRelationsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listGroupOtherResourceRelations, hcClient);
    }

    /**
     * 查询分组关联的资源总数
     *
     * 分组管理多个资源后，可查询分组关联的资源总数， 应用id和分组id不能共存，且必填其中一个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGroupRmsResourceRelationsRequest 请求对象
     * @return CompletableFuture<CountGroupRmsResourceRelationsResponse>
     */
    public CompletableFuture<CountGroupRmsResourceRelationsResponse> countGroupRmsResourceRelationsAsync(
        CountGroupRmsResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.countGroupRmsResourceRelations);
    }

    /**
     * 查询分组关联的资源总数
     *
     * 分组管理多个资源后，可查询分组关联的资源总数， 应用id和分组id不能共存，且必填其中一个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGroupRmsResourceRelationsRequest 请求对象
     * @return AsyncInvoker<CountGroupRmsResourceRelationsRequest, CountGroupRmsResourceRelationsResponse>
     */
    public AsyncInvoker<CountGroupRmsResourceRelationsRequest, CountGroupRmsResourceRelationsResponse> countGroupRmsResourceRelationsAsyncInvoker(
        CountGroupRmsResourceRelationsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.countGroupRmsResourceRelations, hcClient);
    }

    /**
     * 创建分组资源关联
     *
     * 创建分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRmsResourceRelationRequest 请求对象
     * @return CompletableFuture<CreateGroupRmsResourceRelationResponse>
     */
    public CompletableFuture<CreateGroupRmsResourceRelationResponse> createGroupRmsResourceRelationAsync(
        CreateGroupRmsResourceRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createGroupRmsResourceRelation);
    }

    /**
     * 创建分组资源关联
     *
     * 创建分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRmsResourceRelationRequest 请求对象
     * @return AsyncInvoker<CreateGroupRmsResourceRelationRequest, CreateGroupRmsResourceRelationResponse>
     */
    public AsyncInvoker<CreateGroupRmsResourceRelationRequest, CreateGroupRmsResourceRelationResponse> createGroupRmsResourceRelationAsyncInvoker(
        CreateGroupRmsResourceRelationRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createGroupRmsResourceRelation, hcClient);
    }

    /**
     * 解绑分组资源关联
     *
     * 解绑分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRmsResourceRelationRequest 请求对象
     * @return CompletableFuture<DeleteGroupRmsResourceRelationResponse>
     */
    public CompletableFuture<DeleteGroupRmsResourceRelationResponse> deleteGroupRmsResourceRelationAsync(
        DeleteGroupRmsResourceRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteGroupRmsResourceRelation);
    }

    /**
     * 解绑分组资源关联
     *
     * 解绑分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRmsResourceRelationRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRmsResourceRelationRequest, DeleteGroupRmsResourceRelationResponse>
     */
    public AsyncInvoker<DeleteGroupRmsResourceRelationRequest, DeleteGroupRmsResourceRelationResponse> deleteGroupRmsResourceRelationAsyncInvoker(
        DeleteGroupRmsResourceRelationRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteGroupRmsResourceRelation, hcClient);
    }

    /**
     * 查询应用、组件、分组容量数据的排名
     *
     * 查询应用、组件、分组容量数据的排名，其中应用、组件和分组ID，有且仅有1个有值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityOrderRequest 请求对象
     * @return CompletableFuture<ListCapacityOrderResponse>
     */
    public CompletableFuture<ListCapacityOrderResponse> listCapacityOrderAsync(ListCapacityOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listCapacityOrder);
    }

    /**
     * 查询应用、组件、分组容量数据的排名
     *
     * 查询应用、组件、分组容量数据的排名，其中应用、组件和分组ID，有且仅有1个有值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityOrderRequest 请求对象
     * @return AsyncInvoker<ListCapacityOrderRequest, ListCapacityOrderResponse>
     */
    public AsyncInvoker<ListCapacityOrderRequest, ListCapacityOrderResponse> listCapacityOrderAsyncInvoker(
        ListCapacityOrderRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listCapacityOrder, hcClient);
    }

    /**
     * 查询应用的容量数据
     *
     * 云运维中心支持查看应用、子应用、组件或分组下已关联的资源容量详情，按照资源类型展示资源核心数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityViewRequest 请求对象
     * @return CompletableFuture<ListCapacityViewResponse>
     */
    public CompletableFuture<ListCapacityViewResponse> listCapacityViewAsync(ListCapacityViewRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listCapacityView);
    }

    /**
     * 查询应用的容量数据
     *
     * 云运维中心支持查看应用、子应用、组件或分组下已关联的资源容量详情，按照资源类型展示资源核心数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityViewRequest 请求对象
     * @return AsyncInvoker<ListCapacityViewRequest, ListCapacityViewResponse>
     */
    public AsyncInvoker<ListCapacityViewRequest, ListCapacityViewResponse> listCapacityViewAsyncInvoker(
        ListCapacityViewRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listCapacityView, hcClient);
    }

    /**
     * 查询分组关联的华为云资源
     *
     * 查询分组关联的华为云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRmsResourceRelationsRequest 请求对象
     * @return CompletableFuture<ListGroupRmsResourceRelationsResponse>
     */
    public CompletableFuture<ListGroupRmsResourceRelationsResponse> listGroupRmsResourceRelationsAsync(
        ListGroupRmsResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listGroupRmsResourceRelations);
    }

    /**
     * 查询分组关联的华为云资源
     *
     * 查询分组关联的华为云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRmsResourceRelationsRequest 请求对象
     * @return AsyncInvoker<ListGroupRmsResourceRelationsRequest, ListGroupRmsResourceRelationsResponse>
     */
    public AsyncInvoker<ListGroupRmsResourceRelationsRequest, ListGroupRmsResourceRelationsResponse> listGroupRmsResourceRelationsAsyncInvoker(
        ListGroupRmsResourceRelationsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listGroupRmsResourceRelations, hcClient);
    }

    /**
     * 转移资源
     *
     * 转移资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRmsResourceRelationRequest 请求对象
     * @return CompletableFuture<UpdateGroupRmsResourceRelationResponse>
     */
    public CompletableFuture<UpdateGroupRmsResourceRelationResponse> updateGroupRmsResourceRelationAsync(
        UpdateGroupRmsResourceRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateGroupRmsResourceRelation);
    }

    /**
     * 转移资源
     *
     * 转移资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRmsResourceRelationRequest 请求对象
     * @return AsyncInvoker<UpdateGroupRmsResourceRelationRequest, UpdateGroupRmsResourceRelationResponse>
     */
    public AsyncInvoker<UpdateGroupRmsResourceRelationRequest, UpdateGroupRmsResourceRelationResponse> updateGroupRmsResourceRelationAsyncInvoker(
        UpdateGroupRmsResourceRelationRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateGroupRmsResourceRelation, hcClient);
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
     * 查询用户在云厂商的资源总数
     *
     * 查询用户在云厂商（阿里云、AWS、Azure和HCS）的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiCloudResourcesRequest 请求对象
     * @return CompletableFuture<CountMultiCloudResourcesResponse>
     */
    public CompletableFuture<CountMultiCloudResourcesResponse> countMultiCloudResourcesAsync(
        CountMultiCloudResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.countMultiCloudResources);
    }

    /**
     * 查询用户在云厂商的资源总数
     *
     * 查询用户在云厂商（阿里云、AWS、Azure和HCS）的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiCloudResourcesRequest 请求对象
     * @return AsyncInvoker<CountMultiCloudResourcesRequest, CountMultiCloudResourcesResponse>
     */
    public AsyncInvoker<CountMultiCloudResourcesRequest, CountMultiCloudResourcesResponse> countMultiCloudResourcesAsyncInvoker(
        CountMultiCloudResourcesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.countMultiCloudResources, hcClient);
    }

    /**
     * 手动从云厂商同步用户资源
     *
     * 手动从云厂商同步用户资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudResourceRequest 请求对象
     * @return CompletableFuture<SyncMultiCloudResourceResponse>
     */
    public CompletableFuture<SyncMultiCloudResourceResponse> syncMultiCloudResourceAsync(
        SyncMultiCloudResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.syncMultiCloudResource);
    }

    /**
     * 手动从云厂商同步用户资源
     *
     * 手动从云厂商同步用户资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudResourceRequest 请求对象
     * @return AsyncInvoker<SyncMultiCloudResourceRequest, SyncMultiCloudResourceResponse>
     */
    public AsyncInvoker<SyncMultiCloudResourceRequest, SyncMultiCloudResourceResponse> syncMultiCloudResourceAsyncInvoker(
        SyncMultiCloudResourceRequest request) {
        return new AsyncInvoker<>(request, CocMeta.syncMultiCloudResource, hcClient);
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
     * 查询用户资源总数
     *
     * 查询用户资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesRequest 请求对象
     * @return CompletableFuture<CountResourcesResponse>
     */
    public CompletableFuture<CountResourcesResponse> countResourcesAsync(CountResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.countResources);
    }

    /**
     * 查询用户资源总数
     *
     * 查询用户资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesRequest 请求对象
     * @return AsyncInvoker<CountResourcesRequest, CountResourcesResponse>
     */
    public AsyncInvoker<CountResourcesRequest, CountResourcesResponse> countResourcesAsyncInvoker(
        CountResourcesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.countResources, hcClient);
    }

    /**
     * 查询用户所有资源
     *
     * 查询租户所有资源：
     *  - 查询租户所有资源等相关信息，便于租户详细了解资源总体情况。
     *  - 请求参数provider（云服务名称），type（云资源类型），limit（查询条数）必填，单次最大查询条数：500。
     *  - 返回信息包括：资源ID，资源名称，云服务名称，资源类型，项目ID，租户ID，区域ID，企业项目ID，资源标签，资源详细属性，资源ingest属性，uniagentID，uniagent状态，是否托管，是否可运维。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listResources);
    }

    /**
     * 查询用户所有资源
     *
     * 查询租户所有资源：
     *  - 查询租户所有资源等相关信息，便于租户详细了解资源总体情况。
     *  - 请求参数provider（云服务名称），type（云资源类型），limit（查询条数）必填，单次最大查询条数：500。
     *  - 返回信息包括：资源ID，资源名称，云服务名称，资源类型，项目ID，租户ID，区域ID，企业项目ID，资源标签，资源详细属性，资源ingest属性，uniagentID，uniagent状态，是否托管，是否可运维。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listResources, hcClient);
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
     * 同步华为云资源Agent信息
     *
     * 同步华为云资源Agent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceAgentRequest 请求对象
     * @return CompletableFuture<SyncResourceAgentResponse>
     */
    public CompletableFuture<SyncResourceAgentResponse> syncResourceAgentAsync(SyncResourceAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.syncResourceAgent);
    }

    /**
     * 同步华为云资源Agent信息
     *
     * 同步华为云资源Agent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceAgentRequest 请求对象
     * @return AsyncInvoker<SyncResourceAgentRequest, SyncResourceAgentResponse>
     */
    public AsyncInvoker<SyncResourceAgentRequest, SyncResourceAgentResponse> syncResourceAgentAsyncInvoker(
        SyncResourceAgentRequest request) {
        return new AsyncInvoker<>(request, CocMeta.syncResourceAgent, hcClient);
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
     * 添加资源标签
     *
     * 添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagsRequest 请求对象
     * @return CompletableFuture<CreateResourceTagsResponse>
     */
    public CompletableFuture<CreateResourceTagsResponse> createResourceTagsAsync(CreateResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createResourceTags);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagsRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse>
     */
    public AsyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse> createResourceTagsAsyncInvoker(
        CreateResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createResourceTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return CompletableFuture<ListResourceTagsResponse>
     */
    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listResourceTags, hcClient);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源总数
     *
     * 查询CMDB跨账号资源视图聚合的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesOfResourceViewRequest 请求对象
     * @return CompletableFuture<CountResourcesOfResourceViewResponse>
     */
    public CompletableFuture<CountResourcesOfResourceViewResponse> countResourcesOfResourceViewAsync(
        CountResourcesOfResourceViewRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.countResourcesOfResourceView);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源总数
     *
     * 查询CMDB跨账号资源视图聚合的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesOfResourceViewRequest 请求对象
     * @return AsyncInvoker<CountResourcesOfResourceViewRequest, CountResourcesOfResourceViewResponse>
     */
    public AsyncInvoker<CountResourcesOfResourceViewRequest, CountResourcesOfResourceViewResponse> countResourcesOfResourceViewAsyncInvoker(
        CountResourcesOfResourceViewRequest request) {
        return new AsyncInvoker<>(request, CocMeta.countResourcesOfResourceView, hcClient);
    }

    /**
     * 创建CMDB跨账号资源视图
     *
     * 创建CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceViewsRequest 请求对象
     * @return CompletableFuture<CreateResourceViewsResponse>
     */
    public CompletableFuture<CreateResourceViewsResponse> createResourceViewsAsync(CreateResourceViewsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createResourceViews);
    }

    /**
     * 创建CMDB跨账号资源视图
     *
     * 创建CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceViewsRequest 请求对象
     * @return AsyncInvoker<CreateResourceViewsRequest, CreateResourceViewsResponse>
     */
    public AsyncInvoker<CreateResourceViewsRequest, CreateResourceViewsResponse> createResourceViewsAsyncInvoker(
        CreateResourceViewsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createResourceViews, hcClient);
    }

    /**
     * 删除CMDB的跨账号资源管理视图
     *
     * 删除CMDB的跨账号资源管理视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceViewsRequest 请求对象
     * @return CompletableFuture<DeleteResourceViewsResponse>
     */
    public CompletableFuture<DeleteResourceViewsResponse> deleteResourceViewsAsync(DeleteResourceViewsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteResourceViews);
    }

    /**
     * 删除CMDB的跨账号资源管理视图
     *
     * 删除CMDB的跨账号资源管理视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceViewsRequest 请求对象
     * @return AsyncInvoker<DeleteResourceViewsRequest, DeleteResourceViewsResponse>
     */
    public AsyncInvoker<DeleteResourceViewsRequest, DeleteResourceViewsResponse> deleteResourceViewsAsyncInvoker(
        DeleteResourceViewsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteResourceViews, hcClient);
    }

    /**
     * 查询CMDB跨账号资源视图
     *
     * 查询CMDB跨账号资源视图。视图是一组筛选器，用户可以自由配置筛选范围，用于在跨账号场景下访问华为云中的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceViewsRequest 请求对象
     * @return CompletableFuture<ListResourceViewsResponse>
     */
    public CompletableFuture<ListResourceViewsResponse> listResourceViewsAsync(ListResourceViewsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listResourceViews);
    }

    /**
     * 查询CMDB跨账号资源视图
     *
     * 查询CMDB跨账号资源视图。视图是一组筛选器，用户可以自由配置筛选范围，用于在跨账号场景下访问华为云中的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceViewsRequest 请求对象
     * @return AsyncInvoker<ListResourceViewsRequest, ListResourceViewsResponse>
     */
    public AsyncInvoker<ListResourceViewsRequest, ListResourceViewsResponse> listResourceViewsAsyncInvoker(
        ListResourceViewsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listResourceViews, hcClient);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源
     *
     * 查询CMDB跨账号资源视图聚合的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesOfResourceViewRequest 请求对象
     * @return CompletableFuture<ListResourcesOfResourceViewResponse>
     */
    public CompletableFuture<ListResourcesOfResourceViewResponse> listResourcesOfResourceViewAsync(
        ListResourcesOfResourceViewRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listResourcesOfResourceView);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源
     *
     * 查询CMDB跨账号资源视图聚合的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesOfResourceViewRequest 请求对象
     * @return AsyncInvoker<ListResourcesOfResourceViewRequest, ListResourcesOfResourceViewResponse>
     */
    public AsyncInvoker<ListResourcesOfResourceViewRequest, ListResourcesOfResourceViewResponse> listResourcesOfResourceViewAsyncInvoker(
        ListResourcesOfResourceViewRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listResourcesOfResourceView, hcClient);
    }

    /**
     * 同步CMDB跨账号资源视图
     *
     * 同步CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourcesOfResourceViewRequest 请求对象
     * @return CompletableFuture<SyncResourcesOfResourceViewResponse>
     */
    public CompletableFuture<SyncResourcesOfResourceViewResponse> syncResourcesOfResourceViewAsync(
        SyncResourcesOfResourceViewRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.syncResourcesOfResourceView);
    }

    /**
     * 同步CMDB跨账号资源视图
     *
     * 同步CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourcesOfResourceViewRequest 请求对象
     * @return AsyncInvoker<SyncResourcesOfResourceViewRequest, SyncResourcesOfResourceViewResponse>
     */
    public AsyncInvoker<SyncResourcesOfResourceViewRequest, SyncResourcesOfResourceViewResponse> syncResourcesOfResourceViewAsyncInvoker(
        SyncResourcesOfResourceViewRequest request) {
        return new AsyncInvoker<>(request, CocMeta.syncResourcesOfResourceView, hcClient);
    }

    /**
     * 更新CMDB跨账号资源视图
     *
     * 更新CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceViewsRequest 请求对象
     * @return CompletableFuture<UpdateResourceViewsResponse>
     */
    public CompletableFuture<UpdateResourceViewsResponse> updateResourceViewsAsync(UpdateResourceViewsRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateResourceViews);
    }

    /**
     * 更新CMDB跨账号资源视图
     *
     * 更新CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceViewsRequest 请求对象
     * @return AsyncInvoker<UpdateResourceViewsRequest, UpdateResourceViewsResponse>
     */
    public AsyncInvoker<UpdateResourceViewsRequest, UpdateResourceViewsResponse> updateResourceViewsAsyncInvoker(
        UpdateResourceViewsRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateResourceViews, hcClient);
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
     * 创建云厂商账号
     *
     * 创建云厂商（阿里云、AWS、Azure和HCS等）账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVendorAccountRequest 请求对象
     * @return CompletableFuture<CreateVendorAccountResponse>
     */
    public CompletableFuture<CreateVendorAccountResponse> createVendorAccountAsync(CreateVendorAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.createVendorAccount);
    }

    /**
     * 创建云厂商账号
     *
     * 创建云厂商（阿里云、AWS、Azure和HCS等）账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVendorAccountRequest 请求对象
     * @return AsyncInvoker<CreateVendorAccountRequest, CreateVendorAccountResponse>
     */
    public AsyncInvoker<CreateVendorAccountRequest, CreateVendorAccountResponse> createVendorAccountAsyncInvoker(
        CreateVendorAccountRequest request) {
        return new AsyncInvoker<>(request, CocMeta.createVendorAccount, hcClient);
    }

    /**
     * 删除云厂商账号
     *
     * 增加云广商账号，不需要后，可删除云厂商账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVendorAccountRequest 请求对象
     * @return CompletableFuture<DeleteVendorAccountResponse>
     */
    public CompletableFuture<DeleteVendorAccountResponse> deleteVendorAccountAsync(DeleteVendorAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.deleteVendorAccount);
    }

    /**
     * 删除云厂商账号
     *
     * 增加云广商账号，不需要后，可删除云厂商账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVendorAccountRequest 请求对象
     * @return AsyncInvoker<DeleteVendorAccountRequest, DeleteVendorAccountResponse>
     */
    public AsyncInvoker<DeleteVendorAccountRequest, DeleteVendorAccountResponse> deleteVendorAccountAsyncInvoker(
        DeleteVendorAccountRequest request) {
        return new AsyncInvoker<>(request, CocMeta.deleteVendorAccount, hcClient);
    }

    /**
     * 查询云厂商账号
     *
     * 查询所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorAccountRequest 请求对象
     * @return CompletableFuture<ListVendorAccountResponse>
     */
    public CompletableFuture<ListVendorAccountResponse> listVendorAccountAsync(ListVendorAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.listVendorAccount);
    }

    /**
     * 查询云厂商账号
     *
     * 查询所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorAccountRequest 请求对象
     * @return AsyncInvoker<ListVendorAccountRequest, ListVendorAccountResponse>
     */
    public AsyncInvoker<ListVendorAccountRequest, ListVendorAccountResponse> listVendorAccountAsyncInvoker(
        ListVendorAccountRequest request) {
        return new AsyncInvoker<>(request, CocMeta.listVendorAccount, hcClient);
    }

    /**
     * 修改云厂商账号
     *
     * 修改所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorAccountRequest 请求对象
     * @return CompletableFuture<UpdateVendorAccountResponse>
     */
    public CompletableFuture<UpdateVendorAccountResponse> updateVendorAccountAsync(UpdateVendorAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, CocMeta.updateVendorAccount);
    }

    /**
     * 修改云厂商账号
     *
     * 修改所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorAccountRequest 请求对象
     * @return AsyncInvoker<UpdateVendorAccountRequest, UpdateVendorAccountResponse>
     */
    public AsyncInvoker<UpdateVendorAccountRequest, UpdateVendorAccountResponse> updateVendorAccountAsyncInvoker(
        UpdateVendorAccountRequest request) {
        return new AsyncInvoker<>(request, CocMeta.updateVendorAccount, hcClient);
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

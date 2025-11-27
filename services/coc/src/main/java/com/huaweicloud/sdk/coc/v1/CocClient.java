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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CocClient {

    protected HcClient hcClient;

    public CocClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CocClient> newBuilder() {
        ClientBuilder<CocClient> clientBuilder =
            new ClientBuilder<>(CocClient::new, "GlobalCredentials,BasicCredentials");
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
     * @return CreatePasswordChangePlanResponse
     */
    public CreatePasswordChangePlanResponse createPasswordChangePlan(CreatePasswordChangePlanRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createPasswordChangePlan);
    }

    /**
     * 创建改密计划
     *
     * 创建改密计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePasswordChangePlanRequest 请求对象
     * @return SyncInvoker<CreatePasswordChangePlanRequest, CreatePasswordChangePlanResponse>
     */
    public SyncInvoker<CreatePasswordChangePlanRequest, CreatePasswordChangePlanResponse> createPasswordChangePlanInvoker(
        CreatePasswordChangePlanRequest request) {
        return new SyncInvoker<>(request, CocMeta.createPasswordChangePlan, hcClient);
    }

    /**
     * 主机密码重置
     *
     * 主机密码重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAccountPasswordRequest 请求对象
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.resetAccountPassword);
    }

    /**
     * 主机密码重置
     *
     * 主机密码重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAccountPasswordRequest 请求对象
     * @return SyncInvoker<ResetAccountPasswordRequest, ResetAccountPasswordResponse>
     */
    public SyncInvoker<ResetAccountPasswordRequest, ResetAccountPasswordResponse> resetAccountPasswordInvoker(
        ResetAccountPasswordRequest request) {
        return new SyncInvoker<>(request, CocMeta.resetAccountPassword, hcClient);
    }

    /**
     * 回写改密结果
     *
     * 回写改密结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccountPasswordRequest 请求对象
     * @return UpdateAccountPasswordResponse
     */
    public UpdateAccountPasswordResponse updateAccountPassword(UpdateAccountPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateAccountPassword);
    }

    /**
     * 回写改密结果
     *
     * 回写改密结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccountPasswordRequest 请求对象
     * @return SyncInvoker<UpdateAccountPasswordRequest, UpdateAccountPasswordResponse>
     */
    public SyncInvoker<UpdateAccountPasswordRequest, UpdateAccountPasswordResponse> updateAccountPasswordInvoker(
        UpdateAccountPasswordRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateAccountPassword, hcClient);
    }

    /**
     * 批量清除告警
     *
     * 清除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearAlarmRequest 请求对象
     * @return ClearAlarmResponse
     */
    public ClearAlarmResponse clearAlarm(ClearAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.clearAlarm);
    }

    /**
     * 批量清除告警
     *
     * 清除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearAlarmRequest 请求对象
     * @return SyncInvoker<ClearAlarmRequest, ClearAlarmResponse>
     */
    public SyncInvoker<ClearAlarmRequest, ClearAlarmResponse> clearAlarmInvoker(ClearAlarmRequest request) {
        return new SyncInvoker<>(request, CocMeta.clearAlarm, hcClient);
    }

    /**
     * 自动处理告警
     *
     * 自动处理告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandlerAlarmRequest 请求对象
     * @return HandlerAlarmResponse
     */
    public HandlerAlarmResponse handlerAlarm(HandlerAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.handlerAlarm);
    }

    /**
     * 自动处理告警
     *
     * 自动处理告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandlerAlarmRequest 请求对象
     * @return SyncInvoker<HandlerAlarmRequest, HandlerAlarmResponse>
     */
    public SyncInvoker<HandlerAlarmRequest, HandlerAlarmResponse> handlerAlarmInvoker(HandlerAlarmRequest request) {
        return new SyncInvoker<>(request, CocMeta.handlerAlarm, hcClient);
    }

    /**
     * 查询告警工单历史
     *
     * 查询告警工单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHandleHistoriesRequest 请求对象
     * @return ListAlarmHandleHistoriesResponse
     */
    public ListAlarmHandleHistoriesResponse listAlarmHandleHistories(ListAlarmHandleHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listAlarmHandleHistories);
    }

    /**
     * 查询告警工单历史
     *
     * 查询告警工单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHandleHistoriesRequest 请求对象
     * @return SyncInvoker<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse>
     */
    public SyncInvoker<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse> listAlarmHandleHistoriesInvoker(
        ListAlarmHandleHistoriesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listAlarmHandleHistories, hcClient);
    }

    /**
     * 查询Alarm
     *
     * Get alarm info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return ShowAlarmResponse
     */
    public ShowAlarmResponse showAlarm(ShowAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showAlarm);
    }

    /**
     * 查询Alarm
     *
     * Get alarm info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return SyncInvoker<ShowAlarmRequest, ShowAlarmResponse>
     */
    public SyncInvoker<ShowAlarmRequest, ShowAlarmResponse> showAlarmInvoker(ShowAlarmRequest request) {
        return new SyncInvoker<>(request, CocMeta.showAlarm, hcClient);
    }

    /**
     * 批量告警转事件
     *
     * 批量告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferAlarmToIncidentRequest 请求对象
     * @return TransferAlarmToIncidentResponse
     */
    public TransferAlarmToIncidentResponse transferAlarmToIncident(TransferAlarmToIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.transferAlarmToIncident);
    }

    /**
     * 批量告警转事件
     *
     * 批量告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferAlarmToIncidentRequest 请求对象
     * @return SyncInvoker<TransferAlarmToIncidentRequest, TransferAlarmToIncidentResponse>
     */
    public SyncInvoker<TransferAlarmToIncidentRequest, TransferAlarmToIncidentResponse> transferAlarmToIncidentInvoker(
        TransferAlarmToIncidentRequest request) {
        return new SyncInvoker<>(request, CocMeta.transferAlarmToIncident, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<>(request, CocMeta.createApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteApplication, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateApplication);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationInvoker(
        UpdateApplicationRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateApplication, hcClient);
    }

    /**
     * 批量创建应用，分组，组件
     *
     * 批量创建应用，分组，组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateApplicationViewRequest 请求对象
     * @return BatchCreateApplicationViewResponse
     */
    public BatchCreateApplicationViewResponse batchCreateApplicationView(BatchCreateApplicationViewRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.batchCreateApplicationView);
    }

    /**
     * 批量创建应用，分组，组件
     *
     * 批量创建应用，分组，组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateApplicationViewRequest 请求对象
     * @return SyncInvoker<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse>
     */
    public SyncInvoker<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> batchCreateApplicationViewInvoker(
        BatchCreateApplicationViewRequest request) {
        return new SyncInvoker<>(request, CocMeta.batchCreateApplicationView, hcClient);
    }

    /**
     * 查询应用、组件、分组名称列表
     *
     * 查询应用、组件、分组名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationViewRequest 请求对象
     * @return ListApplicationViewResponse
     */
    public ListApplicationViewResponse listApplicationView(ListApplicationViewRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listApplicationView);
    }

    /**
     * 查询应用、组件、分组名称列表
     *
     * 查询应用、组件、分组名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationViewRequest 请求对象
     * @return SyncInvoker<ListApplicationViewRequest, ListApplicationViewResponse>
     */
    public SyncInvoker<ListApplicationViewRequest, ListApplicationViewResponse> listApplicationViewInvoker(
        ListApplicationViewRequest request) {
        return new SyncInvoker<>(request, CocMeta.listApplicationView, hcClient);
    }

    /**
     * 创建应用评估任务
     *
     * 创建应用评估任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssessTaskRequest 请求对象
     * @return CreateAssessTaskResponse
     */
    public CreateAssessTaskResponse createAssessTask(CreateAssessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createAssessTask);
    }

    /**
     * 创建应用评估任务
     *
     * 创建应用评估任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssessTaskRequest 请求对象
     * @return SyncInvoker<CreateAssessTaskRequest, CreateAssessTaskResponse>
     */
    public SyncInvoker<CreateAssessTaskRequest, CreateAssessTaskResponse> createAssessTaskInvoker(
        CreateAssessTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.createAssessTask, hcClient);
    }

    /**
     * 分页查询评估任务列表
     *
     * 分页查询评估任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssessTaskRequest 请求对象
     * @return ListAssessTaskResponse
     */
    public ListAssessTaskResponse listAssessTask(ListAssessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listAssessTask);
    }

    /**
     * 分页查询评估任务列表
     *
     * 分页查询评估任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssessTaskRequest 请求对象
     * @return SyncInvoker<ListAssessTaskRequest, ListAssessTaskResponse>
     */
    public SyncInvoker<ListAssessTaskRequest, ListAssessTaskResponse> listAssessTaskInvoker(
        ListAssessTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.listAssessTask, hcClient);
    }

    /**
     * UpdateChange 更新变更单
     *
     * UpdateChange 更新变更单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChangeRequest 请求对象
     * @return UpdateChangeResponse
     */
    public UpdateChangeResponse updateChange(UpdateChangeRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateChange);
    }

    /**
     * UpdateChange 更新变更单
     *
     * UpdateChange 更新变更单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChangeRequest 请求对象
     * @return SyncInvoker<UpdateChangeRequest, UpdateChangeResponse>
     */
    public SyncInvoker<UpdateChangeRequest, UpdateChangeResponse> updateChangeInvoker(UpdateChangeRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateChange, hcClient);
    }

    /**
     * HandleIncident 处理事件单
     *
     * HandleIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleIncidentRequest 请求对象
     * @return HandleIncidentResponse
     */
    public HandleIncidentResponse handleIncident(HandleIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.handleIncident);
    }

    /**
     * HandleIncident 处理事件单
     *
     * HandleIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleIncidentRequest 请求对象
     * @return SyncInvoker<HandleIncidentRequest, HandleIncidentResponse>
     */
    public SyncInvoker<HandleIncidentRequest, HandleIncidentResponse> handleIncidentInvoker(
        HandleIncidentRequest request) {
        return new SyncInvoker<>(request, CocMeta.handleIncident, hcClient);
    }

    /**
     * ListIncidents 查询事件单列表
     *
     * ListIncidents 查询事件单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listIncidents);
    }

    /**
     * ListIncidents 查询事件单列表
     *
     * ListIncidents 查询事件单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return SyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public SyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsInvoker(ListIncidentsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listIncidents, hcClient);
    }

    /**
     * ListIncidentsHistories 获取事件单历史
     *
     * ListIncidentsHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsHistoriesRequest 请求对象
     * @return ListIncidentsHistoriesResponse
     */
    public ListIncidentsHistoriesResponse listIncidentsHistories(ListIncidentsHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listIncidentsHistories);
    }

    /**
     * ListIncidentsHistories 获取事件单历史
     *
     * ListIncidentsHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsHistoriesRequest 请求对象
     * @return SyncInvoker<ListIncidentsHistoriesRequest, ListIncidentsHistoriesResponse>
     */
    public SyncInvoker<ListIncidentsHistoriesRequest, ListIncidentsHistoriesResponse> listIncidentsHistoriesInvoker(
        ListIncidentsHistoriesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listIncidentsHistories, hcClient);
    }

    /**
     * ShowIncidentTask 获取事件任务
     *
     * ShowIncidentTask 获取事件任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentTaskRequest 请求对象
     * @return ShowIncidentTaskResponse
     */
    public ShowIncidentTaskResponse showIncidentTask(ShowIncidentTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showIncidentTask);
    }

    /**
     * ShowIncidentTask 获取事件任务
     *
     * ShowIncidentTask 获取事件任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentTaskRequest 请求对象
     * @return SyncInvoker<ShowIncidentTaskRequest, ShowIncidentTaskResponse>
     */
    public SyncInvoker<ShowIncidentTaskRequest, ShowIncidentTaskResponse> showIncidentTaskInvoker(
        ShowIncidentTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.showIncidentTask, hcClient);
    }

    /**
     * 获取节点合规性报告
     *
     * 分页获取节点合规性报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceCompliantRequest 请求对象
     * @return ListInstanceCompliantResponse
     */
    public ListInstanceCompliantResponse listInstanceCompliant(ListInstanceCompliantRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listInstanceCompliant);
    }

    /**
     * 获取节点合规性报告
     *
     * 分页获取节点合规性报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceCompliantRequest 请求对象
     * @return SyncInvoker<ListInstanceCompliantRequest, ListInstanceCompliantResponse>
     */
    public SyncInvoker<ListInstanceCompliantRequest, ListInstanceCompliantResponse> listInstanceCompliantInvoker(
        ListInstanceCompliantRequest request) {
        return new SyncInvoker<>(request, CocMeta.listInstanceCompliant, hcClient);
    }

    /**
     * 分页获取节点补丁详情
     *
     * 分页获取节点补丁详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancePatchItemsRequest 请求对象
     * @return ShowInstancePatchItemsResponse
     */
    public ShowInstancePatchItemsResponse showInstancePatchItems(ShowInstancePatchItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showInstancePatchItems);
    }

    /**
     * 分页获取节点补丁详情
     *
     * 分页获取节点补丁详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancePatchItemsRequest 请求对象
     * @return SyncInvoker<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse>
     */
    public SyncInvoker<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> showInstancePatchItemsInvoker(
        ShowInstancePatchItemsRequest request) {
        return new SyncInvoker<>(request, CocMeta.showInstancePatchItems, hcClient);
    }

    /**
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationComponentsRequest 请求对象
     * @return CreateApplicationComponentsResponse
     */
    public CreateApplicationComponentsResponse createApplicationComponents(CreateApplicationComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createApplicationComponents);
    }

    /**
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationComponentsRequest 请求对象
     * @return SyncInvoker<CreateApplicationComponentsRequest, CreateApplicationComponentsResponse>
     */
    public SyncInvoker<CreateApplicationComponentsRequest, CreateApplicationComponentsResponse> createApplicationComponentsInvoker(
        CreateApplicationComponentsRequest request) {
        return new SyncInvoker<>(request, CocMeta.createApplicationComponents, hcClient);
    }

    /**
     * 删除组件
     *
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationComponentRequest 请求对象
     * @return DeleteApplicationComponentResponse
     */
    public DeleteApplicationComponentResponse deleteApplicationComponent(DeleteApplicationComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteApplicationComponent);
    }

    /**
     * 删除组件
     *
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationComponentRequest 请求对象
     * @return SyncInvoker<DeleteApplicationComponentRequest, DeleteApplicationComponentResponse>
     */
    public SyncInvoker<DeleteApplicationComponentRequest, DeleteApplicationComponentResponse> deleteApplicationComponentInvoker(
        DeleteApplicationComponentRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteApplicationComponent, hcClient);
    }

    /**
     * 查询组件
     *
     * 查询组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationComponentsRequest 请求对象
     * @return ListApplicationComponentsResponse
     */
    public ListApplicationComponentsResponse listApplicationComponents(ListApplicationComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listApplicationComponents);
    }

    /**
     * 查询组件
     *
     * 查询组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationComponentsRequest 请求对象
     * @return SyncInvoker<ListApplicationComponentsRequest, ListApplicationComponentsResponse>
     */
    public SyncInvoker<ListApplicationComponentsRequest, ListApplicationComponentsResponse> listApplicationComponentsInvoker(
        ListApplicationComponentsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listApplicationComponents, hcClient);
    }

    /**
     * 修改组件
     *
     * 修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationComponentRequest 请求对象
     * @return UpdateApplicationComponentResponse
     */
    public UpdateApplicationComponentResponse updateApplicationComponent(UpdateApplicationComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateApplicationComponent);
    }

    /**
     * 修改组件
     *
     * 修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationComponentRequest 请求对象
     * @return SyncInvoker<UpdateApplicationComponentRequest, UpdateApplicationComponentResponse>
     */
    public SyncInvoker<UpdateApplicationComponentRequest, UpdateApplicationComponentResponse> updateApplicationComponentInvoker(
        UpdateApplicationComponentRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateApplicationComponent, hcClient);
    }

    /**
     * 支持用户自主接入告警数据
     *
     * 支持租户将自开发的监控系统按照标准化集成至COC，集成后告警会按照标准格式上报至COC告警中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportCustomEventRequest 请求对象
     * @return CreateReportCustomEventResponse
     */
    public CreateReportCustomEventResponse createReportCustomEvent(CreateReportCustomEventRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createReportCustomEvent);
    }

    /**
     * 支持用户自主接入告警数据
     *
     * 支持租户将自开发的监控系统按照标准化集成至COC，集成后告警会按照标准格式上报至COC告警中心
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportCustomEventRequest 请求对象
     * @return SyncInvoker<CreateReportCustomEventRequest, CreateReportCustomEventResponse>
     */
    public SyncInvoker<CreateReportCustomEventRequest, CreateReportCustomEventResponse> createReportCustomEventInvoker(
        CreateReportCustomEventRequest request) {
        return new SyncInvoker<>(request, CocMeta.createReportCustomEvent, hcClient);
    }

    /**
     * 查询线下IDC资源数量
     *
     * 查询IDC离线资源的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOtherResourceRequest 请求对象
     * @return CountOtherResourceResponse
     */
    public CountOtherResourceResponse countOtherResource(CountOtherResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.countOtherResource);
    }

    /**
     * 查询线下IDC资源数量
     *
     * 查询IDC离线资源的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOtherResourceRequest 请求对象
     * @return SyncInvoker<CountOtherResourceRequest, CountOtherResourceResponse>
     */
    public SyncInvoker<CountOtherResourceRequest, CountOtherResourceResponse> countOtherResourceInvoker(
        CountOtherResourceRequest request) {
        return new SyncInvoker<>(request, CocMeta.countOtherResource, hcClient);
    }

    /**
     * 导入IDC离线资源
     *
     * 管理线下设备提供IDC离线资源纳管功能-导入IDC离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportOtherResourceRequest 请求对象
     * @return ImportOtherResourceResponse
     */
    public ImportOtherResourceResponse importOtherResource(ImportOtherResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.importOtherResource);
    }

    /**
     * 导入IDC离线资源
     *
     * 管理线下设备提供IDC离线资源纳管功能-导入IDC离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportOtherResourceRequest 请求对象
     * @return SyncInvoker<ImportOtherResourceRequest, ImportOtherResourceResponse>
     */
    public SyncInvoker<ImportOtherResourceRequest, ImportOtherResourceResponse> importOtherResourceInvoker(
        ImportOtherResourceRequest request) {
        return new SyncInvoker<>(request, CocMeta.importOtherResource, hcClient);
    }

    /**
     * 取消诊断任务
     *
     * 取消诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDiagnosisTaskRequest 请求对象
     * @return CancelDiagnosisTaskResponse
     */
    public CancelDiagnosisTaskResponse cancelDiagnosisTask(CancelDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.cancelDiagnosisTask);
    }

    /**
     * 取消诊断任务
     *
     * 取消诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<CancelDiagnosisTaskRequest, CancelDiagnosisTaskResponse>
     */
    public SyncInvoker<CancelDiagnosisTaskRequest, CancelDiagnosisTaskResponse> cancelDiagnosisTaskInvoker(
        CancelDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.cancelDiagnosisTask, hcClient);
    }

    /**
     * 提交诊断任务
     *
     * 提交诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return CreateDiagnosisTaskResponse
     */
    public CreateDiagnosisTaskResponse createDiagnosisTask(CreateDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createDiagnosisTask);
    }

    /**
     * 提交诊断任务
     *
     * 提交诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskInvoker(
        CreateDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.createDiagnosisTask, hcClient);
    }

    /**
     * 查询诊断记录
     *
     * 查询诊断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return ListDiagnosisTasksResponse
     */
    public ListDiagnosisTasksResponse listDiagnosisTasks(ListDiagnosisTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listDiagnosisTasks);
    }

    /**
     * 查询诊断记录
     *
     * 查询诊断记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return SyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse>
     */
    public SyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasksInvoker(
        ListDiagnosisTasksRequest request) {
        return new SyncInvoker<>(request, CocMeta.listDiagnosisTasks, hcClient);
    }

    /**
     * 重试诊断任务
     *
     * 重试诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDiagnosisTaskRequest 请求对象
     * @return RetryDiagnosisTaskResponse
     */
    public RetryDiagnosisTaskResponse retryDiagnosisTask(RetryDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.retryDiagnosisTask);
    }

    /**
     * 重试诊断任务
     *
     * 重试诊断任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<RetryDiagnosisTaskRequest, RetryDiagnosisTaskResponse>
     */
    public SyncInvoker<RetryDiagnosisTaskRequest, RetryDiagnosisTaskResponse> retryDiagnosisTaskInvoker(
        RetryDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.retryDiagnosisTask, hcClient);
    }

    /**
     * 查询指定诊断记录下的指定诊断步骤的详情
     *
     * 查询指定诊断记录下的指定诊断步骤的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisNodeRequest 请求对象
     * @return ShowDiagnosisNodeResponse
     */
    public ShowDiagnosisNodeResponse showDiagnosisNode(ShowDiagnosisNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showDiagnosisNode);
    }

    /**
     * 查询指定诊断记录下的指定诊断步骤的详情
     *
     * 查询指定诊断记录下的指定诊断步骤的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisNodeRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisNodeRequest, ShowDiagnosisNodeResponse>
     */
    public SyncInvoker<ShowDiagnosisNodeRequest, ShowDiagnosisNodeResponse> showDiagnosisNodeInvoker(
        ShowDiagnosisNodeRequest request) {
        return new SyncInvoker<>(request, CocMeta.showDiagnosisNode, hcClient);
    }

    /**
     * 查询批量诊断任务的结果概要
     *
     * 查询诊断任务的结果概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisSummaryRequest 请求对象
     * @return ShowDiagnosisSummaryResponse
     */
    public ShowDiagnosisSummaryResponse showDiagnosisSummary(ShowDiagnosisSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showDiagnosisSummary);
    }

    /**
     * 查询批量诊断任务的结果概要
     *
     * 查询诊断任务的结果概要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisSummaryRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisSummaryRequest, ShowDiagnosisSummaryResponse>
     */
    public SyncInvoker<ShowDiagnosisSummaryRequest, ShowDiagnosisSummaryResponse> showDiagnosisSummaryInvoker(
        ShowDiagnosisSummaryRequest request) {
        return new SyncInvoker<>(request, CocMeta.showDiagnosisSummary, hcClient);
    }

    /**
     * 查询单个诊断任务详情
     *
     * 查询单个诊断任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskRequest 请求对象
     * @return ShowDiagnosisTaskResponse
     */
    public ShowDiagnosisTaskResponse showDiagnosisTask(ShowDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showDiagnosisTask);
    }

    /**
     * 查询单个诊断任务详情
     *
     * 查询单个诊断任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisTaskRequest, ShowDiagnosisTaskResponse>
     */
    public SyncInvoker<ShowDiagnosisTaskRequest, ShowDiagnosisTaskResponse> showDiagnosisTaskInvoker(
        ShowDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.showDiagnosisTask, hcClient);
    }

    /**
     * 创建自定义作业
     *
     * 创建自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return CreateDocumentResponse
     */
    public CreateDocumentResponse createDocument(CreateDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createDocument);
    }

    /**
     * 创建自定义作业
     *
     * 创建自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return SyncInvoker<CreateDocumentRequest, CreateDocumentResponse>
     */
    public SyncInvoker<CreateDocumentRequest, CreateDocumentResponse> createDocumentInvoker(
        CreateDocumentRequest request) {
        return new SyncInvoker<>(request, CocMeta.createDocument, hcClient);
    }

    /**
     * 删除自定义作业
     *
     * 删除自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDocumentRequest 请求对象
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(DeleteDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteDocument);
    }

    /**
     * 删除自定义作业
     *
     * 删除自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDocumentRequest 请求对象
     * @return SyncInvoker<DeleteDocumentRequest, DeleteDocumentResponse>
     */
    public SyncInvoker<DeleteDocumentRequest, DeleteDocumentResponse> deleteDocumentInvoker(
        DeleteDocumentRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteDocument, hcClient);
    }

    /**
     * 执行自定义作业
     *
     * 执行自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDocumentRequest 请求对象
     * @return ExecuteDocumentResponse
     */
    public ExecuteDocumentResponse executeDocument(ExecuteDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.executeDocument);
    }

    /**
     * 执行自定义作业
     *
     * 执行自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDocumentRequest 请求对象
     * @return SyncInvoker<ExecuteDocumentRequest, ExecuteDocumentResponse>
     */
    public SyncInvoker<ExecuteDocumentRequest, ExecuteDocumentResponse> executeDocumentInvoker(
        ExecuteDocumentRequest request) {
        return new SyncInvoker<>(request, CocMeta.executeDocument, hcClient);
    }

    /**
     * 查询自定义作业详情
     *
     * 查询自定义作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentRequest 请求对象
     * @return GetDocumentResponse
     */
    public GetDocumentResponse getDocument(GetDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getDocument);
    }

    /**
     * 查询自定义作业详情
     *
     * 查询自定义作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentRequest 请求对象
     * @return SyncInvoker<GetDocumentRequest, GetDocumentResponse>
     */
    public SyncInvoker<GetDocumentRequest, GetDocumentResponse> getDocumentInvoker(GetDocumentRequest request) {
        return new SyncInvoker<>(request, CocMeta.getDocument, hcClient);
    }

    /**
     * 获取原子能力详细
     *
     * 获取原子能力详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentAtomicInfoRequest 请求对象
     * @return GetDocumentAtomicInfoResponse
     */
    public GetDocumentAtomicInfoResponse getDocumentAtomicInfo(GetDocumentAtomicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getDocumentAtomicInfo);
    }

    /**
     * 获取原子能力详细
     *
     * 获取原子能力详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetDocumentAtomicInfoRequest 请求对象
     * @return SyncInvoker<GetDocumentAtomicInfoRequest, GetDocumentAtomicInfoResponse>
     */
    public SyncInvoker<GetDocumentAtomicInfoRequest, GetDocumentAtomicInfoResponse> getDocumentAtomicInfoInvoker(
        GetDocumentAtomicInfoRequest request) {
        return new SyncInvoker<>(request, CocMeta.getDocumentAtomicInfo, hcClient);
    }

    /**
     * 获取原子能力列表
     *
     * 获取原子能力列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentAtomicsRequest 请求对象
     * @return ListDocumentAtomicsResponse
     */
    public ListDocumentAtomicsResponse listDocumentAtomics(ListDocumentAtomicsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listDocumentAtomics);
    }

    /**
     * 获取原子能力列表
     *
     * 获取原子能力列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentAtomicsRequest 请求对象
     * @return SyncInvoker<ListDocumentAtomicsRequest, ListDocumentAtomicsResponse>
     */
    public SyncInvoker<ListDocumentAtomicsRequest, ListDocumentAtomicsResponse> listDocumentAtomicsInvoker(
        ListDocumentAtomicsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listDocumentAtomics, hcClient);
    }

    /**
     * 查询自定义作业列表
     *
     * 查询自定义作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentsRequest 请求对象
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocuments(ListDocumentsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listDocuments);
    }

    /**
     * 查询自定义作业列表
     *
     * 查询自定义作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDocumentsRequest 请求对象
     * @return SyncInvoker<ListDocumentsRequest, ListDocumentsResponse>
     */
    public SyncInvoker<ListDocumentsRequest, ListDocumentsResponse> listDocumentsInvoker(ListDocumentsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listDocuments, hcClient);
    }

    /**
     * 修改自定义作业
     *
     * 修改自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocument(UpdateDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateDocument);
    }

    /**
     * 修改自定义作业
     *
     * 修改自定义作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return SyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse>
     */
    public SyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse> updateDocumentInvoker(
        UpdateDocumentRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateDocument, hcClient);
    }

    /**
     * 查询企业项目收藏
     *
     * 查询企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectCollectRequest 请求对象
     * @return ListEnterpriseProjectCollectResponse
     */
    public ListEnterpriseProjectCollectResponse listEnterpriseProjectCollect(
        ListEnterpriseProjectCollectRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listEnterpriseProjectCollect);
    }

    /**
     * 查询企业项目收藏
     *
     * 查询企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectCollectRequest 请求对象
     * @return SyncInvoker<ListEnterpriseProjectCollectRequest, ListEnterpriseProjectCollectResponse>
     */
    public SyncInvoker<ListEnterpriseProjectCollectRequest, ListEnterpriseProjectCollectResponse> listEnterpriseProjectCollectInvoker(
        ListEnterpriseProjectCollectRequest request) {
        return new SyncInvoker<>(request, CocMeta.listEnterpriseProjectCollect, hcClient);
    }

    /**
     * 更新企业项目收藏
     *
     * 更新企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectCollectRequest 请求对象
     * @return UpdateEnterpriseProjectCollectResponse
     */
    public UpdateEnterpriseProjectCollectResponse updateEnterpriseProjectCollect(
        UpdateEnterpriseProjectCollectRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateEnterpriseProjectCollect);
    }

    /**
     * 更新企业项目收藏
     *
     * 更新企业项目收藏。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseProjectCollectRequest 请求对象
     * @return SyncInvoker<UpdateEnterpriseProjectCollectRequest, UpdateEnterpriseProjectCollectResponse>
     */
    public SyncInvoker<UpdateEnterpriseProjectCollectRequest, UpdateEnterpriseProjectCollectResponse> updateEnterpriseProjectCollectInvoker(
        UpdateEnterpriseProjectCollectRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateEnterpriseProjectCollect, hcClient);
    }

    /**
     * Prometheus事件接入
     *
     * Prometheus事件接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportPrometheusEventRequest 请求对象
     * @return CreateReportPrometheusEventResponse
     */
    public CreateReportPrometheusEventResponse createReportPrometheusEvent(CreateReportPrometheusEventRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createReportPrometheusEvent);
    }

    /**
     * Prometheus事件接入
     *
     * Prometheus事件接入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportPrometheusEventRequest 请求对象
     * @return SyncInvoker<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse>
     */
    public SyncInvoker<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> createReportPrometheusEventInvoker(
        CreateReportPrometheusEventRequest request) {
        return new SyncInvoker<>(request, CocMeta.createReportPrometheusEvent, hcClient);
    }

    /**
     * 查询作业工单详情
     *
     * 查询作业工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionRequest 请求对象
     * @return GetExecutionResponse
     */
    public GetExecutionResponse getExecution(GetExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getExecution);
    }

    /**
     * 查询作业工单详情
     *
     * 查询作业工单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionRequest 请求对象
     * @return SyncInvoker<GetExecutionRequest, GetExecutionResponse>
     */
    public SyncInvoker<GetExecutionRequest, GetExecutionResponse> getExecutionInvoker(GetExecutionRequest request) {
        return new SyncInvoker<>(request, CocMeta.getExecution, hcClient);
    }

    /**
     * 查询工单步骤批次实例
     *
     * 查询工单步骤批次实例，如脚本分批操作里的ECS实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionInstancesRequest 请求对象
     * @return ListExecutionInstancesResponse
     */
    public ListExecutionInstancesResponse listExecutionInstances(ListExecutionInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listExecutionInstances);
    }

    /**
     * 查询工单步骤批次实例
     *
     * 查询工单步骤批次实例，如脚本分批操作里的ECS实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionInstancesRequest 请求对象
     * @return SyncInvoker<ListExecutionInstancesRequest, ListExecutionInstancesResponse>
     */
    public SyncInvoker<ListExecutionInstancesRequest, ListExecutionInstancesResponse> listExecutionInstancesInvoker(
        ListExecutionInstancesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listExecutionInstances, hcClient);
    }

    /**
     * 查询工单步骤详情
     *
     * 查询工单步骤详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionStepsRequest 请求对象
     * @return ListExecutionStepsResponse
     */
    public ListExecutionStepsResponse listExecutionSteps(ListExecutionStepsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listExecutionSteps);
    }

    /**
     * 查询工单步骤详情
     *
     * 查询工单步骤详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionStepsRequest 请求对象
     * @return SyncInvoker<ListExecutionStepsRequest, ListExecutionStepsResponse>
     */
    public SyncInvoker<ListExecutionStepsRequest, ListExecutionStepsResponse> listExecutionStepsInvoker(
        ListExecutionStepsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listExecutionSteps, hcClient);
    }

    /**
     * 查询作业工单列表
     *
     * 查询作业工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionsRequest 请求对象
     * @return ListExecutionsResponse
     */
    public ListExecutionsResponse listExecutions(ListExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listExecutions);
    }

    /**
     * 查询作业工单列表
     *
     * 查询作业工单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionsRequest 请求对象
     * @return SyncInvoker<ListExecutionsRequest, ListExecutionsResponse>
     */
    public SyncInvoker<ListExecutionsRequest, ListExecutionsResponse> listExecutionsInvoker(
        ListExecutionsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listExecutions, hcClient);
    }

    /**
     * 操作工单
     *
     * 操作工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateExecutionRequest 请求对象
     * @return OperateExecutionResponse
     */
    public OperateExecutionResponse operateExecution(OperateExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.operateExecution);
    }

    /**
     * 操作工单
     *
     * 操作工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateExecutionRequest 请求对象
     * @return SyncInvoker<OperateExecutionRequest, OperateExecutionResponse>
     */
    public SyncInvoker<OperateExecutionRequest, OperateExecutionResponse> operateExecutionInvoker(
        OperateExecutionRequest request) {
        return new SyncInvoker<>(request, CocMeta.operateExecution, hcClient);
    }

    /**
     * 删除变更单
     *
     * 删除变更单，当变更单为撤销状态下，变更单可进行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTicketInfoRequest 请求对象
     * @return DeleteTicketInfoResponse
     */
    public DeleteTicketInfoResponse deleteTicketInfo(DeleteTicketInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteTicketInfo);
    }

    /**
     * 删除变更单
     *
     * 删除变更单，当变更单为撤销状态下，变更单可进行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTicketInfoRequest 请求对象
     * @return SyncInvoker<DeleteTicketInfoRequest, DeleteTicketInfoResponse>
     */
    public SyncInvoker<DeleteTicketInfoRequest, DeleteTicketInfoResponse> deleteTicketInfoInvoker(
        DeleteTicketInfoRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteTicketInfo, hcClient);
    }

    /**
     * 搜索变更工单子单
     *
     * 搜索变更工单子单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTicketsRequest 请求对象
     * @return ListSubTicketsResponse
     */
    public ListSubTicketsResponse listSubTickets(ListSubTicketsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listSubTickets);
    }

    /**
     * 搜索变更工单子单
     *
     * 搜索变更工单子单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTicketsRequest 请求对象
     * @return SyncInvoker<ListSubTicketsRequest, ListSubTicketsResponse>
     */
    public SyncInvoker<ListSubTicketsRequest, ListSubTicketsResponse> listSubTicketsInvoker(
        ListSubTicketsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listSubTickets, hcClient);
    }

    /**
     * 变更单状态修改
     *
     * 变更单状态修改，请求路径中的ticket_type为固定值change，且ticket_id传递变更单单号。此接口可操作变更开始、变更结束、变更取消和添加变更结果操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTicketRequest 请求对象
     * @return UpdateTicketResponse
     */
    public UpdateTicketResponse updateTicket(UpdateTicketRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateTicket);
    }

    /**
     * 变更单状态修改
     *
     * 变更单状态修改，请求路径中的ticket_type为固定值change，且ticket_id传递变更单单号。此接口可操作变更开始、变更结束、变更取消和添加变更结果操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTicketRequest 请求对象
     * @return SyncInvoker<UpdateTicketRequest, UpdateTicketResponse>
     */
    public SyncInvoker<UpdateTicketRequest, UpdateTicketResponse> updateTicketInvoker(UpdateTicketRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateTicket, hcClient);
    }

    /**
     * CreateExternalIncident 创建事件单
     *
     * CreateExternalIncident 创建事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIncidentRequest 请求对象
     * @return CreateCocIncidentResponse
     */
    public CreateCocIncidentResponse createCocIncident(CreateCocIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createCocIncident);
    }

    /**
     * CreateExternalIncident 创建事件单
     *
     * CreateExternalIncident 创建事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIncidentRequest 请求对象
     * @return SyncInvoker<CreateCocIncidentRequest, CreateCocIncidentResponse>
     */
    public SyncInvoker<CreateCocIncidentRequest, CreateCocIncidentResponse> createCocIncidentInvoker(
        CreateCocIncidentRequest request) {
        return new SyncInvoker<>(request, CocMeta.createCocIncident, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件，创建事件单的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalCocAttachmentRequest 请求对象
     * @return CreateExternalCocAttachmentResponse
     */
    public CreateExternalCocAttachmentResponse createExternalCocAttachment(CreateExternalCocAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createExternalCocAttachment);
    }

    /**
     * 上传附件
     *
     * 上传附件，创建事件单的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExternalCocAttachmentRequest 请求对象
     * @return SyncInvoker<CreateExternalCocAttachmentRequest, CreateExternalCocAttachmentResponse>
     */
    public SyncInvoker<CreateExternalCocAttachmentRequest, CreateExternalCocAttachmentResponse> createExternalCocAttachmentInvoker(
        CreateExternalCocAttachmentRequest request) {
        return new SyncInvoker<>(request, CocMeta.createExternalCocAttachment, hcClient);
    }

    /**
     * HandleCocIncident处理事件单
     *
     * HandleCocIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleCocIncidentRequest 请求对象
     * @return HandleCocIncidentResponse
     */
    public HandleCocIncidentResponse handleCocIncident(HandleCocIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.handleCocIncident);
    }

    /**
     * HandleCocIncident处理事件单
     *
     * HandleCocIncident 处理事件单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleCocIncidentRequest 请求对象
     * @return SyncInvoker<HandleCocIncidentRequest, HandleCocIncidentResponse>
     */
    public SyncInvoker<HandleCocIncidentRequest, HandleCocIncidentResponse> handleCocIncidentInvoker(
        HandleCocIncidentRequest request) {
        return new SyncInvoker<>(request, CocMeta.handleCocIncident, hcClient);
    }

    /**
     * GetCocTicketOperationHistories 获取事件单历史
     *
     * ListCocTicketOperationHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCocTicketOperationHistoriesRequest 请求对象
     * @return ListCocTicketOperationHistoriesResponse
     */
    public ListCocTicketOperationHistoriesResponse listCocTicketOperationHistories(
        ListCocTicketOperationHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listCocTicketOperationHistories);
    }

    /**
     * GetCocTicketOperationHistories 获取事件单历史
     *
     * ListCocTicketOperationHistories  获取事件单历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCocTicketOperationHistoriesRequest 请求对象
     * @return SyncInvoker<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse>
     */
    public SyncInvoker<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> listCocTicketOperationHistoriesInvoker(
        ListCocTicketOperationHistoriesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listCocTicketOperationHistories, hcClient);
    }

    /**
     * 查询简易版事件单列表
     *
     * 该接口可分页查询到事件单列表信息，分页参数为limit与offset。该接口不支持对事件单进行除分页参数外的条件过滤，且返回的列表字段相对简单，只有事件单标题、事件单单号、描述信息、工单状态、事件级别、企业项目ID、事件单来源、创建人及责任人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentSimpleTicketsRequest 请求对象
     * @return ListIncidentSimpleTicketsResponse
     */
    public ListIncidentSimpleTicketsResponse listIncidentSimpleTickets(ListIncidentSimpleTicketsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listIncidentSimpleTickets);
    }

    /**
     * 查询简易版事件单列表
     *
     * 该接口可分页查询到事件单列表信息，分页参数为limit与offset。该接口不支持对事件单进行除分页参数外的条件过滤，且返回的列表字段相对简单，只有事件单标题、事件单单号、描述信息、工单状态、事件级别、企业项目ID、事件单来源、创建人及责任人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentSimpleTicketsRequest 请求对象
     * @return SyncInvoker<ListIncidentSimpleTicketsRequest, ListIncidentSimpleTicketsResponse>
     */
    public SyncInvoker<ListIncidentSimpleTicketsRequest, ListIncidentSimpleTicketsResponse> listIncidentSimpleTicketsInvoker(
        ListIncidentSimpleTicketsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listIncidentSimpleTickets, hcClient);
    }

    /**
     * GetCocIncidentDetail 获取事件单详细
     *
     * ShowCocIncidentDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIncidentDetailRequest 请求对象
     * @return ShowCocIncidentDetailResponse
     */
    public ShowCocIncidentDetailResponse showCocIncidentDetail(ShowCocIncidentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showCocIncidentDetail);
    }

    /**
     * GetCocIncidentDetail 获取事件单详细
     *
     * ShowCocIncidentDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIncidentDetailRequest 请求对象
     * @return SyncInvoker<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse>
     */
    public SyncInvoker<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> showCocIncidentDetailInvoker(
        ShowCocIncidentDetailRequest request) {
        return new SyncInvoker<>(request, CocMeta.showCocIncidentDetail, hcClient);
    }

    /**
     * CreateExternalIssues 创建问题单
     *
     * CreateExternalIssues 创建问题单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIssuesRequest 请求对象
     * @return CreateCocIssuesResponse
     */
    public CreateCocIssuesResponse createCocIssues(CreateCocIssuesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createCocIssues);
    }

    /**
     * CreateExternalIssues 创建问题单
     *
     * CreateExternalIssues 创建问题单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCocIssuesRequest 请求对象
     * @return SyncInvoker<CreateCocIssuesRequest, CreateCocIssuesResponse>
     */
    public SyncInvoker<CreateCocIssuesRequest, CreateCocIssuesResponse> createCocIssuesInvoker(
        CreateCocIssuesRequest request) {
        return new SyncInvoker<>(request, CocMeta.createCocIssues, hcClient);
    }

    /**
     * GetCocIssuesDetail 获取事件单详细
     *
     * ShowCocIssuesDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIssuesDetailRequest 请求对象
     * @return ShowCocIssuesDetailResponse
     */
    public ShowCocIssuesDetailResponse showCocIssuesDetail(ShowCocIssuesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showCocIssuesDetail);
    }

    /**
     * GetCocIssuesDetail 获取事件单详细
     *
     * ShowCocIssuesDetail  获取事件单详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCocIssuesDetailRequest 请求对象
     * @return SyncInvoker<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse>
     */
    public SyncInvoker<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> showCocIssuesDetailInvoker(
        ShowCocIssuesDetailRequest request) {
        return new SyncInvoker<>(request, CocMeta.showCocIssuesDetail, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件，创建工单（事件单、变更单、问题单）的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttachmentRequest 请求对象
     * @return CreateAttachmentResponse
     */
    public CreateAttachmentResponse createAttachment(CreateAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createAttachment);
    }

    /**
     * 上传附件
     *
     * 上传附件，创建工单（事件单、变更单、问题单）的场景下，如需上传附件，需要先调用该接口将文件上传到obs。上传成功时，该接口将返回文档唯一id。支持文件类型：.jpg,.png,.docx,.txt,.pdf，且文本大小不超10M。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttachmentRequest 请求对象
     * @return SyncInvoker<CreateAttachmentRequest, CreateAttachmentResponse>
     */
    public SyncInvoker<CreateAttachmentRequest, CreateAttachmentResponse> createAttachmentInvoker(
        CreateAttachmentRequest request) {
        return new SyncInvoker<>(request, CocMeta.createAttachment, hcClient);
    }

    /**
     * 新建工单
     *
     * 创建变更单或问题单的接口，通过路径参数ticket_type区分需要创建的工单类型。ticket_type为change表示要创建变更单，ticket_type为issues_mgmt为创建问题单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTicketRequest 请求对象
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicket(CreateTicketRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createTicket);
    }

    /**
     * 新建工单
     *
     * 创建变更单或问题单的接口，通过路径参数ticket_type区分需要创建的工单类型。ticket_type为change表示要创建变更单，ticket_type为issues_mgmt为创建问题单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTicketRequest 请求对象
     * @return SyncInvoker<CreateTicketRequest, CreateTicketResponse>
     */
    public SyncInvoker<CreateTicketRequest, CreateTicketResponse> createTicketInvoker(CreateTicketRequest request) {
        return new SyncInvoker<>(request, CocMeta.createTicket, hcClient);
    }

    /**
     * 下载附件
     *
     * 附件下载操作需基于已上传的附件资源。上传附件时，需调用/v1/{ticket_type}/attachments接口完成上传；成功上传后，可从接口响应中获取doc_id参数。下载附件时，凭借此doc_id再次调用/v1/{ticket_type}/attachments接口，即可获取已上传的对应附件资源，实现附件全生命周期管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return DownloadAttachmentResponse
     */
    public DownloadAttachmentResponse downloadAttachment(DownloadAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.downloadAttachment);
    }

    /**
     * 下载附件
     *
     * 附件下载操作需基于已上传的附件资源。上传附件时，需调用/v1/{ticket_type}/attachments接口完成上传；成功上传后，可从接口响应中获取doc_id参数。下载附件时，凭借此doc_id再次调用/v1/{ticket_type}/attachments接口，即可获取已上传的对应附件资源，实现附件全生命周期管理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return SyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse>
     */
    public SyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachmentInvoker(
        DownloadAttachmentRequest request) {
        return new SyncInvoker<>(request, CocMeta.downloadAttachment, hcClient);
    }

    /**
     * 工单操作
     *
     * 变更单审批、撤销以及问题单的所有操作均通过此接口完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTicketActionRequest 请求对象
     * @return ExecuteTicketActionResponse
     */
    public ExecuteTicketActionResponse executeTicketAction(ExecuteTicketActionRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.executeTicketAction);
    }

    /**
     * 工单操作
     *
     * 变更单审批、撤销以及问题单的所有操作均通过此接口完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTicketActionRequest 请求对象
     * @return SyncInvoker<ExecuteTicketActionRequest, ExecuteTicketActionResponse>
     */
    public SyncInvoker<ExecuteTicketActionRequest, ExecuteTicketActionResponse> executeTicketActionInvoker(
        ExecuteTicketActionRequest request) {
        return new SyncInvoker<>(request, CocMeta.executeTicketAction, hcClient);
    }

    /**
     * 搜索工单历史
     *
     * List Histories
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketOperationHistoriesRequest 请求对象
     * @return ListTicketOperationHistoriesResponse
     */
    public ListTicketOperationHistoriesResponse listTicketOperationHistories(
        ListTicketOperationHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listTicketOperationHistories);
    }

    /**
     * 搜索工单历史
     *
     * List Histories
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketOperationHistoriesRequest 请求对象
     * @return SyncInvoker<ListTicketOperationHistoriesRequest, ListTicketOperationHistoriesResponse>
     */
    public SyncInvoker<ListTicketOperationHistoriesRequest, ListTicketOperationHistoriesResponse> listTicketOperationHistoriesInvoker(
        ListTicketOperationHistoriesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listTicketOperationHistories, hcClient);
    }

    /**
     * 搜索工单
     *
     * List ticket
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketsRequest 请求对象
     * @return ListTicketsResponse
     */
    public ListTicketsResponse listTickets(ListTicketsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listTickets);
    }

    /**
     * 搜索工单
     *
     * List ticket
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTicketsRequest 请求对象
     * @return SyncInvoker<ListTicketsRequest, ListTicketsResponse>
     */
    public SyncInvoker<ListTicketsRequest, ListTicketsResponse> listTicketsInvoker(ListTicketsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listTickets, hcClient);
    }

    /**
     * 查询Ticket
     *
     * Get Ticket info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTicketInfoRequest 请求对象
     * @return ShowTicketInfoResponse
     */
    public ShowTicketInfoResponse showTicketInfo(ShowTicketInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showTicketInfo);
    }

    /**
     * 查询Ticket
     *
     * Get Ticket info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTicketInfoRequest 请求对象
     * @return SyncInvoker<ShowTicketInfoRequest, ShowTicketInfoResponse>
     */
    public SyncInvoker<ShowTicketInfoRequest, ShowTicketInfoResponse> showTicketInfoInvoker(
        ShowTicketInfoRequest request) {
        return new SyncInvoker<>(request, CocMeta.showTicketInfo, hcClient);
    }

    /**
     * 创建分组
     *
     * 创建分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationGroupRequest 请求对象
     * @return CreateApplicationGroupResponse
     */
    public CreateApplicationGroupResponse createApplicationGroup(CreateApplicationGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createApplicationGroup);
    }

    /**
     * 创建分组
     *
     * 创建分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationGroupRequest 请求对象
     * @return SyncInvoker<CreateApplicationGroupRequest, CreateApplicationGroupResponse>
     */
    public SyncInvoker<CreateApplicationGroupRequest, CreateApplicationGroupResponse> createApplicationGroupInvoker(
        CreateApplicationGroupRequest request) {
        return new SyncInvoker<>(request, CocMeta.createApplicationGroup, hcClient);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationGroupRequest 请求对象
     * @return DeleteApplicationGroupResponse
     */
    public DeleteApplicationGroupResponse deleteApplicationGroup(DeleteApplicationGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteApplicationGroup);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationGroupRequest 请求对象
     * @return SyncInvoker<DeleteApplicationGroupRequest, DeleteApplicationGroupResponse>
     */
    public SyncInvoker<DeleteApplicationGroupRequest, DeleteApplicationGroupResponse> deleteApplicationGroupInvoker(
        DeleteApplicationGroupRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteApplicationGroup, hcClient);
    }

    /**
     * 查询分组
     *
     * 查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationGroupsRequest 请求对象
     * @return ListApplicationGroupsResponse
     */
    public ListApplicationGroupsResponse listApplicationGroups(ListApplicationGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listApplicationGroups);
    }

    /**
     * 查询分组
     *
     * 查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationGroupsRequest 请求对象
     * @return SyncInvoker<ListApplicationGroupsRequest, ListApplicationGroupsResponse>
     */
    public SyncInvoker<ListApplicationGroupsRequest, ListApplicationGroupsResponse> listApplicationGroupsInvoker(
        ListApplicationGroupsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listApplicationGroups, hcClient);
    }

    /**
     * 分组智能同步资源
     *
     * 分组智能同步资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncGroupResourceRequest 请求对象
     * @return SyncGroupResourceResponse
     */
    public SyncGroupResourceResponse syncGroupResource(SyncGroupResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.syncGroupResource);
    }

    /**
     * 分组智能同步资源
     *
     * 分组智能同步资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncGroupResourceRequest 请求对象
     * @return SyncInvoker<SyncGroupResourceRequest, SyncGroupResourceResponse>
     */
    public SyncInvoker<SyncGroupResourceRequest, SyncGroupResourceResponse> syncGroupResourceInvoker(
        SyncGroupResourceRequest request) {
        return new SyncInvoker<>(request, CocMeta.syncGroupResource, hcClient);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationGroupRequest 请求对象
     * @return UpdateApplicationGroupResponse
     */
    public UpdateApplicationGroupResponse updateApplicationGroup(UpdateApplicationGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateApplicationGroup);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationGroupRequest 请求对象
     * @return SyncInvoker<UpdateApplicationGroupRequest, UpdateApplicationGroupResponse>
     */
    public SyncInvoker<UpdateApplicationGroupRequest, UpdateApplicationGroupResponse> updateApplicationGroupInvoker(
        UpdateApplicationGroupRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateApplicationGroup, hcClient);
    }

    /**
     * 查询分组关联的阿里云资源
     *
     * 查询分组关联的阿里云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAliResourceRelationsRequest 请求对象
     * @return ListGroupAliResourceRelationsResponse
     */
    public ListGroupAliResourceRelationsResponse listGroupAliResourceRelations(
        ListGroupAliResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listGroupAliResourceRelations);
    }

    /**
     * 查询分组关联的阿里云资源
     *
     * 查询分组关联的阿里云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAliResourceRelationsRequest 请求对象
     * @return SyncInvoker<ListGroupAliResourceRelationsRequest, ListGroupAliResourceRelationsResponse>
     */
    public SyncInvoker<ListGroupAliResourceRelationsRequest, ListGroupAliResourceRelationsResponse> listGroupAliResourceRelationsInvoker(
        ListGroupAliResourceRelationsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listGroupAliResourceRelations, hcClient);
    }

    /**
     * 查询分组关联的离线资源
     *
     * 查询分组关联的离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupOtherResourceRelationsRequest 请求对象
     * @return ListGroupOtherResourceRelationsResponse
     */
    public ListGroupOtherResourceRelationsResponse listGroupOtherResourceRelations(
        ListGroupOtherResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listGroupOtherResourceRelations);
    }

    /**
     * 查询分组关联的离线资源
     *
     * 查询分组关联的离线资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupOtherResourceRelationsRequest 请求对象
     * @return SyncInvoker<ListGroupOtherResourceRelationsRequest, ListGroupOtherResourceRelationsResponse>
     */
    public SyncInvoker<ListGroupOtherResourceRelationsRequest, ListGroupOtherResourceRelationsResponse> listGroupOtherResourceRelationsInvoker(
        ListGroupOtherResourceRelationsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listGroupOtherResourceRelations, hcClient);
    }

    /**
     * 查询分组关联的资源总数
     *
     * 分组管理多个资源后，可查询分组关联的资源总数， 应用id和分组id不能共存，且必填其中一个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGroupRmsResourceRelationsRequest 请求对象
     * @return CountGroupRmsResourceRelationsResponse
     */
    public CountGroupRmsResourceRelationsResponse countGroupRmsResourceRelations(
        CountGroupRmsResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.countGroupRmsResourceRelations);
    }

    /**
     * 查询分组关联的资源总数
     *
     * 分组管理多个资源后，可查询分组关联的资源总数， 应用id和分组id不能共存，且必填其中一个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGroupRmsResourceRelationsRequest 请求对象
     * @return SyncInvoker<CountGroupRmsResourceRelationsRequest, CountGroupRmsResourceRelationsResponse>
     */
    public SyncInvoker<CountGroupRmsResourceRelationsRequest, CountGroupRmsResourceRelationsResponse> countGroupRmsResourceRelationsInvoker(
        CountGroupRmsResourceRelationsRequest request) {
        return new SyncInvoker<>(request, CocMeta.countGroupRmsResourceRelations, hcClient);
    }

    /**
     * 创建分组资源关联
     *
     * 创建分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRmsResourceRelationRequest 请求对象
     * @return CreateGroupRmsResourceRelationResponse
     */
    public CreateGroupRmsResourceRelationResponse createGroupRmsResourceRelation(
        CreateGroupRmsResourceRelationRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createGroupRmsResourceRelation);
    }

    /**
     * 创建分组资源关联
     *
     * 创建分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRmsResourceRelationRequest 请求对象
     * @return SyncInvoker<CreateGroupRmsResourceRelationRequest, CreateGroupRmsResourceRelationResponse>
     */
    public SyncInvoker<CreateGroupRmsResourceRelationRequest, CreateGroupRmsResourceRelationResponse> createGroupRmsResourceRelationInvoker(
        CreateGroupRmsResourceRelationRequest request) {
        return new SyncInvoker<>(request, CocMeta.createGroupRmsResourceRelation, hcClient);
    }

    /**
     * 解绑分组资源关联
     *
     * 解绑分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRmsResourceRelationRequest 请求对象
     * @return DeleteGroupRmsResourceRelationResponse
     */
    public DeleteGroupRmsResourceRelationResponse deleteGroupRmsResourceRelation(
        DeleteGroupRmsResourceRelationRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteGroupRmsResourceRelation);
    }

    /**
     * 解绑分组资源关联
     *
     * 解绑分组资源关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRmsResourceRelationRequest 请求对象
     * @return SyncInvoker<DeleteGroupRmsResourceRelationRequest, DeleteGroupRmsResourceRelationResponse>
     */
    public SyncInvoker<DeleteGroupRmsResourceRelationRequest, DeleteGroupRmsResourceRelationResponse> deleteGroupRmsResourceRelationInvoker(
        DeleteGroupRmsResourceRelationRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteGroupRmsResourceRelation, hcClient);
    }

    /**
     * 查询应用、组件、分组容量数据的排名
     *
     * 查询应用、组件、分组容量数据的排名，其中应用、组件和分组ID，有且仅有1个有值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityOrderRequest 请求对象
     * @return ListCapacityOrderResponse
     */
    public ListCapacityOrderResponse listCapacityOrder(ListCapacityOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listCapacityOrder);
    }

    /**
     * 查询应用、组件、分组容量数据的排名
     *
     * 查询应用、组件、分组容量数据的排名，其中应用、组件和分组ID，有且仅有1个有值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityOrderRequest 请求对象
     * @return SyncInvoker<ListCapacityOrderRequest, ListCapacityOrderResponse>
     */
    public SyncInvoker<ListCapacityOrderRequest, ListCapacityOrderResponse> listCapacityOrderInvoker(
        ListCapacityOrderRequest request) {
        return new SyncInvoker<>(request, CocMeta.listCapacityOrder, hcClient);
    }

    /**
     * 查询应用的容量数据
     *
     * 云运维中心支持查看应用、子应用、组件或分组下已关联的资源容量详情，按照资源类型展示资源核心数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityViewRequest 请求对象
     * @return ListCapacityViewResponse
     */
    public ListCapacityViewResponse listCapacityView(ListCapacityViewRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listCapacityView);
    }

    /**
     * 查询应用的容量数据
     *
     * 云运维中心支持查看应用、子应用、组件或分组下已关联的资源容量详情，按照资源类型展示资源核心数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCapacityViewRequest 请求对象
     * @return SyncInvoker<ListCapacityViewRequest, ListCapacityViewResponse>
     */
    public SyncInvoker<ListCapacityViewRequest, ListCapacityViewResponse> listCapacityViewInvoker(
        ListCapacityViewRequest request) {
        return new SyncInvoker<>(request, CocMeta.listCapacityView, hcClient);
    }

    /**
     * 查询分组关联的华为云资源
     *
     * 查询分组关联的华为云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRmsResourceRelationsRequest 请求对象
     * @return ListGroupRmsResourceRelationsResponse
     */
    public ListGroupRmsResourceRelationsResponse listGroupRmsResourceRelations(
        ListGroupRmsResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listGroupRmsResourceRelations);
    }

    /**
     * 查询分组关联的华为云资源
     *
     * 查询分组关联的华为云资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRmsResourceRelationsRequest 请求对象
     * @return SyncInvoker<ListGroupRmsResourceRelationsRequest, ListGroupRmsResourceRelationsResponse>
     */
    public SyncInvoker<ListGroupRmsResourceRelationsRequest, ListGroupRmsResourceRelationsResponse> listGroupRmsResourceRelationsInvoker(
        ListGroupRmsResourceRelationsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listGroupRmsResourceRelations, hcClient);
    }

    /**
     * 转移资源
     *
     * 转移资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRmsResourceRelationRequest 请求对象
     * @return UpdateGroupRmsResourceRelationResponse
     */
    public UpdateGroupRmsResourceRelationResponse updateGroupRmsResourceRelation(
        UpdateGroupRmsResourceRelationRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateGroupRmsResourceRelation);
    }

    /**
     * 转移资源
     *
     * 转移资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupRmsResourceRelationRequest 请求对象
     * @return SyncInvoker<UpdateGroupRmsResourceRelationRequest, UpdateGroupRmsResourceRelationResponse>
     */
    public SyncInvoker<UpdateGroupRmsResourceRelationRequest, UpdateGroupRmsResourceRelationResponse> updateGroupRmsResourceRelationInvoker(
        UpdateGroupRmsResourceRelationRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateGroupRmsResourceRelation, hcClient);
    }

    /**
     * 查询COC可授权单列表
     *
     * 查询COC可授权单列表（变更单号、事件单号、warroom和告警）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizableTicketsExternalRequest 请求对象
     * @return ListAuthorizableTicketsExternalResponse
     */
    public ListAuthorizableTicketsExternalResponse listAuthorizableTicketsExternal(
        ListAuthorizableTicketsExternalRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listAuthorizableTicketsExternal);
    }

    /**
     * 查询COC可授权单列表
     *
     * 查询COC可授权单列表（变更单号、事件单号、warroom和告警）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizableTicketsExternalRequest 请求对象
     * @return SyncInvoker<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse>
     */
    public SyncInvoker<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> listAuthorizableTicketsExternalInvoker(
        ListAuthorizableTicketsExternalRequest request) {
        return new SyncInvoker<>(request, CocMeta.listAuthorizableTicketsExternal, hcClient);
    }

    /**
     * 查询用户在云厂商的资源总数
     *
     * 查询用户在云厂商（阿里云、AWS、Azure和HCS）的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiCloudResourcesRequest 请求对象
     * @return CountMultiCloudResourcesResponse
     */
    public CountMultiCloudResourcesResponse countMultiCloudResources(CountMultiCloudResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.countMultiCloudResources);
    }

    /**
     * 查询用户在云厂商的资源总数
     *
     * 查询用户在云厂商（阿里云、AWS、Azure和HCS）的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiCloudResourcesRequest 请求对象
     * @return SyncInvoker<CountMultiCloudResourcesRequest, CountMultiCloudResourcesResponse>
     */
    public SyncInvoker<CountMultiCloudResourcesRequest, CountMultiCloudResourcesResponse> countMultiCloudResourcesInvoker(
        CountMultiCloudResourcesRequest request) {
        return new SyncInvoker<>(request, CocMeta.countMultiCloudResources, hcClient);
    }

    /**
     * 手动从云厂商同步用户资源
     *
     * 手动从云厂商同步用户资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudResourceRequest 请求对象
     * @return SyncMultiCloudResourceResponse
     */
    public SyncMultiCloudResourceResponse syncMultiCloudResource(SyncMultiCloudResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.syncMultiCloudResource);
    }

    /**
     * 手动从云厂商同步用户资源
     *
     * 手动从云厂商同步用户资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudResourceRequest 请求对象
     * @return SyncInvoker<SyncMultiCloudResourceRequest, SyncMultiCloudResourceResponse>
     */
    public SyncInvoker<SyncMultiCloudResourceRequest, SyncMultiCloudResourceResponse> syncMultiCloudResourceInvoker(
        SyncMultiCloudResourceRequest request) {
        return new SyncInvoker<>(request, CocMeta.syncMultiCloudResource, hcClient);
    }

    /**
     * 查询用户各种资源总数
     *
     * 查询用户各种资源总数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiResourcesRequest 请求对象
     * @return CountMultiResourcesResponse
     */
    public CountMultiResourcesResponse countMultiResources(CountMultiResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.countMultiResources);
    }

    /**
     * 查询用户各种资源总数
     *
     * 查询用户各种资源总数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountMultiResourcesRequest 请求对象
     * @return SyncInvoker<CountMultiResourcesRequest, CountMultiResourcesResponse>
     */
    public SyncInvoker<CountMultiResourcesRequest, CountMultiResourcesResponse> countMultiResourcesInvoker(
        CountMultiResourcesRequest request) {
        return new SyncInvoker<>(request, CocMeta.countMultiResources, hcClient);
    }

    /**
     * 查询用户资源总数
     *
     * 查询用户资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesRequest 请求对象
     * @return CountResourcesResponse
     */
    public CountResourcesResponse countResources(CountResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.countResources);
    }

    /**
     * 查询用户资源总数
     *
     * 查询用户资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesRequest 请求对象
     * @return SyncInvoker<CountResourcesRequest, CountResourcesResponse>
     */
    public SyncInvoker<CountResourcesRequest, CountResourcesResponse> countResourcesInvoker(
        CountResourcesRequest request) {
        return new SyncInvoker<>(request, CocMeta.countResources, hcClient);
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
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listResources);
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
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listResources, hcClient);
    }

    /**
     * 从RMS同步用户所有资源
     *
     * 从RMS同步用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceRequest 请求对象
     * @return SyncResourceResponse
     */
    public SyncResourceResponse syncResource(SyncResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.syncResource);
    }

    /**
     * 从RMS同步用户所有资源
     *
     * 从RMS同步用户所有资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceRequest 请求对象
     * @return SyncInvoker<SyncResourceRequest, SyncResourceResponse>
     */
    public SyncInvoker<SyncResourceRequest, SyncResourceResponse> syncResourceInvoker(SyncResourceRequest request) {
        return new SyncInvoker<>(request, CocMeta.syncResource, hcClient);
    }

    /**
     * 同步华为云资源Agent信息
     *
     * 同步华为云资源Agent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceAgentRequest 请求对象
     * @return SyncResourceAgentResponse
     */
    public SyncResourceAgentResponse syncResourceAgent(SyncResourceAgentRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.syncResourceAgent);
    }

    /**
     * 同步华为云资源Agent信息
     *
     * 同步华为云资源Agent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourceAgentRequest 请求对象
     * @return SyncInvoker<SyncResourceAgentRequest, SyncResourceAgentResponse>
     */
    public SyncInvoker<SyncResourceAgentRequest, SyncResourceAgentResponse> syncResourceAgentInvoker(
        SyncResourceAgentRequest request) {
        return new SyncInvoker<>(request, CocMeta.syncResourceAgent, hcClient);
    }

    /**
     * 查询资源标签列表
     *
     * 查询资源标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResourceTagsRequest 请求对象
     * @return ListScriptResourceTagsResponse
     */
    public ListScriptResourceTagsResponse listScriptResourceTags(ListScriptResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScriptResourceTags);
    }

    /**
     * 查询资源标签列表
     *
     * 查询资源标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptResourceTagsRequest 请求对象
     * @return SyncInvoker<ListScriptResourceTagsRequest, ListScriptResourceTagsResponse>
     */
    public SyncInvoker<ListScriptResourceTagsRequest, ListScriptResourceTagsResponse> listScriptResourceTagsInvoker(
        ListScriptResourceTagsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScriptResourceTags, hcClient);
    }

    /**
     * 更新资源标签
     *
     * 更新资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceTagsRequest 请求对象
     * @return UpdateResourceTagsResponse
     */
    public UpdateResourceTagsResponse updateResourceTags(UpdateResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateResourceTags);
    }

    /**
     * 更新资源标签
     *
     * 更新资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceTagsRequest 请求对象
     * @return SyncInvoker<UpdateResourceTagsRequest, UpdateResourceTagsResponse>
     */
    public SyncInvoker<UpdateResourceTagsRequest, UpdateResourceTagsResponse> updateResourceTagsInvoker(
        UpdateResourceTagsRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateResourceTags, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagsRequest 请求对象
     * @return CreateResourceTagsResponse
     */
    public CreateResourceTagsResponse createResourceTags(CreateResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createResourceTags);
    }

    /**
     * 添加资源标签
     *
     * 添加资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagsRequest 请求对象
     * @return SyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse>
     */
    public SyncInvoker<CreateResourceTagsRequest, CreateResourceTagsResponse> createResourceTagsInvoker(
        CreateResourceTagsRequest request) {
        return new SyncInvoker<>(request, CocMeta.createResourceTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listResourceTags, hcClient);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源总数
     *
     * 查询CMDB跨账号资源视图聚合的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesOfResourceViewRequest 请求对象
     * @return CountResourcesOfResourceViewResponse
     */
    public CountResourcesOfResourceViewResponse countResourcesOfResourceView(
        CountResourcesOfResourceViewRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.countResourcesOfResourceView);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源总数
     *
     * 查询CMDB跨账号资源视图聚合的资源总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesOfResourceViewRequest 请求对象
     * @return SyncInvoker<CountResourcesOfResourceViewRequest, CountResourcesOfResourceViewResponse>
     */
    public SyncInvoker<CountResourcesOfResourceViewRequest, CountResourcesOfResourceViewResponse> countResourcesOfResourceViewInvoker(
        CountResourcesOfResourceViewRequest request) {
        return new SyncInvoker<>(request, CocMeta.countResourcesOfResourceView, hcClient);
    }

    /**
     * 创建CMDB跨账号资源视图
     *
     * 创建CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceViewsRequest 请求对象
     * @return CreateResourceViewsResponse
     */
    public CreateResourceViewsResponse createResourceViews(CreateResourceViewsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createResourceViews);
    }

    /**
     * 创建CMDB跨账号资源视图
     *
     * 创建CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceViewsRequest 请求对象
     * @return SyncInvoker<CreateResourceViewsRequest, CreateResourceViewsResponse>
     */
    public SyncInvoker<CreateResourceViewsRequest, CreateResourceViewsResponse> createResourceViewsInvoker(
        CreateResourceViewsRequest request) {
        return new SyncInvoker<>(request, CocMeta.createResourceViews, hcClient);
    }

    /**
     * 删除CMDB的跨账号资源管理视图
     *
     * 删除CMDB的跨账号资源管理视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceViewsRequest 请求对象
     * @return DeleteResourceViewsResponse
     */
    public DeleteResourceViewsResponse deleteResourceViews(DeleteResourceViewsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteResourceViews);
    }

    /**
     * 删除CMDB的跨账号资源管理视图
     *
     * 删除CMDB的跨账号资源管理视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceViewsRequest 请求对象
     * @return SyncInvoker<DeleteResourceViewsRequest, DeleteResourceViewsResponse>
     */
    public SyncInvoker<DeleteResourceViewsRequest, DeleteResourceViewsResponse> deleteResourceViewsInvoker(
        DeleteResourceViewsRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteResourceViews, hcClient);
    }

    /**
     * 查询CMDB跨账号资源视图
     *
     * 查询CMDB跨账号资源视图。视图是一组筛选器，用户可以自由配置筛选范围，用于在跨账号场景下访问华为云中的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceViewsRequest 请求对象
     * @return ListResourceViewsResponse
     */
    public ListResourceViewsResponse listResourceViews(ListResourceViewsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listResourceViews);
    }

    /**
     * 查询CMDB跨账号资源视图
     *
     * 查询CMDB跨账号资源视图。视图是一组筛选器，用户可以自由配置筛选范围，用于在跨账号场景下访问华为云中的资源信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceViewsRequest 请求对象
     * @return SyncInvoker<ListResourceViewsRequest, ListResourceViewsResponse>
     */
    public SyncInvoker<ListResourceViewsRequest, ListResourceViewsResponse> listResourceViewsInvoker(
        ListResourceViewsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listResourceViews, hcClient);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源
     *
     * 查询CMDB跨账号资源视图聚合的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesOfResourceViewRequest 请求对象
     * @return ListResourcesOfResourceViewResponse
     */
    public ListResourcesOfResourceViewResponse listResourcesOfResourceView(ListResourcesOfResourceViewRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listResourcesOfResourceView);
    }

    /**
     * 查询CMDB跨账号资源视图聚合的资源
     *
     * 查询CMDB跨账号资源视图聚合的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesOfResourceViewRequest 请求对象
     * @return SyncInvoker<ListResourcesOfResourceViewRequest, ListResourcesOfResourceViewResponse>
     */
    public SyncInvoker<ListResourcesOfResourceViewRequest, ListResourcesOfResourceViewResponse> listResourcesOfResourceViewInvoker(
        ListResourcesOfResourceViewRequest request) {
        return new SyncInvoker<>(request, CocMeta.listResourcesOfResourceView, hcClient);
    }

    /**
     * 同步CMDB跨账号资源视图
     *
     * 同步CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourcesOfResourceViewRequest 请求对象
     * @return SyncResourcesOfResourceViewResponse
     */
    public SyncResourcesOfResourceViewResponse syncResourcesOfResourceView(SyncResourcesOfResourceViewRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.syncResourcesOfResourceView);
    }

    /**
     * 同步CMDB跨账号资源视图
     *
     * 同步CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncResourcesOfResourceViewRequest 请求对象
     * @return SyncInvoker<SyncResourcesOfResourceViewRequest, SyncResourcesOfResourceViewResponse>
     */
    public SyncInvoker<SyncResourcesOfResourceViewRequest, SyncResourcesOfResourceViewResponse> syncResourcesOfResourceViewInvoker(
        SyncResourcesOfResourceViewRequest request) {
        return new SyncInvoker<>(request, CocMeta.syncResourcesOfResourceView, hcClient);
    }

    /**
     * 更新CMDB跨账号资源视图
     *
     * 更新CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceViewsRequest 请求对象
     * @return UpdateResourceViewsResponse
     */
    public UpdateResourceViewsResponse updateResourceViews(UpdateResourceViewsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateResourceViews);
    }

    /**
     * 更新CMDB跨账号资源视图
     *
     * 更新CMDB跨账号资源视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceViewsRequest 请求对象
     * @return SyncInvoker<UpdateResourceViewsRequest, UpdateResourceViewsResponse>
     */
    public SyncInvoker<UpdateResourceViewsRequest, UpdateResourceViewsResponse> updateResourceViewsInvoker(
        UpdateResourceViewsRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateResourceViews, hcClient);
    }

    /**
     * 新建定时运维
     *
     * Create Scheduled Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTaskRequest 请求对象
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createScheduledTask);
    }

    /**
     * 新建定时运维
     *
     * Create Scheduled Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTaskRequest 请求对象
     * @return SyncInvoker<CreateScheduledTaskRequest, CreateScheduledTaskResponse>
     */
    public SyncInvoker<CreateScheduledTaskRequest, CreateScheduledTaskResponse> createScheduledTaskInvoker(
        CreateScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.createScheduledTask, hcClient);
    }

    /**
     * 删除ScheduledTask
     *
     * Delete scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteScheduledTask);
    }

    /**
     * 删除ScheduledTask
     *
     * Delete scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTaskRequest 请求对象
     * @return SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
     */
    public SyncInvoker<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTaskInvoker(
        DeleteScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteScheduledTask, hcClient);
    }

    /**
     * 禁用ScheduledTask
     *
     * Disable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableScheduledTaskRequest 请求对象
     * @return DisableScheduledTaskResponse
     */
    public DisableScheduledTaskResponse disableScheduledTask(DisableScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.disableScheduledTask);
    }

    /**
     * 禁用ScheduledTask
     *
     * Disable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableScheduledTaskRequest 请求对象
     * @return SyncInvoker<DisableScheduledTaskRequest, DisableScheduledTaskResponse>
     */
    public SyncInvoker<DisableScheduledTaskRequest, DisableScheduledTaskResponse> disableScheduledTaskInvoker(
        DisableScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.disableScheduledTask, hcClient);
    }

    /**
     * 启用ScheduledTask
     *
     * Enable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableScheduledTaskRequest 请求对象
     * @return EnableScheduledTaskResponse
     */
    public EnableScheduledTaskResponse enableScheduledTask(EnableScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.enableScheduledTask);
    }

    /**
     * 启用ScheduledTask
     *
     * Enable scheduled task by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableScheduledTaskRequest 请求对象
     * @return SyncInvoker<EnableScheduledTaskRequest, EnableScheduledTaskResponse>
     */
    public SyncInvoker<EnableScheduledTaskRequest, EnableScheduledTaskResponse> enableScheduledTaskInvoker(
        EnableScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.enableScheduledTask, hcClient);
    }

    /**
     * 查询ScheduledTask列表
     *
     * Get ScheduledTask infos
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskRequest 请求对象
     * @return ListScheduledTaskResponse
     */
    public ListScheduledTaskResponse listScheduledTask(ListScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScheduledTask);
    }

    /**
     * 查询ScheduledTask列表
     *
     * Get ScheduledTask infos
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskRequest 请求对象
     * @return SyncInvoker<ListScheduledTaskRequest, ListScheduledTaskResponse>
     */
    public SyncInvoker<ListScheduledTaskRequest, ListScheduledTaskResponse> listScheduledTaskInvoker(
        ListScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScheduledTask, hcClient);
    }

    /**
     * 查询定时运维历史记录
     *
     * get scheduled task history list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskHistoryRequest 请求对象
     * @return ListScheduledTaskHistoryResponse
     */
    public ListScheduledTaskHistoryResponse listScheduledTaskHistory(ListScheduledTaskHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScheduledTaskHistory);
    }

    /**
     * 查询定时运维历史记录
     *
     * get scheduled task history list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTaskHistoryRequest 请求对象
     * @return SyncInvoker<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse>
     */
    public SyncInvoker<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse> listScheduledTaskHistoryInvoker(
        ListScheduledTaskHistoryRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScheduledTaskHistory, hcClient);
    }

    /**
     * 查询ScheduledTask
     *
     * Get ScheduledTask info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTaskRequest 请求对象
     * @return ShowScheduledTaskResponse
     */
    public ShowScheduledTaskResponse showScheduledTask(ShowScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.showScheduledTask);
    }

    /**
     * 查询ScheduledTask
     *
     * Get ScheduledTask info by id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTaskRequest 请求对象
     * @return SyncInvoker<ShowScheduledTaskRequest, ShowScheduledTaskResponse>
     */
    public SyncInvoker<ShowScheduledTaskRequest, ShowScheduledTaskResponse> showScheduledTaskInvoker(
        ShowScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.showScheduledTask, hcClient);
    }

    /**
     * 修改ScheduledTask
     *
     * Update ScheduledTask
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return UpdateScheduledTaskResponse
     */
    public UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateScheduledTask);
    }

    /**
     * 修改ScheduledTask
     *
     * Update ScheduledTask
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTaskRequest 请求对象
     * @return SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
     */
    public SyncInvoker<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTaskInvoker(
        UpdateScheduledTaskRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateScheduledTask, hcClient);
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
     * @return GetScriptJobBatchResponse
     */
    public GetScriptJobBatchResponse getScriptJobBatch(GetScriptJobBatchRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScriptJobBatch);
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
     * @return SyncInvoker<GetScriptJobBatchRequest, GetScriptJobBatchResponse>
     */
    public SyncInvoker<GetScriptJobBatchRequest, GetScriptJobBatchResponse> getScriptJobBatchInvoker(
        GetScriptJobBatchRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScriptJobBatch, hcClient);
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
     * @return GetScriptJobInfoResponse
     */
    public GetScriptJobInfoResponse getScriptJobInfo(GetScriptJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScriptJobInfo);
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
     * @return SyncInvoker<GetScriptJobInfoRequest, GetScriptJobInfoResponse>
     */
    public SyncInvoker<GetScriptJobInfoRequest, GetScriptJobInfoResponse> getScriptJobInfoInvoker(
        GetScriptJobInfoRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScriptJobInfo, hcClient);
    }

    /**
     * 展示实例状态统计信息
     *
     * 查询：实例状态统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobStatisticsRequest 请求对象
     * @return GetScriptJobStatisticsResponse
     */
    public GetScriptJobStatisticsResponse getScriptJobStatistics(GetScriptJobStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScriptJobStatistics);
    }

    /**
     * 展示实例状态统计信息
     *
     * 查询：实例状态统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetScriptJobStatisticsRequest 请求对象
     * @return SyncInvoker<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse>
     */
    public SyncInvoker<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> getScriptJobStatisticsInvoker(
        GetScriptJobStatisticsRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScriptJobStatistics, hcClient);
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
     * @return ListScriptJobBatchesResponse
     */
    public ListScriptJobBatchesResponse listScriptJobBatches(ListScriptJobBatchesRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScriptJobBatches);
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
     * @return SyncInvoker<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse>
     */
    public SyncInvoker<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> listScriptJobBatchesInvoker(
        ListScriptJobBatchesRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScriptJobBatches, hcClient);
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
     * @return ListScriptJobsResponse
     */
    public ListScriptJobsResponse listScriptJobs(ListScriptJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScriptJobs);
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
     * @return SyncInvoker<ListScriptJobsRequest, ListScriptJobsResponse>
     */
    public SyncInvoker<ListScriptJobsRequest, ListScriptJobsResponse> listScriptJobsInvoker(
        ListScriptJobsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScriptJobs, hcClient);
    }

    /**
     * 操作脚本工单
     *
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateScriptJobRequest 请求对象
     * @return OperateScriptJobResponse
     */
    public OperateScriptJobResponse operateScriptJob(OperateScriptJobRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.operateScriptJob);
    }

    /**
     * 操作脚本工单
     *
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateScriptJobRequest 请求对象
     * @return SyncInvoker<OperateScriptJobRequest, OperateScriptJobResponse>
     */
    public SyncInvoker<OperateScriptJobRequest, OperateScriptJobResponse> operateScriptJobInvoker(
        OperateScriptJobRequest request) {
        return new SyncInvoker<>(request, CocMeta.operateScriptJob, hcClient);
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
     * @return AcceptScriptResponse
     */
    public AcceptScriptResponse acceptScript(AcceptScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.acceptScript);
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
     * @return SyncInvoker<AcceptScriptRequest, AcceptScriptResponse>
     */
    public SyncInvoker<AcceptScriptRequest, AcceptScriptResponse> acceptScriptInvoker(AcceptScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.acceptScript, hcClient);
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
     * @return CheckScriptRiskResponse
     */
    public CheckScriptRiskResponse checkScriptRisk(CheckScriptRiskRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.checkScriptRisk);
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
     * @return SyncInvoker<CheckScriptRiskRequest, CheckScriptRiskResponse>
     */
    public SyncInvoker<CheckScriptRiskRequest, CheckScriptRiskResponse> checkScriptRiskInvoker(
        CheckScriptRiskRequest request) {
        return new SyncInvoker<>(request, CocMeta.checkScriptRisk, hcClient);
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
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createScript);
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
     * @return SyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public SyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptInvoker(CreateScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.createScript, hcClient);
    }

    /**
     * 删除自定义脚本
     *
     * 删除作业脚本：自定义脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteScript);
    }

    /**
     * 删除自定义脚本
     *
     * 删除作业脚本：自定义脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public SyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptInvoker(DeleteScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteScript, hcClient);
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
     * @return ExecuteScriptResponse
     */
    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.executeScript);
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
     * @return SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse>
     */
    public SyncInvoker<ExecuteScriptRequest, ExecuteScriptResponse> executeScriptInvoker(ExecuteScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.executeScript, hcClient);
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
     * @return GetScriptResponse
     */
    public GetScriptResponse getScript(GetScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getScript);
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
     * @return SyncInvoker<GetScriptRequest, GetScriptResponse>
     */
    public SyncInvoker<GetScriptRequest, GetScriptResponse> getScriptInvoker(GetScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.getScript, hcClient);
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
     * @return ListInstancesBatchResponse
     */
    public ListInstancesBatchResponse listInstancesBatch(ListInstancesBatchRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listInstancesBatch);
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
     * @return SyncInvoker<ListInstancesBatchRequest, ListInstancesBatchResponse>
     */
    public SyncInvoker<ListInstancesBatchRequest, ListInstancesBatchResponse> listInstancesBatchInvoker(
        ListInstancesBatchRequest request) {
        return new SyncInvoker<>(request, CocMeta.listInstancesBatch, hcClient);
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
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listScripts);
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
     * @return SyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public SyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsInvoker(ListScriptsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listScripts, hcClient);
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
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateScript);
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
     * @return SyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public SyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptInvoker(UpdateScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateScript, hcClient);
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
     * @return ExecutePublicScriptResponse
     */
    public ExecutePublicScriptResponse executePublicScript(ExecutePublicScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.executePublicScript);
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
     * @return SyncInvoker<ExecutePublicScriptRequest, ExecutePublicScriptResponse>
     */
    public SyncInvoker<ExecutePublicScriptRequest, ExecutePublicScriptResponse> executePublicScriptInvoker(
        ExecutePublicScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.executePublicScript, hcClient);
    }

    /**
     * 展示公共脚本详情
     *
     * 展示公共脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPublicScriptRequest 请求对象
     * @return GetPublicScriptResponse
     */
    public GetPublicScriptResponse getPublicScript(GetPublicScriptRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.getPublicScript);
    }

    /**
     * 展示公共脚本详情
     *
     * 展示公共脚本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPublicScriptRequest 请求对象
     * @return SyncInvoker<GetPublicScriptRequest, GetPublicScriptResponse>
     */
    public SyncInvoker<GetPublicScriptRequest, GetPublicScriptResponse> getPublicScriptInvoker(
        GetPublicScriptRequest request) {
        return new SyncInvoker<>(request, CocMeta.getPublicScript, hcClient);
    }

    /**
     * 获取公共脚本列表
     *
     * 获取公共脚本列表，分页逻辑：采用limit+marker方式，提高分页效率。用自增id作为marker参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicScriptsRequest 请求对象
     * @return ListPublicScriptsResponse
     */
    public ListPublicScriptsResponse listPublicScripts(ListPublicScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listPublicScripts);
    }

    /**
     * 获取公共脚本列表
     *
     * 获取公共脚本列表，分页逻辑：采用limit+marker方式，提高分页效率。用自增id作为marker参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicScriptsRequest 请求对象
     * @return SyncInvoker<ListPublicScriptsRequest, ListPublicScriptsResponse>
     */
    public SyncInvoker<ListPublicScriptsRequest, ListPublicScriptsResponse> listPublicScriptsInvoker(
        ListPublicScriptsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listPublicScripts, hcClient);
    }

    /**
     * 创建云厂商账号
     *
     * 创建云厂商（阿里云、AWS、Azure和HCS等）账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVendorAccountRequest 请求对象
     * @return CreateVendorAccountResponse
     */
    public CreateVendorAccountResponse createVendorAccount(CreateVendorAccountRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createVendorAccount);
    }

    /**
     * 创建云厂商账号
     *
     * 创建云厂商（阿里云、AWS、Azure和HCS等）账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVendorAccountRequest 请求对象
     * @return SyncInvoker<CreateVendorAccountRequest, CreateVendorAccountResponse>
     */
    public SyncInvoker<CreateVendorAccountRequest, CreateVendorAccountResponse> createVendorAccountInvoker(
        CreateVendorAccountRequest request) {
        return new SyncInvoker<>(request, CocMeta.createVendorAccount, hcClient);
    }

    /**
     * 删除云厂商账号
     *
     * 增加云广商账号，不需要后，可删除云厂商账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVendorAccountRequest 请求对象
     * @return DeleteVendorAccountResponse
     */
    public DeleteVendorAccountResponse deleteVendorAccount(DeleteVendorAccountRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.deleteVendorAccount);
    }

    /**
     * 删除云厂商账号
     *
     * 增加云广商账号，不需要后，可删除云厂商账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVendorAccountRequest 请求对象
     * @return SyncInvoker<DeleteVendorAccountRequest, DeleteVendorAccountResponse>
     */
    public SyncInvoker<DeleteVendorAccountRequest, DeleteVendorAccountResponse> deleteVendorAccountInvoker(
        DeleteVendorAccountRequest request) {
        return new SyncInvoker<>(request, CocMeta.deleteVendorAccount, hcClient);
    }

    /**
     * 查询云厂商账号
     *
     * 查询所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorAccountRequest 请求对象
     * @return ListVendorAccountResponse
     */
    public ListVendorAccountResponse listVendorAccount(ListVendorAccountRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listVendorAccount);
    }

    /**
     * 查询云厂商账号
     *
     * 查询所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVendorAccountRequest 请求对象
     * @return SyncInvoker<ListVendorAccountRequest, ListVendorAccountResponse>
     */
    public SyncInvoker<ListVendorAccountRequest, ListVendorAccountResponse> listVendorAccountInvoker(
        ListVendorAccountRequest request) {
        return new SyncInvoker<>(request, CocMeta.listVendorAccount, hcClient);
    }

    /**
     * 修改云厂商账号
     *
     * 修改所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorAccountRequest 请求对象
     * @return UpdateVendorAccountResponse
     */
    public UpdateVendorAccountResponse updateVendorAccount(UpdateVendorAccountRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.updateVendorAccount);
    }

    /**
     * 修改云厂商账号
     *
     * 修改所有云厂商（阿里云、AWS、Azure和HCS等）账号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVendorAccountRequest 请求对象
     * @return SyncInvoker<UpdateVendorAccountRequest, UpdateVendorAccountResponse>
     */
    public SyncInvoker<UpdateVendorAccountRequest, UpdateVendorAccountResponse> updateVendorAccountInvoker(
        UpdateVendorAccountRequest request) {
        return new SyncInvoker<>(request, CocMeta.updateVendorAccount, hcClient);
    }

    /**
     * 创建租户区WarRoom
     *
     * 创建租户区WarRoom
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarRoomRequest 请求对象
     * @return CreateWarRoomResponse
     */
    public CreateWarRoomResponse createWarRoom(CreateWarRoomRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.createWarRoom);
    }

    /**
     * 创建租户区WarRoom
     *
     * 创建租户区WarRoom
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarRoomRequest 请求对象
     * @return SyncInvoker<CreateWarRoomRequest, CreateWarRoomResponse>
     */
    public SyncInvoker<CreateWarRoomRequest, CreateWarRoomResponse> createWarRoomInvoker(CreateWarRoomRequest request) {
        return new SyncInvoker<>(request, CocMeta.createWarRoom, hcClient);
    }

    /**
     * 查询租户区WarRoom信息列表
     *
     * 查询租户区WarRoom信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarRoomsRequest 请求对象
     * @return ListWarRoomsResponse
     */
    public ListWarRoomsResponse listWarRooms(ListWarRoomsRequest request) {
        return hcClient.syncInvokeHttp(request, CocMeta.listWarRooms);
    }

    /**
     * 查询租户区WarRoom信息列表
     *
     * 查询租户区WarRoom信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarRoomsRequest 请求对象
     * @return SyncInvoker<ListWarRoomsRequest, ListWarRoomsResponse>
     */
    public SyncInvoker<ListWarRoomsRequest, ListWarRoomsResponse> listWarRoomsInvoker(ListWarRoomsRequest request) {
        return new SyncInvoker<>(request, CocMeta.listWarRooms, hcClient);
    }

}

package com.huaweicloud.sdk.coc.v1;

import com.huaweicloud.sdk.coc.v1.model.AcceptScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.AcceptScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.AddScriptModel;
import com.huaweicloud.sdk.coc.v1.model.AlarmToIncidentRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ApprovalJobScriptModel;
import com.huaweicloud.sdk.coc.v1.model.AutoHandlerAlarmRequestBody;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewRequest;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewRequestBody;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewResponse;
import com.huaweicloud.sdk.coc.v1.model.CancelDiagnosisTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CancelDiagnosisTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CheckScriptRiskRequest;
import com.huaweicloud.sdk.coc.v1.model.CheckScriptRiskResponse;
import com.huaweicloud.sdk.coc.v1.model.ClearAlarmRequest;
import com.huaweicloud.sdk.coc.v1.model.ClearAlarmRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ClearAlarmResponse;
import com.huaweicloud.sdk.coc.v1.model.CocUpdateChangeRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CocUpdateChangeRequestBodyV2;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateAttachmentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateAttachmentRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CreateAttachmentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocTicketRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateDocumentRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CreateDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalCocAttachmentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalCocAttachmentRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalCocAttachmentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalIssuesRequest;
import com.huaweicloud.sdk.coc.v1.model.CreatePasswordChangePlanRequest;
import com.huaweicloud.sdk.coc.v1.model.CreatePasswordChangePlanRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CreatePasswordChangePlanResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateTicketRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateTicketResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteTicketInfoRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteTicketInfoResponse;
import com.huaweicloud.sdk.coc.v1.model.DiagnosisTaskSubmitBody;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.DisableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.DownloadAttachmentRequest;
import com.huaweicloud.sdk.coc.v1.model.DownloadAttachmentResponse;
import com.huaweicloud.sdk.coc.v1.model.EditScriptModel;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskRequestBody;
import com.huaweicloud.sdk.coc.v1.model.EnableScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteActionParams;
import com.huaweicloud.sdk.coc.v1.model.ExecuteActionParamsV2;
import com.huaweicloud.sdk.coc.v1.model.ExecuteDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteDocumentRequsetBody;
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
import com.huaweicloud.sdk.coc.v1.model.HandleAlarmRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleAlarmResponse;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.HandleExternalIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.InstancesBatchesMode;
import com.huaweicloud.sdk.coc.v1.model.JobScriptAnalyzeRequest;
import com.huaweicloud.sdk.coc.v1.model.JobScriptOrderOperationBody;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAlarmHandleHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsReq;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListDiagnosisTasksRequest;
import com.huaweicloud.sdk.coc.v1.model.ListDiagnosisTasksResponse;
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
import com.huaweicloud.sdk.coc.v1.model.ListSubTicketsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListSubTicketsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListTenantWarRoomRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ListTicketOperationHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListTicketOperationHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListTicketParams;
import com.huaweicloud.sdk.coc.v1.model.ListTicketParamsV2;
import com.huaweicloud.sdk.coc.v1.model.ListTicketParamsWithPage;
import com.huaweicloud.sdk.coc.v1.model.ListTicketParamsWithPageV2;
import com.huaweicloud.sdk.coc.v1.model.ListTicketsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListTicketsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateExecutionRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateExecutionRequestBody;
import com.huaweicloud.sdk.coc.v1.model.OperateExecutionResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobResponse;
import com.huaweicloud.sdk.coc.v1.model.ReportCustomEventRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ResetAccountPasswordRequest;
import com.huaweicloud.sdk.coc.v1.model.ResetAccountPasswordRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ResetAccountPasswordResponse;
import com.huaweicloud.sdk.coc.v1.model.RetryDiagnosisTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.RetryDiagnosisTaskRequestBody;
import com.huaweicloud.sdk.coc.v1.model.RetryDiagnosisTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.ScheduledTaskRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ScriptExecuteModel;
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
import com.huaweicloud.sdk.coc.v1.model.SyncResourceReq;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.TransferAlarmToIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.TransferAlarmToIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateAccountPasswordRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateAccountPasswordRequestBody;
import com.huaweicloud.sdk.coc.v1.model.UpdateAccountPasswordResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateChangeRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateChangeResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateDocumentRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateDocumentResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceTagsRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceTagsRequestBody;
import com.huaweicloud.sdk.coc.v1.model.UpdateResourceTagsResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateRunbookRequestBody;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScheduledTaskResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateTicketRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateTicketResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class CocMeta {

    public static final HttpRequestDef<CreatePasswordChangePlanRequest, CreatePasswordChangePlanResponse> createPasswordChangePlan =
        genForCreatePasswordChangePlan();

    private static HttpRequestDef<CreatePasswordChangePlanRequest, CreatePasswordChangePlanResponse> genForCreatePasswordChangePlan() {
        // basic
        HttpRequestDef.Builder<CreatePasswordChangePlanRequest, CreatePasswordChangePlanResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePasswordChangePlanRequest.class, CreatePasswordChangePlanResponse.class)
                .withName("CreatePasswordChangePlan")
                .withUri("/v1/account-mgmt/accounts/password-change-plan")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePasswordChangePlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePasswordChangePlanRequestBody.class),
            f -> f.withMarshaller(CreatePasswordChangePlanRequest::getBody, CreatePasswordChangePlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetAccountPasswordRequest, ResetAccountPasswordResponse> resetAccountPassword =
        genForResetAccountPassword();

    private static HttpRequestDef<ResetAccountPasswordRequest, ResetAccountPasswordResponse> genForResetAccountPassword() {
        // basic
        HttpRequestDef.Builder<ResetAccountPasswordRequest, ResetAccountPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetAccountPasswordRequest.class, ResetAccountPasswordResponse.class)
            .withName("ResetAccountPassword")
            .withUri("/v1/account-mgmt/accounts/password/reset")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ResetAccountPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetAccountPasswordRequestBody.class),
            f -> f.withMarshaller(ResetAccountPasswordRequest::getBody, ResetAccountPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccountPasswordRequest, UpdateAccountPasswordResponse> updateAccountPassword =
        genForUpdateAccountPassword();

    private static HttpRequestDef<UpdateAccountPasswordRequest, UpdateAccountPasswordResponse> genForUpdateAccountPassword() {
        // basic
        HttpRequestDef.Builder<UpdateAccountPasswordRequest, UpdateAccountPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateAccountPasswordRequest.class, UpdateAccountPasswordResponse.class)
            .withName("UpdateAccountPassword")
            .withUri("/v1/account-mgmt/accounts/password/update")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateAccountPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAccountPasswordRequestBody.class),
            f -> f.withMarshaller(UpdateAccountPasswordRequest::getBody, UpdateAccountPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ClearAlarmRequest, ClearAlarmResponse> clearAlarm = genForClearAlarm();

    private static HttpRequestDef<ClearAlarmRequest, ClearAlarmResponse> genForClearAlarm() {
        // basic
        HttpRequestDef.Builder<ClearAlarmRequest, ClearAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ClearAlarmRequest.class, ClearAlarmResponse.class)
                .withName("ClearAlarm")
                .withUri("/v1/alarm-mgmt/alarms/cancel")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ClearAlarmRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ClearAlarmRequestBody.class),
            f -> f.withMarshaller(ClearAlarmRequest::getBody, ClearAlarmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleAlarmRequest, HandleAlarmResponse> handleAlarm = genForHandleAlarm();

    private static HttpRequestDef<HandleAlarmRequest, HandleAlarmResponse> genForHandleAlarm() {
        // basic
        HttpRequestDef.Builder<HandleAlarmRequest, HandleAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HandleAlarmRequest.class, HandleAlarmResponse.class)
                .withName("HandleAlarm")
                .withUri("/v1/alarm-mgmt/alarm/{alarm_id}/auto-process")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandleAlarmRequest::getAlarmId, HandleAlarmRequest::setAlarmId));
        builder.<AutoHandlerAlarmRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoHandlerAlarmRequestBody.class),
            f -> f.withMarshaller(HandleAlarmRequest::getBody, HandleAlarmRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(HandleAlarmResponse::getBody, HandleAlarmResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse> listAlarmHandleHistories =
        genForListAlarmHandleHistories();

    private static HttpRequestDef<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse> genForListAlarmHandleHistories() {
        // basic
        HttpRequestDef.Builder<ListAlarmHandleHistoriesRequest, ListAlarmHandleHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAlarmHandleHistoriesRequest.class, ListAlarmHandleHistoriesResponse.class)
                .withName("ListAlarmHandleHistories")
                .withUri("/v1/alarm-mgmt/alarm/{alarm_id}/handle-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHandleHistoriesRequest::getAlarmId,
                ListAlarmHandleHistoriesRequest::setAlarmId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHandleHistoriesRequest::getOffset,
                ListAlarmHandleHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHandleHistoriesRequest::getLimit,
                ListAlarmHandleHistoriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> showAlarm = genForShowAlarm();

    private static HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> genForShowAlarm() {
        // basic
        HttpRequestDef.Builder<ShowAlarmRequest, ShowAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmRequest.class, ShowAlarmResponse.class)
                .withName("ShowAlarm")
                .withUri("/v1/alarm-mgmt/alarm/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmRequest::getAlarmId, ShowAlarmRequest::setAlarmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransferAlarmToIncidentRequest, TransferAlarmToIncidentResponse> transferAlarmToIncident =
        genForTransferAlarmToIncident();

    private static HttpRequestDef<TransferAlarmToIncidentRequest, TransferAlarmToIncidentResponse> genForTransferAlarmToIncident() {
        // basic
        HttpRequestDef.Builder<TransferAlarmToIncidentRequest, TransferAlarmToIncidentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, TransferAlarmToIncidentRequest.class, TransferAlarmToIncidentResponse.class)
            .withName("TransferAlarmToIncident")
            .withUri("/v1/alarm-mgmt/alarms-linked-incident")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AlarmToIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AlarmToIncidentRequestBody.class),
            f -> f.withMarshaller(TransferAlarmToIncidentRequest::getBody, TransferAlarmToIncidentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> batchCreateApplicationView =
        genForBatchCreateApplicationView();

    private static HttpRequestDef<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> genForBatchCreateApplicationView() {
        // basic
        HttpRequestDef.Builder<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateApplicationViewRequest.class,
                    BatchCreateApplicationViewResponse.class)
                .withName("BatchCreateApplicationView")
                .withUri("/v1/application-view/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchCreateApplicationViewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateApplicationViewRequestBody.class),
            f -> f.withMarshaller(BatchCreateApplicationViewRequest::getBody,
                BatchCreateApplicationViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateChangeRequest, UpdateChangeResponse> updateChange = genForUpdateChange();

    private static HttpRequestDef<UpdateChangeRequest, UpdateChangeResponse> genForUpdateChange() {
        // basic
        HttpRequestDef.Builder<UpdateChangeRequest, UpdateChangeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateChangeRequest.class, UpdateChangeResponse.class)
                .withName("UpdateChange")
                .withUri("/v2/changes/{change_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("change_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateChangeRequest::getChangeId, UpdateChangeRequest::setChangeId));
        builder.<CocUpdateChangeRequestBodyV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CocUpdateChangeRequestBodyV2.class),
            f -> f.withMarshaller(UpdateChangeRequest::getBody, UpdateChangeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleIncidentRequest, HandleIncidentResponse> handleIncident =
        genForHandleIncident();

    private static HttpRequestDef<HandleIncidentRequest, HandleIncidentResponse> genForHandleIncident() {
        // basic
        HttpRequestDef.Builder<HandleIncidentRequest, HandleIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HandleIncidentRequest.class, HandleIncidentResponse.class)
                .withName("HandleIncident")
                .withUri("/v2/incidents/{incident_id}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandleIncidentRequest::getIncidentId, HandleIncidentRequest::setIncidentId));
        builder.<ExecuteActionParamsV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteActionParamsV2.class),
            f -> f.withMarshaller(HandleIncidentRequest::getBody, HandleIncidentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIncidentsRequest, ListIncidentsResponse> listIncidents =
        genForListIncidents();

    private static HttpRequestDef<ListIncidentsRequest, ListIncidentsResponse> genForListIncidents() {
        // basic
        HttpRequestDef.Builder<ListIncidentsRequest, ListIncidentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIncidentsRequest.class, ListIncidentsResponse.class)
                .withName("ListIncidents")
                .withUri("/v2/incidents/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListTicketParamsWithPageV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTicketParamsWithPageV2.class),
            f -> f.withMarshaller(ListIncidentsRequest::getBody, ListIncidentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIncidentsHistoriesRequest, ListIncidentsHistoriesResponse> listIncidentsHistories =
        genForListIncidentsHistories();

    private static HttpRequestDef<ListIncidentsHistoriesRequest, ListIncidentsHistoriesResponse> genForListIncidentsHistories() {
        // basic
        HttpRequestDef.Builder<ListIncidentsHistoriesRequest, ListIncidentsHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListIncidentsHistoriesRequest.class, ListIncidentsHistoriesResponse.class)
            .withName("ListIncidentsHistories")
            .withUri("/v2/incidents/{incident_id}/histories")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentsHistoriesRequest::getIncidentId,
                ListIncidentsHistoriesRequest::setIncidentId));
        builder.<ListTicketParamsV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTicketParamsV2.class),
            f -> f.withMarshaller(ListIncidentsHistoriesRequest::getBody, ListIncidentsHistoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIncidentTaskRequest, ShowIncidentTaskResponse> showIncidentTask =
        genForShowIncidentTask();

    private static HttpRequestDef<ShowIncidentTaskRequest, ShowIncidentTaskResponse> genForShowIncidentTask() {
        // basic
        HttpRequestDef.Builder<ShowIncidentTaskRequest, ShowIncidentTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIncidentTaskRequest.class, ShowIncidentTaskResponse.class)
                .withName("ShowIncidentTask")
                .withUri("/v2/incidents/{incident_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncidentTaskRequest::getIncidentId, ShowIncidentTaskRequest::setIncidentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceCompliantRequest, ListInstanceCompliantResponse> listInstanceCompliant =
        genForListInstanceCompliant();

    private static HttpRequestDef<ListInstanceCompliantRequest, ListInstanceCompliantResponse> genForListInstanceCompliant() {
        // basic
        HttpRequestDef.Builder<ListInstanceCompliantRequest, ListInstanceCompliantResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceCompliantRequest.class, ListInstanceCompliantResponse.class)
            .withName("ListInstanceCompliant")
            .withUri("/v1/patch/instance/compliant")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getEnterpriseProjectId,
                ListInstanceCompliantRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getName, ListInstanceCompliantRequest::setName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getInstanceId,
                ListInstanceCompliantRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getIp, ListInstanceCompliantRequest::setIp));
        builder.<String>withRequestField("eip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getEip, ListInstanceCompliantRequest::setEip));
        builder.<String>withRequestField("operating_system",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getOperatingSystem,
                ListInstanceCompliantRequest::setOperatingSystem));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getRegion, ListInstanceCompliantRequest::setRegion));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getGroup, ListInstanceCompliantRequest::setGroup));
        builder.<String>withRequestField("compliant_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getCompliantStatus,
                ListInstanceCompliantRequest::setCompliantStatus));
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getOrderId, ListInstanceCompliantRequest::setOrderId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getOffset, ListInstanceCompliantRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getLimit, ListInstanceCompliantRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getSortDir, ListInstanceCompliantRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getSortKey, ListInstanceCompliantRequest::setSortKey));
        builder.<String>withRequestField("report_scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getReportScene,
                ListInstanceCompliantRequest::setReportScene));
        builder.<String>withRequestField("cce_info_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getCceInfoId,
                ListInstanceCompliantRequest::setCceInfoId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> showInstancePatchItems =
        genForShowInstancePatchItems();

    private static HttpRequestDef<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> genForShowInstancePatchItems() {
        // basic
        HttpRequestDef.Builder<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstancePatchItemsRequest.class, ShowInstancePatchItemsResponse.class)
            .withName("ShowInstancePatchItems")
            .withUri("/v1/patch/instance/compliant/{instance_compliant_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_compliant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getInstanceCompliantId,
                ShowInstancePatchItemsRequest::setInstanceCompliantId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getOffset, ShowInstancePatchItemsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getLimit, ShowInstancePatchItemsRequest::setLimit));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getTitle, ShowInstancePatchItemsRequest::setTitle));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getSortDir,
                ShowInstancePatchItemsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getSortKey,
                ShowInstancePatchItemsRequest::setSortKey));
        builder.<String>withRequestField("patch_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getPatchStatus,
                ShowInstancePatchItemsRequest::setPatchStatus));
        builder.<String>withRequestField("classification",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getClassification,
                ShowInstancePatchItemsRequest::setClassification));
        builder.<String>withRequestField("severity_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getSeverityLevel,
                ShowInstancePatchItemsRequest::setSeverityLevel));
        builder.<String>withRequestField("compliance_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getComplianceLevel,
                ShowInstancePatchItemsRequest::setComplianceLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReportCustomEventRequest, CreateReportCustomEventResponse> createReportCustomEvent =
        genForCreateReportCustomEvent();

    private static HttpRequestDef<CreateReportCustomEventRequest, CreateReportCustomEventResponse> genForCreateReportCustomEvent() {
        // basic
        HttpRequestDef.Builder<CreateReportCustomEventRequest, CreateReportCustomEventResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateReportCustomEventRequest.class, CreateReportCustomEventResponse.class)
            .withName("CreateReportCustomEvent")
            .withUri("/v1/event/huawei/custom/{integration_key}")
            .withContentType("application/json; charset=utf-8");

        // requests
        builder.<String>withRequestField("integration_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportCustomEventRequest::getIntegrationKey,
                CreateReportCustomEventRequest::setIntegrationKey));
        builder.<ReportCustomEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReportCustomEventRequestBody.class),
            f -> f.withMarshaller(CreateReportCustomEventRequest::getBody, CreateReportCustomEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelDiagnosisTaskRequest, CancelDiagnosisTaskResponse> cancelDiagnosisTask =
        genForCancelDiagnosisTask();

    private static HttpRequestDef<CancelDiagnosisTaskRequest, CancelDiagnosisTaskResponse> genForCancelDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<CancelDiagnosisTaskRequest, CancelDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelDiagnosisTaskRequest.class, CancelDiagnosisTaskResponse.class)
                .withName("CancelDiagnosisTask")
                .withUri("/v1/diagnosis/tasks/{task_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDiagnosisTaskRequest::getTaskId, CancelDiagnosisTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTask =
        genForCreateDiagnosisTask();

    private static HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> genForCreateDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDiagnosisTaskRequest.class, CreateDiagnosisTaskResponse.class)
                .withName("CreateDiagnosisTask")
                .withUri("/v1/diagnosis/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DiagnosisTaskSubmitBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DiagnosisTaskSubmitBody.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getBody, CreateDiagnosisTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasks =
        genForListDiagnosisTasks();

    private static HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> genForListDiagnosisTasks() {
        // basic
        HttpRequestDef.Builder<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDiagnosisTasksRequest.class, ListDiagnosisTasksResponse.class)
                .withName("ListDiagnosisTasks")
                .withUri("/v1/diagnosis/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getTaskId, ListDiagnosisTasksRequest::setTaskId));
        builder.<ListDiagnosisTasksRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDiagnosisTasksRequest.TypeEnum.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getType, ListDiagnosisTasksRequest::setType));
        builder.<ListDiagnosisTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDiagnosisTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getStatus, ListDiagnosisTasksRequest::setStatus));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getRegion, ListDiagnosisTasksRequest::setRegion));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getCreator, ListDiagnosisTasksRequest::setCreator));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getStartTime, ListDiagnosisTasksRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getEndTime, ListDiagnosisTasksRequest::setEndTime));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getPageIndex, ListDiagnosisTasksRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getPageSize, ListDiagnosisTasksRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryDiagnosisTaskRequest, RetryDiagnosisTaskResponse> retryDiagnosisTask =
        genForRetryDiagnosisTask();

    private static HttpRequestDef<RetryDiagnosisTaskRequest, RetryDiagnosisTaskResponse> genForRetryDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<RetryDiagnosisTaskRequest, RetryDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryDiagnosisTaskRequest.class, RetryDiagnosisTaskResponse.class)
                .withName("RetryDiagnosisTask")
                .withUri("/v1/diagnosis/tasks/{task_id}/retry")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryDiagnosisTaskRequest::getTaskId, RetryDiagnosisTaskRequest::setTaskId));
        builder.<RetryDiagnosisTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetryDiagnosisTaskRequestBody.class),
            f -> f.withMarshaller(RetryDiagnosisTaskRequest::getBody, RetryDiagnosisTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisNodeRequest, ShowDiagnosisNodeResponse> showDiagnosisNode =
        genForShowDiagnosisNode();

    private static HttpRequestDef<ShowDiagnosisNodeRequest, ShowDiagnosisNodeResponse> genForShowDiagnosisNode() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisNodeRequest, ShowDiagnosisNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiagnosisNodeRequest.class, ShowDiagnosisNodeResponse.class)
                .withName("ShowDiagnosisNode")
                .withUri("/v1/diagnosis/tasks/{task_id}/node/{code}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisNodeRequest::getTaskId, ShowDiagnosisNodeRequest::setTaskId));
        builder.<ShowDiagnosisNodeRequest.CodeEnum>withRequestField("code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDiagnosisNodeRequest.CodeEnum.class),
            f -> f.withMarshaller(ShowDiagnosisNodeRequest::getCode, ShowDiagnosisNodeRequest::setCode));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisNodeRequest::getInstanceId, ShowDiagnosisNodeRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisSummaryRequest, ShowDiagnosisSummaryResponse> showDiagnosisSummary =
        genForShowDiagnosisSummary();

    private static HttpRequestDef<ShowDiagnosisSummaryRequest, ShowDiagnosisSummaryResponse> genForShowDiagnosisSummary() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisSummaryRequest, ShowDiagnosisSummaryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDiagnosisSummaryRequest.class, ShowDiagnosisSummaryResponse.class)
            .withName("ShowDiagnosisSummary")
            .withUri("/v1/diagnosis/tasks/{task_id}/summary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisSummaryRequest::getTaskId, ShowDiagnosisSummaryRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisTaskRequest, ShowDiagnosisTaskResponse> showDiagnosisTask =
        genForShowDiagnosisTask();

    private static HttpRequestDef<ShowDiagnosisTaskRequest, ShowDiagnosisTaskResponse> genForShowDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisTaskRequest, ShowDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiagnosisTaskRequest.class, ShowDiagnosisTaskResponse.class)
                .withName("ShowDiagnosisTask")
                .withUri("/v1/diagnosis/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisTaskRequest::getTaskId, ShowDiagnosisTaskRequest::setTaskId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisTaskRequest::getInstanceId, ShowDiagnosisTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDocumentRequest, CreateDocumentResponse> createDocument =
        genForCreateDocument();

    private static HttpRequestDef<CreateDocumentRequest, CreateDocumentResponse> genForCreateDocument() {
        // basic
        HttpRequestDef.Builder<CreateDocumentRequest, CreateDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDocumentRequest.class, CreateDocumentResponse.class)
                .withName("CreateDocument")
                .withUri("/v1/documents")
                .withContentType("application/json");

        // requests
        builder.<CreateDocumentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDocumentRequestBody.class),
            f -> f.withMarshaller(CreateDocumentRequest::getBody, CreateDocumentRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDocumentResponse::getBody, CreateDocumentResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDocumentResponse::getXRequestId, CreateDocumentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDocumentRequest, DeleteDocumentResponse> deleteDocument =
        genForDeleteDocument();

    private static HttpRequestDef<DeleteDocumentRequest, DeleteDocumentResponse> genForDeleteDocument() {
        // basic
        HttpRequestDef.Builder<DeleteDocumentRequest, DeleteDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDocumentRequest.class, DeleteDocumentResponse.class)
                .withName("DeleteDocument")
                .withUri("/v1/documents/{document_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("document_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDocumentRequest::getDocumentId, DeleteDocumentRequest::setDocumentId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDocumentResponse::getBody, DeleteDocumentResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDocumentResponse::getXRequestId, DeleteDocumentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDocumentRequest, ExecuteDocumentResponse> executeDocument =
        genForExecuteDocument();

    private static HttpRequestDef<ExecuteDocumentRequest, ExecuteDocumentResponse> genForExecuteDocument() {
        // basic
        HttpRequestDef.Builder<ExecuteDocumentRequest, ExecuteDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteDocumentRequest.class, ExecuteDocumentResponse.class)
                .withName("ExecuteDocument")
                .withUri("/v1/documents/{document_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("document_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDocumentRequest::getDocumentId, ExecuteDocumentRequest::setDocumentId));
        builder.<ExecuteDocumentRequsetBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteDocumentRequsetBody.class),
            f -> f.withMarshaller(ExecuteDocumentRequest::getBody, ExecuteDocumentRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteDocumentResponse::getBody, ExecuteDocumentResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteDocumentResponse::getXRequestId, ExecuteDocumentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<GetDocumentRequest, GetDocumentResponse> getDocument = genForGetDocument();

    private static HttpRequestDef<GetDocumentRequest, GetDocumentResponse> genForGetDocument() {
        // basic
        HttpRequestDef.Builder<GetDocumentRequest, GetDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetDocumentRequest.class, GetDocumentResponse.class)
                .withName("GetDocument")
                .withUri("/v1/documents/{document_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("document_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDocumentRequest::getDocumentId, GetDocumentRequest::setDocumentId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDocumentRequest::getVersion, GetDocumentRequest::setVersion));
        builder.<String>withRequestField("document_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDocumentRequest::getDocumentType, GetDocumentRequest::setDocumentType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetDocumentResponse::getXRequestId, GetDocumentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<GetDocumentAtomicInfoRequest, GetDocumentAtomicInfoResponse> getDocumentAtomicInfo =
        genForGetDocumentAtomicInfo();

    private static HttpRequestDef<GetDocumentAtomicInfoRequest, GetDocumentAtomicInfoResponse> genForGetDocumentAtomicInfo() {
        // basic
        HttpRequestDef.Builder<GetDocumentAtomicInfoRequest, GetDocumentAtomicInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetDocumentAtomicInfoRequest.class, GetDocumentAtomicInfoResponse.class)
            .withName("GetDocumentAtomicInfo")
            .withUri("/v1/atomics/{atomic_unique_key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("atomic_unique_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetDocumentAtomicInfoRequest::getAtomicUniqueKey,
                GetDocumentAtomicInfoRequest::setAtomicUniqueKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDocumentAtomicsRequest, ListDocumentAtomicsResponse> listDocumentAtomics =
        genForListDocumentAtomics();

    private static HttpRequestDef<ListDocumentAtomicsRequest, ListDocumentAtomicsResponse> genForListDocumentAtomics() {
        // basic
        HttpRequestDef.Builder<ListDocumentAtomicsRequest, ListDocumentAtomicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDocumentAtomicsRequest.class, ListDocumentAtomicsResponse.class)
                .withName("ListDocumentAtomics")
                .withUri("/v1/atomics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDocumentAtomicsRequest::getLimit, ListDocumentAtomicsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDocumentAtomicsRequest::getOffset, ListDocumentAtomicsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDocumentsRequest, ListDocumentsResponse> listDocuments =
        genForListDocuments();

    private static HttpRequestDef<ListDocumentsRequest, ListDocumentsResponse> genForListDocuments() {
        // basic
        HttpRequestDef.Builder<ListDocumentsRequest, ListDocumentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDocumentsRequest.class, ListDocumentsResponse.class)
                .withName("ListDocuments")
                .withUri("/v1/documents")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDocumentsRequest::getLimit, ListDocumentsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDocumentsRequest::getOffset, ListDocumentsRequest::setOffset));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDocumentsRequest::getNameLike, ListDocumentsRequest::setNameLike));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDocumentsRequest::getCreator, ListDocumentsRequest::setCreator));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDocumentsRequest::getEnterpriseProjectId,
                ListDocumentsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("document_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDocumentsRequest::getDocumentType, ListDocumentsRequest::setDocumentType));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(ListDocumentsResponse::getBody, ListDocumentsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDocumentRequest, UpdateDocumentResponse> updateDocument =
        genForUpdateDocument();

    private static HttpRequestDef<UpdateDocumentRequest, UpdateDocumentResponse> genForUpdateDocument() {
        // basic
        HttpRequestDef.Builder<UpdateDocumentRequest, UpdateDocumentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDocumentRequest.class, UpdateDocumentResponse.class)
                .withName("UpdateDocument")
                .withUri("/v1/documents/{document_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("document_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDocumentRequest::getDocumentId, UpdateDocumentRequest::setDocumentId));
        builder.<UpdateRunbookRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRunbookRequestBody.class),
            f -> f.withMarshaller(UpdateDocumentRequest::getBody, UpdateDocumentRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDocumentResponse::getBody, UpdateDocumentResponse::setBody));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDocumentResponse::getXRequestId, UpdateDocumentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> createReportPrometheusEvent =
        genForCreateReportPrometheusEvent();

    private static HttpRequestDef<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> genForCreateReportPrometheusEvent() {
        // basic
        HttpRequestDef.Builder<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateReportPrometheusEventRequest.class,
                    CreateReportPrometheusEventResponse.class)
                .withName("CreateReportPrometheusEvent")
                .withUri("/v1/event/prometheus/{integration_key}")
                .withContentType("application/json; charset=utf-8");

        // requests
        builder.<String>withRequestField("integration_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportPrometheusEventRequest::getIntegrationKey,
                CreateReportPrometheusEventRequest::setIntegrationKey));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f
                .withMarshaller(CreateReportPrometheusEventRequest::getBody,
                    CreateReportPrometheusEventRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetExecutionRequest, GetExecutionResponse> getExecution = genForGetExecution();

    private static HttpRequestDef<GetExecutionRequest, GetExecutionResponse> genForGetExecution() {
        // basic
        HttpRequestDef.Builder<GetExecutionRequest, GetExecutionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetExecutionRequest.class, GetExecutionResponse.class)
                .withName("GetExecution")
                .withUri("/v1/executions/{execution_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionRequest::getExecutionId, GetExecutionRequest::setExecutionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetExecutionResponse::getXRequestId, GetExecutionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionInstancesRequest, ListExecutionInstancesResponse> listExecutionInstances =
        genForListExecutionInstances();

    private static HttpRequestDef<ListExecutionInstancesRequest, ListExecutionInstancesResponse> genForListExecutionInstances() {
        // basic
        HttpRequestDef.Builder<ListExecutionInstancesRequest, ListExecutionInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListExecutionInstancesRequest.class, ListExecutionInstancesResponse.class)
            .withName("ListExecutionInstances")
            .withUri("/v1/executions/instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExecutionInstancesRequest::getLimit, ListExecutionInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExecutionInstancesRequest::getOffset, ListExecutionInstancesRequest::setOffset));
        builder.<String>withRequestField("execution_step_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionInstancesRequest::getExecutionStepId,
                ListExecutionInstancesRequest::setExecutionStepId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExecutionInstancesResponse::getXRequestId,
                ListExecutionInstancesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionStepsRequest, ListExecutionStepsResponse> listExecutionSteps =
        genForListExecutionSteps();

    private static HttpRequestDef<ListExecutionStepsRequest, ListExecutionStepsResponse> genForListExecutionSteps() {
        // basic
        HttpRequestDef.Builder<ListExecutionStepsRequest, ListExecutionStepsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExecutionStepsRequest.class, ListExecutionStepsResponse.class)
                .withName("ListExecutionSteps")
                .withUri("/v1/executions/{execution_id}/steps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionStepsRequest::getExecutionId,
                ListExecutionStepsRequest::setExecutionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExecutionStepsRequest::getLimit, ListExecutionStepsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListExecutionStepsRequest::getOffset, ListExecutionStepsRequest::setOffset));
        builder.<List<String>>withRequestField("execution_step_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListExecutionStepsRequest::getExecutionStepIdList,
                ListExecutionStepsRequest::setExecutionStepIdList));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExecutionStepsResponse::getXRequestId,
                ListExecutionStepsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionsRequest, ListExecutionsResponse> listExecutions =
        genForListExecutions();

    private static HttpRequestDef<ListExecutionsRequest, ListExecutionsResponse> genForListExecutions() {
        // basic
        HttpRequestDef.Builder<ListExecutionsRequest, ListExecutionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExecutionsRequest.class, ListExecutionsResponse.class)
                .withName("ListExecutions")
                .withUri("/v1/executions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExecutionsRequest::getLimit, ListExecutionsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListExecutionsRequest::getOffset, ListExecutionsRequest::setOffset));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionsRequest::getCreator, ListExecutionsRequest::setCreator));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListExecutionsRequest::getStartTime, ListExecutionsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListExecutionsRequest::getEndTime, ListExecutionsRequest::setEndTime));
        builder.<String>withRequestField("document_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionsRequest::getDocumentName, ListExecutionsRequest::setDocumentName));
        builder.<String>withRequestField("document_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionsRequest::getDocumentId, ListExecutionsRequest::setDocumentId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionsRequest::getTags, ListExecutionsRequest::setTags));
        builder.<Boolean>withRequestField("exclude_child_executions",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListExecutionsRequest::getExcludeChildExecutions,
                ListExecutionsRequest::setExcludeChildExecutions));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<OperateExecutionRequest, OperateExecutionResponse> operateExecution =
        genForOperateExecution();

    private static HttpRequestDef<OperateExecutionRequest, OperateExecutionResponse> genForOperateExecution() {
        // basic
        HttpRequestDef.Builder<OperateExecutionRequest, OperateExecutionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, OperateExecutionRequest.class, OperateExecutionResponse.class)
                .withName("OperateExecution")
                .withUri("/v1/executions")
                .withContentType("application/json");

        // requests
        builder.<OperateExecutionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OperateExecutionRequestBody.class),
            f -> f.withMarshaller(OperateExecutionRequest::getBody, OperateExecutionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTicketInfoRequest, DeleteTicketInfoResponse> deleteTicketInfo =
        genForDeleteTicketInfo();

    private static HttpRequestDef<DeleteTicketInfoRequest, DeleteTicketInfoResponse> genForDeleteTicketInfo() {
        // basic
        HttpRequestDef.Builder<DeleteTicketInfoRequest, DeleteTicketInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTicketInfoRequest.class, DeleteTicketInfoResponse.class)
                .withName("DeleteTicketInfo")
                .withUri("/v1/{ticket_type}/tickets/{ticket_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTicketInfoRequest::getTicketType, DeleteTicketInfoRequest::setTicketType));
        builder.<String>withRequestField("ticket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTicketInfoRequest::getTicketId, DeleteTicketInfoRequest::setTicketId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubTicketsRequest, ListSubTicketsResponse> listSubTickets =
        genForListSubTickets();

    private static HttpRequestDef<ListSubTicketsRequest, ListSubTicketsResponse> genForListSubTickets() {
        // basic
        HttpRequestDef.Builder<ListSubTicketsRequest, ListSubTicketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubTicketsRequest.class, ListSubTicketsResponse.class)
                .withName("ListSubTickets")
                .withUri("/v1/{ticket_type}/tickets/{ticket_id}/list-sub-tickets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTicketsRequest::getTicketType, ListSubTicketsRequest::setTicketType));
        builder.<String>withRequestField("ticket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTicketsRequest::getTicketId, ListSubTicketsRequest::setTicketId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTicketsRequest::getType, ListSubTicketsRequest::setType));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSubTicketsRequest::getLimit, ListSubTicketsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTicketsRequest::getMarker, ListSubTicketsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTicketRequest, UpdateTicketResponse> updateTicket = genForUpdateTicket();

    private static HttpRequestDef<UpdateTicketRequest, UpdateTicketResponse> genForUpdateTicket() {
        // basic
        HttpRequestDef.Builder<UpdateTicketRequest, UpdateTicketResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTicketRequest.class, UpdateTicketResponse.class)
                .withName("UpdateTicket")
                .withUri("/v1/{ticket_type}/tickets/{ticket_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTicketRequest::getTicketType, UpdateTicketRequest::setTicketType));
        builder.<String>withRequestField("ticket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTicketRequest::getTicketId, UpdateTicketRequest::setTicketId));
        builder.<CocUpdateChangeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CocUpdateChangeRequestBody.class),
            f -> f.withMarshaller(UpdateTicketRequest::getBody, UpdateTicketRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCocIncidentRequest, CreateCocIncidentResponse> createCocIncident =
        genForCreateCocIncident();

    private static HttpRequestDef<CreateCocIncidentRequest, CreateCocIncidentResponse> genForCreateCocIncident() {
        // basic
        HttpRequestDef.Builder<CreateCocIncidentRequest, CreateCocIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCocIncidentRequest.class, CreateCocIncidentResponse.class)
                .withName("CreateCocIncident")
                .withUri("/v1/external/incident/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateExternalIncidentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalIncidentRequest.class),
            f -> f.withMarshaller(CreateCocIncidentRequest::getBody, CreateCocIncidentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExternalCocAttachmentRequest, CreateExternalCocAttachmentResponse> createExternalCocAttachment =
        genForCreateExternalCocAttachment();

    private static HttpRequestDef<CreateExternalCocAttachmentRequest, CreateExternalCocAttachmentResponse> genForCreateExternalCocAttachment() {
        // basic
        HttpRequestDef.Builder<CreateExternalCocAttachmentRequest, CreateExternalCocAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateExternalCocAttachmentRequest.class,
                    CreateExternalCocAttachmentResponse.class)
                .withName("CreateExternalCocAttachment")
                .withUri("/v1/external/incident/attachments")
                .withContentType("multipart/form-data");

        // requests
        builder.<CreateExternalCocAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalCocAttachmentRequestBody.class),
            f -> f.withMarshaller(CreateExternalCocAttachmentRequest::getBody,
                CreateExternalCocAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleCocIncidentRequest, HandleCocIncidentResponse> handleCocIncident =
        genForHandleCocIncident();

    private static HttpRequestDef<HandleCocIncidentRequest, HandleCocIncidentResponse> genForHandleCocIncident() {
        // basic
        HttpRequestDef.Builder<HandleCocIncidentRequest, HandleCocIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HandleCocIncidentRequest.class, HandleCocIncidentResponse.class)
                .withName("HandleCocIncident")
                .withUri("/v1/external/incident/handle")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<HandleExternalIncidentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HandleExternalIncidentRequest.class),
            f -> f.withMarshaller(HandleCocIncidentRequest::getBody, HandleCocIncidentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> listCocTicketOperationHistories =
        genForListCocTicketOperationHistories();

    private static HttpRequestDef<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> genForListCocTicketOperationHistories() {
        // basic
        HttpRequestDef.Builder<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCocTicketOperationHistoriesRequest.class,
                    ListCocTicketOperationHistoriesResponse.class)
                .withName("ListCocTicketOperationHistories")
                .withUri("/v1/external/{ticket_type}/list-histories")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListCocTicketOperationHistoriesRequest.TicketTypeEnum>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCocTicketOperationHistoriesRequest.TicketTypeEnum.class),
            f -> f.withMarshaller(ListCocTicketOperationHistoriesRequest::getTicketType,
                ListCocTicketOperationHistoriesRequest::setTicketType));
        builder.<ListTicketParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTicketParams.class),
            f -> f.withMarshaller(ListCocTicketOperationHistoriesRequest::getBody,
                ListCocTicketOperationHistoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIncidentSimpleTicketsRequest, ListIncidentSimpleTicketsResponse> listIncidentSimpleTickets =
        genForListIncidentSimpleTickets();

    private static HttpRequestDef<ListIncidentSimpleTicketsRequest, ListIncidentSimpleTicketsResponse> genForListIncidentSimpleTickets() {
        // basic
        HttpRequestDef.Builder<ListIncidentSimpleTicketsRequest, ListIncidentSimpleTicketsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListIncidentSimpleTicketsRequest.class,
                    ListIncidentSimpleTicketsResponse.class)
                .withName("ListIncidentSimpleTickets")
                .withUri("/v1/incident-tickets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIncidentSimpleTicketsRequest::getOffset,
                ListIncidentSimpleTicketsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIncidentSimpleTicketsRequest::getLimit,
                ListIncidentSimpleTicketsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> showCocIncidentDetail =
        genForShowCocIncidentDetail();

    private static HttpRequestDef<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> genForShowCocIncidentDetail() {
        // basic
        HttpRequestDef.Builder<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCocIncidentDetailRequest.class, ShowCocIncidentDetailResponse.class)
            .withName("ShowCocIncidentDetail")
            .withUri("/v1/external/incident/{incident_num}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("incident_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCocIncidentDetailRequest::getIncidentNum,
                ShowCocIncidentDetailRequest::setIncidentNum));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCocIssuesRequest, CreateCocIssuesResponse> createCocIssues =
        genForCreateCocIssues();

    private static HttpRequestDef<CreateCocIssuesRequest, CreateCocIssuesResponse> genForCreateCocIssues() {
        // basic
        HttpRequestDef.Builder<CreateCocIssuesRequest, CreateCocIssuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCocIssuesRequest.class, CreateCocIssuesResponse.class)
                .withName("CreateCocIssues")
                .withUri("/v1/external/issues/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateExternalIssuesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalIssuesRequest.class),
            f -> f.withMarshaller(CreateCocIssuesRequest::getBody, CreateCocIssuesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> showCocIssuesDetail =
        genForShowCocIssuesDetail();

    private static HttpRequestDef<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> genForShowCocIssuesDetail() {
        // basic
        HttpRequestDef.Builder<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCocIssuesDetailRequest.class, ShowCocIssuesDetailResponse.class)
                .withName("ShowCocIssuesDetail")
                .withUri("/v1/external/issues/{ticket_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ticket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCocIssuesDetailRequest::getTicketId, ShowCocIssuesDetailRequest::setTicketId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAttachmentRequest, CreateAttachmentResponse> createAttachment =
        genForCreateAttachment();

    private static HttpRequestDef<CreateAttachmentRequest, CreateAttachmentResponse> genForCreateAttachment() {
        // basic
        HttpRequestDef.Builder<CreateAttachmentRequest, CreateAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAttachmentRequest.class, CreateAttachmentResponse.class)
                .withName("CreateAttachment")
                .withUri("/v1/{ticket_type}/attachments")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAttachmentRequest::getTicketType, CreateAttachmentRequest::setTicketType));
        builder.<CreateAttachmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAttachmentRequestBody.class),
            f -> f.withMarshaller(CreateAttachmentRequest::getBody, CreateAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTicketRequest, CreateTicketResponse> createTicket = genForCreateTicket();

    private static HttpRequestDef<CreateTicketRequest, CreateTicketResponse> genForCreateTicket() {
        // basic
        HttpRequestDef.Builder<CreateTicketRequest, CreateTicketResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTicketRequest.class, CreateTicketResponse.class)
                .withName("CreateTicket")
                .withUri("/v1/{ticket_type}/tickets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTicketRequest.TicketTypeEnum>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTicketRequest.TicketTypeEnum.class),
            f -> f.withMarshaller(CreateTicketRequest::getTicketType, CreateTicketRequest::setTicketType));
        builder.<CreateCocTicketRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCocTicketRequestBody.class),
            f -> f.withMarshaller(CreateTicketRequest::getBody, CreateTicketRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachment =
        genForDownloadAttachment();

    private static HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> genForDownloadAttachment() {
        // basic
        HttpRequestDef.Builder<DownloadAttachmentRequest, DownloadAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAttachmentRequest.class, DownloadAttachmentResponse.class)
                .withName("DownloadAttachment")
                .withUri("/v1/{ticket_type}/attachments/{doc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getTicketType, DownloadAttachmentRequest::setTicketType));
        builder.<String>withRequestField("doc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getDocId, DownloadAttachmentRequest::setDocId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteTicketActionRequest, ExecuteTicketActionResponse> executeTicketAction =
        genForExecuteTicketAction();

    private static HttpRequestDef<ExecuteTicketActionRequest, ExecuteTicketActionResponse> genForExecuteTicketAction() {
        // basic
        HttpRequestDef.Builder<ExecuteTicketActionRequest, ExecuteTicketActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteTicketActionRequest.class, ExecuteTicketActionResponse.class)
                .withName("ExecuteTicketAction")
                .withUri("/v1/{ticket_type}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTicketActionRequest::getTicketType,
                ExecuteTicketActionRequest::setTicketType));
        builder.<ExecuteActionParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteActionParams.class),
            f -> f.withMarshaller(ExecuteTicketActionRequest::getBody, ExecuteTicketActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTicketOperationHistoriesRequest, ListTicketOperationHistoriesResponse> listTicketOperationHistories =
        genForListTicketOperationHistories();

    private static HttpRequestDef<ListTicketOperationHistoriesRequest, ListTicketOperationHistoriesResponse> genForListTicketOperationHistories() {
        // basic
        HttpRequestDef.Builder<ListTicketOperationHistoriesRequest, ListTicketOperationHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTicketOperationHistoriesRequest.class,
                    ListTicketOperationHistoriesResponse.class)
                .withName("ListTicketOperationHistories")
                .withUri("/v1/{ticket_type}/list-histories")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTicketOperationHistoriesRequest::getTicketType,
                ListTicketOperationHistoriesRequest::setTicketType));
        builder.<ListTicketParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTicketParams.class),
            f -> f.withMarshaller(ListTicketOperationHistoriesRequest::getBody,
                ListTicketOperationHistoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTicketsRequest, ListTicketsResponse> listTickets = genForListTickets();

    private static HttpRequestDef<ListTicketsRequest, ListTicketsResponse> genForListTickets() {
        // basic
        HttpRequestDef.Builder<ListTicketsRequest, ListTicketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTicketsRequest.class, ListTicketsResponse.class)
                .withName("ListTickets")
                .withUri("/v1/{ticket_type}/list-tickets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTicketsRequest::getTicketType, ListTicketsRequest::setTicketType));
        builder.<ListTicketParamsWithPage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTicketParamsWithPage.class),
            f -> f.withMarshaller(ListTicketsRequest::getBody, ListTicketsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTicketInfoRequest, ShowTicketInfoResponse> showTicketInfo =
        genForShowTicketInfo();

    private static HttpRequestDef<ShowTicketInfoRequest, ShowTicketInfoResponse> genForShowTicketInfo() {
        // basic
        HttpRequestDef.Builder<ShowTicketInfoRequest, ShowTicketInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTicketInfoRequest.class, ShowTicketInfoResponse.class)
                .withName("ShowTicketInfo")
                .withUri("/v1/{ticket_type}/tickets/{ticket_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTicketInfoRequest::getTicketType, ShowTicketInfoRequest::setTicketType));
        builder.<String>withRequestField("ticket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTicketInfoRequest::getTicketId, ShowTicketInfoRequest::setTicketId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> listAuthorizableTicketsExternal =
        genForListAuthorizableTicketsExternal();

    private static HttpRequestDef<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> genForListAuthorizableTicketsExternal() {
        // basic
        HttpRequestDef.Builder<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAuthorizableTicketsExternalRequest.class,
                    ListAuthorizableTicketsExternalResponse.class)
                .withName("ListAuthorizableTicketsExternal")
                .withUri("/v1/external/list/authorizable-tickets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListAuthorizableTicketsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAuthorizableTicketsReq.class),
            f -> f.withMarshaller(ListAuthorizableTicketsExternalRequest::getBody,
                ListAuthorizableTicketsExternalRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountMultiResourcesRequest, CountMultiResourcesResponse> countMultiResources =
        genForCountMultiResources();

    private static HttpRequestDef<CountMultiResourcesRequest, CountMultiResourcesResponse> genForCountMultiResources() {
        // basic
        HttpRequestDef.Builder<CountMultiResourcesRequest, CountMultiResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountMultiResourcesRequest.class, CountMultiResourcesResponse.class)
                .withName("CountMultiResources")
                .withUri("/v1/resources/multi-count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getVendor, CountMultiResourcesRequest::setVendor));
        builder.<String>withRequestField("view_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getViewId, CountMultiResourcesRequest::setViewId));
        builder.<Boolean>withRequestField("is_resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getIsResource,
                CountMultiResourcesRequest::setIsResource));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getRegionId, CountMultiResourcesRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceRequest, ListResourceResponse> listResource = genForListResource();

    private static HttpRequestDef<ListResourceRequest, ListResourceResponse> genForListResource() {
        // basic
        HttpRequestDef.Builder<ListResourceRequest, ListResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceRequest.class, ListResourceResponse.class)
                .withName("ListResource")
                .withUri("/v1/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getProvider, ListResourceRequest::setProvider));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getType, ListResourceRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceRequest::getLimit, ListResourceRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getMarker, ListResourceRequest::setMarker));
        builder.<List<String>>withRequestField("resource_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListResourceRequest::getResourceIdList, ListResourceRequest::setResourceIdList));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getName, ListResourceRequest::setName));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getRegionId, ListResourceRequest::setRegionId));
        builder.<String>withRequestField("az_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getAzId, ListResourceRequest::setAzId));
        builder.<String>withRequestField("ip_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getIpType, ListResourceRequest::setIpType));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getIp, ListResourceRequest::setIp));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getStatus, ListResourceRequest::setStatus));
        builder.<String>withRequestField("agent_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getAgentState, ListResourceRequest::setAgentState));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getImageName, ListResourceRequest::setImageName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getOsType, ListResourceRequest::setOsType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getTag, ListResourceRequest::setTag));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getTagKey, ListResourceRequest::setTagKey));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getGroupId, ListResourceRequest::setGroupId));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getComponentId, ListResourceRequest::setComponentId));
        builder.<String>withRequestField("application_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getApplicationId, ListResourceRequest::setApplicationId));
        builder.<String>withRequestField("cce_cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getCceClusterId, ListResourceRequest::setCceClusterId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getVpcId, ListResourceRequest::setVpcId));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getEpId, ListResourceRequest::setEpId));
        builder.<Boolean>withRequestField("is_delegated",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListResourceRequest::getIsDelegated, ListResourceRequest::setIsDelegated));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getProjectId, ListResourceRequest::setProjectId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceResponse::getXRequestId, ListResourceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SyncResourceRequest, SyncResourceResponse> syncResource = genForSyncResource();

    private static HttpRequestDef<SyncResourceRequest, SyncResourceResponse> genForSyncResource() {
        // basic
        HttpRequestDef.Builder<SyncResourceRequest, SyncResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncResourceRequest.class, SyncResourceResponse.class)
                .withName("SyncResource")
                .withUri("/v1/resources/sync")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SyncResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SyncResourceReq.class),
            f -> f.withMarshaller(SyncResourceRequest::getBody, SyncResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptResourceTagsRequest, ListScriptResourceTagsResponse> listScriptResourceTags =
        genForListScriptResourceTags();

    private static HttpRequestDef<ListScriptResourceTagsRequest, ListScriptResourceTagsResponse> genForListScriptResourceTags() {
        // basic
        HttpRequestDef.Builder<ListScriptResourceTagsRequest, ListScriptResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListScriptResourceTagsRequest.class, ListScriptResourceTagsResponse.class)
            .withName("ListScriptResourceTags")
            .withUri("/v1/script/{resource_type}/tags")
            .withContentType("application/json");

        // requests
        builder.<ListScriptResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListScriptResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListScriptResourceTagsRequest::getResourceType,
                ListScriptResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptResourceTagsRequest::getLimit, ListScriptResourceTagsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptResourceTagsRequest::getOffset, ListScriptResourceTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceTagsRequest, UpdateResourceTagsResponse> updateResourceTags =
        genForUpdateResourceTags();

    private static HttpRequestDef<UpdateResourceTagsRequest, UpdateResourceTagsResponse> genForUpdateResourceTags() {
        // basic
        HttpRequestDef.Builder<UpdateResourceTagsRequest, UpdateResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateResourceTagsRequest.class, UpdateResourceTagsResponse.class)
                .withName("UpdateResourceTags")
                .withUri("/v1/script/{resource_type}/{resource_id}/tags/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceTagsRequest::getResourceId, UpdateResourceTagsRequest::setResourceId));
        builder.<UpdateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(UpdateResourceTagsRequest::getResourceType,
                UpdateResourceTagsRequest::setResourceType));
        builder.<UpdateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateResourceTagsRequestBody.class),
            f -> f.withMarshaller(UpdateResourceTagsRequest::getBody, UpdateResourceTagsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateResourceTagsResponse::getBody, UpdateResourceTagsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateScheduledTaskRequest, CreateScheduledTaskResponse> createScheduledTask =
        genForCreateScheduledTask();

    private static HttpRequestDef<CreateScheduledTaskRequest, CreateScheduledTaskResponse> genForCreateScheduledTask() {
        // basic
        HttpRequestDef.Builder<CreateScheduledTaskRequest, CreateScheduledTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScheduledTaskRequest.class, CreateScheduledTaskResponse.class)
                .withName("CreateScheduledTask")
                .withUri("/v1/schedule/task")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ScheduledTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScheduledTaskRequestBody.class),
            f -> f.withMarshaller(CreateScheduledTaskRequest::getBody, CreateScheduledTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> deleteScheduledTask =
        genForDeleteScheduledTask();

    private static HttpRequestDef<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> genForDeleteScheduledTask() {
        // basic
        HttpRequestDef.Builder<DeleteScheduledTaskRequest, DeleteScheduledTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScheduledTaskRequest.class, DeleteScheduledTaskResponse.class)
            .withName("DeleteScheduledTask")
            .withUri("/v1/schedule/task/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduledTaskRequest::getTaskId, DeleteScheduledTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableScheduledTaskRequest, DisableScheduledTaskResponse> disableScheduledTask =
        genForDisableScheduledTask();

    private static HttpRequestDef<DisableScheduledTaskRequest, DisableScheduledTaskResponse> genForDisableScheduledTask() {
        // basic
        HttpRequestDef.Builder<DisableScheduledTaskRequest, DisableScheduledTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisableScheduledTaskRequest.class, DisableScheduledTaskResponse.class)
            .withName("DisableScheduledTask")
            .withUri("/v1/schedule/task/{task_id}/disable")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableScheduledTaskRequest::getTaskId, DisableScheduledTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableScheduledTaskRequest, EnableScheduledTaskResponse> enableScheduledTask =
        genForEnableScheduledTask();

    private static HttpRequestDef<EnableScheduledTaskRequest, EnableScheduledTaskResponse> genForEnableScheduledTask() {
        // basic
        HttpRequestDef.Builder<EnableScheduledTaskRequest, EnableScheduledTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableScheduledTaskRequest.class, EnableScheduledTaskResponse.class)
                .withName("EnableScheduledTask")
                .withUri("/v1/schedule/task/{task_id}/enable")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableScheduledTaskRequest::getTaskId, EnableScheduledTaskRequest::setTaskId));
        builder.<EnableScheduledTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnableScheduledTaskRequestBody.class),
            f -> f.withMarshaller(EnableScheduledTaskRequest::getBody, EnableScheduledTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledTaskRequest, ListScheduledTaskResponse> listScheduledTask =
        genForListScheduledTask();

    private static HttpRequestDef<ListScheduledTaskRequest, ListScheduledTaskResponse> genForListScheduledTask() {
        // basic
        HttpRequestDef.Builder<ListScheduledTaskRequest, ListScheduledTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduledTaskRequest.class, ListScheduledTaskResponse.class)
                .withName("ListScheduledTask")
                .withUri("/v1/schedule/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getEnterpriseProjectId,
                ListScheduledTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getTaskId, ListScheduledTaskRequest::setTaskId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getTaskName, ListScheduledTaskRequest::setTaskName));
        builder.<ListScheduledTaskRequest.ScheduledTypeEnum>withRequestField("scheduled_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduledTaskRequest.ScheduledTypeEnum.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getScheduledType,
                ListScheduledTaskRequest::setScheduledType));
        builder.<ListScheduledTaskRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduledTaskRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getTaskType, ListScheduledTaskRequest::setTaskType));
        builder.<ListScheduledTaskRequest.AssociatedTaskTypeEnum>withRequestField("associated_task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduledTaskRequest.AssociatedTaskTypeEnum.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getAssociatedTaskType,
                ListScheduledTaskRequest::setAssociatedTaskType));
        builder.<String>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getRiskLevel, ListScheduledTaskRequest::setRiskLevel));
        builder.<String>withRequestField("created_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getCreatedBy, ListScheduledTaskRequest::setCreatedBy));
        builder.<String>withRequestField("reviewer",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getReviewer, ListScheduledTaskRequest::setReviewer));
        builder.<String>withRequestField("reviewer_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getReviewerUserName,
                ListScheduledTaskRequest::setReviewerUserName));
        builder.<ListScheduledTaskRequest.ApproveStatusEnum>withRequestField("approve_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduledTaskRequest.ApproveStatusEnum.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getApproveStatus,
                ListScheduledTaskRequest::setApproveStatus));
        builder.<ListScheduledTaskRequest.LastExecutionStatusEnum>withRequestField("last_execution_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduledTaskRequest.LastExecutionStatusEnum.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getLastExecutionStatus,
                ListScheduledTaskRequest::setLastExecutionStatus));
        builder.<Long>withRequestField("last_execution_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getLastExecutionStartTime,
                ListScheduledTaskRequest::setLastExecutionStartTime));
        builder.<Long>withRequestField("last_execution_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getLastExecutionEndTime,
                ListScheduledTaskRequest::setLastExecutionEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getMarker, ListScheduledTaskRequest::setMarker));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getRegionId, ListScheduledTaskRequest::setRegionId));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getResourceId, ListScheduledTaskRequest::setResourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getOffset, ListScheduledTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTaskRequest::getLimit, ListScheduledTaskRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse> listScheduledTaskHistory =
        genForListScheduledTaskHistory();

    private static HttpRequestDef<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse> genForListScheduledTaskHistory() {
        // basic
        HttpRequestDef.Builder<ListScheduledTaskHistoryRequest, ListScheduledTaskHistoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListScheduledTaskHistoryRequest.class, ListScheduledTaskHistoryResponse.class)
                .withName("ListScheduledTaskHistory")
                .withUri("/v1/schedule/task/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getTaskId,
                ListScheduledTaskHistoryRequest::setTaskId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getId, ListScheduledTaskHistoryRequest::setId));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getRegion,
                ListScheduledTaskHistoryRequest::setRegion));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getStatus,
                ListScheduledTaskHistoryRequest::setStatus));
        builder.<Long>withRequestField("started_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getStartedStartTime,
                ListScheduledTaskHistoryRequest::setStartedStartTime));
        builder.<Long>withRequestField("started_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getStartedEndTime,
                ListScheduledTaskHistoryRequest::setStartedEndTime));
        builder.<Long>withRequestField("finished_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getFinishedStartTime,
                ListScheduledTaskHistoryRequest::setFinishedStartTime));
        builder.<Long>withRequestField("finished_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getFinishedEndTime,
                ListScheduledTaskHistoryRequest::setFinishedEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getMarker,
                ListScheduledTaskHistoryRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getOffset,
                ListScheduledTaskHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getLimit,
                ListScheduledTaskHistoryRequest::setLimit));
        builder.<ListScheduledTaskHistoryRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduledTaskHistoryRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getSortKey,
                ListScheduledTaskHistoryRequest::setSortKey));
        builder.<ListScheduledTaskHistoryRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScheduledTaskHistoryRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListScheduledTaskHistoryRequest::getSortDir,
                ListScheduledTaskHistoryRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScheduledTaskRequest, ShowScheduledTaskResponse> showScheduledTask =
        genForShowScheduledTask();

    private static HttpRequestDef<ShowScheduledTaskRequest, ShowScheduledTaskResponse> genForShowScheduledTask() {
        // basic
        HttpRequestDef.Builder<ShowScheduledTaskRequest, ShowScheduledTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScheduledTaskRequest.class, ShowScheduledTaskResponse.class)
                .withName("ShowScheduledTask")
                .withUri("/v1/schedule/task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScheduledTaskRequest::getTaskId, ShowScheduledTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> updateScheduledTask =
        genForUpdateScheduledTask();

    private static HttpRequestDef<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> genForUpdateScheduledTask() {
        // basic
        HttpRequestDef.Builder<UpdateScheduledTaskRequest, UpdateScheduledTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScheduledTaskRequest.class, UpdateScheduledTaskResponse.class)
                .withName("UpdateScheduledTask")
                .withUri("/v1/schedule/task/{task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduledTaskRequest::getTaskId, UpdateScheduledTaskRequest::setTaskId));
        builder.<ScheduledTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScheduledTaskRequestBody.class),
            f -> f.withMarshaller(UpdateScheduledTaskRequest::getBody, UpdateScheduledTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptJobBatchRequest, GetScriptJobBatchResponse> getScriptJobBatch =
        genForGetScriptJobBatch();

    private static HttpRequestDef<GetScriptJobBatchRequest, GetScriptJobBatchResponse> genForGetScriptJobBatch() {
        // basic
        HttpRequestDef.Builder<GetScriptJobBatchRequest, GetScriptJobBatchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetScriptJobBatchRequest.class, GetScriptJobBatchResponse.class)
                .withName("GetScriptJobBatch")
                .withUri("/v1/job/script/orders/{execute_uuid}/batches/{batch_index}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("batch_index",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getBatchIndex, GetScriptJobBatchRequest::setBatchIndex));
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getExecuteUuid, GetScriptJobBatchRequest::setExecuteUuid));
        builder.<GetScriptJobBatchRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GetScriptJobBatchRequest.StatusEnum.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getStatus, GetScriptJobBatchRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getLimit, GetScriptJobBatchRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getMarker, GetScriptJobBatchRequest::setMarker));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getXLanguage, GetScriptJobBatchRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getXProjectId, GetScriptJobBatchRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getXUserProfile,
                GetScriptJobBatchRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptJobInfoRequest, GetScriptJobInfoResponse> getScriptJobInfo =
        genForGetScriptJobInfo();

    private static HttpRequestDef<GetScriptJobInfoRequest, GetScriptJobInfoResponse> genForGetScriptJobInfo() {
        // basic
        HttpRequestDef.Builder<GetScriptJobInfoRequest, GetScriptJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetScriptJobInfoRequest.class, GetScriptJobInfoResponse.class)
                .withName("GetScriptJobInfo")
                .withUri("/v1/job/script/orders/{execute_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getExecuteUuid, GetScriptJobInfoRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getXLanguage, GetScriptJobInfoRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getXProjectId, GetScriptJobInfoRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getXUserProfile, GetScriptJobInfoRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> getScriptJobStatistics =
        genForGetScriptJobStatistics();

    private static HttpRequestDef<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> genForGetScriptJobStatistics() {
        // basic
        HttpRequestDef.Builder<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetScriptJobStatisticsRequest.class, GetScriptJobStatisticsResponse.class)
            .withName("GetScriptJobStatistics")
            .withUri("/v1/job/script/orders/{execute_uuid}/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getExecuteUuid,
                GetScriptJobStatisticsRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getXLanguage,
                GetScriptJobStatisticsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getXProjectId,
                GetScriptJobStatisticsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getXUserProfile,
                GetScriptJobStatisticsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> listScriptJobBatches =
        genForListScriptJobBatches();

    private static HttpRequestDef<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> genForListScriptJobBatches() {
        // basic
        HttpRequestDef.Builder<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListScriptJobBatchesRequest.class, ListScriptJobBatchesResponse.class)
            .withName("ListScriptJobBatches")
            .withUri("/v1/job/script/orders/{execute_uuid}/batches")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getExecuteUuid,
                ListScriptJobBatchesRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getXLanguage,
                ListScriptJobBatchesRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getXProjectId,
                ListScriptJobBatchesRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getXUserProfile,
                ListScriptJobBatchesRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptJobsRequest, ListScriptJobsResponse> listScriptJobs =
        genForListScriptJobs();

    private static HttpRequestDef<ListScriptJobsRequest, ListScriptJobsResponse> genForListScriptJobs() {
        // basic
        HttpRequestDef.Builder<ListScriptJobsRequest, ListScriptJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptJobsRequest.class, ListScriptJobsResponse.class)
                .withName("ListScriptJobs")
                .withUri("/v1/job/script/orders")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getLimit, ListScriptJobsRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getMarker, ListScriptJobsRequest::setMarker));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getStartTime, ListScriptJobsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getEndTime, ListScriptJobsRequest::setEndTime));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getCreator, ListScriptJobsRequest::setCreator));
        builder.<ListScriptJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScriptJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getStatus, ListScriptJobsRequest::setStatus));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getXLanguage, ListScriptJobsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getXProjectId, ListScriptJobsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getXUserProfile, ListScriptJobsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<OperateScriptJobRequest, OperateScriptJobResponse> operateScriptJob =
        genForOperateScriptJob();

    private static HttpRequestDef<OperateScriptJobRequest, OperateScriptJobResponse> genForOperateScriptJob() {
        // basic
        HttpRequestDef.Builder<OperateScriptJobRequest, OperateScriptJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, OperateScriptJobRequest.class, OperateScriptJobResponse.class)
                .withName("OperateScriptJob")
                .withUri("/v1/job/script/orders/{execute_uuid}/operation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getExecuteUuid, OperateScriptJobRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getXLanguage, OperateScriptJobRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getXProjectId, OperateScriptJobRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getXUserProfile, OperateScriptJobRequest::setXUserProfile));
        builder.<JobScriptOrderOperationBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(JobScriptOrderOperationBody.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getBody, OperateScriptJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AcceptScriptRequest, AcceptScriptResponse> acceptScript = genForAcceptScript();

    private static HttpRequestDef<AcceptScriptRequest, AcceptScriptResponse> genForAcceptScript() {
        // basic
        HttpRequestDef.Builder<AcceptScriptRequest, AcceptScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AcceptScriptRequest.class, AcceptScriptResponse.class)
                .withName("AcceptScript")
                .withUri("/v1/job/scripts/{script_uuid}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScriptRequest::getScriptUuid, AcceptScriptRequest::setScriptUuid));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScriptRequest::getXProjectId, AcceptScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScriptRequest::getXUserProfile, AcceptScriptRequest::setXUserProfile));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScriptRequest::getXLanguage, AcceptScriptRequest::setXLanguage));
        builder.<ApprovalJobScriptModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalJobScriptModel.class),
            f -> f.withMarshaller(AcceptScriptRequest::getBody, AcceptScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckScriptRiskRequest, CheckScriptRiskResponse> checkScriptRisk =
        genForCheckScriptRisk();

    private static HttpRequestDef<CheckScriptRiskRequest, CheckScriptRiskResponse> genForCheckScriptRisk() {
        // basic
        HttpRequestDef.Builder<CheckScriptRiskRequest, CheckScriptRiskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckScriptRiskRequest.class, CheckScriptRiskResponse.class)
                .withName("CheckScriptRisk")
                .withUri("/v1/job/analyze-job")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckScriptRiskRequest::getXLanguage, CheckScriptRiskRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckScriptRiskRequest::getXProjectId, CheckScriptRiskRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckScriptRiskRequest::getXUserProfile, CheckScriptRiskRequest::setXUserProfile));
        builder.<JobScriptAnalyzeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobScriptAnalyzeRequest.class),
            f -> f.withMarshaller(CheckScriptRiskRequest::getBody, CheckScriptRiskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScriptRequest, CreateScriptResponse> createScript = genForCreateScript();

    private static HttpRequestDef<CreateScriptRequest, CreateScriptResponse> genForCreateScript() {
        // basic
        HttpRequestDef.Builder<CreateScriptRequest, CreateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScriptRequest.class, CreateScriptResponse.class)
                .withName("CreateScript")
                .withUri("/v1/job/scripts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScriptRequest::getXProjectId, CreateScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScriptRequest::getXUserProfile, CreateScriptRequest::setXUserProfile));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScriptRequest::getXLanguage, CreateScriptRequest::setXLanguage));
        builder.<AddScriptModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddScriptModel.class),
            f -> f.withMarshaller(CreateScriptRequest::getBody, CreateScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> deleteScript = genForDeleteScript();

    private static HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> genForDeleteScript() {
        // basic
        HttpRequestDef.Builder<DeleteScriptRequest, DeleteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScriptRequest.class, DeleteScriptResponse.class)
                .withName("DeleteScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getScriptUuid, DeleteScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getXLanguage, DeleteScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getXProjectId, DeleteScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getXUserProfile, DeleteScriptRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> executeScript =
        genForExecuteScript();

    private static HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> genForExecuteScript() {
        // basic
        HttpRequestDef.Builder<ExecuteScriptRequest, ExecuteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteScriptRequest.class, ExecuteScriptResponse.class)
                .withName("ExecuteScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getScriptUuid, ExecuteScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getXLanguage, ExecuteScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getXProjectId, ExecuteScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getXUserProfile, ExecuteScriptRequest::setXUserProfile));
        builder.<ScriptExecuteModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptExecuteModel.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getBody, ExecuteScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptRequest, GetScriptResponse> getScript = genForGetScript();

    private static HttpRequestDef<GetScriptRequest, GetScriptResponse> genForGetScript() {
        // basic
        HttpRequestDef.Builder<GetScriptRequest, GetScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetScriptRequest.class, GetScriptResponse.class)
                .withName("GetScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getScriptUuid, GetScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getXLanguage, GetScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getXProjectId, GetScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getXUserProfile, GetScriptRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesBatchRequest, ListInstancesBatchResponse> listInstancesBatch =
        genForListInstancesBatch();

    private static HttpRequestDef<ListInstancesBatchRequest, ListInstancesBatchResponse> genForListInstancesBatch() {
        // basic
        HttpRequestDef.Builder<ListInstancesBatchRequest, ListInstancesBatchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesBatchRequest.class, ListInstancesBatchResponse.class)
                .withName("ListInstancesBatch")
                .withUri("/v1/instances/batches")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesBatchRequest::getXLanguage, ListInstancesBatchRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesBatchRequest::getXProjectId, ListInstancesBatchRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesBatchRequest::getXUserProfile,
                ListInstancesBatchRequest::setXUserProfile));
        builder.<InstancesBatchesMode>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstancesBatchesMode.class),
            f -> f.withMarshaller(ListInstancesBatchRequest::getBody, ListInstancesBatchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptsRequest, ListScriptsResponse> listScripts = genForListScripts();

    private static HttpRequestDef<ListScriptsRequest, ListScriptsResponse> genForListScripts() {
        // basic
        HttpRequestDef.Builder<ListScriptsRequest, ListScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptsRequest.class, ListScriptsResponse.class)
                .withName("ListScripts")
                .withUri("/v1/job/scripts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptsRequest::getLimit, ListScriptsRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptsRequest::getMarker, ListScriptsRequest::setMarker));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getNameLike, ListScriptsRequest::setNameLike));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getCreator, ListScriptsRequest::setCreator));
        builder.<ListScriptsRequest.RiskLevelEnum>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScriptsRequest.RiskLevelEnum.class),
            f -> f.withMarshaller(ListScriptsRequest::getRiskLevel, ListScriptsRequest::setRiskLevel));
        builder.<ListScriptsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScriptsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListScriptsRequest::getType, ListScriptsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getEnterpriseProjectId,
                ListScriptsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getXLanguage, ListScriptsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getXProjectId, ListScriptsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getXUserProfile, ListScriptsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> updateScript = genForUpdateScript();

    private static HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> genForUpdateScript() {
        // basic
        HttpRequestDef.Builder<UpdateScriptRequest, UpdateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScriptRequest.class, UpdateScriptResponse.class)
                .withName("UpdateScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getScriptUuid, UpdateScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getXLanguage, UpdateScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getXProjectId, UpdateScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getXUserProfile, UpdateScriptRequest::setXUserProfile));
        builder.<EditScriptModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditScriptModel.class),
            f -> f.withMarshaller(UpdateScriptRequest::getBody, UpdateScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecutePublicScriptRequest, ExecutePublicScriptResponse> executePublicScript =
        genForExecutePublicScript();

    private static HttpRequestDef<ExecutePublicScriptRequest, ExecutePublicScriptResponse> genForExecutePublicScript() {
        // basic
        HttpRequestDef.Builder<ExecutePublicScriptRequest, ExecutePublicScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecutePublicScriptRequest.class, ExecutePublicScriptResponse.class)
                .withName("ExecutePublicScript")
                .withUri("/v1/job/public-scripts/{script_uuid}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getScriptUuid,
                ExecutePublicScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getXLanguage, ExecutePublicScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getXProjectId,
                ExecutePublicScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getXUserProfile,
                ExecutePublicScriptRequest::setXUserProfile));
        builder.<ScriptExecuteModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptExecuteModel.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getBody, ExecutePublicScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetPublicScriptRequest, GetPublicScriptResponse> getPublicScript =
        genForGetPublicScript();

    private static HttpRequestDef<GetPublicScriptRequest, GetPublicScriptResponse> genForGetPublicScript() {
        // basic
        HttpRequestDef.Builder<GetPublicScriptRequest, GetPublicScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetPublicScriptRequest.class, GetPublicScriptResponse.class)
                .withName("GetPublicScript")
                .withUri("/v1/job/public-scripts/{script_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getScriptUuid, GetPublicScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getXLanguage, GetPublicScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getXProjectId, GetPublicScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getXUserProfile, GetPublicScriptRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicScriptsRequest, ListPublicScriptsResponse> listPublicScripts =
        genForListPublicScripts();

    private static HttpRequestDef<ListPublicScriptsRequest, ListPublicScriptsResponse> genForListPublicScripts() {
        // basic
        HttpRequestDef.Builder<ListPublicScriptsRequest, ListPublicScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicScriptsRequest.class, ListPublicScriptsResponse.class)
                .withName("ListPublicScripts")
                .withUri("/v1/job/public-scripts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getLimit, ListPublicScriptsRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getMarker, ListPublicScriptsRequest::setMarker));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getNameLike, ListPublicScriptsRequest::setNameLike));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getName, ListPublicScriptsRequest::setName));
        builder.<ListPublicScriptsRequest.RiskLevelEnum>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicScriptsRequest.RiskLevelEnum.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getRiskLevel, ListPublicScriptsRequest::setRiskLevel));
        builder.<ListPublicScriptsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicScriptsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getType, ListPublicScriptsRequest::setType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getXLanguage, ListPublicScriptsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getXProjectId, ListPublicScriptsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getXUserProfile,
                ListPublicScriptsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWarRoomRequest, CreateWarRoomResponse> createWarRoom =
        genForCreateWarRoom();

    private static HttpRequestDef<CreateWarRoomRequest, CreateWarRoomResponse> genForCreateWarRoom() {
        // basic
        HttpRequestDef.Builder<CreateWarRoomRequest, CreateWarRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWarRoomRequest.class, CreateWarRoomResponse.class)
                .withName("CreateWarRoom")
                .withUri("/v1/external/warrooms")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateWarRoomRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWarRoomRequestBody.class),
            f -> f.withMarshaller(CreateWarRoomRequest::getBody, CreateWarRoomRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWarRoomsRequest, ListWarRoomsResponse> listWarRooms = genForListWarRooms();

    private static HttpRequestDef<ListWarRoomsRequest, ListWarRoomsResponse> genForListWarRooms() {
        // basic
        HttpRequestDef.Builder<ListWarRoomsRequest, ListWarRoomsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListWarRoomsRequest.class, ListWarRoomsResponse.class)
                .withName("ListWarRooms")
                .withUri("/v1/external/warrooms/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListTenantWarRoomRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTenantWarRoomRequestBody.class),
            f -> f.withMarshaller(ListWarRoomsRequest::getBody, ListWarRoomsRequest::setBody));

        // response

        return builder.build();
    }

}

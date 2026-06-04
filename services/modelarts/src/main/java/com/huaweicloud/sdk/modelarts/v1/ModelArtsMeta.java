package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceReq;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.EventUpdate;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobStagesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobStagesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobTasksRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListTrainingJobTasksResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.NotifyTrainingJobInformationResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ReportEventBody;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAuthmodeDetailRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAuthmodeDetailResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceQuotasRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceQuotasResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.TaskHistory;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAuthModeResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasReq;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceQuotasResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceReq;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.ValidateAuthorizationResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class ModelArtsMeta {

    public static final HttpRequestDef<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEvent =
        genForAcceptScheduledEvent();

    private static HttpRequestDef<AcceptScheduledEventRequest, AcceptScheduledEventResponse> genForAcceptScheduledEvent() {
        // basic
        HttpRequestDef.Builder<AcceptScheduledEventRequest, AcceptScheduledEventResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AcceptScheduledEventRequest.class, AcceptScheduledEventResponse.class)
            .withName("AcceptScheduledEvent")
            .withUri("/v1/{project_id}/scheduled-events/{event_id}/accept")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getEventId, AcceptScheduledEventRequest::setEventId));
        builder.<EventUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventUpdate.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getBody, AcceptScheduledEventRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AcceptScheduledEventResponse::getXRequestId,
                AcceptScheduledEventResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForCreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForCreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateWorkspaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceReq.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, CreateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspace =
        genForDeleteWorkspace();

    private static HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> genForDeleteWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspaceRequest, DeleteWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkspaceRequest.class, DeleteWorkspaceResponse.class)
                .withName("DeleteWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getWorkspaceId, DeleteWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEvents =
        genForListScheduledEvents();

    private static HttpRequestDef<ListScheduledEventsRequest, ListScheduledEventsResponse> genForListScheduledEvents() {
        // basic
        HttpRequestDef.Builder<ListScheduledEventsRequest, ListScheduledEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduledEventsRequest.class, ListScheduledEventsResponse.class)
                .withName("ListScheduledEvents")
                .withUri("/v1/{project_id}/scheduled-events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getWorkspaceId,
                ListScheduledEventsRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getState, ListScheduledEventsRequest::setState));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScheduledEventsResponse::getXRequestId,
                ListScheduledEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> listTrainingJobStages =
        genForListTrainingJobStages();

    private static HttpRequestDef<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> genForListTrainingJobStages() {
        // basic
        HttpRequestDef.Builder<ListTrainingJobStagesRequest, ListTrainingJobStagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrainingJobStagesRequest.class, ListTrainingJobStagesResponse.class)
            .withName("ListTrainingJobStages")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/stages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobStagesRequest::getTrainingJobId,
                ListTrainingJobStagesRequest::setTrainingJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> listTrainingJobTasks =
        genForListTrainingJobTasks();

    private static HttpRequestDef<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> genForListTrainingJobTasks() {
        // basic
        HttpRequestDef.Builder<ListTrainingJobTasksRequest, ListTrainingJobTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrainingJobTasksRequest.class, ListTrainingJobTasksResponse.class)
            .withName("ListTrainingJobTasks")
            .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrainingJobTasksRequest::getTrainingJobId,
                ListTrainingJobTasksRequest::setTrainingJobId));
        builder.<Integer>withRequestField("schedule_count",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrainingJobTasksRequest::getScheduleCount,
                ListTrainingJobTasksRequest::setScheduleCount));

        // response
        builder.<List<TaskHistory>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTrainingJobTasksResponse::getBody, ListTrainingJobTasksResponse::setBody)
                .withInnerContainerType(TaskHistory.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspaceRequest, ListWorkspaceResponse> listWorkspace =
        genForListWorkspace();

    private static HttpRequestDef<ListWorkspaceRequest, ListWorkspaceResponse> genForListWorkspace() {
        // basic
        HttpRequestDef.Builder<ListWorkspaceRequest, ListWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspaceRequest.class, ListWorkspaceResponse.class)
                .withName("ListWorkspace")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getOffset, ListWorkspaceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getLimit, ListWorkspaceRequest::setLimit));
        builder.<ListWorkspaceRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkspaceRequest.SortByEnum.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getSortBy, ListWorkspaceRequest::setSortBy));
        builder.<ListWorkspaceRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkspaceRequest.OrderEnum.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getOrder, ListWorkspaceRequest::setOrder));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getEnterpriseProjectId,
                ListWorkspaceRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getName, ListWorkspaceRequest::setName));
        builder.<Boolean>withRequestField("filter_accessible",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getFilterAccessible,
                ListWorkspaceRequest::setFilterAccessible));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> notifyTrainingJobInformation =
        genForNotifyTrainingJobInformation();

    private static HttpRequestDef<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> genForNotifyTrainingJobInformation() {
        // basic
        HttpRequestDef.Builder<NotifyTrainingJobInformationRequest, NotifyTrainingJobInformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NotifyTrainingJobInformationRequest.class,
                    NotifyTrainingJobInformationResponse.class)
                .withName("NotifyTrainingJobInformation")
                .withUri("/v2/{project_id}/training-jobs/{training_job_id}/tasks/{task_id}/reports/{report_type}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("training_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getTrainingJobId,
                NotifyTrainingJobInformationRequest::setTrainingJobId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getTaskId,
                NotifyTrainingJobInformationRequest::setTaskId));
        builder.<String>withRequestField("report_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getReportType,
                NotifyTrainingJobInformationRequest::setReportType));
        builder.<ReportEventBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ReportEventBody.class),
            f -> f.withMarshaller(NotifyTrainingJobInformationRequest::getBody,
                NotifyTrainingJobInformationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> showAuthmodeDetail =
        genForShowAuthmodeDetail();

    private static HttpRequestDef<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> genForShowAuthmodeDetail() {
        // basic
        HttpRequestDef.Builder<ShowAuthmodeDetailRequest, ShowAuthmodeDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuthmodeDetailRequest.class, ShowAuthmodeDetailResponse.class)
                .withName("ShowAuthmodeDetail")
                .withUri("/v1/auth-mode")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceRequest, ShowWorkspaceResponse> showWorkspace =
        genForShowWorkspace();

    private static HttpRequestDef<ShowWorkspaceRequest, ShowWorkspaceResponse> genForShowWorkspace() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceRequest, ShowWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceRequest.class, ShowWorkspaceResponse.class)
                .withName("ShowWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceRequest::getWorkspaceId, ShowWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> showWorkspaceQuotas =
        genForShowWorkspaceQuotas();

    private static HttpRequestDef<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> genForShowWorkspaceQuotas() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceQuotasRequest, ShowWorkspaceQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceQuotasRequest.class, ShowWorkspaceQuotasResponse.class)
                .withName("ShowWorkspaceQuotas")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkspaceQuotasRequest::getWorkspaceId,
                ShowWorkspaceQuotasRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthModeRequest, UpdateAuthModeResponse> updateAuthMode =
        genForUpdateAuthMode();

    private static HttpRequestDef<UpdateAuthModeRequest, UpdateAuthModeResponse> genForUpdateAuthMode() {
        // basic
        HttpRequestDef.Builder<UpdateAuthModeRequest, UpdateAuthModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuthModeRequest.class, UpdateAuthModeResponse.class)
                .withName("UpdateAuthMode")
                .withUri("/v1/auth-mode")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateAuthModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuthModeRequestBody.class),
            f -> f.withMarshaller(UpdateAuthModeRequest::getBody, UpdateAuthModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForUpdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForUpdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspaceId, UpdateWorkspaceRequest::setWorkspaceId));
        builder.<UpdateWorkspaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceReq.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> updateWorkspaceQuotas =
        genForUpdateWorkspaceQuotas();

    private static HttpRequestDef<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> genForUpdateWorkspaceQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceQuotasRequest, UpdateWorkspaceQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWorkspaceQuotasRequest.class, UpdateWorkspaceQuotasResponse.class)
            .withName("UpdateWorkspaceQuotas")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/quotas")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceQuotasRequest::getWorkspaceId,
                UpdateWorkspaceQuotasRequest::setWorkspaceId));
        builder.<UpdateWorkspaceQuotasReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceQuotasReq.class),
            f -> f.withMarshaller(UpdateWorkspaceQuotasRequest::getBody, UpdateWorkspaceQuotasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateAuthorizationRequest, ValidateAuthorizationResponse> validateAuthorization =
        genForValidateAuthorization();

    private static HttpRequestDef<ValidateAuthorizationRequest, ValidateAuthorizationResponse> genForValidateAuthorization() {
        // basic
        HttpRequestDef.Builder<ValidateAuthorizationRequest, ValidateAuthorizationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ValidateAuthorizationRequest.class, ValidateAuthorizationResponse.class)
            .withName("ValidateAuthorization")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/auth")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateAuthorizationRequest::getWorkspaceId,
                ValidateAuthorizationRequest::setWorkspaceId));
        builder.<ValidateAuthorizationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateAuthorizationRequestBody.class),
            f -> f.withMarshaller(ValidateAuthorizationRequest::getBody, ValidateAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

}

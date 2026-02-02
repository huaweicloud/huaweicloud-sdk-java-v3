package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAutoScalingPolicyReq;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInspectionJobRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateLogDiagnosisJobRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkParameterDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkParameterDiagnosisJobRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateNetworkParameterDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.CreateProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.CreateProfilingDiagnosisJobRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.CreateProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAutoScalingPolicyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteAutoScalingPolicyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteNetworkDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.DeleteProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.EventUpdate;
import com.huaweicloud.sdk.modelarts.v1.model.ListAutoScalingPolicyDetailsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListAutoScalingPolicyDetailsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionItemsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionItemsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionNodesRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListInspectionNodesResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListLogDiagnosisJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListLogDiagnosisJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobAlarmRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobAlarmResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobProxyResponseDelimitRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobProxyResponseDelimitResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListNetworkDiagnosisJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListProfilingDiagnosisJobsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListProfilingDiagnosisJobsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoScalingPolicyDetailRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowAutoScalingPolicyDetailResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionStatisticsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowInspectionStatisticsResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobResultRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowLogDiagnosisJobResultResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobResultRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ShowProfilingDiagnosisJobResultResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.StopProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.StopProfilingDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAutoScalingPolicyReq;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInspectionJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInspectionJobRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateInspectionJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateLogAnalysisJobRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateLogDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateLogDiagnosisJobResponse;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateProfilingDiagnosisJobRequest;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateProfilingDiagnosisJobRequestBody;
import com.huaweicloud.sdk.modelarts.v1.model.UpdateProfilingDiagnosisJobResponse;

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

    public static final HttpRequestDef<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> createAutoScalingPolicy =
        genForCreateAutoScalingPolicy();

    private static HttpRequestDef<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> genForCreateAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAutoScalingPolicyRequest.class, CreateAutoScalingPolicyResponse.class)
            .withName("CreateAutoScalingPolicy")
            .withUri("/v1/{project_id}/services/{service_id}/models/{model_id}/auto-scaling-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoScalingPolicyRequest::getServiceId,
                CreateAutoScalingPolicyRequest::setServiceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoScalingPolicyRequest::getModelId,
                CreateAutoScalingPolicyRequest::setModelId));
        builder.<CreateAutoScalingPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAutoScalingPolicyReq.class),
            f -> f.withMarshaller(CreateAutoScalingPolicyRequest::getBody, CreateAutoScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInspectionJobRequest, CreateInspectionJobResponse> createInspectionJob =
        genForCreateInspectionJob();

    private static HttpRequestDef<CreateInspectionJobRequest, CreateInspectionJobResponse> genForCreateInspectionJob() {
        // basic
        HttpRequestDef.Builder<CreateInspectionJobRequest, CreateInspectionJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInspectionJobRequest.class, CreateInspectionJobResponse.class)
                .withName("CreateInspectionJob")
                .withUri("/v1/{project_id}/brain/inspection-jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateInspectionJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInspectionJobRequestBody.class),
            f -> f.withMarshaller(CreateInspectionJobRequest::getBody, CreateInspectionJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateInspectionJobResponse::getXRequestId,
                CreateInspectionJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateLogDiagnosisJobRequest, CreateLogDiagnosisJobResponse> createLogDiagnosisJob =
        genForCreateLogDiagnosisJob();

    private static HttpRequestDef<CreateLogDiagnosisJobRequest, CreateLogDiagnosisJobResponse> genForCreateLogDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<CreateLogDiagnosisJobRequest, CreateLogDiagnosisJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateLogDiagnosisJobRequest.class, CreateLogDiagnosisJobResponse.class)
            .withName("CreateLogDiagnosisJob")
            .withUri("/v1/{project_id}/brain/log-diagnosis-jobs")
            .withContentType("application/json");

        // requests
        builder.<CreateLogDiagnosisJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogDiagnosisJobRequestBody.class),
            f -> f.withMarshaller(CreateLogDiagnosisJobRequest::getBody, CreateLogDiagnosisJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLogDiagnosisJobResponse::getXRequestId,
                CreateLogDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateNetworkParameterDiagnosisJobRequest, CreateNetworkParameterDiagnosisJobResponse> createNetworkParameterDiagnosisJob =
        genForCreateNetworkParameterDiagnosisJob();

    private static HttpRequestDef<CreateNetworkParameterDiagnosisJobRequest, CreateNetworkParameterDiagnosisJobResponse> genForCreateNetworkParameterDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<CreateNetworkParameterDiagnosisJobRequest, CreateNetworkParameterDiagnosisJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateNetworkParameterDiagnosisJobRequest.class,
                    CreateNetworkParameterDiagnosisJobResponse.class)
                .withName("CreateNetworkParameterDiagnosisJob")
                .withUri("/v1/{project_id}/brain/network-diagnosis-jobs/parameter-plane")
                .withContentType("application/json");

        // requests
        builder.<CreateNetworkParameterDiagnosisJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNetworkParameterDiagnosisJobRequestBody.class),
            f -> f.withMarshaller(CreateNetworkParameterDiagnosisJobRequest::getBody,
                CreateNetworkParameterDiagnosisJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateNetworkParameterDiagnosisJobResponse::getXRequestId,
                CreateNetworkParameterDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateProfilingDiagnosisJobRequest, CreateProfilingDiagnosisJobResponse> createProfilingDiagnosisJob =
        genForCreateProfilingDiagnosisJob();

    private static HttpRequestDef<CreateProfilingDiagnosisJobRequest, CreateProfilingDiagnosisJobResponse> genForCreateProfilingDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<CreateProfilingDiagnosisJobRequest, CreateProfilingDiagnosisJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProfilingDiagnosisJobRequest.class,
                    CreateProfilingDiagnosisJobResponse.class)
                .withName("CreateProfilingDiagnosisJob")
                .withUri("/v1/{project_id}/brain/profiling-diagnosis-jobs")
                .withContentType("application/json");

        // requests
        builder.<CreateProfilingDiagnosisJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProfilingDiagnosisJobRequestBody.class),
            f -> f.withMarshaller(CreateProfilingDiagnosisJobRequest::getBody,
                CreateProfilingDiagnosisJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateProfilingDiagnosisJobResponse::getXRequestId,
                CreateProfilingDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicy =
        genForDeleteAutoScalingPolicy();

    private static HttpRequestDef<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> genForDeleteAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAutoScalingPolicyRequest.class, DeleteAutoScalingPolicyResponse.class)
            .withName("DeleteAutoScalingPolicy")
            .withUri("/v1/{project_id}/services/{service_id}/models/{model_id}/auto-scaling-policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoScalingPolicyRequest::getServiceId,
                DeleteAutoScalingPolicyRequest::setServiceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoScalingPolicyRequest::getModelId,
                DeleteAutoScalingPolicyRequest::setModelId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoScalingPolicyRequest::getPolicyId,
                DeleteAutoScalingPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInspectionJobRequest, DeleteInspectionJobResponse> deleteInspectionJob =
        genForDeleteInspectionJob();

    private static HttpRequestDef<DeleteInspectionJobRequest, DeleteInspectionJobResponse> genForDeleteInspectionJob() {
        // basic
        HttpRequestDef.Builder<DeleteInspectionJobRequest, DeleteInspectionJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInspectionJobRequest.class, DeleteInspectionJobResponse.class)
            .withName("DeleteInspectionJob")
            .withUri("/v1/{project_id}/brain/inspection-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInspectionJobRequest::getJobId, DeleteInspectionJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteInspectionJobResponse::getXRequestId,
                DeleteInspectionJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogDiagnosisJobRequest, DeleteLogDiagnosisJobResponse> deleteLogDiagnosisJob =
        genForDeleteLogDiagnosisJob();

    private static HttpRequestDef<DeleteLogDiagnosisJobRequest, DeleteLogDiagnosisJobResponse> genForDeleteLogDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<DeleteLogDiagnosisJobRequest, DeleteLogDiagnosisJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLogDiagnosisJobRequest.class, DeleteLogDiagnosisJobResponse.class)
            .withName("DeleteLogDiagnosisJob")
            .withUri("/v1/{project_id}/brain/log-diagnosis-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogDiagnosisJobRequest::getJobId, DeleteLogDiagnosisJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogDiagnosisJobResponse::getXRequestId,
                DeleteLogDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteNetworkDiagnosisJobRequest, DeleteNetworkDiagnosisJobResponse> deleteNetworkDiagnosisJob =
        genForDeleteNetworkDiagnosisJob();

    private static HttpRequestDef<DeleteNetworkDiagnosisJobRequest, DeleteNetworkDiagnosisJobResponse> genForDeleteNetworkDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<DeleteNetworkDiagnosisJobRequest, DeleteNetworkDiagnosisJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteNetworkDiagnosisJobRequest.class,
                    DeleteNetworkDiagnosisJobResponse.class)
                .withName("DeleteNetworkDiagnosisJob")
                .withUri("/v1/{project_id}/brain/network-diagnosis-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNetworkDiagnosisJobRequest::getJobId,
                DeleteNetworkDiagnosisJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteNetworkDiagnosisJobResponse::getXRequestId,
                DeleteNetworkDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteProfilingDiagnosisJobRequest, DeleteProfilingDiagnosisJobResponse> deleteProfilingDiagnosisJob =
        genForDeleteProfilingDiagnosisJob();

    private static HttpRequestDef<DeleteProfilingDiagnosisJobRequest, DeleteProfilingDiagnosisJobResponse> genForDeleteProfilingDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<DeleteProfilingDiagnosisJobRequest, DeleteProfilingDiagnosisJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteProfilingDiagnosisJobRequest.class,
                    DeleteProfilingDiagnosisJobResponse.class)
                .withName("DeleteProfilingDiagnosisJob")
                .withUri("/v1/{project_id}/brain/profiling-diagnosis-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProfilingDiagnosisJobRequest::getJobId,
                DeleteProfilingDiagnosisJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProfilingDiagnosisJobResponse::getXRequestId,
                DeleteProfilingDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAutoScalingPolicyDetailsRequest, ListAutoScalingPolicyDetailsResponse> listAutoScalingPolicyDetails =
        genForListAutoScalingPolicyDetails();

    private static HttpRequestDef<ListAutoScalingPolicyDetailsRequest, ListAutoScalingPolicyDetailsResponse> genForListAutoScalingPolicyDetails() {
        // basic
        HttpRequestDef.Builder<ListAutoScalingPolicyDetailsRequest, ListAutoScalingPolicyDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAutoScalingPolicyDetailsRequest.class,
                    ListAutoScalingPolicyDetailsResponse.class)
                .withName("ListAutoScalingPolicyDetails")
                .withUri("/v1/{project_id}/services/{service_id}/models/{model_id}/auto-scaling-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getServiceId,
                ListAutoScalingPolicyDetailsRequest::setServiceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getModelId,
                ListAutoScalingPolicyDetailsRequest::setModelId));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getPolicyName,
                ListAutoScalingPolicyDetailsRequest::setPolicyName));
        builder.<ListAutoScalingPolicyDetailsRequest.PolicyTypeEnum>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAutoScalingPolicyDetailsRequest.PolicyTypeEnum.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getPolicyType,
                ListAutoScalingPolicyDetailsRequest::setPolicyType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getOffset,
                ListAutoScalingPolicyDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getLimit,
                ListAutoScalingPolicyDetailsRequest::setLimit));
        builder.<ListAutoScalingPolicyDetailsRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAutoScalingPolicyDetailsRequest.SortByEnum.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getSortBy,
                ListAutoScalingPolicyDetailsRequest::setSortBy));
        builder.<ListAutoScalingPolicyDetailsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAutoScalingPolicyDetailsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListAutoScalingPolicyDetailsRequest::getOrder,
                ListAutoScalingPolicyDetailsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInspectionItemsRequest, ListInspectionItemsResponse> listInspectionItems =
        genForListInspectionItems();

    private static HttpRequestDef<ListInspectionItemsRequest, ListInspectionItemsResponse> genForListInspectionItems() {
        // basic
        HttpRequestDef.Builder<ListInspectionItemsRequest, ListInspectionItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInspectionItemsRequest.class, ListInspectionItemsResponse.class)
                .withName("ListInspectionItems")
                .withUri("/v1/{project_id}/brain/inspection-jobs/{job_id}/items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getJobId, ListInspectionItemsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getOffset, ListInspectionItemsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getLimit, ListInspectionItemsRequest::setLimit));
        builder.<ListInspectionItemsRequest.InspectionTypeEnum>withRequestField("inspection_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInspectionItemsRequest.InspectionTypeEnum.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getInspectionType,
                ListInspectionItemsRequest::setInspectionType));
        builder.<ListInspectionItemsRequest.ItemCategoryEnum>withRequestField("item_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionItemsRequest.ItemCategoryEnum.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getItemCategory,
                ListInspectionItemsRequest::setItemCategory));
        builder.<ListInspectionItemsRequest.ItemTypeEnum>withRequestField("item_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionItemsRequest.ItemTypeEnum.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getItemType, ListInspectionItemsRequest::setItemType));
        builder.<ListInspectionItemsRequest.ExecuteStatusEnum>withRequestField("execute_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionItemsRequest.ExecuteStatusEnum.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getExecuteStatus,
                ListInspectionItemsRequest::setExecuteStatus));
        builder.<ListInspectionItemsRequest.ResultStatusEnum>withRequestField("result_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionItemsRequest.ResultStatusEnum.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getResultStatus,
                ListInspectionItemsRequest::setResultStatus));
        builder.<ListInspectionItemsRequest.ItemCategoriesEnum>withRequestField("item_categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionItemsRequest.ItemCategoriesEnum.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getItemCategories,
                ListInspectionItemsRequest::setItemCategories));
        builder.<ListInspectionItemsRequest.ItemTypesEnum>withRequestField("item_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionItemsRequest.ItemTypesEnum.class),
            f -> f.withMarshaller(ListInspectionItemsRequest::getItemTypes, ListInspectionItemsRequest::setItemTypes));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInspectionItemsResponse::getXRequestId,
                ListInspectionItemsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInspectionJobsRequest, ListInspectionJobsResponse> listInspectionJobs =
        genForListInspectionJobs();

    private static HttpRequestDef<ListInspectionJobsRequest, ListInspectionJobsResponse> genForListInspectionJobs() {
        // basic
        HttpRequestDef.Builder<ListInspectionJobsRequest, ListInspectionJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInspectionJobsRequest.class, ListInspectionJobsResponse.class)
                .withName("ListInspectionJobs")
                .withUri("/v1/{project_id}/brain/inspection-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getId, ListInspectionJobsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getName, ListInspectionJobsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getOffset, ListInspectionJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getLimit, ListInspectionJobsRequest::setLimit));
        builder.<ListInspectionJobsRequest.InspectionTypeEnum>withRequestField("inspection_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionJobsRequest.InspectionTypeEnum.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getInspectionType,
                ListInspectionJobsRequest::setInspectionType));
        builder.<ListInspectionJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getStatus, ListInspectionJobsRequest::setStatus));
        builder.<ListInspectionJobsRequest.ResultStatusEnum>withRequestField("result_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionJobsRequest.ResultStatusEnum.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getResultStatus,
                ListInspectionJobsRequest::setResultStatus));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getCreator, ListInspectionJobsRequest::setCreator));
        builder.<String>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getCreateStartTime,
                ListInspectionJobsRequest::setCreateStartTime));
        builder.<String>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getCreateEndTime,
                ListInspectionJobsRequest::setCreateEndTime));
        builder.<String>withRequestField("update_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getUpdateStartTime,
                ListInspectionJobsRequest::setUpdateStartTime));
        builder.<String>withRequestField("update_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getUpdateEndTime,
                ListInspectionJobsRequest::setUpdateEndTime));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getWorkspaceId,
                ListInspectionJobsRequest::setWorkspaceId));
        builder.<ListInspectionJobsRequest.ModelartsOfferingTypeEnum>withRequestField("modelarts_offering_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionJobsRequest.ModelartsOfferingTypeEnum.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getModelartsOfferingType,
                ListInspectionJobsRequest::setModelartsOfferingType));
        builder.<ListInspectionJobsRequest.DiagnosisObjectEnum>withRequestField("diagnosis_object",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionJobsRequest.DiagnosisObjectEnum.class),
            f -> f.withMarshaller(ListInspectionJobsRequest::getDiagnosisObject,
                ListInspectionJobsRequest::setDiagnosisObject));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInspectionJobsResponse::getXRequestId,
                ListInspectionJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInspectionNodesRequest, ListInspectionNodesResponse> listInspectionNodes =
        genForListInspectionNodes();

    private static HttpRequestDef<ListInspectionNodesRequest, ListInspectionNodesResponse> genForListInspectionNodes() {
        // basic
        HttpRequestDef.Builder<ListInspectionNodesRequest, ListInspectionNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInspectionNodesRequest.class, ListInspectionNodesResponse.class)
                .withName("ListInspectionNodes")
                .withUri("/v1/{project_id}/brain/inspection-jobs/{job_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getJobId, ListInspectionNodesRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getOffset, ListInspectionNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getLimit, ListInspectionNodesRequest::setLimit));
        builder.<ListInspectionNodesRequest.InspectionTypeEnum>withRequestField("inspection_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInspectionNodesRequest.InspectionTypeEnum.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getInspectionType,
                ListInspectionNodesRequest::setInspectionType));
        builder.<ListInspectionNodesRequest.ItemCategoryEnum>withRequestField("item_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionNodesRequest.ItemCategoryEnum.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getItemCategory,
                ListInspectionNodesRequest::setItemCategory));
        builder.<ListInspectionNodesRequest.ExecuteStatusEnum>withRequestField("execute_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionNodesRequest.ExecuteStatusEnum.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getExecuteStatus,
                ListInspectionNodesRequest::setExecuteStatus));
        builder.<ListInspectionNodesRequest.ResultStatusEnum>withRequestField("result_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionNodesRequest.ResultStatusEnum.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getResultStatus,
                ListInspectionNodesRequest::setResultStatus));
        builder.<String>withRequestField("node_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getNodeName, ListInspectionNodesRequest::setNodeName));
        builder.<String>withRequestField("node_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getNodeIp, ListInspectionNodesRequest::setNodeIp));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getServerId, ListInspectionNodesRequest::setServerId));
        builder.<ListInspectionNodesRequest.ItemTypeEnum>withRequestField("item_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionNodesRequest.ItemTypeEnum.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getItemType, ListInspectionNodesRequest::setItemType));
        builder.<ListInspectionNodesRequest.ItemCategoriesEnum>withRequestField("item_categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionNodesRequest.ItemCategoriesEnum.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getItemCategories,
                ListInspectionNodesRequest::setItemCategories));
        builder.<ListInspectionNodesRequest.ItemTypesEnum>withRequestField("item_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInspectionNodesRequest.ItemTypesEnum.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getItemTypes, ListInspectionNodesRequest::setItemTypes));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionNodesRequest::getNodeId, ListInspectionNodesRequest::setNodeId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInspectionNodesResponse::getXRequestId,
                ListInspectionNodesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListLogDiagnosisJobsRequest, ListLogDiagnosisJobsResponse> listLogDiagnosisJobs =
        genForListLogDiagnosisJobs();

    private static HttpRequestDef<ListLogDiagnosisJobsRequest, ListLogDiagnosisJobsResponse> genForListLogDiagnosisJobs() {
        // basic
        HttpRequestDef.Builder<ListLogDiagnosisJobsRequest, ListLogDiagnosisJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLogDiagnosisJobsRequest.class, ListLogDiagnosisJobsResponse.class)
            .withName("ListLogDiagnosisJobs")
            .withUri("/v1/{project_id}/brain/log-diagnosis-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getId, ListLogDiagnosisJobsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getName, ListLogDiagnosisJobsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getOffset, ListLogDiagnosisJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getLimit, ListLogDiagnosisJobsRequest::setLimit));
        builder.<ListLogDiagnosisJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLogDiagnosisJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getStatus, ListLogDiagnosisJobsRequest::setStatus));
        builder.<ListLogDiagnosisJobsRequest.ResultStatusEnum>withRequestField("result_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLogDiagnosisJobsRequest.ResultStatusEnum.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getResultStatus,
                ListLogDiagnosisJobsRequest::setResultStatus));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getCreator, ListLogDiagnosisJobsRequest::setCreator));
        builder.<String>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getCreateStartTime,
                ListLogDiagnosisJobsRequest::setCreateStartTime));
        builder.<String>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getCreateEndTime,
                ListLogDiagnosisJobsRequest::setCreateEndTime));
        builder.<String>withRequestField("update_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getUpdateStartTime,
                ListLogDiagnosisJobsRequest::setUpdateStartTime));
        builder.<String>withRequestField("update_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getUpdateEndTime,
                ListLogDiagnosisJobsRequest::setUpdateEndTime));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogDiagnosisJobsRequest::getWorkspaceId,
                ListLogDiagnosisJobsRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLogDiagnosisJobsResponse::getXRequestId,
                ListLogDiagnosisJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkDiagnosisJobAlarmRequest, ListNetworkDiagnosisJobAlarmResponse> listNetworkDiagnosisJobAlarm =
        genForListNetworkDiagnosisJobAlarm();

    private static HttpRequestDef<ListNetworkDiagnosisJobAlarmRequest, ListNetworkDiagnosisJobAlarmResponse> genForListNetworkDiagnosisJobAlarm() {
        // basic
        HttpRequestDef.Builder<ListNetworkDiagnosisJobAlarmRequest, ListNetworkDiagnosisJobAlarmResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNetworkDiagnosisJobAlarmRequest.class,
                    ListNetworkDiagnosisJobAlarmResponse.class)
                .withName("ListNetworkDiagnosisJobAlarm")
                .withUri("/v1/{project_id}/brain/network-diagnosis-jobs/{job_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobAlarmRequest::getJobId,
                ListNetworkDiagnosisJobAlarmRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobAlarmRequest::getOffset,
                ListNetworkDiagnosisJobAlarmRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobAlarmRequest::getLimit,
                ListNetworkDiagnosisJobAlarmRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobAlarmRequest::getStartTime,
                ListNetworkDiagnosisJobAlarmRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobAlarmRequest::getEndTime,
                ListNetworkDiagnosisJobAlarmRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNetworkDiagnosisJobAlarmResponse::getXRequestId,
                ListNetworkDiagnosisJobAlarmResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkDiagnosisJobProxyResponseDelimitRequest, ListNetworkDiagnosisJobProxyResponseDelimitResponse> listNetworkDiagnosisJobProxyResponseDelimit =
        genForListNetworkDiagnosisJobProxyResponseDelimit();

    private static HttpRequestDef<ListNetworkDiagnosisJobProxyResponseDelimitRequest, ListNetworkDiagnosisJobProxyResponseDelimitResponse> genForListNetworkDiagnosisJobProxyResponseDelimit() {
        // basic
        HttpRequestDef.Builder<ListNetworkDiagnosisJobProxyResponseDelimitRequest, ListNetworkDiagnosisJobProxyResponseDelimitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNetworkDiagnosisJobProxyResponseDelimitRequest.class,
                    ListNetworkDiagnosisJobProxyResponseDelimitResponse.class)
                .withName("ListNetworkDiagnosisJobProxyResponseDelimit")
                .withUri("/v1/{project_id}/brain/network-diagnosis-jobs/{job_id}/proxy-response-delimit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobProxyResponseDelimitRequest::getJobId,
                ListNetworkDiagnosisJobProxyResponseDelimitRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobProxyResponseDelimitRequest::getOffset,
                ListNetworkDiagnosisJobProxyResponseDelimitRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobProxyResponseDelimitRequest::getLimit,
                ListNetworkDiagnosisJobProxyResponseDelimitRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNetworkDiagnosisJobProxyResponseDelimitResponse::getXRequestId,
                ListNetworkDiagnosisJobProxyResponseDelimitResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkDiagnosisJobsRequest, ListNetworkDiagnosisJobsResponse> listNetworkDiagnosisJobs =
        genForListNetworkDiagnosisJobs();

    private static HttpRequestDef<ListNetworkDiagnosisJobsRequest, ListNetworkDiagnosisJobsResponse> genForListNetworkDiagnosisJobs() {
        // basic
        HttpRequestDef.Builder<ListNetworkDiagnosisJobsRequest, ListNetworkDiagnosisJobsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListNetworkDiagnosisJobsRequest.class, ListNetworkDiagnosisJobsResponse.class)
                .withName("ListNetworkDiagnosisJobs")
                .withUri("/v1/{project_id}/brain/network-diagnosis-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getId, ListNetworkDiagnosisJobsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getName, ListNetworkDiagnosisJobsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getOffset,
                ListNetworkDiagnosisJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getLimit,
                ListNetworkDiagnosisJobsRequest::setLimit));
        builder.<ListNetworkDiagnosisJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNetworkDiagnosisJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getStatus,
                ListNetworkDiagnosisJobsRequest::setStatus));
        builder.<String>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getCreateStartTime,
                ListNetworkDiagnosisJobsRequest::setCreateStartTime));
        builder.<String>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getCreateEndTime,
                ListNetworkDiagnosisJobsRequest::setCreateEndTime));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkDiagnosisJobsRequest::getWorkspaceId,
                ListNetworkDiagnosisJobsRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNetworkDiagnosisJobsResponse::getXRequestId,
                ListNetworkDiagnosisJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListProfilingDiagnosisJobsRequest, ListProfilingDiagnosisJobsResponse> listProfilingDiagnosisJobs =
        genForListProfilingDiagnosisJobs();

    private static HttpRequestDef<ListProfilingDiagnosisJobsRequest, ListProfilingDiagnosisJobsResponse> genForListProfilingDiagnosisJobs() {
        // basic
        HttpRequestDef.Builder<ListProfilingDiagnosisJobsRequest, ListProfilingDiagnosisJobsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProfilingDiagnosisJobsRequest.class,
                    ListProfilingDiagnosisJobsResponse.class)
                .withName("ListProfilingDiagnosisJobs")
                .withUri("/v1/{project_id}/brain/profiling-diagnosis-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getId, ListProfilingDiagnosisJobsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getName,
                ListProfilingDiagnosisJobsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getOffset,
                ListProfilingDiagnosisJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getLimit,
                ListProfilingDiagnosisJobsRequest::setLimit));
        builder.<ListProfilingDiagnosisJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProfilingDiagnosisJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getStatus,
                ListProfilingDiagnosisJobsRequest::setStatus));
        builder.<ListProfilingDiagnosisJobsRequest.ResultStatusEnum>withRequestField("result_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProfilingDiagnosisJobsRequest.ResultStatusEnum.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getResultStatus,
                ListProfilingDiagnosisJobsRequest::setResultStatus));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getCreator,
                ListProfilingDiagnosisJobsRequest::setCreator));
        builder.<String>withRequestField("create_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getCreateStartTime,
                ListProfilingDiagnosisJobsRequest::setCreateStartTime));
        builder.<String>withRequestField("create_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getCreateEndTime,
                ListProfilingDiagnosisJobsRequest::setCreateEndTime));
        builder.<String>withRequestField("update_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getUpdateStartTime,
                ListProfilingDiagnosisJobsRequest::setUpdateStartTime));
        builder.<String>withRequestField("update_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getUpdateEndTime,
                ListProfilingDiagnosisJobsRequest::setUpdateEndTime));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilingDiagnosisJobsRequest::getWorkspaceId,
                ListProfilingDiagnosisJobsRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProfilingDiagnosisJobsResponse::getXRequestId,
                ListProfilingDiagnosisJobsResponse::setXRequestId));
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

    public static final HttpRequestDef<ShowAutoScalingPolicyDetailRequest, ShowAutoScalingPolicyDetailResponse> showAutoScalingPolicyDetail =
        genForShowAutoScalingPolicyDetail();

    private static HttpRequestDef<ShowAutoScalingPolicyDetailRequest, ShowAutoScalingPolicyDetailResponse> genForShowAutoScalingPolicyDetail() {
        // basic
        HttpRequestDef.Builder<ShowAutoScalingPolicyDetailRequest, ShowAutoScalingPolicyDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAutoScalingPolicyDetailRequest.class,
                    ShowAutoScalingPolicyDetailResponse.class)
                .withName("ShowAutoScalingPolicyDetail")
                .withUri("/v1/{project_id}/services/{service_id}/models/{model_id}/auto-scaling-policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyDetailRequest::getServiceId,
                ShowAutoScalingPolicyDetailRequest::setServiceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyDetailRequest::getModelId,
                ShowAutoScalingPolicyDetailRequest::setModelId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyDetailRequest::getPolicyId,
                ShowAutoScalingPolicyDetailRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInspectionJobRequest, ShowInspectionJobResponse> showInspectionJob =
        genForShowInspectionJob();

    private static HttpRequestDef<ShowInspectionJobRequest, ShowInspectionJobResponse> genForShowInspectionJob() {
        // basic
        HttpRequestDef.Builder<ShowInspectionJobRequest, ShowInspectionJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInspectionJobRequest.class, ShowInspectionJobResponse.class)
                .withName("ShowInspectionJob")
                .withUri("/v1/{project_id}/brain/inspection-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInspectionJobRequest::getJobId, ShowInspectionJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowInspectionJobResponse::getXRequestId, ShowInspectionJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowInspectionStatisticsRequest, ShowInspectionStatisticsResponse> showInspectionStatistics =
        genForShowInspectionStatistics();

    private static HttpRequestDef<ShowInspectionStatisticsRequest, ShowInspectionStatisticsResponse> genForShowInspectionStatistics() {
        // basic
        HttpRequestDef.Builder<ShowInspectionStatisticsRequest, ShowInspectionStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowInspectionStatisticsRequest.class, ShowInspectionStatisticsResponse.class)
                .withName("ShowInspectionStatistics")
                .withUri("/v1/{project_id}/brain/inspection-jobs/{job_id}/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInspectionStatisticsRequest::getJobId,
                ShowInspectionStatisticsRequest::setJobId));
        builder.<ShowInspectionStatisticsRequest.InspectionTypeEnum>withRequestField("inspection_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInspectionStatisticsRequest.InspectionTypeEnum.class),
            f -> f.withMarshaller(ShowInspectionStatisticsRequest::getInspectionType,
                ShowInspectionStatisticsRequest::setInspectionType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowInspectionStatisticsResponse::getXRequestId,
                ShowInspectionStatisticsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLogDiagnosisJobRequest, ShowLogDiagnosisJobResponse> showLogDiagnosisJob =
        genForShowLogDiagnosisJob();

    private static HttpRequestDef<ShowLogDiagnosisJobRequest, ShowLogDiagnosisJobResponse> genForShowLogDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<ShowLogDiagnosisJobRequest, ShowLogDiagnosisJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLogDiagnosisJobRequest.class, ShowLogDiagnosisJobResponse.class)
                .withName("ShowLogDiagnosisJob")
                .withUri("/v1/{project_id}/brain/log-diagnosis-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogDiagnosisJobRequest::getJobId, ShowLogDiagnosisJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLogDiagnosisJobResponse::getXRequestId,
                ShowLogDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLogDiagnosisJobResultRequest, ShowLogDiagnosisJobResultResponse> showLogDiagnosisJobResult =
        genForShowLogDiagnosisJobResult();

    private static HttpRequestDef<ShowLogDiagnosisJobResultRequest, ShowLogDiagnosisJobResultResponse> genForShowLogDiagnosisJobResult() {
        // basic
        HttpRequestDef.Builder<ShowLogDiagnosisJobResultRequest, ShowLogDiagnosisJobResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLogDiagnosisJobResultRequest.class,
                    ShowLogDiagnosisJobResultResponse.class)
                .withName("ShowLogDiagnosisJobResult")
                .withUri("/v1/{project_id}/brain/log-diagnosis-jobs/{job_id}/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogDiagnosisJobResultRequest::getJobId,
                ShowLogDiagnosisJobResultRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLogDiagnosisJobResultResponse::getXRequestId,
                ShowLogDiagnosisJobResultResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowProfilingDiagnosisJobRequest, ShowProfilingDiagnosisJobResponse> showProfilingDiagnosisJob =
        genForShowProfilingDiagnosisJob();

    private static HttpRequestDef<ShowProfilingDiagnosisJobRequest, ShowProfilingDiagnosisJobResponse> genForShowProfilingDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<ShowProfilingDiagnosisJobRequest, ShowProfilingDiagnosisJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProfilingDiagnosisJobRequest.class,
                    ShowProfilingDiagnosisJobResponse.class)
                .withName("ShowProfilingDiagnosisJob")
                .withUri("/v1/{project_id}/brain/profiling-diagnosis-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProfilingDiagnosisJobRequest::getJobId,
                ShowProfilingDiagnosisJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProfilingDiagnosisJobResponse::getXRequestId,
                ShowProfilingDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowProfilingDiagnosisJobResultRequest, ShowProfilingDiagnosisJobResultResponse> showProfilingDiagnosisJobResult =
        genForShowProfilingDiagnosisJobResult();

    private static HttpRequestDef<ShowProfilingDiagnosisJobResultRequest, ShowProfilingDiagnosisJobResultResponse> genForShowProfilingDiagnosisJobResult() {
        // basic
        HttpRequestDef.Builder<ShowProfilingDiagnosisJobResultRequest, ShowProfilingDiagnosisJobResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProfilingDiagnosisJobResultRequest.class,
                    ShowProfilingDiagnosisJobResultResponse.class)
                .withName("ShowProfilingDiagnosisJobResult")
                .withUri("/v1/{project_id}/brain/profiling-diagnosis-jobs/{job_id}/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProfilingDiagnosisJobResultRequest::getJobId,
                ShowProfilingDiagnosisJobResultRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProfilingDiagnosisJobResultResponse::getXRequestId,
                ShowProfilingDiagnosisJobResultResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopInspectionJobRequest, StopInspectionJobResponse> stopInspectionJob =
        genForStopInspectionJob();

    private static HttpRequestDef<StopInspectionJobRequest, StopInspectionJobResponse> genForStopInspectionJob() {
        // basic
        HttpRequestDef.Builder<StopInspectionJobRequest, StopInspectionJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopInspectionJobRequest.class, StopInspectionJobResponse.class)
                .withName("StopInspectionJob")
                .withUri("/v1/{project_id}/brain/inspection-jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInspectionJobRequest::getJobId, StopInspectionJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopInspectionJobResponse::getXRequestId, StopInspectionJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopLogDiagnosisJobRequest, StopLogDiagnosisJobResponse> stopLogDiagnosisJob =
        genForStopLogDiagnosisJob();

    private static HttpRequestDef<StopLogDiagnosisJobRequest, StopLogDiagnosisJobResponse> genForStopLogDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<StopLogDiagnosisJobRequest, StopLogDiagnosisJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopLogDiagnosisJobRequest.class, StopLogDiagnosisJobResponse.class)
                .withName("StopLogDiagnosisJob")
                .withUri("/v1/{project_id}/brain/log-diagnosis-jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopLogDiagnosisJobRequest::getJobId, StopLogDiagnosisJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopLogDiagnosisJobResponse::getXRequestId,
                StopLogDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopProfilingDiagnosisJobRequest, StopProfilingDiagnosisJobResponse> stopProfilingDiagnosisJob =
        genForStopProfilingDiagnosisJob();

    private static HttpRequestDef<StopProfilingDiagnosisJobRequest, StopProfilingDiagnosisJobResponse> genForStopProfilingDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<StopProfilingDiagnosisJobRequest, StopProfilingDiagnosisJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StopProfilingDiagnosisJobRequest.class,
                    StopProfilingDiagnosisJobResponse.class)
                .withName("StopProfilingDiagnosisJob")
                .withUri("/v1/{project_id}/brain/profiling-diagnosis-jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopProfilingDiagnosisJobRequest::getJobId,
                StopProfilingDiagnosisJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopProfilingDiagnosisJobResponse::getXRequestId,
                StopProfilingDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicy =
        genForUpdateAutoScalingPolicy();

    private static HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> genForUpdateAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAutoScalingPolicyRequest.class, UpdateAutoScalingPolicyResponse.class)
            .withName("UpdateAutoScalingPolicy")
            .withUri("/v1/{project_id}/services/{service_id}/models/{model_id}/auto-scaling-policies/{policy_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getServiceId,
                UpdateAutoScalingPolicyRequest::setServiceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getModelId,
                UpdateAutoScalingPolicyRequest::setModelId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getPolicyId,
                UpdateAutoScalingPolicyRequest::setPolicyId));
        builder.<UpdateAutoScalingPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAutoScalingPolicyReq.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getBody, UpdateAutoScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInspectionJobRequest, UpdateInspectionJobResponse> updateInspectionJob =
        genForUpdateInspectionJob();

    private static HttpRequestDef<UpdateInspectionJobRequest, UpdateInspectionJobResponse> genForUpdateInspectionJob() {
        // basic
        HttpRequestDef.Builder<UpdateInspectionJobRequest, UpdateInspectionJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInspectionJobRequest.class, UpdateInspectionJobResponse.class)
                .withName("UpdateInspectionJob")
                .withUri("/v1/{project_id}/brain/inspection-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInspectionJobRequest::getJobId, UpdateInspectionJobRequest::setJobId));
        builder.<UpdateInspectionJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInspectionJobRequestBody.class),
            f -> f.withMarshaller(UpdateInspectionJobRequest::getBody, UpdateInspectionJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateInspectionJobResponse::getXRequestId,
                UpdateInspectionJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogDiagnosisJobRequest, UpdateLogDiagnosisJobResponse> updateLogDiagnosisJob =
        genForUpdateLogDiagnosisJob();

    private static HttpRequestDef<UpdateLogDiagnosisJobRequest, UpdateLogDiagnosisJobResponse> genForUpdateLogDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<UpdateLogDiagnosisJobRequest, UpdateLogDiagnosisJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateLogDiagnosisJobRequest.class, UpdateLogDiagnosisJobResponse.class)
            .withName("UpdateLogDiagnosisJob")
            .withUri("/v1/{project_id}/brain/log-diagnosis-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogDiagnosisJobRequest::getJobId, UpdateLogDiagnosisJobRequest::setJobId));
        builder.<UpdateLogAnalysisJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogAnalysisJobRequestBody.class),
            f -> f.withMarshaller(UpdateLogDiagnosisJobRequest::getBody, UpdateLogDiagnosisJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLogDiagnosisJobResponse::getXRequestId,
                UpdateLogDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateProfilingDiagnosisJobRequest, UpdateProfilingDiagnosisJobResponse> updateProfilingDiagnosisJob =
        genForUpdateProfilingDiagnosisJob();

    private static HttpRequestDef<UpdateProfilingDiagnosisJobRequest, UpdateProfilingDiagnosisJobResponse> genForUpdateProfilingDiagnosisJob() {
        // basic
        HttpRequestDef.Builder<UpdateProfilingDiagnosisJobRequest, UpdateProfilingDiagnosisJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProfilingDiagnosisJobRequest.class,
                    UpdateProfilingDiagnosisJobResponse.class)
                .withName("UpdateProfilingDiagnosisJob")
                .withUri("/v1/{project_id}/brain/profiling-diagnosis-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProfilingDiagnosisJobRequest::getJobId,
                UpdateProfilingDiagnosisJobRequest::setJobId));
        builder.<UpdateProfilingDiagnosisJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProfilingDiagnosisJobRequestBody.class),
            f -> f.withMarshaller(UpdateProfilingDiagnosisJobRequest::getBody,
                UpdateProfilingDiagnosisJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateProfilingDiagnosisJobResponse::getXRequestId,
                UpdateProfilingDiagnosisJobResponse::setXRequestId));
        return builder.build();
    }

}

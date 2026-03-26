package com.huaweicloud.sdk.dataartsfabricep.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.CancelJobRunRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.CancelJobRunResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ChatCompletionRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ClearJobRunRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ClearJobRunResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteJobRunRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteJobRunResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteServiceInstanceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeployServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeployServiceInstanceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.InvokeModelServiceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.InvokeModelServiceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListJobRunsRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListJobRunsResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListServicesInstancesRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListServicesInstancesResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.RunJobInput;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.RunJobRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.RunJobResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ServiceInstanceInput;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowEpHealthCheckRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowEpHealthCheckResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowJobRunDetailRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowJobRunDetailResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowServiceInstanceDetailRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowServiceInstanceDetailResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.UpdateServiceInstanceInput;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.UpdateServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.UpdateServiceInstanceResponse;

@SuppressWarnings("unchecked")
public class DataArtsFabricEpMeta {

    public static final HttpRequestDef<ShowEpHealthCheckRequest, ShowEpHealthCheckResponse> showEpHealthCheck =
        genForShowEpHealthCheck();

    private static HttpRequestDef<ShowEpHealthCheckRequest, ShowEpHealthCheckResponse> genForShowEpHealthCheck() {
        // basic
        HttpRequestDef.Builder<ShowEpHealthCheckRequest, ShowEpHealthCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEpHealthCheckRequest.class, ShowEpHealthCheckResponse.class)
                .withName("ShowEpHealthCheck")
                .withUri("/healthcheck")
                .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowEpHealthCheckResponse::getBody, ShowEpHealthCheckResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CancelJobRunRequest, CancelJobRunResponse> cancelJobRun = genForCancelJobRun();

    private static HttpRequestDef<CancelJobRunRequest, CancelJobRunResponse> genForCancelJobRun() {
        // basic
        HttpRequestDef.Builder<CancelJobRunRequest, CancelJobRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelJobRunRequest.class, CancelJobRunResponse.class)
                .withName("CancelJobRun")
                .withUri("/v1/workspaces/{workspace_id}/jobs/runs/{run_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRunRequest::getWorkspaceId, CancelJobRunRequest::setWorkspaceId));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRunRequest::getRunId, CancelJobRunRequest::setRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ClearJobRunRequest, ClearJobRunResponse> clearJobRun = genForClearJobRun();

    private static HttpRequestDef<ClearJobRunRequest, ClearJobRunResponse> genForClearJobRun() {
        // basic
        HttpRequestDef.Builder<ClearJobRunRequest, ClearJobRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, ClearJobRunRequest.class, ClearJobRunResponse.class)
                .withName("ClearJobRun")
                .withUri("/v1/workspaces/{workspace_id}/endpoints/{endpoint_id}/jobs/runs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ClearJobRunRequest::getWorkspaceId, ClearJobRunRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ClearJobRunRequest::getEndpointId, ClearJobRunRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRunRequest, DeleteJobRunResponse> deleteJobRun = genForDeleteJobRun();

    private static HttpRequestDef<DeleteJobRunRequest, DeleteJobRunResponse> genForDeleteJobRun() {
        // basic
        HttpRequestDef.Builder<DeleteJobRunRequest, DeleteJobRunResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRunRequest.class, DeleteJobRunResponse.class)
                .withName("DeleteJobRun")
                .withUri("/v1/workspaces/{workspace_id}/jobs/runs/{run_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRunRequest::getWorkspaceId, DeleteJobRunRequest::setWorkspaceId));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRunRequest::getRunId, DeleteJobRunRequest::setRunId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobRunsRequest, ListJobRunsResponse> listJobRuns = genForListJobRuns();

    private static HttpRequestDef<ListJobRunsRequest, ListJobRunsResponse> genForListJobRuns() {
        // basic
        HttpRequestDef.Builder<ListJobRunsRequest, ListJobRunsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobRunsRequest.class, ListJobRunsResponse.class)
                .withName("ListJobRuns")
                .withUri("/v1/workspaces/{workspace_id}/jobs/runs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRunsRequest::getWorkspaceId, ListJobRunsRequest::setWorkspaceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRunsRequest::getId, ListJobRunsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRunsRequest::getName, ListJobRunsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRunsRequest::getLimit, ListJobRunsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRunsRequest::getOffset, ListJobRunsRequest::setOffset));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRunsRequest::getJobId, ListJobRunsRequest::setJobId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRunsRequest::getEndpointId, ListJobRunsRequest::setEndpointId));
        builder.<String>withRequestField("version_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRunsRequest::getVersionId, ListJobRunsRequest::setVersionId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRunsRequest::getStatus, ListJobRunsRequest::setStatus));
        builder.<ListJobRunsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobRunsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListJobRunsRequest::getType, ListJobRunsRequest::setType));
        builder.<ListJobRunsRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobRunsRequest.SortByEnum.class),
            f -> f.withMarshaller(ListJobRunsRequest::getSortBy, ListJobRunsRequest::setSortBy));
        builder.<ListJobRunsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobRunsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListJobRunsRequest::getOrderBy, ListJobRunsRequest::setOrderBy));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListJobRunsResponse::getXRequestId, ListJobRunsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RunJobRequest, RunJobResponse> runJob = genForRunJob();

    private static HttpRequestDef<RunJobRequest, RunJobResponse> genForRunJob() {
        // basic
        HttpRequestDef.Builder<RunJobRequest, RunJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunJobRequest.class, RunJobResponse.class)
                .withName("RunJob")
                .withUri("/v1/workspaces/{workspace_id}/jobs/runs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunJobRequest::getWorkspaceId, RunJobRequest::setWorkspaceId));
        builder.<RunJobInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunJobInput.class),
            f -> f.withMarshaller(RunJobRequest::getBody, RunJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRunDetailRequest, ShowJobRunDetailResponse> showJobRunDetail =
        genForShowJobRunDetail();

    private static HttpRequestDef<ShowJobRunDetailRequest, ShowJobRunDetailResponse> genForShowJobRunDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobRunDetailRequest, ShowJobRunDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRunDetailRequest.class, ShowJobRunDetailResponse.class)
                .withName("ShowJobRunDetail")
                .withUri("/v1/workspaces/{workspace_id}/jobs/runs/{run_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRunDetailRequest::getWorkspaceId, ShowJobRunDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("run_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRunDetailRequest::getRunId, ShowJobRunDetailRequest::setRunId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowJobRunDetailResponse::getXRequestId, ShowJobRunDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<InvokeModelServiceRequest, InvokeModelServiceResponse> invokeModelService =
        genForInvokeModelService();

    private static HttpRequestDef<InvokeModelServiceRequest, InvokeModelServiceResponse> genForInvokeModelService() {
        // basic
        HttpRequestDef.Builder<InvokeModelServiceRequest, InvokeModelServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InvokeModelServiceRequest.class, InvokeModelServiceResponse.class)
                .withName("InvokeModelService")
                .withUri("/v1/workspaces/{workspace_id}/services/instances/{instance_id}/invocations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeModelServiceRequest::getWorkspaceId,
                InvokeModelServiceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeModelServiceRequest::getInstanceId, InvokeModelServiceRequest::setInstanceId));
        builder.<ChatCompletionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChatCompletionRequest.class),
            f -> f.withMarshaller(InvokeModelServiceRequest::getBody, InvokeModelServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceInstanceRequest, DeleteServiceInstanceResponse> deleteServiceInstance =
        genForDeleteServiceInstance();

    private static HttpRequestDef<DeleteServiceInstanceRequest, DeleteServiceInstanceResponse> genForDeleteServiceInstance() {
        // basic
        HttpRequestDef.Builder<DeleteServiceInstanceRequest, DeleteServiceInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteServiceInstanceRequest.class, DeleteServiceInstanceResponse.class)
            .withName("DeleteServiceInstance")
            .withUri("/v1/workspaces/{workspace_id}/services/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceInstanceRequest::getWorkspaceId,
                DeleteServiceInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceInstanceRequest::getInstanceId,
                DeleteServiceInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployServiceInstanceRequest, DeployServiceInstanceResponse> deployServiceInstance =
        genForDeployServiceInstance();

    private static HttpRequestDef<DeployServiceInstanceRequest, DeployServiceInstanceResponse> genForDeployServiceInstance() {
        // basic
        HttpRequestDef.Builder<DeployServiceInstanceRequest, DeployServiceInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeployServiceInstanceRequest.class, DeployServiceInstanceResponse.class)
            .withName("DeployServiceInstance")
            .withUri("/v1/workspaces/{workspace_id}/services/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployServiceInstanceRequest::getWorkspaceId,
                DeployServiceInstanceRequest::setWorkspaceId));
        builder.<ServiceInstanceInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ServiceInstanceInput.class),
            f -> f.withMarshaller(DeployServiceInstanceRequest::getBody, DeployServiceInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicesInstancesRequest, ListServicesInstancesResponse> listServicesInstances =
        genForListServicesInstances();

    private static HttpRequestDef<ListServicesInstancesRequest, ListServicesInstancesResponse> genForListServicesInstances() {
        // basic
        HttpRequestDef.Builder<ListServicesInstancesRequest, ListServicesInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServicesInstancesRequest.class, ListServicesInstancesResponse.class)
            .withName("ListServicesInstances")
            .withUri("/v1/workspaces/{workspace_id}/services/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getWorkspaceId,
                ListServicesInstancesRequest::setWorkspaceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getId, ListServicesInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getName, ListServicesInstancesRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getLimit, ListServicesInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getOffset, ListServicesInstancesRequest::setOffset));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getEndpointId,
                ListServicesInstancesRequest::setEndpointId));
        builder.<String>withRequestField("source_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getSourceId,
                ListServicesInstancesRequest::setSourceId));
        builder.<String>withRequestField("version_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getVersionId,
                ListServicesInstancesRequest::setVersionId));
        builder.<ListServicesInstancesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicesInstancesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getType, ListServicesInstancesRequest::setType));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getVisibility,
                ListServicesInstancesRequest::setVisibility));
        builder.<ListServicesInstancesRequest.SortByEnum>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicesInstancesRequest.SortByEnum.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getSortBy, ListServicesInstancesRequest::setSortBy));
        builder.<ListServicesInstancesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicesInstancesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListServicesInstancesRequest::getOrderBy, ListServicesInstancesRequest::setOrderBy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServiceInstanceDetailRequest, ShowServiceInstanceDetailResponse> showServiceInstanceDetail =
        genForShowServiceInstanceDetail();

    private static HttpRequestDef<ShowServiceInstanceDetailRequest, ShowServiceInstanceDetailResponse> genForShowServiceInstanceDetail() {
        // basic
        HttpRequestDef.Builder<ShowServiceInstanceDetailRequest, ShowServiceInstanceDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowServiceInstanceDetailRequest.class,
                    ShowServiceInstanceDetailResponse.class)
                .withName("ShowServiceInstanceDetail")
                .withUri("/v1/workspaces/{workspace_id}/services/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceInstanceDetailRequest::getWorkspaceId,
                ShowServiceInstanceDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceInstanceDetailRequest::getInstanceId,
                ShowServiceInstanceDetailRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceInstanceRequest, UpdateServiceInstanceResponse> updateServiceInstance =
        genForUpdateServiceInstance();

    private static HttpRequestDef<UpdateServiceInstanceRequest, UpdateServiceInstanceResponse> genForUpdateServiceInstance() {
        // basic
        HttpRequestDef.Builder<UpdateServiceInstanceRequest, UpdateServiceInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateServiceInstanceRequest.class, UpdateServiceInstanceResponse.class)
            .withName("UpdateServiceInstance")
            .withUri("/v1/workspaces/{workspace_id}/services/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceInstanceRequest::getWorkspaceId,
                UpdateServiceInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceInstanceRequest::getInstanceId,
                UpdateServiceInstanceRequest::setInstanceId));
        builder.<UpdateServiceInstanceInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateServiceInstanceInput.class),
            f -> f.withMarshaller(UpdateServiceInstanceRequest::getBody, UpdateServiceInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateServiceInstanceResponse::getXRequestId,
                UpdateServiceInstanceResponse::setXRequestId));
        return builder.build();
    }

}

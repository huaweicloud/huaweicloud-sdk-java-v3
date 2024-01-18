package com.huaweicloud.sdk.mrs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mrs.v2.model.AddComponentRequest;
import com.huaweicloud.sdk.mrs.v2.model.AddComponentResponse;
import com.huaweicloud.sdk.mrs.v2.model.AddComponentsReq;
import com.huaweicloud.sdk.mrs.v2.model.AgencyMappingArray;
import com.huaweicloud.sdk.mrs.v2.model.AutoScalingPolicyDeleteReq;
import com.huaweicloud.sdk.mrs.v2.model.AutoScalingPolicyV2;
import com.huaweicloud.sdk.mrs.v2.model.BatchDeleteJobsRequest;
import com.huaweicloud.sdk.mrs.v2.model.BatchDeleteJobsResponse;
import com.huaweicloud.sdk.mrs.v2.model.CancelSqlRequest;
import com.huaweicloud.sdk.mrs.v2.model.CancelSqlResponse;
import com.huaweicloud.sdk.mrs.v2.model.CancelSyncIamUserRequest;
import com.huaweicloud.sdk.mrs.v2.model.CancelSyncIamUserResponse;
import com.huaweicloud.sdk.mrs.v2.model.CancelSyncRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterReqV2;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateExecuteJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateExecuteJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.DataConnectorReq;
import com.huaweicloud.sdk.mrs.v2.model.DeleteAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.DeleteAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.DeleteDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.DeleteDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.ExecuteSqlRequest;
import com.huaweicloud.sdk.mrs.v2.model.ExecuteSqlResponse;
import com.huaweicloud.sdk.mrs.v2.model.ExpandClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.ExpandClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.ExpandParam;
import com.huaweicloud.sdk.mrs.v2.model.JobBatchDelete;
import com.huaweicloud.sdk.mrs.v2.model.JobExecution;
import com.huaweicloud.sdk.mrs.v2.model.ListDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.ListDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.ModifyDefaultTagsRequestBody;
import com.huaweicloud.sdk.mrs.v2.model.RunJobFlowCommand;
import com.huaweicloud.sdk.mrs.v2.model.RunJobFlowRequest;
import com.huaweicloud.sdk.mrs.v2.model.RunJobFlowResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowAgencyMappingRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowAgencyMappingResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowHdfsFileListRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowHdfsFileListResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowJobExeListNewRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowJobExeListNewResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsFlavorsRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsFlavorsResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSyncIamUserRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSyncIamUserResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagQuotaRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagQuotaResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagStatusRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagStatusResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkParam;
import com.huaweicloud.sdk.mrs.v2.model.SqlExecutionReq;
import com.huaweicloud.sdk.mrs.v2.model.StopJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.StopJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.SwitchClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v2.model.SwitchClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterReq;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateSyncIamUserRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateSyncIamUserResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateSyncRequest;

import java.util.List;

@SuppressWarnings("unchecked")
public class MrsMeta {

    public static final HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobs =
        genForBatchDeleteJobs();

    private static HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> genForBatchDeleteJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteJobsRequest, BatchDeleteJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteJobsRequest.class, BatchDeleteJobsResponse.class)
                .withName("BatchDeleteJobs")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/job-executions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteJobsRequest::getClusterId, BatchDeleteJobsRequest::setClusterId));
        builder.<JobBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobBatchDelete.class),
            f -> f.withMarshaller(BatchDeleteJobsRequest::getBody, BatchDeleteJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> createAutoScalingPolicy =
        genForCreateAutoScalingPolicy();

    private static HttpRequestDef<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> genForCreateAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAutoScalingPolicyRequest.class, CreateAutoScalingPolicyResponse.class)
            .withName("CreateAutoScalingPolicy")
            .withUri("/v2/{project_id}/autoscaling-policy/{cluster_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoScalingPolicyRequest::getClusterId,
                CreateAutoScalingPolicyRequest::setClusterId));
        builder.<AutoScalingPolicyV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AutoScalingPolicyV2.class),
            f -> f.withMarshaller(CreateAutoScalingPolicyRequest::getBody, CreateAutoScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForCreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForCreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v2/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterReqV2.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, CreateClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExecuteJobRequest, CreateExecuteJobResponse> createExecuteJob =
        genForCreateExecuteJob();

    private static HttpRequestDef<CreateExecuteJobRequest, CreateExecuteJobResponse> genForCreateExecuteJob() {
        // basic
        HttpRequestDef.Builder<CreateExecuteJobRequest, CreateExecuteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateExecuteJobRequest.class, CreateExecuteJobResponse.class)
                .withName("CreateExecuteJob")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/job-executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExecuteJobRequest::getClusterId, CreateExecuteJobRequest::setClusterId));
        builder.<JobExecution>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobExecution.class),
            f -> f.withMarshaller(CreateExecuteJobRequest::getBody, CreateExecuteJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicy =
        genForDeleteAutoScalingPolicy();

    private static HttpRequestDef<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> genForDeleteAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAutoScalingPolicyRequest.class, DeleteAutoScalingPolicyResponse.class)
            .withName("DeleteAutoScalingPolicy")
            .withUri("/v2/{project_id}/autoscaling-policy/{cluster_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoScalingPolicyRequest::getClusterId,
                DeleteAutoScalingPolicyRequest::setClusterId));
        builder.<AutoScalingPolicyDeleteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AutoScalingPolicyDeleteReq.class),
            f -> f.withMarshaller(DeleteAutoScalingPolicyRequest::getBody, DeleteAutoScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunJobFlowRequest, RunJobFlowResponse> runJobFlow = genForRunJobFlow();

    private static HttpRequestDef<RunJobFlowRequest, RunJobFlowResponse> genForRunJobFlow() {
        // basic
        HttpRequestDef.Builder<RunJobFlowRequest, RunJobFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunJobFlowRequest.class, RunJobFlowResponse.class)
                .withName("RunJobFlow")
                .withUri("/v2/{project_id}/run-job-flow")
                .withContentType("application/json");

        // requests
        builder.<RunJobFlowCommand>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunJobFlowCommand.class),
            f -> f.withMarshaller(RunJobFlowRequest::getBody, RunJobFlowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyMappingRequest, ShowAgencyMappingResponse> showAgencyMapping =
        genForShowAgencyMapping();

    private static HttpRequestDef<ShowAgencyMappingRequest, ShowAgencyMappingResponse> genForShowAgencyMapping() {
        // basic
        HttpRequestDef.Builder<ShowAgencyMappingRequest, ShowAgencyMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyMappingRequest.class, ShowAgencyMappingResponse.class)
                .withName("ShowAgencyMapping")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/agency-mapping")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgencyMappingRequest::getClusterId, ShowAgencyMappingRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicy =
        genForShowAutoScalingPolicy();

    private static HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> genForShowAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoScalingPolicyRequest.class, ShowAutoScalingPolicyResponse.class)
            .withName("ShowAutoScalingPolicy")
            .withUri("/v2/{project_id}/autoscaling-policy/{cluster_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyRequest::getClusterId,
                ShowAutoScalingPolicyRequest::setClusterId));

        // response
        builder.<List<AutoScalingPolicyV2>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyResponse::getBody, ShowAutoScalingPolicyResponse::setBody)
                .withInnerContainerType(AutoScalingPolicyV2.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobExeListNewRequest, ShowJobExeListNewResponse> showJobExeListNew =
        genForShowJobExeListNew();

    private static HttpRequestDef<ShowJobExeListNewRequest, ShowJobExeListNewResponse> genForShowJobExeListNew() {
        // basic
        HttpRequestDef.Builder<ShowJobExeListNewRequest, ShowJobExeListNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobExeListNewRequest.class, ShowJobExeListNewResponse.class)
                .withName("ShowJobExeListNew")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/job-executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getClusterId, ShowJobExeListNewRequest::setClusterId));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobName, ShowJobExeListNewRequest::setJobName));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobId, ShowJobExeListNewRequest::setJobId));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getUser, ShowJobExeListNewRequest::setUser));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobType, ShowJobExeListNewRequest::setJobType));
        builder.<ShowJobExeListNewRequest.JobStateEnum>withRequestField("job_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobExeListNewRequest.JobStateEnum.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobState, ShowJobExeListNewRequest::setJobState));
        builder.<ShowJobExeListNewRequest.JobResultEnum>withRequestField("job_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobExeListNewRequest.JobResultEnum.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobResult, ShowJobExeListNewRequest::setJobResult));
        builder.<String>withRequestField("queue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getQueue, ShowJobExeListNewRequest::setQueue));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getLimit, ShowJobExeListNewRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getOffset, ShowJobExeListNewRequest::setOffset));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSortBy, ShowJobExeListNewRequest::setSortBy));
        builder.<Long>withRequestField("submitted_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSubmittedTimeBegin,
                ShowJobExeListNewRequest::setSubmittedTimeBegin));
        builder.<Long>withRequestField("submitted_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSubmittedTimeEnd,
                ShowJobExeListNewRequest::setSubmittedTimeEnd));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleJobExeRequest, ShowSingleJobExeResponse> showSingleJobExe =
        genForShowSingleJobExe();

    private static HttpRequestDef<ShowSingleJobExeRequest, ShowSingleJobExeResponse> genForShowSingleJobExe() {
        // basic
        HttpRequestDef.Builder<ShowSingleJobExeRequest, ShowSingleJobExeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSingleJobExeRequest.class, ShowSingleJobExeResponse.class)
                .withName("ShowSingleJobExe")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/job-executions/{job_execution_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleJobExeRequest::getJobExecutionId,
                ShowSingleJobExeRequest::setJobExecutionId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleJobExeRequest::getClusterId, ShowSingleJobExeRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> showSqlResultWithJob =
        genForShowSqlResultWithJob();

    private static HttpRequestDef<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> genForShowSqlResultWithJob() {
        // basic
        HttpRequestDef.Builder<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSqlResultWithJobRequest.class, ShowSqlResultWithJobResponse.class)
            .withName("ShowSqlResultWithJob")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/job-executions/{job_execution_id}/sql-result")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultWithJobRequest::getJobExecutionId,
                ShowSqlResultWithJobRequest::setJobExecutionId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultWithJobRequest::getClusterId,
                ShowSqlResultWithJobRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForStopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForStopJob() {
        // basic
        HttpRequestDef.Builder<StopJobRequest, StopJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopJobRequest.class, StopJobResponse.class)
                .withName("StopJob")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/job-executions/{job_execution_id}/kill")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getJobExecutionId, StopJobRequest::setJobExecutionId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getClusterId, StopJobRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> updateAgencyMapping =
        genForUpdateAgencyMapping();

    private static HttpRequestDef<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> genForUpdateAgencyMapping() {
        // basic
        HttpRequestDef.Builder<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAgencyMappingRequest.class, UpdateAgencyMappingResponse.class)
                .withName("UpdateAgencyMapping")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/agency-mapping")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgencyMappingRequest::getClusterId, UpdateAgencyMappingRequest::setClusterId));
        builder.<AgencyMappingArray>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgencyMappingArray.class),
            f -> f.withMarshaller(UpdateAgencyMappingRequest::getBody, UpdateAgencyMappingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicy =
        genForUpdateAutoScalingPolicy();

    private static HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> genForUpdateAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAutoScalingPolicyRequest.class, UpdateAutoScalingPolicyResponse.class)
            .withName("UpdateAutoScalingPolicy")
            .withUri("/v2/{project_id}/autoscaling-policy/{cluster_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getClusterId,
                UpdateAutoScalingPolicyRequest::setClusterId));
        builder.<AutoScalingPolicyV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoScalingPolicyV2.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getBody, UpdateAutoScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterName =
        genForUpdateClusterName();

    private static HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> genForUpdateClusterName() {
        // basic
        HttpRequestDef.Builder<UpdateClusterNameRequest, UpdateClusterNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterNameRequest.class, UpdateClusterNameResponse.class)
                .withName("UpdateClusterName")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/cluster-name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getClusterId, UpdateClusterNameRequest::setClusterId));
        builder.<UpdateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterReq.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getBody, UpdateClusterNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddComponentRequest, AddComponentResponse> addComponent = genForAddComponent();

    private static HttpRequestDef<AddComponentRequest, AddComponentResponse> genForAddComponent() {
        // basic
        HttpRequestDef.Builder<AddComponentRequest, AddComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddComponentRequest.class, AddComponentResponse.class)
                .withName("AddComponent")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/components")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddComponentRequest::getClusterId, AddComponentRequest::setClusterId));
        builder.<AddComponentsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddComponentsReq.class),
            f -> f.withMarshaller(AddComponentRequest::getBody, AddComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandClusterRequest, ExpandClusterResponse> expandCluster =
        genForExpandCluster();

    private static HttpRequestDef<ExpandClusterRequest, ExpandClusterResponse> genForExpandCluster() {
        // basic
        HttpRequestDef.Builder<ExpandClusterRequest, ExpandClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandClusterRequest.class, ExpandClusterResponse.class)
                .withName("ExpandCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/expand")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandClusterRequest::getClusterId, ExpandClusterRequest::setClusterId));
        builder.<ExpandParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandParam.class),
            f -> f.withMarshaller(ExpandClusterRequest::getBody, ExpandClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> shrinkCluster =
        genForShrinkCluster();

    private static HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> genForShrinkCluster() {
        // basic
        HttpRequestDef.Builder<ShrinkClusterRequest, ShrinkClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShrinkClusterRequest.class, ShrinkClusterResponse.class)
                .withName("ShrinkCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/shrink")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkClusterRequest::getClusterId, ShrinkClusterRequest::setClusterId));
        builder.<ShrinkParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkParam.class),
            f -> f.withMarshaller(ShrinkClusterRequest::getBody, ShrinkClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataConnectorRequest, CreateDataConnectorResponse> createDataConnector =
        genForCreateDataConnector();

    private static HttpRequestDef<CreateDataConnectorRequest, CreateDataConnectorResponse> genForCreateDataConnector() {
        // basic
        HttpRequestDef.Builder<CreateDataConnectorRequest, CreateDataConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataConnectorRequest.class, CreateDataConnectorResponse.class)
                .withName("CreateDataConnector")
                .withUri("/v2/{project_id}/data-connectors")
                .withContentType("application/json");

        // requests
        builder.<DataConnectorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataConnectorReq.class),
            f -> f.withMarshaller(CreateDataConnectorRequest::getBody, CreateDataConnectorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataConnectorRequest, DeleteDataConnectorResponse> deleteDataConnector =
        genForDeleteDataConnector();

    private static HttpRequestDef<DeleteDataConnectorRequest, DeleteDataConnectorResponse> genForDeleteDataConnector() {
        // basic
        HttpRequestDef.Builder<DeleteDataConnectorRequest, DeleteDataConnectorResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDataConnectorRequest.class, DeleteDataConnectorResponse.class)
            .withName("DeleteDataConnector")
            .withUri("/v2/{project_id}/data-connectors/{connector_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataConnectorRequest::getConnectorId,
                DeleteDataConnectorRequest::setConnectorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataConnectorRequest, ListDataConnectorResponse> listDataConnector =
        genForListDataConnector();

    private static HttpRequestDef<ListDataConnectorRequest, ListDataConnectorResponse> genForListDataConnector() {
        // basic
        HttpRequestDef.Builder<ListDataConnectorRequest, ListDataConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataConnectorRequest.class, ListDataConnectorResponse.class)
                .withName("ListDataConnector")
                .withUri("/v2/{project_id}/data-connectors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getConnectorId, ListDataConnectorRequest::setConnectorId));
        builder.<String>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getSourceType, ListDataConnectorRequest::setSourceType));
        builder.<String>withRequestField("connector_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getConnectorName,
                ListDataConnectorRequest::setConnectorName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getLimit, ListDataConnectorRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getOffset, ListDataConnectorRequest::setOffset));
        builder.<Boolean>withRequestField("available",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getAvailable, ListDataConnectorRequest::setAvailable));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataConnectorRequest, UpdateDataConnectorResponse> updateDataConnector =
        genForUpdateDataConnector();

    private static HttpRequestDef<UpdateDataConnectorRequest, UpdateDataConnectorResponse> genForUpdateDataConnector() {
        // basic
        HttpRequestDef.Builder<UpdateDataConnectorRequest, UpdateDataConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataConnectorRequest.class, UpdateDataConnectorResponse.class)
                .withName("UpdateDataConnector")
                .withUri("/v2/{project_id}/data-connectors/{connector_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataConnectorRequest::getConnectorId,
                UpdateDataConnectorRequest::setConnectorId));
        builder.<DataConnectorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataConnectorReq.class),
            f -> f.withMarshaller(UpdateDataConnectorRequest::getBody, UpdateDataConnectorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHdfsFileListRequest, ShowHdfsFileListResponse> showHdfsFileList =
        genForShowHdfsFileList();

    private static HttpRequestDef<ShowHdfsFileListRequest, ShowHdfsFileListResponse> genForShowHdfsFileList() {
        // basic
        HttpRequestDef.Builder<ShowHdfsFileListRequest, ShowHdfsFileListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHdfsFileListRequest.class, ShowHdfsFileListResponse.class)
                .withName("ShowHdfsFileList")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getClusterId, ShowHdfsFileListRequest::setClusterId));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getPath, ShowHdfsFileListRequest::setPath));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getOffset, ShowHdfsFileListRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getLimit, ShowHdfsFileListRequest::setLimit));
        builder.<ShowHdfsFileListRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHdfsFileListRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getSortKey, ShowHdfsFileListRequest::setSortKey));
        builder.<ShowHdfsFileListRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHdfsFileListRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getOrder, ShowHdfsFileListRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSyncIamUserRequest, CancelSyncIamUserResponse> cancelSyncIamUser =
        genForCancelSyncIamUser();

    private static HttpRequestDef<CancelSyncIamUserRequest, CancelSyncIamUserResponse> genForCancelSyncIamUser() {
        // basic
        HttpRequestDef.Builder<CancelSyncIamUserRequest, CancelSyncIamUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelSyncIamUserRequest.class, CancelSyncIamUserResponse.class)
                .withName("CancelSyncIamUser")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/iam-sync-user")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSyncIamUserRequest::getClusterId, CancelSyncIamUserRequest::setClusterId));
        builder.<CancelSyncRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CancelSyncRequest.class),
            f -> f.withMarshaller(CancelSyncIamUserRequest::getBody, CancelSyncIamUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncIamUserRequest, ShowSyncIamUserResponse> showSyncIamUser =
        genForShowSyncIamUser();

    private static HttpRequestDef<ShowSyncIamUserRequest, ShowSyncIamUserResponse> genForShowSyncIamUser() {
        // basic
        HttpRequestDef.Builder<ShowSyncIamUserRequest, ShowSyncIamUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSyncIamUserRequest.class, ShowSyncIamUserResponse.class)
                .withName("ShowSyncIamUser")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/iam-sync-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncIamUserRequest::getClusterId, ShowSyncIamUserRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSyncIamUserRequest, UpdateSyncIamUserResponse> updateSyncIamUser =
        genForUpdateSyncIamUser();

    private static HttpRequestDef<UpdateSyncIamUserRequest, UpdateSyncIamUserResponse> genForUpdateSyncIamUser() {
        // basic
        HttpRequestDef.Builder<UpdateSyncIamUserRequest, UpdateSyncIamUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSyncIamUserRequest.class, UpdateSyncIamUserResponse.class)
                .withName("UpdateSyncIamUser")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/iam-sync-user")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSyncIamUserRequest::getClusterId, UpdateSyncIamUserRequest::setClusterId));
        builder.<UpdateSyncRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateSyncRequest.class),
            f -> f.withMarshaller(UpdateSyncIamUserRequest::getBody, UpdateSyncIamUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSqlRequest, CancelSqlResponse> cancelSql = genForCancelSql();

    private static HttpRequestDef<CancelSqlRequest, CancelSqlResponse> genForCancelSql() {
        // basic
        HttpRequestDef.Builder<CancelSqlRequest, CancelSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSqlRequest.class, CancelSqlResponse.class)
                .withName("CancelSql")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/sql-execution/{sql_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSqlRequest::getClusterId, CancelSqlRequest::setClusterId));
        builder.<String>withRequestField("sql_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSqlRequest::getSqlId, CancelSqlRequest::setSqlId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSqlRequest, ExecuteSqlResponse> executeSql = genForExecuteSql();

    private static HttpRequestDef<ExecuteSqlRequest, ExecuteSqlResponse> genForExecuteSql() {
        // basic
        HttpRequestDef.Builder<ExecuteSqlRequest, ExecuteSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteSqlRequest.class, ExecuteSqlResponse.class)
                .withName("ExecuteSql")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/sql-execution")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSqlRequest::getClusterId, ExecuteSqlRequest::setClusterId));
        builder.<SqlExecutionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlExecutionReq.class),
            f -> f.withMarshaller(ExecuteSqlRequest::getBody, ExecuteSqlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlResultRequest, ShowSqlResultResponse> showSqlResult =
        genForShowSqlResult();

    private static HttpRequestDef<ShowSqlResultRequest, ShowSqlResultResponse> genForShowSqlResult() {
        // basic
        HttpRequestDef.Builder<ShowSqlResultRequest, ShowSqlResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlResultRequest.class, ShowSqlResultResponse.class)
                .withName("ShowSqlResult")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/sql-execution/{sql_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultRequest::getClusterId, ShowSqlResultRequest::setClusterId));
        builder.<String>withRequestField("sql_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultRequest::getSqlId, ShowSqlResultRequest::setSqlId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuota = genForShowTagQuota();

    private static HttpRequestDef<ShowTagQuotaRequest, ShowTagQuotaResponse> genForShowTagQuota() {
        // basic
        HttpRequestDef.Builder<ShowTagQuotaRequest, ShowTagQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagQuotaRequest.class, ShowTagQuotaResponse.class)
                .withName("ShowTagQuota")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/tags/quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagQuotaRequest::getClusterId, ShowTagQuotaRequest::setClusterId));
        builder.<Boolean>withRequestField("auto_scaling_policy_tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTagQuotaRequest::getAutoScalingPolicyTags,
                ShowTagQuotaRequest::setAutoScalingPolicyTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagStatusRequest, ShowTagStatusResponse> showTagStatus =
        genForShowTagStatus();

    private static HttpRequestDef<ShowTagStatusRequest, ShowTagStatusResponse> genForShowTagStatus() {
        // basic
        HttpRequestDef.Builder<ShowTagStatusRequest, ShowTagStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagStatusRequest.class, ShowTagStatusResponse.class)
                .withName("ShowTagStatus")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/tags/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagStatusRequest::getClusterId, ShowTagStatusRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchClusterTagsRequest, SwitchClusterTagsResponse> switchClusterTags =
        genForSwitchClusterTags();

    private static HttpRequestDef<SwitchClusterTagsRequest, SwitchClusterTagsResponse> genForSwitchClusterTags() {
        // basic
        HttpRequestDef.Builder<SwitchClusterTagsRequest, SwitchClusterTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchClusterTagsRequest.class, SwitchClusterTagsResponse.class)
                .withName("SwitchClusterTags")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/tags/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchClusterTagsRequest::getClusterId, SwitchClusterTagsRequest::setClusterId));
        builder.<ModifyDefaultTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDefaultTagsRequestBody.class),
            f -> f.withMarshaller(SwitchClusterTagsRequest::getBody, SwitchClusterTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMrsFlavorsRequest, ShowMrsFlavorsResponse> showMrsFlavors =
        genForShowMrsFlavors();

    private static HttpRequestDef<ShowMrsFlavorsRequest, ShowMrsFlavorsResponse> genForShowMrsFlavors() {
        // basic
        HttpRequestDef.Builder<ShowMrsFlavorsRequest, ShowMrsFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMrsFlavorsRequest.class, ShowMrsFlavorsResponse.class)
                .withName("ShowMrsFlavors")
                .withUri("/v2/{project_id}/metadata/version/{version_name}/available-flavor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMrsFlavorsRequest::getVersionName, ShowMrsFlavorsRequest::setVersionName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMrsVersionListRequest, ShowMrsVersionListResponse> showMrsVersionList =
        genForShowMrsVersionList();

    private static HttpRequestDef<ShowMrsVersionListRequest, ShowMrsVersionListResponse> genForShowMrsVersionList() {
        // basic
        HttpRequestDef.Builder<ShowMrsVersionListRequest, ShowMrsVersionListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMrsVersionListRequest.class, ShowMrsVersionListResponse.class)
                .withName("ShowMrsVersionList")
                .withUri("/v2/{project_id}/metadata/versions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}

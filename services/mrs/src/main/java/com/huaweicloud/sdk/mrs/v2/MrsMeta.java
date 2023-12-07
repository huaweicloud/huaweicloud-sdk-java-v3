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
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkParam;
import com.huaweicloud.sdk.mrs.v2.model.SqlExecutionReq;
import com.huaweicloud.sdk.mrs.v2.model.StopJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.StopJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterReq;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class MrsMeta {

    public static final HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobs =
        genForbatchDeleteJobs();

    private static HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> genForbatchDeleteJobs() {
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
            f -> f.withMarshaller(BatchDeleteJobsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<JobBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobBatchDelete.class),
            f -> f.withMarshaller(BatchDeleteJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> createAutoScalingPolicy =
        genForcreateAutoScalingPolicy();

    private static HttpRequestDef<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> genForcreateAutoScalingPolicy() {
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
            f -> f.withMarshaller(CreateAutoScalingPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AutoScalingPolicyV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AutoScalingPolicyV2.class),
            f -> f.withMarshaller(CreateAutoScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
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
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExecuteJobRequest, CreateExecuteJobResponse> createExecuteJob =
        genForcreateExecuteJob();

    private static HttpRequestDef<CreateExecuteJobRequest, CreateExecuteJobResponse> genForcreateExecuteJob() {
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
            f -> f.withMarshaller(CreateExecuteJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<JobExecution>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobExecution.class),
            f -> f.withMarshaller(CreateExecuteJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicy =
        genFordeleteAutoScalingPolicy();

    private static HttpRequestDef<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> genFordeleteAutoScalingPolicy() {
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
            f -> f.withMarshaller(DeleteAutoScalingPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AutoScalingPolicyDeleteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AutoScalingPolicyDeleteReq.class),
            f -> f.withMarshaller(DeleteAutoScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunJobFlowRequest, RunJobFlowResponse> runJobFlow = genForrunJobFlow();

    private static HttpRequestDef<RunJobFlowRequest, RunJobFlowResponse> genForrunJobFlow() {
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
            f -> f.withMarshaller(RunJobFlowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyMappingRequest, ShowAgencyMappingResponse> showAgencyMapping =
        genForshowAgencyMapping();

    private static HttpRequestDef<ShowAgencyMappingRequest, ShowAgencyMappingResponse> genForshowAgencyMapping() {
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
            f -> f.withMarshaller(ShowAgencyMappingRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicy =
        genForshowAutoScalingPolicy();

    private static HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> genForshowAutoScalingPolicy() {
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
            f -> f.withMarshaller(ShowAutoScalingPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response
        builder.<List<AutoScalingPolicyV2>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(AutoScalingPolicyV2.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobExeListNewRequest, ShowJobExeListNewResponse> showJobExeListNew =
        genForshowJobExeListNew();

    private static HttpRequestDef<ShowJobExeListNewRequest, ShowJobExeListNewResponse> genForshowJobExeListNew() {
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
            f -> f.withMarshaller(ShowJobExeListNewRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getUser, (req, v) -> {
                req.setUser(v);
            }));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<ShowJobExeListNewRequest.JobStateEnum>withRequestField("job_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobExeListNewRequest.JobStateEnum.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobState, (req, v) -> {
                req.setJobState(v);
            }));
        builder.<ShowJobExeListNewRequest.JobResultEnum>withRequestField("job_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobExeListNewRequest.JobResultEnum.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobResult, (req, v) -> {
                req.setJobResult(v);
            }));
        builder.<String>withRequestField("queue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getQueue, (req, v) -> {
                req.setQueue(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSortBy, (req, v) -> {
                req.setSortBy(v);
            }));
        builder.<Long>withRequestField("submitted_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSubmittedTimeBegin, (req, v) -> {
                req.setSubmittedTimeBegin(v);
            }));
        builder.<Long>withRequestField("submitted_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSubmittedTimeEnd, (req, v) -> {
                req.setSubmittedTimeEnd(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleJobExeRequest, ShowSingleJobExeResponse> showSingleJobExe =
        genForshowSingleJobExe();

    private static HttpRequestDef<ShowSingleJobExeRequest, ShowSingleJobExeResponse> genForshowSingleJobExe() {
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
            f -> f.withMarshaller(ShowSingleJobExeRequest::getJobExecutionId, (req, v) -> {
                req.setJobExecutionId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleJobExeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> showSqlResultWithJob =
        genForshowSqlResultWithJob();

    private static HttpRequestDef<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> genForshowSqlResultWithJob() {
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
            f -> f.withMarshaller(ShowSqlResultWithJobRequest::getJobExecutionId, (req, v) -> {
                req.setJobExecutionId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultWithJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForstopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForstopJob() {
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
            f -> f.withMarshaller(StopJobRequest::getJobExecutionId, (req, v) -> {
                req.setJobExecutionId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> updateAgencyMapping =
        genForupdateAgencyMapping();

    private static HttpRequestDef<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> genForupdateAgencyMapping() {
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
            f -> f.withMarshaller(UpdateAgencyMappingRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AgencyMappingArray>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgencyMappingArray.class),
            f -> f.withMarshaller(UpdateAgencyMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicy =
        genForupdateAutoScalingPolicy();

    private static HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> genForupdateAutoScalingPolicy() {
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
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AutoScalingPolicyV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoScalingPolicyV2.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterName =
        genForupdateClusterName();

    private static HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> genForupdateClusterName() {
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
            f -> f.withMarshaller(UpdateClusterNameRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterReq.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddComponentRequest, AddComponentResponse> addComponent = genForaddComponent();

    private static HttpRequestDef<AddComponentRequest, AddComponentResponse> genForaddComponent() {
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
            f -> f.withMarshaller(AddComponentRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AddComponentsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddComponentsReq.class),
            f -> f.withMarshaller(AddComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandClusterRequest, ExpandClusterResponse> expandCluster =
        genForexpandCluster();

    private static HttpRequestDef<ExpandClusterRequest, ExpandClusterResponse> genForexpandCluster() {
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
            f -> f.withMarshaller(ExpandClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ExpandParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandParam.class),
            f -> f.withMarshaller(ExpandClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> shrinkCluster =
        genForshrinkCluster();

    private static HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> genForshrinkCluster() {
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
            f -> f.withMarshaller(ShrinkClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ShrinkParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkParam.class),
            f -> f.withMarshaller(ShrinkClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataConnectorRequest, CreateDataConnectorResponse> createDataConnector =
        genForcreateDataConnector();

    private static HttpRequestDef<CreateDataConnectorRequest, CreateDataConnectorResponse> genForcreateDataConnector() {
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
            f -> f.withMarshaller(CreateDataConnectorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataConnectorRequest, DeleteDataConnectorResponse> deleteDataConnector =
        genFordeleteDataConnector();

    private static HttpRequestDef<DeleteDataConnectorRequest, DeleteDataConnectorResponse> genFordeleteDataConnector() {
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
            f -> f.withMarshaller(DeleteDataConnectorRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataConnectorRequest, ListDataConnectorResponse> listDataConnector =
        genForlistDataConnector();

    private static HttpRequestDef<ListDataConnectorRequest, ListDataConnectorResponse> genForlistDataConnector() {
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
            f -> f.withMarshaller(ListDataConnectorRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<String>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getSourceType, (req, v) -> {
                req.setSourceType(v);
            }));
        builder.<String>withRequestField("connector_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getConnectorName, (req, v) -> {
                req.setConnectorName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Boolean>withRequestField("available",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataConnectorRequest::getAvailable, (req, v) -> {
                req.setAvailable(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataConnectorRequest, UpdateDataConnectorResponse> updateDataConnector =
        genForupdateDataConnector();

    private static HttpRequestDef<UpdateDataConnectorRequest, UpdateDataConnectorResponse> genForupdateDataConnector() {
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
            f -> f.withMarshaller(UpdateDataConnectorRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));
        builder.<DataConnectorReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataConnectorReq.class),
            f -> f.withMarshaller(UpdateDataConnectorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHdfsFileListRequest, ShowHdfsFileListResponse> showHdfsFileList =
        genForshowHdfsFileList();

    private static HttpRequestDef<ShowHdfsFileListRequest, ShowHdfsFileListResponse> genForshowHdfsFileList() {
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
            f -> f.withMarshaller(ShowHdfsFileListRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowHdfsFileListRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHdfsFileListRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ShowHdfsFileListRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHdfsFileListRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSqlRequest, CancelSqlResponse> cancelSql = genForcancelSql();

    private static HttpRequestDef<CancelSqlRequest, CancelSqlResponse> genForcancelSql() {
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
            f -> f.withMarshaller(CancelSqlRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("sql_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSqlRequest::getSqlId, (req, v) -> {
                req.setSqlId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSqlRequest, ExecuteSqlResponse> executeSql = genForexecuteSql();

    private static HttpRequestDef<ExecuteSqlRequest, ExecuteSqlResponse> genForexecuteSql() {
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
            f -> f.withMarshaller(ExecuteSqlRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<SqlExecutionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlExecutionReq.class),
            f -> f.withMarshaller(ExecuteSqlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlResultRequest, ShowSqlResultResponse> showSqlResult =
        genForshowSqlResult();

    private static HttpRequestDef<ShowSqlResultRequest, ShowSqlResultResponse> genForshowSqlResult() {
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
            f -> f.withMarshaller(ShowSqlResultRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("sql_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultRequest::getSqlId, (req, v) -> {
                req.setSqlId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMrsVersionListRequest, ShowMrsVersionListResponse> showMrsVersionList =
        genForshowMrsVersionList();

    private static HttpRequestDef<ShowMrsVersionListRequest, ShowMrsVersionListResponse> genForshowMrsVersionList() {
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

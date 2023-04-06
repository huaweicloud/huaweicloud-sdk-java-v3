package com.huaweicloud.sdk.mrs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mrs.v2.model.*;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class MrsMeta {

    public static final HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobs = genForbatchDeleteJobs();

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
            })
        );
        builder.<JobBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobBatchDelete.class),
            f -> f.withMarshaller(BatchDeleteJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster = genForcreateCluster();

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
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateExecuteJobRequest, CreateExecuteJobResponse> createExecuteJob = genForcreateExecuteJob();

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
            })
        );
        builder.<JobExecution>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobExecution.class),
            f -> f.withMarshaller(CreateExecuteJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyMappingRequest, ShowAgencyMappingResponse> showAgencyMapping = genForshowAgencyMapping();

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
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicy = genForshowAutoScalingPolicy();

    private static HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> genForshowAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAutoScalingPolicyRequest.class, ShowAutoScalingPolicyResponse.class)
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
            })
        );

        // response
        builder.<List<AutoScalingPolicyV2>>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(AutoScalingPolicyV2.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ShowJobExeListNewRequest, ShowJobExeListNewResponse> showJobExeListNew = genForshowJobExeListNew();

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
            })
        );
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getUser, (req, v) -> {
                req.setUser(v);
            })
        );
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            })
        );
        builder.<ShowJobExeListNewRequest.JobStateEnum>withRequestField("job_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobExeListNewRequest.JobStateEnum.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobState, (req, v) -> {
                req.setJobState(v);
            })
        );
        builder.<ShowJobExeListNewRequest.JobResultEnum>withRequestField("job_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowJobExeListNewRequest.JobResultEnum.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getJobResult, (req, v) -> {
                req.setJobResult(v);
            })
        );
        builder.<String>withRequestField("queue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getQueue, (req, v) -> {
                req.setQueue(v);
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSortBy, (req, v) -> {
                req.setSortBy(v);
            })
        );
        builder.<Long>withRequestField("submitted_time_begin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSubmittedTimeBegin, (req, v) -> {
                req.setSubmittedTimeBegin(v);
            })
        );
        builder.<Long>withRequestField("submitted_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowJobExeListNewRequest::getSubmittedTimeEnd, (req, v) -> {
                req.setSubmittedTimeEnd(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleJobExeRequest, ShowSingleJobExeResponse> showSingleJobExe = genForshowSingleJobExe();

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
            })
        );
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleJobExeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> showSqlResultWithJob = genForshowSqlResultWithJob();

    private static HttpRequestDef<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> genForshowSqlResultWithJob() {
        // basic
        HttpRequestDef.Builder<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlResultWithJobRequest.class, ShowSqlResultWithJobResponse.class)
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
            })
        );
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultWithJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

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
            })
        );
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> updateAgencyMapping = genForupdateAgencyMapping();

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
            })
        );
        builder.<AgencyMappingArray>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgencyMappingArray.class),
            f -> f.withMarshaller(UpdateAgencyMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterName = genForupdateClusterName();

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
            })
        );
        builder.<UpdateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterReq.class),
            f -> f.withMarshaller(UpdateClusterNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowHdfsFileListRequest, ShowHdfsFileListResponse> showHdfsFileList = genForshowHdfsFileList();

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
            })
        );
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getPath, (req, v) -> {
                req.setPath(v);
            })
        );
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<ShowHdfsFileListRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHdfsFileListRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );
        builder.<ShowHdfsFileListRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHdfsFileListRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowHdfsFileListRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            })
        );

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
            })
        );
        builder.<String>withRequestField("sql_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSqlRequest::getSqlId, (req, v) -> {
                req.setSqlId(v);
            })
        );

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
            })
        );
        builder.<SqlExecutionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlExecutionReq.class),
            f -> f.withMarshaller(ExecuteSqlRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlResultRequest, ShowSqlResultResponse> showSqlResult = genForshowSqlResult();

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
            })
        );
        builder.<String>withRequestField("sql_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlResultRequest::getSqlId, (req, v) -> {
                req.setSqlId(v);
            })
        );

        // response


        return builder.build();
    }

}

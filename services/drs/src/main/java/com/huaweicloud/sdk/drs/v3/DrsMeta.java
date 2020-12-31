package com.huaweicloud.sdk.drs.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.drs.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DrsMeta {

    public static final HttpRequestDef<BatchChangeDataRequest, BatchChangeDataResponse> batchChangeData = genForbatchChangeData();

    private static HttpRequestDef<BatchChangeDataRequest, BatchChangeDataResponse> genForbatchChangeData() {
        // basic
        HttpRequestDef.Builder<BatchChangeDataRequest, BatchChangeDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchChangeDataRequest.class, BatchChangeDataResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-transformation")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchChangeDataRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDataTransformationReq.class,
            f -> f.withMarshaller(BatchChangeDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckJobsRequest, BatchCheckJobsResponse> batchCheckJobs = genForbatchCheckJobs();

    private static HttpRequestDef<BatchCheckJobsRequest, BatchCheckJobsResponse> genForbatchCheckJobs() {
        // basic
        HttpRequestDef.Builder<BatchCheckJobsRequest, BatchCheckJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckJobsRequest.class, BatchCheckJobsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-precheck")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCheckJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchPrecheckReq.class,
            f -> f.withMarshaller(BatchCheckJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCheckResultsRequest, BatchCheckResultsResponse> batchCheckResults = genForbatchCheckResults();

    private static HttpRequestDef<BatchCheckResultsRequest, BatchCheckResultsResponse> genForbatchCheckResults() {
        // basic
        HttpRequestDef.Builder<BatchCheckResultsRequest, BatchCheckResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckResultsRequest.class, BatchCheckResultsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-precheck-result")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCheckResultsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryPrecheckResultReq.class,
            f -> f.withMarshaller(BatchCheckResultsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateCompareTaskRequest, BatchCreateCompareTaskResponse> batchCreateCompareTask = genForbatchCreateCompareTask();

    private static HttpRequestDef<BatchCreateCompareTaskRequest, BatchCreateCompareTaskResponse> genForbatchCreateCompareTask() {
        // basic
        HttpRequestDef.Builder<BatchCreateCompareTaskRequest, BatchCreateCompareTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateCompareTaskRequest.class, BatchCreateCompareTaskResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-create-compare")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateCompareTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateCompareTaskReq.class,
            f -> f.withMarshaller(BatchCreateCompareTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateJobsRequest, BatchCreateJobsResponse> batchCreateJobs = genForbatchCreateJobs();

    private static HttpRequestDef<BatchCreateJobsRequest, BatchCreateJobsResponse> genForbatchCreateJobs() {
        // basic
        HttpRequestDef.Builder<BatchCreateJobsRequest, BatchCreateJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateJobsRequest.class, BatchCreateJobsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-creation")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateJobReq.class,
            f -> f.withMarshaller(BatchCreateJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobs = genForbatchDeleteJobs();

    private static HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> genForbatchDeleteJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteJobsRequest, BatchDeleteJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteJobsRequest.class, BatchDeleteJobsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-jobs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteJobReq.class,
            f -> f.withMarshaller(BatchDeleteJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListCompareResultRequest, BatchListCompareResultResponse> batchListCompareResult = genForbatchListCompareResult();

    private static HttpRequestDef<BatchListCompareResultRequest, BatchListCompareResultResponse> genForbatchListCompareResult() {
        // basic
        HttpRequestDef.Builder<BatchListCompareResultRequest, BatchListCompareResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListCompareResultRequest.class, BatchListCompareResultResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-compare-result")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchListCompareResultRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryCompareResultReq.class,
            f -> f.withMarshaller(BatchListCompareResultRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListJobDetailsRequest, BatchListJobDetailsResponse> batchListJobDetails = genForbatchListJobDetails();

    private static HttpRequestDef<BatchListJobDetailsRequest, BatchListJobDetailsResponse> genForbatchListJobDetails() {
        // basic
        HttpRequestDef.Builder<BatchListJobDetailsRequest, BatchListJobDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListJobDetailsRequest.class, BatchListJobDetailsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchListJobDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryJobReqPage.class,
            f -> f.withMarshaller(BatchListJobDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListJobStatusRequest, BatchListJobStatusResponse> batchListJobStatus = genForbatchListJobStatus();

    private static HttpRequestDef<BatchListJobStatusRequest, BatchListJobStatusResponse> genForbatchListJobStatus() {
        // basic
        HttpRequestDef.Builder<BatchListJobStatusRequest, BatchListJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListJobStatusRequest.class, BatchListJobStatusResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchListJobStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryJobReqPage.class,
            f -> f.withMarshaller(BatchListJobStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListProgressesRequest, BatchListProgressesResponse> batchListProgresses = genForbatchListProgresses();

    private static HttpRequestDef<BatchListProgressesRequest, BatchListProgressesResponse> genForbatchListProgresses() {
        // basic
        HttpRequestDef.Builder<BatchListProgressesRequest, BatchListProgressesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListProgressesRequest.class, BatchListProgressesResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-progress")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchListProgressesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryProgressReq.class,
            f -> f.withMarshaller(BatchListProgressesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> batchListRposAndRtos = genForbatchListRposAndRtos();

    private static HttpRequestDef<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> genForbatchListRposAndRtos() {
        // basic
        HttpRequestDef.Builder<BatchListRposAndRtosRequest, BatchListRposAndRtosResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListRposAndRtosRequest.class, BatchListRposAndRtosResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-rpo-and-rto")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchListRposAndRtosRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryRpoAndRtoReq.class,
            f -> f.withMarshaller(BatchListRposAndRtosRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListStructDetailRequest, BatchListStructDetailResponse> batchListStructDetail = genForbatchListStructDetail();

    private static HttpRequestDef<BatchListStructDetailRequest, BatchListStructDetailResponse> genForbatchListStructDetail() {
        // basic
        HttpRequestDef.Builder<BatchListStructDetailRequest, BatchListStructDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListStructDetailRequest.class, BatchListStructDetailResponse.class)
                .withUri("/v3/{project_id}/jobs/{type}/batch-struct-detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchListStructDetailRequest.TypeEnum.class,
            f -> f.withMarshaller(BatchListStructDetailRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchListStructDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryJobReqPage.class,
            f -> f.withMarshaller(BatchListStructDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListStructProcessRequest, BatchListStructProcessResponse> batchListStructProcess = genForbatchListStructProcess();

    private static HttpRequestDef<BatchListStructProcessRequest, BatchListStructProcessResponse> genForbatchListStructProcess() {
        // basic
        HttpRequestDef.Builder<BatchListStructProcessRequest, BatchListStructProcessResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListStructProcessRequest.class, BatchListStructProcessResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-struct-process")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchListStructProcessRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryJobReq.class,
            f -> f.withMarshaller(BatchListStructProcessRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchResetPasswordRequest, BatchResetPasswordResponse> batchResetPassword = genForbatchResetPassword();

    private static HttpRequestDef<BatchResetPasswordRequest, BatchResetPasswordResponse> genForbatchResetPassword() {
        // basic
        HttpRequestDef.Builder<BatchResetPasswordRequest, BatchResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchResetPasswordRequest.class, BatchResetPasswordResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-modify-pwd")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchResetPasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchModifyPwdReq.class,
            f -> f.withMarshaller(BatchResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestoreTaskRequest, BatchRestoreTaskResponse> batchRestoreTask = genForbatchRestoreTask();

    private static HttpRequestDef<BatchRestoreTaskRequest, BatchRestoreTaskResponse> genForbatchRestoreTask() {
        // basic
        HttpRequestDef.Builder<BatchRestoreTaskRequest, BatchRestoreTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRestoreTaskRequest.class, BatchRestoreTaskResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-retry-task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchRestoreTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchRetryReq.class,
            f -> f.withMarshaller(BatchRestoreTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetDefinerRequest, BatchSetDefinerResponse> batchSetDefiner = genForbatchSetDefiner();

    private static HttpRequestDef<BatchSetDefinerRequest, BatchSetDefinerResponse> genForbatchSetDefiner() {
        // basic
        HttpRequestDef.Builder<BatchSetDefinerRequest, BatchSetDefinerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSetDefinerRequest.class, BatchSetDefinerResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-replace-definer")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchSetDefinerRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchReplaceDefinerReq.class,
            f -> f.withMarshaller(BatchSetDefinerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetObjectsRequest, BatchSetObjectsResponse> batchSetObjects = genForbatchSetObjects();

    private static HttpRequestDef<BatchSetObjectsRequest, BatchSetObjectsResponse> genForbatchSetObjects() {
        // basic
        HttpRequestDef.Builder<BatchSetObjectsRequest, BatchSetObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchSetObjectsRequest.class, BatchSetObjectsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-select-objects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchSetObjectsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchUpdateDatabaseObjectReq.class,
            f -> f.withMarshaller(BatchSetObjectsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetSpeedRequest, BatchSetSpeedResponse> batchSetSpeed = genForbatchSetSpeed();

    private static HttpRequestDef<BatchSetSpeedRequest, BatchSetSpeedResponse> genForbatchSetSpeed() {
        // basic
        HttpRequestDef.Builder<BatchSetSpeedRequest, BatchSetSpeedResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchSetSpeedRequest.class, BatchSetSpeedResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-limit-speed")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchSetSpeedRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchLimitSpeedReq.class,
            f -> f.withMarshaller(BatchSetSpeedRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowParamsRequest, BatchShowParamsResponse> batchShowParams = genForbatchShowParams();

    private static HttpRequestDef<BatchShowParamsRequest, BatchShowParamsResponse> genForbatchShowParams() {
        // basic
        HttpRequestDef.Builder<BatchShowParamsRequest, BatchShowParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchShowParamsRequest.class, BatchShowParamsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-get-params")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchShowParamsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryJobReq.class,
            f -> f.withMarshaller(BatchShowParamsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartJobsRequest, BatchStartJobsResponse> batchStartJobs = genForbatchStartJobs();

    private static HttpRequestDef<BatchStartJobsRequest, BatchStartJobsResponse> genForbatchStartJobs() {
        // basic
        HttpRequestDef.Builder<BatchStartJobsRequest, BatchStartJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStartJobsRequest.class, BatchStartJobsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-starting")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchStartJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchStartJobReq.class,
            f -> f.withMarshaller(BatchStartJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopJobsRequest, BatchStopJobsResponse> batchStopJobs = genForbatchStopJobs();

    private static HttpRequestDef<BatchStopJobsRequest, BatchStopJobsResponse> genForbatchStopJobs() {
        // basic
        HttpRequestDef.Builder<BatchStopJobsRequest, BatchStopJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopJobsRequest.class, BatchStopJobsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-pause-task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchStopJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchPauseJobReq.class,
            f -> f.withMarshaller(BatchStopJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSwitchoverRequest, BatchSwitchoverResponse> batchSwitchover = genForbatchSwitchover();

    private static HttpRequestDef<BatchSwitchoverRequest, BatchSwitchoverResponse> genForbatchSwitchover() {
        // basic
        HttpRequestDef.Builder<BatchSwitchoverRequest, BatchSwitchoverResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSwitchoverRequest.class, BatchSwitchoverResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-switchover")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchSwitchoverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchSwitchoverReq.class,
            f -> f.withMarshaller(BatchSwitchoverRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateJobRequest, BatchUpdateJobResponse> batchUpdateJob = genForbatchUpdateJob();

    private static HttpRequestDef<BatchUpdateJobRequest, BatchUpdateJobResponse> genForbatchUpdateJob() {
        // basic
        HttpRequestDef.Builder<BatchUpdateJobRequest, BatchUpdateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateJobRequest.class, BatchUpdateJobResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-modification")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchUpdateJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchModifyJobReq.class,
            f -> f.withMarshaller(BatchUpdateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUserRequest, BatchUpdateUserResponse> batchUpdateUser = genForbatchUpdateUser();

    private static HttpRequestDef<BatchUpdateUserRequest, BatchUpdateUserResponse> genForbatchUpdateUser() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUserRequest, BatchUpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateUserRequest.class, BatchUpdateUserResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-update-user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchUpdateUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchUpdateSrcUserReq.class,
            f -> f.withMarshaller(BatchUpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> batchValidateClustersConnections = genForbatchValidateClustersConnections();

    private static HttpRequestDef<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> genForbatchValidateClustersConnections() {
        // basic
        HttpRequestDef.Builder<BatchValidateClustersConnectionsRequest, BatchValidateClustersConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchValidateClustersConnectionsRequest.class, BatchValidateClustersConnectionsResponse.class)
                .withUri("/v3/{project_id}/jobs/cluster/batch-connection")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchValidateClustersConnectionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchSpecialTestConnectionReq.class,
            f -> f.withMarshaller(BatchValidateClustersConnectionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> batchValidateConnections = genForbatchValidateConnections();

    private static HttpRequestDef<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> genForbatchValidateConnections() {
        // basic
        HttpRequestDef.Builder<BatchValidateConnectionsRequest, BatchValidateConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchValidateConnectionsRequest.class, BatchValidateConnectionsResponse.class)
                .withUri("/v3/{project_id}/jobs/batch-connection")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchValidateConnectionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchTestConnectionReq.class,
            f -> f.withMarshaller(BatchValidateConnectionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobListRequest, ShowJobListResponse> showJobList = genForshowJobList();

    private static HttpRequestDef<ShowJobListRequest, ShowJobListResponse> genForshowJobList() {
        // basic
        HttpRequestDef.Builder<ShowJobListRequest, ShowJobListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowJobListRequest.class, ShowJobListResponse.class)
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryJobsReq.class,
            f -> f.withMarshaller(ShowJobListRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitoringDataRequest, ShowMonitoringDataResponse> showMonitoringData = genForshowMonitoringData();

    private static HttpRequestDef<ShowMonitoringDataRequest, ShowMonitoringDataResponse> genForshowMonitoringData() {
        // basic
        HttpRequestDef.Builder<ShowMonitoringDataRequest, ShowMonitoringDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMonitoringDataRequest.class, ShowMonitoringDataResponse.class)
                .withUri("/v3/{project_id}/jobs/disaster-recovery-monitoring-data")
                .withContentType("application/json");

        // requests
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMonitoringDataRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchQueryJobReq.class,
            f -> f.withMarshaller(ShowMonitoringDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateParamsRequest, UpdateParamsResponse> updateParams = genForupdateParams();

    private static HttpRequestDef<UpdateParamsRequest, UpdateParamsResponse> genForupdateParams() {
        // basic
        HttpRequestDef.Builder<UpdateParamsRequest, UpdateParamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateParamsRequest.class, UpdateParamsResponse.class)
                .withUri("/v3/{project_id}/jobs/{job_id}/params")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateParamsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateParamsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyTargetParamsReq.class,
            f -> f.withMarshaller(UpdateParamsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

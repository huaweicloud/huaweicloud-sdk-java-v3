package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dgc.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DgcMeta {

    public static final HttpRequestDef<CancelScriptRequest, CancelScriptResponse> cancelScript = genForcancelScript();

    private static HttpRequestDef<CancelScriptRequest, CancelScriptResponse> genForcancelScript() {
        // basic
        HttpRequestDef.Builder<CancelScriptRequest, CancelScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelScriptRequest.class, CancelScriptResponse.class)
                .withUri("/v1/{project_id}/scripts/{script_name}/instances/{instance_id}/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelScriptRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection = genForcreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForcreateConnection() {
        // basic
        HttpRequestDef.Builder<CreateConnectionRequest, CreateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionRequest.class, CreateConnectionResponse.class)
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConnectionInfo.class,
            f -> f.withMarshaller(CreateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobRequest, CreateJobResponse> createJob = genForcreateJob();

    private static HttpRequestDef<CreateJobRequest, CreateJobResponse> genForcreateJob() {
        // basic
        HttpRequestDef.Builder<CreateJobRequest, CreateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateJobRequest.class, CreateJobResponse.class)
                .withUri("/v1/{project_id}/jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            JobInfo.class,
            f -> f.withMarshaller(CreateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceRequest, CreateResourceResponse> createResource = genForcreateResource();

    private static HttpRequestDef<CreateResourceRequest, CreateResourceResponse> genForcreateResource() {
        // basic
        HttpRequestDef.Builder<CreateResourceRequest, CreateResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceRequest.class, CreateResourceResponse.class)
                .withUri("/v1/{project_id}/resources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResourceInfo.class,
            f -> f.withMarshaller(CreateResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateResourceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<CreateScriptRequest, CreateScriptResponse> createScript = genForcreateScript();

    private static HttpRequestDef<CreateScriptRequest, CreateScriptResponse> genForcreateScript() {
        // basic
        HttpRequestDef.Builder<CreateScriptRequest, CreateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScriptRequest.class, CreateScriptResponse.class)
                .withUri("/v1/{project_id}/scripts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ScriptInfo.class,
            f -> f.withMarshaller(CreateScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnction = genFordeleteConnction();

    private static HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> genFordeleteConnction() {
        // basic
        HttpRequestDef.Builder<DeleteConnctionRequest, DeleteConnctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConnctionRequest.class, DeleteConnctionResponse.class)
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteConnctionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource = genFordeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genFordeleteResource() {
        // basic
        HttpRequestDef.Builder<DeleteResourceRequest, DeleteResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceRequest.class, DeleteResourceResponse.class)
                .withUri("/v1/{project_id}/resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> deleteScript = genFordeleteScript();

    private static HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> genFordeleteScript() {
        // basic
        HttpRequestDef.Builder<DeleteScriptRequest, DeleteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScriptRequest.class, DeleteScriptResponse.class)
                .withUri("/v1/{project_id}/scripts/{script_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> executeScript = genForexecuteScript();

    private static HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> genForexecuteScript() {
        // basic
        HttpRequestDef.Builder<ExecuteScriptRequest, ExecuteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteScriptRequest.class, ExecuteScriptResponse.class)
                .withUri("/v1/{project_id}/scripts/{script_name}/execute")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ExecuteScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ExecuteScriptReq.class,
            f -> f.withMarshaller(ExecuteScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> exportConnections = genForexportConnections();

    private static HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> genForexportConnections() {
        // basic
        HttpRequestDef.Builder<ExportConnectionsRequest, ExportConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportConnectionsRequest.class, ExportConnectionsResponse.class)
                .withUri("/v1/{project_id}/connections/export")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportJobRequest, ExportJobResponse> exportJob = genForexportJob();

    private static HttpRequestDef<ExportJobRequest, ExportJobResponse> genForexportJob() {
        // basic
        HttpRequestDef.Builder<ExportJobRequest, ExportJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportJobRequest.class, ExportJobResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}/export")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ExportJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportJobListRequest, ExportJobListResponse> exportJobList = genForexportJobList();

    private static HttpRequestDef<ExportJobListRequest, ExportJobListResponse> genForexportJobList() {
        // basic
        HttpRequestDef.Builder<ExportJobListRequest, ExportJobListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportJobListRequest.class, ExportJobListResponse.class)
                .withUri("/v1/{project_id}/jobs/batch-export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ExportJobsReq.class,
            f -> f.withMarshaller(ExportJobListRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> importConnections = genForimportConnections();

    private static HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> genForimportConnections() {
        // basic
        HttpRequestDef.Builder<ImportConnectionsRequest, ImportConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportConnectionsRequest.class, ImportConnectionsResponse.class)
                .withUri("/v1/{project_id}/connections/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ImportConnectionReq.class,
            f -> f.withMarshaller(ImportConnectionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportJobRequest, ImportJobResponse> importJob = genForimportJob();

    private static HttpRequestDef<ImportJobRequest, ImportJobResponse> genForimportJob() {
        // basic
        HttpRequestDef.Builder<ImportJobRequest, ImportJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportJobRequest.class, ImportJobResponse.class)
                .withUri("/v1/{project_id}/jobs/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ImportFileReq.class,
            f -> f.withMarshaller(ImportJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections = genForlistConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForlistConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstances = genForlistJobInstances();

    private static HttpRequestDef<ListJobInstancesRequest, ListJobInstancesResponse> genForlistJobInstances() {
        // basic
        HttpRequestDef.Builder<ListJobInstancesRequest, ListJobInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobInstancesRequest.class, ListJobInstancesResponse.class)
                .withUri("/v1/{project_id}/jobs/instances/detail")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForlistJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForlistJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withUri("/v1/{project_id}/jobs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources = genForlistResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForlistResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesRequest.class, ListResourcesResponse.class)
                .withUri("/v1/{project_id}/resources")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResults = genForlistScriptResults();

    private static HttpRequestDef<ListScriptResultsRequest, ListScriptResultsResponse> genForlistScriptResults() {
        // basic
        HttpRequestDef.Builder<ListScriptResultsRequest, ListScriptResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptResultsRequest.class, ListScriptResultsResponse.class)
                .withUri("/v1/{project_id}/scripts/{script_name}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListScriptResultsRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListScriptResultsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptsRequest, ListScriptsResponse> listScripts = genForlistScripts();

    private static HttpRequestDef<ListScriptsRequest, ListScriptsResponse> genForlistScripts() {
        // basic
        HttpRequestDef.Builder<ListScriptsRequest, ListScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptsRequest.class, ListScriptsResponse.class)
                .withUri("/v1/{project_id}/scripts")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasks = genForlistSystemTasks();

    private static HttpRequestDef<ListSystemTasksRequest, ListSystemTasksResponse> genForlistSystemTasks() {
        // basic
        HttpRequestDef.Builder<ListSystemTasksRequest, ListSystemTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSystemTasksRequest.class, ListSystemTasksResponse.class)
                .withUri("/v1/{project_id}/system-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSystemTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyJobRequest, ModifyJobResponse> modifyJob = genFormodifyJob();

    private static HttpRequestDef<ModifyJobRequest, ModifyJobResponse> genFormodifyJob() {
        // basic
        HttpRequestDef.Builder<ModifyJobRequest, ModifyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyJobRequest.class, ModifyJobResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ModifyJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            JobInfo.class,
            f -> f.withMarshaller(ModifyJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyResourceRequest, ModifyResourceResponse> modifyResource = genFormodifyResource();

    private static HttpRequestDef<ModifyResourceRequest, ModifyResourceResponse> genFormodifyResource() {
        // basic
        HttpRequestDef.Builder<ModifyResourceRequest, ModifyResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyResourceRequest.class, ModifyResourceResponse.class)
                .withUri("/v1/{project_id}/resources/{resource_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ModifyResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResourceInfo.class,
            f -> f.withMarshaller(ModifyResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyScriptRequest, ModifyScriptResponse> modifyScript = genFormodifyScript();

    private static HttpRequestDef<ModifyScriptRequest, ModifyScriptResponse> genFormodifyScript() {
        // basic
        HttpRequestDef.Builder<ModifyScriptRequest, ModifyScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyScriptRequest.class, ModifyScriptResponse.class)
                .withUri("/v1/{project_id}/scripts/{script_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ModifyScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ScriptInfo.class,
            f -> f.withMarshaller(ModifyScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstance = genForrestoreJobInstance();

    private static HttpRequestDef<RestoreJobInstanceRequest, RestoreJobInstanceResponse> genForrestoreJobInstance() {
        // basic
        HttpRequestDef.Builder<RestoreJobInstanceRequest, RestoreJobInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreJobInstanceRequest.class, RestoreJobInstanceResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}/instances/{instance_id}/restart")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestoreJobInstanceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RestoreJobInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunOnceRequest, RunOnceResponse> runOnce = genForrunOnce();

    private static HttpRequestDef<RunOnceRequest, RunOnceResponse> genForrunOnce() {
        // basic
        HttpRequestDef.Builder<RunOnceRequest, RunOnceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunOnceRequest.class, RunOnceResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}/run-immediate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RunOnceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StartJobReq.class,
            f -> f.withMarshaller(RunOnceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> showConnection = genForshowConnection();

    private static HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> genForshowConnection() {
        // basic
        HttpRequestDef.Builder<ShowConnectionRequest, ShowConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectionRequest.class, ShowConnectionResponse.class)
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowConnectionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfo = genForshowFileInfo();

    private static HttpRequestDef<ShowFileInfoRequest, ShowFileInfoResponse> genForshowFileInfo() {
        // basic
        HttpRequestDef.Builder<ShowFileInfoRequest, ShowFileInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFileInfoRequest.class, ShowFileInfoResponse.class)
                .withUri("/v1/{project_id}/jobs/check-file")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            FilePath.class,
            f -> f.withMarshaller(ShowFileInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstance = genForshowJobInstance();

    private static HttpRequestDef<ShowJobInstanceRequest, ShowJobInstanceResponse> genForshowJobInstance() {
        // basic
        HttpRequestDef.Builder<ShowJobInstanceRequest, ShowJobInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInstanceRequest.class, ShowJobInstanceResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobInstanceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus = genForshowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForshowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobStatusRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRequest, ShowResourceResponse> showResource = genForshowResource();

    private static HttpRequestDef<ShowResourceRequest, ShowResourceResponse> genForshowResource() {
        // basic
        HttpRequestDef.Builder<ShowResourceRequest, ShowResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceRequest.class, ShowResourceResponse.class)
                .withUri("/v1/{project_id}/resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScriptRequest, ShowScriptResponse> showScript = genForshowScript();

    private static HttpRequestDef<ShowScriptRequest, ShowScriptResponse> genForshowScript() {
        // basic
        HttpRequestDef.Builder<ShowScriptRequest, ShowScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScriptRequest.class, ShowScriptResponse.class)
                .withUri("/v1/{project_id}/scripts/{script_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartJobRequest, StartJobResponse> startJob = genForstartJob();

    private static HttpRequestDef<StartJobRequest, StartJobResponse> genForstartJob() {
        // basic
        HttpRequestDef.Builder<StartJobRequest, StartJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartJobRequest.class, StartJobResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StartJobReq.class,
            f -> f.withMarshaller(StartJobRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1/{project_id}/jobs/{job_name}/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstance = genForstopJobInstance();

    private static HttpRequestDef<StopJobInstanceRequest, StopJobInstanceResponse> genForstopJobInstance() {
        // basic
        HttpRequestDef.Builder<StopJobInstanceRequest, StopJobInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopJobInstanceRequest.class, StopJobInstanceResponse.class)
                .withUri("/v1/{project_id}/jobs/{job_name}/instances/{instance_id}/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopJobInstanceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopJobInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection = genForupdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForupdateConnection() {
        // basic
        HttpRequestDef.Builder<UpdateConnectionRequest, UpdateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConnectionRequest.class, UpdateConnectionResponse.class)
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateConnectionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConnectionInfo.class,
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

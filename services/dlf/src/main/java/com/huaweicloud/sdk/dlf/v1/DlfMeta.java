package com.huaweicloud.sdk.dlf.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dlf.v1.model.CancelScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.CancelScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.ConnectionInfo;
import com.huaweicloud.sdk.dlf.v1.model.CreateConnectionRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateConnectionResponse;
import com.huaweicloud.sdk.dlf.v1.model.CreateJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.CreateResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteConnctionRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteConnctionResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExecuteScriptReq;
import com.huaweicloud.sdk.dlf.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExportConnectionsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExportConnectionsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobListRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobListResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.ExportJobsReq;
import com.huaweicloud.sdk.dlf.v1.model.FilePath;
import com.huaweicloud.sdk.dlf.v1.model.ImportConnectionReq;
import com.huaweicloud.sdk.dlf.v1.model.ImportConnectionsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ImportConnectionsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ImportFileReq;
import com.huaweicloud.sdk.dlf.v1.model.ImportJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.ImportJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.JobInfo;
import com.huaweicloud.sdk.dlf.v1.model.ListConnectionsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListConnectionsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListJobInstancesRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListJobInstancesResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptResultsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptResultsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptsRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListScriptsResponse;
import com.huaweicloud.sdk.dlf.v1.model.ListSystemTasksRequest;
import com.huaweicloud.sdk.dlf.v1.model.ListSystemTasksResponse;
import com.huaweicloud.sdk.dlf.v1.model.ResourceInfo;
import com.huaweicloud.sdk.dlf.v1.model.RestoreJobInstanceRequest;
import com.huaweicloud.sdk.dlf.v1.model.RestoreJobInstanceResponse;
import com.huaweicloud.sdk.dlf.v1.model.RunOnceRequest;
import com.huaweicloud.sdk.dlf.v1.model.RunOnceResponse;
import com.huaweicloud.sdk.dlf.v1.model.ScriptInfo;
import com.huaweicloud.sdk.dlf.v1.model.ShowConnectionRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowConnectionResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowDirectoryTreeRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowDirectoryTreeResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowFileInfoRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowFileInfoResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobInstanceRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobInstanceResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.ShowScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.ShowScriptResponse;
import com.huaweicloud.sdk.dlf.v1.model.StartJobReq;
import com.huaweicloud.sdk.dlf.v1.model.StartJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.StartJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.StopJobInstanceRequest;
import com.huaweicloud.sdk.dlf.v1.model.StopJobInstanceResponse;
import com.huaweicloud.sdk.dlf.v1.model.StopJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.StopJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateResourceRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateResourceResponse;
import com.huaweicloud.sdk.dlf.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.dlf.v1.model.UpdateScriptResponse;

@SuppressWarnings("unchecked")
public class DlfMeta {

    public static final HttpRequestDef<CancelScriptRequest, CancelScriptResponse> cancelScript = genForcancelScript();

    private static HttpRequestDef<CancelScriptRequest, CancelScriptResponse> genForcancelScript() {
        // basic
        HttpRequestDef.Builder<CancelScriptRequest, CancelScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelScriptRequest.class, CancelScriptResponse.class)
                .withName("CancelScript")
                .withUri("/v1/{project_id}/scripts/{script_name}/instances/{instance_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScriptRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScriptRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection =
        genForcreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForcreateConnection() {
        // basic
        HttpRequestDef.Builder<CreateConnectionRequest, CreateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionRequest.class, CreateConnectionResponse.class)
                .withName("CreateConnection")
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConnectionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ConnectionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionInfo.class),
            f -> f.withMarshaller(CreateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobRequest, CreateJobResponse> createJob = genForcreateJob();

    private static HttpRequestDef<CreateJobRequest, CreateJobResponse> genForcreateJob() {
        // basic
        HttpRequestDef.Builder<CreateJobRequest, CreateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateJobRequest.class, CreateJobResponse.class)
                .withName("CreateJob")
                .withUri("/v1/{project_id}/jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<JobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobInfo.class),
            f -> f.withMarshaller(CreateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceRequest, CreateResourceResponse> createResource =
        genForcreateResource();

    private static HttpRequestDef<CreateResourceRequest, CreateResourceResponse> genForcreateResource() {
        // basic
        HttpRequestDef.Builder<CreateResourceRequest, CreateResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceRequest.class, CreateResourceResponse.class)
                .withName("CreateResource")
                .withUri("/v1/{project_id}/resources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ResourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInfo.class),
            f -> f.withMarshaller(CreateResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateResourceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateScriptRequest, CreateScriptResponse> createScript = genForcreateScript();

    private static HttpRequestDef<CreateScriptRequest, CreateScriptResponse> genForcreateScript() {
        // basic
        HttpRequestDef.Builder<CreateScriptRequest, CreateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScriptRequest.class, CreateScriptResponse.class)
                .withName("CreateScript")
                .withUri("/v1/{project_id}/scripts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScriptRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ScriptInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptInfo.class),
            f -> f.withMarshaller(CreateScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnction =
        genFordeleteConnction();

    private static HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> genFordeleteConnction() {
        // basic
        HttpRequestDef.Builder<DeleteConnctionRequest, DeleteConnctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConnctionRequest.class, DeleteConnctionResponse.class)
                .withName("DeleteConnction")
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnctionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnctionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v1/{project_id}/jobs/{job_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource =
        genFordeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genFordeleteResource() {
        // basic
        HttpRequestDef.Builder<DeleteResourceRequest, DeleteResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceRequest.class, DeleteResourceResponse.class)
                .withName("DeleteResource")
                .withUri("/v1/{project_id}/resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> deleteScript = genFordeleteScript();

    private static HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> genFordeleteScript() {
        // basic
        HttpRequestDef.Builder<DeleteScriptRequest, DeleteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScriptRequest.class, DeleteScriptResponse.class)
                .withName("DeleteScript")
                .withUri("/v1/{project_id}/scripts/{script_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> executeScript =
        genForexecuteScript();

    private static HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> genForexecuteScript() {
        // basic
        HttpRequestDef.Builder<ExecuteScriptRequest, ExecuteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteScriptRequest.class, ExecuteScriptResponse.class)
                .withName("ExecuteScript")
                .withUri("/v1/{project_id}/scripts/{script_name}/execute")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ExecuteScriptReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteScriptReq.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> exportConnections =
        genForexportConnections();

    private static HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> genForexportConnections() {
        // basic
        HttpRequestDef.Builder<ExportConnectionsRequest, ExportConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportConnectionsRequest.class, ExportConnectionsResponse.class)
                .withName("ExportConnections")
                .withUri("/v1/{project_id}/connections/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportConnectionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportJobRequest, ExportJobResponse> exportJob = genForexportJob();

    private static HttpRequestDef<ExportJobRequest, ExportJobResponse> genForexportJob() {
        // basic
        HttpRequestDef.Builder<ExportJobRequest, ExportJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportJobRequest.class, ExportJobResponse.class)
                .withName("ExportJob")
                .withUri("/v1/{project_id}/jobs/{job_name}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportJobListRequest, ExportJobListResponse> exportJobList =
        genForexportJobList();

    private static HttpRequestDef<ExportJobListRequest, ExportJobListResponse> genForexportJobList() {
        // basic
        HttpRequestDef.Builder<ExportJobListRequest, ExportJobListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportJobListRequest.class, ExportJobListResponse.class)
                .withName("ExportJobList")
                .withUri("/v1/{project_id}/jobs/batch-export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportJobListRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ExportJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportJobsReq.class),
            f -> f.withMarshaller(ExportJobListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> importConnections =
        genForimportConnections();

    private static HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> genForimportConnections() {
        // basic
        HttpRequestDef.Builder<ImportConnectionsRequest, ImportConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportConnectionsRequest.class, ImportConnectionsResponse.class)
                .withName("ImportConnections")
                .withUri("/v1/{project_id}/connections/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportConnectionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ImportConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportConnectionReq.class),
            f -> f.withMarshaller(ImportConnectionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportJobRequest, ImportJobResponse> importJob = genForimportJob();

    private static HttpRequestDef<ImportJobRequest, ImportJobResponse> genForimportJob() {
        // basic
        HttpRequestDef.Builder<ImportJobRequest, ImportJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportJobRequest.class, ImportJobResponse.class)
                .withName("ImportJob")
                .withUri("/v1/{project_id}/jobs/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ImportFileReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportFileReq.class),
            f -> f.withMarshaller(ImportJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForlistConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForlistConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withName("ListConnections")
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstances =
        genForlistJobInstances();

    private static HttpRequestDef<ListJobInstancesRequest, ListJobInstancesResponse> genForlistJobInstances() {
        // basic
        HttpRequestDef.Builder<ListJobInstancesRequest, ListJobInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobInstancesRequest.class, ListJobInstancesResponse.class)
                .withName("ListJobInstances")
                .withUri("/v1/{project_id}/jobs/instances/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForlistJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForlistJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v1/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources =
        genForlistResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForlistResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesRequest.class, ListResourcesResponse.class)
                .withName("ListResources")
                .withUri("/v1/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResults =
        genForlistScriptResults();

    private static HttpRequestDef<ListScriptResultsRequest, ListScriptResultsResponse> genForlistScriptResults() {
        // basic
        HttpRequestDef.Builder<ListScriptResultsRequest, ListScriptResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptResultsRequest.class, ListScriptResultsResponse.class)
                .withName("ListScriptResults")
                .withUri("/v1/{project_id}/scripts/{script_name}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptResultsRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptResultsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptResultsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptsRequest, ListScriptsResponse> listScripts = genForlistScripts();

    private static HttpRequestDef<ListScriptsRequest, ListScriptsResponse> genForlistScripts() {
        // basic
        HttpRequestDef.Builder<ListScriptsRequest, ListScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptsRequest.class, ListScriptsResponse.class)
                .withName("ListScripts")
                .withUri("/v1/{project_id}/scripts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasks =
        genForlistSystemTasks();

    private static HttpRequestDef<ListSystemTasksRequest, ListSystemTasksResponse> genForlistSystemTasks() {
        // basic
        HttpRequestDef.Builder<ListSystemTasksRequest, ListSystemTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSystemTasksRequest.class, ListSystemTasksResponse.class)
                .withName("ListSystemTasks")
                .withUri("/v1/{project_id}/system-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemTasksRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstance =
        genForrestoreJobInstance();

    private static HttpRequestDef<RestoreJobInstanceRequest, RestoreJobInstanceResponse> genForrestoreJobInstance() {
        // basic
        HttpRequestDef.Builder<RestoreJobInstanceRequest, RestoreJobInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreJobInstanceRequest.class, RestoreJobInstanceResponse.class)
                .withName("RestoreJobInstance")
                .withUri("/v1/{project_id}/jobs/{job_name}/instances/{instance_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreJobInstanceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreJobInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreJobInstanceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunOnceRequest, RunOnceResponse> runOnce = genForrunOnce();

    private static HttpRequestDef<RunOnceRequest, RunOnceResponse> genForrunOnce() {
        // basic
        HttpRequestDef.Builder<RunOnceRequest, RunOnceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunOnceRequest.class, RunOnceResponse.class)
                .withName("RunOnce")
                .withUri("/v1/{project_id}/jobs/{job_name}/run-immediate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunOnceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunOnceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<StartJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartJobReq.class),
            f -> f.withMarshaller(RunOnceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> showConnection =
        genForshowConnection();

    private static HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> genForshowConnection() {
        // basic
        HttpRequestDef.Builder<ShowConnectionRequest, ShowConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectionRequest.class, ShowConnectionResponse.class)
                .withName("ShowConnection")
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse> showDirectoryTree =
        genForshowDirectoryTree();

    private static HttpRequestDef<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse> genForshowDirectoryTree() {
        // basic
        HttpRequestDef.Builder<ShowDirectoryTreeRequest, ShowDirectoryTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDirectoryTreeRequest.class, ShowDirectoryTreeResponse.class)
                .withName("ShowDirectoryTree")
                .withUri("/v1.0/{project_id}/directory/tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectoryTreeRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<String>withRequestField("directory_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectoryTreeRequest::getDirectoryId, (req, v) -> {
                req.setDirectoryId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectoryTreeRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDirectoryTreeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDirectoryTreeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDirectoryTreeRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfo = genForshowFileInfo();

    private static HttpRequestDef<ShowFileInfoRequest, ShowFileInfoResponse> genForshowFileInfo() {
        // basic
        HttpRequestDef.Builder<ShowFileInfoRequest, ShowFileInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFileInfoRequest.class, ShowFileInfoResponse.class)
                .withName("ShowFileInfo")
                .withUri("/v1/{project_id}/jobs/check-file")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileInfoRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<FilePath>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FilePath.class),
            f -> f.withMarshaller(ShowFileInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/jobs/{job_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstance =
        genForshowJobInstance();

    private static HttpRequestDef<ShowJobInstanceRequest, ShowJobInstanceResponse> genForshowJobInstance() {
        // basic
        HttpRequestDef.Builder<ShowJobInstanceRequest, ShowJobInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInstanceRequest.class, ShowJobInstanceResponse.class)
                .withName("ShowJobInstance")
                .withUri("/v1/{project_id}/jobs/{job_name}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForshowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForshowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withName("ShowJobStatus")
                .withUri("/v1/{project_id}/jobs/{job_name}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRequest, ShowResourceResponse> showResource = genForshowResource();

    private static HttpRequestDef<ShowResourceRequest, ShowResourceResponse> genForshowResource() {
        // basic
        HttpRequestDef.Builder<ShowResourceRequest, ShowResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceRequest.class, ShowResourceResponse.class)
                .withName("ShowResource")
                .withUri("/v1/{project_id}/resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScriptRequest, ShowScriptResponse> showScript = genForshowScript();

    private static HttpRequestDef<ShowScriptRequest, ShowScriptResponse> genForshowScript() {
        // basic
        HttpRequestDef.Builder<ShowScriptRequest, ShowScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScriptRequest.class, ShowScriptResponse.class)
                .withName("ShowScript")
                .withUri("/v1/{project_id}/scripts/{script_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScriptRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartJobRequest, StartJobResponse> startJob = genForstartJob();

    private static HttpRequestDef<StartJobRequest, StartJobResponse> genForstartJob() {
        // basic
        HttpRequestDef.Builder<StartJobRequest, StartJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartJobRequest.class, StartJobResponse.class)
                .withName("StartJob")
                .withUri("/v1/{project_id}/jobs/{job_name}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<StartJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartJobReq.class),
            f -> f.withMarshaller(StartJobRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1/{project_id}/jobs/{job_name}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstance =
        genForstopJobInstance();

    private static HttpRequestDef<StopJobInstanceRequest, StopJobInstanceResponse> genForstopJobInstance() {
        // basic
        HttpRequestDef.Builder<StopJobInstanceRequest, StopJobInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopJobInstanceRequest.class, StopJobInstanceResponse.class)
                .withName("StopJobInstance")
                .withUri("/v1/{project_id}/jobs/{job_name}/instances/{instance_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobInstanceRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobInstanceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection =
        genForupdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForupdateConnection() {
        // basic
        HttpRequestDef.Builder<UpdateConnectionRequest, UpdateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConnectionRequest.class, UpdateConnectionResponse.class)
                .withName("UpdateConnection")
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ConnectionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionInfo.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForupdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForupdateJob() {
        // basic
        HttpRequestDef.Builder<UpdateJobRequest, UpdateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobRequest.class, UpdateJobResponse.class)
                .withName("UpdateJob")
                .withUri("/v1/{project_id}/jobs/{job_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("job_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<JobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobInfo.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> updateResource =
        genForupdateResource();

    private static HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> genForupdateResource() {
        // basic
        HttpRequestDef.Builder<UpdateResourceRequest, UpdateResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResourceRequest.class, UpdateResourceResponse.class)
                .withName("UpdateResource")
                .withUri("/v1/{project_id}/resources/{resource_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ResourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceInfo.class),
            f -> f.withMarshaller(UpdateResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> updateScript = genForupdateScript();

    private static HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> genForupdateScript() {
        // basic
        HttpRequestDef.Builder<UpdateScriptRequest, UpdateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScriptRequest.class, UpdateScriptResponse.class)
                .withName("UpdateScript")
                .withUri("/v1/{project_id}/scripts/{script_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getScriptName, (req, v) -> {
                req.setScriptName(v);
            }));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getWorkspace, (req, v) -> {
                req.setWorkspace(v);
            }));
        builder.<ScriptInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptInfo.class),
            f -> f.withMarshaller(UpdateScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dgc.v1.model.CancelScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.CancelScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.ConnectionInfo;
import com.huaweicloud.sdk.dgc.v1.model.CreateConnectionRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateConnectionResponse;
import com.huaweicloud.sdk.dgc.v1.model.CreateJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.CreateResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.CreateSupplementdataRequest;
import com.huaweicloud.sdk.dgc.v1.model.CreateSupplementdataResponse;
import com.huaweicloud.sdk.dgc.v1.model.DeleteConnctionRequest;
import com.huaweicloud.sdk.dgc.v1.model.DeleteConnctionResponse;
import com.huaweicloud.sdk.dgc.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExecuteScriptReq;
import com.huaweicloud.sdk.dgc.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExportConnectionsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ExportConnectionsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobListRequest;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobListResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.ExportJobsReq;
import com.huaweicloud.sdk.dgc.v1.model.FilePath;
import com.huaweicloud.sdk.dgc.v1.model.ImportConnectionReq;
import com.huaweicloud.sdk.dgc.v1.model.ImportConnectionsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ImportConnectionsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ImportFileReq;
import com.huaweicloud.sdk.dgc.v1.model.ImportJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.ImportJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.JobInfo;
import com.huaweicloud.sdk.dgc.v1.model.ListConnectionsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListConnectionsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListJobInstancesRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListJobInstancesResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptResultsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptResultsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptsRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListScriptsResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListSupplementdataRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListSupplementdataResponse;
import com.huaweicloud.sdk.dgc.v1.model.ListSystemTasksRequest;
import com.huaweicloud.sdk.dgc.v1.model.ListSystemTasksResponse;
import com.huaweicloud.sdk.dgc.v1.model.ResourceInfo;
import com.huaweicloud.sdk.dgc.v1.model.RestoreJobInstanceRequest;
import com.huaweicloud.sdk.dgc.v1.model.RestoreJobInstanceResponse;
import com.huaweicloud.sdk.dgc.v1.model.RunOnceRequest;
import com.huaweicloud.sdk.dgc.v1.model.RunOnceResponse;
import com.huaweicloud.sdk.dgc.v1.model.ScriptInfo;
import com.huaweicloud.sdk.dgc.v1.model.ShowConnectionRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowConnectionResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowFileInfoRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowFileInfoResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobInstanceRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobInstanceResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.ShowScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.ShowScriptResponse;
import com.huaweicloud.sdk.dgc.v1.model.StartJobReq;
import com.huaweicloud.sdk.dgc.v1.model.StartJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.StartJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.StopJobInstanceRequest;
import com.huaweicloud.sdk.dgc.v1.model.StopJobInstanceResponse;
import com.huaweicloud.sdk.dgc.v1.model.StopJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.StopJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.StopSupplementdataRequest;
import com.huaweicloud.sdk.dgc.v1.model.StopSupplementdataResponse;
import com.huaweicloud.sdk.dgc.v1.model.SupplementDataInfo;
import com.huaweicloud.sdk.dgc.v1.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.dgc.v1.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.dgc.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.dgc.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.dgc.v1.model.UpdateResourceRequest;
import com.huaweicloud.sdk.dgc.v1.model.UpdateResourceResponse;
import com.huaweicloud.sdk.dgc.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.dgc.v1.model.UpdateScriptResponse;

@SuppressWarnings("unchecked")
public class DgcMeta {

    public static final HttpRequestDef<CancelScriptRequest, CancelScriptResponse> cancelScript = genForCancelScript();

    private static HttpRequestDef<CancelScriptRequest, CancelScriptResponse> genForCancelScript() {
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
            f -> f.withMarshaller(CancelScriptRequest::getScriptName, CancelScriptRequest::setScriptName));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScriptRequest::getInstanceId, CancelScriptRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScriptRequest::getWorkspace, CancelScriptRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection =
        genForCreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForCreateConnection() {
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
            f -> f.withMarshaller(CreateConnectionRequest::getWorkspace, CreateConnectionRequest::setWorkspace));
        builder.<ConnectionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionInfo.class),
            f -> f.withMarshaller(CreateConnectionRequest::getBody, CreateConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateJobRequest, CreateJobResponse> createJob = genForCreateJob();

    private static HttpRequestDef<CreateJobRequest, CreateJobResponse> genForCreateJob() {
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
            f -> f.withMarshaller(CreateJobRequest::getWorkspace, CreateJobRequest::setWorkspace));
        builder.<JobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobInfo.class),
            f -> f.withMarshaller(CreateJobRequest::getBody, CreateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceRequest, CreateResourceResponse> createResource =
        genForCreateResource();

    private static HttpRequestDef<CreateResourceRequest, CreateResourceResponse> genForCreateResource() {
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
            f -> f.withMarshaller(CreateResourceRequest::getWorkspace, CreateResourceRequest::setWorkspace));
        builder.<ResourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInfo.class),
            f -> f.withMarshaller(CreateResourceRequest::getBody, CreateResourceRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateResourceResponse::getBody, CreateResourceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateScriptRequest, CreateScriptResponse> createScript = genForCreateScript();

    private static HttpRequestDef<CreateScriptRequest, CreateScriptResponse> genForCreateScript() {
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
            f -> f.withMarshaller(CreateScriptRequest::getWorkspace, CreateScriptRequest::setWorkspace));
        builder.<ScriptInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptInfo.class),
            f -> f.withMarshaller(CreateScriptRequest::getBody, CreateScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSupplementdataRequest, CreateSupplementdataResponse> createSupplementdata =
        genForCreateSupplementdata();

    private static HttpRequestDef<CreateSupplementdataRequest, CreateSupplementdataResponse> genForCreateSupplementdata() {
        // basic
        HttpRequestDef.Builder<CreateSupplementdataRequest, CreateSupplementdataResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSupplementdataRequest.class, CreateSupplementdataResponse.class)
            .withName("CreateSupplementdata")
            .withUri("/v1.0/{project_id}/supplementdata")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSupplementdataRequest::getWorkspace,
                CreateSupplementdataRequest::setWorkspace));
        builder.<SupplementDataInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SupplementDataInfo.class),
            f -> f.withMarshaller(CreateSupplementdataRequest::getBody, CreateSupplementdataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnction =
        genForDeleteConnction();

    private static HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> genForDeleteConnction() {
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
            f -> f.withMarshaller(DeleteConnctionRequest::getConnectionName,
                DeleteConnctionRequest::setConnectionName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnctionRequest::getWorkspace, DeleteConnctionRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genForDeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genForDeleteJob() {
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
            f -> f.withMarshaller(DeleteJobRequest::getJobName, DeleteJobRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getWorkspace, DeleteJobRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource =
        genForDeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genForDeleteResource() {
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
            f -> f.withMarshaller(DeleteResourceRequest::getResourceId, DeleteResourceRequest::setResourceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getWorkspace, DeleteResourceRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> deleteScript = genForDeleteScript();

    private static HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> genForDeleteScript() {
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
            f -> f.withMarshaller(DeleteScriptRequest::getScriptName, DeleteScriptRequest::setScriptName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getWorkspace, DeleteScriptRequest::setWorkspace));

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
                .withUri("/v1/{project_id}/scripts/{script_name}/execute")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getScriptName, ExecuteScriptRequest::setScriptName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getWorkspace, ExecuteScriptRequest::setWorkspace));
        builder.<ExecuteScriptReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteScriptReq.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getBody, ExecuteScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> exportConnections =
        genForExportConnections();

    private static HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> genForExportConnections() {
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
            f -> f.withMarshaller(ExportConnectionsRequest::getWorkspace, ExportConnectionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportJobRequest, ExportJobResponse> exportJob = genForExportJob();

    private static HttpRequestDef<ExportJobRequest, ExportJobResponse> genForExportJob() {
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
            f -> f.withMarshaller(ExportJobRequest::getJobName, ExportJobRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportJobRequest::getWorkspace, ExportJobRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportJobListRequest, ExportJobListResponse> exportJobList =
        genForExportJobList();

    private static HttpRequestDef<ExportJobListRequest, ExportJobListResponse> genForExportJobList() {
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
            f -> f.withMarshaller(ExportJobListRequest::getWorkspace, ExportJobListRequest::setWorkspace));
        builder.<ExportJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportJobsReq.class),
            f -> f.withMarshaller(ExportJobListRequest::getBody, ExportJobListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> importConnections =
        genForImportConnections();

    private static HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> genForImportConnections() {
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
            f -> f.withMarshaller(ImportConnectionsRequest::getWorkspace, ImportConnectionsRequest::setWorkspace));
        builder.<ImportConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportConnectionReq.class),
            f -> f.withMarshaller(ImportConnectionsRequest::getBody, ImportConnectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportJobRequest, ImportJobResponse> importJob = genForImportJob();

    private static HttpRequestDef<ImportJobRequest, ImportJobResponse> genForImportJob() {
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
            f -> f.withMarshaller(ImportJobRequest::getWorkspace, ImportJobRequest::setWorkspace));
        builder.<ImportFileReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportFileReq.class),
            f -> f.withMarshaller(ImportJobRequest::getBody, ImportJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForListConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForListConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withName("ListConnections")
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getLimit, ListConnectionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getOffset, ListConnectionsRequest::setOffset));
        builder.<String>withRequestField("connectionName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getConnectionName,
                ListConnectionsRequest::setConnectionName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getWorkspace, ListConnectionsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobInstancesRequest, ListJobInstancesResponse> listJobInstances =
        genForListJobInstances();

    private static HttpRequestDef<ListJobInstancesRequest, ListJobInstancesResponse> genForListJobInstances() {
        // basic
        HttpRequestDef.Builder<ListJobInstancesRequest, ListJobInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobInstancesRequest.class, ListJobInstancesResponse.class)
                .withName("ListJobInstances")
                .withUri("/v1/{project_id}/jobs/instances/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getLimit, ListJobInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getOffset, ListJobInstancesRequest::setOffset));
        builder.<Long>withRequestField("minPlanTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getMinPlanTime, ListJobInstancesRequest::setMinPlanTime));
        builder.<Long>withRequestField("maxPlanTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getMaxPlanTime, ListJobInstancesRequest::setMaxPlanTime));
        builder.<ListJobInstancesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobInstancesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getStatus, ListJobInstancesRequest::setStatus));
        builder.<Boolean>withRequestField("preciseQuery",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getPreciseQuery, ListJobInstancesRequest::setPreciseQuery));
        builder.<String>withRequestField("jobName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getJobName, ListJobInstancesRequest::setJobName));
        builder.<ListJobInstancesRequest.InstanceTypeEnum>withRequestField("instanceType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobInstancesRequest.InstanceTypeEnum.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getInstanceType, ListJobInstancesRequest::setInstanceType));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInstancesRequest::getWorkspace, ListJobInstancesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v1/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<ListJobsRequest.JobTypeEnum>withRequestField("jobType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListJobsRequest::getJobType, ListJobsRequest::setJobType));
        builder.<String>withRequestField("jobName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getJobName, ListJobsRequest::setJobName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getTags, ListJobsRequest::setTags));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getWorkspace, ListJobsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesRequest, ListResourcesResponse> listResources =
        genForListResources();

    private static HttpRequestDef<ListResourcesRequest, ListResourcesResponse> genForListResources() {
        // basic
        HttpRequestDef.Builder<ListResourcesRequest, ListResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcesRequest.class, ListResourcesResponse.class)
                .withName("ListResources")
                .withUri("/v1/{project_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesRequest::getLimit, ListResourcesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesRequest::getOffset, ListResourcesRequest::setOffset));
        builder.<String>withRequestField("resourceName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getResourceName, ListResourcesRequest::setResourceName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getWorkspace, ListResourcesRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptResultsRequest, ListScriptResultsResponse> listScriptResults =
        genForListScriptResults();

    private static HttpRequestDef<ListScriptResultsRequest, ListScriptResultsResponse> genForListScriptResults() {
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
            f -> f.withMarshaller(ListScriptResultsRequest::getScriptName, ListScriptResultsRequest::setScriptName));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptResultsRequest::getInstanceId, ListScriptResultsRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptResultsRequest::getWorkspace, ListScriptResultsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptsRequest, ListScriptsResponse> listScripts = genForListScripts();

    private static HttpRequestDef<ListScriptsRequest, ListScriptsResponse> genForListScripts() {
        // basic
        HttpRequestDef.Builder<ListScriptsRequest, ListScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptsRequest.class, ListScriptsResponse.class)
                .withName("ListScripts")
                .withUri("/v1/{project_id}/scripts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptsRequest::getLimit, ListScriptsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptsRequest::getOffset, ListScriptsRequest::setOffset));
        builder.<String>withRequestField("scriptName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getScriptName, ListScriptsRequest::setScriptName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getWorkspace, ListScriptsRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupplementdataRequest, ListSupplementdataResponse> listSupplementdata =
        genForListSupplementdata();

    private static HttpRequestDef<ListSupplementdataRequest, ListSupplementdataResponse> genForListSupplementdata() {
        // basic
        HttpRequestDef.Builder<ListSupplementdataRequest, ListSupplementdataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSupplementdataRequest.class, ListSupplementdataResponse.class)
                .withName("ListSupplementdata")
                .withUri("/v1.0/{project_id}/supplementdata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getSort, ListSupplementdataRequest::setSort));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getPage, ListSupplementdataRequest::setPage));
        builder.<String>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getSize, ListSupplementdataRequest::setSize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getName, ListSupplementdataRequest::setName));
        builder.<String>withRequestField("userName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getUserName, ListSupplementdataRequest::setUserName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getStatus, ListSupplementdataRequest::setStatus));
        builder.<String>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getStartDate, ListSupplementdataRequest::setStartDate));
        builder.<String>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getEndDate, ListSupplementdataRequest::setEndDate));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSupplementdataRequest::getWorkspace, ListSupplementdataRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemTasksRequest, ListSystemTasksResponse> listSystemTasks =
        genForListSystemTasks();

    private static HttpRequestDef<ListSystemTasksRequest, ListSystemTasksResponse> genForListSystemTasks() {
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
            f -> f.withMarshaller(ListSystemTasksRequest::getTaskId, ListSystemTasksRequest::setTaskId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemTasksRequest::getWorkspace, ListSystemTasksRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreJobInstanceRequest, RestoreJobInstanceResponse> restoreJobInstance =
        genForRestoreJobInstance();

    private static HttpRequestDef<RestoreJobInstanceRequest, RestoreJobInstanceResponse> genForRestoreJobInstance() {
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
            f -> f.withMarshaller(RestoreJobInstanceRequest::getJobName, RestoreJobInstanceRequest::setJobName));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreJobInstanceRequest::getInstanceId, RestoreJobInstanceRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreJobInstanceRequest::getWorkspace, RestoreJobInstanceRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunOnceRequest, RunOnceResponse> runOnce = genForRunOnce();

    private static HttpRequestDef<RunOnceRequest, RunOnceResponse> genForRunOnce() {
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
            f -> f.withMarshaller(RunOnceRequest::getJobName, RunOnceRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunOnceRequest::getWorkspace, RunOnceRequest::setWorkspace));
        builder.<StartJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartJobReq.class),
            f -> f.withMarshaller(RunOnceRequest::getBody, RunOnceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> showConnection =
        genForShowConnection();

    private static HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> genForShowConnection() {
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
            f -> f.withMarshaller(ShowConnectionRequest::getConnectionName, ShowConnectionRequest::setConnectionName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionRequest::getWorkspace, ShowConnectionRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileInfoRequest, ShowFileInfoResponse> showFileInfo = genForShowFileInfo();

    private static HttpRequestDef<ShowFileInfoRequest, ShowFileInfoResponse> genForShowFileInfo() {
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
            f -> f.withMarshaller(ShowFileInfoRequest::getWorkspace, ShowFileInfoRequest::setWorkspace));
        builder.<FilePath>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FilePath.class),
            f -> f.withMarshaller(ShowFileInfoRequest::getBody, ShowFileInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getJobName, ShowJobRequest::setJobName));
        builder.<Integer>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobRequest::getVersion, ShowJobRequest::setVersion));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getWorkspace, ShowJobRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInstanceRequest, ShowJobInstanceResponse> showJobInstance =
        genForShowJobInstance();

    private static HttpRequestDef<ShowJobInstanceRequest, ShowJobInstanceResponse> genForShowJobInstance() {
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
            f -> f.withMarshaller(ShowJobInstanceRequest::getJobName, ShowJobInstanceRequest::setJobName));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceRequest::getInstanceId, ShowJobInstanceRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInstanceRequest::getWorkspace, ShowJobInstanceRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForShowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForShowJobStatus() {
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
            f -> f.withMarshaller(ShowJobStatusRequest::getJobName, ShowJobStatusRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getWorkspace, ShowJobStatusRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRequest, ShowResourceResponse> showResource = genForShowResource();

    private static HttpRequestDef<ShowResourceRequest, ShowResourceResponse> genForShowResource() {
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
            f -> f.withMarshaller(ShowResourceRequest::getResourceId, ShowResourceRequest::setResourceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRequest::getWorkspace, ShowResourceRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScriptRequest, ShowScriptResponse> showScript = genForShowScript();

    private static HttpRequestDef<ShowScriptRequest, ShowScriptResponse> genForShowScript() {
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
            f -> f.withMarshaller(ShowScriptRequest::getScriptName, ShowScriptRequest::setScriptName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScriptRequest::getWorkspace, ShowScriptRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartJobRequest, StartJobResponse> startJob = genForStartJob();

    private static HttpRequestDef<StartJobRequest, StartJobResponse> genForStartJob() {
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
            f -> f.withMarshaller(StartJobRequest::getJobName, StartJobRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartJobRequest::getWorkspace, StartJobRequest::setWorkspace));
        builder.<StartJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartJobReq.class),
            f -> f.withMarshaller(StartJobRequest::getBody, StartJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForStopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForStopJob() {
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
            f -> f.withMarshaller(StopJobRequest::getJobName, StopJobRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobRequest::getWorkspace, StopJobRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobInstanceRequest, StopJobInstanceResponse> stopJobInstance =
        genForStopJobInstance();

    private static HttpRequestDef<StopJobInstanceRequest, StopJobInstanceResponse> genForStopJobInstance() {
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
            f -> f.withMarshaller(StopJobInstanceRequest::getJobName, StopJobInstanceRequest::setJobName));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobInstanceRequest::getInstanceId, StopJobInstanceRequest::setInstanceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopJobInstanceRequest::getWorkspace, StopJobInstanceRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSupplementdataRequest, StopSupplementdataResponse> stopSupplementdata =
        genForStopSupplementdata();

    private static HttpRequestDef<StopSupplementdataRequest, StopSupplementdataResponse> genForStopSupplementdata() {
        // basic
        HttpRequestDef.Builder<StopSupplementdataRequest, StopSupplementdataResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopSupplementdataRequest.class, StopSupplementdataResponse.class)
                .withName("StopSupplementdata")
                .withUri("/v1.0/{project_id}/supplementdata/{instanceName}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instanceName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSupplementdataRequest::getInstanceName,
                StopSupplementdataRequest::setInstanceName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSupplementdataRequest::getWorkspace, StopSupplementdataRequest::setWorkspace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection =
        genForUpdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForUpdateConnection() {
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
            f -> f.withMarshaller(UpdateConnectionRequest::getConnectionName,
                UpdateConnectionRequest::setConnectionName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getWorkspace, UpdateConnectionRequest::setWorkspace));
        builder.<ConnectionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionInfo.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, UpdateConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForUpdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForUpdateJob() {
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
            f -> f.withMarshaller(UpdateJobRequest::getJobName, UpdateJobRequest::setJobName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getWorkspace, UpdateJobRequest::setWorkspace));
        builder.<JobInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobInfo.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, UpdateJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> updateResource =
        genForUpdateResource();

    private static HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> genForUpdateResource() {
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
            f -> f.withMarshaller(UpdateResourceRequest::getResourceId, UpdateResourceRequest::setResourceId));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getWorkspace, UpdateResourceRequest::setWorkspace));
        builder.<ResourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceInfo.class),
            f -> f.withMarshaller(UpdateResourceRequest::getBody, UpdateResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> updateScript = genForUpdateScript();

    private static HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> genForUpdateScript() {
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
            f -> f.withMarshaller(UpdateScriptRequest::getScriptName, UpdateScriptRequest::setScriptName));
        builder.<String>withRequestField("workspace",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getWorkspace, UpdateScriptRequest::setWorkspace));
        builder.<ScriptInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptInfo.class),
            f -> f.withMarshaller(UpdateScriptRequest::getBody, UpdateScriptRequest::setBody));

        // response

        return builder.build();
    }

}

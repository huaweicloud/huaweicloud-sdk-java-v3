package com.huaweicloud.sdk.aom.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.aom.v1.model.*;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class AomMeta {

    public static final HttpRequestDef<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> createFastExecuteScript = genForcreateFastExecuteScript();

    private static HttpRequestDef<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> genForcreateFastExecuteScript() {
        // basic
        HttpRequestDef.Builder<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFastExecuteScriptRequest.class, CreateFastExecuteScriptResponse.class)
                .withName("CreateFastExecuteScript")
                .withUri("/v1/{project_id}/cms/fast-execute-script")
                .withContentType("application/json");

        // requests
        builder.<HISFastScript>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HISFastScript.class),
            f -> f.withMarshaller(CreateFastExecuteScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflow = genForcreateWorkflow();

    private static HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> genForcreateWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowRequest, CreateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkflowRequest.class, CreateWorkflowResponse.class)
                .withName("CreateWorkflow")
                .withUri("/v1/{project_id}/cms/workflow")
                .withContentType("application/json");

        // requests
        builder.<WorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowRequestBody.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ExecuteWorkflowRequest, ExecuteWorkflowResponse> executeWorkflow = genForexecuteWorkflow();

    private static HttpRequestDef<ExecuteWorkflowRequest, ExecuteWorkflowResponse> genForexecuteWorkflow() {
        // basic
        HttpRequestDef.Builder<ExecuteWorkflowRequest, ExecuteWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteWorkflowRequest.class, ExecuteWorkflowResponse.class)
                .withName("ExecuteWorkflow")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListAllJobByNameRequest, ListAllJobByNameResponse> listAllJobByName = genForlistAllJobByName();

    private static HttpRequestDef<ListAllJobByNameRequest, ListAllJobByNameResponse> genForlistAllJobByName() {
        // basic
        HttpRequestDef.Builder<ListAllJobByNameRequest, ListAllJobByNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAllJobByNameRequest.class, ListAllJobByNameResponse.class)
                .withName("ListAllJobByName")
                .withUri("/v1/{project_id}/cms/job/list")
                .withContentType("application/json");

        // requests
        builder.<SearchJobsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchJobsRequestBody.class),
            f -> f.withMarshaller(ListAllJobByNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListAllScriptByNameRequest, ListAllScriptByNameResponse> listAllScriptByName = genForlistAllScriptByName();

    private static HttpRequestDef<ListAllScriptByNameRequest, ListAllScriptByNameResponse> genForlistAllScriptByName() {
        // basic
        HttpRequestDef.Builder<ListAllScriptByNameRequest, ListAllScriptByNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAllScriptByNameRequest.class, ListAllScriptByNameResponse.class)
                .withName("ListAllScriptByName")
                .withUri("/v1/{project_id}/cms/script/list")
                .withContentType("application/json");

        // requests
        builder.<SearchScriptsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchScriptsRequestBody.class),
            f -> f.withMarshaller(ListAllScriptByNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> listAllVersionByVersionId = genForlistAllVersionByVersionId();

    private static HttpRequestDef<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> genForlistAllVersionByVersionId() {
        // basic
        HttpRequestDef.Builder<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAllVersionByVersionIdRequest.class, ListAllVersionByVersionIdResponse.class)
                .withName("ListAllVersionByVersionId")
                .withUri("/v1/{project_id}/cms/script-version-list")
                .withContentType("application/json");

        // requests
        builder.<SearchScriptsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchScriptsRequestBody.class),
            f -> f.withMarshaller(ListAllVersionByVersionIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse> listTemplateByJobId = genForlistTemplateByJobId();

    private static HttpRequestDef<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse> genForlistTemplateByJobId() {
        // basic
        HttpRequestDef.Builder<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTemplateByJobIdRequest.class, ListTemplateByJobIdResponse.class)
                .withName("ListTemplateByJobId")
                .withUri("/v1/{project_id}/cms/template-list/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateByJobIdRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.<ListTemplateByJobIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTemplateByJobIdRequestBody.class),
            f -> f.withMarshaller(ListTemplateByJobIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> listWorkflow = genForlistWorkflow();

    private static HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> genForlistWorkflow() {
        // basic
        HttpRequestDef.Builder<ListWorkflowRequest, ListWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListWorkflowRequest.class, ListWorkflowResponse.class)
                .withName("ListWorkflow")
                .withUri("/v1/{project_id}/cms/workflow-list")
                .withContentType("application/json");

        // requests
        builder.<WorkflowQueryParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowQueryParam.class),
            f -> f.withMarshaller(ListWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutions = genForlistWorkflowExecutions();

    private static HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> genForlistWorkflowExecutions() {
        // basic
        HttpRequestDef.Builder<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowExecutionsRequest.class, ListWorkflowExecutionsResponse.class)
                .withName("ListWorkflowExecutions")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            })
        );
        builder.<String>withRequestField("x_enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getXEnterpriseProjectId, (req, v) -> {
                req.setXEnterpriseProjectId(v);
            })
        );

        // response
        builder.<List<WorkflowExecutionBrief>>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWorkflowExecutionsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(WorkflowExecutionBrief.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<SearchTemplateByIdRequest, SearchTemplateByIdResponse> searchTemplateById = genForsearchTemplateById();

    private static HttpRequestDef<SearchTemplateByIdRequest, SearchTemplateByIdResponse> genForsearchTemplateById() {
        // basic
        HttpRequestDef.Builder<SearchTemplateByIdRequest, SearchTemplateByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchTemplateByIdRequest.class, SearchTemplateByIdResponse.class)
                .withName("SearchTemplateById")
                .withUri("/v1/{project_id}/cms/template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchTemplateByIdRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.<String>withRequestField("share_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchTemplateByIdRequest::getShareType, (req, v) -> {
                req.setShareType(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> searchWorkflowExecutionDetail = genForsearchWorkflowExecutionDetail();

    private static HttpRequestDef<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> genForsearchWorkflowExecutionDetail() {
        // basic
        HttpRequestDef.Builder<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchWorkflowExecutionDetailRequest.class, SearchWorkflowExecutionDetailResponse.class)
                .withName("SearchWorkflowExecutionDetail")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions/{execution_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchWorkflowExecutionDetailRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            })
        );
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchWorkflowExecutionDetailRequest::getExecutionId, (req, v) -> {
                req.setExecutionId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> startPausingWorkflowExecutions = genForstartPausingWorkflowExecutions();

    private static HttpRequestDef<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> genForstartPausingWorkflowExecutions() {
        // basic
        HttpRequestDef.Builder<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartPausingWorkflowExecutionsRequest.class, StartPausingWorkflowExecutionsResponse.class)
                .withName("StartPausingWorkflowExecutions")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions/{execution_id}/operation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            })
        );
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getExecutionId, (req, v) -> {
                req.setExecutionId(v);
            })
        );
        builder.<StartPausingWorkflowExecutionsRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartPausingWorkflowExecutionsRequest.ActionEnum.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<StopExecutionRequest, StopExecutionResponse> stopExecution = genForstopExecution();

    private static HttpRequestDef<StopExecutionRequest, StopExecutionResponse> genForstopExecution() {
        // basic
        HttpRequestDef.Builder<StopExecutionRequest, StopExecutionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopExecutionRequest.class, StopExecutionResponse.class)
                .withName("StopExecution")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions/{execution_id}/terminate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopExecutionRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            })
        );
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopExecutionRequest::getExecutionId, (req, v) -> {
                req.setExecutionId(v);
            })
        );

        // response
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopExecutionResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> updateWorkflowTriggerStatus = genForupdateWorkflowTriggerStatus();

    private static HttpRequestDef<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> genForupdateWorkflowTriggerStatus() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkflowTriggerStatusRequest.class, UpdateWorkflowTriggerStatusResponse.class)
                .withName("UpdateWorkflowTriggerStatus")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/trigger/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowTriggerStatusRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            })
        );
        builder.<UpdateWorkflowTriggerStatusRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkflowTriggerStatusRequest.ActionEnum.class),
            f -> f.withMarshaller(UpdateWorkflowTriggerStatusRequest::getAction, (req, v) -> {
                req.setAction(v);
            })
        );

        // response
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWorkflowTriggerStatusResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

}

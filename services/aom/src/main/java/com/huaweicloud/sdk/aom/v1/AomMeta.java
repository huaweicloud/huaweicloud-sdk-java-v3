package com.huaweicloud.sdk.aom.v1;

import com.huaweicloud.sdk.aom.v1.model.CreateFastExecuteScriptRequest;
import com.huaweicloud.sdk.aom.v1.model.CreateFastExecuteScriptResponse;
import com.huaweicloud.sdk.aom.v1.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.aom.v1.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.aom.v1.model.ExecuteWorkflowRequest;
import com.huaweicloud.sdk.aom.v1.model.ExecuteWorkflowResponse;
import com.huaweicloud.sdk.aom.v1.model.HISFastScript;
import com.huaweicloud.sdk.aom.v1.model.ListAllJobByNameRequest;
import com.huaweicloud.sdk.aom.v1.model.ListAllJobByNameResponse;
import com.huaweicloud.sdk.aom.v1.model.ListAllScriptByNameRequest;
import com.huaweicloud.sdk.aom.v1.model.ListAllScriptByNameResponse;
import com.huaweicloud.sdk.aom.v1.model.ListAllVersionByVersionIdRequest;
import com.huaweicloud.sdk.aom.v1.model.ListAllVersionByVersionIdResponse;
import com.huaweicloud.sdk.aom.v1.model.ListTemplateByJobIdRequest;
import com.huaweicloud.sdk.aom.v1.model.ListTemplateByJobIdRequestBody;
import com.huaweicloud.sdk.aom.v1.model.ListTemplateByJobIdResponse;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowExecutionsRequest;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowExecutionsResponse;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowRequest;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowResponse;
import com.huaweicloud.sdk.aom.v1.model.SearchJobsRequestBody;
import com.huaweicloud.sdk.aom.v1.model.SearchScriptsRequestBody;
import com.huaweicloud.sdk.aom.v1.model.SearchTemplateByIdRequest;
import com.huaweicloud.sdk.aom.v1.model.SearchTemplateByIdResponse;
import com.huaweicloud.sdk.aom.v1.model.SearchWorkflowExecutionDetailRequest;
import com.huaweicloud.sdk.aom.v1.model.SearchWorkflowExecutionDetailResponse;
import com.huaweicloud.sdk.aom.v1.model.StartPausingWorkflowExecutionsRequest;
import com.huaweicloud.sdk.aom.v1.model.StartPausingWorkflowExecutionsResponse;
import com.huaweicloud.sdk.aom.v1.model.StopExecutionRequest;
import com.huaweicloud.sdk.aom.v1.model.StopExecutionResponse;
import com.huaweicloud.sdk.aom.v1.model.UpdateWorkflowTriggerStatusRequest;
import com.huaweicloud.sdk.aom.v1.model.UpdateWorkflowTriggerStatusResponse;
import com.huaweicloud.sdk.aom.v1.model.WorkflowExecutionBrief;
import com.huaweicloud.sdk.aom.v1.model.WorkflowQueryParam;
import com.huaweicloud.sdk.aom.v1.model.WorkflowRequestBody;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class AomMeta {

    public static final HttpRequestDef<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> createFastExecuteScript =
        genForCreateFastExecuteScript();

    private static HttpRequestDef<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> genForCreateFastExecuteScript() {
        // basic
        HttpRequestDef.Builder<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFastExecuteScriptRequest.class, CreateFastExecuteScriptResponse.class)
            .withName("CreateFastExecuteScript")
            .withUri("/v1/{project_id}/cms/fast-execute-script")
            .withContentType("application/json");

        // requests
        builder.<HISFastScript>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HISFastScript.class),
            f -> f.withMarshaller(CreateFastExecuteScriptRequest::getBody, CreateFastExecuteScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflow =
        genForCreateWorkflow();

    private static HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> genForCreateWorkflow() {
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
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, CreateWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteWorkflowRequest, ExecuteWorkflowResponse> executeWorkflow =
        genForExecuteWorkflow();

    private static HttpRequestDef<ExecuteWorkflowRequest, ExecuteWorkflowResponse> genForExecuteWorkflow() {
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
            f -> f.withMarshaller(ExecuteWorkflowRequest::getWorkflowId, ExecuteWorkflowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllJobByNameRequest, ListAllJobByNameResponse> listAllJobByName =
        genForListAllJobByName();

    private static HttpRequestDef<ListAllJobByNameRequest, ListAllJobByNameResponse> genForListAllJobByName() {
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
            f -> f.withMarshaller(ListAllJobByNameRequest::getBody, ListAllJobByNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllScriptByNameRequest, ListAllScriptByNameResponse> listAllScriptByName =
        genForListAllScriptByName();

    private static HttpRequestDef<ListAllScriptByNameRequest, ListAllScriptByNameResponse> genForListAllScriptByName() {
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
            f -> f.withMarshaller(ListAllScriptByNameRequest::getBody, ListAllScriptByNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> listAllVersionByVersionId =
        genForListAllVersionByVersionId();

    private static HttpRequestDef<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> genForListAllVersionByVersionId() {
        // basic
        HttpRequestDef.Builder<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAllVersionByVersionIdRequest.class,
                    ListAllVersionByVersionIdResponse.class)
                .withName("ListAllVersionByVersionId")
                .withUri("/v1/{project_id}/cms/script-version-list")
                .withContentType("application/json");

        // requests
        builder.<SearchScriptsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchScriptsRequestBody.class),
            f -> f.withMarshaller(ListAllVersionByVersionIdRequest::getBody,
                ListAllVersionByVersionIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse> listTemplateByJobId =
        genForListTemplateByJobId();

    private static HttpRequestDef<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse> genForListTemplateByJobId() {
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
            f -> f.withMarshaller(ListTemplateByJobIdRequest::getJobId, ListTemplateByJobIdRequest::setJobId));
        builder.<ListTemplateByJobIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTemplateByJobIdRequestBody.class),
            f -> f.withMarshaller(ListTemplateByJobIdRequest::getBody, ListTemplateByJobIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> listWorkflow = genForListWorkflow();

    private static HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> genForListWorkflow() {
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
            f -> f.withMarshaller(ListWorkflowRequest::getBody, ListWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutions =
        genForListWorkflowExecutions();

    private static HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> genForListWorkflowExecutions() {
        // basic
        HttpRequestDef.Builder<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkflowExecutionsRequest.class, ListWorkflowExecutionsResponse.class)
            .withName("ListWorkflowExecutions")
            .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getWorkflowId,
                ListWorkflowExecutionsRequest::setWorkflowId));
        builder.<String>withRequestField("x_enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getXEnterpriseProjectId,
                ListWorkflowExecutionsRequest::setXEnterpriseProjectId));

        // response
        builder.<List<WorkflowExecutionBrief>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWorkflowExecutionsResponse::getBody, ListWorkflowExecutionsResponse::setBody)
                .withInnerContainerType(WorkflowExecutionBrief.class));

        return builder.build();
    }

    public static final HttpRequestDef<SearchTemplateByIdRequest, SearchTemplateByIdResponse> searchTemplateById =
        genForSearchTemplateById();

    private static HttpRequestDef<SearchTemplateByIdRequest, SearchTemplateByIdResponse> genForSearchTemplateById() {
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
            f -> f.withMarshaller(SearchTemplateByIdRequest::getTemplateId, SearchTemplateByIdRequest::setTemplateId));
        builder.<String>withRequestField("share_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchTemplateByIdRequest::getShareType, SearchTemplateByIdRequest::setShareType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> searchWorkflowExecutionDetail =
        genForSearchWorkflowExecutionDetail();

    private static HttpRequestDef<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> genForSearchWorkflowExecutionDetail() {
        // basic
        HttpRequestDef.Builder<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchWorkflowExecutionDetailRequest.class,
                    SearchWorkflowExecutionDetailResponse.class)
                .withName("SearchWorkflowExecutionDetail")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions/{execution_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchWorkflowExecutionDetailRequest::getWorkflowId,
                SearchWorkflowExecutionDetailRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchWorkflowExecutionDetailRequest::getExecutionId,
                SearchWorkflowExecutionDetailRequest::setExecutionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> startPausingWorkflowExecutions =
        genForStartPausingWorkflowExecutions();

    private static HttpRequestDef<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> genForStartPausingWorkflowExecutions() {
        // basic
        HttpRequestDef.Builder<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartPausingWorkflowExecutionsRequest.class,
                    StartPausingWorkflowExecutionsResponse.class)
                .withName("StartPausingWorkflowExecutions")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/executions/{execution_id}/operation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getWorkflowId,
                StartPausingWorkflowExecutionsRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getExecutionId,
                StartPausingWorkflowExecutionsRequest::setExecutionId));
        builder.<StartPausingWorkflowExecutionsRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartPausingWorkflowExecutionsRequest.ActionEnum.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getAction,
                StartPausingWorkflowExecutionsRequest::setAction));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartPausingWorkflowExecutionsRequest::getNodeId,
                StartPausingWorkflowExecutionsRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopExecutionRequest, StopExecutionResponse> stopExecution =
        genForStopExecution();

    private static HttpRequestDef<StopExecutionRequest, StopExecutionResponse> genForStopExecution() {
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
            f -> f.withMarshaller(StopExecutionRequest::getWorkflowId, StopExecutionRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopExecutionRequest::getExecutionId, StopExecutionRequest::setExecutionId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopExecutionResponse::getBody, StopExecutionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> updateWorkflowTriggerStatus =
        genForUpdateWorkflowTriggerStatus();

    private static HttpRequestDef<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> genForUpdateWorkflowTriggerStatus() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateWorkflowTriggerStatusRequest.class,
                    UpdateWorkflowTriggerStatusResponse.class)
                .withName("UpdateWorkflowTriggerStatus")
                .withUri("/v1/{project_id}/cms/workflow/{workflow_id}/trigger/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowTriggerStatusRequest::getWorkflowId,
                UpdateWorkflowTriggerStatusRequest::setWorkflowId));
        builder.<UpdateWorkflowTriggerStatusRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkflowTriggerStatusRequest.ActionEnum.class),
            f -> f.withMarshaller(UpdateWorkflowTriggerStatusRequest::getAction,
                UpdateWorkflowTriggerStatusRequest::setAction));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWorkflowTriggerStatusResponse::getBody,
                UpdateWorkflowTriggerStatusResponse::setBody));

        return builder.build();
    }

}

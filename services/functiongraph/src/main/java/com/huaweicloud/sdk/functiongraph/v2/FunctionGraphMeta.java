package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteFunctionTriggersRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteFunctionTriggersResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteWorkflowsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteWorkflowsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CallbackWorkflowRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CancelAsyncInvocationRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CancelAsyncInvocationRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CancelAsyncInvocationResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateCallbackWorkflowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateCallbackWorkflowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateEventRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionAppRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionAppRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionAppResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionTriggerRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionVersionRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateTagsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateTagsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVersionAliasRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVpcEndpointRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVpcEndpointRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVpcEndpointResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAppRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAppResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteTagsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteTagsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVpcEndpointRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVpcEndpointResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.EnableAsyncStatusLogRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.EnableAsyncStatusLogResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.EnableLtsLogsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.EnableLtsLogsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ExportFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ExportFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.FlowExecuteBody;
import com.huaweicloud.sdk.functiongraph.v2.model.ImportFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ImportFunctionRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.ImportFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.InvokeFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.InvokeFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListActiveAsyncInvocationsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListActiveAsyncInvocationsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAppTemplatesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAppTemplatesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAsyncInvocationsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAsyncInvocationsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeFunctionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeFunctionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeVersionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeVersionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependenciesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependenciesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListEnterpriseResourceRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.ListEventsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListEventsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionApplicationsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionApplicationsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsMetricRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsMetricResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionReservedInstancesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionReservedInstancesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionResult;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionStatisticsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionStatisticsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTagsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTagsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTemplateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTemplateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTriggerResult;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTriggersRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTriggersResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionVersionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionVersionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListReservedInstanceConfigsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListReservedInstanceConfigsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListStatisticsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListStatisticsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListVersionAliasResult;
import com.huaweicloud.sdk.functiongraph.v2.model.ListVersionAliasesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListVersionAliasesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowExecutionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowExecutionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.RetryWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.RetryWorkFlowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ServiceBridgeVersion;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowAppTemplateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowAppTemplateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncReservedInstanceMetricsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncReservedInstanceMetricsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncSnapshotStateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncSnapshotStateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAppRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAppResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionCodeRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionCodeResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionMetricsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionMetricsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTemplateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTemplateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowLtsLogDetailsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowLtsLogDetailsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectAsyncStatusLogInfoRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectAsyncStatusLogInfoResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectTagsListRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectTagsListResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowResInstanceInfoRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowResInstanceInfoResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTenantMetricRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTenantMetricResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTracingRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTracingResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowMetricRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowMetricResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionForPageRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionForPageResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.StartSyncWorkflowExecutionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.StartSyncWorkflowExecutionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.StartWorkflowExecutionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.StartWorkflowExecutionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.StopWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.StopWorkFlowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFuncSnapshotRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFuncSnapshotResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionAsyncInvokeConfigRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCodeRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCodeRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCodeResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCollectStateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCollectStateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionConfigRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionMaxInstanceConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionMaxInstanceConfigRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionMaxInstanceConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionReservedInstancesCountRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionReservedInstancesCountRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionReservedInstancesCountResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionTagsRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTracingRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTracingRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTracingResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTriggerRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateVersionAliasRequestBody;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateWorkFlowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.WorkflowCreateBody;
import com.huaweicloud.sdk.functiongraph.v2.model.WorkflowDeleteBody;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class FunctionGraphMeta {

    public static final HttpRequestDef<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> asyncInvokeFunction =
        genForAsyncInvokeFunction();

    private static HttpRequestDef<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> genForAsyncInvokeFunction() {
        // basic
        HttpRequestDef.Builder<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AsyncInvokeFunctionRequest.class, AsyncInvokeFunctionResponse.class)
                .withName("AsyncInvokeFunction")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/invocations-async")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AsyncInvokeFunctionRequest::getFunctionUrn,
                AsyncInvokeFunctionRequest::setFunctionUrn));
        builder.<String>withRequestField("X-Cff-Instance-Memory",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AsyncInvokeFunctionRequest::getXCffInstanceMemory,
                AsyncInvokeFunctionRequest::setXCffInstanceMemory));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AsyncInvokeFunctionRequest::getBody, AsyncInvokeFunctionRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggers =
        genForBatchDeleteFunctionTriggers();

    private static HttpRequestDef<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> genForBatchDeleteFunctionTriggers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteFunctionTriggersRequest.class,
                    BatchDeleteFunctionTriggersResponse.class)
                .withName("BatchDeleteFunctionTriggers")
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteFunctionTriggersRequest::getFunctionUrn,
                BatchDeleteFunctionTriggersRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> batchDeleteWorkflows =
        genForBatchDeleteWorkflows();

    private static HttpRequestDef<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> genForBatchDeleteWorkflows() {
        // basic
        HttpRequestDef.Builder<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteWorkflowsRequest.class, BatchDeleteWorkflowsResponse.class)
            .withName("BatchDeleteWorkflows")
            .withUri("/v2/{project_id}/fgs/workflows")
            .withContentType("application/json");

        // requests
        builder.<WorkflowDeleteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowDeleteBody.class),
            f -> f.withMarshaller(BatchDeleteWorkflowsRequest::getBody, BatchDeleteWorkflowsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> cancelAsyncInvocation =
        genForCancelAsyncInvocation();

    private static HttpRequestDef<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> genForCancelAsyncInvocation() {
        // basic
        HttpRequestDef.Builder<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelAsyncInvocationRequest.class, CancelAsyncInvocationResponse.class)
            .withName("CancelAsyncInvocation")
            .withUri("/v2/{project_id}/fgs/functions/{function_urn}/cancel")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAsyncInvocationRequest::getFunctionUrn,
                CancelAsyncInvocationRequest::setFunctionUrn));
        builder.<CancelAsyncInvocationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelAsyncInvocationRequestBody.class),
            f -> f.withMarshaller(CancelAsyncInvocationRequest::getBody, CancelAsyncInvocationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCallbackWorkflowRequest, CreateCallbackWorkflowResponse> createCallbackWorkflow =
        genForCreateCallbackWorkflow();

    private static HttpRequestDef<CreateCallbackWorkflowRequest, CreateCallbackWorkflowResponse> genForCreateCallbackWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateCallbackWorkflowRequest, CreateCallbackWorkflowResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCallbackWorkflowRequest.class, CreateCallbackWorkflowResponse.class)
            .withName("CreateCallbackWorkflow")
            .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/callback")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallbackWorkflowRequest::getWorkflowId,
                CreateCallbackWorkflowRequest::setWorkflowId));
        builder.<String>withRequestField("X-Workflow-Run-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallbackWorkflowRequest::getXWorkflowRunId,
                CreateCallbackWorkflowRequest::setXWorkflowRunId));
        builder.<String>withRequestField("X-Workflow-State-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallbackWorkflowRequest::getXWorkflowStateId,
                CreateCallbackWorkflowRequest::setXWorkflowStateId));
        builder.<CallbackWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CallbackWorkflowRequestBody.class),
            f -> f.withMarshaller(CreateCallbackWorkflowRequest::getBody, CreateCallbackWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDependencyVersionRequest, CreateDependencyVersionResponse> createDependencyVersion =
        genForCreateDependencyVersion();

    private static HttpRequestDef<CreateDependencyVersionRequest, CreateDependencyVersionResponse> genForCreateDependencyVersion() {
        // basic
        HttpRequestDef.Builder<CreateDependencyVersionRequest, CreateDependencyVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDependencyVersionRequest.class, CreateDependencyVersionResponse.class)
            .withName("CreateDependencyVersion")
            .withUri("/v2/{project_id}/fgs/dependencies/version")
            .withContentType("application/json");

        // requests
        builder.<CreateDependencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDependencyRequestBody.class),
            f -> f.withMarshaller(CreateDependencyVersionRequest::getBody, CreateDependencyVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventRequest, CreateEventResponse> createEvent = genForCreateEvent();

    private static HttpRequestDef<CreateEventRequest, CreateEventResponse> genForCreateEvent() {
        // basic
        HttpRequestDef.Builder<CreateEventRequest, CreateEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventRequest.class, CreateEventResponse.class)
                .withName("CreateEvent")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEventRequest::getFunctionUrn, CreateEventRequest::setFunctionUrn));
        builder.<CreateEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEventRequestBody.class),
            f -> f.withMarshaller(CreateEventRequest::getBody, CreateEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> createFunction =
        genForCreateFunction();

    private static HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> genForCreateFunction() {
        // basic
        HttpRequestDef.Builder<CreateFunctionRequest, CreateFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFunctionRequest.class, CreateFunctionResponse.class)
                .withName("CreateFunction")
                .withUri("/v2/{project_id}/fgs/functions")
                .withContentType("application/json");

        // requests
        builder.<CreateFunctionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFunctionRequestBody.class),
            f -> f.withMarshaller(CreateFunctionRequest::getBody, CreateFunctionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionAppRequest, CreateFunctionAppResponse> createFunctionApp =
        genForCreateFunctionApp();

    private static HttpRequestDef<CreateFunctionAppRequest, CreateFunctionAppResponse> genForCreateFunctionApp() {
        // basic
        HttpRequestDef.Builder<CreateFunctionAppRequest, CreateFunctionAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFunctionAppRequest.class, CreateFunctionAppResponse.class)
                .withName("CreateFunctionApp")
                .withUri("/v2/{project_id}/fgs/applications")
                .withContentType("application/json");

        // requests
        builder.<CreateFunctionAppRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFunctionAppRequestBody.class),
            f -> f.withMarshaller(CreateFunctionAppRequest::getBody, CreateFunctionAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> createFunctionTrigger =
        genForCreateFunctionTrigger();

    private static HttpRequestDef<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> genForCreateFunctionTrigger() {
        // basic
        HttpRequestDef.Builder<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFunctionTriggerRequest.class, CreateFunctionTriggerResponse.class)
            .withName("CreateFunctionTrigger")
            .withUri("/v2/{project_id}/fgs/triggers/{function_urn}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFunctionTriggerRequest::getFunctionUrn,
                CreateFunctionTriggerRequest::setFunctionUrn));
        builder.<CreateFunctionTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFunctionTriggerRequestBody.class),
            f -> f.withMarshaller(CreateFunctionTriggerRequest::getBody, CreateFunctionTriggerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionVersionRequest, CreateFunctionVersionResponse> createFunctionVersion =
        genForCreateFunctionVersion();

    private static HttpRequestDef<CreateFunctionVersionRequest, CreateFunctionVersionResponse> genForCreateFunctionVersion() {
        // basic
        HttpRequestDef.Builder<CreateFunctionVersionRequest, CreateFunctionVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFunctionVersionRequest.class, CreateFunctionVersionResponse.class)
            .withName("CreateFunctionVersion")
            .withUri("/v2/{project_id}/fgs/functions/{function_urn}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFunctionVersionRequest::getFunctionUrn,
                CreateFunctionVersionRequest::setFunctionUrn));
        builder.<CreateFunctionVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFunctionVersionRequestBody.class),
            f -> f.withMarshaller(CreateFunctionVersionRequest::getBody, CreateFunctionVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagsRequest, CreateTagsResponse> createTags = genForCreateTags();

    private static HttpRequestDef<CreateTagsRequest, CreateTagsResponse> genForCreateTags() {
        // basic
        HttpRequestDef.Builder<CreateTagsRequest, CreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagsRequest.class, CreateTagsResponse.class)
                .withName("CreateTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceType, CreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagsRequest::getResourceId, CreateTagsRequest::setResourceId));
        builder.<UpdateFunctionTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionTagsRequestBody.class),
            f -> f.withMarshaller(CreateTagsRequest::getBody, CreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVersionAliasRequest, CreateVersionAliasResponse> createVersionAlias =
        genForCreateVersionAlias();

    private static HttpRequestDef<CreateVersionAliasRequest, CreateVersionAliasResponse> genForCreateVersionAlias() {
        // basic
        HttpRequestDef.Builder<CreateVersionAliasRequest, CreateVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVersionAliasRequest.class, CreateVersionAliasResponse.class)
                .withName("CreateVersionAlias")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVersionAliasRequest::getFunctionUrn,
                CreateVersionAliasRequest::setFunctionUrn));
        builder.<CreateVersionAliasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVersionAliasRequestBody.class),
            f -> f.withMarshaller(CreateVersionAliasRequest::getBody, CreateVersionAliasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcEndpointRequest, CreateVpcEndpointResponse> createVpcEndpoint =
        genForCreateVpcEndpoint();

    private static HttpRequestDef<CreateVpcEndpointRequest, CreateVpcEndpointResponse> genForCreateVpcEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateVpcEndpointRequest, CreateVpcEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcEndpointRequest.class, CreateVpcEndpointResponse.class)
                .withName("CreateVpcEndpoint")
                .withUri("/v2/{project_id}/fgs/vpc-endpoint")
                .withContentType("application/json");

        // requests
        builder.<CreateVpcEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcEndpointRequestBody.class),
            f -> f.withMarshaller(CreateVpcEndpointRequest::getBody, CreateVpcEndpointRequest::setBody));

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
                .withUri("/v2/{project_id}/fgs/workflows")
                .withContentType("application/json");

        // requests
        builder.<WorkflowCreateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowCreateBody.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, CreateWorkflowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse> deleteDependencyVersion =
        genForDeleteDependencyVersion();

    private static HttpRequestDef<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse> genForDeleteDependencyVersion() {
        // basic
        HttpRequestDef.Builder<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDependencyVersionRequest.class, DeleteDependencyVersionResponse.class)
            .withName("DeleteDependencyVersion")
            .withUri("/v2/{project_id}/fgs/dependencies/{depend_id}/version/{version}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("depend_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDependencyVersionRequest::getDependId,
                DeleteDependencyVersionRequest::setDependId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDependencyVersionRequest::getVersion,
                DeleteDependencyVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventRequest, DeleteEventResponse> deleteEvent = genForDeleteEvent();

    private static HttpRequestDef<DeleteEventRequest, DeleteEventResponse> genForDeleteEvent() {
        // basic
        HttpRequestDef.Builder<DeleteEventRequest, DeleteEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEventRequest.class, DeleteEventResponse.class)
                .withName("DeleteEvent")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventRequest::getFunctionUrn, DeleteEventRequest::setFunctionUrn));
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventRequest::getEventId, DeleteEventRequest::setEventId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunction =
        genForDeleteFunction();

    private static HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> genForDeleteFunction() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionRequest, DeleteFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFunctionRequest.class, DeleteFunctionResponse.class)
                .withName("DeleteFunction")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionRequest::getFunctionUrn, DeleteFunctionRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionAppRequest, DeleteFunctionAppResponse> deleteFunctionApp =
        genForDeleteFunctionApp();

    private static HttpRequestDef<DeleteFunctionAppRequest, DeleteFunctionAppResponse> genForDeleteFunctionApp() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionAppRequest, DeleteFunctionAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFunctionAppRequest.class, DeleteFunctionAppResponse.class)
                .withName("DeleteFunctionApp")
                .withUri("/v2/{project_id}/fgs/applications/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionAppRequest::getId, DeleteFunctionAppRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfig =
        genForDeleteFunctionAsyncInvokeConfig();

    private static HttpRequestDef<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> genForDeleteFunctionAsyncInvokeConfig() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteFunctionAsyncInvokeConfigRequest.class,
                    DeleteFunctionAsyncInvokeConfigResponse.class)
                .withName("DeleteFunctionAsyncInvokeConfig")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/async-invoke-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionAsyncInvokeConfigRequest::getFunctionUrn,
                DeleteFunctionAsyncInvokeConfigRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> deleteFunctionTrigger =
        genForDeleteFunctionTrigger();

    private static HttpRequestDef<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> genForDeleteFunctionTrigger() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteFunctionTriggerRequest.class, DeleteFunctionTriggerResponse.class)
            .withName("DeleteFunctionTrigger")
            .withUri("/v2/{project_id}/fgs/triggers/{function_urn}/{trigger_type_code}/{trigger_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionTriggerRequest::getFunctionUrn,
                DeleteFunctionTriggerRequest::setFunctionUrn));
        builder.<DeleteFunctionTriggerRequest.TriggerTypeCodeEnum>withRequestField("trigger_type_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFunctionTriggerRequest.TriggerTypeCodeEnum.class),
            f -> f.withMarshaller(DeleteFunctionTriggerRequest::getTriggerTypeCode,
                DeleteFunctionTriggerRequest::setTriggerTypeCode));
        builder.<String>withRequestField("trigger_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionTriggerRequest::getTriggerId,
                DeleteFunctionTriggerRequest::setTriggerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> deleteTags = genForDeleteTags();

    private static HttpRequestDef<DeleteTagsRequest, DeleteTagsResponse> genForDeleteTags() {
        // basic
        HttpRequestDef.Builder<DeleteTagsRequest, DeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagsRequest.class, DeleteTagsResponse.class)
                .withName("DeleteTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagsRequest::getResourceType, DeleteTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagsRequest::getResourceId, DeleteTagsRequest::setResourceId));
        builder.<UpdateFunctionTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionTagsRequestBody.class),
            f -> f.withMarshaller(DeleteTagsRequest::getBody, DeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVersionAliasRequest, DeleteVersionAliasResponse> deleteVersionAlias =
        genForDeleteVersionAlias();

    private static HttpRequestDef<DeleteVersionAliasRequest, DeleteVersionAliasResponse> genForDeleteVersionAlias() {
        // basic
        HttpRequestDef.Builder<DeleteVersionAliasRequest, DeleteVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVersionAliasRequest.class, DeleteVersionAliasResponse.class)
                .withName("DeleteVersionAlias")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases/{alias_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVersionAliasRequest::getFunctionUrn,
                DeleteVersionAliasRequest::setFunctionUrn));
        builder.<String>withRequestField("alias_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVersionAliasRequest::getAliasName, DeleteVersionAliasRequest::setAliasName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse> deleteVpcEndpoint =
        genForDeleteVpcEndpoint();

    private static HttpRequestDef<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse> genForDeleteVpcEndpoint() {
        // basic
        HttpRequestDef.Builder<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcEndpointRequest.class, DeleteVpcEndpointResponse.class)
                .withName("DeleteVpcEndpoint")
                .withUri("/v2/{project_id}/fgs/vpc-endpoint/{vpc_id}/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcEndpointRequest::getVpcId, DeleteVpcEndpointRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcEndpointRequest::getSubnetId, DeleteVpcEndpointRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableAsyncStatusLogRequest, EnableAsyncStatusLogResponse> enableAsyncStatusLog =
        genForEnableAsyncStatusLog();

    private static HttpRequestDef<EnableAsyncStatusLogRequest, EnableAsyncStatusLogResponse> genForEnableAsyncStatusLog() {
        // basic
        HttpRequestDef.Builder<EnableAsyncStatusLogRequest, EnableAsyncStatusLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableAsyncStatusLogRequest.class, EnableAsyncStatusLogResponse.class)
            .withName("EnableAsyncStatusLog")
            .withUri("/v2/{project_id}/fgs/functions/enable-async-status-logs")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogs =
        genForEnableLtsLogs();

    private static HttpRequestDef<EnableLtsLogsRequest, EnableLtsLogsResponse> genForEnableLtsLogs() {
        // basic
        HttpRequestDef.Builder<EnableLtsLogsRequest, EnableLtsLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableLtsLogsRequest.class, EnableLtsLogsResponse.class)
                .withName("EnableLtsLogs")
                .withUri("/v2/{project_id}/fgs/functions/enable-lts-logs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportFunctionRequest, ExportFunctionResponse> exportFunction =
        genForExportFunction();

    private static HttpRequestDef<ExportFunctionRequest, ExportFunctionResponse> genForExportFunction() {
        // basic
        HttpRequestDef.Builder<ExportFunctionRequest, ExportFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportFunctionRequest.class, ExportFunctionResponse.class)
                .withName("ExportFunction")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFunctionRequest::getFunctionUrn, ExportFunctionRequest::setFunctionUrn));
        builder.<Boolean>withRequestField("config",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportFunctionRequest::getConfig, ExportFunctionRequest::setConfig));
        builder.<Boolean>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportFunctionRequest::getCode, ExportFunctionRequest::setCode));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFunctionRequest::getType, ExportFunctionRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportFunctionRequest, ImportFunctionResponse> importFunction =
        genForImportFunction();

    private static HttpRequestDef<ImportFunctionRequest, ImportFunctionResponse> genForImportFunction() {
        // basic
        HttpRequestDef.Builder<ImportFunctionRequest, ImportFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportFunctionRequest.class, ImportFunctionResponse.class)
                .withName("ImportFunction")
                .withUri("/v2/{project_id}/fgs/functions/import")
                .withContentType("application/json");

        // requests
        builder.<ImportFunctionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportFunctionRequestBody.class),
            f -> f.withMarshaller(ImportFunctionRequest::getBody, ImportFunctionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InvokeFunctionRequest, InvokeFunctionResponse> invokeFunction =
        genForInvokeFunction();

    private static HttpRequestDef<InvokeFunctionRequest, InvokeFunctionResponse> genForInvokeFunction() {
        // basic
        HttpRequestDef.Builder<InvokeFunctionRequest, InvokeFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InvokeFunctionRequest.class, InvokeFunctionResponse.class)
                .withName("InvokeFunction")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/invocations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getFunctionUrn, InvokeFunctionRequest::setFunctionUrn));
        builder.<String>withRequestField("X-Cff-Log-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getXCffLogType, InvokeFunctionRequest::setXCffLogType));
        builder.<String>withRequestField("X-CFF-Request-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getXCFFRequestVersion,
                InvokeFunctionRequest::setXCFFRequestVersion));
        builder.<String>withRequestField("X-Cff-Instance-Memory",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getXCffInstanceMemory,
                InvokeFunctionRequest::setXCffInstanceMemory));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getBody, InvokeFunctionRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        builder.<String>withResponseField("X-Cff-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(InvokeFunctionResponse::getXCffRequestId, InvokeFunctionResponse::setXCffRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse> listActiveAsyncInvocations =
        genForListActiveAsyncInvocations();

    private static HttpRequestDef<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse> genForListActiveAsyncInvocations() {
        // basic
        HttpRequestDef.Builder<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListActiveAsyncInvocationsRequest.class,
                    ListActiveAsyncInvocationsResponse.class)
                .withName("ListActiveAsyncInvocations")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/active-async-invocations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveAsyncInvocationsRequest::getFunctionUrn,
                ListActiveAsyncInvocationsRequest::setFunctionUrn));
        builder.<String>withRequestField("requests",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveAsyncInvocationsRequest::getRequests,
                ListActiveAsyncInvocationsRequest::setRequests));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveAsyncInvocationsRequest::getMarker,
                ListActiveAsyncInvocationsRequest::setMarker));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveAsyncInvocationsRequest::getLimit,
                ListActiveAsyncInvocationsRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveAsyncInvocationsRequest::getStatus,
                ListActiveAsyncInvocationsRequest::setStatus));
        builder.<OffsetDateTime>withRequestField("query_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListActiveAsyncInvocationsRequest::getQueryBeginTime,
                ListActiveAsyncInvocationsRequest::setQueryBeginTime));
        builder.<OffsetDateTime>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListActiveAsyncInvocationsRequest::getQueryEndTime,
                ListActiveAsyncInvocationsRequest::setQueryEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppTemplatesRequest, ListAppTemplatesResponse> listAppTemplates =
        genForListAppTemplates();

    private static HttpRequestDef<ListAppTemplatesRequest, ListAppTemplatesResponse> genForListAppTemplates() {
        // basic
        HttpRequestDef.Builder<ListAppTemplatesRequest, ListAppTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppTemplatesRequest.class, ListAppTemplatesResponse.class)
                .withName("ListAppTemplates")
                .withUri("/v2/{project_id}/fgs/application/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppTemplatesRequest::getMarker, ListAppTemplatesRequest::setMarker));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppTemplatesRequest::getMaxitems, ListAppTemplatesRequest::setMaxitems));
        builder.<String>withRequestField("runtime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppTemplatesRequest::getRuntime, ListAppTemplatesRequest::setRuntime));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppTemplatesRequest::getCategory, ListAppTemplatesRequest::setCategory));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppTemplatesRequest::getXLanguage, ListAppTemplatesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse> listAsyncInvocations =
        genForListAsyncInvocations();

    private static HttpRequestDef<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse> genForListAsyncInvocations() {
        // basic
        HttpRequestDef.Builder<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAsyncInvocationsRequest.class, ListAsyncInvocationsResponse.class)
            .withName("ListAsyncInvocations")
            .withUri("/v2/{project_id}/fgs/functions/{function_urn}/async-invocations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncInvocationsRequest::getFunctionUrn,
                ListAsyncInvocationsRequest::setFunctionUrn));
        builder.<String>withRequestField("request_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncInvocationsRequest::getRequestId,
                ListAsyncInvocationsRequest::setRequestId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncInvocationsRequest::getMarker, ListAsyncInvocationsRequest::setMarker));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncInvocationsRequest::getLimit, ListAsyncInvocationsRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncInvocationsRequest::getStatus, ListAsyncInvocationsRequest::setStatus));
        builder.<OffsetDateTime>withRequestField("query_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListAsyncInvocationsRequest::getQueryBeginTime,
                ListAsyncInvocationsRequest::setQueryBeginTime));
        builder.<OffsetDateTime>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListAsyncInvocationsRequest::getQueryEndTime,
                ListAsyncInvocationsRequest::setQueryEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBridgeFunctionsRequest, ListBridgeFunctionsResponse> listBridgeFunctions =
        genForListBridgeFunctions();

    private static HttpRequestDef<ListBridgeFunctionsRequest, ListBridgeFunctionsResponse> genForListBridgeFunctions() {
        // basic
        HttpRequestDef.Builder<ListBridgeFunctionsRequest, ListBridgeFunctionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBridgeFunctionsRequest.class, ListBridgeFunctionsResponse.class)
                .withName("ListBridgeFunctions")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/servicebridge/relation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBridgeFunctionsRequest::getFunctionUrn,
                ListBridgeFunctionsRequest::setFunctionUrn));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBridgeFunctionsRequest::getType, ListBridgeFunctionsRequest::setType));

        // response
        builder.<List<ListFunctionResult>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBridgeFunctionsResponse::getBody, ListBridgeFunctionsResponse::setBody)
                .withInnerContainerType(ListFunctionResult.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListBridgeVersionsRequest, ListBridgeVersionsResponse> listBridgeVersions =
        genForListBridgeVersions();

    private static HttpRequestDef<ListBridgeVersionsRequest, ListBridgeVersionsResponse> genForListBridgeVersions() {
        // basic
        HttpRequestDef.Builder<ListBridgeVersionsRequest, ListBridgeVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBridgeVersionsRequest.class, ListBridgeVersionsResponse.class)
                .withName("ListBridgeVersions")
                .withUri("/v2/{project_id}/fgs/servicebridge/version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBridgeVersionsRequest::getType, ListBridgeVersionsRequest::setType));

        // response
        builder.<List<ServiceBridgeVersion>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBridgeVersionsResponse::getBody, ListBridgeVersionsResponse::setBody)
                .withInnerContainerType(ServiceBridgeVersion.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListDependenciesRequest, ListDependenciesResponse> listDependencies =
        genForListDependencies();

    private static HttpRequestDef<ListDependenciesRequest, ListDependenciesResponse> genForListDependencies() {
        // basic
        HttpRequestDef.Builder<ListDependenciesRequest, ListDependenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDependenciesRequest.class, ListDependenciesResponse.class)
                .withName("ListDependencies")
                .withUri("/v2/{project_id}/fgs/dependencies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getMarker, ListDependenciesRequest::setMarker));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getMaxitems, ListDependenciesRequest::setMaxitems));
        builder.<String>withRequestField("ispublic",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getIspublic, ListDependenciesRequest::setIspublic));
        builder.<String>withRequestField("dependency_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getDependencyType,
                ListDependenciesRequest::setDependencyType));
        builder.<String>withRequestField("runtime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getRuntime, ListDependenciesRequest::setRuntime));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getName, ListDependenciesRequest::setName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getLimit, ListDependenciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDependencyVersionRequest, ListDependencyVersionResponse> listDependencyVersion =
        genForListDependencyVersion();

    private static HttpRequestDef<ListDependencyVersionRequest, ListDependencyVersionResponse> genForListDependencyVersion() {
        // basic
        HttpRequestDef.Builder<ListDependencyVersionRequest, ListDependencyVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDependencyVersionRequest.class, ListDependencyVersionResponse.class)
            .withName("ListDependencyVersion")
            .withUri("/v2/{project_id}/fgs/dependencies/{depend_id}/version")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("depend_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependencyVersionRequest::getDependId,
                ListDependencyVersionRequest::setDependId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependencyVersionRequest::getMarker, ListDependencyVersionRequest::setMarker));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependencyVersionRequest::getMaxitems,
                ListDependencyVersionRequest::setMaxitems));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForListEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForListEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getFunctionUrn, ListEventsRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionApplicationsRequest, ListFunctionApplicationsResponse> listFunctionApplications =
        genForListFunctionApplications();

    private static HttpRequestDef<ListFunctionApplicationsRequest, ListFunctionApplicationsResponse> genForListFunctionApplications() {
        // basic
        HttpRequestDef.Builder<ListFunctionApplicationsRequest, ListFunctionApplicationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListFunctionApplicationsRequest.class, ListFunctionApplicationsResponse.class)
                .withName("ListFunctionApplications")
                .withUri("/v2/{project_id}/fgs/applications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionApplicationsRequest::getLimit,
                ListFunctionApplicationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionApplicationsRequest::getMarker,
                ListFunctionApplicationsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse> listFunctionAsMetric =
        genForListFunctionAsMetric();

    private static HttpRequestDef<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse> genForListFunctionAsMetric() {
        // basic
        HttpRequestDef.Builder<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFunctionAsMetricRequest.class, ListFunctionAsMetricResponse.class)
            .withName("ListFunctionAsMetric")
            .withUri("/v2/{project_id}/fgs/function/report")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsMetricRequest::getType, ListFunctionAsMetricRequest::setType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsMetricRequest::getStartTime,
                ListFunctionAsMetricRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsMetricRequest::getEndTime, ListFunctionAsMetricRequest::setEndTime));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsMetricRequest::getLimit, ListFunctionAsMetricRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> listFunctionAsyncInvokeConfig =
        genForListFunctionAsyncInvokeConfig();

    private static HttpRequestDef<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> genForListFunctionAsyncInvokeConfig() {
        // basic
        HttpRequestDef.Builder<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFunctionAsyncInvokeConfigRequest.class,
                    ListFunctionAsyncInvokeConfigResponse.class)
                .withName("ListFunctionAsyncInvokeConfig")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/async-invoke-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvokeConfigRequest::getFunctionUrn,
                ListFunctionAsyncInvokeConfigRequest::setFunctionUrn));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvokeConfigRequest::getMarker,
                ListFunctionAsyncInvokeConfigRequest::setMarker));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvokeConfigRequest::getLimit,
                ListFunctionAsyncInvokeConfigRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse> listFunctionReservedInstances =
        genForListFunctionReservedInstances();

    private static HttpRequestDef<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse> genForListFunctionReservedInstances() {
        // basic
        HttpRequestDef.Builder<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFunctionReservedInstancesRequest.class,
                    ListFunctionReservedInstancesResponse.class)
                .withName("ListFunctionReservedInstances")
                .withUri("/v2/{project_id}/fgs/functions/reservedinstances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionReservedInstancesRequest::getMarker,
                ListFunctionReservedInstancesRequest::setMarker));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionReservedInstancesRequest::getLimit,
                ListFunctionReservedInstancesRequest::setLimit));
        builder.<String>withRequestField("urn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionReservedInstancesRequest::getUrn,
                ListFunctionReservedInstancesRequest::setUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> listFunctionStatistics =
        genForListFunctionStatistics();

    private static HttpRequestDef<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> genForListFunctionStatistics() {
        // basic
        HttpRequestDef.Builder<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFunctionStatisticsRequest.class, ListFunctionStatisticsResponse.class)
            .withName("ListFunctionStatistics")
            .withUri("/v2/{project_id}/fgs/functions/{func_urn}/statistics/{period}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("func_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionStatisticsRequest::getFuncUrn,
                ListFunctionStatisticsRequest::setFuncUrn));
        builder.<String>withRequestField("period",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionStatisticsRequest::getPeriod, ListFunctionStatisticsRequest::setPeriod));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionTagsRequest, ListFunctionTagsResponse> listFunctionTags =
        genForListFunctionTags();

    private static HttpRequestDef<ListFunctionTagsRequest, ListFunctionTagsResponse> genForListFunctionTags() {
        // basic
        HttpRequestDef.Builder<ListFunctionTagsRequest, ListFunctionTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFunctionTagsRequest.class, ListFunctionTagsResponse.class)
                .withName("ListFunctionTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTagsRequest::getResourceType, ListFunctionTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTagsRequest::getResourceId, ListFunctionTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionTemplateRequest, ListFunctionTemplateResponse> listFunctionTemplate =
        genForListFunctionTemplate();

    private static HttpRequestDef<ListFunctionTemplateRequest, ListFunctionTemplateResponse> genForListFunctionTemplate() {
        // basic
        HttpRequestDef.Builder<ListFunctionTemplateRequest, ListFunctionTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFunctionTemplateRequest.class, ListFunctionTemplateResponse.class)
            .withName("ListFunctionTemplate")
            .withUri("/v2/{project_id}/fgs/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTemplateRequest::getMarker, ListFunctionTemplateRequest::setMarker));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTemplateRequest::getMaxitems, ListFunctionTemplateRequest::setMaxitems));
        builder.<String>withRequestField("ispublic",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTemplateRequest::getIspublic, ListFunctionTemplateRequest::setIspublic));
        builder.<String>withRequestField("runtime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTemplateRequest::getRuntime, ListFunctionTemplateRequest::setRuntime));
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTemplateRequest::getScene, ListFunctionTemplateRequest::setScene));
        builder.<String>withRequestField("service",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTemplateRequest::getService, ListFunctionTemplateRequest::setService));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionTriggersRequest, ListFunctionTriggersResponse> listFunctionTriggers =
        genForListFunctionTriggers();

    private static HttpRequestDef<ListFunctionTriggersRequest, ListFunctionTriggersResponse> genForListFunctionTriggers() {
        // basic
        HttpRequestDef.Builder<ListFunctionTriggersRequest, ListFunctionTriggersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFunctionTriggersRequest.class, ListFunctionTriggersResponse.class)
            .withName("ListFunctionTriggers")
            .withUri("/v2/{project_id}/fgs/triggers/{function_urn}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionTriggersRequest::getFunctionUrn,
                ListFunctionTriggersRequest::setFunctionUrn));

        // response
        builder.<List<ListFunctionTriggerResult>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFunctionTriggersResponse::getBody, ListFunctionTriggersResponse::setBody)
                .withInnerContainerType(ListFunctionTriggerResult.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionVersionsRequest, ListFunctionVersionsResponse> listFunctionVersions =
        genForListFunctionVersions();

    private static HttpRequestDef<ListFunctionVersionsRequest, ListFunctionVersionsResponse> genForListFunctionVersions() {
        // basic
        HttpRequestDef.Builder<ListFunctionVersionsRequest, ListFunctionVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFunctionVersionsRequest.class, ListFunctionVersionsResponse.class)
            .withName("ListFunctionVersions")
            .withUri("/v2/{project_id}/fgs/functions/{function_urn}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionVersionsRequest::getFunctionUrn,
                ListFunctionVersionsRequest::setFunctionUrn));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionVersionsRequest::getMarker, ListFunctionVersionsRequest::setMarker));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionVersionsRequest::getMaxitems, ListFunctionVersionsRequest::setMaxitems));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> listFunctions =
        genForListFunctions();

    private static HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> genForListFunctions() {
        // basic
        HttpRequestDef.Builder<ListFunctionsRequest, ListFunctionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFunctionsRequest.class, ListFunctionsResponse.class)
                .withName("ListFunctions")
                .withUri("/v2/{project_id}/fgs/functions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getMarker, ListFunctionsRequest::setMarker));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getMaxitems, ListFunctionsRequest::setMaxitems));
        builder.<String>withRequestField("package_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getPackageName, ListFunctionsRequest::setPackageName));
        builder.<String>withRequestField("func_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getFuncName, ListFunctionsRequest::setFuncName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v2/{project_id}/fgs/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse> listReservedInstanceConfigs =
        genForListReservedInstanceConfigs();

    private static HttpRequestDef<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse> genForListReservedInstanceConfigs() {
        // basic
        HttpRequestDef.Builder<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListReservedInstanceConfigsRequest.class,
                    ListReservedInstanceConfigsResponse.class)
                .withName("ListReservedInstanceConfigs")
                .withUri("/v2/{project_id}/fgs/functions/reservedinstanceconfigs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReservedInstanceConfigsRequest::getFunctionUrn,
                ListReservedInstanceConfigsRequest::setFunctionUrn));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReservedInstanceConfigsRequest::getMarker,
                ListReservedInstanceConfigsRequest::setMarker));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReservedInstanceConfigsRequest::getLimit,
                ListReservedInstanceConfigsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics =
        genForListStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForListStatistics() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRequest, ListStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRequest.class, ListStatisticsResponse.class)
                .withName("ListStatistics")
                .withUri("/v2/{project_id}/fgs/functions/statistics")
                .withContentType("application/json");

        // requests
        builder.<ListStatisticsRequest.FilterEnum>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListStatisticsRequest.FilterEnum.class),
            f -> f.withMarshaller(ListStatisticsRequest::getFilter, ListStatisticsRequest::setFilter));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getPeriod, ListStatisticsRequest::setPeriod));
        builder.<String>withRequestField("option",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getOption, ListStatisticsRequest::setOption));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getLimit, ListStatisticsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getMarker, ListStatisticsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionAliasesRequest, ListVersionAliasesResponse> listVersionAliases =
        genForListVersionAliases();

    private static HttpRequestDef<ListVersionAliasesRequest, ListVersionAliasesResponse> genForListVersionAliases() {
        // basic
        HttpRequestDef.Builder<ListVersionAliasesRequest, ListVersionAliasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionAliasesRequest.class, ListVersionAliasesResponse.class)
                .withName("ListVersionAliases")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVersionAliasesRequest::getFunctionUrn,
                ListVersionAliasesRequest::setFunctionUrn));

        // response
        builder.<List<ListVersionAliasResult>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVersionAliasesResponse::getBody, ListVersionAliasesResponse::setBody)
                .withInnerContainerType(ListVersionAliasResult.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> listWorkflow = genForListWorkflow();

    private static HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> genForListWorkflow() {
        // basic
        HttpRequestDef.Builder<ListWorkflowRequest, ListWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowRequest.class, ListWorkflowResponse.class)
                .withName("ListWorkflow")
                .withUri("/v2/{project_id}/fgs/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getWorkflowName, ListWorkflowRequest::setWorkflowName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowRequest::getLimit, ListWorkflowRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowRequest::getOffset, ListWorkflowRequest::setOffset));
        builder.<String>withRequestField("enterprise_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getEnterpriseProject,
                ListWorkflowRequest::setEnterpriseProject));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getMode, ListWorkflowRequest::setMode));

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
            .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/executions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getWorkflowId,
                ListWorkflowExecutionsRequest::setWorkflowId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getLimit, ListWorkflowExecutionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getOffset, ListWorkflowExecutionsRequest::setOffset));
        builder.<ListWorkflowExecutionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowExecutionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getStatus, ListWorkflowExecutionsRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getStartTime,
                ListWorkflowExecutionsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getEndTime,
                ListWorkflowExecutionsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryWorkFlowRequest, RetryWorkFlowResponse> retryWorkFlow =
        genForRetryWorkFlow();

    private static HttpRequestDef<RetryWorkFlowRequest, RetryWorkFlowResponse> genForRetryWorkFlow() {
        // basic
        HttpRequestDef.Builder<RetryWorkFlowRequest, RetryWorkFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryWorkFlowRequest.class, RetryWorkFlowResponse.class)
                .withName("RetryWorkFlow")
                .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/executions/{execution_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryWorkFlowRequest::getWorkflowId, RetryWorkFlowRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryWorkFlowRequest::getExecutionId, RetryWorkFlowRequest::setExecutionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppTemplateRequest, ShowAppTemplateResponse> showAppTemplate =
        genForShowAppTemplate();

    private static HttpRequestDef<ShowAppTemplateRequest, ShowAppTemplateResponse> genForShowAppTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAppTemplateRequest, ShowAppTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppTemplateRequest.class, ShowAppTemplateResponse.class)
                .withName("ShowAppTemplate")
                .withUri("/v2/{project_id}/fgs/application/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppTemplateRequest::getId, ShowAppTemplateRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDependencyVersionRequest, ShowDependencyVersionResponse> showDependencyVersion =
        genForShowDependencyVersion();

    private static HttpRequestDef<ShowDependencyVersionRequest, ShowDependencyVersionResponse> genForShowDependencyVersion() {
        // basic
        HttpRequestDef.Builder<ShowDependencyVersionRequest, ShowDependencyVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDependencyVersionRequest.class, ShowDependencyVersionResponse.class)
            .withName("ShowDependencyVersion")
            .withUri("/v2/{project_id}/fgs/dependencies/{depend_id}/version/{version}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("depend_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDependencyVersionRequest::getDependId,
                ShowDependencyVersionRequest::setDependId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDependencyVersionRequest::getVersion, ShowDependencyVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventRequest, ShowEventResponse> showEvent = genForShowEvent();

    private static HttpRequestDef<ShowEventRequest, ShowEventResponse> genForShowEvent() {
        // basic
        HttpRequestDef.Builder<ShowEventRequest, ShowEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventRequest.class, ShowEventResponse.class)
                .withName("ShowEvent")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getFunctionUrn, ShowEventRequest::setFunctionUrn));
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEventId, ShowEventRequest::setEventId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFuncReservedInstanceMetricsRequest, ShowFuncReservedInstanceMetricsResponse> showFuncReservedInstanceMetrics =
        genForShowFuncReservedInstanceMetrics();

    private static HttpRequestDef<ShowFuncReservedInstanceMetricsRequest, ShowFuncReservedInstanceMetricsResponse> genForShowFuncReservedInstanceMetrics() {
        // basic
        HttpRequestDef.Builder<ShowFuncReservedInstanceMetricsRequest, ShowFuncReservedInstanceMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowFuncReservedInstanceMetricsRequest.class,
                    ShowFuncReservedInstanceMetricsResponse.class)
                .withName("ShowFuncReservedInstanceMetrics")
                .withUri("/v2/{project_id}/fgs/functions/{func_urn}/instancereports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("func_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFuncReservedInstanceMetricsRequest::getFuncUrn,
                ShowFuncReservedInstanceMetricsRequest::setFuncUrn));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFuncReservedInstanceMetricsRequest::getMarker,
                ShowFuncReservedInstanceMetricsRequest::setMarker));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFuncReservedInstanceMetricsRequest::getLimit,
                ShowFuncReservedInstanceMetricsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse> showFuncSnapshotState =
        genForShowFuncSnapshotState();

    private static HttpRequestDef<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse> genForShowFuncSnapshotState() {
        // basic
        HttpRequestDef.Builder<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFuncSnapshotStateRequest.class, ShowFuncSnapshotStateResponse.class)
            .withName("ShowFuncSnapshotState")
            .withUri("/v2/{project_id}/fgs/functions/{function_urn}/snapshots/{action}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFuncSnapshotStateRequest::getFunctionUrn,
                ShowFuncSnapshotStateRequest::setFunctionUrn));
        builder.<ShowFuncSnapshotStateRequest.ActionEnum>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowFuncSnapshotStateRequest.ActionEnum.class),
            f -> f.withMarshaller(ShowFuncSnapshotStateRequest::getAction, ShowFuncSnapshotStateRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionAppRequest, ShowFunctionAppResponse> showFunctionApp =
        genForShowFunctionApp();

    private static HttpRequestDef<ShowFunctionAppRequest, ShowFunctionAppResponse> genForShowFunctionApp() {
        // basic
        HttpRequestDef.Builder<ShowFunctionAppRequest, ShowFunctionAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionAppRequest.class, ShowFunctionAppResponse.class)
                .withName("ShowFunctionApp")
                .withUri("/v2/{project_id}/fgs/applications/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionAppRequest::getId, ShowFunctionAppRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfig =
        genForShowFunctionAsyncInvokeConfig();

    private static HttpRequestDef<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> genForShowFunctionAsyncInvokeConfig() {
        // basic
        HttpRequestDef.Builder<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowFunctionAsyncInvokeConfigRequest.class,
                    ShowFunctionAsyncInvokeConfigResponse.class)
                .withName("ShowFunctionAsyncInvokeConfig")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/async-invoke-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionAsyncInvokeConfigRequest::getFunctionUrn,
                ShowFunctionAsyncInvokeConfigRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionCodeRequest, ShowFunctionCodeResponse> showFunctionCode =
        genForShowFunctionCode();

    private static HttpRequestDef<ShowFunctionCodeRequest, ShowFunctionCodeResponse> genForShowFunctionCode() {
        // basic
        HttpRequestDef.Builder<ShowFunctionCodeRequest, ShowFunctionCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionCodeRequest.class, ShowFunctionCodeResponse.class)
                .withName("ShowFunctionCode")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionCodeRequest::getFunctionUrn, ShowFunctionCodeRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionConfigRequest, ShowFunctionConfigResponse> showFunctionConfig =
        genForShowFunctionConfig();

    private static HttpRequestDef<ShowFunctionConfigRequest, ShowFunctionConfigResponse> genForShowFunctionConfig() {
        // basic
        HttpRequestDef.Builder<ShowFunctionConfigRequest, ShowFunctionConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionConfigRequest.class, ShowFunctionConfigResponse.class)
                .withName("ShowFunctionConfig")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionConfigRequest::getFunctionUrn,
                ShowFunctionConfigRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionMetricsRequest, ShowFunctionMetricsResponse> showFunctionMetrics =
        genForShowFunctionMetrics();

    private static HttpRequestDef<ShowFunctionMetricsRequest, ShowFunctionMetricsResponse> genForShowFunctionMetrics() {
        // basic
        HttpRequestDef.Builder<ShowFunctionMetricsRequest, ShowFunctionMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionMetricsRequest.class, ShowFunctionMetricsResponse.class)
                .withName("ShowFunctionMetrics")
                .withUri("/v2/{project_id}/fgs/functions/{func_urn}/slareports/{period}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("func_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionMetricsRequest::getFuncUrn, ShowFunctionMetricsRequest::setFuncUrn));
        builder.<String>withRequestField("period",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionMetricsRequest::getPeriod, ShowFunctionMetricsRequest::setPeriod));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionTemplateRequest, ShowFunctionTemplateResponse> showFunctionTemplate =
        genForShowFunctionTemplate();

    private static HttpRequestDef<ShowFunctionTemplateRequest, ShowFunctionTemplateResponse> genForShowFunctionTemplate() {
        // basic
        HttpRequestDef.Builder<ShowFunctionTemplateRequest, ShowFunctionTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFunctionTemplateRequest.class, ShowFunctionTemplateResponse.class)
            .withName("ShowFunctionTemplate")
            .withUri("/v2/{project_id}/fgs/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionTemplateRequest::getTemplateId,
                ShowFunctionTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> showFunctionTrigger =
        genForShowFunctionTrigger();

    private static HttpRequestDef<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> genForShowFunctionTrigger() {
        // basic
        HttpRequestDef.Builder<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionTriggerRequest.class, ShowFunctionTriggerResponse.class)
                .withName("ShowFunctionTrigger")
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}/{trigger_type_code}/{trigger_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionTriggerRequest::getFunctionUrn,
                ShowFunctionTriggerRequest::setFunctionUrn));
        builder.<ShowFunctionTriggerRequest.TriggerTypeCodeEnum>withRequestField("trigger_type_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowFunctionTriggerRequest.TriggerTypeCodeEnum.class),
            f -> f.withMarshaller(ShowFunctionTriggerRequest::getTriggerTypeCode,
                ShowFunctionTriggerRequest::setTriggerTypeCode));
        builder.<String>withRequestField("trigger_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionTriggerRequest::getTriggerId, ShowFunctionTriggerRequest::setTriggerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> showLtsLogDetails =
        genForShowLtsLogDetails();

    private static HttpRequestDef<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> genForShowLtsLogDetails() {
        // basic
        HttpRequestDef.Builder<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLtsLogDetailsRequest.class, ShowLtsLogDetailsResponse.class)
                .withName("ShowLtsLogDetails")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/lts-log-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsLogDetailsRequest::getFunctionUrn, ShowLtsLogDetailsRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectAsyncStatusLogInfoRequest, ShowProjectAsyncStatusLogInfoResponse> showProjectAsyncStatusLogInfo =
        genForShowProjectAsyncStatusLogInfo();

    private static HttpRequestDef<ShowProjectAsyncStatusLogInfoRequest, ShowProjectAsyncStatusLogInfoResponse> genForShowProjectAsyncStatusLogInfo() {
        // basic
        HttpRequestDef.Builder<ShowProjectAsyncStatusLogInfoRequest, ShowProjectAsyncStatusLogInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProjectAsyncStatusLogInfoRequest.class,
                    ShowProjectAsyncStatusLogInfoResponse.class)
                .withName("ShowProjectAsyncStatusLogInfo")
                .withUri("/v2/{project_id}/fgs/functions/async-status-log-detail")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTagsListRequest, ShowProjectTagsListResponse> showProjectTagsList =
        genForShowProjectTagsList();

    private static HttpRequestDef<ShowProjectTagsListRequest, ShowProjectTagsListResponse> genForShowProjectTagsList() {
        // basic
        HttpRequestDef.Builder<ShowProjectTagsListRequest, ShowProjectTagsListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectTagsListRequest.class, ShowProjectTagsListResponse.class)
                .withName("ShowProjectTagsList")
                .withUri("/v2/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTagsListRequest::getResourceType,
                ShowProjectTagsListRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse> showResInstanceInfo =
        genForShowResInstanceInfo();

    private static HttpRequestDef<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse> genForShowResInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowResInstanceInfoRequest.class, ShowResInstanceInfoResponse.class)
                .withName("ShowResInstanceInfo")
                .withUri("/v2/{project_id}/{resource_type}/resource-instances/{action}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResInstanceInfoRequest::getResourceType,
                ShowResInstanceInfoRequest::setResourceType));
        builder.<String>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResInstanceInfoRequest::getAction, ShowResInstanceInfoRequest::setAction));
        builder.<ListEnterpriseResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListEnterpriseResourceRequestBody.class),
            f -> f.withMarshaller(ShowResInstanceInfoRequest::getBody, ShowResInstanceInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTenantMetricRequest, ShowTenantMetricResponse> showTenantMetric =
        genForShowTenantMetric();

    private static HttpRequestDef<ShowTenantMetricRequest, ShowTenantMetricResponse> genForShowTenantMetric() {
        // basic
        HttpRequestDef.Builder<ShowTenantMetricRequest, ShowTenantMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTenantMetricRequest.class, ShowTenantMetricResponse.class)
                .withName("ShowTenantMetric")
                .withUri("/v2/{project_id}/fgs/workflow-statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTenantMetricRequest::getPeriod, ShowTenantMetricRequest::setPeriod));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTenantMetricRequest::getStartTime, ShowTenantMetricRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTenantMetricRequest::getEndTime, ShowTenantMetricRequest::setEndTime));
        builder.<String>withRequestField("metric_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTenantMetricRequest::getMetricType, ShowTenantMetricRequest::setMetricType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTracingRequest, ShowTracingResponse> showTracing = genForShowTracing();

    private static HttpRequestDef<ShowTracingRequest, ShowTracingResponse> genForShowTracing() {
        // basic
        HttpRequestDef.Builder<ShowTracingRequest, ShowTracingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTracingRequest.class, ShowTracingResponse.class)
                .withName("ShowTracing")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/tracing")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTracingRequest::getFunctionUrn, ShowTracingRequest::setFunctionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionAliasRequest, ShowVersionAliasResponse> showVersionAlias =
        genForShowVersionAlias();

    private static HttpRequestDef<ShowVersionAliasRequest, ShowVersionAliasResponse> genForShowVersionAlias() {
        // basic
        HttpRequestDef.Builder<ShowVersionAliasRequest, ShowVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionAliasRequest.class, ShowVersionAliasResponse.class)
                .withName("ShowVersionAlias")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases/{alias_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionAliasRequest::getFunctionUrn, ShowVersionAliasRequest::setFunctionUrn));
        builder.<String>withRequestField("alias_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionAliasRequest::getAliasName, ShowVersionAliasRequest::setAliasName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkFlowRequest, ShowWorkFlowResponse> showWorkFlow = genForShowWorkFlow();

    private static HttpRequestDef<ShowWorkFlowRequest, ShowWorkFlowResponse> genForShowWorkFlow() {
        // basic
        HttpRequestDef.Builder<ShowWorkFlowRequest, ShowWorkFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkFlowRequest.class, ShowWorkFlowResponse.class)
                .withName("ShowWorkFlow")
                .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowRequest::getWorkflowId, ShowWorkFlowRequest::setWorkflowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> showWorkFlowMetric =
        genForShowWorkFlowMetric();

    private static HttpRequestDef<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> genForShowWorkFlowMetric() {
        // basic
        HttpRequestDef.Builder<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkFlowMetricRequest.class, ShowWorkFlowMetricResponse.class)
                .withName("ShowWorkFlowMetric")
                .withUri("/v2/{project_id}/fgs/workflow-statistic/{workflow_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getWorkflowUrn,
                ShowWorkFlowMetricRequest::setWorkflowUrn));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getPeriod, ShowWorkFlowMetricRequest::setPeriod));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getStartTime, ShowWorkFlowMetricRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getEndTime, ShowWorkFlowMetricRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecution =
        genForShowWorkflowExecution();

    private static HttpRequestDef<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> genForShowWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWorkflowExecutionRequest.class, ShowWorkflowExecutionResponse.class)
            .withName("ShowWorkflowExecution")
            .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/executions/{execution_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionRequest::getWorkflowId,
                ShowWorkflowExecutionRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionRequest::getExecutionId,
                ShowWorkflowExecutionRequest::setExecutionId));
        builder.<Boolean>withRequestField("X-Get-Workflow-Full-History-Data",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowWorkflowExecutionRequest::getXGetWorkflowFullHistoryData,
                ShowWorkflowExecutionRequest::setXGetWorkflowFullHistoryData));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse> showWorkflowExecutionForPage =
        genForShowWorkflowExecutionForPage();

    private static HttpRequestDef<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse> genForShowWorkflowExecutionForPage() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowWorkflowExecutionForPageRequest.class,
                    ShowWorkflowExecutionForPageResponse.class)
                .withName("ShowWorkflowExecutionForPage")
                .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/executions-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionForPageRequest::getWorkflowId,
                ShowWorkflowExecutionForPageRequest::setWorkflowId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWorkflowExecutionForPageRequest::getOffset,
                ShowWorkflowExecutionForPageRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWorkflowExecutionForPageRequest::getLimit,
                ShowWorkflowExecutionForPageRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionForPageRequest::getStartTime,
                ShowWorkflowExecutionForPageRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionForPageRequest::getEndTime,
                ShowWorkflowExecutionForPageRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> startSyncWorkflowExecution =
        genForStartSyncWorkflowExecution();

    private static HttpRequestDef<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> genForStartSyncWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartSyncWorkflowExecutionRequest.class,
                    StartSyncWorkflowExecutionResponse.class)
                .withName("StartSyncWorkflowExecution")
                .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/sync-executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSyncWorkflowExecutionRequest::getWorkflowId,
                StartSyncWorkflowExecutionRequest::setWorkflowId));
        builder.<FlowExecuteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FlowExecuteBody.class),
            f -> f.withMarshaller(StartSyncWorkflowExecutionRequest::getBody,
                StartSyncWorkflowExecutionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> startWorkflowExecution =
        genForStartWorkflowExecution();

    private static HttpRequestDef<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> genForStartWorkflowExecution() {
        // basic
        HttpRequestDef.Builder<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartWorkflowExecutionRequest.class, StartWorkflowExecutionResponse.class)
            .withName("StartWorkflowExecution")
            .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/executions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getWorkflowId,
                StartWorkflowExecutionRequest::setWorkflowId));
        builder.<String>withRequestField("X-Create-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getXCreateTime,
                StartWorkflowExecutionRequest::setXCreateTime));
        builder.<String>withRequestField("X-WorkflowRun-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getXWorkflowRunID,
                StartWorkflowExecutionRequest::setXWorkflowRunID));
        builder.<String>withRequestField("X-WorkflowRun-MergeFnParameters",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getXWorkflowRunMergeFnParameters,
                StartWorkflowExecutionRequest::setXWorkflowRunMergeFnParameters));
        builder.<FlowExecuteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FlowExecuteBody.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getBody, StartWorkflowExecutionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopWorkFlowRequest, StopWorkFlowResponse> stopWorkFlow = genForStopWorkFlow();

    private static HttpRequestDef<StopWorkFlowRequest, StopWorkFlowResponse> genForStopWorkFlow() {
        // basic
        HttpRequestDef.Builder<StopWorkFlowRequest, StopWorkFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopWorkFlowRequest.class, StopWorkFlowResponse.class)
                .withName("StopWorkFlow")
                .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}/executions/{execution_id}/terminate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopWorkFlowRequest::getWorkflowId, StopWorkFlowRequest::setWorkflowId));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopWorkFlowRequest::getExecutionId, StopWorkFlowRequest::setExecutionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventRequest, UpdateEventResponse> updateEvent = genForUpdateEvent();

    private static HttpRequestDef<UpdateEventRequest, UpdateEventResponse> genForUpdateEvent() {
        // basic
        HttpRequestDef.Builder<UpdateEventRequest, UpdateEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEventRequest.class, UpdateEventResponse.class)
                .withName("UpdateEvent")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventRequest::getFunctionUrn, UpdateEventRequest::setFunctionUrn));
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventRequest::getEventId, UpdateEventRequest::setEventId));
        builder.<UpdateEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEventRequestBody.class),
            f -> f.withMarshaller(UpdateEventRequest::getBody, UpdateEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse> updateFuncSnapshot =
        genForUpdateFuncSnapshot();

    private static HttpRequestDef<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse> genForUpdateFuncSnapshot() {
        // basic
        HttpRequestDef.Builder<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFuncSnapshotRequest.class, UpdateFuncSnapshotResponse.class)
                .withName("UpdateFuncSnapshot")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/snapshots/{action}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFuncSnapshotRequest::getFunctionUrn,
                UpdateFuncSnapshotRequest::setFunctionUrn));
        builder.<UpdateFuncSnapshotRequest.ActionEnum>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFuncSnapshotRequest.ActionEnum.class),
            f -> f.withMarshaller(UpdateFuncSnapshotRequest::getAction, UpdateFuncSnapshotRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfig =
        genForUpdateFunctionAsyncInvokeConfig();

    private static HttpRequestDef<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> genForUpdateFunctionAsyncInvokeConfig() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFunctionAsyncInvokeConfigRequest.class,
                    UpdateFunctionAsyncInvokeConfigResponse.class)
                .withName("UpdateFunctionAsyncInvokeConfig")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/async-invoke-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionAsyncInvokeConfigRequest::getFunctionUrn,
                UpdateFunctionAsyncInvokeConfigRequest::setFunctionUrn));
        builder.<UpdateFunctionAsyncInvokeConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionAsyncInvokeConfigRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionAsyncInvokeConfigRequest::getBody,
                UpdateFunctionAsyncInvokeConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> updateFunctionCode =
        genForUpdateFunctionCode();

    private static HttpRequestDef<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> genForUpdateFunctionCode() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFunctionCodeRequest.class, UpdateFunctionCodeResponse.class)
                .withName("UpdateFunctionCode")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionCodeRequest::getFunctionUrn,
                UpdateFunctionCodeRequest::setFunctionUrn));
        builder.<UpdateFunctionCodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionCodeRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionCodeRequest::getBody, UpdateFunctionCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionCollectStateRequest, UpdateFunctionCollectStateResponse> updateFunctionCollectState =
        genForUpdateFunctionCollectState();

    private static HttpRequestDef<UpdateFunctionCollectStateRequest, UpdateFunctionCollectStateResponse> genForUpdateFunctionCollectState() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionCollectStateRequest, UpdateFunctionCollectStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFunctionCollectStateRequest.class,
                    UpdateFunctionCollectStateResponse.class)
                .withName("UpdateFunctionCollectState")
                .withUri("/v2/{project_id}/fgs/functions/{func_urn}/collect/{state}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("func_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionCollectStateRequest::getFuncUrn,
                UpdateFunctionCollectStateRequest::setFuncUrn));
        builder.<String>withRequestField("state",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionCollectStateRequest::getState,
                UpdateFunctionCollectStateRequest::setState));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> updateFunctionConfig =
        genForUpdateFunctionConfig();

    private static HttpRequestDef<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> genForUpdateFunctionConfig() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateFunctionConfigRequest.class, UpdateFunctionConfigResponse.class)
            .withName("UpdateFunctionConfig")
            .withUri("/v2/{project_id}/fgs/functions/{function_urn}/config")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionConfigRequest::getFunctionUrn,
                UpdateFunctionConfigRequest::setFunctionUrn));
        builder.<UpdateFunctionConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionConfigRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionConfigRequest::getBody, UpdateFunctionConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> updateFunctionMaxInstanceConfig =
        genForUpdateFunctionMaxInstanceConfig();

    private static HttpRequestDef<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> genForUpdateFunctionMaxInstanceConfig() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFunctionMaxInstanceConfigRequest.class,
                    UpdateFunctionMaxInstanceConfigResponse.class)
                .withName("UpdateFunctionMaxInstanceConfig")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/config-max-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionMaxInstanceConfigRequest::getFunctionUrn,
                UpdateFunctionMaxInstanceConfigRequest::setFunctionUrn));
        builder.<UpdateFunctionMaxInstanceConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionMaxInstanceConfigRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionMaxInstanceConfigRequest::getBody,
                UpdateFunctionMaxInstanceConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse> updateFunctionReservedInstancesCount =
        genForUpdateFunctionReservedInstancesCount();

    private static HttpRequestDef<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse> genForUpdateFunctionReservedInstancesCount() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFunctionReservedInstancesCountRequest.class,
                    UpdateFunctionReservedInstancesCountResponse.class)
                .withName("UpdateFunctionReservedInstancesCount")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/reservedinstances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionReservedInstancesCountRequest::getFunctionUrn,
                UpdateFunctionReservedInstancesCountRequest::setFunctionUrn));
        builder.<UpdateFunctionReservedInstancesCountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionReservedInstancesCountRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionReservedInstancesCountRequest::getBody,
                UpdateFunctionReservedInstancesCountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTracingRequest, UpdateTracingResponse> updateTracing =
        genForUpdateTracing();

    private static HttpRequestDef<UpdateTracingRequest, UpdateTracingResponse> genForUpdateTracing() {
        // basic
        HttpRequestDef.Builder<UpdateTracingRequest, UpdateTracingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTracingRequest.class, UpdateTracingResponse.class)
                .withName("UpdateTracing")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/tracing")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTracingRequest::getFunctionUrn, UpdateTracingRequest::setFunctionUrn));
        builder.<UpdateTracingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTracingRequestBody.class),
            f -> f.withMarshaller(UpdateTracingRequest::getBody, UpdateTracingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> updateTrigger =
        genForUpdateTrigger();

    private static HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> genForUpdateTrigger() {
        // basic
        HttpRequestDef.Builder<UpdateTriggerRequest, UpdateTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTriggerRequest.class, UpdateTriggerResponse.class)
                .withName("UpdateTrigger")
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}/{trigger_type_code}/{trigger_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getFunctionUrn, UpdateTriggerRequest::setFunctionUrn));
        builder.<UpdateTriggerRequest.TriggerTypeCodeEnum>withRequestField("trigger_type_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTriggerRequest.TriggerTypeCodeEnum.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getTriggerTypeCode, UpdateTriggerRequest::setTriggerTypeCode));
        builder.<String>withRequestField("trigger_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getTriggerId, UpdateTriggerRequest::setTriggerId));
        builder.<UpdateTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTriggerRequestBody.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getBody, UpdateTriggerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVersionAliasRequest, UpdateVersionAliasResponse> updateVersionAlias =
        genForUpdateVersionAlias();

    private static HttpRequestDef<UpdateVersionAliasRequest, UpdateVersionAliasResponse> genForUpdateVersionAlias() {
        // basic
        HttpRequestDef.Builder<UpdateVersionAliasRequest, UpdateVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVersionAliasRequest.class, UpdateVersionAliasResponse.class)
                .withName("UpdateVersionAlias")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases/{alias_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVersionAliasRequest::getFunctionUrn,
                UpdateVersionAliasRequest::setFunctionUrn));
        builder.<String>withRequestField("alias_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVersionAliasRequest::getAliasName, UpdateVersionAliasRequest::setAliasName));
        builder.<UpdateVersionAliasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVersionAliasRequestBody.class),
            f -> f.withMarshaller(UpdateVersionAliasRequest::getBody, UpdateVersionAliasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkFlowRequest, UpdateWorkFlowResponse> updateWorkFlow =
        genForUpdateWorkFlow();

    private static HttpRequestDef<UpdateWorkFlowRequest, UpdateWorkFlowResponse> genForUpdateWorkFlow() {
        // basic
        HttpRequestDef.Builder<UpdateWorkFlowRequest, UpdateWorkFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkFlowRequest.class, UpdateWorkFlowResponse.class)
                .withName("UpdateWorkFlow")
                .withUri("/v2/{project_id}/fgs/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkFlowRequest::getWorkflowId, UpdateWorkFlowRequest::setWorkflowId));
        builder.<WorkflowCreateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowCreateBody.class),
            f -> f.withMarshaller(UpdateWorkFlowRequest::getBody, UpdateWorkFlowRequest::setBody));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.functiongraph.v2.model.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class FunctionGraphMeta {

    public static final HttpRequestDef<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> asyncInvokeFunction =
        genForasyncInvokeFunction();

    private static HttpRequestDef<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> genForasyncInvokeFunction() {
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
            f -> f.withMarshaller(AsyncInvokeFunctionRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AsyncInvokeFunctionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse> asyncInvokeReservedFunction =
        genForasyncInvokeReservedFunction();

    private static HttpRequestDef<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse> genForasyncInvokeReservedFunction() {
        // basic
        HttpRequestDef.Builder<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AsyncInvokeReservedFunctionRequest.class,
                    AsyncInvokeReservedFunctionResponse.class)
                .withName("AsyncInvokeReservedFunction")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/reserved-invocations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AsyncInvokeReservedFunctionRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AsyncInvokeReservedFunctionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggers =
        genForbatchDeleteFunctionTriggers();

    private static HttpRequestDef<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> genForbatchDeleteFunctionTriggers() {
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
            f -> f.withMarshaller(BatchDeleteFunctionTriggersRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> batchDeleteWorkflows =
        genForbatchDeleteWorkflows();

    private static HttpRequestDef<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> genForbatchDeleteWorkflows() {
        // basic
        HttpRequestDef.Builder<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteWorkflowsRequest.class, BatchDeleteWorkflowsResponse.class)
            .withName("BatchDeleteWorkflows")
            .withUri("/v2/{project_id}/fgs/workflows")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteWorkflowsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteWorkflowsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteWorkflowsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> cancelAsyncInvocation =
        genForcancelAsyncInvocation();

    private static HttpRequestDef<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> genForcancelAsyncInvocation() {
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
            f -> f.withMarshaller(CancelAsyncInvocationRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<CancelAsyncInvocationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelAsyncInvocationRequestBody.class),
            f -> f.withMarshaller(CancelAsyncInvocationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDependencyRequest, CreateDependencyResponse> createDependency =
        genForcreateDependency();

    private static HttpRequestDef<CreateDependencyRequest, CreateDependencyResponse> genForcreateDependency() {
        // basic
        HttpRequestDef.Builder<CreateDependencyRequest, CreateDependencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDependencyRequest.class, CreateDependencyResponse.class)
                .withName("CreateDependency")
                .withUri("/v2/{project_id}/fgs/dependencies")
                .withContentType("application/json");

        // requests
        builder.<CreateDependencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDependencyRequestBody.class),
            f -> f.withMarshaller(CreateDependencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventRequest, CreateEventResponse> createEvent = genForcreateEvent();

    private static HttpRequestDef<CreateEventRequest, CreateEventResponse> genForcreateEvent() {
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
            f -> f.withMarshaller(CreateEventRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<CreateEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEventRequestBody.class),
            f -> f.withMarshaller(CreateEventRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> createFunction =
        genForcreateFunction();

    private static HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> genForcreateFunction() {
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
            f -> f.withMarshaller(CreateFunctionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> createFunctionTrigger =
        genForcreateFunctionTrigger();

    private static HttpRequestDef<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> genForcreateFunctionTrigger() {
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
            f -> f.withMarshaller(CreateFunctionTriggerRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<CreateFunctionTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFunctionTriggerRequestBody.class),
            f -> f.withMarshaller(CreateFunctionTriggerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFunctionVersionRequest, CreateFunctionVersionResponse> createFunctionVersion =
        genForcreateFunctionVersion();

    private static HttpRequestDef<CreateFunctionVersionRequest, CreateFunctionVersionResponse> genForcreateFunctionVersion() {
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
            f -> f.withMarshaller(CreateFunctionVersionRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<CreateFunctionVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFunctionVersionRequestBody.class),
            f -> f.withMarshaller(CreateFunctionVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVersionAliasRequest, CreateVersionAliasResponse> createVersionAlias =
        genForcreateVersionAlias();

    private static HttpRequestDef<CreateVersionAliasRequest, CreateVersionAliasResponse> genForcreateVersionAlias() {
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
            f -> f.withMarshaller(CreateVersionAliasRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<CreateVersionAliasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVersionAliasRequestBody.class),
            f -> f.withMarshaller(CreateVersionAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflow =
        genForcreateWorkflow();

    private static HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> genForcreateWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowRequest, CreateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkflowRequest.class, CreateWorkflowResponse.class)
                .withName("CreateWorkflow")
                .withUri("/v2/{project_id}/fgs/workflows")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkflowRequestBody.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDependencyRequest, DeleteDependencyResponse> deleteDependency =
        genFordeleteDependency();

    private static HttpRequestDef<DeleteDependencyRequest, DeleteDependencyResponse> genFordeleteDependency() {
        // basic
        HttpRequestDef.Builder<DeleteDependencyRequest, DeleteDependencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDependencyRequest.class, DeleteDependencyResponse.class)
                .withName("DeleteDependency")
                .withUri("/v2/{project_id}/fgs/dependencies/{depend_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("depend_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDependencyRequest::getDependId, (req, v) -> {
                req.setDependId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventRequest, DeleteEventResponse> deleteEvent = genFordeleteEvent();

    private static HttpRequestDef<DeleteEventRequest, DeleteEventResponse> genFordeleteEvent() {
        // basic
        HttpRequestDef.Builder<DeleteEventRequest, DeleteEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEventRequest.class, DeleteEventResponse.class)
                .withName("DeleteEvent")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunction =
        genFordeleteFunction();

    private static HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> genFordeleteFunction() {
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
            f -> f.withMarshaller(DeleteFunctionRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfig =
        genFordeleteFunctionAsyncInvokeConfig();

    private static HttpRequestDef<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> genFordeleteFunctionAsyncInvokeConfig() {
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
            f -> f.withMarshaller(DeleteFunctionAsyncInvokeConfigRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> deleteFunctionTrigger =
        genFordeleteFunctionTrigger();

    private static HttpRequestDef<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> genFordeleteFunctionTrigger() {
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
            f -> f.withMarshaller(DeleteFunctionTriggerRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<DeleteFunctionTriggerRequest.TriggerTypeCodeEnum>withRequestField("trigger_type_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFunctionTriggerRequest.TriggerTypeCodeEnum.class),
            f -> f.withMarshaller(DeleteFunctionTriggerRequest::getTriggerTypeCode, (req, v) -> {
                req.setTriggerTypeCode(v);
            }));
        builder.<String>withRequestField("trigger_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionTriggerRequest::getTriggerId, (req, v) -> {
                req.setTriggerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVersionAliasRequest, DeleteVersionAliasResponse> deleteVersionAlias =
        genFordeleteVersionAlias();

    private static HttpRequestDef<DeleteVersionAliasRequest, DeleteVersionAliasResponse> genFordeleteVersionAlias() {
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
            f -> f.withMarshaller(DeleteVersionAliasRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<String>withRequestField("alias_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVersionAliasRequest::getAliasName, (req, v) -> {
                req.setAliasName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogs =
        genForenableLtsLogs();

    private static HttpRequestDef<EnableLtsLogsRequest, EnableLtsLogsResponse> genForenableLtsLogs() {
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
        genForexportFunction();

    private static HttpRequestDef<ExportFunctionRequest, ExportFunctionResponse> genForexportFunction() {
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
            f -> f.withMarshaller(ExportFunctionRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<Boolean>withRequestField("config",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportFunctionRequest::getConfig, (req, v) -> {
                req.setConfig(v);
            }));
        builder.<Boolean>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportFunctionRequest::getCode, (req, v) -> {
                req.setCode(v);
            }));
        builder.<ExportFunctionRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportFunctionRequest.TypeEnum.class),
            f -> f.withMarshaller(ExportFunctionRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportFunctionRequest, ImportFunctionResponse> importFunction =
        genForimportFunction();

    private static HttpRequestDef<ImportFunctionRequest, ImportFunctionResponse> genForimportFunction() {
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
            f -> f.withMarshaller(ImportFunctionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InvokeFunctionRequest, InvokeFunctionResponse> invokeFunction =
        genForinvokeFunction();

    private static HttpRequestDef<InvokeFunctionRequest, InvokeFunctionResponse> genForinvokeFunction() {
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
            f -> f.withMarshaller(InvokeFunctionRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<String>withRequestField("X-Cff-Log-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getXCffLogType, (req, v) -> {
                req.setXCffLogType(v);
            }));
        builder.<String>withRequestField("X-CFF-Request-Version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getXCFFRequestVersion, (req, v) -> {
                req.setXCFFRequestVersion(v);
            }));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(InvokeFunctionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDependenciesRequest, ListDependenciesResponse> listDependencies =
        genForlistDependencies();

    private static HttpRequestDef<ListDependenciesRequest, ListDependenciesResponse> genForlistDependencies() {
        // basic
        HttpRequestDef.Builder<ListDependenciesRequest, ListDependenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDependenciesRequest.class, ListDependenciesResponse.class)
                .withName("ListDependencies")
                .withUri("/v2/{project_id}/fgs/dependencies")
                .withContentType("application/json");

        // requests
        builder.<ListDependenciesRequest.DependencyTypeEnum>withRequestField("dependency_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDependenciesRequest.DependencyTypeEnum.class),
            f -> f.withMarshaller(ListDependenciesRequest::getDependencyType, (req, v) -> {
                req.setDependencyType(v);
            }));
        builder.<ListDependenciesRequest.RuntimeEnum>withRequestField("runtime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDependenciesRequest.RuntimeEnum.class),
            f -> f.withMarshaller(ListDependenciesRequest::getRuntime, (req, v) -> {
                req.setRuntime(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDependenciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForlistEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForlistEvents() {
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
            f -> f.withMarshaller(ListEventsRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse> listFunctionAsyncInvocations =
        genForlistFunctionAsyncInvocations();

    private static HttpRequestDef<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse> genForlistFunctionAsyncInvocations() {
        // basic
        HttpRequestDef.Builder<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFunctionAsyncInvocationsRequest.class,
                    ListFunctionAsyncInvocationsResponse.class)
                .withName("ListFunctionAsyncInvocations")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/async-invocations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvocationsRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<String>withRequestField("request_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvocationsRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvocationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvocationsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ListFunctionAsyncInvocationsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFunctionAsyncInvocationsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFunctionAsyncInvocationsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<OffsetDateTime>withRequestField("query_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListFunctionAsyncInvocationsRequest::getQueryBeginTime, (req, v) -> {
                req.setQueryBeginTime(v);
            }));
        builder.<OffsetDateTime>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListFunctionAsyncInvocationsRequest::getQueryEndTime, (req, v) -> {
                req.setQueryEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> listFunctionAsyncInvokeConfig =
        genForlistFunctionAsyncInvokeConfig();

    private static HttpRequestDef<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> genForlistFunctionAsyncInvokeConfig() {
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
            f -> f.withMarshaller(ListFunctionAsyncInvokeConfigRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvokeConfigRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionAsyncInvokeConfigRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> listFunctionStatistics =
        genForlistFunctionStatistics();

    private static HttpRequestDef<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> genForlistFunctionStatistics() {
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
            f -> f.withMarshaller(ListFunctionStatisticsRequest::getFuncUrn, (req, v) -> {
                req.setFuncUrn(v);
            }));
        builder.<ListFunctionStatisticsRequest.PeriodEnum>withRequestField("period",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFunctionStatisticsRequest.PeriodEnum.class),
            f -> f.withMarshaller(ListFunctionStatisticsRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionTriggersRequest, ListFunctionTriggersResponse> listFunctionTriggers =
        genForlistFunctionTriggers();

    private static HttpRequestDef<ListFunctionTriggersRequest, ListFunctionTriggersResponse> genForlistFunctionTriggers() {
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
            f -> f.withMarshaller(ListFunctionTriggersRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        builder.<List<ListFunctionTriggerResult>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFunctionTriggersResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ListFunctionTriggerResult.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionVersionsRequest, ListFunctionVersionsResponse> listFunctionVersions =
        genForlistFunctionVersions();

    private static HttpRequestDef<ListFunctionVersionsRequest, ListFunctionVersionsResponse> genForlistFunctionVersions() {
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
            f -> f.withMarshaller(ListFunctionVersionsRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionVersionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionVersionsRequest::getMaxitems, (req, v) -> {
                req.setMaxitems(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> listFunctions =
        genForlistFunctions();

    private static HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> genForlistFunctions() {
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
            f -> f.withMarshaller(ListFunctionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("maxitems",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getMaxitems, (req, v) -> {
                req.setMaxitems(v);
            }));
        builder.<String>withRequestField("package_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getPackageName, (req, v) -> {
                req.setPackageName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
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

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics =
        genForlistStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForlistStatistics() {
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
            f -> f.withMarshaller(ListStatisticsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<ListStatisticsRequest.OptionEnum>withRequestField("option",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStatisticsRequest.OptionEnum.class),
            f -> f.withMarshaller(ListStatisticsRequest::getOption, (req, v) -> {
                req.setOption(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionAliasesRequest, ListVersionAliasesResponse> listVersionAliases =
        genForlistVersionAliases();

    private static HttpRequestDef<ListVersionAliasesRequest, ListVersionAliasesResponse> genForlistVersionAliases() {
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
            f -> f.withMarshaller(ListVersionAliasesRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        builder.<List<ListVersionAliasResult>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVersionAliasesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ListVersionAliasResult.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutions =
        genForlistWorkflowExecutions();

    private static HttpRequestDef<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> genForlistWorkflowExecutions() {
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
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListWorkflowExecutionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowExecutionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowExecutionsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflows =
        genForlistWorkflows();

    private static HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> genForlistWorkflows() {
        // basic
        HttpRequestDef.Builder<ListWorkflowsRequest, ListWorkflowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowsRequest.class, ListWorkflowsResponse.class)
                .withName("ListWorkflows")
                .withUri("/v2/{project_id}/fgs/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getWorkflowName, (req, v) -> {
                req.setWorkflowName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryWorkFlowRequest, RetryWorkFlowResponse> retryWorkFlow =
        genForretryWorkFlow();

    private static HttpRequestDef<RetryWorkFlowRequest, RetryWorkFlowResponse> genForretryWorkFlow() {
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
            f -> f.withMarshaller(RetryWorkFlowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryWorkFlowRequest::getExecutionId, (req, v) -> {
                req.setExecutionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDependencyRequest, ShowDependencyResponse> showDependency =
        genForshowDependency();

    private static HttpRequestDef<ShowDependencyRequest, ShowDependencyResponse> genForshowDependency() {
        // basic
        HttpRequestDef.Builder<ShowDependencyRequest, ShowDependencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDependencyRequest.class, ShowDependencyResponse.class)
                .withName("ShowDependency")
                .withUri("/v2/{project_id}/fgs/dependencies/{depend_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("depend_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDependencyRequest::getDependId, (req, v) -> {
                req.setDependId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventRequest, ShowEventResponse> showEvent = genForshowEvent();

    private static HttpRequestDef<ShowEventRequest, ShowEventResponse> genForshowEvent() {
        // basic
        HttpRequestDef.Builder<ShowEventRequest, ShowEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventRequest.class, ShowEventResponse.class)
                .withName("ShowEvent")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfig =
        genForshowFunctionAsyncInvokeConfig();

    private static HttpRequestDef<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> genForshowFunctionAsyncInvokeConfig() {
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
            f -> f.withMarshaller(ShowFunctionAsyncInvokeConfigRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionCodeRequest, ShowFunctionCodeResponse> showFunctionCode =
        genForshowFunctionCode();

    private static HttpRequestDef<ShowFunctionCodeRequest, ShowFunctionCodeResponse> genForshowFunctionCode() {
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
            f -> f.withMarshaller(ShowFunctionCodeRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionConfigRequest, ShowFunctionConfigResponse> showFunctionConfig =
        genForshowFunctionConfig();

    private static HttpRequestDef<ShowFunctionConfigRequest, ShowFunctionConfigResponse> genForshowFunctionConfig() {
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
            f -> f.withMarshaller(ShowFunctionConfigRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> showFunctionTrigger =
        genForshowFunctionTrigger();

    private static HttpRequestDef<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> genForshowFunctionTrigger() {
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
            f -> f.withMarshaller(ShowFunctionTriggerRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<ShowFunctionTriggerRequest.TriggerTypeCodeEnum>withRequestField("trigger_type_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowFunctionTriggerRequest.TriggerTypeCodeEnum.class),
            f -> f.withMarshaller(ShowFunctionTriggerRequest::getTriggerTypeCode, (req, v) -> {
                req.setTriggerTypeCode(v);
            }));
        builder.<String>withRequestField("trigger_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFunctionTriggerRequest::getTriggerId, (req, v) -> {
                req.setTriggerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> showLtsLogDetails =
        genForshowLtsLogDetails();

    private static HttpRequestDef<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> genForshowLtsLogDetails() {
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
            f -> f.withMarshaller(ShowLtsLogDetailsRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTenantMetricRequest, ShowTenantMetricResponse> showTenantMetric =
        genForshowTenantMetric();

    private static HttpRequestDef<ShowTenantMetricRequest, ShowTenantMetricResponse> genForshowTenantMetric() {
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
            f -> f.withMarshaller(ShowTenantMetricRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTenantMetricRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTenantMetricRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTracingRequest, ShowTracingResponse> showTracing = genForshowTracing();

    private static HttpRequestDef<ShowTracingRequest, ShowTracingResponse> genForshowTracing() {
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
            f -> f.withMarshaller(ShowTracingRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionAliasRequest, ShowVersionAliasResponse> showVersionAlias =
        genForshowVersionAlias();

    private static HttpRequestDef<ShowVersionAliasRequest, ShowVersionAliasResponse> genForshowVersionAlias() {
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
            f -> f.withMarshaller(ShowVersionAliasRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<String>withRequestField("alias_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionAliasRequest::getAliasName, (req, v) -> {
                req.setAliasName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkFlowRequest, ShowWorkFlowResponse> showWorkFlow = genForshowWorkFlow();

    private static HttpRequestDef<ShowWorkFlowRequest, ShowWorkFlowResponse> genForshowWorkFlow() {
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
            f -> f.withMarshaller(ShowWorkFlowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> showWorkFlowMetric =
        genForshowWorkFlowMetric();

    private static HttpRequestDef<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> genForshowWorkFlowMetric() {
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
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getWorkflowUrn, (req, v) -> {
                req.setWorkflowUrn(v);
            }));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkFlowMetricRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecution =
        genForshowWorkflowExecution();

    private static HttpRequestDef<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> genForshowWorkflowExecution() {
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
            f -> f.withMarshaller(ShowWorkflowExecutionRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowExecutionRequest::getExecutionId, (req, v) -> {
                req.setExecutionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> startSyncWorkflowExecution =
        genForstartSyncWorkflowExecution();

    private static HttpRequestDef<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> genForstartSyncWorkflowExecution() {
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
            f -> f.withMarshaller(StartSyncWorkflowExecutionRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<StartSyncWorkflowExecutionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartSyncWorkflowExecutionRequestBody.class),
            f -> f.withMarshaller(StartSyncWorkflowExecutionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> startWorkflowExecution =
        genForstartWorkflowExecution();

    private static HttpRequestDef<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> genForstartWorkflowExecution() {
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
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<String>withRequestField("X-Create-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getXCreateTime, (req, v) -> {
                req.setXCreateTime(v);
            }));
        builder.<String>withRequestField("X-WorkflowRun-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getXWorkflowRunID, (req, v) -> {
                req.setXWorkflowRunID(v);
            }));
        builder.<StartWorkflowExecutionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartWorkflowExecutionRequestBody.class),
            f -> f.withMarshaller(StartWorkflowExecutionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopWorkFlowRequest, StopWorkFlowResponse> stopWorkFlow = genForstopWorkFlow();

    private static HttpRequestDef<StopWorkFlowRequest, StopWorkFlowResponse> genForstopWorkFlow() {
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
            f -> f.withMarshaller(StopWorkFlowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<String>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopWorkFlowRequest::getExecutionId, (req, v) -> {
                req.setExecutionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDependencyRequest, UpdateDependencyResponse> updateDependency =
        genForupdateDependency();

    private static HttpRequestDef<UpdateDependencyRequest, UpdateDependencyResponse> genForupdateDependency() {
        // basic
        HttpRequestDef.Builder<UpdateDependencyRequest, UpdateDependencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDependencyRequest.class, UpdateDependencyResponse.class)
                .withName("UpdateDependency")
                .withUri("/v2/{project_id}/fgs/dependencies/{depend_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("depend_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDependencyRequest::getDependId, (req, v) -> {
                req.setDependId(v);
            }));
        builder.<UpdateDependencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDependencyRequestBody.class),
            f -> f.withMarshaller(UpdateDependencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventRequest, UpdateEventResponse> updateEvent = genForupdateEvent();

    private static HttpRequestDef<UpdateEventRequest, UpdateEventResponse> genForupdateEvent() {
        // basic
        HttpRequestDef.Builder<UpdateEventRequest, UpdateEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEventRequest.class, UpdateEventResponse.class)
                .withName("UpdateEvent")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEventRequestBody.class),
            f -> f.withMarshaller(UpdateEventRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfig =
        genForupdateFunctionAsyncInvokeConfig();

    private static HttpRequestDef<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> genForupdateFunctionAsyncInvokeConfig() {
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
            f -> f.withMarshaller(UpdateFunctionAsyncInvokeConfigRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateFunctionAsyncInvokeConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionAsyncInvokeConfigRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionAsyncInvokeConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> updateFunctionCode =
        genForupdateFunctionCode();

    private static HttpRequestDef<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> genForupdateFunctionCode() {
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
            f -> f.withMarshaller(UpdateFunctionCodeRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateFunctionCodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionCodeRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> updateFunctionConfig =
        genForupdateFunctionConfig();

    private static HttpRequestDef<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> genForupdateFunctionConfig() {
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
            f -> f.withMarshaller(UpdateFunctionConfigRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateFunctionConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionConfigRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> updateFunctionMaxInstanceConfig =
        genForupdateFunctionMaxInstanceConfig();

    private static HttpRequestDef<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> genForupdateFunctionMaxInstanceConfig() {
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
            f -> f.withMarshaller(UpdateFunctionMaxInstanceConfigRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateFunctionMaxInstanceConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionMaxInstanceConfigRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionMaxInstanceConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse> updateFunctionReservedInstances =
        genForupdateFunctionReservedInstances();

    private static HttpRequestDef<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse> genForupdateFunctionReservedInstances() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFunctionReservedInstancesRequest.class,
                    UpdateFunctionReservedInstancesResponse.class)
                .withName("UpdateFunctionReservedInstances")
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/reservedinstances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFunctionReservedInstancesRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateFunctionReservedInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFunctionReservedInstancesRequestBody.class),
            f -> f.withMarshaller(UpdateFunctionReservedInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTracingRequest, UpdateTracingResponse> updateTracing =
        genForupdateTracing();

    private static HttpRequestDef<UpdateTracingRequest, UpdateTracingResponse> genForupdateTracing() {
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
            f -> f.withMarshaller(UpdateTracingRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateTracingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTracingRequestBody.class),
            f -> f.withMarshaller(UpdateTracingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> updateTrigger =
        genForupdateTrigger();

    private static HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> genForupdateTrigger() {
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
            f -> f.withMarshaller(UpdateTriggerRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<UpdateTriggerRequest.TriggerTypeCodeEnum>withRequestField("trigger_type_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTriggerRequest.TriggerTypeCodeEnum.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getTriggerTypeCode, (req, v) -> {
                req.setTriggerTypeCode(v);
            }));
        builder.<String>withRequestField("trigger_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getTriggerId, (req, v) -> {
                req.setTriggerId(v);
            }));
        builder.<UpdateTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTriggerRequestBody.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVersionAliasRequest, UpdateVersionAliasResponse> updateVersionAlias =
        genForupdateVersionAlias();

    private static HttpRequestDef<UpdateVersionAliasRequest, UpdateVersionAliasResponse> genForupdateVersionAlias() {
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
            f -> f.withMarshaller(UpdateVersionAliasRequest::getFunctionUrn, (req, v) -> {
                req.setFunctionUrn(v);
            }));
        builder.<String>withRequestField("alias_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVersionAliasRequest::getAliasName, (req, v) -> {
                req.setAliasName(v);
            }));
        builder.<UpdateVersionAliasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVersionAliasRequestBody.class),
            f -> f.withMarshaller(UpdateVersionAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkFlowRequest, UpdateWorkFlowResponse> updateWorkFlow =
        genForupdateWorkFlow();

    private static HttpRequestDef<UpdateWorkFlowRequest, UpdateWorkFlowResponse> genForupdateWorkFlow() {
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
            f -> f.withMarshaller(UpdateWorkFlowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<UpdateWorkflowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkflowRequestBody.class),
            f -> f.withMarshaller(UpdateWorkFlowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

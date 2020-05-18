package com.huaweicloud.sdk.fgs.v2;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.fgs.v2.model.*;

@SuppressWarnings("unchecked")
public class FgsMeta {

    public static final HttpRequestDef<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> asyncInvokeFunction = genForasyncInvokeFunction();

    private static HttpRequestDef<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> genForasyncInvokeFunction() {
        // basic
        HttpRequestDef.Builder<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AsyncInvokeFunctionRequest.class, AsyncInvokeFunctionResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/invocations-async")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AsyncInvokeFunctionRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                Map.class,
                f -> f.withMarshaller(AsyncInvokeFunctionRequest::getBody, (req, v) -> {
                    req.setBody(v);
                }).withInnerContainerType(Object.class)
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> createFunction = genForcreateFunction();

    private static HttpRequestDef<CreateFunctionRequest, CreateFunctionResponse> genForcreateFunction() {
        // basic
        HttpRequestDef.Builder<CreateFunctionRequest, CreateFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFunctionRequest.class, CreateFunctionResponse.class)
                .withUri("/v2/{project_id}/fgs/functions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateFunctionRequestBody.class,
                f -> f.withMarshaller(CreateFunctionRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateFunctionVersionRequest, CreateFunctionVersionResponse> createFunctionVersion = genForcreateFunctionVersion();

    private static HttpRequestDef<CreateFunctionVersionRequest, CreateFunctionVersionResponse> genForcreateFunctionVersion() {
        // basic
        HttpRequestDef.Builder<CreateFunctionVersionRequest, CreateFunctionVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFunctionVersionRequest.class, CreateFunctionVersionResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/versions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CreateFunctionVersionRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateFunctionVersionRequestBody.class,
                f -> f.withMarshaller(CreateFunctionVersionRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateVersionAliasRequest, CreateVersionAliasResponse> createVersionAlias = genForcreateVersionAlias();

    private static HttpRequestDef<CreateVersionAliasRequest, CreateVersionAliasResponse> genForcreateVersionAlias() {
        // basic
        HttpRequestDef.Builder<CreateVersionAliasRequest, CreateVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVersionAliasRequest.class, CreateVersionAliasResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CreateVersionAliasRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateVersionAliasRequestBody.class,
                f -> f.withMarshaller(CreateVersionAliasRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunction = genFordeleteFunction();

    private static HttpRequestDef<DeleteFunctionRequest, DeleteFunctionResponse> genFordeleteFunction() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionRequest, DeleteFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFunctionRequest.class, DeleteFunctionResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteFunctionRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteVersionAliasRequest, DeleteVersionAliasResponse> deleteVersionAlias = genFordeleteVersionAlias();

    private static HttpRequestDef<DeleteVersionAliasRequest, DeleteVersionAliasResponse> genFordeleteVersionAlias() {
        // basic
        HttpRequestDef.Builder<DeleteVersionAliasRequest, DeleteVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVersionAliasRequest.class, DeleteVersionAliasResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases/{name}");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteVersionAliasRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteVersionAliasRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<InvokeFunctionRequest, InvokeFunctionResponse> invokeFunction = genForinvokeFunction();

    private static HttpRequestDef<InvokeFunctionRequest, InvokeFunctionResponse> genForinvokeFunction() {
        // basic
        HttpRequestDef.Builder<InvokeFunctionRequest, InvokeFunctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InvokeFunctionRequest.class, InvokeFunctionResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/invocations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(InvokeFunctionRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("X-Cff-Log-Type",
                LocationType.Header,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(InvokeFunctionRequest::getXCffLogType, (req, v) -> {
                    req.setXCffLogType(v);
                })
        );
        builder.withRequestField("X-CFF-Request-Version",
                LocationType.Header,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(InvokeFunctionRequest::getXCFFRequestVersion, (req, v) -> {
                    req.setXCFFRequestVersion(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                Map.class,
                f -> f.withMarshaller(InvokeFunctionRequest::getBody, (req, v) -> {
                    req.setBody(v);
                }).withInnerContainerType(Object.class)
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListFunctionVersionsRequest, ListFunctionVersionsResponse> listFunctionVersions = genForlistFunctionVersions();

    private static HttpRequestDef<ListFunctionVersionsRequest, ListFunctionVersionsResponse> genForlistFunctionVersions() {
        // basic
        HttpRequestDef.Builder<ListFunctionVersionsRequest, ListFunctionVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFunctionVersionsRequest.class, ListFunctionVersionsResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/versions");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListFunctionVersionsRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("marker",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListFunctionVersionsRequest::getMarker, (req, v) -> {
                    req.setMarker(v);
                })
        );
        builder.withRequestField("maxitems",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListFunctionVersionsRequest::getMaxitems, (req, v) -> {
                    req.setMaxitems(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> listFunctions = genForlistFunctions();

    private static HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> genForlistFunctions() {
        // basic
        HttpRequestDef.Builder<ListFunctionsRequest, ListFunctionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFunctionsRequest.class, ListFunctionsResponse.class)
                .withUri("/v2/{project_id}/fgs/functions");

        // requests
        builder.withRequestField("marker",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListFunctionsRequest::getMarker, (req, v) -> {
                    req.setMarker(v);
                })
        );
        builder.withRequestField("maxitems",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListFunctionsRequest::getMaxitems, (req, v) -> {
                    req.setMaxitems(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListVersionAliasesRequest, ListVersionAliasesResponse> listVersionAliases = genForlistVersionAliases();

    private static HttpRequestDef<ListVersionAliasesRequest, ListVersionAliasesResponse> genForlistVersionAliases() {
        // basic
        HttpRequestDef.Builder<ListVersionAliasesRequest, ListVersionAliasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionAliasesRequest.class, ListVersionAliasesResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListVersionAliasesRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );

        // response
        builder.withResponseField(
                "body",
                LocationType.Body,
                FieldExistence.NULL_IGNORE,
                List.class,
                f -> f.withMarshaller(ListVersionAliasesResponse::getBody, (response, data)->{
                    response.setBody(data);
                }).withInnerContainerType(ListVersionAliasResult.class)
        );

        return builder.build();

    }

    public static final HttpRequestDef<ShowFunctionCodeRequest, ShowFunctionCodeResponse> showFunctionCode = genForshowFunctionCode();

    private static HttpRequestDef<ShowFunctionCodeRequest, ShowFunctionCodeResponse> genForshowFunctionCode() {
        // basic
        HttpRequestDef.Builder<ShowFunctionCodeRequest, ShowFunctionCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionCodeRequest.class, ShowFunctionCodeResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/code");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowFunctionCodeRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowFunctionConfigRequest, ShowFunctionConfigResponse> showFunctionConfig = genForshowFunctionConfig();

    private static HttpRequestDef<ShowFunctionConfigRequest, ShowFunctionConfigResponse> genForshowFunctionConfig() {
        // basic
        HttpRequestDef.Builder<ShowFunctionConfigRequest, ShowFunctionConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionConfigRequest.class, ShowFunctionConfigResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/config");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowFunctionConfigRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowVersionAliasRequest, ShowVersionAliasResponse> showVersionAlias = genForshowVersionAlias();

    private static HttpRequestDef<ShowVersionAliasRequest, ShowVersionAliasResponse> genForshowVersionAlias() {
        // basic
        HttpRequestDef.Builder<ShowVersionAliasRequest, ShowVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionAliasRequest.class, ShowVersionAliasResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases/{name}");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowVersionAliasRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowVersionAliasRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> updateFunctionCode = genForupdateFunctionCode();

    private static HttpRequestDef<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> genForupdateFunctionCode() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFunctionCodeRequest.class, UpdateFunctionCodeResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/code")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateFunctionCodeRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateFunctionCodeRequestBody.class,
                f -> f.withMarshaller(UpdateFunctionCodeRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> updateFunctionConfig = genForupdateFunctionConfig();

    private static HttpRequestDef<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> genForupdateFunctionConfig() {
        // basic
        HttpRequestDef.Builder<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFunctionConfigRequest.class, UpdateFunctionConfigResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/config")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateFunctionConfigRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateFunctionConfigRequestBody.class,
                f -> f.withMarshaller(UpdateFunctionConfigRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateVersionAliasRequest, UpdateVersionAliasResponse> updateVersionAlias = genForupdateVersionAlias();

    private static HttpRequestDef<UpdateVersionAliasRequest, UpdateVersionAliasResponse> genForupdateVersionAlias() {
        // basic
        HttpRequestDef.Builder<UpdateVersionAliasRequest, UpdateVersionAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVersionAliasRequest.class, UpdateVersionAliasResponse.class)
                .withUri("/v2/{project_id}/fgs/functions/{function_urn}/aliases/{name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateVersionAliasRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateVersionAliasRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateVersionAliasRequestBody.class,
                f -> f.withMarshaller(UpdateVersionAliasRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggers = genForbatchDeleteFunctionTriggers();

    private static HttpRequestDef<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> genForbatchDeleteFunctionTriggers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteFunctionTriggersRequest.class, BatchDeleteFunctionTriggersResponse.class)
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(BatchDeleteFunctionTriggersRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> createFunctionTrigger = genForcreateFunctionTrigger();

    private static HttpRequestDef<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> genForcreateFunctionTrigger() {
        // basic
        HttpRequestDef.Builder<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFunctionTriggerRequest.class, CreateFunctionTriggerResponse.class)
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CreateFunctionTriggerRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateFunctionTriggerRequestBody.class,
                f -> f.withMarshaller(CreateFunctionTriggerRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> deleteFunctionTrigger = genFordeleteFunctionTrigger();

    private static HttpRequestDef<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> genFordeleteFunctionTrigger() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFunctionTriggerRequest.class, DeleteFunctionTriggerResponse.class)
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}/{trigger_type_code}/{triggerId}");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteFunctionTriggerRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("trigger_type_code",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                DeleteFunctionTriggerRequest.TriggerTypeCodeEnum.class,
                f -> f.withMarshaller(DeleteFunctionTriggerRequest::getTriggerTypeCode, (req, v) -> {
                    req.setTriggerTypeCode(v);
                })
        );
        builder.withRequestField("triggerId",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteFunctionTriggerRequest::getTriggerId, (req, v) -> {
                    req.setTriggerId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListFunctionTriggersRequest, ListFunctionTriggersResponse> listFunctionTriggers = genForlistFunctionTriggers();

    private static HttpRequestDef<ListFunctionTriggersRequest, ListFunctionTriggersResponse> genForlistFunctionTriggers() {
        // basic
        HttpRequestDef.Builder<ListFunctionTriggersRequest, ListFunctionTriggersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFunctionTriggersRequest.class, ListFunctionTriggersResponse.class)
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListFunctionTriggersRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );

        // response
        builder.withResponseField(
                "body",
                LocationType.Body,
                FieldExistence.NULL_IGNORE,
                List.class,
                f -> f.withMarshaller(ListFunctionTriggersResponse::getBody, (response, data)->{
                    response.setBody(data);
                }).withInnerContainerType(ListFunctionTriggerResult.class)
        );

        return builder.build();

    }

    public static final HttpRequestDef<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> showFunctionTrigger = genForshowFunctionTrigger();

    private static HttpRequestDef<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> genForshowFunctionTrigger() {
        // basic
        HttpRequestDef.Builder<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFunctionTriggerRequest.class, ShowFunctionTriggerResponse.class)
                .withUri("/v2/{project_id}/fgs/triggers/{function_urn}/{trigger_type_code}/{triggerId}");

        // requests
        builder.withRequestField("function_urn",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowFunctionTriggerRequest::getFunctionUrn, (req, v) -> {
                    req.setFunctionUrn(v);
                })
        );
        builder.withRequestField("trigger_type_code",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                ShowFunctionTriggerRequest.TriggerTypeCodeEnum.class,
                f -> f.withMarshaller(ShowFunctionTriggerRequest::getTriggerTypeCode, (req, v) -> {
                    req.setTriggerTypeCode(v);
                })
        );
        builder.withRequestField("triggerId",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowFunctionTriggerRequest::getTriggerId, (req, v) -> {
                    req.setTriggerId(v);
                })
        );

        // response

        return builder.build();

    }

}


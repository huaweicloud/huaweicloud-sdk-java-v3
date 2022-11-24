package com.huaweicloud.sdk.aos.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.aos.v1.model.*;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class AosMeta {

    public static final HttpRequestDef<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> applyExecutionPlan = genForapplyExecutionPlan();

    private static HttpRequestDef<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> genForapplyExecutionPlan() {
        // basic
        HttpRequestDef.Builder<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyExecutionPlanRequest.class, ApplyExecutionPlanResponse.class)
                .withName("ApplyExecutionPlan")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<ApplyExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyExecutionPlanRequestBody.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateExecutionPlanRequest, CreateExecutionPlanResponse> createExecutionPlan = genForcreateExecutionPlan();

    private static HttpRequestDef<CreateExecutionPlanRequest, CreateExecutionPlanResponse> genForcreateExecutionPlan() {
        // basic
        HttpRequestDef.Builder<CreateExecutionPlanRequest, CreateExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateExecutionPlanRequest.class, CreateExecutionPlanResponse.class)
                .withName("CreateExecutionPlan")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<CreateExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExecutionPlanRequestBody.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackRequest, DeleteStackResponse> deleteStack = genFordeleteStack();

    private static HttpRequestDef<DeleteStackRequest, DeleteStackResponse> genFordeleteStack() {
        // basic
        HttpRequestDef.Builder<DeleteStackRequest, DeleteStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStackRequest.class, DeleteStackResponse.class)
                .withName("DeleteStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("executor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getExecutor, (req, v) -> {
                req.setExecutor(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> estimateExecutionPlanPrice = genForestimateExecutionPlanPrice();

    private static HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> genForestimateExecutionPlanPrice() {
        // basic
        HttpRequestDef.Builder<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, EstimateExecutionPlanPriceRequest.class, EstimateExecutionPlanPriceResponse.class)
                .withName("EstimateExecutionPlanPrice")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}/prices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<GetStackTemplateRequest, GetStackTemplateResponse> getStackTemplate = genForgetStackTemplate();

    private static HttpRequestDef<GetStackTemplateRequest, GetStackTemplateResponse> genForgetStackTemplate() {
        // basic
        HttpRequestDef.Builder<GetStackTemplateRequest, GetStackTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetStackTemplateRequest.class, GetStackTemplateResponse.class)
                .withName("GetStackTemplate")
                .withUri("/v1/{project_id}/stacks/{stack_name}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("executor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getExecutor, (req, v) -> {
                req.setExecutor(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionPlansRequest, ListExecutionPlansResponse> listExecutionPlans = genForlistExecutionPlans();

    private static HttpRequestDef<ListExecutionPlansRequest, ListExecutionPlansResponse> genForlistExecutionPlans() {
        // basic
        HttpRequestDef.Builder<ListExecutionPlansRequest, ListExecutionPlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExecutionPlansRequest.class, ListExecutionPlansResponse.class)
                .withName("ListExecutionPlans")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("executor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getExecutor, (req, v) -> {
                req.setExecutor(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListStackEventsRequest, ListStackEventsResponse> listStackEvents = genForlistStackEvents();

    private static HttpRequestDef<ListStackEventsRequest, ListStackEventsResponse> genForlistStackEvents() {
        // basic
        HttpRequestDef.Builder<ListStackEventsRequest, ListStackEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackEventsRequest.class, ListStackEventsResponse.class)
                .withName("ListStackEvents")
                .withUri("/v1/{project_id}/stacks/{stack_name}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStackEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.<String>withRequestField("executor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getExecutor, (req, v) -> {
                req.setExecutor(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListStackOutputsRequest, ListStackOutputsResponse> listStackOutputs = genForlistStackOutputs();

    private static HttpRequestDef<ListStackOutputsRequest, ListStackOutputsResponse> genForlistStackOutputs() {
        // basic
        HttpRequestDef.Builder<ListStackOutputsRequest, ListStackOutputsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackOutputsRequest.class, ListStackOutputsResponse.class)
                .withName("ListStackOutputs")
                .withUri("/v1/{project_id}/stacks/{stack_name}/outputs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("executor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getExecutor, (req, v) -> {
                req.setExecutor(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListStackResourcesRequest, ListStackResourcesResponse> listStackResources = genForlistStackResources();

    private static HttpRequestDef<ListStackResourcesRequest, ListStackResourcesResponse> genForlistStackResources() {
        // basic
        HttpRequestDef.Builder<ListStackResourcesRequest, ListStackResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackResourcesRequest.class, ListStackResourcesResponse.class)
                .withName("ListStackResources")
                .withUri("/v1/{project_id}/stacks/{stack_name}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );
        builder.<String>withRequestField("executor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getExecutor, (req, v) -> {
                req.setExecutor(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> parseTemplateVariables = genForparseTemplateVariables();

    private static HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> genForparseTemplateVariables() {
        // basic
        HttpRequestDef.Builder<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ParseTemplateVariablesRequest.class, ParseTemplateVariablesResponse.class)
                .withName("ParseTemplateVariables")
                .withUri("/v1/{project_id}/template-analyses/variables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ParseTemplateVariablesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<ParseTemplateVariablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParseTemplateVariablesRequestBody.class),
            f -> f.withMarshaller(ParseTemplateVariablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> continueRollbackStack = genForcontinueRollbackStack();

    private static HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> genForcontinueRollbackStack() {
        // basic
        HttpRequestDef.Builder<ContinueRollbackStackRequest, ContinueRollbackStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ContinueRollbackStackRequest.class, ContinueRollbackStackResponse.class)
                .withName("ContinueRollbackStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}/rollbacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<ContinueRollbackStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ContinueRollbackStackRequestBody.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<CreateStackRequest, CreateStackResponse> createStack = genForcreateStack();

    private static HttpRequestDef<CreateStackRequest, CreateStackResponse> genForcreateStack() {
        // basic
        HttpRequestDef.Builder<CreateStackRequest, CreateStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStackRequest.class, CreateStackResponse.class)
                .withName("CreateStack")
                .withUri("/v1/{project_id}/stacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<CreateStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackRequestBody.class),
            f -> f.withMarshaller(CreateStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<DeployStackRequest, DeployStackResponse> deployStack = genFordeployStack();

    private static HttpRequestDef<DeployStackRequest, DeployStackResponse> genFordeployStack() {
        // basic
        HttpRequestDef.Builder<DeployStackRequest, DeployStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeployStackRequest.class, DeployStackResponse.class)
                .withName("DeployStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}/deployments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );
        builder.<DeployStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployStackRequestBody.class),
            f -> f.withMarshaller(DeployStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<ListStacksRequest, ListStacksResponse> listStacks = genForlistStacks();

    private static HttpRequestDef<ListStacksRequest, ListStacksResponse> genForlistStacks() {
        // basic
        HttpRequestDef.Builder<ListStacksRequest, ListStacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStacksRequest.class, ListStacksResponse.class)
                .withName("ListStacks")
                .withUri("/v1/{project_id}/stacks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("executor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStacksRequest::getExecutor, (req, v) -> {
                req.setExecutor(v);
            })
        );
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStacksRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            })
        );

        // response


        return builder.build();
    }

}

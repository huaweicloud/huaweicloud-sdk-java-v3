package com.huaweicloud.sdk.aos.v1;

import com.huaweicloud.sdk.aos.v1.model.ApplyExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.ApplyExecutionPlanRequestBody;
import com.huaweicloud.sdk.aos.v1.model.ApplyExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.ContinueDeployStackRequest;
import com.huaweicloud.sdk.aos.v1.model.ContinueDeployStackRequestBody;
import com.huaweicloud.sdk.aos.v1.model.ContinueDeployStackResponse;
import com.huaweicloud.sdk.aos.v1.model.ContinueRollbackStackRequest;
import com.huaweicloud.sdk.aos.v1.model.ContinueRollbackStackRequestBody;
import com.huaweicloud.sdk.aos.v1.model.ContinueRollbackStackResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateExecutionPlanRequestBody;
import com.huaweicloud.sdk.aos.v1.model.CreateExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateStackInstanceRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateStackInstanceRequestBody;
import com.huaweicloud.sdk.aos.v1.model.CreateStackInstanceResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateStackRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateStackRequestBody;
import com.huaweicloud.sdk.aos.v1.model.CreateStackResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateStackSetRequestBody;
import com.huaweicloud.sdk.aos.v1.model.CreateStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackEnhancedRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackEnhancedRequestBody;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackEnhancedResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceDeprecatedRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceDeprecatedResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceRequestBody;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateVersionRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateVersionResponse;
import com.huaweicloud.sdk.aos.v1.model.DeployStackRequest;
import com.huaweicloud.sdk.aos.v1.model.DeployStackRequestBody;
import com.huaweicloud.sdk.aos.v1.model.DeployStackResponse;
import com.huaweicloud.sdk.aos.v1.model.DeployStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.DeployStackSetRequestBody;
import com.huaweicloud.sdk.aos.v1.model.DeployStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.EstimateExecutionPlanPriceRequest;
import com.huaweicloud.sdk.aos.v1.model.EstimateExecutionPlanPriceResponse;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.GetStackMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.GetStackMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.GetStackTemplateRequest;
import com.huaweicloud.sdk.aos.v1.model.GetStackTemplateResponse;
import com.huaweicloud.sdk.aos.v1.model.ListExecutionPlansRequest;
import com.huaweicloud.sdk.aos.v1.model.ListExecutionPlansResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackEventsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackEventsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackInstancesRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackInstancesResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackOutputsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackOutputsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackResourcesRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackResourcesResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetOperationsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetOperationsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStacksRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStacksResponse;
import com.huaweicloud.sdk.aos.v1.model.ListTemplateVersionsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListTemplateVersionsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListTemplatesRequest;
import com.huaweicloud.sdk.aos.v1.model.ListTemplatesResponse;
import com.huaweicloud.sdk.aos.v1.model.ParseTemplateVariablesRequest;
import com.huaweicloud.sdk.aos.v1.model.ParseTemplateVariablesRequestBody;
import com.huaweicloud.sdk.aos.v1.model.ParseTemplateVariablesResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackInstanceRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackInstanceResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetOperationMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetOperationMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetTemplateRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetTemplateResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionContentRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionContentResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackInstancesRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackInstancesRequestBody;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackInstancesResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackRequestBody;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackSetRequestBody;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateTemplateMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateTemplateMetadataRequestBody;
import com.huaweicloud.sdk.aos.v1.model.UpdateTemplateMetadataResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class AosMeta {

    public static final HttpRequestDef<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> applyExecutionPlan =
        genForapplyExecutionPlan();

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
            }));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<ApplyExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplyExecutionPlanRequestBody.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExecutionPlanRequest, CreateExecutionPlanResponse> createExecutionPlan =
        genForcreateExecutionPlan();

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
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<CreateExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExecutionPlanRequestBody.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> deleteExecutionPlan =
        genFordeleteExecutionPlan();

    private static HttpRequestDef<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> genFordeleteExecutionPlan() {
        // basic
        HttpRequestDef.Builder<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteExecutionPlanRequest.class, DeleteExecutionPlanResponse.class)
            .withName("DeleteExecutionPlan")
            .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            }));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> estimateExecutionPlanPrice =
        genForestimateExecutionPlanPrice();

    private static HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> genForestimateExecutionPlanPrice() {
        // basic
        HttpRequestDef.Builder<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    EstimateExecutionPlanPriceRequest.class,
                    EstimateExecutionPlanPriceResponse.class)
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
            }));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetExecutionPlanRequest, GetExecutionPlanResponse> getExecutionPlan =
        genForgetExecutionPlan();

    private static HttpRequestDef<GetExecutionPlanRequest, GetExecutionPlanResponse> genForgetExecutionPlan() {
        // basic
        HttpRequestDef.Builder<GetExecutionPlanRequest, GetExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetExecutionPlanRequest.class, GetExecutionPlanResponse.class)
                .withName("GetExecutionPlan")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            }));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> getExecutionPlanMetadata =
        genForgetExecutionPlanMetadata();

    private static HttpRequestDef<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> genForgetExecutionPlanMetadata() {
        // basic
        HttpRequestDef.Builder<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, GetExecutionPlanMetadataRequest.class, GetExecutionPlanMetadataResponse.class)
                .withName("GetExecutionPlanMetadata")
                .withUri("/v1/{project_id}/stacks/{stack_name}/execution-plans/{execution_plan_name}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            }));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getExecutionPlanName, (req, v) -> {
                req.setExecutionPlanName(v);
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getExecutionPlanId, (req, v) -> {
                req.setExecutionPlanId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionPlansRequest, ListExecutionPlansResponse> listExecutionPlans =
        genForlistExecutionPlans();

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
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ContinueDeployStackRequest, ContinueDeployStackResponse> continueDeployStack =
        genForcontinueDeployStack();

    private static HttpRequestDef<ContinueDeployStackRequest, ContinueDeployStackResponse> genForcontinueDeployStack() {
        // basic
        HttpRequestDef.Builder<ContinueDeployStackRequest, ContinueDeployStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ContinueDeployStackRequest.class, ContinueDeployStackResponse.class)
                .withName("ContinueDeployStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}/continuations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<ContinueDeployStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContinueDeployStackRequestBody.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> continueRollbackStack =
        genForcontinueRollbackStack();

    private static HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> genForcontinueRollbackStack() {
        // basic
        HttpRequestDef.Builder<ContinueRollbackStackRequest, ContinueRollbackStackResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ContinueRollbackStackRequest.class, ContinueRollbackStackResponse.class)
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
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<ContinueRollbackStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContinueRollbackStackRequestBody.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
            }));
        builder.<CreateStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackRequestBody.class),
            f -> f.withMarshaller(CreateStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackEnhancedRequest, DeleteStackEnhancedResponse> deleteStackEnhanced =
        genFordeleteStackEnhanced();

    private static HttpRequestDef<DeleteStackEnhancedRequest, DeleteStackEnhancedResponse> genFordeleteStackEnhanced() {
        // basic
        HttpRequestDef.Builder<DeleteStackEnhancedRequest, DeleteStackEnhancedResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteStackEnhancedRequest.class, DeleteStackEnhancedResponse.class)
                .withName("DeleteStackEnhanced")
                .withUri("/v1/{project_id}/stacks/{stack_name}/deletion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackEnhancedRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackEnhancedRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<DeleteStackEnhancedRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteStackEnhancedRequestBody.class),
            f -> f.withMarshaller(DeleteStackEnhancedRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<DeployStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployStackRequestBody.class),
            f -> f.withMarshaller(DeployStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetStackMetadataRequest, GetStackMetadataResponse> getStackMetadata =
        genForgetStackMetadata();

    private static HttpRequestDef<GetStackMetadataRequest, GetStackMetadataResponse> genForgetStackMetadata() {
        // basic
        HttpRequestDef.Builder<GetStackMetadataRequest, GetStackMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetStackMetadataRequest.class, GetStackMetadataResponse.class)
                .withName("GetStackMetadata")
                .withUri("/v1/{project_id}/stacks/{stack_name}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetStackTemplateRequest, GetStackTemplateResponse> getStackTemplate =
        genForgetStackTemplate();

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
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        builder.<String>withResponseField("Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetStackTemplateResponse::getLocation, GetStackTemplateResponse::setLocation));
        return builder.build();
    }

    public static final HttpRequestDef<ListStackEventsRequest, ListStackEventsResponse> listStackEvents =
        genForlistStackEvents();

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
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<String>withRequestField("field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getField, (req, v) -> {
                req.setField(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackOutputsRequest, ListStackOutputsResponse> listStackOutputs =
        genForlistStackOutputs();

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
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackResourcesRequest, ListStackResourcesResponse> listStackResources =
        genForlistStackResources();

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
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

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
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStacksRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStackRequest, UpdateStackResponse> updateStack = genForupdateStack();

    private static HttpRequestDef<UpdateStackRequest, UpdateStackResponse> genForupdateStack() {
        // basic
        HttpRequestDef.Builder<UpdateStackRequest, UpdateStackResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateStackRequest.class, UpdateStackResponse.class)
                .withName("UpdateStack")
                .withUri("/v1/{project_id}/stacks/{stack_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackRequest::getStackName, (req, v) -> {
                req.setStackName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<UpdateStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStackRequestBody.class),
            f -> f.withMarshaller(UpdateStackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStackInstanceRequest, CreateStackInstanceResponse> createStackInstance =
        genForcreateStackInstance();

    private static HttpRequestDef<CreateStackInstanceRequest, CreateStackInstanceResponse> genForcreateStackInstance() {
        // basic
        HttpRequestDef.Builder<CreateStackInstanceRequest, CreateStackInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStackInstanceRequest.class, CreateStackInstanceResponse.class)
                .withName("CreateStackInstance")
                .withUri("/v1/stack-sets/{stack_set_name}/stack-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStackInstanceRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStackInstanceRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<CreateStackInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackInstanceRequestBody.class),
            f -> f.withMarshaller(CreateStackInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStackSetRequest, CreateStackSetResponse> createStackSet =
        genForcreateStackSet();

    private static HttpRequestDef<CreateStackSetRequest, CreateStackSetResponse> genForcreateStackSet() {
        // basic
        HttpRequestDef.Builder<CreateStackSetRequest, CreateStackSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStackSetRequest.class, CreateStackSetResponse.class)
                .withName("CreateStackSet")
                .withUri("/v1/stack-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStackSetRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<CreateStackSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackSetRequestBody.class),
            f -> f.withMarshaller(CreateStackSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackInstanceRequest, DeleteStackInstanceResponse> deleteStackInstance =
        genFordeleteStackInstance();

    private static HttpRequestDef<DeleteStackInstanceRequest, DeleteStackInstanceResponse> genFordeleteStackInstance() {
        // basic
        HttpRequestDef.Builder<DeleteStackInstanceRequest, DeleteStackInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteStackInstanceRequest.class, DeleteStackInstanceResponse.class)
                .withName("DeleteStackInstance")
                .withUri("/v1/stack-sets/{stack_set_name}/stack-instances/deletion")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackInstanceRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackInstanceRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<DeleteStackInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStackInstanceRequestBody.class),
            f -> f.withMarshaller(DeleteStackInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackInstanceDeprecatedRequest, DeleteStackInstanceDeprecatedResponse> deleteStackInstanceDeprecated =
        genFordeleteStackInstanceDeprecated();

    private static HttpRequestDef<DeleteStackInstanceDeprecatedRequest, DeleteStackInstanceDeprecatedResponse> genFordeleteStackInstanceDeprecated() {
        // basic
        HttpRequestDef.Builder<DeleteStackInstanceDeprecatedRequest, DeleteStackInstanceDeprecatedResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteStackInstanceDeprecatedRequest.class,
                    DeleteStackInstanceDeprecatedResponse.class)
                .withName("DeleteStackInstanceDeprecated")
                .withUri("/v1/stack-sets/{stack_set_name}/stack-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackInstanceDeprecatedRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackInstanceDeprecatedRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<DeleteStackInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStackInstanceRequestBody.class),
            f -> f.withMarshaller(DeleteStackInstanceDeprecatedRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackSetRequest, DeleteStackSetResponse> deleteStackSet =
        genFordeleteStackSet();

    private static HttpRequestDef<DeleteStackSetRequest, DeleteStackSetResponse> genFordeleteStackSet() {
        // basic
        HttpRequestDef.Builder<DeleteStackSetRequest, DeleteStackSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStackSetRequest.class, DeleteStackSetResponse.class)
                .withName("DeleteStackSet")
                .withUri("/v1/stack-sets/{stack_set_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackSetRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackSetRequest::getStackSetId, (req, v) -> {
                req.setStackSetId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackSetRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployStackSetRequest, DeployStackSetResponse> deployStackSet =
        genFordeployStackSet();

    private static HttpRequestDef<DeployStackSetRequest, DeployStackSetResponse> genFordeployStackSet() {
        // basic
        HttpRequestDef.Builder<DeployStackSetRequest, DeployStackSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeployStackSetRequest.class, DeployStackSetResponse.class)
                .withName("DeployStackSet")
                .withUri("/v1/stack-sets/{stack_set_name}/deployments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackSetRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackSetRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<DeployStackSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployStackSetRequestBody.class),
            f -> f.withMarshaller(DeployStackSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackInstancesRequest, ListStackInstancesResponse> listStackInstances =
        genForlistStackInstances();

    private static HttpRequestDef<ListStackInstancesRequest, ListStackInstancesResponse> genForlistStackInstances() {
        // basic
        HttpRequestDef.Builder<ListStackInstancesRequest, ListStackInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackInstancesRequest.class, ListStackInstancesResponse.class)
                .withName("ListStackInstances")
                .withUri("/v1/stack-sets/{stack_set_name}/stack-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getStackSetId, (req, v) -> {
                req.setStackSetId(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<List<ListStackInstancesRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListStackInstancesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackSetOperationsRequest, ListStackSetOperationsResponse> listStackSetOperations =
        genForlistStackSetOperations();

    private static HttpRequestDef<ListStackSetOperationsRequest, ListStackSetOperationsResponse> genForlistStackSetOperations() {
        // basic
        HttpRequestDef.Builder<ListStackSetOperationsRequest, ListStackSetOperationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListStackSetOperationsRequest.class, ListStackSetOperationsResponse.class)
            .withName("ListStackSetOperations")
            .withUri("/v1/stack-sets/{stack_set_name}/operations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getStackSetId, (req, v) -> {
                req.setStackSetId(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<List<ListStackSetOperationsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListStackSetOperationsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackSetsRequest, ListStackSetsResponse> listStackSets =
        genForlistStackSets();

    private static HttpRequestDef<ListStackSetsRequest, ListStackSetsResponse> genForlistStackSets() {
        // basic
        HttpRequestDef.Builder<ListStackSetsRequest, ListStackSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStackSetsRequest.class, ListStackSetsResponse.class)
                .withName("ListStackSets")
                .withUri("/v1/stack-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<List<ListStackSetsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<List<ListStackSetsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackInstanceRequest, ShowStackInstanceResponse> showStackInstance =
        genForshowStackInstance();

    private static HttpRequestDef<ShowStackInstanceRequest, ShowStackInstanceResponse> genForshowStackInstance() {
        // basic
        HttpRequestDef.Builder<ShowStackInstanceRequest, ShowStackInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStackInstanceRequest.class, ShowStackInstanceResponse.class)
                .withName("ShowStackInstance")
                .withUri("/v1/stack-sets/{stack_set_name}/stack-instances/{stack_instance_addr}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("stack_instance_addr",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getStackInstanceAddr, (req, v) -> {
                req.setStackInstanceAddr(v);
            }));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getStackSetId, (req, v) -> {
                req.setStackSetId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackSetMetadataRequest, ShowStackSetMetadataResponse> showStackSetMetadata =
        genForshowStackSetMetadata();

    private static HttpRequestDef<ShowStackSetMetadataRequest, ShowStackSetMetadataResponse> genForshowStackSetMetadata() {
        // basic
        HttpRequestDef.Builder<ShowStackSetMetadataRequest, ShowStackSetMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowStackSetMetadataRequest.class, ShowStackSetMetadataResponse.class)
            .withName("ShowStackSetMetadata")
            .withUri("/v1/stack-sets/{stack_set_name}/metadata")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetMetadataRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetMetadataRequest::getStackSetId, (req, v) -> {
                req.setStackSetId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackSetOperationMetadataRequest, ShowStackSetOperationMetadataResponse> showStackSetOperationMetadata =
        genForshowStackSetOperationMetadata();

    private static HttpRequestDef<ShowStackSetOperationMetadataRequest, ShowStackSetOperationMetadataResponse> genForshowStackSetOperationMetadata() {
        // basic
        HttpRequestDef.Builder<ShowStackSetOperationMetadataRequest, ShowStackSetOperationMetadataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowStackSetOperationMetadataRequest.class,
                    ShowStackSetOperationMetadataResponse.class)
                .withName("ShowStackSetOperationMetadata")
                .withUri("/v1/stack-sets/{stack_set_name}/operations/{stack_set_operation_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("stack_set_operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getStackSetOperationId, (req, v) -> {
                req.setStackSetOperationId(v);
            }));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getStackSetId, (req, v) -> {
                req.setStackSetId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackSetTemplateRequest, ShowStackSetTemplateResponse> showStackSetTemplate =
        genForshowStackSetTemplate();

    private static HttpRequestDef<ShowStackSetTemplateRequest, ShowStackSetTemplateResponse> genForshowStackSetTemplate() {
        // basic
        HttpRequestDef.Builder<ShowStackSetTemplateRequest, ShowStackSetTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowStackSetTemplateRequest.class, ShowStackSetTemplateResponse.class)
            .withName("ShowStackSetTemplate")
            .withUri("/v1/stack-sets/{stack_set_name}/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getStackSetId, (req, v) -> {
                req.setStackSetId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        builder.<String>withResponseField("Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStackSetTemplateResponse::getLocation,
                ShowStackSetTemplateResponse::setLocation));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateStackInstancesRequest, UpdateStackInstancesResponse> updateStackInstances =
        genForupdateStackInstances();

    private static HttpRequestDef<UpdateStackInstancesRequest, UpdateStackInstancesResponse> genForupdateStackInstances() {
        // basic
        HttpRequestDef.Builder<UpdateStackInstancesRequest, UpdateStackInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdateStackInstancesRequest.class, UpdateStackInstancesResponse.class)
            .withName("UpdateStackInstances")
            .withUri("/v1/stack-sets/{stack_set_name}/stack-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackInstancesRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackInstancesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<UpdateStackInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStackInstancesRequestBody.class),
            f -> f.withMarshaller(UpdateStackInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStackSetRequest, UpdateStackSetResponse> updateStackSet =
        genForupdateStackSet();

    private static HttpRequestDef<UpdateStackSetRequest, UpdateStackSetResponse> genForupdateStackSet() {
        // basic
        HttpRequestDef.Builder<UpdateStackSetRequest, UpdateStackSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateStackSetRequest.class, UpdateStackSetResponse.class)
                .withName("UpdateStackSet")
                .withUri("/v1/stack-sets/{stack_set_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stack_set_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackSetRequest::getStackSetName, (req, v) -> {
                req.setStackSetName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackSetRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<UpdateStackSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStackSetRequestBody.class),
            f -> f.withMarshaller(UpdateStackSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> parseTemplateVariables =
        genForparseTemplateVariables();

    private static HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> genForparseTemplateVariables() {
        // basic
        HttpRequestDef.Builder<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ParseTemplateVariablesRequest.class, ParseTemplateVariablesResponse.class)
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
            }));
        builder.<ParseTemplateVariablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParseTemplateVariablesRequestBody.class),
            f -> f.withMarshaller(ParseTemplateVariablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/{project_id}/templates/{template_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> deleteTemplateVersion =
        genFordeleteTemplateVersion();

    private static HttpRequestDef<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> genFordeleteTemplateVersion() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTemplateVersionRequest.class, DeleteTemplateVersionResponse.class)
            .withName("DeleteTemplateVersion")
            .withUri("/v1/{project_id}/templates/{template_name}/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTemplateVersionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateVersionsRequest, ListTemplateVersionsResponse> listTemplateVersions =
        genForlistTemplateVersions();

    private static HttpRequestDef<ListTemplateVersionsRequest, ListTemplateVersionsResponse> genForlistTemplateVersions() {
        // basic
        HttpRequestDef.Builder<ListTemplateVersionsRequest, ListTemplateVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTemplateVersionsRequest.class, ListTemplateVersionsResponse.class)
            .withName("ListTemplateVersions")
            .withUri("/v1/{project_id}/templates/{template_name}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateVersionsRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateVersionsRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateVersionsRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v1/{project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> showTemplateMetadata =
        genForshowTemplateMetadata();

    private static HttpRequestDef<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> genForshowTemplateMetadata() {
        // basic
        HttpRequestDef.Builder<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTemplateMetadataRequest.class, ShowTemplateMetadataResponse.class)
            .withName("ShowTemplateMetadata")
            .withUri("/v1/{project_id}/templates/{template_name}/metadata")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> showTemplateVersionContent =
        genForshowTemplateVersionContent();

    private static HttpRequestDef<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> genForshowTemplateVersionContent() {
        // basic
        HttpRequestDef.Builder<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTemplateVersionContentRequest.class,
                    ShowTemplateVersionContentResponse.class)
                .withName("ShowTemplateVersionContent")
                .withUri("/v1/{project_id}/templates/{template_name}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTemplateVersionContentResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        builder.<String>withResponseField("Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTemplateVersionContentResponse::getLocation,
                ShowTemplateVersionContentResponse::setLocation));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> showTemplateVersionMetadata =
        genForshowTemplateVersionMetadata();

    private static HttpRequestDef<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> genForshowTemplateVersionMetadata() {
        // basic
        HttpRequestDef.Builder<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTemplateVersionMetadataRequest.class,
                    ShowTemplateVersionMetadataResponse.class)
                .withName("ShowTemplateVersionMetadata")
                .withUri("/v1/{project_id}/templates/{template_name}/versions/{version_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> updateTemplateMetadata =
        genForupdateTemplateMetadata();

    private static HttpRequestDef<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> genForupdateTemplateMetadata() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdateTemplateMetadataRequest.class, UpdateTemplateMetadataResponse.class)
            .withName("UpdateTemplateMetadata")
            .withUri("/v1/{project_id}/templates/{template_name}/metadata")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getClientRequestId, (req, v) -> {
                req.setClientRequestId(v);
            }));
        builder.<UpdateTemplateMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTemplateMetadataRequestBody.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTemplateMetadataResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

}

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
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderRequest;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderRequestBody;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderResponse;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderVersionRequest;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderVersionRequestBody;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderVersionResponse;
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

    public static final HttpRequestDef<CreatePrivateProviderRequest, CreatePrivateProviderResponse> createPrivateProvider =
        genForCreatePrivateProvider();

    private static HttpRequestDef<CreatePrivateProviderRequest, CreatePrivateProviderResponse> genForCreatePrivateProvider() {
        // basic
        HttpRequestDef.Builder<CreatePrivateProviderRequest, CreatePrivateProviderResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePrivateProviderRequest.class, CreatePrivateProviderResponse.class)
            .withName("CreatePrivateProvider")
            .withUri("/v1/private-providers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivateProviderRequest::getClientRequestId,
                CreatePrivateProviderRequest::setClientRequestId));
        builder.<CreatePrivateProviderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivateProviderRequestBody.class),
            f -> f.withMarshaller(CreatePrivateProviderRequest::getBody, CreatePrivateProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateProviderVersionRequest, CreatePrivateProviderVersionResponse> createPrivateProviderVersion =
        genForCreatePrivateProviderVersion();

    private static HttpRequestDef<CreatePrivateProviderVersionRequest, CreatePrivateProviderVersionResponse> genForCreatePrivateProviderVersion() {
        // basic
        HttpRequestDef.Builder<CreatePrivateProviderVersionRequest, CreatePrivateProviderVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePrivateProviderVersionRequest.class,
                    CreatePrivateProviderVersionResponse.class)
                .withName("CreatePrivateProviderVersion")
                .withUri("/v1/private-providers/{provider_name}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivateProviderVersionRequest::getProviderName,
                CreatePrivateProviderVersionRequest::setProviderName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivateProviderVersionRequest::getClientRequestId,
                CreatePrivateProviderVersionRequest::setClientRequestId));
        builder.<CreatePrivateProviderVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivateProviderVersionRequestBody.class),
            f -> f.withMarshaller(CreatePrivateProviderVersionRequest::getBody,
                CreatePrivateProviderVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> applyExecutionPlan =
        genForApplyExecutionPlan();

    private static HttpRequestDef<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> genForApplyExecutionPlan() {
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
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getStackName, ApplyExecutionPlanRequest::setStackName));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getExecutionPlanName,
                ApplyExecutionPlanRequest::setExecutionPlanName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getClientRequestId,
                ApplyExecutionPlanRequest::setClientRequestId));
        builder.<ApplyExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplyExecutionPlanRequestBody.class),
            f -> f.withMarshaller(ApplyExecutionPlanRequest::getBody, ApplyExecutionPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExecutionPlanRequest, CreateExecutionPlanResponse> createExecutionPlan =
        genForCreateExecutionPlan();

    private static HttpRequestDef<CreateExecutionPlanRequest, CreateExecutionPlanResponse> genForCreateExecutionPlan() {
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
            f -> f.withMarshaller(CreateExecutionPlanRequest::getStackName, CreateExecutionPlanRequest::setStackName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getClientRequestId,
                CreateExecutionPlanRequest::setClientRequestId));
        builder.<CreateExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExecutionPlanRequestBody.class),
            f -> f.withMarshaller(CreateExecutionPlanRequest::getBody, CreateExecutionPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> deleteExecutionPlan =
        genForDeleteExecutionPlan();

    private static HttpRequestDef<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> genForDeleteExecutionPlan() {
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
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getStackName, DeleteExecutionPlanRequest::setStackName));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getExecutionPlanName,
                DeleteExecutionPlanRequest::setExecutionPlanName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getStackId, DeleteExecutionPlanRequest::setStackId));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getExecutionPlanId,
                DeleteExecutionPlanRequest::setExecutionPlanId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExecutionPlanRequest::getClientRequestId,
                DeleteExecutionPlanRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> estimateExecutionPlanPrice =
        genForEstimateExecutionPlanPrice();

    private static HttpRequestDef<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> genForEstimateExecutionPlanPrice() {
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
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getStackName,
                EstimateExecutionPlanPriceRequest::setStackName));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanName,
                EstimateExecutionPlanPriceRequest::setExecutionPlanName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getStackId,
                EstimateExecutionPlanPriceRequest::setStackId));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getExecutionPlanId,
                EstimateExecutionPlanPriceRequest::setExecutionPlanId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EstimateExecutionPlanPriceRequest::getClientRequestId,
                EstimateExecutionPlanPriceRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetExecutionPlanRequest, GetExecutionPlanResponse> getExecutionPlan =
        genForGetExecutionPlan();

    private static HttpRequestDef<GetExecutionPlanRequest, GetExecutionPlanResponse> genForGetExecutionPlan() {
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
            f -> f.withMarshaller(GetExecutionPlanRequest::getStackName, GetExecutionPlanRequest::setStackName));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getExecutionPlanName,
                GetExecutionPlanRequest::setExecutionPlanName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getStackId, GetExecutionPlanRequest::setStackId));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getExecutionPlanId,
                GetExecutionPlanRequest::setExecutionPlanId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanRequest::getClientRequestId,
                GetExecutionPlanRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> getExecutionPlanMetadata =
        genForGetExecutionPlanMetadata();

    private static HttpRequestDef<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> genForGetExecutionPlanMetadata() {
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
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getStackName,
                GetExecutionPlanMetadataRequest::setStackName));
        builder.<String>withRequestField("execution_plan_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getExecutionPlanName,
                GetExecutionPlanMetadataRequest::setExecutionPlanName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getStackId,
                GetExecutionPlanMetadataRequest::setStackId));
        builder.<String>withRequestField("execution_plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getExecutionPlanId,
                GetExecutionPlanMetadataRequest::setExecutionPlanId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetExecutionPlanMetadataRequest::getClientRequestId,
                GetExecutionPlanMetadataRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExecutionPlansRequest, ListExecutionPlansResponse> listExecutionPlans =
        genForListExecutionPlans();

    private static HttpRequestDef<ListExecutionPlansRequest, ListExecutionPlansResponse> genForListExecutionPlans() {
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
            f -> f.withMarshaller(ListExecutionPlansRequest::getStackName, ListExecutionPlansRequest::setStackName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getStackId, ListExecutionPlansRequest::setStackId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExecutionPlansRequest::getClientRequestId,
                ListExecutionPlansRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ContinueDeployStackRequest, ContinueDeployStackResponse> continueDeployStack =
        genForContinueDeployStack();

    private static HttpRequestDef<ContinueDeployStackRequest, ContinueDeployStackResponse> genForContinueDeployStack() {
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
            f -> f.withMarshaller(ContinueDeployStackRequest::getStackName, ContinueDeployStackRequest::setStackName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getClientRequestId,
                ContinueDeployStackRequest::setClientRequestId));
        builder.<ContinueDeployStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContinueDeployStackRequestBody.class),
            f -> f.withMarshaller(ContinueDeployStackRequest::getBody, ContinueDeployStackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> continueRollbackStack =
        genForContinueRollbackStack();

    private static HttpRequestDef<ContinueRollbackStackRequest, ContinueRollbackStackResponse> genForContinueRollbackStack() {
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
            f -> f.withMarshaller(ContinueRollbackStackRequest::getStackName,
                ContinueRollbackStackRequest::setStackName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getClientRequestId,
                ContinueRollbackStackRequest::setClientRequestId));
        builder.<ContinueRollbackStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ContinueRollbackStackRequestBody.class),
            f -> f.withMarshaller(ContinueRollbackStackRequest::getBody, ContinueRollbackStackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStackRequest, CreateStackResponse> createStack = genForCreateStack();

    private static HttpRequestDef<CreateStackRequest, CreateStackResponse> genForCreateStack() {
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
            f -> f.withMarshaller(CreateStackRequest::getClientRequestId, CreateStackRequest::setClientRequestId));
        builder.<CreateStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackRequestBody.class),
            f -> f.withMarshaller(CreateStackRequest::getBody, CreateStackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackRequest, DeleteStackResponse> deleteStack = genForDeleteStack();

    private static HttpRequestDef<DeleteStackRequest, DeleteStackResponse> genForDeleteStack() {
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
            f -> f.withMarshaller(DeleteStackRequest::getStackName, DeleteStackRequest::setStackName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getStackId, DeleteStackRequest::setStackId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackRequest::getClientRequestId, DeleteStackRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackEnhancedRequest, DeleteStackEnhancedResponse> deleteStackEnhanced =
        genForDeleteStackEnhanced();

    private static HttpRequestDef<DeleteStackEnhancedRequest, DeleteStackEnhancedResponse> genForDeleteStackEnhanced() {
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
            f -> f.withMarshaller(DeleteStackEnhancedRequest::getStackName, DeleteStackEnhancedRequest::setStackName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackEnhancedRequest::getClientRequestId,
                DeleteStackEnhancedRequest::setClientRequestId));
        builder.<DeleteStackEnhancedRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteStackEnhancedRequestBody.class),
            f -> f.withMarshaller(DeleteStackEnhancedRequest::getBody, DeleteStackEnhancedRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployStackRequest, DeployStackResponse> deployStack = genForDeployStack();

    private static HttpRequestDef<DeployStackRequest, DeployStackResponse> genForDeployStack() {
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
            f -> f.withMarshaller(DeployStackRequest::getStackName, DeployStackRequest::setStackName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackRequest::getClientRequestId, DeployStackRequest::setClientRequestId));
        builder.<DeployStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployStackRequestBody.class),
            f -> f.withMarshaller(DeployStackRequest::getBody, DeployStackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetStackMetadataRequest, GetStackMetadataResponse> getStackMetadata =
        genForGetStackMetadata();

    private static HttpRequestDef<GetStackMetadataRequest, GetStackMetadataResponse> genForGetStackMetadata() {
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
            f -> f.withMarshaller(GetStackMetadataRequest::getStackName, GetStackMetadataRequest::setStackName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getStackId, GetStackMetadataRequest::setStackId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackMetadataRequest::getClientRequestId,
                GetStackMetadataRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetStackTemplateRequest, GetStackTemplateResponse> getStackTemplate =
        genForGetStackTemplate();

    private static HttpRequestDef<GetStackTemplateRequest, GetStackTemplateResponse> genForGetStackTemplate() {
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
            f -> f.withMarshaller(GetStackTemplateRequest::getStackName, GetStackTemplateRequest::setStackName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getStackId, GetStackTemplateRequest::setStackId));
        builder.<List<String>>withRequestField("access_control_source_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getAccessControlSourceIps,
                GetStackTemplateRequest::setAccessControlSourceIps));
        builder.<List<String>>withRequestField("access_control_source_vpc_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getAccessControlSourceVpcIds,
                GetStackTemplateRequest::setAccessControlSourceVpcIds));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStackTemplateRequest::getClientRequestId,
                GetStackTemplateRequest::setClientRequestId));

        // response

        builder.<String>withResponseField("Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetStackTemplateResponse::getLocation, GetStackTemplateResponse::setLocation));
        return builder.build();
    }

    public static final HttpRequestDef<ListStackEventsRequest, ListStackEventsResponse> listStackEvents =
        genForListStackEvents();

    private static HttpRequestDef<ListStackEventsRequest, ListStackEventsResponse> genForListStackEvents() {
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
            f -> f.withMarshaller(ListStackEventsRequest::getStackName, ListStackEventsRequest::setStackName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getStackId, ListStackEventsRequest::setStackId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getDeploymentId, ListStackEventsRequest::setDeploymentId));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getFilter, ListStackEventsRequest::setFilter));
        builder.<String>withRequestField("field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getField, ListStackEventsRequest::setField));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackEventsRequest::getClientRequestId,
                ListStackEventsRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackOutputsRequest, ListStackOutputsResponse> listStackOutputs =
        genForListStackOutputs();

    private static HttpRequestDef<ListStackOutputsRequest, ListStackOutputsResponse> genForListStackOutputs() {
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
            f -> f.withMarshaller(ListStackOutputsRequest::getStackName, ListStackOutputsRequest::setStackName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getStackId, ListStackOutputsRequest::setStackId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackOutputsRequest::getClientRequestId,
                ListStackOutputsRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackResourcesRequest, ListStackResourcesResponse> listStackResources =
        genForListStackResources();

    private static HttpRequestDef<ListStackResourcesRequest, ListStackResourcesResponse> genForListStackResources() {
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
            f -> f.withMarshaller(ListStackResourcesRequest::getStackName, ListStackResourcesRequest::setStackName));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getStackId, ListStackResourcesRequest::setStackId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackResourcesRequest::getClientRequestId,
                ListStackResourcesRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStacksRequest, ListStacksResponse> listStacks = genForListStacks();

    private static HttpRequestDef<ListStacksRequest, ListStacksResponse> genForListStacks() {
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
            f -> f.withMarshaller(ListStacksRequest::getClientRequestId, ListStacksRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStackRequest, UpdateStackResponse> updateStack = genForUpdateStack();

    private static HttpRequestDef<UpdateStackRequest, UpdateStackResponse> genForUpdateStack() {
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
            f -> f.withMarshaller(UpdateStackRequest::getStackName, UpdateStackRequest::setStackName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackRequest::getClientRequestId, UpdateStackRequest::setClientRequestId));
        builder.<UpdateStackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStackRequestBody.class),
            f -> f.withMarshaller(UpdateStackRequest::getBody, UpdateStackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStackInstanceRequest, CreateStackInstanceResponse> createStackInstance =
        genForCreateStackInstance();

    private static HttpRequestDef<CreateStackInstanceRequest, CreateStackInstanceResponse> genForCreateStackInstance() {
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
            f -> f.withMarshaller(CreateStackInstanceRequest::getStackSetName,
                CreateStackInstanceRequest::setStackSetName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStackInstanceRequest::getClientRequestId,
                CreateStackInstanceRequest::setClientRequestId));
        builder.<CreateStackInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackInstanceRequestBody.class),
            f -> f.withMarshaller(CreateStackInstanceRequest::getBody, CreateStackInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStackSetRequest, CreateStackSetResponse> createStackSet =
        genForCreateStackSet();

    private static HttpRequestDef<CreateStackSetRequest, CreateStackSetResponse> genForCreateStackSet() {
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
            f -> f.withMarshaller(CreateStackSetRequest::getClientRequestId,
                CreateStackSetRequest::setClientRequestId));
        builder.<CreateStackSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStackSetRequestBody.class),
            f -> f.withMarshaller(CreateStackSetRequest::getBody, CreateStackSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackInstanceRequest, DeleteStackInstanceResponse> deleteStackInstance =
        genForDeleteStackInstance();

    private static HttpRequestDef<DeleteStackInstanceRequest, DeleteStackInstanceResponse> genForDeleteStackInstance() {
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
            f -> f.withMarshaller(DeleteStackInstanceRequest::getStackSetName,
                DeleteStackInstanceRequest::setStackSetName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackInstanceRequest::getClientRequestId,
                DeleteStackInstanceRequest::setClientRequestId));
        builder.<DeleteStackInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStackInstanceRequestBody.class),
            f -> f.withMarshaller(DeleteStackInstanceRequest::getBody, DeleteStackInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackInstanceDeprecatedRequest, DeleteStackInstanceDeprecatedResponse> deleteStackInstanceDeprecated =
        genForDeleteStackInstanceDeprecated();

    private static HttpRequestDef<DeleteStackInstanceDeprecatedRequest, DeleteStackInstanceDeprecatedResponse> genForDeleteStackInstanceDeprecated() {
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
            f -> f.withMarshaller(DeleteStackInstanceDeprecatedRequest::getStackSetName,
                DeleteStackInstanceDeprecatedRequest::setStackSetName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackInstanceDeprecatedRequest::getClientRequestId,
                DeleteStackInstanceDeprecatedRequest::setClientRequestId));
        builder.<DeleteStackInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStackInstanceRequestBody.class),
            f -> f.withMarshaller(DeleteStackInstanceDeprecatedRequest::getBody,
                DeleteStackInstanceDeprecatedRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStackSetRequest, DeleteStackSetResponse> deleteStackSet =
        genForDeleteStackSet();

    private static HttpRequestDef<DeleteStackSetRequest, DeleteStackSetResponse> genForDeleteStackSet() {
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
            f -> f.withMarshaller(DeleteStackSetRequest::getStackSetName, DeleteStackSetRequest::setStackSetName));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackSetRequest::getStackSetId, DeleteStackSetRequest::setStackSetId));
        builder.<DeleteStackSetRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteStackSetRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(DeleteStackSetRequest::getCallIdentity, DeleteStackSetRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStackSetRequest::getClientRequestId,
                DeleteStackSetRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployStackSetRequest, DeployStackSetResponse> deployStackSet =
        genForDeployStackSet();

    private static HttpRequestDef<DeployStackSetRequest, DeployStackSetResponse> genForDeployStackSet() {
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
            f -> f.withMarshaller(DeployStackSetRequest::getStackSetName, DeployStackSetRequest::setStackSetName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployStackSetRequest::getClientRequestId,
                DeployStackSetRequest::setClientRequestId));
        builder.<DeployStackSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployStackSetRequestBody.class),
            f -> f.withMarshaller(DeployStackSetRequest::getBody, DeployStackSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackInstancesRequest, ListStackInstancesResponse> listStackInstances =
        genForListStackInstances();

    private static HttpRequestDef<ListStackInstancesRequest, ListStackInstancesResponse> genForListStackInstances() {
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
            f -> f.withMarshaller(ListStackInstancesRequest::getStackSetName,
                ListStackInstancesRequest::setStackSetName));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getStackSetId, ListStackInstancesRequest::setStackSetId));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getFilter, ListStackInstancesRequest::setFilter));
        builder.<List<ListStackInstancesRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getSortKey, ListStackInstancesRequest::setSortKey));
        builder.<List<ListStackInstancesRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getSortDir, ListStackInstancesRequest::setSortDir));
        builder.<ListStackInstancesRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStackInstancesRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getCallIdentity,
                ListStackInstancesRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackInstancesRequest::getClientRequestId,
                ListStackInstancesRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackSetOperationsRequest, ListStackSetOperationsResponse> listStackSetOperations =
        genForListStackSetOperations();

    private static HttpRequestDef<ListStackSetOperationsRequest, ListStackSetOperationsResponse> genForListStackSetOperations() {
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
            f -> f.withMarshaller(ListStackSetOperationsRequest::getStackSetName,
                ListStackSetOperationsRequest::setStackSetName));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getStackSetId,
                ListStackSetOperationsRequest::setStackSetId));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getFilter, ListStackSetOperationsRequest::setFilter));
        builder.<List<ListStackSetOperationsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getSortKey,
                ListStackSetOperationsRequest::setSortKey));
        builder.<List<ListStackSetOperationsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getSortDir,
                ListStackSetOperationsRequest::setSortDir));
        builder.<ListStackSetOperationsRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStackSetOperationsRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getCallIdentity,
                ListStackSetOperationsRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetOperationsRequest::getClientRequestId,
                ListStackSetOperationsRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStackSetsRequest, ListStackSetsResponse> listStackSets =
        genForListStackSets();

    private static HttpRequestDef<ListStackSetsRequest, ListStackSetsResponse> genForListStackSets() {
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
            f -> f.withMarshaller(ListStackSetsRequest::getFilter, ListStackSetsRequest::setFilter));
        builder.<List<ListStackSetsRequest.SortKeyEnum>>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetsRequest::getSortKey, ListStackSetsRequest::setSortKey));
        builder.<List<ListStackSetsRequest.SortDirEnum>>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStackSetsRequest::getSortDir, ListStackSetsRequest::setSortDir));
        builder.<ListStackSetsRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStackSetsRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(ListStackSetsRequest::getCallIdentity, ListStackSetsRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStackSetsRequest::getClientRequestId, ListStackSetsRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackInstanceRequest, ShowStackInstanceResponse> showStackInstance =
        genForShowStackInstance();

    private static HttpRequestDef<ShowStackInstanceRequest, ShowStackInstanceResponse> genForShowStackInstance() {
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
            f -> f.withMarshaller(ShowStackInstanceRequest::getStackSetName,
                ShowStackInstanceRequest::setStackSetName));
        builder.<String>withRequestField("stack_instance_addr",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getStackInstanceAddr,
                ShowStackInstanceRequest::setStackInstanceAddr));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getStackSetId, ShowStackInstanceRequest::setStackSetId));
        builder.<ShowStackInstanceRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowStackInstanceRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getCallIdentity,
                ShowStackInstanceRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackInstanceRequest::getClientRequestId,
                ShowStackInstanceRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackSetMetadataRequest, ShowStackSetMetadataResponse> showStackSetMetadata =
        genForShowStackSetMetadata();

    private static HttpRequestDef<ShowStackSetMetadataRequest, ShowStackSetMetadataResponse> genForShowStackSetMetadata() {
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
            f -> f.withMarshaller(ShowStackSetMetadataRequest::getStackSetName,
                ShowStackSetMetadataRequest::setStackSetName));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetMetadataRequest::getStackSetId,
                ShowStackSetMetadataRequest::setStackSetId));
        builder.<ShowStackSetMetadataRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowStackSetMetadataRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(ShowStackSetMetadataRequest::getCallIdentity,
                ShowStackSetMetadataRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetMetadataRequest::getClientRequestId,
                ShowStackSetMetadataRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackSetOperationMetadataRequest, ShowStackSetOperationMetadataResponse> showStackSetOperationMetadata =
        genForShowStackSetOperationMetadata();

    private static HttpRequestDef<ShowStackSetOperationMetadataRequest, ShowStackSetOperationMetadataResponse> genForShowStackSetOperationMetadata() {
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
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getStackSetName,
                ShowStackSetOperationMetadataRequest::setStackSetName));
        builder.<String>withRequestField("stack_set_operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getStackSetOperationId,
                ShowStackSetOperationMetadataRequest::setStackSetOperationId));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getStackSetId,
                ShowStackSetOperationMetadataRequest::setStackSetId));
        builder.<ShowStackSetOperationMetadataRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowStackSetOperationMetadataRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getCallIdentity,
                ShowStackSetOperationMetadataRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetOperationMetadataRequest::getClientRequestId,
                ShowStackSetOperationMetadataRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStackSetTemplateRequest, ShowStackSetTemplateResponse> showStackSetTemplate =
        genForShowStackSetTemplate();

    private static HttpRequestDef<ShowStackSetTemplateRequest, ShowStackSetTemplateResponse> genForShowStackSetTemplate() {
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
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getStackSetName,
                ShowStackSetTemplateRequest::setStackSetName));
        builder.<String>withRequestField("stack_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getStackSetId,
                ShowStackSetTemplateRequest::setStackSetId));
        builder.<List<String>>withRequestField("access_control_source_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getAccessControlSourceIps,
                ShowStackSetTemplateRequest::setAccessControlSourceIps));
        builder.<List<String>>withRequestField("access_control_source_vpc_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getAccessControlSourceVpcIds,
                ShowStackSetTemplateRequest::setAccessControlSourceVpcIds));
        builder.<ShowStackSetTemplateRequest.CallIdentityEnum>withRequestField("call_identity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowStackSetTemplateRequest.CallIdentityEnum.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getCallIdentity,
                ShowStackSetTemplateRequest::setCallIdentity));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStackSetTemplateRequest::getClientRequestId,
                ShowStackSetTemplateRequest::setClientRequestId));

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
        genForUpdateStackInstances();

    private static HttpRequestDef<UpdateStackInstancesRequest, UpdateStackInstancesResponse> genForUpdateStackInstances() {
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
            f -> f.withMarshaller(UpdateStackInstancesRequest::getStackSetName,
                UpdateStackInstancesRequest::setStackSetName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackInstancesRequest::getClientRequestId,
                UpdateStackInstancesRequest::setClientRequestId));
        builder.<UpdateStackInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStackInstancesRequestBody.class),
            f -> f.withMarshaller(UpdateStackInstancesRequest::getBody, UpdateStackInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStackSetRequest, UpdateStackSetResponse> updateStackSet =
        genForUpdateStackSet();

    private static HttpRequestDef<UpdateStackSetRequest, UpdateStackSetResponse> genForUpdateStackSet() {
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
            f -> f.withMarshaller(UpdateStackSetRequest::getStackSetName, UpdateStackSetRequest::setStackSetName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStackSetRequest::getClientRequestId,
                UpdateStackSetRequest::setClientRequestId));
        builder.<UpdateStackSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStackSetRequestBody.class),
            f -> f.withMarshaller(UpdateStackSetRequest::getBody, UpdateStackSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> parseTemplateVariables =
        genForParseTemplateVariables();

    private static HttpRequestDef<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> genForParseTemplateVariables() {
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
            f -> f.withMarshaller(ParseTemplateVariablesRequest::getClientRequestId,
                ParseTemplateVariablesRequest::setClientRequestId));
        builder.<ParseTemplateVariablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParseTemplateVariablesRequestBody.class),
            f -> f.withMarshaller(ParseTemplateVariablesRequest::getBody, ParseTemplateVariablesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
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
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateName, DeleteTemplateRequest::setTemplateName));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, DeleteTemplateRequest::setTemplateId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getClientRequestId,
                DeleteTemplateRequest::setClientRequestId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTemplateResponse::getBody, DeleteTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> deleteTemplateVersion =
        genForDeleteTemplateVersion();

    private static HttpRequestDef<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> genForDeleteTemplateVersion() {
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
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getTemplateName,
                DeleteTemplateVersionRequest::setTemplateName));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getVersionId,
                DeleteTemplateVersionRequest::setVersionId));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getTemplateId,
                DeleteTemplateVersionRequest::setTemplateId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateVersionRequest::getClientRequestId,
                DeleteTemplateVersionRequest::setClientRequestId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTemplateVersionResponse::getBody, DeleteTemplateVersionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateVersionsRequest, ListTemplateVersionsResponse> listTemplateVersions =
        genForListTemplateVersions();

    private static HttpRequestDef<ListTemplateVersionsRequest, ListTemplateVersionsResponse> genForListTemplateVersions() {
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
            f -> f.withMarshaller(ListTemplateVersionsRequest::getTemplateName,
                ListTemplateVersionsRequest::setTemplateName));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateVersionsRequest::getTemplateId,
                ListTemplateVersionsRequest::setTemplateId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateVersionsRequest::getClientRequestId,
                ListTemplateVersionsRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
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
            f -> f.withMarshaller(ListTemplatesRequest::getClientRequestId, ListTemplatesRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> showTemplateMetadata =
        genForShowTemplateMetadata();

    private static HttpRequestDef<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> genForShowTemplateMetadata() {
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
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getTemplateName,
                ShowTemplateMetadataRequest::setTemplateName));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getTemplateId,
                ShowTemplateMetadataRequest::setTemplateId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateMetadataRequest::getClientRequestId,
                ShowTemplateMetadataRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> showTemplateVersionContent =
        genForShowTemplateVersionContent();

    private static HttpRequestDef<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> genForShowTemplateVersionContent() {
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
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getTemplateName,
                ShowTemplateVersionContentRequest::setTemplateName));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getVersionId,
                ShowTemplateVersionContentRequest::setVersionId));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getTemplateId,
                ShowTemplateVersionContentRequest::setTemplateId));
        builder.<List<String>>withRequestField("access_control_source_vpc_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getAccessControlSourceVpcIds,
                ShowTemplateVersionContentRequest::setAccessControlSourceVpcIds));
        builder.<List<String>>withRequestField("access_control_source_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getAccessControlSourceIps,
                ShowTemplateVersionContentRequest::setAccessControlSourceIps));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionContentRequest::getClientRequestId,
                ShowTemplateVersionContentRequest::setClientRequestId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTemplateVersionContentResponse::getBody,
                ShowTemplateVersionContentResponse::setBody));

        builder.<String>withResponseField("Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTemplateVersionContentResponse::getLocation,
                ShowTemplateVersionContentResponse::setLocation));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> showTemplateVersionMetadata =
        genForShowTemplateVersionMetadata();

    private static HttpRequestDef<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> genForShowTemplateVersionMetadata() {
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
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getTemplateName,
                ShowTemplateVersionMetadataRequest::setTemplateName));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getVersionId,
                ShowTemplateVersionMetadataRequest::setVersionId));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getTemplateId,
                ShowTemplateVersionMetadataRequest::setTemplateId));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVersionMetadataRequest::getClientRequestId,
                ShowTemplateVersionMetadataRequest::setClientRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> updateTemplateMetadata =
        genForUpdateTemplateMetadata();

    private static HttpRequestDef<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> genForUpdateTemplateMetadata() {
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
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getTemplateName,
                UpdateTemplateMetadataRequest::setTemplateName));
        builder.<String>withRequestField("Client-Request-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getClientRequestId,
                UpdateTemplateMetadataRequest::setClientRequestId));
        builder.<UpdateTemplateMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTemplateMetadataRequestBody.class),
            f -> f.withMarshaller(UpdateTemplateMetadataRequest::getBody, UpdateTemplateMetadataRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTemplateMetadataResponse::getBody, UpdateTemplateMetadataResponse::setBody));

        return builder.build();
    }

}

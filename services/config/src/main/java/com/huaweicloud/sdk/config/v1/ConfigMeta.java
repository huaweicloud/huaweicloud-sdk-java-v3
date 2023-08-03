package com.huaweicloud.sdk.config.v1;

import com.huaweicloud.sdk.config.v1.model.AggregateComplianceDetailRequest;
import com.huaweicloud.sdk.config.v1.model.AggregateDiscoveredResourceCountsRequest;
import com.huaweicloud.sdk.config.v1.model.AggregateDiscoveredResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.AggregatePolicyAssignmentDetailRequest;
import com.huaweicloud.sdk.config.v1.model.AggregatePolicyAssignmentsRequest;
import com.huaweicloud.sdk.config.v1.model.AggregatePolicyStatesRequest;
import com.huaweicloud.sdk.config.v1.model.AggregateResourceConfigRequest;
import com.huaweicloud.sdk.config.v1.model.AggregationAuthorizationRequest;
import com.huaweicloud.sdk.config.v1.model.CollectAllResourcesSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectAllResourcesSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CollectConformancePackComplianceSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectConformancePackComplianceSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.ConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.ConformancePackRequestBody;
import com.huaweicloud.sdk.config.v1.model.CountAllResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.CountAllResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.CreateAggregationAuthorizationRequest;
import com.huaweicloud.sdk.config.v1.model.CreateAggregationAuthorizationResponse;
import com.huaweicloud.sdk.config.v1.model.CreateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.CreateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.CreateConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.CreateConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.CreateOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.CreateOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.CreatePolicyAssignmentsRequest;
import com.huaweicloud.sdk.config.v1.model.CreatePolicyAssignmentsResponse;
import com.huaweicloud.sdk.config.v1.model.CreateStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.CreateStoredQueryResponse;
import com.huaweicloud.sdk.config.v1.model.CreateTrackerConfigRequest;
import com.huaweicloud.sdk.config.v1.model.CreateTrackerConfigResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteAggregationAuthorizationRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteAggregationAuthorizationResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.DeletePendingAggregationRequestRequest;
import com.huaweicloud.sdk.config.v1.model.DeletePendingAggregationRequestResponse;
import com.huaweicloud.sdk.config.v1.model.DeletePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.DeletePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteStoredQueryResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteTrackerConfigRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteTrackerConfigResponse;
import com.huaweicloud.sdk.config.v1.model.DisablePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.DisablePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.EnablePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.EnablePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ListAggregateComplianceByPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ListAggregateComplianceByPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ListAggregateDiscoveredResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.ListAggregateDiscoveredResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.ListAggregationAuthorizationsRequest;
import com.huaweicloud.sdk.config.v1.model.ListAggregationAuthorizationsResponse;
import com.huaweicloud.sdk.config.v1.model.ListAllResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.ListAllResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.config.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInConformancePackTemplatesRequest;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInConformancePackTemplatesResponse;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInPolicyDefinitionsRequest;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInPolicyDefinitionsResponse;
import com.huaweicloud.sdk.config.v1.model.ListConfigurationAggregatorsRequest;
import com.huaweicloud.sdk.config.v1.model.ListConfigurationAggregatorsResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceByPackIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceByPackIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceDetailsByPackIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceDetailsByPackIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceScoresRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceScoresResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePacksRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePacksResponse;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationPolicyAssignmentsRequest;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationPolicyAssignmentsResponse;
import com.huaweicloud.sdk.config.v1.model.ListPendingAggregationRequestsRequest;
import com.huaweicloud.sdk.config.v1.model.ListPendingAggregationRequestsResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyAssignmentsRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyAssignmentsResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByAssignmentIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByAssignmentIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByDomainIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByDomainIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByResourceIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByResourceIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.config.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.config.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.config.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.config.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.ListSchemasRequest;
import com.huaweicloud.sdk.config.v1.model.ListSchemasResponse;
import com.huaweicloud.sdk.config.v1.model.ListStoredQueriesRequest;
import com.huaweicloud.sdk.config.v1.model.ListStoredQueriesResponse;
import com.huaweicloud.sdk.config.v1.model.OrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.PolicyAssignmentRequestBody;
import com.huaweicloud.sdk.config.v1.model.PolicyStateRequestBody;
import com.huaweicloud.sdk.config.v1.model.QueryRunRequestBody;
import com.huaweicloud.sdk.config.v1.model.ResourceSummaryResponseItem;
import com.huaweicloud.sdk.config.v1.model.RunAggregateResourceQueryRequest;
import com.huaweicloud.sdk.config.v1.model.RunAggregateResourceQueryResponse;
import com.huaweicloud.sdk.config.v1.model.RunEvaluationByPolicyAssignmentIdRequest;
import com.huaweicloud.sdk.config.v1.model.RunEvaluationByPolicyAssignmentIdResponse;
import com.huaweicloud.sdk.config.v1.model.RunQueryRequest;
import com.huaweicloud.sdk.config.v1.model.RunQueryResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateDiscoveredResourceCountsRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateDiscoveredResourceCountsResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyAssignmentDetailRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyAssignmentDetailResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyStateComplianceSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyStateComplianceSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateResourceConfigRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateResourceConfigResponse;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInConformancePackTemplateRequest;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInConformancePackTemplateResponse;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInPolicyDefinitionRequest;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInPolicyDefinitionResponse;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorSourcesStatusRequest;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorSourcesStatusResponse;
import com.huaweicloud.sdk.config.v1.model.ShowConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.ShowConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.ShowEvaluationStateByAssignmentIdRequest;
import com.huaweicloud.sdk.config.v1.model.ShowEvaluationStateByAssignmentIdResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentStatusesRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentStatusesResponse;
import com.huaweicloud.sdk.config.v1.model.ShowPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ShowPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceByIdRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceByIdResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceDetailRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceDetailResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceHistoryRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceHistoryResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsDetailRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsDetailResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsResponse;
import com.huaweicloud.sdk.config.v1.model.ShowStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.ShowStoredQueryResponse;
import com.huaweicloud.sdk.config.v1.model.ShowTrackerConfigRequest;
import com.huaweicloud.sdk.config.v1.model.ShowTrackerConfigResponse;
import com.huaweicloud.sdk.config.v1.model.StoredQueryRequestBody;
import com.huaweicloud.sdk.config.v1.model.TrackerConfigBody;
import com.huaweicloud.sdk.config.v1.model.UpdateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.UpdateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyStateRequest;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyStateResponse;
import com.huaweicloud.sdk.config.v1.model.UpdateStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.UpdateStoredQueryResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class ConfigMeta {

    public static final HttpRequestDef<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> createAggregationAuthorization =
        genForcreateAggregationAuthorization();

    private static HttpRequestDef<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> genForcreateAggregationAuthorization() {
        // basic
        HttpRequestDef.Builder<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateAggregationAuthorizationRequest.class,
                    CreateAggregationAuthorizationResponse.class)
                .withName("CreateAggregationAuthorization")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/aggregation-authorization")
                .withContentType("application/json");

        // requests
        builder.<AggregationAuthorizationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregationAuthorizationRequest.class),
            f -> f.withMarshaller(CreateAggregationAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> createConfigurationAggregator =
        genForcreateConfigurationAggregator();

    private static HttpRequestDef<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> genForcreateConfigurationAggregator() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateConfigurationAggregatorRequest.class,
                    CreateConfigurationAggregatorResponse.class)
                .withName("CreateConfigurationAggregator")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators")
                .withContentType("application/json");

        // requests
        builder.<ConfigurationAggregatorRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfigurationAggregatorRequest.class),
            f -> f.withMarshaller(CreateConfigurationAggregatorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> deleteAggregationAuthorization =
        genFordeleteAggregationAuthorization();

    private static HttpRequestDef<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> genFordeleteAggregationAuthorization() {
        // basic
        HttpRequestDef.Builder<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAggregationAuthorizationRequest.class,
                    DeleteAggregationAuthorizationResponse.class)
                .withName("DeleteAggregationAuthorization")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/aggregation-authorization/{authorized_account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorized_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAggregationAuthorizationRequest::getAuthorizedAccountId, (req, v) -> {
                req.setAuthorizedAccountId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> deleteConfigurationAggregator =
        genFordeleteConfigurationAggregator();

    private static HttpRequestDef<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> genFordeleteConfigurationAggregator() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteConfigurationAggregatorRequest.class,
                    DeleteConfigurationAggregatorResponse.class)
                .withName("DeleteConfigurationAggregator")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/{aggregator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("aggregator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationAggregatorRequest::getAggregatorId, (req, v) -> {
                req.setAggregatorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> deletePendingAggregationRequest =
        genFordeletePendingAggregationRequest();

    private static HttpRequestDef<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> genFordeletePendingAggregationRequest() {
        // basic
        HttpRequestDef.Builder<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeletePendingAggregationRequestRequest.class,
                    DeletePendingAggregationRequestResponse.class)
                .withName("DeletePendingAggregationRequest")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/pending-aggregation-request/{requester_account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("requester_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePendingAggregationRequestRequest::getRequesterAccountId, (req, v) -> {
                req.setRequesterAccountId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> listAggregateComplianceByPolicyAssignment =
        genForlistAggregateComplianceByPolicyAssignment();

    private static HttpRequestDef<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> genForlistAggregateComplianceByPolicyAssignment() {
        // basic
        HttpRequestDef.Builder<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAggregateComplianceByPolicyAssignmentRequest.class,
                    ListAggregateComplianceByPolicyAssignmentResponse.class)
                .withName("ListAggregateComplianceByPolicyAssignment")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/aggregate-data/policy-assignments/compliance")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregateComplianceByPolicyAssignmentRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregateComplianceByPolicyAssignmentRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<AggregatePolicyAssignmentsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregatePolicyAssignmentsRequest.class),
            f -> f.withMarshaller(ListAggregateComplianceByPolicyAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResources =
        genForlistAggregateDiscoveredResources();

    private static HttpRequestDef<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> genForlistAggregateDiscoveredResources() {
        // basic
        HttpRequestDef.Builder<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAggregateDiscoveredResourcesRequest.class,
                    ListAggregateDiscoveredResourcesResponse.class)
                .withName("ListAggregateDiscoveredResources")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/aggregate-data/aggregate-discovered-resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregateDiscoveredResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregateDiscoveredResourcesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<AggregateDiscoveredResourcesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregateDiscoveredResourcesRequest.class),
            f -> f.withMarshaller(ListAggregateDiscoveredResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> listAggregationAuthorizations =
        genForlistAggregationAuthorizations();

    private static HttpRequestDef<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> genForlistAggregationAuthorizations() {
        // basic
        HttpRequestDef.Builder<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAggregationAuthorizationsRequest.class,
                    ListAggregationAuthorizationsResponse.class)
                .withName("ListAggregationAuthorizations")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/aggregation-authorization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationAuthorizationsRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregationAuthorizationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationAuthorizationsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> listConfigurationAggregators =
        genForlistConfigurationAggregators();

    private static HttpRequestDef<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> genForlistConfigurationAggregators() {
        // basic
        HttpRequestDef.Builder<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationAggregatorsRequest.class,
                    ListConfigurationAggregatorsResponse.class)
                .withName("ListConfigurationAggregators")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("aggregator_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationAggregatorsRequest::getAggregatorName, (req, v) -> {
                req.setAggregatorName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationAggregatorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationAggregatorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> listPendingAggregationRequests =
        genForlistPendingAggregationRequests();

    private static HttpRequestDef<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> genForlistPendingAggregationRequests() {
        // basic
        HttpRequestDef.Builder<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPendingAggregationRequestsRequest.class,
                    ListPendingAggregationRequestsResponse.class)
                .withName("ListPendingAggregationRequests")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/pending-aggregation-request")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPendingAggregationRequestsRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPendingAggregationRequestsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPendingAggregationRequestsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> runAggregateResourceQuery =
        genForrunAggregateResourceQuery();

    private static HttpRequestDef<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> genForrunAggregateResourceQuery() {
        // basic
        HttpRequestDef.Builder<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunAggregateResourceQueryRequest.class,
                    RunAggregateResourceQueryResponse.class)
                .withName("RunAggregateResourceQuery")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/{aggregator_id}/run-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("aggregator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAggregateResourceQueryRequest::getAggregatorId, (req, v) -> {
                req.setAggregatorId(v);
            }));
        builder.<QueryRunRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryRunRequestBody.class),
            f -> f.withMarshaller(RunAggregateResourceQueryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> showAggregateComplianceDetailsByPolicyAssignment =
        genForshowAggregateComplianceDetailsByPolicyAssignment();

    private static HttpRequestDef<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> genForshowAggregateComplianceDetailsByPolicyAssignment() {
        // basic
        HttpRequestDef.Builder<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowAggregateComplianceDetailsByPolicyAssignmentRequest.class,
                    ShowAggregateComplianceDetailsByPolicyAssignmentResponse.class)
                .withName("ShowAggregateComplianceDetailsByPolicyAssignment")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/aggregate-data/policy-states/compliance-details")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAggregateComplianceDetailsByPolicyAssignmentRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAggregateComplianceDetailsByPolicyAssignmentRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<AggregateComplianceDetailRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregateComplianceDetailRequest.class),
            f -> f.withMarshaller(ShowAggregateComplianceDetailsByPolicyAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> showAggregateDiscoveredResourceCounts =
        genForshowAggregateDiscoveredResourceCounts();

    private static HttpRequestDef<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> genForshowAggregateDiscoveredResourceCounts() {
        // basic
        HttpRequestDef.Builder<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowAggregateDiscoveredResourceCountsRequest.class,
                    ShowAggregateDiscoveredResourceCountsResponse.class)
                .withName("ShowAggregateDiscoveredResourceCounts")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/aggregate-data/aggregate-discovered-resource-counts")
                .withContentType("application/json");

        // requests
        builder.<AggregateDiscoveredResourceCountsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregateDiscoveredResourceCountsRequest.class),
            f -> f.withMarshaller(ShowAggregateDiscoveredResourceCountsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> showAggregatePolicyAssignmentDetail =
        genForshowAggregatePolicyAssignmentDetail();

    private static HttpRequestDef<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> genForshowAggregatePolicyAssignmentDetail() {
        // basic
        HttpRequestDef.Builder<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowAggregatePolicyAssignmentDetailRequest.class,
                    ShowAggregatePolicyAssignmentDetailResponse.class)
                .withName("ShowAggregatePolicyAssignmentDetail")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/aggregate-data/policy-assignment/detail")
                .withContentType("application/json");

        // requests
        builder.<AggregatePolicyAssignmentDetailRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregatePolicyAssignmentDetailRequest.class),
            f -> f.withMarshaller(ShowAggregatePolicyAssignmentDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> showAggregatePolicyStateComplianceSummary =
        genForshowAggregatePolicyStateComplianceSummary();

    private static HttpRequestDef<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> genForshowAggregatePolicyStateComplianceSummary() {
        // basic
        HttpRequestDef.Builder<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowAggregatePolicyStateComplianceSummaryRequest.class,
                    ShowAggregatePolicyStateComplianceSummaryResponse.class)
                .withName("ShowAggregatePolicyStateComplianceSummary")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/aggregate-data/policy-states/compliance-summary")
                .withContentType("application/json");

        // requests
        builder.<AggregatePolicyStatesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregatePolicyStatesRequest.class),
            f -> f.withMarshaller(ShowAggregatePolicyStateComplianceSummaryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> showAggregateResourceConfig =
        genForshowAggregateResourceConfig();

    private static HttpRequestDef<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> genForshowAggregateResourceConfig() {
        // basic
        HttpRequestDef.Builder<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowAggregateResourceConfigRequest.class,
                    ShowAggregateResourceConfigResponse.class)
                .withName("ShowAggregateResourceConfig")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/aggregate-resource-config")
                .withContentType("application/json");

        // requests
        builder.<AggregateResourceConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregateResourceConfigRequest.class),
            f -> f.withMarshaller(ShowAggregateResourceConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> showConfigurationAggregator =
        genForshowConfigurationAggregator();

    private static HttpRequestDef<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> genForshowConfigurationAggregator() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConfigurationAggregatorRequest.class,
                    ShowConfigurationAggregatorResponse.class)
                .withName("ShowConfigurationAggregator")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/{aggregator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("aggregator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorRequest::getAggregatorId, (req, v) -> {
                req.setAggregatorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> showConfigurationAggregatorSourcesStatus =
        genForshowConfigurationAggregatorSourcesStatus();

    private static HttpRequestDef<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> genForshowConfigurationAggregatorSourcesStatus() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConfigurationAggregatorSourcesStatusRequest.class,
                    ShowConfigurationAggregatorSourcesStatusResponse.class)
                .withName("ShowConfigurationAggregatorSourcesStatus")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/aggregators/{aggregator_id}/aggregator-sources-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("aggregator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getAggregatorId, (req, v) -> {
                req.setAggregatorId(v);
            }));
        builder.<ShowConfigurationAggregatorSourcesStatusRequest.UpdateStatusEnum>withRequestField("update_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowConfigurationAggregatorSourcesStatusRequest.UpdateStatusEnum.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getUpdateStatus, (req, v) -> {
                req.setUpdateStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> updateConfigurationAggregator =
        genForupdateConfigurationAggregator();

    private static HttpRequestDef<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> genForupdateConfigurationAggregator() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateConfigurationAggregatorRequest.class,
                    UpdateConfigurationAggregatorResponse.class)
                .withName("UpdateConfigurationAggregator")
                .withUri("/v1/resource-manager/domains/{domain_id}/aggregators/{aggregator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("aggregator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationAggregatorRequest::getAggregatorId, (req, v) -> {
                req.setAggregatorId(v);
            }));
        builder.<ConfigurationAggregatorRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfigurationAggregatorRequest.class),
            f -> f.withMarshaller(UpdateConfigurationAggregatorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectConformancePackComplianceSummaryRequest, CollectConformancePackComplianceSummaryResponse> collectConformancePackComplianceSummary =
        genForcollectConformancePackComplianceSummary();

    private static HttpRequestDef<CollectConformancePackComplianceSummaryRequest, CollectConformancePackComplianceSummaryResponse> genForcollectConformancePackComplianceSummary() {
        // basic
        HttpRequestDef.Builder<CollectConformancePackComplianceSummaryRequest, CollectConformancePackComplianceSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CollectConformancePackComplianceSummaryRequest.class,
                    CollectConformancePackComplianceSummaryResponse.class)
                .withName("CollectConformancePackComplianceSummary")
                .withUri("/v1/resource-manager/domains/{domain_id}/conformance-packs/compliance/summary")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CollectConformancePackComplianceSummaryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectConformancePackComplianceSummaryRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("conformance_pack_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectConformancePackComplianceSummaryRequest::getConformancePackName, (req, v) -> {
                req.setConformancePackName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConformancePackRequest, CreateConformancePackResponse> createConformancePack =
        genForcreateConformancePack();

    private static HttpRequestDef<CreateConformancePackRequest, CreateConformancePackResponse> genForcreateConformancePack() {
        // basic
        HttpRequestDef.Builder<CreateConformancePackRequest, CreateConformancePackResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateConformancePackRequest.class, CreateConformancePackResponse.class)
            .withName("CreateConformancePack")
            .withUri("/v1/resource-manager/domains/{domain_id}/conformance-packs")
            .withContentType("application/json");

        // requests
        builder.<ConformancePackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConformancePackRequestBody.class),
            f -> f.withMarshaller(CreateConformancePackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConformancePackRequest, DeleteConformancePackResponse> deleteConformancePack =
        genFordeleteConformancePack();

    private static HttpRequestDef<DeleteConformancePackRequest, DeleteConformancePackResponse> genFordeleteConformancePack() {
        // basic
        HttpRequestDef.Builder<DeleteConformancePackRequest, DeleteConformancePackResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConformancePackRequest.class, DeleteConformancePackResponse.class)
            .withName("DeleteConformancePack")
            .withUri("/v1/resource-manager/domains/{domain_id}/conformance-packs/{conformance_pack_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conformance_pack_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConformancePackRequest::getConformancePackId, (req, v) -> {
                req.setConformancePackId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuiltInConformancePackTemplatesRequest, ListBuiltInConformancePackTemplatesResponse> listBuiltInConformancePackTemplates =
        genForlistBuiltInConformancePackTemplates();

    private static HttpRequestDef<ListBuiltInConformancePackTemplatesRequest, ListBuiltInConformancePackTemplatesResponse> genForlistBuiltInConformancePackTemplates() {
        // basic
        HttpRequestDef.Builder<ListBuiltInConformancePackTemplatesRequest, ListBuiltInConformancePackTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBuiltInConformancePackTemplatesRequest.class,
                    ListBuiltInConformancePackTemplatesResponse.class)
                .withName("ListBuiltInConformancePackTemplates")
                .withUri("/v1/resource-manager/conformance-packs/templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuiltInConformancePackTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuiltInConformancePackTemplatesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("template_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuiltInConformancePackTemplatesRequest::getTemplateKey, (req, v) -> {
                req.setTemplateKey(v);
            }));
        builder.<ListBuiltInConformancePackTemplatesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBuiltInConformancePackTemplatesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListBuiltInConformancePackTemplatesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConformancePackComplianceByPackIdRequest, ListConformancePackComplianceByPackIdResponse> listConformancePackComplianceByPackId =
        genForlistConformancePackComplianceByPackId();

    private static HttpRequestDef<ListConformancePackComplianceByPackIdRequest, ListConformancePackComplianceByPackIdResponse> genForlistConformancePackComplianceByPackId() {
        // basic
        HttpRequestDef.Builder<ListConformancePackComplianceByPackIdRequest, ListConformancePackComplianceByPackIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConformancePackComplianceByPackIdRequest.class,
                    ListConformancePackComplianceByPackIdResponse.class)
                .withName("ListConformancePackComplianceByPackId")
                .withUri("/v1/resource-manager/domains/{domain_id}/conformance-packs/{conformance_pack_id}/compliance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conformance_pack_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceByPackIdRequest::getConformancePackId, (req, v) -> {
                req.setConformancePackId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConformancePackComplianceByPackIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceByPackIdRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("policy_assignment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceByPackIdRequest::getPolicyAssignmentName, (req, v) -> {
                req.setPolicyAssignmentName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConformancePackComplianceDetailsByPackIdRequest, ListConformancePackComplianceDetailsByPackIdResponse> listConformancePackComplianceDetailsByPackId =
        genForlistConformancePackComplianceDetailsByPackId();

    private static HttpRequestDef<ListConformancePackComplianceDetailsByPackIdRequest, ListConformancePackComplianceDetailsByPackIdResponse> genForlistConformancePackComplianceDetailsByPackId() {
        // basic
        HttpRequestDef.Builder<ListConformancePackComplianceDetailsByPackIdRequest, ListConformancePackComplianceDetailsByPackIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConformancePackComplianceDetailsByPackIdRequest.class,
                    ListConformancePackComplianceDetailsByPackIdResponse.class)
                .withName("ListConformancePackComplianceDetailsByPackId")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/conformance-packs/{conformance_pack_id}/compliance/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conformance_pack_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceDetailsByPackIdRequest::getConformancePackId,
                (req, v) -> {
                    req.setConformancePackId(v);
                }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConformancePackComplianceDetailsByPackIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceDetailsByPackIdRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("policy_assignment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceDetailsByPackIdRequest::getPolicyAssignmentName,
                (req, v) -> {
                    req.setPolicyAssignmentName(v);
                }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConformancePackComplianceScoresRequest, ListConformancePackComplianceScoresResponse> listConformancePackComplianceScores =
        genForlistConformancePackComplianceScores();

    private static HttpRequestDef<ListConformancePackComplianceScoresRequest, ListConformancePackComplianceScoresResponse> genForlistConformancePackComplianceScores() {
        // basic
        HttpRequestDef.Builder<ListConformancePackComplianceScoresRequest, ListConformancePackComplianceScoresResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConformancePackComplianceScoresRequest.class,
                    ListConformancePackComplianceScoresResponse.class)
                .withName("ListConformancePackComplianceScores")
                .withUri("/v1/resource-manager/domains/{domain_id}/conformance-packs/scores")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConformancePackComplianceScoresRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceScoresRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("conformance_pack_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePackComplianceScoresRequest::getConformancePackName, (req, v) -> {
                req.setConformancePackName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConformancePacksRequest, ListConformancePacksResponse> listConformancePacks =
        genForlistConformancePacks();

    private static HttpRequestDef<ListConformancePacksRequest, ListConformancePacksResponse> genForlistConformancePacks() {
        // basic
        HttpRequestDef.Builder<ListConformancePacksRequest, ListConformancePacksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListConformancePacksRequest.class, ListConformancePacksResponse.class)
            .withName("ListConformancePacks")
            .withUri("/v1/resource-manager/domains/{domain_id}/conformance-packs")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConformancePacksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePacksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("conformance_pack_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConformancePacksRequest::getConformancePackName, (req, v) -> {
                req.setConformancePackName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuiltInConformancePackTemplateRequest, ShowBuiltInConformancePackTemplateResponse> showBuiltInConformancePackTemplate =
        genForshowBuiltInConformancePackTemplate();

    private static HttpRequestDef<ShowBuiltInConformancePackTemplateRequest, ShowBuiltInConformancePackTemplateResponse> genForshowBuiltInConformancePackTemplate() {
        // basic
        HttpRequestDef.Builder<ShowBuiltInConformancePackTemplateRequest, ShowBuiltInConformancePackTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBuiltInConformancePackTemplateRequest.class,
                    ShowBuiltInConformancePackTemplateResponse.class)
                .withName("ShowBuiltInConformancePackTemplate")
                .withUri("/v1/resource-manager/conformance-packs/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuiltInConformancePackTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<ShowBuiltInConformancePackTemplateRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowBuiltInConformancePackTemplateRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowBuiltInConformancePackTemplateRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConformancePackRequest, ShowConformancePackResponse> showConformancePack =
        genForshowConformancePack();

    private static HttpRequestDef<ShowConformancePackRequest, ShowConformancePackResponse> genForshowConformancePack() {
        // basic
        HttpRequestDef.Builder<ShowConformancePackRequest, ShowConformancePackResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConformancePackRequest.class, ShowConformancePackResponse.class)
                .withName("ShowConformancePack")
                .withUri("/v1/resource-manager/domains/{domain_id}/conformance-packs/{conformance_pack_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conformance_pack_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConformancePackRequest::getConformancePackId, (req, v) -> {
                req.setConformancePackId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceHistoryRequest, ShowResourceHistoryResponse> showResourceHistory =
        genForshowResourceHistory();

    private static HttpRequestDef<ShowResourceHistoryRequest, ShowResourceHistoryResponse> genForshowResourceHistory() {
        // basic
        HttpRequestDef.Builder<ShowResourceHistoryRequest, ShowResourceHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceHistoryRequest.class, ShowResourceHistoryResponse.class)
                .withName("ShowResourceHistory")
                .withUri("/v1/resource-manager/domains/{domain_id}/resources/{resource_id}/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("earlier_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getEarlierTime, (req, v) -> {
                req.setEarlierTime(v);
            }));
        builder.<Long>withRequestField("later_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getLaterTime, (req, v) -> {
                req.setLaterTime(v);
            }));
        builder.<ShowResourceHistoryRequest.ChronologicalOrderEnum>withRequestField("chronological_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowResourceHistoryRequest.ChronologicalOrderEnum.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getChronologicalOrder, (req, v) -> {
                req.setChronologicalOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> createOrganizationPolicyAssignment =
        genForcreateOrganizationPolicyAssignment();

    private static HttpRequestDef<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> genForcreateOrganizationPolicyAssignment() {
        // basic
        HttpRequestDef.Builder<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateOrganizationPolicyAssignmentRequest.class,
                    CreateOrganizationPolicyAssignmentResponse.class)
                .withName("CreateOrganizationPolicyAssignment")
                .withUri("/v1/resource-manager/organizations/{organization_id}/policy-assignments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrganizationPolicyAssignmentRequest::getOrganizationId, (req, v) -> {
                req.setOrganizationId(v);
            }));
        builder.<OrganizationPolicyAssignmentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OrganizationPolicyAssignmentRequest.class),
            f -> f.withMarshaller(CreateOrganizationPolicyAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> createPolicyAssignments =
        genForcreatePolicyAssignments();

    private static HttpRequestDef<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> genForcreatePolicyAssignments() {
        // basic
        HttpRequestDef.Builder<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, CreatePolicyAssignmentsRequest.class, CreatePolicyAssignmentsResponse.class)
            .withName("CreatePolicyAssignments")
            .withUri("/v1/resource-manager/domains/{domain_id}/policy-assignments")
            .withContentType("application/json");

        // requests
        builder.<PolicyAssignmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PolicyAssignmentRequestBody.class),
            f -> f.withMarshaller(CreatePolicyAssignmentsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> deleteOrganizationPolicyAssignment =
        genFordeleteOrganizationPolicyAssignment();

    private static HttpRequestDef<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> genFordeleteOrganizationPolicyAssignment() {
        // basic
        HttpRequestDef.Builder<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteOrganizationPolicyAssignmentRequest.class,
                    DeleteOrganizationPolicyAssignmentResponse.class)
                .withName("DeleteOrganizationPolicyAssignment")
                .withUri(
                    "/v1/resource-manager/organizations/{organization_id}/policy-assignments/{organization_policy_assignment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOrganizationPolicyAssignmentRequest::getOrganizationId, (req, v) -> {
                req.setOrganizationId(v);
            }));
        builder.<String>withRequestField("organization_policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOrganizationPolicyAssignmentRequest::getOrganizationPolicyAssignmentId,
                (req, v) -> {
                    req.setOrganizationPolicyAssignmentId(v);
                }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> deletePolicyAssignment =
        genFordeletePolicyAssignment();

    private static HttpRequestDef<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> genFordeletePolicyAssignment() {
        // basic
        HttpRequestDef.Builder<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePolicyAssignmentRequest.class, DeletePolicyAssignmentResponse.class)
            .withName("DeletePolicyAssignment")
            .withUri("/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyAssignmentRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> disablePolicyAssignment =
        genFordisablePolicyAssignment();

    private static HttpRequestDef<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> genFordisablePolicyAssignment() {
        // basic
        HttpRequestDef.Builder<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisablePolicyAssignmentRequest.class, DisablePolicyAssignmentResponse.class)
            .withName("DisablePolicyAssignment")
            .withUri("/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}/disable")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisablePolicyAssignmentRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> enablePolicyAssignment =
        genForenablePolicyAssignment();

    private static HttpRequestDef<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> genForenablePolicyAssignment() {
        // basic
        HttpRequestDef.Builder<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnablePolicyAssignmentRequest.class, EnablePolicyAssignmentResponse.class)
            .withName("EnablePolicyAssignment")
            .withUri("/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}/enable")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnablePolicyAssignmentRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitions =
        genForlistBuiltInPolicyDefinitions();

    private static HttpRequestDef<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> genForlistBuiltInPolicyDefinitions() {
        // basic
        HttpRequestDef.Builder<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBuiltInPolicyDefinitionsRequest.class,
                    ListBuiltInPolicyDefinitionsResponse.class)
                .withName("ListBuiltInPolicyDefinitions")
                .withUri("/v1/resource-manager/policy-definitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuiltInPolicyDefinitionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> listOrganizationPolicyAssignments =
        genForlistOrganizationPolicyAssignments();

    private static HttpRequestDef<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> genForlistOrganizationPolicyAssignments() {
        // basic
        HttpRequestDef.Builder<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOrganizationPolicyAssignmentsRequest.class,
                    ListOrganizationPolicyAssignmentsResponse.class)
                .withName("ListOrganizationPolicyAssignments")
                .withUri("/v1/resource-manager/organizations/{organization_id}/policy-assignments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getOrganizationId, (req, v) -> {
                req.setOrganizationId(v);
            }));
        builder.<String>withRequestField("organization_policy_assignment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getOrganizationPolicyAssignmentName,
                (req, v) -> {
                    req.setOrganizationPolicyAssignmentName(v);
                }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> listPolicyAssignments =
        genForlistPolicyAssignments();

    private static HttpRequestDef<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> genForlistPolicyAssignments() {
        // basic
        HttpRequestDef.Builder<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPolicyAssignmentsRequest.class, ListPolicyAssignmentsResponse.class)
            .withName("ListPolicyAssignments")
            .withUri("/v1/resource-manager/domains/{domain_id}/policy-assignments")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentId =
        genForlistPolicyStatesByAssignmentId();

    private static HttpRequestDef<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> genForlistPolicyStatesByAssignmentId() {
        // basic
        HttpRequestDef.Builder<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPolicyStatesByAssignmentIdRequest.class,
                    ListPolicyStatesByAssignmentIdResponse.class)
                .withName("ListPolicyStatesByAssignmentId")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}/policy-states")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));
        builder.<String>withRequestField("compliance_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getComplianceState, (req, v) -> {
                req.setComplianceState(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainId =
        genForlistPolicyStatesByDomainId();

    private static HttpRequestDef<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> genForlistPolicyStatesByDomainId() {
        // basic
        HttpRequestDef.Builder<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPolicyStatesByDomainIdRequest.class,
                    ListPolicyStatesByDomainIdResponse.class)
                .withName("ListPolicyStatesByDomainId")
                .withUri("/v1/resource-manager/domains/{domain_id}/policy-states")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("compliance_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getComplianceState, (req, v) -> {
                req.setComplianceState(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceId =
        genForlistPolicyStatesByResourceId();

    private static HttpRequestDef<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> genForlistPolicyStatesByResourceId() {
        // basic
        HttpRequestDef.Builder<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPolicyStatesByResourceIdRequest.class,
                    ListPolicyStatesByResourceIdResponse.class)
                .withName("ListPolicyStatesByResourceId")
                .withUri("/v1/resource-manager/domains/{domain_id}/resources/{resource_id}/policy-states")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("compliance_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getComplianceState, (req, v) -> {
                req.setComplianceState(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentId =
        genForrunEvaluationByPolicyAssignmentId();

    private static HttpRequestDef<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> genForrunEvaluationByPolicyAssignmentId() {
        // basic
        HttpRequestDef.Builder<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunEvaluationByPolicyAssignmentIdRequest.class,
                    RunEvaluationByPolicyAssignmentIdResponse.class)
                .withName("RunEvaluationByPolicyAssignmentId")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}/policy-states/run-evaluation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunEvaluationByPolicyAssignmentIdRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinition =
        genForshowBuiltInPolicyDefinition();

    private static HttpRequestDef<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> genForshowBuiltInPolicyDefinition() {
        // basic
        HttpRequestDef.Builder<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBuiltInPolicyDefinitionRequest.class,
                    ShowBuiltInPolicyDefinitionResponse.class)
                .withName("ShowBuiltInPolicyDefinition")
                .withUri("/v1/resource-manager/policy-definitions/{policy_definition_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_definition_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuiltInPolicyDefinitionRequest::getPolicyDefinitionId, (req, v) -> {
                req.setPolicyDefinitionId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuiltInPolicyDefinitionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentId =
        genForshowEvaluationStateByAssignmentId();

    private static HttpRequestDef<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> genForshowEvaluationStateByAssignmentId() {
        // basic
        HttpRequestDef.Builder<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEvaluationStateByAssignmentIdRequest.class,
                    ShowEvaluationStateByAssignmentIdResponse.class)
                .withName("ShowEvaluationStateByAssignmentId")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}/policy-states/evaluation-state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEvaluationStateByAssignmentIdRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> showOrganizationPolicyAssignment =
        genForshowOrganizationPolicyAssignment();

    private static HttpRequestDef<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> genForshowOrganizationPolicyAssignment() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowOrganizationPolicyAssignmentRequest.class,
                    ShowOrganizationPolicyAssignmentResponse.class)
                .withName("ShowOrganizationPolicyAssignment")
                .withUri(
                    "/v1/resource-manager/organizations/{organization_id}/policy-assignments/{organization_policy_assignment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentRequest::getOrganizationId, (req, v) -> {
                req.setOrganizationId(v);
            }));
        builder.<String>withRequestField("organization_policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentRequest::getOrganizationPolicyAssignmentId,
                (req, v) -> {
                    req.setOrganizationPolicyAssignmentId(v);
                }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> showOrganizationPolicyAssignmentDetailedStatus =
        genForshowOrganizationPolicyAssignmentDetailedStatus();

    private static HttpRequestDef<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> genForshowOrganizationPolicyAssignmentDetailedStatus() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowOrganizationPolicyAssignmentDetailedStatusRequest.class,
                    ShowOrganizationPolicyAssignmentDetailedStatusResponse.class)
                .withName("ShowOrganizationPolicyAssignmentDetailedStatus")
                .withUri("/v1/resource-manager/organizations/{organization_id}/policy-assignment-detailed-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentDetailedStatusRequest::getOrganizationId,
                (req, v) -> {
                    req.setOrganizationId(v);
                }));
        builder.<String>withRequestField("organization_policy_assignment_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(
                ShowOrganizationPolicyAssignmentDetailedStatusRequest::getOrganizationPolicyAssignmentName,
                (req, v) -> {
                    req.setOrganizationPolicyAssignmentName(v);
                }));
        builder.<ShowOrganizationPolicyAssignmentDetailedStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowOrganizationPolicyAssignmentDetailedStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentDetailedStatusRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentDetailedStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentDetailedStatusRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> showOrganizationPolicyAssignmentStatuses =
        genForshowOrganizationPolicyAssignmentStatuses();

    private static HttpRequestDef<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> genForshowOrganizationPolicyAssignmentStatuses() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowOrganizationPolicyAssignmentStatusesRequest.class,
                    ShowOrganizationPolicyAssignmentStatusesResponse.class)
                .withName("ShowOrganizationPolicyAssignmentStatuses")
                .withUri("/v1/resource-manager/organizations/{organization_id}/policy-assignment-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organization_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getOrganizationId, (req, v) -> {
                req.setOrganizationId(v);
            }));
        builder.<String>withRequestField("organization_policy_assignment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getOrganizationPolicyAssignmentName,
                (req, v) -> {
                    req.setOrganizationPolicyAssignmentName(v);
                }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> showPolicyAssignment =
        genForshowPolicyAssignment();

    private static HttpRequestDef<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> genForshowPolicyAssignment() {
        // basic
        HttpRequestDef.Builder<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPolicyAssignmentRequest.class, ShowPolicyAssignmentResponse.class)
            .withName("ShowPolicyAssignment")
            .withUri("/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyAssignmentRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> updatePolicyAssignment =
        genForupdatePolicyAssignment();

    private static HttpRequestDef<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> genForupdatePolicyAssignment() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyAssignmentRequest.class, UpdatePolicyAssignmentResponse.class)
            .withName("UpdatePolicyAssignment")
            .withUri("/v1/resource-manager/domains/{domain_id}/policy-assignments/{policy_assignment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyAssignmentRequest::getPolicyAssignmentId, (req, v) -> {
                req.setPolicyAssignmentId(v);
            }));
        builder.<PolicyAssignmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PolicyAssignmentRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyStateRequest, UpdatePolicyStateResponse> updatePolicyState =
        genForupdatePolicyState();

    private static HttpRequestDef<UpdatePolicyStateRequest, UpdatePolicyStateResponse> genForupdatePolicyState() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyStateRequest, UpdatePolicyStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyStateRequest.class, UpdatePolicyStateResponse.class)
                .withName("UpdatePolicyState")
                .withUri("/v1/resource-manager/domains/{domain_id}/policy-states")
                .withContentType("application/json");

        // requests
        builder.<PolicyStateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PolicyStateRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStoredQueryRequest, CreateStoredQueryResponse> createStoredQuery =
        genForcreateStoredQuery();

    private static HttpRequestDef<CreateStoredQueryRequest, CreateStoredQueryResponse> genForcreateStoredQuery() {
        // basic
        HttpRequestDef.Builder<CreateStoredQueryRequest, CreateStoredQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStoredQueryRequest.class, CreateStoredQueryResponse.class)
                .withName("CreateStoredQuery")
                .withUri("/v1/resource-manager/domains/{domain_id}/stored-queries")
                .withContentType("application/json");

        // requests
        builder.<StoredQueryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StoredQueryRequestBody.class),
            f -> f.withMarshaller(CreateStoredQueryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStoredQueryRequest, DeleteStoredQueryResponse> deleteStoredQuery =
        genFordeleteStoredQuery();

    private static HttpRequestDef<DeleteStoredQueryRequest, DeleteStoredQueryResponse> genFordeleteStoredQuery() {
        // basic
        HttpRequestDef.Builder<DeleteStoredQueryRequest, DeleteStoredQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStoredQueryRequest.class, DeleteStoredQueryResponse.class)
                .withName("DeleteStoredQuery")
                .withUri("/v1/resource-manager/domains/{domain_id}/stored-queries/{query_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStoredQueryRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSchemasRequest, ListSchemasResponse> listSchemas = genForlistSchemas();

    private static HttpRequestDef<ListSchemasRequest, ListSchemasResponse> genForlistSchemas() {
        // basic
        HttpRequestDef.Builder<ListSchemasRequest, ListSchemasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSchemasRequest.class, ListSchemasResponse.class)
                .withName("ListSchemas")
                .withUri("/v1/resource-manager/domains/{domain_id}/schemas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSchemasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoredQueriesRequest, ListStoredQueriesResponse> listStoredQueries =
        genForlistStoredQueries();

    private static HttpRequestDef<ListStoredQueriesRequest, ListStoredQueriesResponse> genForlistStoredQueries() {
        // basic
        HttpRequestDef.Builder<ListStoredQueriesRequest, ListStoredQueriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStoredQueriesRequest.class, ListStoredQueriesResponse.class)
                .withName("ListStoredQueries")
                .withUri("/v1/resource-manager/domains/{domain_id}/stored-queries")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoredQueriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoredQueriesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoredQueriesRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueryRequest, RunQueryResponse> runQuery = genForrunQuery();

    private static HttpRequestDef<RunQueryRequest, RunQueryResponse> genForrunQuery() {
        // basic
        HttpRequestDef.Builder<RunQueryRequest, RunQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunQueryRequest.class, RunQueryResponse.class)
                .withName("RunQuery")
                .withUri("/v1/resource-manager/domains/{domain_id}/run-query")
                .withContentType("application/json");

        // requests
        builder.<QueryRunRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryRunRequestBody.class),
            f -> f.withMarshaller(RunQueryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStoredQueryRequest, ShowStoredQueryResponse> showStoredQuery =
        genForshowStoredQuery();

    private static HttpRequestDef<ShowStoredQueryRequest, ShowStoredQueryResponse> genForshowStoredQuery() {
        // basic
        HttpRequestDef.Builder<ShowStoredQueryRequest, ShowStoredQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStoredQueryRequest.class, ShowStoredQueryResponse.class)
                .withName("ShowStoredQuery")
                .withUri("/v1/resource-manager/domains/{domain_id}/stored-queries/{query_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStoredQueryRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStoredQueryRequest, UpdateStoredQueryResponse> updateStoredQuery =
        genForupdateStoredQuery();

    private static HttpRequestDef<UpdateStoredQueryRequest, UpdateStoredQueryResponse> genForupdateStoredQuery() {
        // basic
        HttpRequestDef.Builder<UpdateStoredQueryRequest, UpdateStoredQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStoredQueryRequest.class, UpdateStoredQueryResponse.class)
                .withName("UpdateStoredQuery")
                .withUri("/v1/resource-manager/domains/{domain_id}/stored-queries/{query_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStoredQueryRequest::getQueryId, (req, v) -> {
                req.setQueryId(v);
            }));
        builder.<StoredQueryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StoredQueryRequestBody.class),
            f -> f.withMarshaller(UpdateStoredQueryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForlistRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForlistRegions() {
        // basic
        HttpRequestDef.Builder<ListRegionsRequest, ListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRegionsRequest.class, ListRegionsResponse.class)
                .withName("ListRegions")
                .withUri("/v1/resource-manager/domains/{domain_id}/regions")
                .withContentType("application/json");

        // requests
        builder.<ListRegionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRegionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListRegionsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelations =
        genForshowResourceRelations();

    private static HttpRequestDef<ShowResourceRelationsRequest, ShowResourceRelationsResponse> genForshowResourceRelations() {
        // basic
        HttpRequestDef.Builder<ShowResourceRelationsRequest, ShowResourceRelationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourceRelationsRequest.class, ShowResourceRelationsResponse.class)
            .withName("ShowResourceRelations")
            .withUri("/v1/resource-manager/domains/{domain_id}/resources/{resource_id}/relations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<ShowResourceRelationsRequest.DirectionEnum>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceRelationsRequest.DirectionEnum.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> showResourceRelationsDetail =
        genForshowResourceRelationsDetail();

    private static HttpRequestDef<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> genForshowResourceRelationsDetail() {
        // basic
        HttpRequestDef.Builder<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowResourceRelationsDetailRequest.class,
                    ShowResourceRelationsDetailResponse.class)
                .withName("ShowResourceRelationsDetail")
                .withUri("/v1/resource-manager/domains/{domain_id}/all-resources/{resource_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<ShowResourceRelationsDetailRequest.DirectionEnum>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceRelationsDetailRequest.DirectionEnum.class),
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummary =
        genForcollectAllResourcesSummary();

    private static HttpRequestDef<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> genForcollectAllResourcesSummary() {
        // basic
        HttpRequestDef.Builder<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CollectAllResourcesSummaryRequest.class,
                    CollectAllResourcesSummaryResponse.class)
                .withName("CollectAllResourcesSummary")
                .withUri("/v1/resource-manager/domains/{domain_id}/all-resources/summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<List<String>>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getEpId, (req, v) -> {
                req.setEpId(v);
            }));
        builder.<List<String>>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response
        builder.<List<ResourceSummaryResponseItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ResourceSummaryResponseItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<CountAllResourcesRequest, CountAllResourcesResponse> countAllResources =
        genForcountAllResources();

    private static HttpRequestDef<CountAllResourcesRequest, CountAllResourcesResponse> genForcountAllResources() {
        // basic
        HttpRequestDef.Builder<CountAllResourcesRequest, CountAllResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountAllResourcesRequest.class, CountAllResourcesResponse.class)
                .withName("CountAllResources")
                .withUri("/v1/resource-manager/domains/{domain_id}/all-resources/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<List<String>>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getEpId, (req, v) -> {
                req.setEpId(v);
            }));
        builder.<List<String>>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllResourcesRequest, ListAllResourcesResponse> listAllResources =
        genForlistAllResources();

    private static HttpRequestDef<ListAllResourcesRequest, ListAllResourcesResponse> genForlistAllResources() {
        // basic
        HttpRequestDef.Builder<ListAllResourcesRequest, ListAllResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllResourcesRequest.class, ListAllResourcesResponse.class)
                .withName("ListAllResources")
                .withUri("/v1/resource-manager/domains/{domain_id}/all-resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getEpId, (req, v) -> {
                req.setEpId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> listAllTags = genForlistAllTags();

    private static HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> genForlistAllTags() {
        // basic
        HttpRequestDef.Builder<ListAllTagsRequest, ListAllTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllTagsRequest.class, ListAllTagsResponse.class)
                .withName("ListAllTags")
                .withUri("/v1/resource-manager/domains/{domain_id}/all-resources/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTagsRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTagsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProvidersRequest, ListProvidersResponse> listProviders =
        genForlistProviders();

    private static HttpRequestDef<ListProvidersRequest, ListProvidersResponse> genForlistProviders() {
        // basic
        HttpRequestDef.Builder<ListProvidersRequest, ListProvidersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProvidersRequest.class, ListProvidersResponse.class)
                .withName("ListProviders")
                .withUri("/v1/resource-manager/domains/{domain_id}/providers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvidersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvidersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListProvidersRequest.TrackEnum>withRequestField("track",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProvidersRequest.TrackEnum.class),
            f -> f.withMarshaller(ListProvidersRequest::getTrack, (req, v) -> {
                req.setTrack(v);
            }));
        builder.<ListProvidersRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProvidersRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListProvidersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
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
                .withUri("/v1/resource-manager/domains/{domain_id}/provider/{provider}/type/{type}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getEpId, (req, v) -> {
                req.setEpId(v);
            }));
        builder.<Map<String, List<String>>>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ListResourcesRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceById =
        genForshowResourceById();

    private static HttpRequestDef<ShowResourceByIdRequest, ShowResourceByIdResponse> genForshowResourceById() {
        // basic
        HttpRequestDef.Builder<ShowResourceByIdRequest, ShowResourceByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceByIdRequest.class, ShowResourceByIdResponse.class)
                .withName("ShowResourceById")
                .withUri(
                    "/v1/resource-manager/domains/{domain_id}/provider/{provider}/type/{type}/resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetail =
        genForshowResourceDetail();

    private static HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> genForshowResourceDetail() {
        // basic
        HttpRequestDef.Builder<ShowResourceDetailRequest, ShowResourceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceDetailRequest.class, ShowResourceDetailResponse.class)
                .withName("ShowResourceDetail")
                .withUri("/v1/resource-manager/domains/{domain_id}/all-resources/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceDetailRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrackerConfigRequest, CreateTrackerConfigResponse> createTrackerConfig =
        genForcreateTrackerConfig();

    private static HttpRequestDef<CreateTrackerConfigRequest, CreateTrackerConfigResponse> genForcreateTrackerConfig() {
        // basic
        HttpRequestDef.Builder<CreateTrackerConfigRequest, CreateTrackerConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateTrackerConfigRequest.class, CreateTrackerConfigResponse.class)
                .withName("CreateTrackerConfig")
                .withUri("/v1/resource-manager/domains/{domain_id}/tracker-config")
                .withContentType("application/json");

        // requests
        builder.<TrackerConfigBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TrackerConfigBody.class),
            f -> f.withMarshaller(CreateTrackerConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> deleteTrackerConfig =
        genFordeleteTrackerConfig();

    private static HttpRequestDef<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> genFordeleteTrackerConfig() {
        // basic
        HttpRequestDef.Builder<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTrackerConfigRequest.class, DeleteTrackerConfigResponse.class)
            .withName("DeleteTrackerConfig")
            .withUri("/v1/resource-manager/domains/{domain_id}/tracker-config")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrackerConfigRequest, ShowTrackerConfigResponse> showTrackerConfig =
        genForshowTrackerConfig();

    private static HttpRequestDef<ShowTrackerConfigRequest, ShowTrackerConfigResponse> genForshowTrackerConfig() {
        // basic
        HttpRequestDef.Builder<ShowTrackerConfigRequest, ShowTrackerConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTrackerConfigRequest.class, ShowTrackerConfigResponse.class)
                .withName("ShowTrackerConfig")
                .withUri("/v1/resource-manager/domains/{domain_id}/tracker-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.rms.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rms.v1.model.AggregateComplianceDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.AggregateDiscoveredResourceCountsRequest;
import com.huaweicloud.sdk.rms.v1.model.AggregateDiscoveredResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.AggregatePolicyAssignmentDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.AggregatePolicyAssignmentsRequest;
import com.huaweicloud.sdk.rms.v1.model.AggregatePolicyStatesRequest;
import com.huaweicloud.sdk.rms.v1.model.AggregateResourceConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.AggregationAuthorizationRequest;
import com.huaweicloud.sdk.rms.v1.model.CollectAllResourcesSummaryRequest;
import com.huaweicloud.sdk.rms.v1.model.CollectAllResourcesSummaryResponse;
import com.huaweicloud.sdk.rms.v1.model.ConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.CountAllResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.CountAllResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateAggregationAuthorizationRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateAggregationAuthorizationResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.CreatePolicyAssignmentsRequest;
import com.huaweicloud.sdk.rms.v1.model.CreatePolicyAssignmentsResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateStoredQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateTrackerConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateTrackerConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteAggregationAuthorizationRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteAggregationAuthorizationResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.DeletePendingAggregationRequestRequest;
import com.huaweicloud.sdk.rms.v1.model.DeletePendingAggregationRequestResponse;
import com.huaweicloud.sdk.rms.v1.model.DeletePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.DeletePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteStoredQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteTrackerConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteTrackerConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.DisablePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.DisablePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.EnablePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.EnablePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateComplianceByPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateComplianceByPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateDiscoveredResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateDiscoveredResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAggregationAuthorizationsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAggregationAuthorizationsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAllResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAllResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListBuiltInPolicyDefinitionsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListBuiltInPolicyDefinitionsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListConfigurationAggregatorsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListConfigurationAggregatorsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListOrganizationPolicyAssignmentsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListOrganizationPolicyAssignmentsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPendingAggregationRequestsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPendingAggregationRequestsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyAssignmentsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyAssignmentsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByAssignmentIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByAssignmentIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByDomainIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByDomainIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByResourceIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByResourceIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.rms.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.rms.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.ListSchemasRequest;
import com.huaweicloud.sdk.rms.v1.model.ListSchemasResponse;
import com.huaweicloud.sdk.rms.v1.model.ListStoredQueriesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListStoredQueriesResponse;
import com.huaweicloud.sdk.rms.v1.model.OrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.PolicyAssignmentRequestBody;
import com.huaweicloud.sdk.rms.v1.model.PolicyStateRequestBody;
import com.huaweicloud.sdk.rms.v1.model.QueryRunRequestBody;
import com.huaweicloud.sdk.rms.v1.model.ResourceSummaryResponseItem;
import com.huaweicloud.sdk.rms.v1.model.RunAggregateResourceQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.RunAggregateResourceQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.RunEvaluationByPolicyAssignmentIdRequest;
import com.huaweicloud.sdk.rms.v1.model.RunEvaluationByPolicyAssignmentIdResponse;
import com.huaweicloud.sdk.rms.v1.model.RunQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.RunQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateDiscoveredResourceCountsRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateDiscoveredResourceCountsResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyAssignmentDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyAssignmentDetailResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyStateComplianceSummaryRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyStateComplianceSummaryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateResourceConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateResourceConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowBuiltInPolicyDefinitionRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowBuiltInPolicyDefinitionResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorSourcesStatusRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorSourcesStatusResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowEvaluationStateByAssignmentIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowEvaluationStateByAssignmentIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentStatusesRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentStatusesResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceByIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceByIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceDetailResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceHistoryRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceHistoryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsDetailResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowStoredQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowTrackerConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowTrackerConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.StoredQueryRequestBody;
import com.huaweicloud.sdk.rms.v1.model.TrackerConfigBody;
import com.huaweicloud.sdk.rms.v1.model.UpdateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyStateRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyStateResponse;
import com.huaweicloud.sdk.rms.v1.model.UpdateStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdateStoredQueryResponse;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class RmsMeta {

    public static final HttpRequestDef<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> createAggregationAuthorization =
        genForCreateAggregationAuthorization();

    private static HttpRequestDef<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> genForCreateAggregationAuthorization() {
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
            f -> f.withMarshaller(CreateAggregationAuthorizationRequest::getBody,
                CreateAggregationAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> createConfigurationAggregator =
        genForCreateConfigurationAggregator();

    private static HttpRequestDef<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> genForCreateConfigurationAggregator() {
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
            f -> f.withMarshaller(CreateConfigurationAggregatorRequest::getBody,
                CreateConfigurationAggregatorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> deleteAggregationAuthorization =
        genForDeleteAggregationAuthorization();

    private static HttpRequestDef<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> genForDeleteAggregationAuthorization() {
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
            f -> f.withMarshaller(DeleteAggregationAuthorizationRequest::getAuthorizedAccountId,
                DeleteAggregationAuthorizationRequest::setAuthorizedAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> deleteConfigurationAggregator =
        genForDeleteConfigurationAggregator();

    private static HttpRequestDef<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> genForDeleteConfigurationAggregator() {
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
            f -> f.withMarshaller(DeleteConfigurationAggregatorRequest::getAggregatorId,
                DeleteConfigurationAggregatorRequest::setAggregatorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> deletePendingAggregationRequest =
        genForDeletePendingAggregationRequest();

    private static HttpRequestDef<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> genForDeletePendingAggregationRequest() {
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
            f -> f.withMarshaller(DeletePendingAggregationRequestRequest::getRequesterAccountId,
                DeletePendingAggregationRequestRequest::setRequesterAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> listAggregateComplianceByPolicyAssignment =
        genForListAggregateComplianceByPolicyAssignment();

    private static HttpRequestDef<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> genForListAggregateComplianceByPolicyAssignment() {
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
            f -> f.withMarshaller(ListAggregateComplianceByPolicyAssignmentRequest::getLimit,
                ListAggregateComplianceByPolicyAssignmentRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregateComplianceByPolicyAssignmentRequest::getMarker,
                ListAggregateComplianceByPolicyAssignmentRequest::setMarker));
        builder.<AggregatePolicyAssignmentsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregatePolicyAssignmentsRequest.class),
            f -> f.withMarshaller(ListAggregateComplianceByPolicyAssignmentRequest::getBody,
                ListAggregateComplianceByPolicyAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResources =
        genForListAggregateDiscoveredResources();

    private static HttpRequestDef<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> genForListAggregateDiscoveredResources() {
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
            f -> f.withMarshaller(ListAggregateDiscoveredResourcesRequest::getLimit,
                ListAggregateDiscoveredResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregateDiscoveredResourcesRequest::getMarker,
                ListAggregateDiscoveredResourcesRequest::setMarker));
        builder.<AggregateDiscoveredResourcesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregateDiscoveredResourcesRequest.class),
            f -> f.withMarshaller(ListAggregateDiscoveredResourcesRequest::getBody,
                ListAggregateDiscoveredResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> listAggregationAuthorizations =
        genForListAggregationAuthorizations();

    private static HttpRequestDef<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> genForListAggregationAuthorizations() {
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
            f -> f.withMarshaller(ListAggregationAuthorizationsRequest::getAccountId,
                ListAggregationAuthorizationsRequest::setAccountId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAggregationAuthorizationsRequest::getLimit,
                ListAggregationAuthorizationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAggregationAuthorizationsRequest::getMarker,
                ListAggregationAuthorizationsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> listConfigurationAggregators =
        genForListConfigurationAggregators();

    private static HttpRequestDef<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> genForListConfigurationAggregators() {
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
            f -> f.withMarshaller(ListConfigurationAggregatorsRequest::getAggregatorName,
                ListConfigurationAggregatorsRequest::setAggregatorName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationAggregatorsRequest::getLimit,
                ListConfigurationAggregatorsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationAggregatorsRequest::getMarker,
                ListConfigurationAggregatorsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> listPendingAggregationRequests =
        genForListPendingAggregationRequests();

    private static HttpRequestDef<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> genForListPendingAggregationRequests() {
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
            f -> f.withMarshaller(ListPendingAggregationRequestsRequest::getAccountId,
                ListPendingAggregationRequestsRequest::setAccountId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPendingAggregationRequestsRequest::getLimit,
                ListPendingAggregationRequestsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPendingAggregationRequestsRequest::getMarker,
                ListPendingAggregationRequestsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> runAggregateResourceQuery =
        genForRunAggregateResourceQuery();

    private static HttpRequestDef<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> genForRunAggregateResourceQuery() {
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
            f -> f.withMarshaller(RunAggregateResourceQueryRequest::getAggregatorId,
                RunAggregateResourceQueryRequest::setAggregatorId));
        builder.<QueryRunRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryRunRequestBody.class),
            f -> f.withMarshaller(RunAggregateResourceQueryRequest::getBody,
                RunAggregateResourceQueryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> showAggregateComplianceDetailsByPolicyAssignment =
        genForShowAggregateComplianceDetailsByPolicyAssignment();

    private static HttpRequestDef<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> genForShowAggregateComplianceDetailsByPolicyAssignment() {
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
            f -> f.withMarshaller(ShowAggregateComplianceDetailsByPolicyAssignmentRequest::getLimit,
                ShowAggregateComplianceDetailsByPolicyAssignmentRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAggregateComplianceDetailsByPolicyAssignmentRequest::getMarker,
                ShowAggregateComplianceDetailsByPolicyAssignmentRequest::setMarker));
        builder.<AggregateComplianceDetailRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AggregateComplianceDetailRequest.class),
            f -> f.withMarshaller(ShowAggregateComplianceDetailsByPolicyAssignmentRequest::getBody,
                ShowAggregateComplianceDetailsByPolicyAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> showAggregateDiscoveredResourceCounts =
        genForShowAggregateDiscoveredResourceCounts();

    private static HttpRequestDef<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> genForShowAggregateDiscoveredResourceCounts() {
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
            f -> f.withMarshaller(ShowAggregateDiscoveredResourceCountsRequest::getBody,
                ShowAggregateDiscoveredResourceCountsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> showAggregatePolicyAssignmentDetail =
        genForShowAggregatePolicyAssignmentDetail();

    private static HttpRequestDef<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> genForShowAggregatePolicyAssignmentDetail() {
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
            f -> f.withMarshaller(ShowAggregatePolicyAssignmentDetailRequest::getBody,
                ShowAggregatePolicyAssignmentDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> showAggregatePolicyStateComplianceSummary =
        genForShowAggregatePolicyStateComplianceSummary();

    private static HttpRequestDef<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> genForShowAggregatePolicyStateComplianceSummary() {
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
            f -> f.withMarshaller(ShowAggregatePolicyStateComplianceSummaryRequest::getBody,
                ShowAggregatePolicyStateComplianceSummaryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> showAggregateResourceConfig =
        genForShowAggregateResourceConfig();

    private static HttpRequestDef<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> genForShowAggregateResourceConfig() {
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
            f -> f.withMarshaller(ShowAggregateResourceConfigRequest::getBody,
                ShowAggregateResourceConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> showConfigurationAggregator =
        genForShowConfigurationAggregator();

    private static HttpRequestDef<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> genForShowConfigurationAggregator() {
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
            f -> f.withMarshaller(ShowConfigurationAggregatorRequest::getAggregatorId,
                ShowConfigurationAggregatorRequest::setAggregatorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> showConfigurationAggregatorSourcesStatus =
        genForShowConfigurationAggregatorSourcesStatus();

    private static HttpRequestDef<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> genForShowConfigurationAggregatorSourcesStatus() {
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
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getAggregatorId,
                ShowConfigurationAggregatorSourcesStatusRequest::setAggregatorId));
        builder.<ShowConfigurationAggregatorSourcesStatusRequest.UpdateStatusEnum>withRequestField("update_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowConfigurationAggregatorSourcesStatusRequest.UpdateStatusEnum.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getUpdateStatus,
                ShowConfigurationAggregatorSourcesStatusRequest::setUpdateStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getLimit,
                ShowConfigurationAggregatorSourcesStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationAggregatorSourcesStatusRequest::getMarker,
                ShowConfigurationAggregatorSourcesStatusRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> updateConfigurationAggregator =
        genForUpdateConfigurationAggregator();

    private static HttpRequestDef<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> genForUpdateConfigurationAggregator() {
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
            f -> f.withMarshaller(UpdateConfigurationAggregatorRequest::getAggregatorId,
                UpdateConfigurationAggregatorRequest::setAggregatorId));
        builder.<ConfigurationAggregatorRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfigurationAggregatorRequest.class),
            f -> f.withMarshaller(UpdateConfigurationAggregatorRequest::getBody,
                UpdateConfigurationAggregatorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceHistoryRequest, ShowResourceHistoryResponse> showResourceHistory =
        genForShowResourceHistory();

    private static HttpRequestDef<ShowResourceHistoryRequest, ShowResourceHistoryResponse> genForShowResourceHistory() {
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
            f -> f.withMarshaller(ShowResourceHistoryRequest::getResourceId,
                ShowResourceHistoryRequest::setResourceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getMarker, ShowResourceHistoryRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getLimit, ShowResourceHistoryRequest::setLimit));
        builder.<Long>withRequestField("earlier_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getEarlierTime,
                ShowResourceHistoryRequest::setEarlierTime));
        builder.<Long>withRequestField("later_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getLaterTime, ShowResourceHistoryRequest::setLaterTime));
        builder.<ShowResourceHistoryRequest.ChronologicalOrderEnum>withRequestField("chronological_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowResourceHistoryRequest.ChronologicalOrderEnum.class),
            f -> f.withMarshaller(ShowResourceHistoryRequest::getChronologicalOrder,
                ShowResourceHistoryRequest::setChronologicalOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> createOrganizationPolicyAssignment =
        genForCreateOrganizationPolicyAssignment();

    private static HttpRequestDef<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> genForCreateOrganizationPolicyAssignment() {
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
            f -> f.withMarshaller(CreateOrganizationPolicyAssignmentRequest::getOrganizationId,
                CreateOrganizationPolicyAssignmentRequest::setOrganizationId));
        builder.<OrganizationPolicyAssignmentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OrganizationPolicyAssignmentRequest.class),
            f -> f.withMarshaller(CreateOrganizationPolicyAssignmentRequest::getBody,
                CreateOrganizationPolicyAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> createPolicyAssignments =
        genForCreatePolicyAssignments();

    private static HttpRequestDef<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> genForCreatePolicyAssignments() {
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
            f -> f.withMarshaller(CreatePolicyAssignmentsRequest::getBody, CreatePolicyAssignmentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> deleteOrganizationPolicyAssignment =
        genForDeleteOrganizationPolicyAssignment();

    private static HttpRequestDef<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> genForDeleteOrganizationPolicyAssignment() {
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
            f -> f.withMarshaller(DeleteOrganizationPolicyAssignmentRequest::getOrganizationId,
                DeleteOrganizationPolicyAssignmentRequest::setOrganizationId));
        builder.<String>withRequestField("organization_policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOrganizationPolicyAssignmentRequest::getOrganizationPolicyAssignmentId,
                DeleteOrganizationPolicyAssignmentRequest::setOrganizationPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> deletePolicyAssignment =
        genForDeletePolicyAssignment();

    private static HttpRequestDef<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> genForDeletePolicyAssignment() {
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
            f -> f.withMarshaller(DeletePolicyAssignmentRequest::getPolicyAssignmentId,
                DeletePolicyAssignmentRequest::setPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> disablePolicyAssignment =
        genForDisablePolicyAssignment();

    private static HttpRequestDef<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> genForDisablePolicyAssignment() {
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
            f -> f.withMarshaller(DisablePolicyAssignmentRequest::getPolicyAssignmentId,
                DisablePolicyAssignmentRequest::setPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> enablePolicyAssignment =
        genForEnablePolicyAssignment();

    private static HttpRequestDef<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> genForEnablePolicyAssignment() {
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
            f -> f.withMarshaller(EnablePolicyAssignmentRequest::getPolicyAssignmentId,
                EnablePolicyAssignmentRequest::setPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitions =
        genForListBuiltInPolicyDefinitions();

    private static HttpRequestDef<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> genForListBuiltInPolicyDefinitions() {
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
            f -> f.withMarshaller(ListBuiltInPolicyDefinitionsRequest::getXLanguage,
                ListBuiltInPolicyDefinitionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> listOrganizationPolicyAssignments =
        genForListOrganizationPolicyAssignments();

    private static HttpRequestDef<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> genForListOrganizationPolicyAssignments() {
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
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getOrganizationId,
                ListOrganizationPolicyAssignmentsRequest::setOrganizationId));
        builder.<String>withRequestField("organization_policy_assignment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getOrganizationPolicyAssignmentName,
                ListOrganizationPolicyAssignmentsRequest::setOrganizationPolicyAssignmentName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getLimit,
                ListOrganizationPolicyAssignmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationPolicyAssignmentsRequest::getMarker,
                ListOrganizationPolicyAssignmentsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> listPolicyAssignments =
        genForListPolicyAssignments();

    private static HttpRequestDef<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> genForListPolicyAssignments() {
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
        genForListPolicyStatesByAssignmentId();

    private static HttpRequestDef<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> genForListPolicyStatesByAssignmentId() {
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
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getPolicyAssignmentId,
                ListPolicyStatesByAssignmentIdRequest::setPolicyAssignmentId));
        builder.<String>withRequestField("compliance_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getComplianceState,
                ListPolicyStatesByAssignmentIdRequest::setComplianceState));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getResourceId,
                ListPolicyStatesByAssignmentIdRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getResourceName,
                ListPolicyStatesByAssignmentIdRequest::setResourceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getLimit,
                ListPolicyStatesByAssignmentIdRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByAssignmentIdRequest::getMarker,
                ListPolicyStatesByAssignmentIdRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainId =
        genForListPolicyStatesByDomainId();

    private static HttpRequestDef<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> genForListPolicyStatesByDomainId() {
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
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getComplianceState,
                ListPolicyStatesByDomainIdRequest::setComplianceState));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getResourceId,
                ListPolicyStatesByDomainIdRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getResourceName,
                ListPolicyStatesByDomainIdRequest::setResourceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getLimit,
                ListPolicyStatesByDomainIdRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByDomainIdRequest::getMarker,
                ListPolicyStatesByDomainIdRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceId =
        genForListPolicyStatesByResourceId();

    private static HttpRequestDef<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> genForListPolicyStatesByResourceId() {
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
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getResourceId,
                ListPolicyStatesByResourceIdRequest::setResourceId));
        builder.<String>withRequestField("compliance_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getComplianceState,
                ListPolicyStatesByResourceIdRequest::setComplianceState));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getLimit,
                ListPolicyStatesByResourceIdRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyStatesByResourceIdRequest::getMarker,
                ListPolicyStatesByResourceIdRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentId =
        genForRunEvaluationByPolicyAssignmentId();

    private static HttpRequestDef<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> genForRunEvaluationByPolicyAssignmentId() {
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
            f -> f.withMarshaller(RunEvaluationByPolicyAssignmentIdRequest::getPolicyAssignmentId,
                RunEvaluationByPolicyAssignmentIdRequest::setPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinition =
        genForShowBuiltInPolicyDefinition();

    private static HttpRequestDef<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> genForShowBuiltInPolicyDefinition() {
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
            f -> f.withMarshaller(ShowBuiltInPolicyDefinitionRequest::getPolicyDefinitionId,
                ShowBuiltInPolicyDefinitionRequest::setPolicyDefinitionId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuiltInPolicyDefinitionRequest::getXLanguage,
                ShowBuiltInPolicyDefinitionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentId =
        genForShowEvaluationStateByAssignmentId();

    private static HttpRequestDef<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> genForShowEvaluationStateByAssignmentId() {
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
            f -> f.withMarshaller(ShowEvaluationStateByAssignmentIdRequest::getPolicyAssignmentId,
                ShowEvaluationStateByAssignmentIdRequest::setPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> showOrganizationPolicyAssignment =
        genForShowOrganizationPolicyAssignment();

    private static HttpRequestDef<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> genForShowOrganizationPolicyAssignment() {
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
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentRequest::getOrganizationId,
                ShowOrganizationPolicyAssignmentRequest::setOrganizationId));
        builder.<String>withRequestField("organization_policy_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentRequest::getOrganizationPolicyAssignmentId,
                ShowOrganizationPolicyAssignmentRequest::setOrganizationPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> showOrganizationPolicyAssignmentDetailedStatus =
        genForShowOrganizationPolicyAssignmentDetailedStatus();

    private static HttpRequestDef<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> genForShowOrganizationPolicyAssignmentDetailedStatus() {
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
                ShowOrganizationPolicyAssignmentDetailedStatusRequest::setOrganizationId));
        builder.<String>withRequestField("organization_policy_assignment_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(
                ShowOrganizationPolicyAssignmentDetailedStatusRequest::getOrganizationPolicyAssignmentName,
                ShowOrganizationPolicyAssignmentDetailedStatusRequest::setOrganizationPolicyAssignmentName));
        builder.<ShowOrganizationPolicyAssignmentDetailedStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowOrganizationPolicyAssignmentDetailedStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentDetailedStatusRequest::getStatus,
                ShowOrganizationPolicyAssignmentDetailedStatusRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentDetailedStatusRequest::getLimit,
                ShowOrganizationPolicyAssignmentDetailedStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentDetailedStatusRequest::getMarker,
                ShowOrganizationPolicyAssignmentDetailedStatusRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> showOrganizationPolicyAssignmentStatuses =
        genForShowOrganizationPolicyAssignmentStatuses();

    private static HttpRequestDef<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> genForShowOrganizationPolicyAssignmentStatuses() {
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
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getOrganizationId,
                ShowOrganizationPolicyAssignmentStatusesRequest::setOrganizationId));
        builder.<String>withRequestField("organization_policy_assignment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getOrganizationPolicyAssignmentName,
                ShowOrganizationPolicyAssignmentStatusesRequest::setOrganizationPolicyAssignmentName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getLimit,
                ShowOrganizationPolicyAssignmentStatusesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationPolicyAssignmentStatusesRequest::getMarker,
                ShowOrganizationPolicyAssignmentStatusesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> showPolicyAssignment =
        genForShowPolicyAssignment();

    private static HttpRequestDef<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> genForShowPolicyAssignment() {
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
            f -> f.withMarshaller(ShowPolicyAssignmentRequest::getPolicyAssignmentId,
                ShowPolicyAssignmentRequest::setPolicyAssignmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> updatePolicyAssignment =
        genForUpdatePolicyAssignment();

    private static HttpRequestDef<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> genForUpdatePolicyAssignment() {
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
            f -> f.withMarshaller(UpdatePolicyAssignmentRequest::getPolicyAssignmentId,
                UpdatePolicyAssignmentRequest::setPolicyAssignmentId));
        builder.<PolicyAssignmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PolicyAssignmentRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyAssignmentRequest::getBody, UpdatePolicyAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyStateRequest, UpdatePolicyStateResponse> updatePolicyState =
        genForUpdatePolicyState();

    private static HttpRequestDef<UpdatePolicyStateRequest, UpdatePolicyStateResponse> genForUpdatePolicyState() {
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
            f -> f.withMarshaller(UpdatePolicyStateRequest::getBody, UpdatePolicyStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStoredQueryRequest, CreateStoredQueryResponse> createStoredQuery =
        genForCreateStoredQuery();

    private static HttpRequestDef<CreateStoredQueryRequest, CreateStoredQueryResponse> genForCreateStoredQuery() {
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
            f -> f.withMarshaller(CreateStoredQueryRequest::getBody, CreateStoredQueryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStoredQueryRequest, DeleteStoredQueryResponse> deleteStoredQuery =
        genForDeleteStoredQuery();

    private static HttpRequestDef<DeleteStoredQueryRequest, DeleteStoredQueryResponse> genForDeleteStoredQuery() {
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
            f -> f.withMarshaller(DeleteStoredQueryRequest::getQueryId, DeleteStoredQueryRequest::setQueryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSchemasRequest, ListSchemasResponse> listSchemas = genForListSchemas();

    private static HttpRequestDef<ListSchemasRequest, ListSchemasResponse> genForListSchemas() {
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
            f -> f.withMarshaller(ListSchemasRequest::getLimit, ListSchemasRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemasRequest::getMarker, ListSchemasRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoredQueriesRequest, ListStoredQueriesResponse> listStoredQueries =
        genForListStoredQueries();

    private static HttpRequestDef<ListStoredQueriesRequest, ListStoredQueriesResponse> genForListStoredQueries() {
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
            f -> f.withMarshaller(ListStoredQueriesRequest::getLimit, ListStoredQueriesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoredQueriesRequest::getMarker, ListStoredQueriesRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStoredQueriesRequest::getName, ListStoredQueriesRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueryRequest, RunQueryResponse> runQuery = genForRunQuery();

    private static HttpRequestDef<RunQueryRequest, RunQueryResponse> genForRunQuery() {
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
            f -> f.withMarshaller(RunQueryRequest::getBody, RunQueryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStoredQueryRequest, ShowStoredQueryResponse> showStoredQuery =
        genForShowStoredQuery();

    private static HttpRequestDef<ShowStoredQueryRequest, ShowStoredQueryResponse> genForShowStoredQuery() {
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
            f -> f.withMarshaller(ShowStoredQueryRequest::getQueryId, ShowStoredQueryRequest::setQueryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStoredQueryRequest, UpdateStoredQueryResponse> updateStoredQuery =
        genForUpdateStoredQuery();

    private static HttpRequestDef<UpdateStoredQueryRequest, UpdateStoredQueryResponse> genForUpdateStoredQuery() {
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
            f -> f.withMarshaller(UpdateStoredQueryRequest::getQueryId, UpdateStoredQueryRequest::setQueryId));
        builder.<StoredQueryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StoredQueryRequestBody.class),
            f -> f.withMarshaller(UpdateStoredQueryRequest::getBody, UpdateStoredQueryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForListRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForListRegions() {
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
            f -> f.withMarshaller(ListRegionsRequest::getXLanguage, ListRegionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelations =
        genForShowResourceRelations();

    private static HttpRequestDef<ShowResourceRelationsRequest, ShowResourceRelationsResponse> genForShowResourceRelations() {
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
            f -> f.withMarshaller(ShowResourceRelationsRequest::getResourceId,
                ShowResourceRelationsRequest::setResourceId));
        builder.<ShowResourceRelationsRequest.DirectionEnum>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceRelationsRequest.DirectionEnum.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getDirection,
                ShowResourceRelationsRequest::setDirection));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getLimit, ShowResourceRelationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsRequest::getMarker, ShowResourceRelationsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> showResourceRelationsDetail =
        genForShowResourceRelationsDetail();

    private static HttpRequestDef<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> genForShowResourceRelationsDetail() {
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
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getResourceId,
                ShowResourceRelationsDetailRequest::setResourceId));
        builder.<ShowResourceRelationsDetailRequest.DirectionEnum>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceRelationsDetailRequest.DirectionEnum.class),
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getDirection,
                ShowResourceRelationsDetailRequest::setDirection));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getLimit,
                ShowResourceRelationsDetailRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceRelationsDetailRequest::getMarker,
                ShowResourceRelationsDetailRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummary =
        genForCollectAllResourcesSummary();

    private static HttpRequestDef<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> genForCollectAllResourcesSummary() {
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
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getName,
                CollectAllResourcesSummaryRequest::setName));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getType,
                CollectAllResourcesSummaryRequest::setType));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getRegionId,
                CollectAllResourcesSummaryRequest::setRegionId));
        builder.<List<String>>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getEpId,
                CollectAllResourcesSummaryRequest::setEpId));
        builder.<List<String>>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getProjectId,
                CollectAllResourcesSummaryRequest::setProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CollectAllResourcesSummaryRequest::getTags,
                CollectAllResourcesSummaryRequest::setTags));

        // response
        builder.<List<ResourceSummaryResponseItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(CollectAllResourcesSummaryResponse::getBody,
                    CollectAllResourcesSummaryResponse::setBody)
                .withInnerContainerType(ResourceSummaryResponseItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<CountAllResourcesRequest, CountAllResourcesResponse> countAllResources =
        genForCountAllResources();

    private static HttpRequestDef<CountAllResourcesRequest, CountAllResourcesResponse> genForCountAllResources() {
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
            f -> f.withMarshaller(CountAllResourcesRequest::getId, CountAllResourcesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getName, CountAllResourcesRequest::setName));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getType, CountAllResourcesRequest::setType));
        builder.<List<String>>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getRegionId, CountAllResourcesRequest::setRegionId));
        builder.<List<String>>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getEpId, CountAllResourcesRequest::setEpId));
        builder.<List<String>>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getProjectId, CountAllResourcesRequest::setProjectId));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CountAllResourcesRequest::getTags, CountAllResourcesRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllResourcesRequest, ListAllResourcesResponse> listAllResources =
        genForListAllResources();

    private static HttpRequestDef<ListAllResourcesRequest, ListAllResourcesResponse> genForListAllResources() {
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
            f -> f.withMarshaller(ListAllResourcesRequest::getRegionId, ListAllResourcesRequest::setRegionId));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getEpId, ListAllResourcesRequest::setEpId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getType, ListAllResourcesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getLimit, ListAllResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getMarker, ListAllResourcesRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getId, ListAllResourcesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getName, ListAllResourcesRequest::setName));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAllResourcesRequest::getTags, ListAllResourcesRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> listAllTags = genForListAllTags();

    private static HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> genForListAllTags() {
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
            f -> f.withMarshaller(ListAllTagsRequest::getKey, ListAllTagsRequest::setKey));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTagsRequest::getMarker, ListAllTagsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTagsRequest::getLimit, ListAllTagsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProvidersRequest, ListProvidersResponse> listProviders =
        genForListProviders();

    private static HttpRequestDef<ListProvidersRequest, ListProvidersResponse> genForListProviders() {
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
            f -> f.withMarshaller(ListProvidersRequest::getOffset, ListProvidersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvidersRequest::getLimit, ListProvidersRequest::setLimit));
        builder.<ListProvidersRequest.TrackEnum>withRequestField("track",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProvidersRequest.TrackEnum.class),
            f -> f.withMarshaller(ListProvidersRequest::getTrack, ListProvidersRequest::setTrack));
        builder.<ListProvidersRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProvidersRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListProvidersRequest::getXLanguage, ListProvidersRequest::setXLanguage));

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
                .withUri("/v1/resource-manager/domains/{domain_id}/provider/{provider}/type/{type}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getProvider, ListResourcesRequest::setProvider));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getType, ListResourcesRequest::setType));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getRegionId, ListResourcesRequest::setRegionId));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getEpId, ListResourcesRequest::setEpId));
        builder.<Map<String, List<String>>>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ListResourcesRequest::getTag, ListResourcesRequest::setTag));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesRequest::getLimit, ListResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesRequest::getMarker, ListResourcesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceById =
        genForShowResourceById();

    private static HttpRequestDef<ShowResourceByIdRequest, ShowResourceByIdResponse> genForShowResourceById() {
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
            f -> f.withMarshaller(ShowResourceByIdRequest::getProvider, ShowResourceByIdRequest::setProvider));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getType, ShowResourceByIdRequest::setType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceByIdRequest::getResourceId, ShowResourceByIdRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetail =
        genForShowResourceDetail();

    private static HttpRequestDef<ShowResourceDetailRequest, ShowResourceDetailResponse> genForShowResourceDetail() {
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
            f -> f.withMarshaller(ShowResourceDetailRequest::getResourceId, ShowResourceDetailRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrackerConfigRequest, CreateTrackerConfigResponse> createTrackerConfig =
        genForCreateTrackerConfig();

    private static HttpRequestDef<CreateTrackerConfigRequest, CreateTrackerConfigResponse> genForCreateTrackerConfig() {
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
            f -> f.withMarshaller(CreateTrackerConfigRequest::getBody, CreateTrackerConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> deleteTrackerConfig =
        genForDeleteTrackerConfig();

    private static HttpRequestDef<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> genForDeleteTrackerConfig() {
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
        genForShowTrackerConfig();

    private static HttpRequestDef<ShowTrackerConfigRequest, ShowTrackerConfigResponse> genForShowTrackerConfig() {
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

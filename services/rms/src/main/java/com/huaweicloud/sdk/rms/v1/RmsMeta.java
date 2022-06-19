package com.huaweicloud.sdk.rms.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rms.v1.model.*;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class RmsMeta {

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

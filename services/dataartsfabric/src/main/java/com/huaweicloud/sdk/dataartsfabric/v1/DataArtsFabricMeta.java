package com.huaweicloud.sdk.dataartsfabric.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dataartsfabric.v1.model.AgencyTypeBody;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchCreateFabricWorkspaceTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchCreateFabricWorkspaceTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchCreateTagsRequestBody;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchDeleteFabricWorkspaceTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchDeleteFabricWorkspaceTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchDeleteTagsRequestBody;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CleanupModelRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CleanupModelResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CountTagFabricWorkspacesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CountTagFabricWorkspacesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgreementRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgreementResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateMessageNotificationPolicyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateMessageNotificationPolicyRequestBody;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateMessageNotificationPolicyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateModelDefinitionRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateModelDefinitionResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateModelInput;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateWorkspaceRequestInput;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgreementRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgreementResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteMessageNotificationPolicyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteMessageNotificationPolicyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteModelVersionRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteModelVersionResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.EndpointInput;
import com.huaweicloud.sdk.dataartsfabric.v1.model.EndpointType;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListAgencyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListAgencyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListBaseModelsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListBaseModelsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricProjectTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricProjectTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricWorkspaceTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricWorkspaceTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFeaturesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFeaturesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListMessageNotificationPolicyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListMessageNotificationPolicyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelVersionsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelVersionsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListSpecsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListSpecsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListTagFabricWorkspacesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListTagFabricWorkspacesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListTagWorkspacesRequestBody;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAdminHealthCheckRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAdminHealthCheckResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementRuleRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementRuleResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.SpecScenario;
import com.huaweicloud.sdk.dataartsfabric.v1.model.SubscribeEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.SubscribeEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.TenantAgreementBody;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateEndpointRequestBody;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateMetricsConfigInput;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateMetricsConfigRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateMetricsConfigResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateModelDefinitionRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateModelDefinitionResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateModelInput;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateWorkspaceRequestInput;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateWorkspaceResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DataArtsFabricMeta {

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForCreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForCreateAgency() {
        // basic
        HttpRequestDef.Builder<CreateAgencyRequest, CreateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyRequest.class, CreateAgencyResponse.class)
                .withName("CreateAgency")
                .withUri("/v1/agency")
                .withContentType("application/json");

        // requests
        builder.<AgencyTypeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgencyTypeBody.class),
            f -> f.withMarshaller(CreateAgencyRequest::getBody, CreateAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgency = genForDeleteAgency();

    private static HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> genForDeleteAgency() {
        // basic
        HttpRequestDef.Builder<DeleteAgencyRequest, DeleteAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgencyRequest.class, DeleteAgencyResponse.class)
                .withName("DeleteAgency")
                .withUri("/v1/agency")
                .withContentType("application/json");

        // requests
        builder.<DeleteAgencyRequest.PolicyTypeEnum>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteAgencyRequest.PolicyTypeEnum.class),
            f -> f.withMarshaller(DeleteAgencyRequest::getPolicyType, DeleteAgencyRequest::setPolicyType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgencyRequest, ListAgencyResponse> listAgency = genForListAgency();

    private static HttpRequestDef<ListAgencyRequest, ListAgencyResponse> genForListAgency() {
        // basic
        HttpRequestDef.Builder<ListAgencyRequest, ListAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgencyRequest.class, ListAgencyResponse.class)
                .withName("ListAgency")
                .withUri("/v1/agency")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgencyRequest::getPolicyType, ListAgencyRequest::setPolicyType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgreementRequest, CreateAgreementResponse> createAgreement =
        genForCreateAgreement();

    private static HttpRequestDef<CreateAgreementRequest, CreateAgreementResponse> genForCreateAgreement() {
        // basic
        HttpRequestDef.Builder<CreateAgreementRequest, CreateAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgreementRequest.class, CreateAgreementResponse.class)
                .withName("CreateAgreement")
                .withUri("/v1/agreement")
                .withContentType("application/json");

        // requests
        builder.<TenantAgreementBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TenantAgreementBody.class),
            f -> f.withMarshaller(CreateAgreementRequest::getBody, CreateAgreementRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgreementRequest, DeleteAgreementResponse> deleteAgreement =
        genForDeleteAgreement();

    private static HttpRequestDef<DeleteAgreementRequest, DeleteAgreementResponse> genForDeleteAgreement() {
        // basic
        HttpRequestDef.Builder<DeleteAgreementRequest, DeleteAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgreementRequest.class, DeleteAgreementResponse.class)
                .withName("DeleteAgreement")
                .withUri("/v1/agreement")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgreementRequest, ShowAgreementResponse> showAgreement =
        genForShowAgreement();

    private static HttpRequestDef<ShowAgreementRequest, ShowAgreementResponse> genForShowAgreement() {
        // basic
        HttpRequestDef.Builder<ShowAgreementRequest, ShowAgreementResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgreementRequest.class, ShowAgreementResponse.class)
                .withName("ShowAgreement")
                .withUri("/v1/agreement")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRule =
        genForShowAgreementRule();

    private static HttpRequestDef<ShowAgreementRuleRequest, ShowAgreementRuleResponse> genForShowAgreementRule() {
        // basic
        HttpRequestDef.Builder<ShowAgreementRuleRequest, ShowAgreementRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgreementRuleRequest.class, ShowAgreementRuleResponse.class)
                .withName("ShowAgreementRule")
                .withUri("/v1/agreement-rule")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeaturesRequest, ListFeaturesResponse> listFeatures = genForListFeatures();

    private static HttpRequestDef<ListFeaturesRequest, ListFeaturesResponse> genForListFeatures() {
        // basic
        HttpRequestDef.Builder<ListFeaturesRequest, ListFeaturesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeaturesRequest.class, ListFeaturesResponse.class)
                .withName("ListFeatures")
                .withUri("/v1/features")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFeaturesRequest::getOffset, ListFeaturesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFeaturesRequest::getLimit, ListFeaturesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForCreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForCreateEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateEndpointRequest, CreateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEndpointRequest.class, CreateEndpointResponse.class)
                .withName("CreateEndpoint")
                .withUri("/v1/workspaces/{workspace_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEndpointRequest::getWorkspaceId, CreateEndpointRequest::setWorkspaceId));
        builder.<EndpointInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EndpointInput.class),
            f -> f.withMarshaller(CreateEndpointRequest::getBody, CreateEndpointRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEndpointResponse::getXRequestId, CreateEndpointResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpoint =
        genForDeleteEndpoint();

    private static HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> genForDeleteEndpoint() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointRequest, DeleteEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEndpointRequest.class, DeleteEndpointResponse.class)
                .withName("DeleteEndpoint")
                .withUri("/v1/workspaces/{workspace_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getWorkspaceId, DeleteEndpointRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointId, DeleteEndpointRequest::setEndpointId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEndpointResponse::getXRequestId, DeleteEndpointResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForListEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForListEndpoints() {
        // basic
        HttpRequestDef.Builder<ListEndpointsRequest, ListEndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointsRequest.class, ListEndpointsResponse.class)
                .withName("ListEndpoints")
                .withUri("/v1/workspaces/{workspace_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getWorkspaceId, ListEndpointsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, ListEndpointsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, ListEndpointsRequest::setLimit));
        builder.<String>withRequestField("model_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getModelId, ListEndpointsRequest::setModelId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getName, ListEndpointsRequest::setName));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getEndpointId, ListEndpointsRequest::setEndpointId));
        builder.<EndpointType>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EndpointType.class),
            f -> f.withMarshaller(ListEndpointsRequest::getType, ListEndpointsRequest::setType));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getVisibility, ListEndpointsRequest::setVisibility));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEndpointsResponse::getXRequestId, ListEndpointsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> showEndpoint = genForShowEndpoint();

    private static HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> genForShowEndpoint() {
        // basic
        HttpRequestDef.Builder<ShowEndpointRequest, ShowEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEndpointRequest.class, ShowEndpointResponse.class)
                .withName("ShowEndpoint")
                .withUri("/v1/workspaces/{workspace_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointRequest::getWorkspaceId, ShowEndpointRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointRequest::getEndpointId, ShowEndpointRequest::setEndpointId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointRequest::getVersion, ShowEndpointRequest::setVersion));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowEndpointResponse::getXRequestId, ShowEndpointResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SubscribeEndpointRequest, SubscribeEndpointResponse> subscribeEndpoint =
        genForSubscribeEndpoint();

    private static HttpRequestDef<SubscribeEndpointRequest, SubscribeEndpointResponse> genForSubscribeEndpoint() {
        // basic
        HttpRequestDef.Builder<SubscribeEndpointRequest, SubscribeEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeEndpointRequest.class, SubscribeEndpointResponse.class)
                .withName("SubscribeEndpoint")
                .withUri("/v1/workspaces/{workspace_id}/endpoints/{endpoint_id}/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeEndpointRequest::getWorkspaceId, SubscribeEndpointRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeEndpointRequest::getEndpointId, SubscribeEndpointRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpoint =
        genForUpdateEndpoint();

    private static HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> genForUpdateEndpoint() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointRequest, UpdateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEndpointRequest.class, UpdateEndpointResponse.class)
                .withName("UpdateEndpoint")
                .withUri("/v1/workspaces/{workspace_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getWorkspaceId, UpdateEndpointRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointId, UpdateEndpointRequest::setEndpointId));
        builder.<UpdateEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getBody, UpdateEndpointRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateEndpointResponse::getXRequestId, UpdateEndpointResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAdminHealthCheckRequest, ShowAdminHealthCheckResponse> showAdminHealthCheck =
        genForShowAdminHealthCheck();

    private static HttpRequestDef<ShowAdminHealthCheckRequest, ShowAdminHealthCheckResponse> genForShowAdminHealthCheck() {
        // basic
        HttpRequestDef.Builder<ShowAdminHealthCheckRequest, ShowAdminHealthCheckResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAdminHealthCheckRequest.class, ShowAdminHealthCheckResponse.class)
            .withName("ShowAdminHealthCheck")
            .withUri("/healthcheck")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessageNotificationPolicyRequest, CreateMessageNotificationPolicyResponse> createMessageNotificationPolicy =
        genForCreateMessageNotificationPolicy();

    private static HttpRequestDef<CreateMessageNotificationPolicyRequest, CreateMessageNotificationPolicyResponse> genForCreateMessageNotificationPolicy() {
        // basic
        HttpRequestDef.Builder<CreateMessageNotificationPolicyRequest, CreateMessageNotificationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMessageNotificationPolicyRequest.class,
                    CreateMessageNotificationPolicyResponse.class)
                .withName("CreateMessageNotificationPolicy")
                .withUri("/v1/workspaces/{workspace_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessageNotificationPolicyRequest::getWorkspaceId,
                CreateMessageNotificationPolicyRequest::setWorkspaceId));
        builder.<CreateMessageNotificationPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMessageNotificationPolicyRequestBody.class),
            f -> f.withMarshaller(CreateMessageNotificationPolicyRequest::getBody,
                CreateMessageNotificationPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMessageNotificationPolicyRequest, DeleteMessageNotificationPolicyResponse> deleteMessageNotificationPolicy =
        genForDeleteMessageNotificationPolicy();

    private static HttpRequestDef<DeleteMessageNotificationPolicyRequest, DeleteMessageNotificationPolicyResponse> genForDeleteMessageNotificationPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteMessageNotificationPolicyRequest, DeleteMessageNotificationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMessageNotificationPolicyRequest.class,
                    DeleteMessageNotificationPolicyResponse.class)
                .withName("DeleteMessageNotificationPolicy")
                .withUri("/v1/workspaces/{workspace_id}/messages/{message_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("message_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMessageNotificationPolicyRequest::getMessagePolicyId,
                DeleteMessageNotificationPolicyRequest::setMessagePolicyId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMessageNotificationPolicyRequest::getWorkspaceId,
                DeleteMessageNotificationPolicyRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageNotificationPolicyRequest, ListMessageNotificationPolicyResponse> listMessageNotificationPolicy =
        genForListMessageNotificationPolicy();

    private static HttpRequestDef<ListMessageNotificationPolicyRequest, ListMessageNotificationPolicyResponse> genForListMessageNotificationPolicy() {
        // basic
        HttpRequestDef.Builder<ListMessageNotificationPolicyRequest, ListMessageNotificationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMessageNotificationPolicyRequest.class,
                    ListMessageNotificationPolicyResponse.class)
                .withName("ListMessageNotificationPolicy")
                .withUri("/v1/workspaces/{workspace_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageNotificationPolicyRequest::getWorkspaceId,
                ListMessageNotificationPolicyRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageNotificationPolicyRequest::getOffset,
                ListMessageNotificationPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageNotificationPolicyRequest::getLimit,
                ListMessageNotificationPolicyRequest::setLimit));
        builder.<String>withRequestField("message_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageNotificationPolicyRequest::getMessageType,
                ListMessageNotificationPolicyRequest::setMessageType));
        builder.<String>withRequestField("name_pattern",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageNotificationPolicyRequest::getNamePattern,
                ListMessageNotificationPolicyRequest::setNamePattern));
        builder.<String>withRequestField("notify_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageNotificationPolicyRequest::getNotifyType,
                ListMessageNotificationPolicyRequest::setNotifyType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMetricsConfigRequest, UpdateMetricsConfigResponse> updateMetricsConfig =
        genForUpdateMetricsConfig();

    private static HttpRequestDef<UpdateMetricsConfigRequest, UpdateMetricsConfigResponse> genForUpdateMetricsConfig() {
        // basic
        HttpRequestDef.Builder<UpdateMetricsConfigRequest, UpdateMetricsConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMetricsConfigRequest.class, UpdateMetricsConfigResponse.class)
                .withName("UpdateMetricsConfig")
                .withUri("/v1/workspaces/{workspace_id}/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMetricsConfigRequest::getWorkspaceId,
                UpdateMetricsConfigRequest::setWorkspaceId));
        builder.<UpdateMetricsConfigInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMetricsConfigInput.class),
            f -> f.withMarshaller(UpdateMetricsConfigRequest::getBody, UpdateMetricsConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CleanupModelRequest, CleanupModelResponse> cleanupModel = genForCleanupModel();

    private static HttpRequestDef<CleanupModelRequest, CleanupModelResponse> genForCleanupModel() {
        // basic
        HttpRequestDef.Builder<CleanupModelRequest, CleanupModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CleanupModelRequest.class, CleanupModelResponse.class)
                .withName("CleanupModel")
                .withUri("/v1/workspaces/{workspace_id}/models/{model_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanupModelRequest::getWorkspaceId, CleanupModelRequest::setWorkspaceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CleanupModelRequest::getModelId, CleanupModelRequest::setModelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateModelDefinitionRequest, CreateModelDefinitionResponse> createModelDefinition =
        genForCreateModelDefinition();

    private static HttpRequestDef<CreateModelDefinitionRequest, CreateModelDefinitionResponse> genForCreateModelDefinition() {
        // basic
        HttpRequestDef.Builder<CreateModelDefinitionRequest, CreateModelDefinitionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateModelDefinitionRequest.class, CreateModelDefinitionResponse.class)
            .withName("CreateModelDefinition")
            .withUri("/v1/workspaces/{workspace_id}/models")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateModelDefinitionRequest::getWorkspaceId,
                CreateModelDefinitionRequest::setWorkspaceId));
        builder.<CreateModelInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateModelInput.class),
            f -> f.withMarshaller(CreateModelDefinitionRequest::getBody, CreateModelDefinitionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateModelDefinitionResponse::getXRequestId,
                CreateModelDefinitionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteModelVersionRequest, DeleteModelVersionResponse> deleteModelVersion =
        genForDeleteModelVersion();

    private static HttpRequestDef<DeleteModelVersionRequest, DeleteModelVersionResponse> genForDeleteModelVersion() {
        // basic
        HttpRequestDef.Builder<DeleteModelVersionRequest, DeleteModelVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteModelVersionRequest.class, DeleteModelVersionResponse.class)
                .withName("DeleteModelVersion")
                .withUri("/v1/workspaces/{workspace_id}/models/{model_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModelVersionRequest::getWorkspaceId,
                DeleteModelVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModelVersionRequest::getModelId, DeleteModelVersionRequest::setModelId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModelVersionRequest::getVersionId, DeleteModelVersionRequest::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBaseModelsRequest, ListBaseModelsResponse> listBaseModels =
        genForListBaseModels();

    private static HttpRequestDef<ListBaseModelsRequest, ListBaseModelsResponse> genForListBaseModels() {
        // basic
        HttpRequestDef.Builder<ListBaseModelsRequest, ListBaseModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBaseModelsRequest.class, ListBaseModelsResponse.class)
                .withName("ListBaseModels")
                .withUri("/v1/base-models")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBaseModelsRequest::getOffset, ListBaseModelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBaseModelsRequest::getLimit, ListBaseModelsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBaseModelsResponse::getXRequestId, ListBaseModelsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListModelVersionsRequest, ListModelVersionsResponse> listModelVersions =
        genForListModelVersions();

    private static HttpRequestDef<ListModelVersionsRequest, ListModelVersionsResponse> genForListModelVersions() {
        // basic
        HttpRequestDef.Builder<ListModelVersionsRequest, ListModelVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListModelVersionsRequest.class, ListModelVersionsResponse.class)
                .withName("ListModelVersions")
                .withUri("/v1/workspaces/{workspace_id}/models/{model_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelVersionsRequest::getWorkspaceId, ListModelVersionsRequest::setWorkspaceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelVersionsRequest::getModelId, ListModelVersionsRequest::setModelId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelVersionsRequest::getOffset, ListModelVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelVersionsRequest::getLimit, ListModelVersionsRequest::setLimit));
        builder.<String>withRequestField("version_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelVersionsRequest::getVersionId, ListModelVersionsRequest::setVersionId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelVersionsRequest::getName, ListModelVersionsRequest::setName));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListModelVersionsResponse::getXRequestId, ListModelVersionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListModelsRequest, ListModelsResponse> listModels = genForListModels();

    private static HttpRequestDef<ListModelsRequest, ListModelsResponse> genForListModels() {
        // basic
        HttpRequestDef.Builder<ListModelsRequest, ListModelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListModelsRequest.class, ListModelsResponse.class)
                .withName("ListModels")
                .withUri("/v1/workspaces/{workspace_id}/models")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelsRequest::getWorkspaceId, ListModelsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelsRequest::getOffset, ListModelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelsRequest::getLimit, ListModelsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelsRequest::getName, ListModelsRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelsRequest::getId, ListModelsRequest::setId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelsRequest::getType, ListModelsRequest::setType));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelsRequest::getVisibility, ListModelsRequest::setVisibility));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelsRequest::getSortBy, ListModelsRequest::setSortBy));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelsRequest::getOrderBy, ListModelsRequest::setOrderBy));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListModelsResponse::getXRequestId, ListModelsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateModelDefinitionRequest, UpdateModelDefinitionResponse> updateModelDefinition =
        genForUpdateModelDefinition();

    private static HttpRequestDef<UpdateModelDefinitionRequest, UpdateModelDefinitionResponse> genForUpdateModelDefinition() {
        // basic
        HttpRequestDef.Builder<UpdateModelDefinitionRequest, UpdateModelDefinitionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateModelDefinitionRequest.class, UpdateModelDefinitionResponse.class)
            .withName("UpdateModelDefinition")
            .withUri("/v1/workspaces/{workspace_id}/models/{model_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModelDefinitionRequest::getWorkspaceId,
                UpdateModelDefinitionRequest::setWorkspaceId));
        builder.<String>withRequestField("model_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModelDefinitionRequest::getModelId, UpdateModelDefinitionRequest::setModelId));
        builder.<UpdateModelInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateModelInput.class),
            f -> f.withMarshaller(UpdateModelDefinitionRequest::getBody, UpdateModelDefinitionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecsRequest, ListSpecsResponse> listSpecs = genForListSpecs();

    private static HttpRequestDef<ListSpecsRequest, ListSpecsResponse> genForListSpecs() {
        // basic
        HttpRequestDef.Builder<ListSpecsRequest, ListSpecsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSpecsRequest.class, ListSpecsResponse.class)
                .withName("ListSpecs")
                .withUri("/v1/specs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecsRequest::getSpecCode, ListSpecsRequest::setSpecCode));
        builder.<List<String>>withRequestField("spec_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSpecsRequest::getSpecTypes, ListSpecsRequest::setSpecTypes));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecsRequest::getOffset, ListSpecsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecsRequest::getLimit, ListSpecsRequest::setLimit));
        builder.<SpecScenario>withRequestField("scenario",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SpecScenario.class),
            f -> f.withMarshaller(ListSpecsRequest::getScenario, ListSpecsRequest::setScenario));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateFabricWorkspaceTagsRequest, BatchCreateFabricWorkspaceTagsResponse> batchCreateFabricWorkspaceTags =
        genForBatchCreateFabricWorkspaceTags();

    private static HttpRequestDef<BatchCreateFabricWorkspaceTagsRequest, BatchCreateFabricWorkspaceTagsResponse> genForBatchCreateFabricWorkspaceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateFabricWorkspaceTagsRequest, BatchCreateFabricWorkspaceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateFabricWorkspaceTagsRequest.class,
                    BatchCreateFabricWorkspaceTagsResponse.class)
                .withName("BatchCreateFabricWorkspaceTags")
                .withUri("/v1/{project_id}/fabric-workspace/{workspace_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateFabricWorkspaceTagsRequest::getWorkspaceId,
                BatchCreateFabricWorkspaceTagsRequest::setWorkspaceId));
        builder.<BatchCreateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateFabricWorkspaceTagsRequest::getBody,
                BatchCreateFabricWorkspaceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFabricWorkspaceTagsRequest, BatchDeleteFabricWorkspaceTagsResponse> batchDeleteFabricWorkspaceTags =
        genForBatchDeleteFabricWorkspaceTags();

    private static HttpRequestDef<BatchDeleteFabricWorkspaceTagsRequest, BatchDeleteFabricWorkspaceTagsResponse> genForBatchDeleteFabricWorkspaceTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFabricWorkspaceTagsRequest, BatchDeleteFabricWorkspaceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteFabricWorkspaceTagsRequest.class,
                    BatchDeleteFabricWorkspaceTagsResponse.class)
                .withName("BatchDeleteFabricWorkspaceTags")
                .withUri("/v1/{project_id}/fabric-workspace/{workspace_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteFabricWorkspaceTagsRequest::getWorkspaceId,
                BatchDeleteFabricWorkspaceTagsRequest::setWorkspaceId));
        builder.<BatchDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteFabricWorkspaceTagsRequest::getBody,
                BatchDeleteFabricWorkspaceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountTagFabricWorkspacesRequest, CountTagFabricWorkspacesResponse> countTagFabricWorkspaces =
        genForCountTagFabricWorkspaces();

    private static HttpRequestDef<CountTagFabricWorkspacesRequest, CountTagFabricWorkspacesResponse> genForCountTagFabricWorkspaces() {
        // basic
        HttpRequestDef.Builder<CountTagFabricWorkspacesRequest, CountTagFabricWorkspacesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CountTagFabricWorkspacesRequest.class, CountTagFabricWorkspacesResponse.class)
                .withName("CountTagFabricWorkspaces")
                .withUri("/v1/{project_id}/fabric-workspace/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListTagWorkspacesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagWorkspacesRequestBody.class),
            f -> f.withMarshaller(CountTagFabricWorkspacesRequest::getBody, CountTagFabricWorkspacesRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountTagFabricWorkspacesResponse::getXRequestId,
                CountTagFabricWorkspacesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFabricProjectTagsRequest, ListFabricProjectTagsResponse> listFabricProjectTags =
        genForListFabricProjectTags();

    private static HttpRequestDef<ListFabricProjectTagsRequest, ListFabricProjectTagsResponse> genForListFabricProjectTags() {
        // basic
        HttpRequestDef.Builder<ListFabricProjectTagsRequest, ListFabricProjectTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFabricProjectTagsRequest.class, ListFabricProjectTagsResponse.class)
            .withName("ListFabricProjectTags")
            .withUri("/v1/{project_id}/fabric-workspace/tags")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("use_predefine_tags",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFabricProjectTagsRequest::getUsePredefineTags,
                ListFabricProjectTagsRequest::setUsePredefineTags));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFabricProjectTagsRequest::getOffset, ListFabricProjectTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFabricProjectTagsRequest::getLimit, ListFabricProjectTagsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFabricProjectTagsResponse::getXRequestId,
                ListFabricProjectTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFabricWorkspaceTagsRequest, ListFabricWorkspaceTagsResponse> listFabricWorkspaceTags =
        genForListFabricWorkspaceTags();

    private static HttpRequestDef<ListFabricWorkspaceTagsRequest, ListFabricWorkspaceTagsResponse> genForListFabricWorkspaceTags() {
        // basic
        HttpRequestDef.Builder<ListFabricWorkspaceTagsRequest, ListFabricWorkspaceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFabricWorkspaceTagsRequest.class, ListFabricWorkspaceTagsResponse.class)
            .withName("ListFabricWorkspaceTags")
            .withUri("/v1/{project_id}/fabric-workspace/{workspace_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFabricWorkspaceTagsRequest::getWorkspaceId,
                ListFabricWorkspaceTagsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFabricWorkspaceTagsRequest::getOffset,
                ListFabricWorkspaceTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFabricWorkspaceTagsRequest::getLimit, ListFabricWorkspaceTagsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListFabricWorkspaceTagsResponse::getXRequestId,
                ListFabricWorkspaceTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTagFabricWorkspacesRequest, ListTagFabricWorkspacesResponse> listTagFabricWorkspaces =
        genForListTagFabricWorkspaces();

    private static HttpRequestDef<ListTagFabricWorkspacesRequest, ListTagFabricWorkspacesResponse> genForListTagFabricWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListTagFabricWorkspacesRequest, ListTagFabricWorkspacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListTagFabricWorkspacesRequest.class, ListTagFabricWorkspacesResponse.class)
            .withName("ListTagFabricWorkspaces")
            .withUri("/v1/{project_id}/fabric-workspace/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagFabricWorkspacesRequest::getOffset,
                ListTagFabricWorkspacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagFabricWorkspacesRequest::getLimit, ListTagFabricWorkspacesRequest::setLimit));
        builder.<ListTagWorkspacesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagWorkspacesRequestBody.class),
            f -> f.withMarshaller(ListTagFabricWorkspacesRequest::getBody, ListTagFabricWorkspacesRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTagFabricWorkspacesResponse::getXRequestId,
                ListTagFabricWorkspacesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForCreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForCreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v1/workspaces")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkspaceRequestInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceRequestInput.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, CreateWorkspaceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWorkspaceResponse::getXRequestId, CreateWorkspaceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspace =
        genForDeleteWorkspace();

    private static HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> genForDeleteWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspaceRequest, DeleteWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkspaceRequest.class, DeleteWorkspaceResponse.class)
                .withName("DeleteWorkspace")
                .withUri("/v1/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getWorkspaceId, DeleteWorkspaceRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteWorkspaceResponse::getXRequestId, DeleteWorkspaceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForListWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForListWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v1/workspaces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getOffset, ListWorkspacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getLimit, ListWorkspacesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getName, ListWorkspacesRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getId, ListWorkspacesRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getEnterpriseProjectId,
                ListWorkspacesRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkspacesResponse::getXRequestId, ListWorkspacesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForUpdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForUpdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v1/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspaceId, UpdateWorkspaceRequest::setWorkspaceId));
        builder.<UpdateWorkspaceRequestInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceRequestInput.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWorkspaceResponse::getXRequestId, UpdateWorkspaceResponse::setXRequestId));
        return builder.build();
    }

}

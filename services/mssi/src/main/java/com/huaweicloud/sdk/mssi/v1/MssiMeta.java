package com.huaweicloud.sdk.mssi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mssi.v1.model.BaseConnectionInfo;
import com.huaweicloud.sdk.mssi.v1.model.ConnectionInfo;
import com.huaweicloud.sdk.mssi.v1.model.CreateConnectionInfoRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateConnectionInfoResponse;
import com.huaweicloud.sdk.mssi.v1.model.CreateCustomConnectorFromOpenapiRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateCustomConnectorFromOpenapiResponse;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowResponse;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowTemplateFromFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowTemplateFromFlowResponse;
import com.huaweicloud.sdk.mssi.v1.model.CustomConnectorInfoV2;
import com.huaweicloud.sdk.mssi.v1.model.DeleteConnectionInfoRequest;
import com.huaweicloud.sdk.mssi.v1.model.DeleteConnectionInfoResponse;
import com.huaweicloud.sdk.mssi.v1.model.DeleteCustomConnectorRequest;
import com.huaweicloud.sdk.mssi.v1.model.DeleteCustomConnectorResponse;
import com.huaweicloud.sdk.mssi.v1.model.DeleteFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.DeleteFlowResponse;
import com.huaweicloud.sdk.mssi.v1.model.FlowMeta;
import com.huaweicloud.sdk.mssi.v1.model.SearchFlowByIdRequest;
import com.huaweicloud.sdk.mssi.v1.model.SearchFlowByIdResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllConnectionsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllConnectionsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllFlowsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllFlowsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowConnectorsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowConnectorsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowSingleConnectionRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowSingleConnectionResponse;
import com.huaweicloud.sdk.mssi.v1.model.TemplateMessage;
import com.huaweicloud.sdk.mssi.v1.model.UpdateConnectionInfoRequest;
import com.huaweicloud.sdk.mssi.v1.model.UpdateConnectionInfoResponse;
import com.huaweicloud.sdk.mssi.v1.model.UpdateFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.UpdateFlowResponse;

@SuppressWarnings("unchecked")
public class MssiMeta {

    public static final HttpRequestDef<CreateConnectionInfoRequest, CreateConnectionInfoResponse> createConnectionInfo =
        genForCreateConnectionInfo();

    private static HttpRequestDef<CreateConnectionInfoRequest, CreateConnectionInfoResponse> genForCreateConnectionInfo() {
        // basic
        HttpRequestDef.Builder<CreateConnectionInfoRequest, CreateConnectionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateConnectionInfoRequest.class, CreateConnectionInfoResponse.class)
            .withName("CreateConnectionInfo")
            .withUri("/v1/{project_id}/connections")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BaseConnectionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BaseConnectionInfo.class),
            f -> f.withMarshaller(CreateConnectionInfoRequest::getBody, CreateConnectionInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse> createCustomConnectorFromOpenapi =
        genForCreateCustomConnectorFromOpenapi();

    private static HttpRequestDef<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse> genForCreateCustomConnectorFromOpenapi() {
        // basic
        HttpRequestDef.Builder<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCustomConnectorFromOpenapiRequest.class,
                    CreateCustomConnectorFromOpenapiResponse.class)
                .withName("CreateCustomConnectorFromOpenapi")
                .withUri("/v2/{project_id}/connectors/custom-connectors")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CustomConnectorInfoV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CustomConnectorInfoV2.class),
            f -> f.withMarshaller(CreateCustomConnectorFromOpenapiRequest::getBody,
                CreateCustomConnectorFromOpenapiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowRequest, CreateFlowResponse> createFlow = genForCreateFlow();

    private static HttpRequestDef<CreateFlowRequest, CreateFlowResponse> genForCreateFlow() {
        // basic
        HttpRequestDef.Builder<CreateFlowRequest, CreateFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlowRequest.class, CreateFlowResponse.class)
                .withName("CreateFlow")
                .withUri("/v1/{project_id}/flows")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<FlowMeta>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FlowMeta.class),
            f -> f.withMarshaller(CreateFlowRequest::getBody, CreateFlowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse> createFlowTemplateFromFlow =
        genForCreateFlowTemplateFromFlow();

    private static HttpRequestDef<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse> genForCreateFlowTemplateFromFlow() {
        // basic
        HttpRequestDef.Builder<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateFlowTemplateFromFlowRequest.class,
                    CreateFlowTemplateFromFlowResponse.class)
                .withName("CreateFlowTemplateFromFlow")
                .withUri("/v1/{project_id}/flows/{flow_id}/templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlowTemplateFromFlowRequest::getFlowId,
                CreateFlowTemplateFromFlowRequest::setFlowId));
        builder.<TemplateMessage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TemplateMessage.class),
            f -> f.withMarshaller(CreateFlowTemplateFromFlowRequest::getBody,
                CreateFlowTemplateFromFlowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse> deleteConnectionInfo =
        genForDeleteConnectionInfo();

    private static HttpRequestDef<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse> genForDeleteConnectionInfo() {
        // basic
        HttpRequestDef.Builder<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConnectionInfoRequest.class, DeleteConnectionInfoResponse.class)
            .withName("DeleteConnectionInfo")
            .withUri("/v1/{project_id}/connections/{connect_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionInfoRequest::getConnectId,
                DeleteConnectionInfoRequest::setConnectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse> deleteCustomConnector =
        genForDeleteCustomConnector();

    private static HttpRequestDef<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse> genForDeleteCustomConnector() {
        // basic
        HttpRequestDef.Builder<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCustomConnectorRequest.class, DeleteCustomConnectorResponse.class)
            .withName("DeleteCustomConnector")
            .withUri("/v2/{project_id}/connectors/custom-connectors/{connector_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomConnectorRequest::getConnectorId,
                DeleteCustomConnectorRequest::setConnectorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowRequest, DeleteFlowResponse> deleteFlow = genForDeleteFlow();

    private static HttpRequestDef<DeleteFlowRequest, DeleteFlowResponse> genForDeleteFlow() {
        // basic
        HttpRequestDef.Builder<DeleteFlowRequest, DeleteFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFlowRequest.class, DeleteFlowResponse.class)
                .withName("DeleteFlow")
                .withUri("/v1/{project_id}/flows/{flow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowRequest::getFlowId, DeleteFlowRequest::setFlowId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchFlowByIdRequest, SearchFlowByIdResponse> searchFlowById =
        genForSearchFlowById();

    private static HttpRequestDef<SearchFlowByIdRequest, SearchFlowByIdResponse> genForSearchFlowById() {
        // basic
        HttpRequestDef.Builder<SearchFlowByIdRequest, SearchFlowByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchFlowByIdRequest.class, SearchFlowByIdResponse.class)
                .withName("SearchFlowById")
                .withUri("/v2/{project_id}/flows/{flow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFlowByIdRequest::getFlowId, SearchFlowByIdRequest::setFlowId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFlowByIdRequest::getVersion, SearchFlowByIdRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllConnectionsRequest, ShowAllConnectionsResponse> showAllConnections =
        genForShowAllConnections();

    private static HttpRequestDef<ShowAllConnectionsRequest, ShowAllConnectionsResponse> genForShowAllConnections() {
        // basic
        HttpRequestDef.Builder<ShowAllConnectionsRequest, ShowAllConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAllConnectionsRequest.class, ShowAllConnectionsResponse.class)
                .withName("ShowAllConnections")
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllConnectionsRequest::getOffset, ShowAllConnectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllConnectionsRequest::getLimit, ShowAllConnectionsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConnectionsRequest::getName, ShowAllConnectionsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllFlowsRequest, ShowAllFlowsResponse> showAllFlows = genForShowAllFlows();

    private static HttpRequestDef<ShowAllFlowsRequest, ShowAllFlowsResponse> genForShowAllFlows() {
        // basic
        HttpRequestDef.Builder<ShowAllFlowsRequest, ShowAllFlowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAllFlowsRequest.class, ShowAllFlowsResponse.class)
                .withName("ShowAllFlows")
                .withUri("/v1/{project_id}/flows")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getOffset, ShowAllFlowsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getLimit, ShowAllFlowsRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getType, ShowAllFlowsRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getName, ShowAllFlowsRequest::setName));
        builder.<Boolean>withRequestField("have_child_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getHaveChildFlow, ShowAllFlowsRequest::setHaveChildFlow));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getIds, ShowAllFlowsRequest::setIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectorsRequest, ShowConnectorsResponse> showConnectors =
        genForShowConnectors();

    private static HttpRequestDef<ShowConnectorsRequest, ShowConnectorsResponse> genForShowConnectors() {
        // basic
        HttpRequestDef.Builder<ShowConnectorsRequest, ShowConnectorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectorsRequest.class, ShowConnectorsResponse.class)
                .withName("ShowConnectors")
                .withUri("/v2/{project_id}/connectors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getOffset, ShowConnectorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getLimit, ShowConnectorsRequest::setLimit));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getScope, ShowConnectorsRequest::setScope));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getCategory, ShowConnectorsRequest::setCategory));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getName, ShowConnectorsRequest::setName));
        builder.<String>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getOperationType, ShowConnectorsRequest::setOperationType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomConnectorRequest, ShowCustomConnectorResponse> showCustomConnector =
        genForShowCustomConnector();

    private static HttpRequestDef<ShowCustomConnectorRequest, ShowCustomConnectorResponse> genForShowCustomConnector() {
        // basic
        HttpRequestDef.Builder<ShowCustomConnectorRequest, ShowCustomConnectorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowCustomConnectorRequest.class, ShowCustomConnectorResponse.class)
                .withName("ShowCustomConnector")
                .withUri("/v2/{project_id}/connectors/custom-connectors/{connector_id}/release")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connector_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomConnectorRequest::getConnectorId,
                ShowCustomConnectorRequest::setConnectorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse> showCustomConnectors =
        genForShowCustomConnectors();

    private static HttpRequestDef<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse> genForShowCustomConnectors() {
        // basic
        HttpRequestDef.Builder<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCustomConnectorsRequest.class, ShowCustomConnectorsResponse.class)
            .withName("ShowCustomConnectors")
            .withUri("/v2/{project_id}/connectors/custom-connectors")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomConnectorsRequest::getOffset, ShowCustomConnectorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomConnectorsRequest::getLimit, ShowCustomConnectorsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomConnectorsRequest::getName, ShowCustomConnectorsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleConnectionRequest, ShowSingleConnectionResponse> showSingleConnection =
        genForShowSingleConnection();

    private static HttpRequestDef<ShowSingleConnectionRequest, ShowSingleConnectionResponse> genForShowSingleConnection() {
        // basic
        HttpRequestDef.Builder<ShowSingleConnectionRequest, ShowSingleConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSingleConnectionRequest.class, ShowSingleConnectionResponse.class)
            .withName("ShowSingleConnection")
            .withUri("/v1/{project_id}/connections/{connect_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleConnectionRequest::getConnectId,
                ShowSingleConnectionRequest::setConnectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse> updateConnectionInfo =
        genForUpdateConnectionInfo();

    private static HttpRequestDef<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse> genForUpdateConnectionInfo() {
        // basic
        HttpRequestDef.Builder<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateConnectionInfoRequest.class, UpdateConnectionInfoResponse.class)
            .withName("UpdateConnectionInfo")
            .withUri("/v1/{project_id}/connections/{connect_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("connect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionInfoRequest::getConnectId,
                UpdateConnectionInfoRequest::setConnectId));
        builder.<ConnectionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConnectionInfo.class),
            f -> f.withMarshaller(UpdateConnectionInfoRequest::getBody, UpdateConnectionInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlowRequest, UpdateFlowResponse> updateFlow = genForUpdateFlow();

    private static HttpRequestDef<UpdateFlowRequest, UpdateFlowResponse> genForUpdateFlow() {
        // basic
        HttpRequestDef.Builder<UpdateFlowRequest, UpdateFlowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlowRequest.class, UpdateFlowResponse.class)
                .withName("UpdateFlow")
                .withUri("/v1/{project_id}/flows/{flow_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("flow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlowRequest::getFlowId, UpdateFlowRequest::setFlowId));
        builder.<FlowMeta>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FlowMeta.class),
            f -> f.withMarshaller(UpdateFlowRequest::getBody, UpdateFlowRequest::setBody));

        // response

        return builder.build();
    }

}

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
        genForcreateConnectionInfo();

    private static HttpRequestDef<CreateConnectionInfoRequest, CreateConnectionInfoResponse> genForcreateConnectionInfo() {
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
            f -> f.withMarshaller(CreateConnectionInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse> createCustomConnectorFromOpenapi =
        genForcreateCustomConnectorFromOpenapi();

    private static HttpRequestDef<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse> genForcreateCustomConnectorFromOpenapi() {
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
            f -> f.withMarshaller(CreateCustomConnectorFromOpenapiRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowRequest, CreateFlowResponse> createFlow = genForcreateFlow();

    private static HttpRequestDef<CreateFlowRequest, CreateFlowResponse> genForcreateFlow() {
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
            f -> f.withMarshaller(CreateFlowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse> createFlowTemplateFromFlow =
        genForcreateFlowTemplateFromFlow();

    private static HttpRequestDef<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse> genForcreateFlowTemplateFromFlow() {
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
            f -> f.withMarshaller(CreateFlowTemplateFromFlowRequest::getFlowId, (req, v) -> {
                req.setFlowId(v);
            }));
        builder.<TemplateMessage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TemplateMessage.class),
            f -> f.withMarshaller(CreateFlowTemplateFromFlowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse> deleteConnectionInfo =
        genFordeleteConnectionInfo();

    private static HttpRequestDef<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse> genFordeleteConnectionInfo() {
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
            f -> f.withMarshaller(DeleteConnectionInfoRequest::getConnectId, (req, v) -> {
                req.setConnectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse> deleteCustomConnector =
        genFordeleteCustomConnector();

    private static HttpRequestDef<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse> genFordeleteCustomConnector() {
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
            f -> f.withMarshaller(DeleteCustomConnectorRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowRequest, DeleteFlowResponse> deleteFlow = genFordeleteFlow();

    private static HttpRequestDef<DeleteFlowRequest, DeleteFlowResponse> genFordeleteFlow() {
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
            f -> f.withMarshaller(DeleteFlowRequest::getFlowId, (req, v) -> {
                req.setFlowId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchFlowByIdRequest, SearchFlowByIdResponse> searchFlowById =
        genForsearchFlowById();

    private static HttpRequestDef<SearchFlowByIdRequest, SearchFlowByIdResponse> genForsearchFlowById() {
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
            f -> f.withMarshaller(SearchFlowByIdRequest::getFlowId, (req, v) -> {
                req.setFlowId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchFlowByIdRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllConnectionsRequest, ShowAllConnectionsResponse> showAllConnections =
        genForshowAllConnections();

    private static HttpRequestDef<ShowAllConnectionsRequest, ShowAllConnectionsResponse> genForshowAllConnections() {
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
            f -> f.withMarshaller(ShowAllConnectionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllFlowsRequest, ShowAllFlowsResponse> showAllFlows = genForshowAllFlows();

    private static HttpRequestDef<ShowAllFlowsRequest, ShowAllFlowsResponse> genForshowAllFlows() {
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
            f -> f.withMarshaller(ShowAllFlowsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("have_child_flow",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getHaveChildFlow, (req, v) -> {
                req.setHaveChildFlow(v);
            }));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFlowsRequest::getIds, (req, v) -> {
                req.setIds(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectorsRequest, ShowConnectorsResponse> showConnectors =
        genForshowConnectors();

    private static HttpRequestDef<ShowConnectorsRequest, ShowConnectorsResponse> genForshowConnectors() {
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
            f -> f.withMarshaller(ShowConnectorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getScope, (req, v) -> {
                req.setScope(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("operation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectorsRequest::getOperationType, (req, v) -> {
                req.setOperationType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomConnectorRequest, ShowCustomConnectorResponse> showCustomConnector =
        genForshowCustomConnector();

    private static HttpRequestDef<ShowCustomConnectorRequest, ShowCustomConnectorResponse> genForshowCustomConnector() {
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
            f -> f.withMarshaller(ShowCustomConnectorRequest::getConnectorId, (req, v) -> {
                req.setConnectorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse> showCustomConnectors =
        genForshowCustomConnectors();

    private static HttpRequestDef<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse> genForshowCustomConnectors() {
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
            f -> f.withMarshaller(ShowCustomConnectorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCustomConnectorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomConnectorsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleConnectionRequest, ShowSingleConnectionResponse> showSingleConnection =
        genForshowSingleConnection();

    private static HttpRequestDef<ShowSingleConnectionRequest, ShowSingleConnectionResponse> genForshowSingleConnection() {
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
            f -> f.withMarshaller(ShowSingleConnectionRequest::getConnectId, (req, v) -> {
                req.setConnectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse> updateConnectionInfo =
        genForupdateConnectionInfo();

    private static HttpRequestDef<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse> genForupdateConnectionInfo() {
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
            f -> f.withMarshaller(UpdateConnectionInfoRequest::getConnectId, (req, v) -> {
                req.setConnectId(v);
            }));
        builder.<ConnectionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConnectionInfo.class),
            f -> f.withMarshaller(UpdateConnectionInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlowRequest, UpdateFlowResponse> updateFlow = genForupdateFlow();

    private static HttpRequestDef<UpdateFlowRequest, UpdateFlowResponse> genForupdateFlow() {
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
            f -> f.withMarshaller(UpdateFlowRequest::getFlowId, (req, v) -> {
                req.setFlowId(v);
            }));
        builder.<FlowMeta>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FlowMeta.class),
            f -> f.withMarshaller(UpdateFlowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

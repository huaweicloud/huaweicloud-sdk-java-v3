package com.huaweicloud.sdk.vpn.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionRequestBody;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.VpnGatewayCertificateRequestBody;

import java.util.List;

@SuppressWarnings("unchecked")
public class VpnMeta {

    public static final HttpRequestDef<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> createConnectionMonitor =
        genForcreateConnectionMonitor();

    private static HttpRequestDef<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> genForcreateConnectionMonitor() {
        // basic
        HttpRequestDef.Builder<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateConnectionMonitorRequest.class, CreateConnectionMonitorResponse.class)
            .withName("CreateConnectionMonitor")
            .withUri("/v5/{project_id}/connection-monitors")
            .withContentType("application/json");

        // requests
        builder.<CreateConnectionMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConnectionMonitorRequestBody.class),
            f -> f.withMarshaller(CreateConnectionMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateConnectionMonitorResponse::getHeaderResponseToken,
                CreateConnectionMonitorResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse> deleteConnectionMonitor =
        genFordeleteConnectionMonitor();

    private static HttpRequestDef<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse> genFordeleteConnectionMonitor() {
        // basic
        HttpRequestDef.Builder<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConnectionMonitorRequest.class, DeleteConnectionMonitorResponse.class)
            .withName("DeleteConnectionMonitor")
            .withUri("/v5/{project_id}/connection-monitors/{connection_monitor_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_monitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionMonitorRequest::getConnectionMonitorId, (req, v) -> {
                req.setConnectionMonitorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> listConnectionMonitors =
        genForlistConnectionMonitors();

    private static HttpRequestDef<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> genForlistConnectionMonitors() {
        // basic
        HttpRequestDef.Builder<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListConnectionMonitorsRequest.class, ListConnectionMonitorsResponse.class)
            .withName("ListConnectionMonitors")
            .withUri("/v5/{project_id}/connection-monitors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionMonitorsRequest::getVpnConnectionId, (req, v) -> {
                req.setVpnConnectionId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListConnectionMonitorsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> showConnectionMonitor =
        genForshowConnectionMonitor();

    private static HttpRequestDef<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> genForshowConnectionMonitor() {
        // basic
        HttpRequestDef.Builder<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConnectionMonitorRequest.class, ShowConnectionMonitorResponse.class)
            .withName("ShowConnectionMonitor")
            .withUri("/v5/{project_id}/connection-monitors/{connection_monitor_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_monitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionMonitorRequest::getConnectionMonitorId, (req, v) -> {
                req.setConnectionMonitorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCgwRequest, CreateCgwResponse> createCgw = genForcreateCgw();

    private static HttpRequestDef<CreateCgwRequest, CreateCgwResponse> genForcreateCgw() {
        // basic
        HttpRequestDef.Builder<CreateCgwRequest, CreateCgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCgwRequest.class, CreateCgwResponse.class)
                .withName("CreateCgw")
                .withUri("/v5/{project_id}/customer-gateways")
                .withContentType("application/json");

        // requests
        builder.<CreateCgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCgwRequestBody.class),
            f -> f.withMarshaller(CreateCgwRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCgwResponse::getHeaderResponseToken,
                CreateCgwResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteCgwRequest, DeleteCgwResponse> deleteCgw = genFordeleteCgw();

    private static HttpRequestDef<DeleteCgwRequest, DeleteCgwResponse> genFordeleteCgw() {
        // basic
        HttpRequestDef.Builder<DeleteCgwRequest, DeleteCgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCgwRequest.class, DeleteCgwResponse.class)
                .withName("DeleteCgw")
                .withUri("/v5/{project_id}/customer-gateways/{customer_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("customer_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCgwRequest::getCustomerGatewayId, (req, v) -> {
                req.setCustomerGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCgwsRequest, ListCgwsResponse> listCgws = genForlistCgws();

    private static HttpRequestDef<ListCgwsRequest, ListCgwsResponse> genForlistCgws() {
        // basic
        HttpRequestDef.Builder<ListCgwsRequest, ListCgwsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCgwsRequest.class, ListCgwsResponse.class)
                .withName("ListCgws")
                .withUri("/v5/{project_id}/customer-gateways")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cgw_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCgwsRequest::getCgwId, (req, v) -> {
                req.setCgwId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCgwsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCgwsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCgwRequest, ShowCgwResponse> showCgw = genForshowCgw();

    private static HttpRequestDef<ShowCgwRequest, ShowCgwResponse> genForshowCgw() {
        // basic
        HttpRequestDef.Builder<ShowCgwRequest, ShowCgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCgwRequest.class, ShowCgwResponse.class)
                .withName("ShowCgw")
                .withUri("/v5/{project_id}/customer-gateways/{customer_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("customer_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCgwRequest::getCustomerGatewayId, (req, v) -> {
                req.setCustomerGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCgwRequest, UpdateCgwResponse> updateCgw = genForupdateCgw();

    private static HttpRequestDef<UpdateCgwRequest, UpdateCgwResponse> genForupdateCgw() {
        // basic
        HttpRequestDef.Builder<UpdateCgwRequest, UpdateCgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCgwRequest.class, UpdateCgwResponse.class)
                .withName("UpdateCgw")
                .withUri("/v5/{project_id}/customer-gateways/{customer_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("customer_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCgwRequest::getCustomerGatewayId, (req, v) -> {
                req.setCustomerGatewayId(v);
            }));
        builder.<UpdateCgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCgwRequestBody.class),
            f -> f.withMarshaller(UpdateCgwRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpnConnectionRequest, CreateVpnConnectionResponse> createVpnConnection =
        genForcreateVpnConnection();

    private static HttpRequestDef<CreateVpnConnectionRequest, CreateVpnConnectionResponse> genForcreateVpnConnection() {
        // basic
        HttpRequestDef.Builder<CreateVpnConnectionRequest, CreateVpnConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpnConnectionRequest.class, CreateVpnConnectionResponse.class)
                .withName("CreateVpnConnection")
                .withUri("/v5/{project_id}/vpn-connection")
                .withContentType("application/json");

        // requests
        builder.<CreateVpnConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpnConnectionRequestBody.class),
            f -> f.withMarshaller(CreateVpnConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVpnConnectionResponse::getHeaderResponseToken,
                CreateVpnConnectionResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse> deleteVpnConnection =
        genFordeleteVpnConnection();

    private static HttpRequestDef<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse> genFordeleteVpnConnection() {
        // basic
        HttpRequestDef.Builder<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVpnConnectionRequest.class, DeleteVpnConnectionResponse.class)
            .withName("DeleteVpnConnection")
            .withUri("/v5/{project_id}/vpn-connection/{vpn_connection_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpnConnectionRequest::getVpnConnectionId, (req, v) -> {
                req.setVpnConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpnConnectionsRequest, ListVpnConnectionsResponse> listVpnConnections =
        genForlistVpnConnections();

    private static HttpRequestDef<ListVpnConnectionsRequest, ListVpnConnectionsResponse> genForlistVpnConnections() {
        // basic
        HttpRequestDef.Builder<ListVpnConnectionsRequest, ListVpnConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpnConnectionsRequest.class, ListVpnConnectionsResponse.class)
                .withName("ListVpnConnections")
                .withUri("/v5/{project_id}/vpn-connection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getVpnId, (req, v) -> {
                req.setVpnId(v);
            }));
        builder.<String>withRequestField("eip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getEipId, (req, v) -> {
                req.setEipId(v);
            }));
        builder.<String>withRequestField("vgw_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getVgwIp, (req, v) -> {
                req.setVgwIp(v);
            }));
        builder.<String>withRequestField("vgw_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpnConnectionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpnConnectionsResponse::getHeaderResponseToken,
                ListVpnConnectionsResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVpnConnectionRequest, ShowVpnConnectionResponse> showVpnConnection =
        genForshowVpnConnection();

    private static HttpRequestDef<ShowVpnConnectionRequest, ShowVpnConnectionResponse> genForshowVpnConnection() {
        // basic
        HttpRequestDef.Builder<ShowVpnConnectionRequest, ShowVpnConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpnConnectionRequest.class, ShowVpnConnectionResponse.class)
                .withName("ShowVpnConnection")
                .withUri("/v5/{project_id}/vpn-connection/{vpn_connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnConnectionRequest::getVpnConnectionId, (req, v) -> {
                req.setVpnConnectionId(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVpnConnectionResponse::getHeaderResponseToken,
                ShowVpnConnectionResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse> updateVpnConnection =
        genForupdateVpnConnection();

    private static HttpRequestDef<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse> genForupdateVpnConnection() {
        // basic
        HttpRequestDef.Builder<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpnConnectionRequest.class, UpdateVpnConnectionResponse.class)
                .withName("UpdateVpnConnection")
                .withUri("/v5/{project_id}/vpn-connection/{vpn_connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpn_connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpnConnectionRequest::getVpnConnectionId, (req, v) -> {
                req.setVpnConnectionId(v);
            }));
        builder.<UpdateVpnConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpnConnectionRequestBody.class),
            f -> f.withMarshaller(UpdateVpnConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVpnConnectionResponse::getHeaderResponseToken,
                UpdateVpnConnectionResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVgwRequest, CreateVgwResponse> createVgw = genForcreateVgw();

    private static HttpRequestDef<CreateVgwRequest, CreateVgwResponse> genForcreateVgw() {
        // basic
        HttpRequestDef.Builder<CreateVgwRequest, CreateVgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVgwRequest.class, CreateVgwResponse.class)
                .withName("CreateVgw")
                .withUri("/v5/{project_id}/vpn-gateways")
                .withContentType("application/json");

        // requests
        builder.<CreateVgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVgwRequestBody.class),
            f -> f.withMarshaller(CreateVgwRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVgwResponse::getHeaderResponseToken,
                CreateVgwResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVgwRequest, DeleteVgwResponse> deleteVgw = genFordeleteVgw();

    private static HttpRequestDef<DeleteVgwRequest, DeleteVgwResponse> genFordeleteVgw() {
        // basic
        HttpRequestDef.Builder<DeleteVgwRequest, DeleteVgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVgwRequest.class, DeleteVgwResponse.class)
                .withName("DeleteVgw")
                .withUri("/v5/{project_id}/vpn-gateways/{vgw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVgwRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForlistAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForlistAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v5/{project_id}/vpn-gateways/availability-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVgwsRequest, ListVgwsResponse> listVgws = genForlistVgws();

    private static HttpRequestDef<ListVgwsRequest, ListVgwsResponse> genForlistVgws() {
        // basic
        HttpRequestDef.Builder<ListVgwsRequest, ListVgwsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVgwsRequest.class, ListVgwsResponse.class)
                .withName("ListVgws")
                .withUri("/v5/{project_id}/vpn-gateways")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVgwsRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVgwsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVgwRequest, ShowVgwResponse> showVgw = genForshowVgw();

    private static HttpRequestDef<ShowVgwRequest, ShowVgwResponse> genForshowVgw() {
        // basic
        HttpRequestDef.Builder<ShowVgwRequest, ShowVgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVgwRequest.class, ShowVgwResponse.class)
                .withName("ShowVgw")
                .withUri("/v5/{project_id}/vpn-gateways/{vgw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVgwRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVgwRequest, UpdateVgwResponse> updateVgw = genForupdateVgw();

    private static HttpRequestDef<UpdateVgwRequest, UpdateVgwResponse> genForupdateVgw() {
        // basic
        HttpRequestDef.Builder<UpdateVgwRequest, UpdateVgwResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVgwRequest.class, UpdateVgwResponse.class)
                .withName("UpdateVgw")
                .withUri("/v5/{project_id}/vpn-gateways/{vgw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVgwRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));
        builder.<UpdateVgwRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVgwRequestBody.class),
            f -> f.withMarshaller(UpdateVgwRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVgwResponse::getHeaderResponseToken,
                UpdateVgwResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVgwCertificateRequest, CreateVgwCertificateResponse> createVgwCertificate =
        genForcreateVgwCertificate();

    private static HttpRequestDef<CreateVgwCertificateRequest, CreateVgwCertificateResponse> genForcreateVgwCertificate() {
        // basic
        HttpRequestDef.Builder<CreateVgwCertificateRequest, CreateVgwCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVgwCertificateRequest.class, CreateVgwCertificateResponse.class)
            .withName("CreateVgwCertificate")
            .withUri("/v5/{project_id}/vpn-gateways/{vgw_id}/certificate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVgwCertificateRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));
        builder.<VpnGatewayCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpnGatewayCertificateRequestBody.class),
            f -> f.withMarshaller(CreateVgwCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVgwCertificateResponse::getHeaderResponseToken,
                CreateVgwCertificateResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse> showVpnGatewayCertificate =
        genForshowVpnGatewayCertificate();

    private static HttpRequestDef<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse> genForshowVpnGatewayCertificate() {
        // basic
        HttpRequestDef.Builder<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVpnGatewayCertificateRequest.class,
                    ShowVpnGatewayCertificateResponse.class)
                .withName("ShowVpnGatewayCertificate")
                .withUri("/v5/{project_id}/vpn-gateways/{vgw_id}/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpnGatewayCertificateRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> updateVgwCertificate =
        genForupdateVgwCertificate();

    private static HttpRequestDef<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> genForupdateVgwCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVgwCertificateRequest.class, UpdateVgwCertificateResponse.class)
            .withName("UpdateVgwCertificate")
            .withUri("/v5/{project_id}/vpn-gateways/{vgw_id}/certificate/{certificate_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vgw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVgwCertificateRequest::getVgwId, (req, v) -> {
                req.setVgwId(v);
            }));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVgwCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<VpnGatewayCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpnGatewayCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateVgwCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("header-response-token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVgwCertificateResponse::getHeaderResponseToken,
                UpdateVgwCertificateResponse::setHeaderResponseToken));
        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfo =
        genForshowQuotasInfo();

    private static HttpRequestDef<ShowQuotasInfoRequest, ShowQuotasInfoResponse> genForshowQuotasInfo() {
        // basic
        HttpRequestDef.Builder<ShowQuotasInfoRequest, ShowQuotasInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasInfoRequest.class, ShowQuotasInfoResponse.class)
                .withName("ShowQuotasInfo")
                .withUri("/v5/{project_id}/vpn/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
